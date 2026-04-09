package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;

/* loaded from: classes3.dex */
public final class sw1 implements c72 {

    /* renamed from: a, reason: collision with root package name */
    private final rw1 f33304a;

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f33305b = new uf1(32);

    /* renamed from: c, reason: collision with root package name */
    private int f33306c;

    /* renamed from: d, reason: collision with root package name */
    private int f33307d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33308e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33309f;

    public sw1(rw1 rw1Var) {
        this.f33304a = rw1Var;
    }

    @Override // com.yandex.mobile.ads.impl.c72
    public final void a(int i, uf1 uf1Var) {
        boolean z10 = (i & 1) != 0;
        int iD = z10 ? uf1Var.d() + uf1Var.t() : -1;
        if (this.f33309f) {
            if (!z10) {
                return;
            }
            this.f33309f = false;
            uf1Var.e(iD);
            this.f33307d = 0;
        }
        while (uf1Var.a() > 0) {
            int i10 = this.f33307d;
            if (i10 < 3) {
                if (i10 == 0) {
                    int iT = uf1Var.t();
                    uf1Var.e(uf1Var.d() - 1);
                    if (iT == 255) {
                        this.f33309f = true;
                        return;
                    }
                }
                int iMin = Math.min(uf1Var.a(), 3 - this.f33307d);
                uf1Var.a(this.f33305b.c(), this.f33307d, iMin);
                int i11 = this.f33307d + iMin;
                this.f33307d = i11;
                if (i11 == 3) {
                    this.f33305b.e(0);
                    this.f33305b.d(3);
                    this.f33305b.f(1);
                    int iT2 = this.f33305b.t();
                    int iT3 = this.f33305b.t();
                    this.f33308e = (iT2 & 128) != 0;
                    this.f33306c = (((iT2 & 15) << 8) | iT3) + 3;
                    int iB = this.f33305b.b();
                    int i12 = this.f33306c;
                    if (iB < i12) {
                        this.f33305b.a(Math.min(4098, Math.max(i12, this.f33305b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(uf1Var.a(), this.f33306c - this.f33307d);
                uf1Var.a(this.f33305b.c(), this.f33307d, iMin2);
                int i13 = this.f33307d + iMin2;
                this.f33307d = i13;
                int i14 = this.f33306c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (this.f33308e) {
                        if (s82.a(this.f33306c, this.f33305b.c()) != 0) {
                            this.f33309f = true;
                            return;
                        }
                        this.f33305b.d(this.f33306c - 4);
                    } else {
                        this.f33305b.d(i14);
                    }
                    this.f33305b.e(0);
                    this.f33304a.a(this.f33305b);
                    this.f33307d = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.c72
    public final void a(c52 c52Var, w70 w70Var, c72.d dVar) {
        this.f33304a.a(c52Var, w70Var, dVar);
        this.f33309f = true;
    }

    @Override // com.yandex.mobile.ads.impl.c72
    public final void a() {
        this.f33309f = true;
    }
}
