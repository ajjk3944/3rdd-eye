package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class h20 {
    public static w00 a(h61 nativeAdPrivate, tr contentCloseListener, lt nativeAdEventListener, oo clickConnector, mp1 reporter) {
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(clickConnector, "clickConnector");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        if (!(nativeAdPrivate instanceof pz1)) {
            return new d51(nativeAdPrivate, contentCloseListener, nativeAdEventListener, clickConnector, reporter, new b41(), new i61(), new xg(i61.a(nativeAdPrivate)));
        }
        pz1 pz1Var = (pz1) nativeAdPrivate;
        return new oz1(pz1Var, contentCloseListener, nativeAdEventListener, clickConnector, reporter, new b41(), new i61(), new xg(i61.b(pz1Var)));
    }
}
