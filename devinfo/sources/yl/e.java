package yl;

import com.applovin.shadow.okio.internal.Buffer;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public final hm.q f37686c;

    /* renamed from: f, reason: collision with root package name */
    public int f37689f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public int f37684a = Buffer.SEGMENTING_THRESHOLD;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f37685b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public d[] f37687d = new d[8];

    /* renamed from: e, reason: collision with root package name */
    public int f37688e = 7;

    public e(t tVar) {
        this.f37686c = u6.t.d(tVar);
    }

    public final int a(int i4) {
        int i10;
        int i11 = 0;
        if (i4 > 0) {
            int length = this.f37687d.length;
            while (true) {
                length--;
                i10 = this.f37688e;
                if (length < i10 || i4 <= 0) {
                    break;
                }
                d dVar = this.f37687d[length];
                nk.k.b(dVar);
                int i12 = dVar.f37682c;
                i4 -= i12;
                this.g -= i12;
                this.f37689f--;
                i11++;
            }
            d[] dVarArr = this.f37687d;
            System.arraycopy(dVarArr, i10 + 1, dVarArr, i10 + 1 + i11, this.f37689f);
            this.f37688e += i11;
        }
        return i11;
    }

    public final hm.h b(int i4) throws IOException {
        if (i4 >= 0) {
            d[] dVarArr = g.f37697a;
            if (i4 <= dVarArr.length - 1) {
                return dVarArr[i4].f37680a;
            }
        }
        int length = this.f37688e + 1 + (i4 - g.f37697a.length);
        if (length >= 0) {
            d[] dVarArr2 = this.f37687d;
            if (length < dVarArr2.length) {
                d dVar = dVarArr2[length];
                nk.k.b(dVar);
                return dVar.f37680a;
            }
        }
        throw new IOException("Header index too large " + (i4 + 1));
    }

    public final void c(d dVar) {
        this.f37685b.add(dVar);
        int i4 = dVar.f37682c;
        int i10 = this.f37684a;
        if (i4 > i10) {
            d[] dVarArr = this.f37687d;
            zj.m.U(0, dVarArr.length, null, dVarArr);
            this.f37688e = this.f37687d.length - 1;
            this.f37689f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i4) - i10);
        int i11 = this.f37689f + 1;
        d[] dVarArr2 = this.f37687d;
        if (i11 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f37688e = this.f37687d.length - 1;
            this.f37687d = dVarArr3;
        }
        int i12 = this.f37688e;
        this.f37688e = i12 - 1;
        this.f37687d[i12] = dVar;
        this.f37689f++;
        this.g += i4;
    }

    public final hm.h d() {
        hm.q qVar = this.f37686c;
        byte b10 = qVar.readByte();
        byte[] bArr = sl.f.f33832a;
        int i4 = b10 & 255;
        int i10 = 0;
        boolean z3 = (b10 & 128) == 128;
        long jE = e(i4, 127);
        if (!z3) {
            return qVar.readByteString(jE);
        }
        hm.e eVar = new hm.e();
        int[] iArr = a0.f37660a;
        nk.k.e(qVar, "source");
        n3.f fVar = a0.f37662c;
        n3.f fVar2 = fVar;
        int i11 = 0;
        for (long j = 0; j < jE; j++) {
            byte b11 = qVar.readByte();
            byte[] bArr2 = sl.f.f33832a;
            i10 = (i10 << 8) | (b11 & 255);
            i11 += 8;
            while (i11 >= 8) {
                n3.f[] fVarArr = (n3.f[]) fVar2.f29628c;
                nk.k.b(fVarArr);
                fVar2 = fVarArr[(i10 >>> (i11 - 8)) & 255];
                nk.k.b(fVar2);
                if (((n3.f[]) fVar2.f29628c) == null) {
                    eVar.E(fVar2.f29626a);
                    i11 -= fVar2.f29627b;
                    fVar2 = fVar;
                } else {
                    i11 -= 8;
                }
            }
        }
        while (i11 > 0) {
            n3.f[] fVarArr2 = (n3.f[]) fVar2.f29628c;
            nk.k.b(fVarArr2);
            n3.f fVar3 = fVarArr2[(i10 << (8 - i11)) & 255];
            nk.k.b(fVar3);
            int i12 = fVar3.f29627b;
            if (((n3.f[]) fVar3.f29628c) != null || i12 > i11) {
                break;
            }
            eVar.E(fVar3.f29626a);
            i11 -= i12;
            fVar2 = fVar;
        }
        return eVar.readByteString(eVar.f25174b);
    }

    public final int e(int i4, int i10) {
        int i11 = i4 & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte b10 = this.f37686c.readByte();
            byte[] bArr = sl.f.f33832a;
            int i13 = b10 & 255;
            if ((b10 & 128) == 0) {
                return i10 + (i13 << i12);
            }
            i10 += (b10 & 127) << i12;
            i12 += 7;
        }
    }
}
