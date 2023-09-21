package com.newline.sourcertmp;

public class NativeLib {

    // Used to load the 'sourcertmp' library on application startup.
    static {
        System.loadLibrary("sourcertmp");
    }

    /**
     * A native method that is implemented by the 'sourcertmp' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}