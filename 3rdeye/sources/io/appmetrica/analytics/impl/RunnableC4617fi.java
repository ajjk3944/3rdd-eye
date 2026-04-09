package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4617fi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f40865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40866b;

    public RunnableC4617fi(C4927ri c4927ri, ReporterConfig reporterConfig) {
        this.f40866b = c4927ri;
        this.f40865a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40866b;
        ReporterConfig reporterConfig = this.f40865a;
        C4986u0 c4986u0 = c4927ri.f41581a;
        Context context = c4927ri.f41584d;
        c4986u0.getClass();
        C4961t0.a(context).f().a(reporterConfig);
    }
}
