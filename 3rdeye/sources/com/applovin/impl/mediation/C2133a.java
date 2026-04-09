package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.AbstractC2108b;
import com.applovin.impl.C2111c;
import com.applovin.impl.a7;
import com.applovin.impl.t2;

/* renamed from: com.applovin.impl.mediation.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2133a extends AbstractC2108b {

    /* renamed from: a, reason: collision with root package name */
    private final C2111c f20214a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f20215b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20216c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0311a f20217d;

    /* renamed from: e, reason: collision with root package name */
    private t2 f20218e;

    /* renamed from: f, reason: collision with root package name */
    private String f20219f;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0311a {
        void a(t2 t2Var);
    }

    public C2133a(com.applovin.impl.sdk.k kVar) {
        this.f20215b = kVar.O();
        this.f20214a = kVar.e();
        this.f20216c = a7.a(com.applovin.impl.sdk.k.o(), "AdActivityObserver", kVar);
    }

    public void a(t2 t2Var, InterfaceC0311a interfaceC0311a) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20215b.a("AdActivityObserver", "Starting for ad " + t2Var.getAdUnitId() + "...");
        }
        a();
        this.f20217d = interfaceC0311a;
        this.f20218e = t2Var;
        this.f20214a.a(this);
    }

    @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f20216c) && this.f20218e.p0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20215b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f20217d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20215b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f20217d.a(this.f20218e);
            }
            a();
            return;
        }
        if (this.f20219f == null) {
            this.f20219f = activity.getClass().getName();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20215b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f20219f);
            }
        }
    }

    @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f20219f)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20215b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f20219f);
            }
            if (this.f20217d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20215b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f20217d.a(this.f20218e);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20215b.a("AdActivityObserver", "Cancelling...");
        }
        this.f20214a.b(this);
        this.f20217d = null;
        this.f20218e = null;
        this.f20219f = null;
    }
}
