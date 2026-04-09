package com.yandex.mobile.ads.impl;

import c9.C2099t;

/* loaded from: classes3.dex */
public final class pq {
    public static uq a(h61 nativeAd, tr contentCloseListener, lt nativeAdEventListener, w00 adTypeSpecificBinder, mp1 reporter) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(adTypeSpecificBinder, "adTypeSpecificBinder");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kt adAssets = nativeAd.getAdAssets();
        return new uq(new vd0(nativeAd, contentCloseListener, nativeAdEventListener, reporter, new xg(C2099t.f18581b), new a41()), new rc(adAssets, new e51()), new lv0(adAssets, new r41()), new hn1(adAssets, new in1(), new x31(), new r41()), adTypeSpecificBinder);
    }
}
