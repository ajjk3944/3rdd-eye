package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.c3;
import com.applovin.impl.n7;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c f6551a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f6552b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6553c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0077a f6554d;

    /* renamed from: e, reason: collision with root package name */
    private c3 f6555e;

    /* renamed from: f, reason: collision with root package name */
    private String f6556f;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0077a {
        void b(c3 c3Var);
    }

    public a(com.applovin.impl.sdk.k kVar) {
        this.f6552b = kVar.O();
        this.f6551a = kVar.e();
        this.f6553c = n7.a(com.applovin.impl.sdk.k.o(), "AdActivityObserver", kVar);
    }

    public void a(c3 c3Var, InterfaceC0077a interfaceC0077a) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6552b.a("AdActivityObserver", "Starting for ad " + c3Var.getAdUnitId() + "...");
        }
        a();
        this.f6554d = interfaceC0077a;
        this.f6555e = c3Var;
        this.f6551a.a(this);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f6553c) && this.f6555e.y0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6552b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f6554d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6552b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f6554d.b(this.f6555e);
            }
            a();
            return;
        }
        if (this.f6556f == null) {
            this.f6556f = activity.getClass().getName();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6552b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f6556f);
            }
        }
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f6556f)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6552b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f6556f);
            }
            if (this.f6554d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6552b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f6554d.b(this.f6555e);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6552b.a("AdActivityObserver", "Cancelling...");
        }
        this.f6551a.b(this);
        this.f6554d = null;
        this.f6555e = null;
        this.f6556f = null;
    }
}
