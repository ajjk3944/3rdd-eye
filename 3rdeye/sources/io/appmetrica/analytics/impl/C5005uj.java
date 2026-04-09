package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.uj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5005uj {

    /* renamed from: a, reason: collision with root package name */
    public final String f41781a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f41782b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f41783c;

    /* renamed from: d, reason: collision with root package name */
    public final C5080xj f41784d;

    public C5005uj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C5080xj c5080xj) {
        this.f41781a = str;
        this.f41782b = context;
        int i = AbstractC4980tj.f41698a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.f41783c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.f41783c = null;
        } else {
            this.f41783c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f41784d = c5080xj;
    }
}
