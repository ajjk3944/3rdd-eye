package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1488li implements InterfaceC1973ui {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f15427a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f15428b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f15429c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f15430d;

    /* renamed from: e, reason: collision with root package name */
    public double f15431e;

    /* renamed from: f, reason: collision with root package name */
    public double f15432f;

    /* renamed from: g, reason: collision with root package name */
    public double f15433g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0677Pi f15434h;

    public C1488li(C0677Pi c0677Pi) {
        this.f15434h = c0677Pi;
        int i = c0677Pi.f10473h;
        this.f15427a = new float[i];
        int i3 = i * c0677Pi.f10467b;
        this.f15428b = new float[i3];
        this.f15429c = new float[i3];
        this.f15430d = new float[i3];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final int a() {
        return 4;
    }

    public final int b(float[] fArr, int i, int i3, int i6) {
        int i7 = 255;
        int i8 = 0;
        double d6 = 0.0d;
        double d7 = 1.0d;
        int i9 = i3;
        while (true) {
            double d8 = i7;
            double d9 = i8;
            if (i9 > i6) {
                this.f15431e = d7 / d9;
                this.f15432f = d6 / d8;
                return i8;
            }
            int i10 = 0;
            double dAbs = 0.0d;
            while (i10 < i9) {
                int i11 = this.f15434h.f10467b * i;
                dAbs += Math.abs(fArr[i11 + i10] - fArr[(i11 + i9) + i10]);
                i10++;
                i7 = i7;
            }
            int i12 = i7;
            double d10 = d9 * dAbs;
            double d11 = i9;
            double d12 = d7 * d11;
            if (d10 < d12) {
                d7 = dAbs;
            }
            if (d10 < d12) {
                i8 = i9;
            }
            double d13 = d8 * dAbs;
            double d14 = d11 * d6;
            if (d13 > d14) {
                d6 = dAbs;
            }
            i7 = d13 > d14 ? i9 : i12;
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void c(int i) {
        this.f15428b = s(this.f15428b, this.f15434h.f10474j, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final int d(int i, int i3, int i6) {
        return b(this.f15428b, i, i3, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void e() {
        this.f15433g = 0.0d;
        this.f15431e = 0.0d;
        this.f15432f = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final boolean f() {
        double d6 = this.f15431e;
        return d6 != 0.0d && this.f15434h.f10480p != 0 && this.f15432f <= d6 * 3.0d && d6 + d6 > this.f15433g * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void g(int i) {
        this.f15430d = s(this.f15430d, this.f15434h.f10476l, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void h(ByteBuffer byteBuffer, int i) {
        C0677Pi c0677Pi = this.f15434h;
        byteBuffer.asFloatBuffer().put(this.f15429c, 0, c0677Pi.f10467b * i);
        byteBuffer.position((i * 4 * c0677Pi.f10467b) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void i(ByteBuffer byteBuffer, int i) {
        C0677Pi c0677Pi = this.f15434h;
        byteBuffer.asFloatBuffer().get(this.f15428b, c0677Pi.f10474j * c0677Pi.f10467b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void j() {
        this.f15433g = this.f15431e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void k(int i, int i3, int i6, int i7, int i8) {
        float[] fArr = this.f15429c;
        float[] fArr2 = this.f15428b;
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = (i7 * i3) + i9;
            int i11 = (i8 * i3) + i9;
            int i12 = (i6 * i3) + i9;
            for (int i13 = 0; i13 < i; i13++) {
                fArr[i12] = ((fArr2[i11] * i13) + (fArr2[i10] * (i - i13))) / i;
                i12 += i3;
                i10 += i3;
                i11 += i3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final /* synthetic */ Object l() {
        return this.f15429c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void m(int i, int i3) {
        int i6;
        int i7 = 0;
        while (true) {
            C0677Pi c0677Pi = this.f15434h;
            if (i7 >= c0677Pi.f10473h / i3) {
                return;
            }
            double d6 = 0.0d;
            int i8 = 0;
            while (true) {
                i6 = c0677Pi.f10467b * i3;
                if (i8 < i6) {
                    d6 += this.f15428b[(i6 * i7) + (r6 * i) + i8];
                    i8++;
                }
            }
            this.f15427a[i7] = (float) (d6 / i6);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void n(int i, int i3) {
        for (int i6 = 0; i6 < this.f15434h.f10467b * i3; i6++) {
            this.f15428b[i + i6] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void o(long j6, long j7, int i) {
        int i3 = 0;
        while (true) {
            C0677Pi c0677Pi = this.f15434h;
            int i6 = c0677Pi.f10467b;
            if (i3 >= i6) {
                return;
            }
            float[] fArr = this.f15429c;
            int i7 = c0677Pi.f10475k;
            float[] fArr2 = this.f15430d;
            int i8 = (i * i6) + i3;
            float f2 = fArr2[i8];
            float f5 = fArr2[i8 + i6];
            long j8 = c0677Pi.f10478n * j6;
            long j9 = (r1 + 1) * j7;
            long j10 = j9 - j8;
            fArr[(i7 * i6) + i3] = ((j10 * f2) + ((r12 - j10) * f5)) / (j9 - (c0677Pi.f10477m * j7));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final int p(int i, int i3) {
        return b(this.f15427a, 0, i, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final /* synthetic */ Object q() {
        return this.f15430d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final void r(int i) {
        this.f15429c = s(this.f15429c, this.f15434h.f10475k, i);
    }

    public final float[] s(float[] fArr, int i, int i3) {
        int length = fArr.length;
        int i6 = this.f15434h.f10467b;
        int i7 = length / i6;
        return i + i3 <= i7 ? fArr : Arrays.copyOf(fArr, (((i7 * 3) / 2) + i3) * i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public final /* synthetic */ Object w() {
        return this.f15428b;
    }
}
