/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.world.osgi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.osgi.Markers#getMarkerGroups <em>Marker Groups</em>}</li>
 * </ul>
 *
 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMarkers()
 * @model
 * @generated
 */
public interface Markers extends EObject
{
    /**
     * Returns the value of the '<em><b>Marker Groups</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.scada.configuration.world.osgi.MarkerGroup}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Marker Groups</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Marker Groups</em>' containment reference list.
     * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMarkers_MarkerGroups()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<MarkerGroup> getMarkerGroups ();

} // Markers
