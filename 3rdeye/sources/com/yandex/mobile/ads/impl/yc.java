package com.yandex.mobile.ads.impl;

import b9.C1992A;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;

/* loaded from: classes3.dex */
public final class yc {

    /* renamed from: a, reason: collision with root package name */
    public static final yc f35705a = new yc();

    /* renamed from: b, reason: collision with root package name */
    private static final String f35706b = "ads_sdk";

    private yc() {
    }

    public static void a(ae report) {
        Object objA;
        kotlin.jvm.internal.l.f(report, "report");
        try {
            AppMetricaLibraryAdapter.reportEvent(f35706b, report.a(), report.b());
            objA = C1992A.f18074a;
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            fp0.b(new Object[0]);
        }
    }
}
