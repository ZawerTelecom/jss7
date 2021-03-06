/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2012, Telestax Inc and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.protocols.ss7.inap.api.service.circuitSwitchedCall.primitive;

import java.io.Serializable;
import java.util.ArrayList;

/**
*
RouteList {PARAMETERS-BOUND : bound} ::= SEQUENCE SIZE(1..3) OF OCTET STRING (
SIZE (bound.&minRouteListLength..bound.&maxRouteListLength))
-- Indicates a list of trunk groups or a route index. See Q.1224 for additional information on this item.

*
* @author sergey vetyutnev
*
*/
public interface RouteList extends Serializable {

    ArrayList<byte[]> getDataList();

}
