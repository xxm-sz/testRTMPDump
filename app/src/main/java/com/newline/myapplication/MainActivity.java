package com.newline.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.newline.sourcertmp.NativeLib;

/**
 * Time:2023/9/21
 * Author:zhangwenshuan
 * Description:
 * since version
 */
public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NativeLib nativeLib=new NativeLib();
        Log.d(TAG,"源码方式集成，获取RTMPDump版本号："+nativeLib.stringFromJNI());
    }
}
