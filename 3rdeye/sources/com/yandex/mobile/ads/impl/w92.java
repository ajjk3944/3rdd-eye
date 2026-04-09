package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.cn1;

/* loaded from: classes3.dex */
public final class w92 {

    /* renamed from: a, reason: collision with root package name */
    private final ca2 f34868a;

    public w92(ca2 vastUrlConfigurator) {
        kotlin.jvm.internal.l.f(vastUrlConfigurator, "vastUrlConfigurator");
        this.f34868a = vastUrlConfigurator;
    }

    public final j92 a(Context context, C4072a3 adConfiguration, u92 requestConfiguration, v92 requestConfigurationParametersProvider, Object requestTag, n92 requestListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(requestConfiguration, "requestConfiguration");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(requestTag, "requestTag");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        m7 m7Var = new m7(requestConfiguration.a());
        y92 y92Var = new y92(m7Var);
        Uri uri = Uri.parse(m7Var.a().a());
        ca2 ca2Var = this.f34868a;
        ca2Var.getClass();
        kotlin.jvm.internal.l.f(uri, "uri");
        String string = cn1.a.a(uri, new ba2(ca2Var, requestConfigurationParametersProvider, adConfiguration, context)).toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        j92 j92Var = new j92(context, adConfiguration, string, new mi2(requestListener), requestConfiguration, y92Var, new p92(context, adConfiguration.q().c()));
        j92Var.b(requestTag);
        return j92Var;
    }
}
