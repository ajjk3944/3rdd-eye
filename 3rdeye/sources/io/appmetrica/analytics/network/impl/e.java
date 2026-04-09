package io.appmetrica.analytics.network.impl;

import b9.C1992A;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public abstract class e {
    public static byte[] a(int i, InterfaceC5480a interfaceC5480a) {
        try {
            InputStream inputStream = (InputStream) interfaceC5480a.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i10 = 0;
                            while (true) {
                                int i11 = inputStream.read(bArr);
                                if (-1 == i11 || i10 > i) {
                                    break;
                                }
                                if (i11 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i11);
                                    i10 += i11;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStream.close();
                            return byteArray;
                        } catch (Throwable unused) {
                            C1992A c1992a = C1992A.f18074a;
                            byteArrayOutputStream.close();
                            inputStream.close();
                        }
                    } finally {
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    public static final Map a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
