package com.yandex.mobile.ads.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.ReporterConfig;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
final class ff extends kotlin.jvm.internal.m implements InterfaceC5480a<IReporter> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zd f27300b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f27301c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ gf f27302d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f27303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(zd zdVar, Context context, gf gfVar, String str) {
        super(0);
        this.f27300b = zdVar;
        this.f27301c = context;
        this.f27302d = gfVar;
        this.f27303e = str;
    }

    @Override // p9.InterfaceC5480a
    public final IReporter invoke() {
        this.f27300b.a(this.f27301c);
        gf gfVar = this.f27302d;
        Context context = this.f27301c;
        String str = this.f27303e;
        gfVar.getClass();
        try {
            ReporterConfig reporterConfigBuild = ReporterConfig.newConfigBuilder(str).build();
            kotlin.jvm.internal.l.e(reporterConfigBuild, "build(...)");
            AppMetrica.activateReporter(context, reporterConfigBuild);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
        return AppMetrica.getReporter(this.f27301c, this.f27303e);
    }
}
