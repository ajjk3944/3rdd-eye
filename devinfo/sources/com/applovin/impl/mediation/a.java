package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.c3;
import com.applovin.impl.n7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a extends com.applovin.impl.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c f4558a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f4559b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4560c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0013a f4561d;

    /* renamed from: e, reason: collision with root package name */
    private c3 f4562e;

    /* renamed from: f, reason: collision with root package name */
    private String f4563f;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0013a {
        void b(c3 c3Var);
    }

    public a(com.applovin.impl.sdk.k kVar) {
        this.f4559b = kVar.O();
        this.f4558a = kVar.e();
        this.f4560c = n7.a(com.applovin.impl.sdk.k.o(), "AdActivityObserver", kVar);
    }

    public void a(c3 c3Var, InterfaceC0013a interfaceC0013a) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4559b.a("AdActivityObserver", "Starting for ad " + c3Var.getAdUnitId() + "...");
        }
        a();
        this.f4561d = interfaceC0013a;
        this.f4562e = c3Var;
        this.f4558a.a(this);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f4560c) && this.f4562e.y0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4559b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f4561d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4559b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f4561d.b(this.f4562e);
            }
            a();
            return;
        }
        if (this.f4563f == null) {
            this.f4563f = activity.getClass().getName();
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.B(new StringBuilder("Started tracking ad Activity: "), this.f4563f, this.f4559b, "AdActivityObserver");
            }
        }
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f4563f)) {
            if (com.applovin.impl.sdk.o.a()) {
                a0.g.B(new StringBuilder("Ad Activity destroyed: "), this.f4563f, this.f4559b, "AdActivityObserver");
            }
            if (this.f4561d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4559b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f4561d.b(this.f4562e);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4559b.a("AdActivityObserver", "Cancelling...");
        }
        this.f4558a.b(this);
        this.f4561d = null;
        this.f4562e = null;
        this.f4563f = null;
    }
}
