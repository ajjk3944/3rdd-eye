package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class d91 {

    /* renamed from: a, reason: collision with root package name */
    private final ng f26024a;

    public d91(ng assetValueProvider) {
        kotlin.jvm.internal.l.f(assetValueProvider, "assetValueProvider");
        this.f26024a = assetValueProvider;
    }

    public final c91 a() {
        yb1 yb1Var;
        sw0 sw0VarA = this.f26024a.a();
        ta1 ta1Var = null;
        if (sw0VarA != null) {
            ta1 ta1Var2 = sw0VarA.c() != null ? new ta1() : null;
            yb1Var = sw0VarA.b() != null ? new yb1() : null;
            ta1Var = ta1Var2;
        } else {
            yb1Var = null;
        }
        return new c91(ta1Var, yb1Var);
    }
}
