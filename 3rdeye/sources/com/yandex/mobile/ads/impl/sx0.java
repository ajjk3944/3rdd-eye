package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sx0 implements InterfaceC4195s1 {

    /* renamed from: a, reason: collision with root package name */
    private final ex0<?> f33316a;

    /* renamed from: b, reason: collision with root package name */
    private final rx0 f33317b;

    public sx0(ex0<?> ex0Var, rx0 mediatedAdapterInfoReportDataProvider) {
        kotlin.jvm.internal.l.f(mediatedAdapterInfoReportDataProvider, "mediatedAdapterInfoReportDataProvider");
        this.f33316a = ex0Var;
        this.f33317b = mediatedAdapterInfoReportDataProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4195s1
    public final Map<String, Object> a() {
        jp1 jp1Var = new jp1((Map) null, 3);
        ex0<?> ex0Var = this.f33316a;
        if (ex0Var != null) {
            zy0 zy0VarC = ex0Var.c();
            hx0 hx0VarA = this.f33316a.a();
            jp1Var.b(zy0VarC.e(), "adapter");
            jp1Var.b(zy0VarC.i(), "adapter_parameters");
            this.f33317b.getClass();
            jp1Var.a(new HashMap(rx0.a(hx0VarA)));
        }
        return jp1Var.b();
    }
}
