package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1998v6 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f17223a = false;

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f17224b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f17225c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f17226d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f17227e = new CountDownLatch(1);

    public static void a() {
        synchronized (f17226d) {
            try {
                if (!f17223a) {
                    f17223a = true;
                    new Thread(new RunnableC1944u6(0)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1621o6 b(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length <= 0) {
            vector = null;
        } else {
            int i = length + 254;
            vector = new Vector();
            for (int i3 = 0; i3 < i / 255; i3++) {
                int i6 = i3 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i6 > 255) {
                        length2 = i6 + 255;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i6, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        C1621o6 c1621o6A = C1675p6.A();
        int size = vector.size();
        for (int i7 = 0; i7 < size; i7++) {
            OK okR = QK.r(0, 256, d((byte[]) vector.get(i7), str, false));
            c1621o6A.b();
            ((C1675p6) c1621o6A.f13551b).B(okR);
        }
        byte[] bArrC = c(bArr);
        OK ok = QK.f10609b;
        OK okR2 = QK.r(0, bArrC.length, bArrC);
        c1621o6A.b();
        ((C1675p6) c1621o6A.f13551b).C(okR2);
        return c1621o6A;
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f17225c) {
            try {
                a();
                MessageDigest messageDigest2 = null;
                try {
                    if (f17227e.await(2L, TimeUnit.SECONDS) && (messageDigest = f17224b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f17224b.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static byte[] d(byte[] bArr, String str, boolean z6) {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z6 ? 255 : 239;
        if (length > i) {
            S5 s5C0 = C1136f6.C0();
            s5C0.h(4096L);
            bArr = ((C1136f6) s5C0.d()).b();
        }
        int i3 = i + 1;
        int length2 = bArr.length;
        byte b5 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i3).put(b5).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i3).put(b5).put(bArr).array();
        }
        if (z6) {
            bArrArray = ByteBuffer.allocate(256).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        InterfaceC2052w6[] interfaceC2052w6Arr = (InterfaceC2052w6[]) new B6(0).f7158K2;
        int length3 = interfaceC2052w6Arr.length;
        for (int i6 = 0; i6 < 12; i6++) {
            interfaceC2052w6Arr[i6].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            C1729q6 c1729q6 = new C1729q6(str.getBytes("UTF-8"), 0);
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < 256; i9++) {
                i7 = (i7 + 1) & 255;
                byte[] bArr4 = c1729q6.f16321a;
                byte b6 = bArr4[i7];
                i8 = (i8 + b6) & 255;
                bArr4[i7] = bArr4[i8];
                bArr4[i8] = b6;
                bArr3[i9] = (byte) (bArr4[(bArr4[i7] + b6) & 255] ^ bArr3[i9]);
            }
        }
        return bArr3;
    }
}
