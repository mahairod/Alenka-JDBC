/*
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/
package com.technicacorp.alenka;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
import org.bridj.cpp.CPPRuntime;

import com.technicacorp.alenka.JDBC.CudaSet;

/**
 * Wrapper for library <b>Alenka</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("alenka") 
@Runtime(CPPRuntime.class) 
public class AlenkaLibrary {
	static {
		BridJ.register();
	}
	/**
	 * call:<br>
	 * Original signature : <code>void alenkaInit(char**)</code><br>
	 * <i>native declaration : line 41</i>
	 */
	public static native void alenkaInit(Pointer<Pointer<Byte > > av);
	/**
	 * Original signature : <code>int alenkaExecute(char*)</code><br>
	 * <i>native declaration : line 42</i>
	 */
	public static native int alenkaExecute(Pointer<Byte > s);
	/**
	 * Original signature : <code>void alenkaClose()</code><br>
	 * <i>native declaration : line 43</i>
	 */
	public static native void alenkaClose();
	/**
	 * or:<br>
	 * Original signature : <code>int execute_file(int, char**)</code><br>
	 * <i>native declaration : line 46</i>
	 */
	public static native int execute_file(int ac, Pointer<Pointer<Byte > > av);
	/**
	 * jdbc calls<br>
	 * Original signature : <code>int alenka_JDBC(char*)</code><br>
	 * <i>native declaration : line 49</i>
	 */
	public static native int alenka_JDBC(Pointer<Byte > s);
	/**
	 * Original signature : <code>CudaSet* initializeResultSet_JDBC(char*)</code><br>
	 * <i>native declaration : line 50</i>
	 */
	public static native Pointer<CudaSet > initializeResultSet_JDBC(Pointer<Byte > f);
	/**
	 * Original signature : <code>void resultSetClose_JDBC()</code><br>
	 * <i>native declaration : line 53</i>
	 */
	public static native void resultSetClose_JDBC();
}
