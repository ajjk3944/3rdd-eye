package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes3.dex */
public final class I1 implements InterfaceC5062x1 {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f39600a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5062x1 f39601b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39602c;

    public I1(InterfaceC5062x1 interfaceC5062x1) {
        this(Ga.j().w().b(), interfaceC5062x1);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void a(Intent intent, int i) {
        this.f39600a.execute(new A1(this, intent, i));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void b(Intent intent) {
        this.f39600a.execute(new E1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void c(Intent intent) {
        this.f39600a.execute(new D1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void onConfigurationChanged(Configuration configuration) {
        this.f39600a.execute(new C5087y1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final synchronized void onCreate() {
        this.f39602c = true;
        this.f39600a.execute(new C5112z1(this));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void onDestroy() {
        this.f39600a.removeAll();
        synchronized (this) {
            this.f39602c = false;
        }
        this.f39601b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void pauseUserSession(Bundle bundle) {
        this.f39600a.execute(new H1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void reportData(int i, Bundle bundle) {
        this.f39600a.execute(new F1(this, i, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void resumeUserSession(Bundle bundle) {
        this.f39600a.execute(new G1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void a(Intent intent, int i, int i10) {
        this.f39600a.execute(new B1(this, intent, i, i10));
    }

    public I1(IHandlerExecutor iHandlerExecutor, InterfaceC5062x1 interfaceC5062x1) {
        this.f39602c = false;
        this.f39600a = iHandlerExecutor;
        this.f39601b = interfaceC5062x1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void a(Intent intent) {
        this.f39600a.execute(new C1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void a(InterfaceC5037w1 interfaceC5037w1) {
        this.f39601b.a(interfaceC5037w1);
    }
}
