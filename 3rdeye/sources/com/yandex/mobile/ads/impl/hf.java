package com.yandex.mobile.ads.impl;

import b9.InterfaceC2000g;
import io.appmetrica.analytics.IReporter;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hf implements mp1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2000g f28191a;

    public hf(InterfaceC2000g<? extends IReporter> lazyReporter) {
        kotlin.jvm.internal.l.f(lazyReporter, "lazyReporter");
        this.f28191a = lazyReporter;
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void a(ip1 report) {
        kotlin.jvm.internal.l.f(report, "report");
        try {
            ((IReporter) this.f28191a.getValue()).reportEvent(report.c(), report.b());
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void reportAnr(Map<Thread, StackTraceElement[]> traces) {
        kotlin.jvm.internal.l.f(traces, "traces");
        try {
            ((IReporter) this.f28191a.getValue()).reportAnr(traces);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void reportError(String message, Throwable error) {
        kotlin.jvm.internal.l.f(message, "message");
        kotlin.jvm.internal.l.f(error, "error");
        try {
            ((IReporter) this.f28191a.getValue()).reportError(message, error);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void reportUnhandledException(Throwable throwable) {
        kotlin.jvm.internal.l.f(throwable, "throwable");
        try {
            ((IReporter) this.f28191a.getValue()).reportUnhandledException(throwable);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
    }
}
