package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4514bi implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4986u0 f40587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f40589c;

    public C4514bi(C4986u0 c4986u0, Context context, ReporterConfig reporterConfig) {
        this.f40587a = c4986u0;
        this.f40588b = context;
        this.f40589c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C4986u0 c4986u0 = this.f40587a;
        Context context = this.f40588b;
        ReporterConfig reporterConfig = this.f40589c;
        c4986u0.getClass();
        return C4961t0.a(context).f().c(reporterConfig);
    }
}
