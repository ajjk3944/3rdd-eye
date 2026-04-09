package com.applovin.impl;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class n0 extends i5 {
    private final String g;

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f4857h;

    public n0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.g = str;
        this.f4857h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4287a.q0().a(new a(this.f4857h, this.f4287a, d()));
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z3) {
            super(aVar, kVar, z3);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i4) {
            this.f4287a.t().a(n0.this.g, n0.this.f4857h.f(), i4, jSONObject, null, true);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, JSONObject jSONObject) {
            this.f4287a.t().a(n0.this.g, n0.this.f4857h.f(), i4, jSONObject, str2, false);
        }
    }
}
