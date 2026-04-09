package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class vv0 {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f34709a;

    /* renamed from: b, reason: collision with root package name */
    private final rl f34710b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ vv0(Context context) {
        tv0 tv0VarA = new co1(context).a();
        this(context, tv0VarA, new rl(tv0VarA));
    }

    public final sv0 a(nu creative) {
        kotlin.jvm.internal.l.f(creative, "creative");
        double d10 = -1.0d;
        sv0 sv0Var = null;
        for (sv0 sv0Var2 : creative.h()) {
            double d11 = "video/mp4".equals(sv0Var2.e()) ? 1.5d : 1.0d;
            int iA = this.f34710b.a(sv0Var2);
            int iA2 = this.f34709a.a();
            double dAbs = d11 / ((((int) Math.max(0.0d, iA)) < 100 ? 10.0d : ((int) Math.abs(iA2 - r4)) / iA2) + 1.0d);
            if (dAbs > d10) {
                sv0Var = sv0Var2;
                d10 = dAbs;
            }
        }
        return sv0Var;
    }

    public vv0(Context context, tv0 referenceMediaFileInfo, rl bitrateProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(referenceMediaFileInfo, "referenceMediaFileInfo");
        kotlin.jvm.internal.l.f(bitrateProvider, "bitrateProvider");
        this.f34709a = referenceMediaFileInfo;
        this.f34710b = bitrateProvider;
    }
}
