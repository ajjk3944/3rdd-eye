package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d9 implements i9 {

    /* renamed from: a, reason: collision with root package name */
    public final c9 f10376a;

    /* renamed from: b, reason: collision with root package name */
    public final sk0 f10377b = new sk0(32);

    /* renamed from: c, reason: collision with root package name */
    public int f10378c;

    /* renamed from: d, reason: collision with root package name */
    public int f10379d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10380e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10381f;

    public d9(c9 c9Var) {
        this.f10376a = c9Var;
    }

    @Override // com.google.android.gms.internal.ads.i9
    public final void a() {
        this.f10381f = true;
    }

    @Override // com.google.android.gms.internal.ads.i9
    public final void b(int i4, sk0 sk0Var) {
        int i10 = i4 & 1;
        int iK = i10 != 0 ? sk0Var.f16447b + sk0Var.K() : -1;
        if (this.f10381f) {
            if (i10 == 0) {
                return;
            }
            this.f10381f = false;
            sk0Var.E(iK);
            this.f10379d = 0;
        }
        while (sk0Var.B() > 0) {
            int i11 = this.f10379d;
            sk0 sk0Var2 = this.f10377b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iK2 = sk0Var.K();
                    sk0Var.E(sk0Var.f16447b - 1);
                    if (iK2 == 255) {
                        this.f10381f = true;
                        return;
                    }
                }
                int iMin = Math.min(sk0Var.B(), 3 - this.f10379d);
                sk0Var.H(this.f10379d, iMin, sk0Var2.f16446a);
                int i12 = this.f10379d + iMin;
                this.f10379d = i12;
                if (i12 == 3) {
                    sk0Var2.E(0);
                    sk0Var2.C(3);
                    sk0Var2.G(1);
                    int iK3 = sk0Var2.K();
                    boolean z3 = (iK3 & 128) != 0;
                    int iK4 = sk0Var2.K();
                    this.f10380e = z3;
                    int i13 = (((iK3 & 15) << 8) | iK4) + 3;
                    this.f10378c = i13;
                    byte[] bArr = sk0Var2.f16446a;
                    if (bArr.length < i13) {
                        int length = bArr.length;
                        sk0Var2.A(Math.min(4098, Math.max(i13, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(sk0Var.B(), this.f10378c - this.f10379d);
                sk0Var.H(this.f10379d, iMin2, sk0Var2.f16446a);
                int i14 = this.f10379d + iMin2;
                this.f10379d = i14;
                int i15 = this.f10378c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f10380e) {
                        sk0Var2.C(i15);
                    } else {
                        if (bq0.f(0, sk0Var2.f16446a, i15, -1) != 0) {
                            this.f10381f = true;
                            return;
                        }
                        sk0Var2.C(this.f10378c - 4);
                    }
                    sk0Var2.E(0);
                    this.f10376a.l(sk0Var2);
                    this.f10379d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i9
    public final void d(zo0 zo0Var, z1 z1Var, h9 h9Var) {
        this.f10376a.d(zo0Var, z1Var, h9Var);
        this.f10381f = true;
    }
}
