package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p2 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14861a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14862b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14863c;

    /* renamed from: d, reason: collision with root package name */
    public int f14864d;

    /* renamed from: e, reason: collision with root package name */
    public int f14865e;

    /* renamed from: f, reason: collision with root package name */
    public z1 f14866f;
    public u2 g;

    public p2(int i4, int i10, String str) {
        this.f14861a = i4;
        this.f14862b = i10;
        this.f14863c = str;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) {
        int i4 = this.f14862b;
        int i10 = this.f14861a;
        mq0.c0((i10 == -1 || i4 == -1) ? false : true);
        sk0 sk0Var = new sk0(i4);
        ((t1) y1Var).O1(sk0Var.f16446a, 0, i4, false);
        return sk0Var.L() == i10;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.f14866f = z1Var;
        u2 u2VarM = z1Var.m(Segment.SHARE_MINIMUM, 4);
        this.g = u2VarM;
        lw1 lw1Var = new lw1();
        String str = this.f14863c;
        lw1Var.d(str);
        lw1Var.e(str);
        u2VarM.f(new mx1(lw1Var));
        this.f14866f.i();
        this.f14866f.o(new q2());
        this.f14865e = 1;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        if (j == 0 || this.f14865e == 1) {
            this.f14865e = 1;
            this.f14864d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final int g(y1 y1Var, c2 c2Var) {
        int i4 = this.f14865e;
        if (i4 != 1) {
            if (i4 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        u2 u2Var = this.g;
        u2Var.getClass();
        int iG = u2Var.g(y1Var, Segment.SHARE_MINIMUM, true);
        if (iG != -1) {
            this.f14864d += iG;
            return 0;
        }
        this.f14865e = 2;
        this.g.d(0L, 1, this.f14864d, 0, null);
        this.f14864d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
