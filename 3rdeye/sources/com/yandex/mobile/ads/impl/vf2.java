package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.s32;

/* loaded from: classes3.dex */
final class vf2 extends s32 {

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f34529b;

    /* renamed from: c, reason: collision with root package name */
    private final uf1 f34530c;

    /* renamed from: d, reason: collision with root package name */
    private int f34531d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34532e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f34533f;

    /* renamed from: g, reason: collision with root package name */
    private int f34534g;

    public vf2(n52 n52Var) {
        super(n52Var);
        this.f34529b = new uf1(u31.f33899a);
        this.f34530c = new uf1(4);
    }

    public final boolean a(uf1 uf1Var) throws s32.a {
        int iT = uf1Var.t();
        int i = (iT >> 4) & 15;
        int i10 = iT & 15;
        if (i10 != 7) {
            throw new s32.a(fe.a("Video format not supported: ", i10));
        }
        this.f34534g = i;
        return i != 5;
    }

    public final boolean a(long j4, uf1 uf1Var) throws yf1 {
        int iT = uf1Var.t();
        long jI = (uf1Var.i() * 1000) + j4;
        if (iT == 0 && !this.f34532e) {
            uf1 uf1Var2 = new uf1(new byte[uf1Var.a()]);
            uf1Var.a(uf1Var2.c(), 0, uf1Var.a());
            gi giVarA = gi.a(uf1Var2);
            this.f34531d = giVarA.f27751b;
            this.f32858a.a(new dc0.a().e("video/avc").a(giVarA.f27755f).o(giVarA.f27752c).f(giVarA.f27753d).b(giVarA.f27754e).a(giVarA.f27750a).a());
            this.f34532e = true;
            return false;
        }
        if (iT != 1 || !this.f34532e) {
            return false;
        }
        int i = this.f34534g == 1 ? 1 : 0;
        if (!this.f34533f && i == 0) {
            return false;
        }
        byte[] bArrC = this.f34530c.c();
        bArrC[0] = 0;
        bArrC[1] = 0;
        bArrC[2] = 0;
        int i10 = 4 - this.f34531d;
        int i11 = 0;
        while (uf1Var.a() > 0) {
            uf1Var.a(this.f34530c.c(), i10, this.f34531d);
            this.f34530c.e(0);
            int iX = this.f34530c.x();
            this.f34529b.e(0);
            this.f32858a.a(4, this.f34529b);
            this.f32858a.a(iX, uf1Var);
            i11 = i11 + 4 + iX;
        }
        this.f32858a.a(jI, i, i11, 0, null);
        this.f34533f = true;
        return true;
    }
}
