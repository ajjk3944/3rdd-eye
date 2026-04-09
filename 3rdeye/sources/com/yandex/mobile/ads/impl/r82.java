package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;
import java.util.List;

/* loaded from: classes3.dex */
final class r82 {

    /* renamed from: a, reason: collision with root package name */
    private final List<dc0> f32556a;

    /* renamed from: b, reason: collision with root package name */
    private final n52[] f32557b;

    public r82(List<dc0> list) {
        this.f32556a = list;
        this.f32557b = new n52[list.size()];
    }

    public final void a(long j4, uf1 uf1Var) {
        if (uf1Var.a() < 9) {
            return;
        }
        int iH = uf1Var.h();
        int iH2 = uf1Var.h();
        int iT = uf1Var.t();
        if (iH == 434 && iH2 == 1195456820 && iT == 3) {
            xn.b(j4, uf1Var, this.f32557b);
        }
    }

    public final void a(w70 w70Var, c72.d dVar) {
        for (int i = 0; i < this.f32557b.length; i++) {
            dVar.a();
            n52 n52VarA = w70Var.a(dVar.c(), 3);
            dc0 dc0Var = this.f32556a.get(i);
            String str = dc0Var.f26083m;
            zf.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            n52VarA.a(new dc0.a().b(dVar.b()).e(str).m(dc0Var.f26076e).d(dc0Var.f26075d).a(dc0Var.f26070E).a(dc0Var.f26085o).a());
            this.f32557b[i] = n52VarA;
        }
    }
}
