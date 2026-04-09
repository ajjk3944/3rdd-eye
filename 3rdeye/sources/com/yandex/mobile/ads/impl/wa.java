package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import com.yandex.mobile.ads.impl.kc2;

/* loaded from: classes3.dex */
public final class wa {
    private static kc2.a a(Throwable th) {
        return th instanceof MediaCodec.CryptoException ? kc2.a.f29619o : kc2.a.f29603D;
    }

    private static kc2.a b(Throwable th) {
        boolean z10;
        Throwable cause = th.getCause();
        if (cause != null && (((z10 = cause instanceof MediaCodec.CodecException)) || (cause instanceof IllegalStateException) || (cause instanceof IllegalArgumentException))) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            kotlin.jvm.internal.l.c(stackTrace);
            if (!(stackTrace.length == 0) && stackTrace[0].isNativeMethod() && kotlin.jvm.internal.l.b(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
                String methodName = stackTrace[0].getMethodName();
                if (methodName == null) {
                    methodName = "";
                }
                if (methodName.equals("native_dequeueOutputBuffer")) {
                    return kc2.a.f29607b;
                }
                if (methodName.equals("native_dequeueInputBuffer")) {
                    return kc2.a.f29608c;
                }
                if (methodName.equals("native_stop")) {
                    return kc2.a.f29609d;
                }
                if (methodName.equals("native_setSurface")) {
                    return kc2.a.f29610e;
                }
                if (methodName.equals("releaseOutputBuffer")) {
                    return kc2.a.f29611f;
                }
                if (methodName.equals("native_queueSecureInputBuffer")) {
                    return kc2.a.f29612g;
                }
                if (z10) {
                    return kc2.a.f29613h;
                }
            }
        }
        return null;
    }

    public static kc2 c(Throwable throwable) {
        kotlin.jvm.internal.l.f(throwable, "throwable");
        return new kc2(a(throwable), throwable);
    }
}
