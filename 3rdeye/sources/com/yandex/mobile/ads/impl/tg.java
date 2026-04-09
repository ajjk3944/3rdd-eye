package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tg {

    /* renamed from: a, reason: collision with root package name */
    private final ns f33578a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33579b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4195s1 f33580c;

    /* renamed from: d, reason: collision with root package name */
    private final e8 f33581d;

    /* renamed from: e, reason: collision with root package name */
    private o71 f33582e;

    public /* synthetic */ tg(InterfaceC4143k4 interfaceC4143k4, ns nsVar, String str) {
        this(interfaceC4143k4, nsVar, str, interfaceC4143k4.a(), interfaceC4143k4.b());
    }

    public final jp1 a() {
        jp1 jp1VarA = this.f33581d.a();
        jp1VarA.b(this.f33578a.b(), Constants.ADMON_AD_TYPE);
        jp1VarA.a(this.f33579b, "ad_id");
        jp1VarA.a((Map<String, ? extends Object>) this.f33580c.a());
        o71 o71Var = this.f33582e;
        return o71Var != null ? kp1.a(jp1VarA, o71Var.a()) : jp1VarA;
    }

    public tg(InterfaceC4143k4 adInfoReportDataProviderFactory, ns adType, String str, InterfaceC4195s1 adAdapterReportDataProvider, e8 adResponseReportDataProvider) {
        kotlin.jvm.internal.l.f(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(adAdapterReportDataProvider, "adAdapterReportDataProvider");
        kotlin.jvm.internal.l.f(adResponseReportDataProvider, "adResponseReportDataProvider");
        this.f33578a = adType;
        this.f33579b = str;
        this.f33580c = adAdapterReportDataProvider;
        this.f33581d = adResponseReportDataProvider;
    }

    public final void a(o71 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f33582e = reportParameterManager;
    }
}
