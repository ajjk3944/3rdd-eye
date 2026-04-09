package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4974td implements ModuleServiceLifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final Q1 f41690a;

    public C4974td(Q1 q12) {
        this.f41690a = q12;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f41690a.b(new Eo(moduleServiceLifecycleObserver, 1));
        this.f41690a.a(new P1() { // from class: io.appmetrica.analytics.impl.So
            @Override // io.appmetrica.analytics.impl.P1
            public final void a(Intent intent) {
                C4974td.b(moduleServiceLifecycleObserver, intent);
            }
        });
    }
}
