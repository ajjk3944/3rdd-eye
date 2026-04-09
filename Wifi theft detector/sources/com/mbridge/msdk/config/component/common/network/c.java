package com.mbridge.msdk.config.component.common.network;

import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f13215a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f13216b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f13217c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f13218d;

    /* renamed from: e, reason: collision with root package name */
    private String f13219e;

    /* renamed from: f, reason: collision with root package name */
    private String f13220f = "HTTP";

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f13221g = null;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f13222h = null;

    public class a implements com.mbridge.msdk.config.component.common.network.b {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f13221g != null) {
                c.this.f13221g.a();
            }
        }
    }

    public class b implements com.mbridge.msdk.config.component.common.network.b {
        public b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f13222h != null) {
                c.this.f13222h.a();
            }
        }
    }

    public c(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2) {
        this.f13217c = aVar;
        this.f13216b = aVar2;
        this.f13218d = aVar2.a();
    }

    private void c() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f13217c, this.f13216b, this.f13215a);
            this.f13221g = aVar;
            aVar.a(this.f13219e);
            this.f13218d.a(new a());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }

    public void a(String str, com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f13219e = str;
        this.f13215a = aVar;
        this.f13220f = this.f13217c.i();
    }

    public void b() {
        com.mbridge.msdk.config.component.common.network.a aVar = this.f13215a;
        if (aVar != null) {
            aVar.a(this.f13216b);
        }
        if (this.f13220f.equals("TCP")) {
            c();
        } else {
            a();
        }
    }

    private void a() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f13217c, this.f13216b, this.f13215a);
            this.f13222h = aVar;
            aVar.a(this.f13219e);
            this.f13218d.a(new b());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }
}
