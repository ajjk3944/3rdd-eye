package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ud {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f34036a;

    public ud(mp1 reporter) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        this.f34036a = reporter;
    }

    public final void a(Map<Thread, StackTraceElement[]> traces) {
        kotlin.jvm.internal.l.f(traces, "traces");
        this.f34036a.reportAnr(traces);
    }
}
