package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kk;

/* loaded from: classes3.dex */
public final class li2 implements kk.a<nc1> {

    /* renamed from: a, reason: collision with root package name */
    private final xp1<nc1> f30015a = null;

    @Override // com.yandex.mobile.ads.impl.rq1.a
    public final void a(fi2 error) {
        fb2 fb2Var;
        kotlin.jvm.internal.l.f(error, "error");
        if (error.f27346b == null) {
            String message = error.getMessage();
            if (message == null) {
                message = "Ad request failed with network error";
            }
            fb2Var = new fb2(2, message);
        } else {
            fb2Var = new fb2(1, "Ping error");
        }
        xp1<nc1> xp1Var = this.f30015a;
        if (xp1Var != null) {
            xp1Var.a(fb2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.rq1.b
    public final void a(Object obj) {
        nc1 response = (nc1) obj;
        kotlin.jvm.internal.l.f(response, "response");
        xp1<nc1> xp1Var = this.f30015a;
        if (xp1Var != null) {
            xp1Var.a((xp1<nc1>) response);
        }
    }
}
