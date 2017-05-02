/*******************************************************************************
 * Copyright (c) 2009, 2013 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.da.client.dataitem.details;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin
{

    public static final String IMG_BLOCK_UNLOCKED = "block.unlocked"; //$NON-NLS-1$

    public static final String IMG_BLOCK_LOCKED = "block.locked"; //$NON-NLS-1$

    public static final String IMG_BLOCK_DEFAULT = "block.default"; //$NON-NLS-1$

    // The plug-in ID
    public static final String PLUGIN_ID = "org.eclipse.scada.da.client.dataitem.details"; //$NON-NLS-1$

    public static final String EXTP_DETAILS_PART = "org.eclipse.scada.da.client.dataitem.details.DetailsViewPart"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

    /**
     * The constructor
     */
    public Activator ()
    {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start ( final BundleContext context ) throws Exception
    {
        super.start ( context );
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop ( final BundleContext context ) throws Exception
    {
        plugin = null;
        super.stop ( context );
    }

    @Override
    protected void initializeImageRegistry ( final ImageRegistry reg )
    {
        super.initializeImageRegistry ( reg );
        reg.put ( IMG_BLOCK_DEFAULT, ImageDescriptor.getMissingImageDescriptor () );
        reg.put ( IMG_BLOCK_LOCKED, ImageDescriptor.createFromFile ( Activator.class, "icons/locked.gif" ) ); //$NON-NLS-1$
        reg.put ( IMG_BLOCK_UNLOCKED, ImageDescriptor.createFromFile ( Activator.class, "icons/unlocked.gif" ) ); //$NON-NLS-1$
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static Activator getDefault ()
    {
        return plugin;
    }

}