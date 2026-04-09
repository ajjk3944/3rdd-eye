package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    public final u2 f14173a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14174b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14175c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14176d;

    /* renamed from: e, reason: collision with root package name */
    public int f14177e;

    /* renamed from: f, reason: collision with root package name */
    public int f14178f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f14179h;

    public n8(u2 u2Var) {
        this.f14173a = u2Var;
    }

    public final void a(int i4, int i10, byte[] bArr) {
        if (this.f14175c) {
            int i11 = this.f14178f;
            int i12 = (i4 + 1) - i11;
            if (i12 >= i10) {
                this.f14178f = (i10 - i4) + i11;
            } else {
                this.f14176d = ((bArr[i12] & 192) >> 6) == 0;
                this.f14175c = false;
            }
        }
    }

    public final void b(long j, int i4, boolean z3) {
        mq0.c0(this.f14179h != -9223372036854775807L);
        if (this.f14177e == 182 && z3 && this.f14174b) {
            long j8 = j - this.g;
            this.f14173a.d(this.f14179h, this.f14176d ? 1 : 0, (int) j8, i4, null);
        }
        if (this.f14177e != 179) {
            this.g = j;
        }
    }
}
