package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ne {

    /* renamed from: a, reason: collision with root package name */
    private final AppMetricaAdapter f30848a;

    public ne(Context context) {
        AppMetricaAdapter appMetricaAdapter;
        kotlin.jvm.internal.l.f(context, "context");
        try {
            appMetricaAdapter = new AppMetricaAdapter(context);
        } catch (Throwable th) {
            th.toString();
            fp0.b(new Object[0]);
            appMetricaAdapter = null;
        }
        this.f30848a = appMetricaAdapter;
    }

    public final void a(String apiKey) {
        kotlin.jvm.internal.l.f(apiKey, "apiKey");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f30848a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.f36948b.a(appMetricaAdapter.f36947a, apiKey);
            }
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
    }

    public final void b(String experiments) {
        kotlin.jvm.internal.l.f(experiments, "experiments");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f30848a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setExperiments(experiments);
            }
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
    }

    public final void a(Set<Long> testIds) {
        kotlin.jvm.internal.l.f(testIds, "testIds");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f30848a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setTriggeredTestIds(testIds);
            }
        } catch (Throwable unused) {
            testIds.toString();
            fp0.c(new Object[0]);
        }
    }
}
