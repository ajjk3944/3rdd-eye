package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class bs {

    /* renamed from: a, reason: collision with root package name */
    private final mp f25372a;

    public bs(mp closeButtonControllerProvider) {
        kotlin.jvm.internal.l.f(closeButtonControllerProvider, "closeButtonControllerProvider");
        this.f25372a = closeButtonControllerProvider;
    }

    public final as a(FrameLayout closeButton, a8 adResponse, yv debugEventsReporter, boolean z10, boolean z11) {
        lp gzVar;
        kotlin.jvm.internal.l.f(closeButton, "closeButton");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        this.f25372a.getClass();
        Long lU = adResponse.u();
        if (z10 && lU == null) {
            gzVar = new z11(closeButton, new m82(), new Handler(Looper.getMainLooper()));
        } else {
            gzVar = new gz(closeButton, new qh2(), debugEventsReporter, lU != null ? lU.longValue() : 0L, new up());
        }
        return z11 ? new vc0(gzVar) : new kb0(gzVar);
    }
}
