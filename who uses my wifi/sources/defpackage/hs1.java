package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class hs1 {
    public static boolean a = false;
    public static MessageDigest b;
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final CountDownLatch e = new CountDownLatch(1);

    public static void a() {
        synchronized (d) {
            try {
                if (!a) {
                    a = true;
                    new Thread(new vr(1)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static bs1 b(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length <= 0) {
            vector = null;
        } else {
            int i = length + 254;
            vector = new Vector();
            for (int i2 = 0; i2 < i / 255; i2++) {
                int i3 = i2 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i3 > 255) {
                        length2 = i3 + 255;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i3, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        bs1 bs1VarA = cs1.A();
        int size = vector.size();
        for (int i4 = 0; i4 < size; i4++) {
            y44 y44VarN = a54.n(d((byte[]) vector.get(i4), str, false), 0, 256);
            bs1VarA.b();
            ((cs1) bs1VarA.g).B(y44VarN);
        }
        byte[] bArrC = c(bArr);
        y44 y44Var = a54.g;
        y44 y44VarN2 = a54.n(bArrC, 0, bArrC.length);
        bs1VarA.b();
        ((cs1) bs1VarA.g).C(y44VarN2);
        return bs1VarA;
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (c) {
            try {
                a();
                MessageDigest messageDigest2 = null;
                try {
                    if (e.await(2L, TimeUnit.SECONDS) && (messageDigest = b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = b.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static byte[] d(byte[] bArr, String str, boolean z) {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            fr1 fr1VarC0 = qr1.C0();
            fr1VarC0.h(4096L);
            bArr = ((qr1) fr1VarC0.d()).b();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b2 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i2).put(b2).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i2).put(b2).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        ks1[] ks1VarArr = (ks1[]) new os1(0).G2;
        int length3 = ks1VarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            ks1VarArr[i3].b(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            ds1 ds1Var = new ds1(0, str.getBytes("UTF-8"));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < 256; i6++) {
                i4 = (i4 + 1) & 255;
                byte[] bArr4 = ds1Var.a;
                byte b3 = bArr4[i4];
                i5 = (i5 + b3) & 255;
                bArr4[i4] = bArr4[i5];
                bArr4[i5] = b3;
                bArr3[i6] = (byte) (bArr4[(bArr4[i4] + b3) & 255] ^ bArr3[i6]);
            }
        }
        return bArr3;
    }
}
