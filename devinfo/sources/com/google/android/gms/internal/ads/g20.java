package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g20 implements p20 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f11351a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f11352b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f11353c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f11354d;

    /* renamed from: e, reason: collision with root package name */
    public double f11355e;

    /* renamed from: f, reason: collision with root package name */
    public double f11356f;
    public double g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l30 f11357h;

    public g20(l30 l30Var) {
        this.f11357h = l30Var;
        int i4 = l30Var.f13357h;
        this.f11351a = new float[i4];
        int i10 = i4 * l30Var.f13352b;
        this.f11352b = new float[i10];
        this.f11353c = new float[i10];
        this.f11354d = new float[i10];
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void C1() {
        this.g = this.f11355e;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final /* synthetic */ Object E1() {
        return this.f11353c;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final /* synthetic */ Object I1() {
        return this.f11354d;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void J1(int i4) {
        this.f11353c = n(this.f11353c, this.f11357h.f13359k, i4);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final /* synthetic */ Object L1() {
        return this.f11352b;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void a(int i4) {
        this.f11352b = n(this.f11352b, this.f11357h.j, i4);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final int b() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final int c(int i4, int i10, int i11) {
        return m(this.f11352b, i4, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void d(int i4) {
        this.f11354d = n(this.f11354d, this.f11357h.f13360l, i4);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void e() {
        this.g = 0.0d;
        this.f11355e = 0.0d;
        this.f11356f = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void f(ByteBuffer byteBuffer, int i4) {
        l30 l30Var = this.f11357h;
        byteBuffer.asFloatBuffer().put(this.f11353c, 0, l30Var.f13352b * i4);
        byteBuffer.position((i4 * 4 * l30Var.f13352b) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void g(ByteBuffer byteBuffer, int i4) {
        l30 l30Var = this.f11357h;
        byteBuffer.asFloatBuffer().get(this.f11352b, l30Var.j * l30Var.f13352b, i4 / 4);
        byteBuffer.position(byteBuffer.position() + i4);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void h(int i4, int i10, int i11, int i12, int i13) {
        float[] fArr = this.f11353c;
        float[] fArr2 = this.f11352b;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i4; i18++) {
                fArr[i17] = ((fArr2[i16] * i18) + (fArr2[i15] * (i4 - i18))) / i4;
                i17 += i10;
                i15 += i10;
                i16 += i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void i(int i4, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            l30 l30Var = this.f11357h;
            if (i12 >= l30Var.f13357h / i10) {
                return;
            }
            double d10 = 0.0d;
            int i13 = 0;
            while (true) {
                i11 = l30Var.f13352b * i10;
                if (i13 < i11) {
                    d10 += this.f11352b[(i11 * i12) + (r6 * i4) + i13];
                    i13++;
                }
            }
            this.f11351a[i12] = (float) (d10 / i11);
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void j(int i4, int i10) {
        for (int i11 = 0; i11 < this.f11357h.f13352b * i10; i11++) {
            this.f11352b[i4 + i11] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void k(long j, long j8, int i4) {
        int i10 = 0;
        while (true) {
            l30 l30Var = this.f11357h;
            int i11 = l30Var.f13352b;
            if (i10 >= i11) {
                return;
            }
            float[] fArr = this.f11353c;
            int i12 = l30Var.f13359k;
            float[] fArr2 = this.f11354d;
            int i13 = (i4 * i11) + i10;
            float f10 = fArr2[i13];
            float f11 = fArr2[i13 + i11];
            long j9 = l30Var.f13362n * j;
            long j10 = (r1 + 1) * j8;
            long j11 = j10 - j9;
            fArr[(i12 * i11) + i10] = ((j11 * f10) + ((r12 - j11) * f11)) / (j10 - (l30Var.f13361m * j8));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final int l(int i4, int i10) {
        return m(this.f11351a, 0, i4, i10);
    }

    public final int m(float[] fArr, int i4, int i10, int i11) {
        int i12 = 255;
        int i13 = 0;
        double d10 = 0.0d;
        double d11 = 1.0d;
        int i14 = i10;
        while (true) {
            double d12 = i12;
            double d13 = i13;
            if (i14 > i11) {
                this.f11355e = d11 / d13;
                this.f11356f = d10 / d12;
                return i13;
            }
            int i15 = 0;
            double dAbs = 0.0d;
            while (i15 < i14) {
                int i16 = this.f11357h.f13352b * i4;
                dAbs += Math.abs(fArr[i16 + i15] - fArr[(i16 + i14) + i15]);
                i15++;
                i12 = i12;
            }
            int i17 = i12;
            double d14 = d13 * dAbs;
            double d15 = i14;
            double d16 = d11 * d15;
            if (d14 < d16) {
                d11 = dAbs;
            }
            if (d14 < d16) {
                i13 = i14;
            }
            double d17 = d12 * dAbs;
            double d18 = d15 * d10;
            if (d17 > d18) {
                d10 = dAbs;
            }
            i12 = d17 > d18 ? i14 : i17;
            i14++;
        }
    }

    public final float[] n(float[] fArr, int i4, int i10) {
        int length = fArr.length;
        int i11 = this.f11357h.f13352b;
        int i12 = length / i11;
        return i4 + i10 <= i12 ? fArr : Arrays.copyOf(fArr, (((i12 * 3) / 2) + i10) * i11);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final boolean zzc() {
        double d10 = this.f11355e;
        return d10 != 0.0d && this.f11357h.f13364p != 0 && this.f11356f <= d10 * 3.0d && d10 + d10 > this.g * 3.0d;
    }
}
