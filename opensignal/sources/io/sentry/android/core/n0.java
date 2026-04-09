package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f11703a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f11704b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    public static final io.sentry.util.a f11705c = new io.sentry.util.a();

    public static String a(Context context) {
        io.sentry.q qVarA = f11705c.a();
        try {
            if (f11703a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean zExists = file.exists();
                    Charset charset = f11704b;
                    if (!zExists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String strR = io.sentry.config.a.R();
                            fileOutputStream.write(strR.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            f11703a = strR;
                            qVarA.close();
                            return strR;
                        } finally {
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, charset);
                        randomAccessFile.close();
                        f11703a = str;
                    } finally {
                    }
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            String str2 = f11703a;
            qVarA.close();
            return str2;
        } catch (Throwable th3) {
            try {
                qVarA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
