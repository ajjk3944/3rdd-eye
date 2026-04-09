package com.yandex.mobile.ads.impl;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class q32 {
    public static Object a(Callable tryBlock, Object obj, String whileWhat, String whatIsNull) {
        kotlin.jvm.internal.l.f(tryBlock, "tryBlock");
        kotlin.jvm.internal.l.f(whileWhat, "whileWhat");
        kotlin.jvm.internal.l.f(whatIsNull, "whatIsNull");
        if (obj == null) {
            fp0.f(new Object[0]);
            return null;
        }
        try {
            return tryBlock.call();
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }
}
