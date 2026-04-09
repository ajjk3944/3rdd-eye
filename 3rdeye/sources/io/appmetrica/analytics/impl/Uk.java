package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes3.dex */
public final class Uk {

    /* renamed from: a, reason: collision with root package name */
    public final C4805n f40248a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f40249b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f40250c;

    /* renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f40251d;

    /* renamed from: e, reason: collision with root package name */
    public final C4857p f40252e;

    /* renamed from: f, reason: collision with root package name */
    public final C4753l f40253f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40254g;

    public Uk(C4805n c4805n, C4753l c4753l) {
        this(c4805n, c4753l, new F5(), new C4857p());
    }

    public final void a(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f40254g) {
                    F5 f52 = this.f40249b;
                    InterfaceC4820ne interfaceC4820ne = new InterfaceC4820ne() { // from class: io.appmetrica.analytics.impl.Ko
                        @Override // io.appmetrica.analytics.impl.InterfaceC4820ne
                        public final void consume(Object obj) {
                            this.f39733a.a(activity, (Ac) obj);
                        }
                    };
                    f52.getClass();
                    C5065x4.l().f42014c.a().execute(new E5(f52, interfaceC4820ne));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f40254g) {
                    F5 f52 = this.f40249b;
                    InterfaceC4820ne interfaceC4820ne = new InterfaceC4820ne() { // from class: io.appmetrica.analytics.impl.Jo
                        @Override // io.appmetrica.analytics.impl.InterfaceC4820ne
                        public final void consume(Object obj) {
                            this.f39700a.b(activity, (Ac) obj);
                        }
                    };
                    f52.getClass();
                    C5065x4.l().f42014c.a().execute(new E5(f52, interfaceC4820ne));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Uk(C4805n c4805n, C4753l c4753l, F5 f52, C4857p c4857p) {
        this.f40254g = false;
        this.f40248a = c4805n;
        this.f40253f = c4753l;
        this.f40249b = f52;
        this.f40252e = c4857p;
        this.f40250c = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.Lo
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                this.f39814a.a(activity, activityEvent);
            }
        };
        this.f40251d = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.Mo
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                this.f39881a.b(activity, activityEvent);
            }
        };
    }

    public final synchronized EnumC4779m a() {
        try {
            if (!this.f40254g) {
                this.f40248a.registerListener(this.f40250c, ActivityEvent.RESUMED);
                this.f40248a.registerListener(this.f40251d, ActivityEvent.PAUSED);
                this.f40254g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f40248a.f41277b;
    }

    public final void b(Activity activity, Ac ac) {
        if (this.f40252e.a(activity, EnumC4831o.PAUSED)) {
            ac.b(activity);
        }
    }

    public final void a(Activity activity, Ac ac) {
        if (this.f40252e.a(activity, EnumC4831o.RESUMED)) {
            ac.a(activity);
        }
    }
}
