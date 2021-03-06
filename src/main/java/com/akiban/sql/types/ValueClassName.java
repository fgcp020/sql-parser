/**
 * Copyright © 2012 Akiban Technologies, Inc.  All rights
 * reserved.
 *
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This program may also be available under different license terms.
 * For more information, see www.akiban.com or contact
 * licensing@akiban.com.
 *
 * Contributors:
 * Akiban Technologies, Inc.
 */

/* The original from which this derives bore the following: */

/*

   Derby - Class org.apache.derby.iapi.reference.ClassName

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to you under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */

package com.akiban.sql.types;

/**
    List of strings representing class names, which are typically found
    for classes with implement the Formatable interface.
    These strings are removed from the code to separate them from the
    strings which need to be internationalized. It also reduces footprint.
    <P>
    This class has no methods, all it contains are String's which by default
    are public, static and final since they are declared in an interface.
*/

// TODO: These aren't actually used, but are kept to make it easier to bring them back.

public interface ValueClassName
{
    String BitDataValue = "BitDataValue";
    String BooleanDataValue = "BooleanDataValue";
    String ConcatableDataValue  = "ConcatableDataValue";
    String DataValueDescriptor = "DataValueDescriptor";
    String DateTimeDataValue = "DateTimeDataValue";
    String NumberDataValue = "NumberDataValue";
    String RefDataValue = "RefDataValue";
    String StringDataValue = "StringDataValue";
    String UserDataValue = "UserDataValue";
    String XMLDataValue  = "XMLDataValue";
}
