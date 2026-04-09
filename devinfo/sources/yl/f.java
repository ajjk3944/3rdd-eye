package yl;

import com.applovin.shadow.okio.internal.Buffer;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final hm.e f37690a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37692c;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f37696h;

    /* renamed from: b, reason: collision with root package name */
    public int f37691b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f37693d = Buffer.SEGMENTING_THRESHOLD;

    /* renamed from: e, reason: collision with root package name */
    public d[] f37694e = new d[8];

    /* renamed from: f, reason: collision with root package name */
    public int f37695f = 7;

    public f(hm.e eVar) {
        this.f37690a = eVar;
    }

    public final void a(int i4) {
        int i10;
        if (i4 > 0) {
            int length = this.f37694e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f37695f;
                if (length < i10 || i4 <= 0) {
                    break;
                }
                d dVar = this.f37694e[length];
                nk.k.b(dVar);
                i4 -= dVar.f37682c;
                int i12 = this.f37696h;
                d dVar2 = this.f37694e[length];
                nk.k.b(dVar2);
                this.f37696h = i12 - dVar2.f37682c;
                this.g--;
                i11++;
                length--;
            }
            d[] dVarArr = this.f37694e;
            int i13 = i10 + 1;
            System.arraycopy(dVarArr, i13, dVarArr, i13 + i11, this.g);
            d[] dVarArr2 = this.f37694e;
            int i14 = this.f37695f + 1;
            Arrays.fill(dVarArr2, i14, i14 + i11, (Object) null);
            this.f37695f += i11;
        }
    }

    public final void b(d dVar) {
        int i4 = dVar.f37682c;
        int i10 = this.f37693d;
        if (i4 > i10) {
            d[] dVarArr = this.f37694e;
            zj.m.U(0, dVarArr.length, null, dVarArr);
            this.f37695f = this.f37694e.length - 1;
            this.g = 0;
            this.f37696h = 0;
            return;
        }
        a((this.f37696h + i4) - i10);
        int i11 = this.g + 1;
        d[] dVarArr2 = this.f37694e;
        if (i11 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f37695f = this.f37694e.length - 1;
            this.f37694e = dVarArr3;
        }
        int i12 = this.f37695f;
        this.f37695f = i12 - 1;
        this.f37694e[i12] = dVar;
        this.g++;
        this.f37696h += i4;
    }

    public final void c(hm.h hVar) throws EOFException {
        nk.k.e(hVar, "data");
        int[] iArr = a0.f37660a;
        int iA = hVar.a();
        long j = 0;
        long j8 = 0;
        for (int i4 = 0; i4 < iA; i4++) {
            byte bD = hVar.d(i4);
            byte[] bArr = sl.f.f33832a;
            j8 += a0.f37661b[bD & 255];
        }
        int i10 = (int) ((j8 + 7) >> 3);
        int iA2 = hVar.a();
        hm.e eVar = this.f37690a;
        if (i10 >= iA2) {
            e(hVar.a(), 127, 0);
            eVar.y(hVar);
            return;
        }
        hm.e eVar2 = new hm.e();
        int[] iArr2 = a0.f37660a;
        int iA3 = hVar.a();
        int i11 = 0;
        for (int i12 = 0; i12 < iA3; i12++) {
            byte bD2 = hVar.d(i12);
            byte[] bArr2 = sl.f.f33832a;
            int i13 = bD2 & 255;
            int i14 = a0.f37660a[i13];
            byte b10 = a0.f37661b[i13];
            j = (j << b10) | i14;
            i11 += b10;
            while (i11 >= 8) {
                i11 -= 8;
                eVar2.E((int) (j >> i11));
            }
        }
        if (i11 > 0) {
            eVar2.E((int) ((j << (8 - i11)) | (255 >>> i11)));
        }
        hm.h byteString = eVar2.readByteString(eVar2.f25174b);
        e(byteString.a(), 127, 128);
        eVar.y(byteString);
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
        throw new UnsupportedOperationException("Method not decompiled: yl.f.d(java.util.ArrayList):void");
    }

    public final void e(int i4, int i10, int i11) {
        hm.e eVar = this.f37690a;
        if (i4 < i10) {
            eVar.E(i4 | i11);
            return;
        }
        eVar.E(i11 | i10);
        int i12 = i4 - i10;
        while (i12 >= 128) {
            eVar.E(128 | (i12 & 127));
            i12 >>>= 7;
        }
        eVar.E(i12);
    }
}
