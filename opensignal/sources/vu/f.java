package vu;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final cv.g f23994a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23996c;

    /* renamed from: g, reason: collision with root package name */
    public int f24000g;

    /* renamed from: h, reason: collision with root package name */
    public int f24001h;

    /* renamed from: b, reason: collision with root package name */
    public int f23995b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f23997d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public d[] f23998e = new d[8];

    /* renamed from: f, reason: collision with root package name */
    public int f23999f = 7;

    public f(cv.g gVar) {
        this.f23994a = gVar;
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f23998e.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f23999f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                d dVar = this.f23998e[length];
                br.l.b(dVar);
                i10 -= dVar.f23985c;
                int i13 = this.f24001h;
                d dVar2 = this.f23998e[length];
                br.l.b(dVar2);
                this.f24001h = i13 - dVar2.f23985c;
                this.f24000g--;
                i12++;
                length--;
            }
            d[] dVarArr = this.f23998e;
            int i14 = i11 + 1;
            System.arraycopy(dVarArr, i14, dVarArr, i14 + i12, this.f24000g);
            d[] dVarArr2 = this.f23998e;
            int i15 = this.f23999f + 1;
            Arrays.fill(dVarArr2, i15, i15 + i12, (Object) null);
            this.f23999f += i12;
        }
    }

    public final void b(d dVar) {
        int i10 = dVar.f23985c;
        int i11 = this.f23997d;
        if (i10 > i11) {
            d[] dVarArr = this.f23998e;
            mq.l.i0(dVarArr, 0, dVarArr.length);
            this.f23999f = this.f23998e.length - 1;
            this.f24000g = 0;
            this.f24001h = 0;
            return;
        }
        a((this.f24001h + i10) - i11);
        int i12 = this.f24000g + 1;
        d[] dVarArr2 = this.f23998e;
        if (i12 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f23999f = this.f23998e.length - 1;
            this.f23998e = dVarArr3;
        }
        int i13 = this.f23999f;
        this.f23999f = i13 - 1;
        this.f23998e[i13] = dVar;
        this.f24000g++;
        this.f24001h += i10;
    }

    public final void c(cv.j jVar) throws EOFException {
        br.l.e(jVar, "data");
        int[] iArr = a0.f23971a;
        int iD = jVar.d();
        long j = 0;
        long j7 = 0;
        for (int i10 = 0; i10 < iD; i10++) {
            byte bI = jVar.i(i10);
            byte[] bArr = pu.b.f20645a;
            j7 += a0.f23972b[bI & 255];
        }
        int i11 = (int) ((j7 + 7) >> 3);
        int iD2 = jVar.d();
        cv.g gVar = this.f23994a;
        if (i11 >= iD2) {
            e(jVar.d(), 127, 0);
            gVar.n0(jVar);
            return;
        }
        cv.g gVar2 = new cv.g();
        int[] iArr2 = a0.f23971a;
        int iD3 = jVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD3; i13++) {
            byte bI2 = jVar.i(i13);
            byte[] bArr2 = pu.b.f20645a;
            int i14 = bI2 & 255;
            int i15 = a0.f23971a[i14];
            byte b2 = a0.f23972b[i14];
            j = (j << b2) | i15;
            i12 += b2;
            while (i12 >= 8) {
                i12 -= 8;
                gVar2.p0((int) (j >> i12));
            }
        }
        if (i12 > 0) {
            gVar2.p0((int) ((j << (8 - i12)) | (255 >>> i12)));
        }
        cv.j jVarK = gVar2.k(gVar2.f6706d);
        e(jVarK.d(), 127, 128);
        gVar.n0(jVarK);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.f.d(java.util.ArrayList):void");
    }

    public final void e(int i10, int i11, int i12) {
        cv.g gVar = this.f23994a;
        if (i10 < i11) {
            gVar.p0(i10 | i12);
            return;
        }
        gVar.p0(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            gVar.p0(128 | (i13 & 127));
            i13 >>>= 7;
        }
        gVar.p0(i13);
    }
}
