package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10991a;

    /* renamed from: b, reason: collision with root package name */
    public int f10992b;

    /* renamed from: c, reason: collision with root package name */
    public int f10993c;

    /* renamed from: d, reason: collision with root package name */
    public long f10994d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10995e;

    /* renamed from: f, reason: collision with root package name */
    public final sk0 f10996f;
    public final sk0 g;

    /* renamed from: h, reason: collision with root package name */
    public int f10997h;

    /* renamed from: i, reason: collision with root package name */
    public int f10998i;

    public f5(sk0 sk0Var, sk0 sk0Var2, boolean z3) throws ua {
        this.g = sk0Var;
        this.f10996f = sk0Var2;
        this.f10995e = z3;
        sk0Var2.E(12);
        this.f10991a = sk0Var2.h();
        sk0Var.E(12);
        this.f10998i = sk0Var.h();
        nn1.d("first_chunk must be 1", sk0Var.b() == 1);
        this.f10992b = -1;
    }

    public final boolean a() {
        int i4 = this.f10992b + 1;
        this.f10992b = i4;
        if (i4 == this.f10991a) {
            return false;
        }
        boolean z3 = this.f10995e;
        sk0 sk0Var = this.f10996f;
        this.f10994d = z3 ? sk0Var.j() : sk0Var.P();
        if (this.f10992b == this.f10997h) {
            sk0 sk0Var2 = this.g;
            this.f10993c = sk0Var2.h();
            sk0Var2.G(4);
            int i10 = this.f10998i - 1;
            this.f10998i = i10;
            this.f10997h = i10 > 0 ? (-1) + sk0Var2.h() : -1;
        }
        return true;
    }
}
