package com.yandex.mobile.ads.impl;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class rj {
    public static final byte[] a(String str) {
        Object objA;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    objA = com.google.gson.internal.c.u(gZIPInputStream);
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            objA = new byte[0];
        }
        return (byte[]) objA;
    }

    public static final String b(String str) {
        Object objA;
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            kotlin.jvm.internal.l.c(bArrDecode);
            Charset charset = C5819a.f48359b;
            objA = new String(a(new String(bArrDecode, charset)), charset);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            objA = "";
        }
        return (String) objA;
    }
}
