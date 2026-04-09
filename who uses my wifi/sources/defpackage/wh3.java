package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wh3 {
    public MessageDigest a;
    public final gk3 b;
    public final Object c = new Object();
    public boolean d = false;
    public SecureRandom e;

    public wh3(gk3 gk3Var) {
        this.b = gk3Var;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:fk3) VIRTUAL call: fk3.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:25:0x0039 */
    public final void a() {
        boolean z;
        fk3 fk3VarC;
        synchronized (this) {
            z = this.d;
        }
        if (z) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                fk3 fk3VarA = this.b.a(202);
                try {
                    fk3VarA.a();
                    this.e = secureRandom;
                    this.a = MessageDigest.getInstance("MD5");
                    this.d = true;
                } catch (NoSuchAlgorithmException e) {
                    fk3VarA.b(e);
                } catch (Throwable th) {
                    fk3VarA.b(th);
                    throw th;
                }
                fk3VarA.c();
            } catch (Throwable th2) {
                fk3VarC.c();
                throw th2;
            }
        }
    }

    public final byte[] b(byte[] bArr, String str, boolean z) {
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        zt0.D(length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i2 = i - length;
            byte[] bArr2 = new byte[i2];
            this.e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i2);
            System.arraycopy(bArr2, 0, bArr, length, i2);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        xh3[] xh3VarArr = (xh3[]) new os1(1).G2;
        int length2 = xh3VarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            xh3VarArr[i3].b(bArrArray, bArr3);
        }
        if (!yc0.s(str)) {
            of3 of3Var = new of3(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < 256; i6++) {
                byte[] bArr4 = (byte[]) of3Var.g;
                i4 = (i4 + 1) & 255;
                byte b = bArr4[i4];
                i5 = (i5 + b) & 255;
                bArr4[i4] = bArr4[i5];
                bArr4[i5] = b;
                bArr3[i6] = (byte) (bArr4[(bArr4[i4] + b) & 255] ^ bArr3[i6]);
            }
        }
        return bArr3;
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.c) {
            this.a.reset();
            this.a.update(bArr);
            bArrDigest = this.a.digest();
        }
        return bArrDigest;
    }

    public final bs1 d(String str, byte[] bArr) {
        bs1 bs1VarA = cs1.A();
        byte[] bArrC = c(bArr);
        y44 y44Var = a54.g;
        y44 y44VarN = a54.n(bArrC, 0, bArrC.length);
        bs1VarA.b();
        ((cs1) bs1VarA.g).C(y44VarN);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i2 = i * 255;
            int i3 = i2 + 255;
            if (length > i3) {
                length = i3;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, length));
            i++;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            y44 y44VarN2 = a54.n(b((byte[]) obj, str, false), 0, 256);
            bs1VarA.b();
            ((cs1) bs1VarA.g).B(y44VarN2);
        }
        return bs1VarA;
    }
}
