package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11531a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f11532b;

    /* renamed from: c, reason: collision with root package name */
    public int f11533c;

    /* renamed from: d, reason: collision with root package name */
    public long f11534d;

    /* renamed from: e, reason: collision with root package name */
    public int f11535e;

    /* renamed from: f, reason: collision with root package name */
    public int f11536f;

    /* renamed from: g, reason: collision with root package name */
    public int f11537g;

    public final void a(InterfaceC2046w0 interfaceC2046w0) {
        if (this.f11532b) {
            return;
        }
        byte[] bArr = this.f11531a;
        interfaceC2046w0.v(0, 10, bArr);
        interfaceC2046w0.i();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f11532b = true;
        }
    }

    public final void b(T0 t02, long j6, int i, int i3, int i6, S0 s02) {
        AbstractC0582Jp.i0("TrueHD chunk samples must be contiguous in the sample queue.", this.f11537g <= i3 + i6);
        if (this.f11532b) {
            int i7 = this.f11533c;
            int i8 = i7 + 1;
            this.f11533c = i8;
            if (i7 == 0) {
                this.f11534d = j6;
                this.f11535e = i;
                this.f11536f = 0;
            }
            this.f11536f += i3;
            this.f11537g = i6;
            if (i8 >= 16) {
                c(t02, s02);
            }
        }
    }

    public final void c(T0 t02, S0 s02) {
        if (this.f11533c > 0) {
            t02.c(this.f11534d, this.f11535e, this.f11536f, this.f11537g, s02);
            this.f11533c = 0;
        }
    }
}
