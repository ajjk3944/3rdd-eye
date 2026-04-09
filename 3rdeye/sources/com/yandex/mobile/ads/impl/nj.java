package com.yandex.mobile.ads.impl;

import android.util.Base64;
import b9.m;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class nj {
    public static String a(String value) {
        kotlin.jvm.internal.l.f(value, "value");
        byte[] bytes = value.getBytes(C5819a.f48359b);
        kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
        return a(bytes);
    }

    public static String a(byte[] data) {
        Object objA;
        kotlin.jvm.internal.l.f(data, "data");
        try {
            objA = Base64.encodeToString(data, 2);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            fp0.c(new Object[0]);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        return (String) objA;
    }
}
