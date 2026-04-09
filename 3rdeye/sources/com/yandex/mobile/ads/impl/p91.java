package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class p91 {

    /* renamed from: a, reason: collision with root package name */
    private final t61 f31685a;

    public /* synthetic */ p91(Context context, mp1 mp1Var) {
        this(context, mp1Var, new t61(context, mp1Var));
    }

    public final p61 a(a8<String> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        String strI = adResponse.I();
        if (strI == null || strI.length() == 0) {
            return null;
        }
        return this.f31685a.a(strI, new oj(adResponse, adResponse.C(), adResponse.y()));
    }

    public p91(Context context, mp1 reporter, t61 nativeAdResponseParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(nativeAdResponseParser, "nativeAdResponseParser");
        this.f31685a = nativeAdResponseParser;
    }
}
