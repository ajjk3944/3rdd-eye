package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class rz1 implements tb1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ag<?>> f32823a;

    /* JADX WARN: Multi-variable type inference failed */
    public rz1(List<? extends ag<?>> list) {
        this.f32823a = list;
    }

    @Override // com.yandex.mobile.ads.impl.tb1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.tb1
    public final void a(x61 nativeAdViewAdapter) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
    }

    @Override // com.yandex.mobile.ads.impl.tb1
    public final void a(x61 nativeAdViewAdapter, vo clickListenerConfigurator) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(clickListenerConfigurator, "clickListenerConfigurator");
        if (this.f32823a != null) {
            v9 v9Var = new v9(nativeAdViewAdapter, clickListenerConfigurator);
            for (ag<?> agVar : this.f32823a) {
                bg<?> bgVarA = nativeAdViewAdapter.a(agVar);
                if (bgVarA == null) {
                    bgVarA = null;
                }
                if (bgVarA != null) {
                    bgVarA.c(agVar.d());
                    bgVarA.a(agVar, v9Var);
                }
            }
        }
    }
}
