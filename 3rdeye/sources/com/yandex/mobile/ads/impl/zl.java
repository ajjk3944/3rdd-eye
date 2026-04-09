package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.impl.C4236y0;
import com.yandex.mobile.ads.impl.C4242z0;

/* loaded from: classes3.dex */
public final class zl {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f36542a;

    /* renamed from: b, reason: collision with root package name */
    private final yl f36543b;

    public /* synthetic */ zl(vu1 vu1Var) {
        this(vu1Var, vu1Var.c(), new yl(vu1Var.e()));
    }

    public final boolean a(Context context, a8 adResponse, f8 adResultReceiver, C4072a3 adConfiguration, String browserUrl) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adResultReceiver, "adResultReceiver");
        kotlin.jvm.internal.l.f(browserUrl, "browserUrl");
        C4242z0 c4242z0A = C4242z0.a.a();
        long jA = hi0.a();
        Intent intentA = this.f36543b.a(context, browserUrl, jA);
        c4242z0A.a(jA, new C4236y0(new C4236y0.a(adResponse, adConfiguration, adResultReceiver)));
        try {
            context.startActivity(intentA);
            return true;
        } catch (Exception e4) {
            c4242z0A.a(jA);
            e4.toString();
            fp0.b(new Object[0]);
            this.f36542a.reportError("Failed to show Browser", e4);
            return false;
        }
    }

    public zl(vu1 sdkEnvironmentModule, mp1 reporter, yl intentCreator) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(intentCreator, "intentCreator");
        this.f36542a = reporter;
        this.f36543b = intentCreator;
    }
}
