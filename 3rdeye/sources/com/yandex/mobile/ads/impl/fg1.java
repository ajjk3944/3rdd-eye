package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;

/* loaded from: classes3.dex */
public final class fg1 implements rw1 {

    /* renamed from: a, reason: collision with root package name */
    private dc0 f27320a;

    /* renamed from: b, reason: collision with root package name */
    private c52 f27321b;

    /* renamed from: c, reason: collision with root package name */
    private n52 f27322c;

    public fg1(String str) {
        this.f27320a = new dc0.a().e(str).a();
    }

    @Override // com.yandex.mobile.ads.impl.rw1
    public final void a(uf1 uf1Var) {
        c52 c52Var = this.f27321b;
        if (c52Var == null) {
            throw new IllegalStateException();
        }
        int i = s82.f32899a;
        long jB = c52Var.b();
        long jC = this.f27321b.c();
        if (jB == -9223372036854775807L || jC == -9223372036854775807L) {
            return;
        }
        dc0 dc0Var = this.f27320a;
        if (jC != dc0Var.f26087q) {
            dc0 dc0VarA = dc0Var.a().a(jC).a();
            this.f27320a = dc0VarA;
            this.f27322c.a(dc0VarA);
        }
        int iA = uf1Var.a();
        this.f27322c.a(iA, uf1Var);
        this.f27322c.a(jB, 1, iA, 0, null);
    }

    @Override // com.yandex.mobile.ads.impl.rw1
    public final void a(c52 c52Var, w70 w70Var, c72.d dVar) {
        this.f27321b = c52Var;
        dVar.a();
        n52 n52VarA = w70Var.a(dVar.c(), 5);
        this.f27322c = n52VarA;
        n52VarA.a(this.f27320a);
    }
}
