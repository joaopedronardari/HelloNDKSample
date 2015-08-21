package com.jnardari.ndksample;

/**
 * Created by Joao Pedro Nardari on 21/08/2015.
 */
public class NativeCode {
    public static native String helloFromJNI();

    public static native int calculateNumbers(long numbers);

    static {
        System.loadLibrary("ndksamplelib");
    }
}
