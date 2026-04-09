package vu;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public final cv.z f23989c;

    /* renamed from: f, reason: collision with root package name */
    public int f23992f;

    /* renamed from: g, reason: collision with root package name */
    public int f23993g;

    /* renamed from: a, reason: collision with root package name */
    public int f23987a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23988b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public d[] f23990d = new d[8];

    /* renamed from: e, reason: collision with root package name */
    public int f23991e = 7;

    public e(t tVar) {
        this.f23989c = a.a.e(tVar);
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f23990d.length;
            while (true) {
                length--;
                i11 = this.f23991e;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                d dVar = this.f23990d[length];
                br.l.b(dVar);
                int i13 = dVar.f23985c;
                i10 -= i13;
                this.f23993g -= i13;
                this.f23992f--;
                i12++;
            }
            d[] dVarArr = this.f23990d;
            System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f23992f);
            this.f23991e += i12;
        }
        return i12;
    }

    public final cv.j b(int i10) throws IOException {
        if (i10 >= 0) {
            d[] dVarArr = g.f24002a;
            if (i10 <= dVarArr.length - 1) {
                return dVarArr[i10].f23983a;
            }
        }
        int length = this.f23991e + 1 + (i10 - g.f24002a.length);
        if (length >= 0) {
            d[] dVarArr2 = this.f23990d;
            if (length < dVarArr2.length) {
                d dVar = dVarArr2[length];
                br.l.b(dVar);
                return dVar.f23983a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    public final void c(d dVar) {
        this.f23988b.add(dVar);
        int i10 = dVar.f23985c;
        int i11 = this.f23987a;
        if (i10 > i11) {
            d[] dVarArr = this.f23990d;
            mq.l.i0(dVarArr, 0, dVarArr.length);
            this.f23991e = this.f23990d.length - 1;
            this.f23992f = 0;
            this.f23993g = 0;
            return;
        }
        a((this.f23993g + i10) - i11);
        int i12 = this.f23992f + 1;
        d[] dVarArr2 = this.f23990d;
        if (i12 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f23991e = this.f23990d.length - 1;
            this.f23990d = dVarArr3;
        }
        int i13 = this.f23991e;
        this.f23991e = i13 - 1;
        this.f23990d[i13] = dVar;
        this.f23992f++;
        this.f23993g += i10;
    }

    public final cv.j d() {
        cv.z zVar = this.f23989c;
        byte b2 = zVar.readByte();
        byte[] bArr = pu.b.f20645a;
        int i10 = b2 & 255;
        int i11 = 0;
        boolean z10 = (b2 & 128) == 128;
        long jE = e(i10, 127);
        if (!z10) {
            return zVar.k(jE);
        }
        cv.g gVar = new cv.g();
        int[] iArr = a0.f23971a;
        br.l.e(zVar, "source");
        com.squareup.picasso.s sVar = a0.f23973c;
        com.squareup.picasso.s sVar2 = sVar;
        int i12 = 0;
        for (long j = 0; j < jE; j++) {
            byte b10 = zVar.readByte();
            byte[] bArr2 = pu.b.f20645a;
            i11 = (i11 << 8) | (b10 & 255);
            i12 += 8;
            while (i12 >= 8) {
                com.squareup.picasso.s[] sVarArr = (com.squareup.picasso.s[]) sVar2.f5980r;
                br.l.b(sVarArr);
                sVar2 = sVarArr[(i11 >>> (i12 - 8)) & 255];
                br.l.b(sVar2);
                if (((com.squareup.picasso.s[]) sVar2.f5980r) == null) {
                    gVar.p0(sVar2.f5978d);
                    i12 -= sVar2.f5979g;
                    sVar2 = sVar;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            com.squareup.picasso.s[] sVarArr2 = (com.squareup.picasso.s[]) sVar2.f5980r;
            br.l.b(sVarArr2);
            com.squareup.picasso.s sVar3 = sVarArr2[(i11 << (8 - i12)) & 255];
            br.l.b(sVar3);
            int i13 = sVar3.f5979g;
            if (((com.squareup.picasso.s[]) sVar3.f5980r) != null || i13 > i12) {
                break;
            }
            gVar.p0(sVar3.f5978d);
            i12 -= i13;
            sVar2 = sVar;
        }
        return gVar.k(gVar.f6706d);
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte b2 = this.f23989c.readByte();
            byte[] bArr = pu.b.f20645a;
            int i14 = b2 & 255;
            if ((b2 & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (b2 & 127) << i13;
            i13 += 7;
        }
    }
}
