package com.applovin.impl;

import org.json.JSONObject;

/* renamed from: com.applovin.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2126j0 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final String f19548g;

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f19549h;

    public C2126j0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.f19548g = str;
        this.f19549h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f21692a.q0().a(new a(this.f19549h, this.f21692a, d()));
    }

    /* renamed from: com.applovin.impl.j0$a */
    public class a extends z5 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, JSONObject jSONObject, int i) {
            this.f21692a.u().a(C2126j0.this.f19548g, C2126j0.this.f19549h.f(), i, jSONObject, null, true);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            this.f21692a.u().a(C2126j0.this.f19548g, C2126j0.this.f19549h.f(), i, jSONObject, str2, false);
        }
    }
}
