package com.applovin.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class n0 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final String f7001g;

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f7002h;

    public n0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.f7001g = str;
        this.f7002h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6218a.q0().a(new a(this.f7002h, this.f6218a, d()));
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f6218a.t().a(n0.this.f7001g, n0.this.f7002h.f(), i10, jSONObject, null, true);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f6218a.t().a(n0.this.f7001g, n0.this.f7002h.f(), i10, jSONObject, str2, false);
        }
    }
}
