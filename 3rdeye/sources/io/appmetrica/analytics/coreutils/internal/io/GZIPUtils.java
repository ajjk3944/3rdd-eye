package io.appmetrica.analytics.coreutils.internal.io;

import com.google.gson.internal.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class GZIPUtils {
    public static final GZIPUtils INSTANCE = new GZIPUtils();

    private GZIPUtils() {
    }

    public static final byte[] gzipBytes(byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    CloseableUtilsKt.closeSafely(gZIPOutputStream);
                    CloseableUtilsKt.closeSafely(byteArrayOutputStream2);
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    CloseableUtilsKt.closeSafely(gZIPOutputStream);
                    CloseableUtilsKt.closeSafely(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
        }
    }

    public static final byte[] unGzipBytes(byte[] bArr) throws Throwable {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream3);
            } catch (Throwable th2) {
                byteArrayInputStream = byteArrayInputStream3;
                th = th2;
                gZIPInputStream = null;
            }
            try {
                byte[] bArrU = c.u(gZIPInputStream);
                CloseableUtilsKt.closeSafely(gZIPInputStream);
                CloseableUtilsKt.closeSafely(byteArrayInputStream3);
                return bArrU;
            } catch (Throwable th3) {
                byteArrayInputStream = byteArrayInputStream3;
                th = th3;
                byteArrayInputStream2 = byteArrayInputStream;
                CloseableUtilsKt.closeSafely(gZIPInputStream);
                CloseableUtilsKt.closeSafely(byteArrayInputStream2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            gZIPInputStream = null;
        }
    }
}
