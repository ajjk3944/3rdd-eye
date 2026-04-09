package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.view.View;
import c9.C2100u;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q20 {

    /* renamed from: a, reason: collision with root package name */
    private final oo f31997a;

    /* renamed from: b, reason: collision with root package name */
    private po f31998b;

    public q20(oo mainClickConnector) {
        kotlin.jvm.internal.l.f(mainClickConnector, "mainClickConnector");
        this.f31997a = mainClickConnector;
    }

    public final void a(Uri uri, View clickView) {
        Map mapA;
        kotlin.jvm.internal.l.f(uri, "uri");
        kotlin.jvm.internal.l.f(clickView, "clickView");
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("position");
            Integer numQ = queryParameter2 != null ? y9.m.Q(queryParameter2) : null;
            if (numQ == null) {
                this.f31997a.a(clickView, queryParameter);
                return;
            }
            po poVar = this.f31998b;
            if (poVar == null || (mapA = poVar.a()) == null) {
                mapA = C2100u.f18582b;
            }
            oo ooVar = (oo) mapA.get(numQ);
            if (ooVar != null) {
                ooVar.a(clickView, queryParameter);
            }
        }
    }

    public final void a(po poVar) {
        this.f31998b = poVar;
    }
}
