package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y20 implements p20 {

    /* renamed from: a, reason: collision with root package name */
    public final short[] f18607a;

    /* renamed from: b, reason: collision with root package name */
    public short[] f18608b;

    /* renamed from: c, reason: collision with root package name */
    public short[] f18609c;

    /* renamed from: d, reason: collision with root package name */
    public short[] f18610d;

    /* renamed from: e, reason: collision with root package name */
    public int f18611e;

    /* renamed from: f, reason: collision with root package name */
    public int f18612f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l30 f18613h;

    public y20(l30 l30Var) {
        this.f18613h = l30Var;
        int i4 = l30Var.f13357h;
        this.f18607a = new short[i4];
        int i10 = i4 * l30Var.f13352b;
        this.f18608b = new short[i10];
        this.f18609c = new short[i10];
        this.f18610d = new short[i10];
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void C1() {
        this.g = this.f18611e;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final /* synthetic */ Object E1() {
        return this.f18609c;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final /* synthetic */ Object I1() {
        return this.f18610d;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void J1(int i4) {
        this.f18609c = n(this.f18609c, this.f18613h.f13359k, i4);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final /* synthetic */ Object L1() {
        return this.f18608b;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void a(int i4) {
        this.f18608b = n(this.f18608b, this.f18613h.j, i4);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final int b() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final int c(int i4, int i10, int i11) {
        return m(this.f18608b, i4, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void d(int i4) {
        this.f18610d = n(this.f18610d, this.f18613h.f13360l, i4);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void e() {
        this.g = 0;
        this.f18611e = 0;
        this.f18612f = 0;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void f(ByteBuffer byteBuffer, int i4) {
        l30 l30Var = this.f18613h;
        byteBuffer.asShortBuffer().put(this.f18609c, 0, l30Var.f13352b * i4);
        byteBuffer.position(((i4 + i4) * l30Var.f13352b) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void g(ByteBuffer byteBuffer, int i4) {
        l30 l30Var = this.f18613h;
        byteBuffer.asShortBuffer().get(this.f18608b, l30Var.j * l30Var.f13352b, i4 / 2);
        byteBuffer.position(byteBuffer.position() + i4);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void h(int i4, int i10, int i11, int i12, int i13) {
        short[] sArr = this.f18609c;
        short[] sArr2 = this.f18608b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i4; i18++) {
                sArr[i17] = (short) (((sArr2[i16] * i18) + ((i4 - i18) * sArr2[i15])) / i4);
                i17 += i10;
                i15 += i10;
                i16 += i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void i(int i4, int i10) {
        int i11;
        short[] sArr = this.f18608b;
        int i12 = 0;
        while (true) {
            l30 l30Var = this.f18613h;
            if (i12 >= l30Var.f13357h / i10) {
                return;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = l30Var.f13352b;
                i11 = i15 * i10;
                if (i13 < i11) {
                    i14 += sArr[(i11 * i12) + (i15 * i4) + i13];
                    i13++;
                }
            }
            this.f18607a[i12] = (short) (i14 / i11);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void j(int i4, int i10) {
        for (int i11 = 0; i11 < this.f18613h.f13352b * i10; i11++) {
            this.f18608b[i4 + i11] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void k(long j, long j8, int i4) {
        int i10 = 0;
        while (true) {
            l30 l30Var = this.f18613h;
            int i11 = l30Var.f13352b;
            if (i10 >= i11) {
                return;
            }
            short[] sArr = this.f18609c;
            int i12 = l30Var.f13359k;
            short[] sArr2 = this.f18610d;
            int i13 = (i4 * i11) + i10;
            short s10 = sArr2[i13];
            short s11 = sArr2[i13 + i11];
            long j9 = l30Var.f13362n * j;
            long j10 = l30Var.f13361m * j8;
            long j11 = (r2 + 1) * j8;
            int i14 = i10;
            long j12 = j11 - j10;
            long j13 = j11 - j9;
            sArr[(i12 * i11) + i14] = (short) ((((j12 - j13) * s11) + (j13 * s10)) / j12);
            i10 = i14 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final int l(int i4, int i10) {
        return m(this.f18607a, 0, i4, i10);
    }

    public final int m(short[] sArr, int i4, int i10, int i11) {
        int i12 = 1;
        int i13 = 255;
        int i14 = 0;
        int i15 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = this.f18613h.f13352b * i4;
                iAbs += Math.abs(sArr[i17 + i16] - sArr[(i17 + i10) + i16]);
            }
            int i18 = iAbs * i14;
            int i19 = i12 * i10;
            if (i18 < i19) {
                i12 = iAbs;
            }
            if (i18 < i19) {
                i14 = i10;
            }
            int i20 = iAbs * i13;
            int i21 = i15 * i10;
            if (i20 > i21) {
                i15 = iAbs;
            }
            if (i20 > i21) {
                i13 = i10;
            }
            i10++;
        }
        this.f18611e = i12 / i14;
        this.f18612f = i15 / i13;
        return i14;
    }

    public final short[] n(short[] sArr, int i4, int i10) {
        int length = sArr.length;
        int i11 = this.f18613h.f13352b;
        int i12 = length / i11;
        return i4 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final boolean zzc() {
        int i4 = this.f18611e;
        return i4 != 0 && this.f18613h.f13364p != 0 && this.f18612f <= i4 * 3 && i4 + i4 > this.g * 3;
    }
}
