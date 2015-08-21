#include <jni.h>

jlong Java_com_jnardari_ndksample_NativeCode_calculateNumbers(JNIEnv* env, jobject thiz, jlong number) {
    jlong test = number;
    long i;
    for (i = 0; i < number; i++) {
        test += i;
    }
    return test;
}