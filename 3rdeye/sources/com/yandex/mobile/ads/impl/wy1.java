package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class wy1 {

    /* renamed from: a, reason: collision with root package name */
    private vy1 f35114a;

    public final vy1 a() {
        return this.f35114a;
    }

    public final void a(vy1 vy1Var) {
        if (vy1Var == null) {
            uo0.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        vy1 vy1Var2 = this.f35114a;
        if (vy1Var2 == null || vy1Var2.equals(vy1Var)) {
            this.f35114a = vy1Var;
        } else {
            uo0.c("Ad size can't be set twice.", new Object[0]);
        }
    }
}
