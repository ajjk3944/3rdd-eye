package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ii4 {
    public final rj4 a;
    public final kz2 b = new kz2(32);
    public cj1 c;
    public cj1 d;
    public cj1 e;
    public long f;

    public ii4(rj4 rj4Var) {
        this.a = rj4Var;
        cj1 cj1Var = new cj1(0L);
        this.c = cj1Var;
        this.d = cj1Var;
        this.e = cj1Var;
    }

    public static cj1 c(cj1 cj1Var, vw3 vw3Var, lk1 lk1Var, kz2 kz2Var) {
        if (vw3Var.h(1073741824)) {
            long j = lk1Var.h;
            int iL = 1;
            kz2Var.y(1);
            cj1 cj1VarE = e(cj1Var, j, kz2Var.a, 1);
            long j2 = j + 1;
            byte b = kz2Var.a[0];
            int i = b & 128;
            int i2 = b & 127;
            yu3 yu3Var = vw3Var.d;
            byte[] bArr = yu3Var.a;
            if (bArr == null) {
                yu3Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            cj1Var = e(cj1VarE, j2, yu3Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                kz2Var.y(2);
                cj1Var = e(cj1Var, j3, kz2Var.a, 2);
                j3 += 2;
                iL = kz2Var.L();
            }
            int[] iArr = yu3Var.d;
            if (iArr == null || iArr.length < iL) {
                iArr = new int[iL];
            }
            int[] iArr2 = yu3Var.e;
            if (iArr2 == null || iArr2.length < iL) {
                iArr2 = new int[iL];
            }
            if (z) {
                int i3 = iL * 6;
                kz2Var.y(i3);
                cj1Var = e(cj1Var, j3, kz2Var.a, i3);
                j3 += i3;
                kz2Var.E(0);
                for (int i4 = 0; i4 < iL; i4++) {
                    iArr[i4] = kz2Var.L();
                    iArr2[i4] = kz2Var.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = lk1Var.g - ((int) (j3 - lk1Var.h));
            }
            ig1 ig1Var = (ig1) lk1Var.i;
            String str = v23.a;
            byte[] bArr2 = ig1Var.b;
            byte[] bArr3 = yu3Var.a;
            int i5 = ig1Var.a;
            int i6 = ig1Var.c;
            int i7 = ig1Var.d;
            yu3Var.f = iL;
            yu3Var.d = iArr;
            yu3Var.e = iArr2;
            yu3Var.b = bArr2;
            yu3Var.a = bArr3;
            yu3Var.c = i5;
            yu3Var.g = i6;
            yu3Var.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = yu3Var.i;
            cryptoInfo.numSubSamples = iL;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            lv2 lv2Var = yu3Var.j;
            lv2Var.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) lv2Var.h;
            pattern.set(i6, i7);
            ((MediaCodec.CryptoInfo) lv2Var.g).setPattern(pattern);
            long j4 = lk1Var.h;
            int i8 = (int) (j3 - j4);
            lk1Var.h = j4 + i8;
            lk1Var.g -= i8;
        }
        if (!vw3Var.h(268435456)) {
            vw3Var.j(lk1Var.g);
            return d(cj1Var, lk1Var.h, vw3Var.e, lk1Var.g);
        }
        kz2Var.y(4);
        cj1 cj1VarE2 = e(cj1Var, lk1Var.h, kz2Var.a, 4);
        int iH = kz2Var.h();
        lk1Var.h += 4;
        lk1Var.g -= 4;
        vw3Var.j(iH);
        cj1 cj1VarD = d(cj1VarE2, lk1Var.h, vw3Var.e, iH);
        lk1Var.h += iH;
        int i9 = lk1Var.g - iH;
        lk1Var.g = i9;
        ByteBuffer byteBuffer = vw3Var.h;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            vw3Var.h = ByteBuffer.allocate(i9);
        } else {
            vw3Var.h.clear();
        }
        return d(cj1VarD, lk1Var.h, vw3Var.h, lk1Var.g);
    }

    public static cj1 d(cj1 cj1Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= cj1Var.g) {
            cj1Var = (cj1) cj1Var.i;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (cj1Var.g - j));
            qj4 qj4Var = (qj4) cj1Var.h;
            byte[] bArr = qj4Var.a;
            long j2 = j - cj1Var.f;
            qj4Var.getClass();
            byteBuffer.put(bArr, (int) j2, iMin);
            i -= iMin;
            j += iMin;
            if (j == cj1Var.g) {
                cj1Var = (cj1) cj1Var.i;
            }
        }
        return cj1Var;
    }

    public static cj1 e(cj1 cj1Var, long j, byte[] bArr, int i) {
        while (j >= cj1Var.g) {
            cj1Var = (cj1) cj1Var.i;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (cj1Var.g - j));
            qj4 qj4Var = (qj4) cj1Var.h;
            byte[] bArr2 = qj4Var.a;
            long j2 = j - cj1Var.f;
            qj4Var.getClass();
            System.arraycopy(bArr2, (int) j2, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == cj1Var.g) {
                cj1Var = (cj1) cj1Var.i;
            }
        }
        return cj1Var;
    }

    public final void a(long j) {
        cj1 cj1Var;
        if (j != -1) {
            while (true) {
                cj1Var = this.c;
                if (j < cj1Var.g) {
                    break;
                }
                this.a.d((qj4) cj1Var.h);
                cj1 cj1Var2 = this.c;
                cj1Var2.h = null;
                cj1 cj1Var3 = (cj1) cj1Var2.i;
                cj1Var2.i = null;
                this.c = cj1Var3;
            }
            if (this.d.f < cj1Var.f) {
                this.d = cj1Var;
            }
        }
    }

    public final int b(int i) {
        cj1 cj1Var = this.e;
        if (((qj4) cj1Var.h) == null) {
            qj4 qj4VarMo18a = this.a.mo18a();
            cj1 cj1Var2 = new cj1(this.e.g);
            cj1Var.h = qj4VarMo18a;
            cj1Var.i = cj1Var2;
        }
        return Math.min(i, (int) (this.e.g - this.f));
    }
}
