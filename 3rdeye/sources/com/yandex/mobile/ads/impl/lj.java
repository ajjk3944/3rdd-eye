package com.yandex.mobile.ads.impl;

import android.util.Base64;
import java.nio.charset.Charset;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class lj {
    public static String a(String value) {
        kotlin.jvm.internal.l.f(value, "value");
        byte[] bytes = value.getBytes(C5819a.f48359b);
        kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
        return a(bytes);
    }

    public static String b(String value) {
        kotlin.jvm.internal.l.f(value, "value");
        Charset charset = C5819a.f48359b;
        byte[] bytes = value.getBytes(charset);
        kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
        try {
            byte[] bArrDecode = Base64.decode(bytes, 0);
            kotlin.jvm.internal.l.e(bArrDecode, "decode(...)");
            return new String(bArrDecode, charset);
        } catch (Exception unused) {
            int i = fp0.f27419b;
            return null;
        }
    }

    public static String a(byte[] data) {
        kotlin.jvm.internal.l.f(data, "data");
        try {
            byte[] bArrDecode = Base64.decode(data, 0);
            kotlin.jvm.internal.l.e(bArrDecode, "decode(...)");
            return new String(bArrDecode, C5819a.f48359b);
        } catch (Exception unused) {
            String str = new String(data, C5819a.f48359b);
            int i = fp0.f27419b;
            return str;
        }
    }
}
