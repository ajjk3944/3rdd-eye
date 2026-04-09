package com.yandex.mobile.ads.impl;

import A9.C0583j;
import android.content.Context;
import f9.InterfaceC4347e;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class od2 {

    /* renamed from: a, reason: collision with root package name */
    private final ld2 f31352a;

    public /* synthetic */ od2(Context context, C4072a3 c4072a3, oa1 oa1Var, kf1 kf1Var) {
        this(context, c4072a3, oa1Var, kf1Var, new ld2(context, c4072a3, oa1Var, kf1Var));
    }

    public final Object a(ArrayList arrayList, InterfaceC4347e interfaceC4347e) {
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
        c0583j.s();
        this.f31352a.a(arrayList, new nd2(c0583j));
        Object objR = c0583j.r();
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public od2(Context context, C4072a3 adConfiguration, oa1 reportParametersProvider, kf1 requestConfigurationParametersProvider, ld2 videoAdsResponseHandler) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(videoAdsResponseHandler, "videoAdsResponseHandler");
        this.f31352a = videoAdsResponseHandler;
    }
}
