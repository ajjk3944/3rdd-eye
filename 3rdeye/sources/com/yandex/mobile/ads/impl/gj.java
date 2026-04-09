package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import c9.C2099t;

/* loaded from: classes3.dex */
public final class gj {

    /* renamed from: a, reason: collision with root package name */
    private final bj f27772a;

    public /* synthetic */ gj(C4072a3 c4072a3) {
        this(c4072a3, new bj(c4072a3));
    }

    public final fj a(Context context, a8 adResponse, h61 nativeAdPrivate, ap0 container, r71 nativeAdEventListener, ViewTreeObserver.OnPreDrawListener preDrawListener, de2 videoEventController) {
        Context context2;
        sq0 sq0VarA;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(preDrawListener, "preDrawListener");
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        aj ajVarA = this.f27772a.a(context, nativeAdPrivate);
        if (ajVarA != null) {
            context2 = context;
            sq0VarA = ajVarA.a(context2, adResponse, nativeAdPrivate, nativeAdEventListener, videoEventController);
        } else {
            context2 = context;
            sq0VarA = null;
        }
        return new fj(new ej(context2, container, sq0VarA != null ? E.u.G(sq0VarA) : C2099t.f18581b, preDrawListener));
    }

    public gj(C4072a3 adConfiguration, bj designProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(designProvider, "designProvider");
        this.f27772a = designProvider;
    }
}
