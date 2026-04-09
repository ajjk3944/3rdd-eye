package com.vungle.ads.internal.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import y9.C5819a;

/* compiled from: InputOutputUtils.kt */
/* loaded from: classes2.dex */
public final class i {
    public static final i INSTANCE = new i();

    private i() {
    }

    public final String convertForSending(String stringToConvert) throws IOException {
        kotlin.jvm.internal.l.f(stringToConvert, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(stringToConvert.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = stringToConvert.getBytes(C5819a.f48359b);
                kotlin.jvm.internal.l.e(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                kotlin.jvm.internal.l.e(strEncodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return strEncodeToString;
            } finally {
            }
        } finally {
        }
    }
}
