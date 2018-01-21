/*
 * Copyright (c) 1999, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.omg.CORBA;


/**
* The Helper for <tt>Policy</tt>.  For more information on
* Helper files, see <a href="doc-files/generatedfiles.html#helper">
* "Generated Files: Helper Files"</a>.<P>
* org/omg/CORBA/PolicyHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ../../../../../src/share/classes/org/omg/PortableServer/corba.idl
* Saturday, July 17, 1999 12:26:20 AM PDT
*/

abstract public class PolicyHelper
{
  private static String  _id = "IDL:omg.org/CORBA/Policy:1.0";

  public static void insert (Any a, Policy that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Policy extract (Any a)
  {
    return read (a.create_input_stream ());
  }

  private static TypeCode __typeCode = null;
  synchronized public static TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ORB.init ().create_interface_tc (PolicyHelper.id (), "Policy");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Policy read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PolicyStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Policy value)
  {
    ostream.write_Object ((Object) value);
  }

  public static Policy narrow (Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Policy)
      return (Policy)obj;
    else if (!obj._is_a (id ()))
      throw new BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      return new _PolicyStub (delegate);
    }
  }

}