package com.applovin.impl;

import com.applovin.impl.b5;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d5 extends k3 {

    /* renamed from: k, reason: collision with root package name */
    private final a3 f5779k;

    public d5(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(a3Var.e(), jSONObject, jSONObject2, kVar);
        this.f5779k = a3Var;
    }

    public boolean A() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    public b5.b t() {
        return b5.b.values()[a("signal_cache_level", ((Integer) this.f6313a.a(r3.Q7)).intValue())];
    }

    @Override // com.applovin.impl.k3
    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + '}';
    }

    public a3 u() {
        return this.f5779k;
    }

    public long v() {
        return a("signal_expiration_ms", ((Long) this.f6313a.a(r3.P7)).longValue());
    }

    public boolean w() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean x() {
        return a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    public boolean y() {
        return a("fail_collection_for_empty_signal", (Boolean) this.f6313a.a(r3.f7490x8)).booleanValue();
    }

    public boolean z() {
        return a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }
}
