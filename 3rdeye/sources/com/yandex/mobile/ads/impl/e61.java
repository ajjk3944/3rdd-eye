package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class e61 {

    /* renamed from: a, reason: collision with root package name */
    private final qd2 f26693a;

    /* renamed from: b, reason: collision with root package name */
    private final e31 f26694b;

    public /* synthetic */ e61() {
        this(new qd2(), new e31());
    }

    public final qt a(sw0 sw0Var) {
        if (sw0Var == null) {
            return null;
        }
        ya2 ya2VarC = sw0Var.c();
        List<jj0> listA = sw0Var.a();
        ku0 ku0VarB = sw0Var.b();
        if (ya2VarC != null) {
            qd2 qd2Var = this.f26693a;
            mb2<ab1> videoAdInfo = ya2VarC.b();
            qd2Var.getClass();
            kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
            return new qt(videoAdInfo.d().getAdHeight() != 0 ? r4.getAdWidth() / r4.getAdHeight() : 1.7777778f);
        }
        if (listA != null && listA.size() > 1) {
            this.f26694b.getClass();
            return new qt((float) e31.a(listA));
        }
        if (ku0VarB != null) {
            return new qt(ku0VarB.a());
        }
        return null;
    }

    public e61(qd2 aspectRatioProvider, e31 multiBannerRatioProvider) {
        kotlin.jvm.internal.l.f(aspectRatioProvider, "aspectRatioProvider");
        kotlin.jvm.internal.l.f(multiBannerRatioProvider, "multiBannerRatioProvider");
        this.f26693a = aspectRatioProvider;
        this.f26694b = multiBannerRatioProvider;
    }
}
