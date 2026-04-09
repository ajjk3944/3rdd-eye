package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* renamed from: io.appmetrica.analytics.impl.od, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4845od implements ModuleEventServiceHandlerReporter {

    /* renamed from: a, reason: collision with root package name */
    public final C9 f41371a;

    /* renamed from: b, reason: collision with root package name */
    public final C4683i6 f41372b;

    public C4845od(C9 c92, C4683i6 c4683i6) {
        this.f41371a = c92;
        this.f41372b = c4683i6;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        C4683i6 c4683i6D = C4683i6.d(this.f41372b);
        c4683i6D.f41047d = counterReportApi.getType();
        c4683i6D.f41048e = counterReportApi.getCustomType();
        c4683i6D.setName(counterReportApi.getName());
        c4683i6D.setValue(counterReportApi.getValue());
        c4683i6D.setValueBytes(counterReportApi.getValueBytes());
        c4683i6D.f41050g = counterReportApi.getBytesTruncated();
        C9 c92 = this.f41371a;
        c92.a(c4683i6D, Pk.a(c92.f39235c.b(c4683i6D), c4683i6D.i));
    }
}
