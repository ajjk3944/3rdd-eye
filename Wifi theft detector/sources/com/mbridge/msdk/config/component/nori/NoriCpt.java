package com.mbridge.msdk.config.component.nori;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.nori.monitor.b;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class NoriCpt extends com.mbridge.msdk.config.component.base.a {

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f13612h;

    public class a implements com.mbridge.msdk.config.component.common.network.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13613a;

        public a(String str) {
            this.f13613a = str;
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            q0.a("NoriCpt", "Request started: " + this.f13613a);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void b(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.c(aVar);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void c(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.a(aVar);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void d(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.b(aVar);
        }
    }

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("<htm") || str.contains("<body") || str.contains("<div");
    }

    private void f(String str) {
        if (d(str)) {
            g(str);
        } else {
            c(str);
        }
    }

    private void g(String str) {
        HashMap map = new HashMap();
        map.put(c.a("500"), "1");
        map.put(c.a("state_code"), "200");
        map.put(c.a("545"), str);
        map.put(c.a("is_html"), e(str) ? "1" : "2");
        map.put(c.a("request_type"), this.f13612h.f());
        a(a("906002", map));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.nori.model.a aVar = this.f13612h;
        if (aVar == null || aVar.l() == null || this.f13612h.l().isEmpty()) {
            HashMap map = new HashMap();
            map.put(c.a("code"), "500001");
            map.put(c.a("reason"), "Network request model or URLs is null/empty");
            a(a("906002", map));
            return;
        }
        for (String str : this.f13612h.l()) {
            if (!TextUtils.isEmpty(str)) {
                f(c.a(str, this.f13612h.d()));
            }
        }
    }

    private void c(String str) {
        com.mbridge.msdk.config.component.nori.monitor.a aVar = new com.mbridge.msdk.config.component.nori.monitor.a();
        com.mbridge.msdk.config.component.common.network.result.a aVar2 = new com.mbridge.msdk.config.component.common.network.result.a();
        aVar2.a(aVar);
        a aVar3 = new a(str);
        b bVar = new b(this.f13612h.k());
        aVar2.a(bVar);
        bVar.a(aVar2);
        bVar.a(aVar3);
        bVar.d();
        com.mbridge.msdk.config.component.common.network.c cVar = new com.mbridge.msdk.config.component.common.network.c(this.f13612h, aVar2);
        cVar.a(str, aVar3);
        cVar.b();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "906001";
        this.f13612h = new com.mbridge.msdk.config.component.nori.model.a(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        HashMap map = new HashMap();
        if (aVar != null) {
            if (aVar.a() != null) {
                aVar.a().b();
            }
            if (aVar.h()) {
                return;
            }
            aVar.a(true);
            map.put(c.a("500"), aVar.e() + "");
            map.put(c.a("state_code"), aVar.g() + "");
            map.put(c.a("545"), aVar.f());
            map.put(c.a("is_html"), e(aVar.f()) ? "1" : "2");
        }
        map.put(c.a("request_type"), this.f13612h.f());
        a(a("906002", map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        HashMap map = new HashMap();
        map.put(c.a("500"), "2");
        if (aVar != null) {
            if (aVar.a() != null) {
                aVar.a().b();
            }
            if (aVar.h()) {
                return;
            }
            aVar.a(true);
            map.put(c.a("state_code"), aVar.g() + "");
            map.put(c.a("reason"), aVar.d());
            map.put(c.a("code"), Integer.valueOf(aVar.c()));
        }
        map.put(c.a("request_type"), this.f13612h.f());
        a(a("906002", map));
    }

    private boolean d(String str) {
        if (!TextUtils.isEmpty(str) && this.f13612h.c() != null) {
            try {
                return this.f13612h.c().contains(Uri.parse(str).getHost());
            } catch (Exception e10) {
                q0.b("NoriCpt", "Error checking host: " + e10.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        String strF = aVar.f();
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        if (d(strF)) {
            g(strF);
        } else {
            c(strF);
        }
    }
}
