/**
 * Copyright (c) 2013 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.eclipse.scada.configuration.modbus.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.scada.configuration.modbus.ModbusExporterInterceptor;
import org.eclipse.scada.configuration.modbus.ModbusFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exporter Interceptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModbusExporterInterceptorTest extends TestCase
{

    /**
     * The fixture for this Exporter Interceptor test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModbusExporterInterceptor fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ModbusExporterInterceptorTest.class );
    }

    /**
     * Constructs a new Exporter Interceptor test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModbusExporterInterceptorTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Exporter Interceptor test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( ModbusExporterInterceptor fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Exporter Interceptor test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModbusExporterInterceptor getFixture ()
    {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( ModbusFactory.eINSTANCE.createModbusExporterInterceptor () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

} //ModbusExporterInterceptorTest
