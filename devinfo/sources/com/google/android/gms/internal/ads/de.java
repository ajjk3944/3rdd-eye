package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class de {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f10437a = false;

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f10438b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10439c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f10440d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f10441e = new CountDownLatch(1);

    public static void a() {
        synchronized (f10440d) {
            try {
                if (!f10437a) {
                    f10437a = true;
                    new Thread(new ce(0)).start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static vd b(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length <= 0) {
            vector = null;
        } else {
            int i4 = length + 254;
            vector = new Vector();
            for (int i10 = 0; i10 < i4 / 255; i10++) {
                int i11 = i10 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i11 > 255) {
                        length2 = i11 + 255;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i11, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        vd vdVarA = wd.A();
        int size = vector.size();
        for (int i12 = 0; i12 < size; i12++) {
            zm1 zm1VarV = bn1.v(0, 256, d((byte[]) vector.get(i12), str, false));
            vdVarA.b();
            ((wd) vdVarA.f14755b).B(zm1VarV);
        }
        byte[] bArrC = c(bArr);
        zm1 zm1Var = bn1.f9729b;
        zm1 zm1VarV2 = bn1.v(0, bArrC.length, bArrC);
        vdVarA.b();
        ((wd) vdVarA.f14755b).C(zm1VarV2);
        return vdVarA;
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f10439c) {
            try {
                a();
                MessageDigest messageDigest2 = null;
                try {
                    if (f10441e.await(2L, TimeUnit.SECONDS) && (messageDigest = f10438b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f10438b.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static byte[] d(byte[] bArr, String str, boolean z3) {
        byte[] bArrArray;
        int length = bArr.length;
        int i4 = true != z3 ? 255 : 239;
        if (length > i4) {
            zc zcVarC0 = md.C0();
            zcVarC0.i(4096L);
            bArr = ((md) zcVarC0.e()).b();
        }
        int i10 = i4 + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i4) {
            byte[] bArr2 = new byte[i4 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i10).put(b10).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i10).put(b10).put(bArr).array();
        }
        if (z3) {
            bArrArray = ByteBuffer.allocate(256).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        ee[] eeVarArr = (ee[]) new ie(0).K2;
        int length3 = eeVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            eeVarArr[i11].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            xd xdVar = new xd(str.getBytes("UTF-8"), 0);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < 256; i14++) {
                i12 = (i12 + 1) & 255;
                byte[] bArr4 = xdVar.f18374a;
                byte b11 = bArr4[i12];
                i13 = (i13 + b11) & 255;
                bArr4[i12] = bArr4[i13];
                bArr4[i13] = b11;
                bArr3[i14] = (byte) (bArr4[(bArr4[i12] + b11) & 255] ^ bArr3[i14]);
            }
        }
        return bArr3;
    }
}
