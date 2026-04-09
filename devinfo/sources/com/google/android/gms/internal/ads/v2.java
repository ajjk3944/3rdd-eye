package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f17430a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f17431b;

    /* renamed from: c, reason: collision with root package name */
    public int f17432c;

    /* renamed from: d, reason: collision with root package name */
    public long f17433d;

    /* renamed from: e, reason: collision with root package name */
    public int f17434e;

    /* renamed from: f, reason: collision with root package name */
    public int f17435f;
    public int g;

    public final void a(y1 y1Var) {
        if (this.f17431b) {
            return;
        }
        byte[] bArr = this.f17430a;
        y1Var.M1(0, 10, bArr);
        y1Var.B1();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f17431b = true;
        }
    }

    public final void b(u2 u2Var, long j, int i4, int i10, int i11, t2 t2Var) {
        mq0.d0("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i10 + i11);
        if (this.f17431b) {
            int i12 = this.f17432c;
            int i13 = i12 + 1;
            this.f17432c = i13;
            if (i12 == 0) {
                this.f17433d = j;
                this.f17434e = i4;
                this.f17435f = 0;
            }
            this.f17435f += i10;
            this.g = i11;
            if (i13 >= 16) {
                c(u2Var, t2Var);
            }
        }
    }

    public final void c(u2 u2Var, t2 t2Var) {
        if (this.f17432c > 0) {
            u2Var.d(this.f17433d, this.f17434e, this.f17435f, this.g, t2Var);
            this.f17432c = 0;
        }
    }
}
