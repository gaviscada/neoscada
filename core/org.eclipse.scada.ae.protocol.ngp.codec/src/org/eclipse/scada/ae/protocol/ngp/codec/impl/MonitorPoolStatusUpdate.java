/*******************************************************************************
 * Copyright (c) 2010, 2013 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *     Jens Reimann - implement security callback system
 *******************************************************************************/
package org.eclipse.scada.ae.protocol.ngp.codec.impl;

import org.apache.mina.core.buffer.IoBuffer;
import org.eclipse.scada.core.ngp.common.codec.osbp.BinaryContext;
import org.eclipse.scada.core.ngp.common.codec.osbp.BinaryMessageCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonitorPoolStatusUpdate implements BinaryMessageCodec
{
    private final static Logger logger = LoggerFactory.getLogger ( MonitorPoolStatusUpdate.class );

    public static final int MESSAGE_CODE = 8195;

    @Override
    public int getMessageCode ()
    {
        return MESSAGE_CODE;
    }

    @Override
    public Class<?> getMessageClass ()
    {
        return org.eclipse.scada.ae.data.message.MonitorPoolStatusUpdate.class;
    }

    @Override
    public org.eclipse.scada.ae.data.message.MonitorPoolStatusUpdate decodeMessage ( final BinaryContext _context, final IoBuffer _data ) throws Exception
    {
        // message code
        {
            final int messageCode = _data.getInt ();

            if ( messageCode != MESSAGE_CODE )
            {
                throw new IllegalStateException ( String.format ( "Expected messageCode %s but found %s", MESSAGE_CODE, messageCode ) );
            }
        }

        final byte numberOfFields = _data.get ();

        // decode attributes

        String monitorPoolId = null;
        org.eclipse.scada.core.data.SubscriptionState state = null;

        logger.trace ( "Decoding {} fields", numberOfFields );

        for ( int i = 0; i < numberOfFields; i++ )
        {

            final byte fieldNumber = _data.get ();
            switch ( fieldNumber )
            {
                case 1:
                {
                    monitorPoolId = _context.decodeString ( _data );
                }
                    break;
                case 2:
                {
                    state = _context.decodeEnum ( _data, org.eclipse.scada.core.data.SubscriptionState.class );
                }
                    break;
                default:
                    logger.warn ( "Received unknown field number: {}", fieldNumber );
                    break;
            }

        }

        // create object
        return new org.eclipse.scada.ae.data.message.MonitorPoolStatusUpdate ( monitorPoolId, state );
    }

    @Override
    public IoBuffer encodeMessage ( final BinaryContext context, final Object objectMessage ) throws Exception
    {
        final org.eclipse.scada.ae.data.message.MonitorPoolStatusUpdate value = (org.eclipse.scada.ae.data.message.MonitorPoolStatusUpdate)objectMessage;

        final IoBuffer data = IoBuffer.allocate ( 64 );
        data.setAutoExpand ( true );

        // encode message base
        data.putInt ( MESSAGE_CODE );

        // number of fields 
        data.put ( (byte)2 );

        // encode attributes
        context.encodeString ( data, (byte)1, value.getMonitorPoolId () );
        context.encodeEnum ( data, (byte)2, value.getState () );

        data.flip ();
        return data;
    }

}