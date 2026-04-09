package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;

/* loaded from: classes3.dex */
public final class ty {

    /* renamed from: a, reason: collision with root package name */
    private final np1 f33807a;

    /* renamed from: b, reason: collision with root package name */
    private final ze1 f33808b;

    /* renamed from: c, reason: collision with root package name */
    private final g51 f33809c;

    /* renamed from: d, reason: collision with root package name */
    private final xj1 f33810d;

    public ty(C4072a3 adConfiguration, a8 adResponse, np1 reporter, g91 openUrlHandler, g51 nativeAdEventController, xj1 preferredPackagesViewer) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(openUrlHandler, "openUrlHandler");
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        kotlin.jvm.internal.l.f(preferredPackagesViewer, "preferredPackagesViewer");
        this.f33807a = reporter;
        this.f33808b = openUrlHandler;
        this.f33809c = nativeAdEventController;
        this.f33810d = preferredPackagesViewer;
    }

    public final void a(Context context, py action) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(action, "action");
        if (this.f33810d.a(context, action.d())) {
            this.f33807a.a(ip1.b.f28780F);
            this.f33809c.d();
        } else {
            this.f33808b.a(action.c());
        }
    }
}
