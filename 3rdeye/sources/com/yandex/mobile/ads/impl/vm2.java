package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Set;

/* loaded from: classes3.dex */
public final class vm2 implements e92 {

    /* renamed from: a, reason: collision with root package name */
    private final ne f34622a;

    /* renamed from: b, reason: collision with root package name */
    private final du1 f34623b;

    public vm2(ne appMetricaAdapter, Context context, du1 du1Var) {
        kotlin.jvm.internal.l.f(appMetricaAdapter, "appMetricaAdapter");
        kotlin.jvm.internal.l.f(context, "context");
        this.f34622a = appMetricaAdapter;
        this.f34623b = du1Var;
    }

    @Override // com.yandex.mobile.ads.impl.e92
    public final void setExperiments(String experiments) {
        kotlin.jvm.internal.l.f(experiments, "experiments");
        du1 du1Var = this.f34623b;
        if (du1Var == null || !du1Var.G0()) {
            return;
        }
        this.f34622a.b(experiments);
    }

    @Override // com.yandex.mobile.ads.impl.e92
    public final void setTriggeredTestIds(Set<Long> testIds) {
        kotlin.jvm.internal.l.f(testIds, "testIds");
        du1 du1Var = this.f34623b;
        if (du1Var == null || !du1Var.G0()) {
            return;
        }
        this.f34622a.a(testIds);
    }
}
