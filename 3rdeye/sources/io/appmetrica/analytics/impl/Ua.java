package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes3.dex */
public interface Ua {
    C5115z4 a();

    void a(AppMetricaConfig appMetricaConfig, InterfaceC4791mb interfaceC4791mb);

    Handler b();

    Y1 c();

    Db d();

    ICommonExecutor getDefaultExecutor();
}
