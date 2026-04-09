package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;
import java.util.List;

/* loaded from: classes3.dex */
public final class yw1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<dc0> f36086a;

    /* renamed from: b, reason: collision with root package name */
    private final n52[] f36087b;

    public yw1(List<dc0> list) {
        this.f36086a = list;
        this.f36087b = new n52[list.size()];
    }

    public final void a(long j4, uf1 uf1Var) {
        xn.a(j4, uf1Var, this.f36087b);
    }

    public final void a(w70 w70Var, c72.d dVar) {
        for (int i = 0; i < this.f36087b.length; i++) {
            dVar.a();
            n52 n52VarA = w70Var.a(dVar.c(), 3);
            dc0 dc0Var = this.f36086a.get(i);
            String str = dc0Var.f26083m;
            zf.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String strB = dc0Var.f26073b;
            if (strB == null) {
                strB = dVar.b();
            }
            n52VarA.a(new dc0.a().b(strB).e(str).m(dc0Var.f26076e).d(dc0Var.f26075d).a(dc0Var.f26070E).a(dc0Var.f26085o).a());
            this.f36087b[i] = n52VarA;
        }
    }
}
