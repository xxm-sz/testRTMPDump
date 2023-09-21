#include <jni.h>
#include <string>
#include "librtmp/rtmp.h"

extern "C" JNIEXPORT jstring JNICALL
Java_com_newline_sourcertmp_NativeLib_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {

    char version[100];

    sprintf(version, "version： %d", RTMP_LibVersion());

    return env->NewStringUTF(version);
}