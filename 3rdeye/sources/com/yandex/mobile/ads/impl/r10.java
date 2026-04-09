package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class r10 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f32402a;

    /* renamed from: b, reason: collision with root package name */
    private final tz1 f32403b;

    public /* synthetic */ r10(mp1 mp1Var) {
        this(mp1Var, new tz1());
    }

    public final j6.i a(Context context, N7.U3 divData, h61 nativeAdPrivate, q20 clickHandler) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(divData, "divData");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(clickHandler, "clickHandler");
        if (!(nativeAdPrivate instanceof pz1)) {
            j6.i iVarA = new v20(context, clickHandler).a();
            kotlin.jvm.internal.l.c(iVarA);
            return iVarA;
        }
        sz1 sz1Var = new sz1(this.f32402a);
        sz1Var.a(divData, (pz1) nativeAdPrivate);
        this.f32403b.getClass();
        return tz1.a(context, sz1Var, clickHandler);
    }

    public r10(mp1 reporter, tz1 sliderDivConfigurationCreator) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(sliderDivConfigurationCreator, "sliderDivConfigurationCreator");
        this.f32402a = reporter;
        this.f32403b = sliderDivConfigurationCreator;
    }
}
