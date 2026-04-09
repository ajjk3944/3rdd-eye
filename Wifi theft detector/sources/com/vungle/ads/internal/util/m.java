package com.vungle.ads.internal.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m {

    @NotNull
    public static final m INSTANCE = new m();

    private m() {
    }

    @NotNull
    public final String convertForSending(@NotNull String stringToConvert) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.p.e(stringToConvert, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(stringToConvert.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = stringToConvert.getBytes(s9.c.f24341b);
                kotlin.jvm.internal.p.d(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                kotlin.jvm.internal.p.d(strEncodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                i9.b.a(gZIPOutputStream, null);
                i9.b.a(byteArrayOutputStream, null);
                return strEncodeToString;
            } finally {
            }
        } finally {
        }
    }
}
