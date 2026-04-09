package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4756l2 {
    public static final boolean a(Throwable th) {
        return true;
    }

    public final Ya a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC4791mb interfaceC4791mb) {
        return new Mh(new C5098yc(interfaceC4791mb, appMetricaConfig), new androidx.work.s(), appMetricaConfig.crashTransformer, new C4609fa(context));
    }
}
