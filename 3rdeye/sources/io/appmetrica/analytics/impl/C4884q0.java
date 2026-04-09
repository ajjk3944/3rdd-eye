package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4884q0 implements Ua {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f41445a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f41446b;

    /* renamed from: c, reason: collision with root package name */
    public final C5115z4 f41447c;

    public C4884q0() {
        IHandlerExecutor iHandlerExecutorA = C5065x4.l().g().a();
        this.f41446b = iHandlerExecutorA;
        this.f41445a = iHandlerExecutorA.getHandler();
        this.f41447c = new C5115z4();
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(AppMetricaConfig appMetricaConfig, InterfaceC4791mb interfaceC4791mb) {
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final Handler b() {
        return this.f41445a;
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final Y1 c() {
        return new Y1();
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final Db d() {
        return new Db();
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final ICommonExecutor getDefaultExecutor() {
        return this.f41446b;
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final C5115z4 a() {
        return this.f41447c;
    }
}
