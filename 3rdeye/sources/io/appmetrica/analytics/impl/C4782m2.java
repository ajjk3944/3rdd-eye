package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.appmetrica.analytics.impl.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4782m2 implements InterfaceC4878pk, ApplicationStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f41234a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f41235b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f41236c = ApplicationState.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f41237d = new CopyOnWriteArraySet();

    public final void a(int i) {
        this.f41234a.remove(Integer.valueOf(i));
        a();
    }

    public final void b(int i) {
        this.f41235b.add(Integer.valueOf(i));
        this.f41234a.remove(Integer.valueOf(i));
        a();
    }

    public final void c(int i) {
        this.f41234a.add(Integer.valueOf(i));
        this.f41235b.remove(Integer.valueOf(i));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState getCurrentState() {
        return this.f41236c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4878pk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4878pk
    public final void onDestroy() {
        if (this.f41236c == ApplicationState.VISIBLE) {
            this.f41236c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f41237d.add(applicationStateObserver);
        }
        return this.f41236c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f41234a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f41235b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f41236c != applicationState) {
            this.f41236c = applicationState;
            Iterator it = this.f41237d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f41236c);
            }
        }
    }
}
