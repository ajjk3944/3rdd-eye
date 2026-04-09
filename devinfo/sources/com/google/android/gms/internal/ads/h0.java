package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public int f11671a;

    /* renamed from: b, reason: collision with root package name */
    public int f11672b;

    /* renamed from: c, reason: collision with root package name */
    public int f11673c;

    public h0() {
        this.f11671a = 0;
        this.f11672b = 0;
        this.f11673c = 0;
    }

    public static h0 a(va.c3 c3Var) {
        return c3Var.f36041d ? new h0(3, 0, 0) : c3Var.f36045i ? new h0(2, 0, 0) : c3Var.f36044h ? new h0(0, 0, 0) : new h0(1, c3Var.f36043f, c3Var.f36040c);
    }

    public boolean b() {
        return this.f11671a == 3;
    }

    public h0(int i4, int i10, int i11) {
        this.f11671a = i4;
        this.f11673c = i10;
        this.f11672b = i11;
    }

    public /* synthetic */ h0(int i4, int i10, int i11, boolean z3) {
        this.f11671a = i4;
        this.f11672b = i10;
        this.f11673c = i11;
    }
}
