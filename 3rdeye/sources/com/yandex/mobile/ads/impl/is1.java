package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class is1 {

    /* renamed from: a, reason: collision with root package name */
    private final js1 f28861a;

    public is1(om1 rewardedListener) {
        kotlin.jvm.internal.l.f(rewardedListener, "rewardedListener");
        this.f28861a = rewardedListener;
    }

    public final hs1 a(Context context, a8 a8Var, C4072a3 adConfiguration) {
        or1 or1VarJ;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        if (a8Var != null && (or1VarJ = a8Var.J()) != null) {
            if (or1VarJ.e()) {
                gx1 gx1VarD = or1VarJ.d();
                if (gx1VarD != null) {
                    return new fx1(context, adConfiguration, gx1VarD, new h9(context, adConfiguration));
                }
            } else {
                bp bpVarC = or1VarJ.c();
                if (bpVarC != null) {
                    return new ap(bpVarC, this.f28861a, new dw1(bpVarC.c(), bpVarC.d()));
                }
            }
        }
        return null;
    }
}
