package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.h7;

/* loaded from: classes3.dex */
public final class zk2 {

    /* renamed from: a, reason: collision with root package name */
    private final iq1 f36541a;

    public /* synthetic */ zk2() {
        this(new iq1());
    }

    public final h7 a(String adUnitId, AdRequest adRequest) {
        hq1 hq1VarA;
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.l.f(adRequest, "adRequest");
        AdTheme preferredTheme = adRequest.getPreferredTheme();
        if (preferredTheme != null) {
            this.f36541a.getClass();
            hq1VarA = iq1.a(preferredTheme);
        } else {
            hq1VarA = null;
        }
        return new h7.a(adUnitId).a(adRequest.getAge()).d(adRequest.getBiddingData()).c(adRequest.getGender()).b(adRequest.getContextQuery()).a(adRequest.getContextTags()).a(adRequest.getLocation()).a(adRequest.getParameters()).a(hq1VarA).a();
    }

    public zk2(iq1 requestedAdThemeFactory) {
        kotlin.jvm.internal.l.f(requestedAdThemeFactory, "requestedAdThemeFactory");
        this.f36541a = requestedAdThemeFactory;
    }
}
