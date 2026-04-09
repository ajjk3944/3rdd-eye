package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class km0 {

    /* renamed from: a, reason: collision with root package name */
    private final nl0 f29722a;

    /* renamed from: b, reason: collision with root package name */
    private final p00 f29723b;

    public /* synthetic */ km0(nl0 nl0Var, cn0 cn0Var) {
        this(nl0Var, cn0Var, new p00(cn0Var));
    }

    public final bb2 a(o70 instreamAdView) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        bb2 bb2VarA = this.f29722a.a();
        if (bb2VarA != null) {
            return bb2VarA;
        }
        p00 p00Var = this.f29723b;
        Context context = instreamAdView.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        return p00Var.a(context, instreamAdView);
    }

    public km0(nl0 customUiElementsHolder, cn0 instreamDesign, p00 defaultUiElementsCreator) {
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        kotlin.jvm.internal.l.f(instreamDesign, "instreamDesign");
        kotlin.jvm.internal.l.f(defaultUiElementsCreator, "defaultUiElementsCreator");
        this.f29722a = customUiElementsHolder;
        this.f29723b = defaultUiElementsCreator;
    }
}
