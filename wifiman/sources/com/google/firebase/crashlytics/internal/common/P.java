package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
abstract class P {
    private static void a(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        gZIPOutputStream2.finish();
                        AbstractC5107i.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    AbstractC5107i.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static void b(File file, List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O o10 = (O) it.next();
            InputStream inputStreamB = null;
            try {
                inputStreamB = o10.b();
                if (inputStreamB != null) {
                    a(inputStreamB, new File(file, o10.a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                AbstractC5107i.g(null);
                throw th2;
            }
            AbstractC5107i.g(inputStreamB);
        }
    }
}
