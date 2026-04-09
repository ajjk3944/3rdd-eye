package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c9.C2099t;
import java.util.List;

/* loaded from: classes3.dex */
public final class d90 {

    /* renamed from: a, reason: collision with root package name */
    private final m90 f26023a;

    public /* synthetic */ d90(C4072a3 c4072a3) {
        this(c4072a3, new m90(c4072a3));
    }

    public final fj a(Context context, a8 adResponse, pz1 nativeAdPrivate, List preloadedDivKitDesigns, ViewGroup container, lt nativeAdEventListener, ViewTreeObserver.OnPreDrawListener preDrawListener, de2 videoEventController) {
        Context context2;
        sq0 sq0VarA;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(preloadedDivKitDesigns, "preloadedDivKitDesigns");
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(preDrawListener, "preDrawListener");
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        l90 l90VarA = this.f26023a.a(context, preloadedDivKitDesigns);
        if (l90VarA != null) {
            context2 = context;
            sq0VarA = l90VarA.a(context2, adResponse, nativeAdPrivate, nativeAdEventListener, videoEventController);
        } else {
            context2 = context;
            sq0VarA = null;
        }
        return new fj(new ej(context2, container, sq0VarA != null ? E.u.G(sq0VarA) : C2099t.f18581b, preDrawListener));
    }

    public d90(C4072a3 adConfiguration, m90 designProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(designProvider, "designProvider");
        this.f26023a = designProvider;
    }
}
