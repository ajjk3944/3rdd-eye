package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t2 extends q2 implements o1 {

    /* renamed from: t, reason: collision with root package name */
    private final Bundle f21444t;

    /* renamed from: u, reason: collision with root package name */
    private final AtomicReference f21445u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f21446v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f21447w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f21448x;

    public t2(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(map, jSONObject, jSONObject2, null, kVar);
        this.f21444t = new Bundle();
        this.f21447w = new AtomicBoolean();
        this.f21445u = new AtomicReference();
        this.f21446v = new AtomicBoolean();
    }

    private long d0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f18925a.a(g3.f19413o7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.q2
    public q2 a(com.applovin.impl.mediation.h hVar) {
        return new t2(this, hVar);
    }

    public void c0() {
        this.f21446v.set(true);
    }

    public long e0() {
        return a("ahdm", ((Long) this.f18925a.a(g3.f19407i7)).longValue());
    }

    public long f0() {
        long jA = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f18925a.a(g3.f19421w7)).longValue());
    }

    public long g0() {
        long jA = a("ad_hidden_timeout_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_timeout_ms", ((Long) this.f18925a.a(g3.f19418t7)).longValue());
    }

    @Override // com.applovin.impl.o1
    public long getTimeToLiveMillis() {
        return d0() - (SystemClock.elapsedRealtime() - H());
    }

    public b4 h0() {
        return (b4) this.f21445u.getAndSet(null);
    }

    public long i0() {
        if (H() > 0) {
            return SystemClock.elapsedRealtime() - H();
        }
        return -1L;
    }

    public Bundle j0() {
        return this.f21444t;
    }

    public long k0() {
        long jA = a("fullscreen_display_delay_ms", -1L);
        return jA >= 0 ? jA : ((Long) this.f18925a.a(g3.f19405g7)).longValue();
    }

    public String l0() {
        return b("mcode", "");
    }

    public AtomicBoolean m0() {
        return this.f21447w;
    }

    public boolean n0() {
        return this.f21446v.get();
    }

    public boolean o0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f18925a.a(g3.f19419u7)).booleanValue();
    }

    public boolean p0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f18925a.a(g3.f19420v7)).booleanValue();
    }

    public boolean q0() {
        return a("susaode", (Boolean) this.f18925a.a(g3.f19406h7)).booleanValue();
    }

    @Override // com.applovin.impl.o1
    public void setExpired() {
        this.f21448x = true;
    }

    @Override // com.applovin.impl.q2
    public void a(Bundle bundle) throws JSONException {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.f21444t.putBundle("applovin_ad_view_info", bundle2);
    }

    public void a(b4 b4Var) {
        this.f21445u.set(b4Var);
    }

    private t2(t2 t2Var, com.applovin.impl.mediation.h hVar) {
        super(t2Var.i(), t2Var.a(), t2Var.g(), hVar, t2Var.f18925a);
        this.f21444t = new Bundle();
        this.f21447w = new AtomicBoolean();
        this.f21445u = t2Var.f21445u;
        this.f21446v = t2Var.f21446v;
    }
}
