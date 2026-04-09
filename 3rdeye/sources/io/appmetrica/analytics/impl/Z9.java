package io.appmetrica.analytics.impl;

import y9.C5819a;

/* loaded from: classes3.dex */
public abstract class Z9 {
    public static final T9 a(int i, String str) {
        byte[] bytes;
        T9 t92 = new T9();
        t92.f40168a = i;
        if (str == null || (bytes = str.getBytes(C5819a.f48359b)) == null) {
            bytes = t92.f40169b;
        }
        t92.f40169b = bytes;
        return t92;
    }
}
