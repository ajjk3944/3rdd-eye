package io.sentry.okhttp;

import br.l;
import io.sentry.c4;
import io.sentry.i1;
import io.sentry.k4;
import io.sentry.o6;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import ou.a0;
import ou.c0;
import ou.p;
import ou.r;
import ou.t;
import ou.z;
import su.i;
import su.k;

/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f12475d = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final as.d f12476b;

    /* renamed from: c, reason: collision with root package name */
    public p f12477c;

    public e(io.sentry.android.replay.capture.e eVar) {
        l.e(eVar, "originalEventListenerFactory");
        this.f12476b = new as.d(24, eVar);
    }

    @Override // ou.p
    public final void A(i iVar, c0 c0Var) {
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.A(iVar, c0Var);
        }
    }

    @Override // ou.p
    public final void B(i iVar, r rVar) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.B(iVar, rVar);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.b("http.connect.secure_connect_ms", null);
        }
    }

    @Override // ou.p
    public final void C(i iVar) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.C(iVar);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.c("http.connect.secure_connect_ms");
        }
    }

    public final boolean D() {
        p pVar = this.f12477c;
        if (pVar instanceof e) {
            return false;
        }
        return !"io.sentry.android.okhttp.SentryOkHttpEventListener".equals(pVar != null ? pVar.getClass().getName() : null);
    }

    @Override // ou.p
    public final void a(i iVar, c0 c0Var) {
        l.e(c0Var, "cachedResponse");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.a(iVar, c0Var);
        }
    }

    @Override // ou.p
    public final void b(i iVar, c0 c0Var) {
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.b(iVar, c0Var);
        }
    }

    @Override // ou.p
    public final void c(i iVar) {
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.c(iVar);
        }
    }

    @Override // ou.p
    public final void d(i iVar) {
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.d(iVar);
        }
        a aVar = (a) f12475d.remove(iVar);
        if (aVar == null) {
            return;
        }
        aVar.a(null);
    }

    @Override // ou.p
    public final void e(i iVar, IOException iOException) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.e(iVar, iOException);
        }
        if (D() && (aVar = (a) f12475d.remove(iVar)) != null) {
            aVar.d(iOException.getMessage());
            aVar.a(new b(iOException, 0));
        }
    }

    @Override // ou.p
    public final void f(i iVar) {
        p pVar = (p) this.f12476b.a(iVar);
        this.f12477c = pVar;
        pVar.f(iVar);
        if (D()) {
            f12475d.put(iVar, new a(iVar.f22336d));
        }
    }

    @Override // ou.p
    public final void g(i iVar) {
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.g(iVar);
        }
    }

    @Override // ou.p
    public final void h(i iVar, InetSocketAddress inetSocketAddress, Proxy proxy, z zVar) {
        a aVar;
        l.e(inetSocketAddress, "inetSocketAddress");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.h(iVar, inetSocketAddress, proxy, zVar);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            String strName = zVar != null ? zVar.name() : null;
            if (strName != null) {
                aVar.f12461c.b(strName, "protocol");
                i1 i1Var = aVar.f12462d;
                if (i1Var != null) {
                    i1Var.l(strName, "protocol");
                }
            }
            aVar.b("http.connect_ms", null);
        }
    }

    @Override // ou.p
    public final void i(i iVar, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        a aVar;
        l.e(inetSocketAddress, "inetSocketAddress");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.i(iVar, inetSocketAddress, proxy, iOException);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.d(iOException.getMessage());
            i1 i1Var = aVar.f12462d;
            k4 k4Var = (k4) aVar.f12460b.remove("http.connect_ms");
            if (k4Var == null || i1Var == null) {
                return;
            }
            i1Var.f(iOException);
            i1Var.a(o6.INTERNAL_ERROR);
            i1Var.l(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(c4.c().k().getDateProvider().a().b(k4Var))), "http.connect_ms");
        }
    }

    @Override // ou.p
    public final void j(i iVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        a aVar;
        l.e(inetSocketAddress, "inetSocketAddress");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.j(iVar, inetSocketAddress, proxy);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.c("http.connect_ms");
        }
    }

    @Override // ou.p
    public final void k(i iVar, k kVar) {
        a aVar;
        l.e(kVar, "connection");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.k(iVar, kVar);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.c("http.connection_ms");
        }
    }

    @Override // ou.p
    public final void l(i iVar, k kVar) {
        a aVar;
        l.e(kVar, "connection");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.l(iVar, kVar);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.b("http.connection_ms", null);
        }
    }

    @Override // ou.p
    public final void m(i iVar, String str, List list) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.m(iVar, str, list);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.b("http.client.resolve_dns_ms", new c7.b(str, 12, list));
        }
    }

    @Override // ou.p
    public final void n(i iVar, String str) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.n(iVar, str);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.c("http.client.resolve_dns_ms");
        }
    }

    @Override // ou.p
    public final void o(i iVar, t tVar, List list) {
        a aVar;
        l.e(tVar, "url");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.o(iVar, tVar, list);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.b("http.client.proxy_select_ms", new as.d(25, list));
        }
    }

    @Override // ou.p
    public final void p(i iVar, t tVar) {
        a aVar;
        l.e(tVar, "url");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.p(iVar, tVar);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.c("http.client.proxy_select_ms");
        }
    }

    @Override // ou.p
    public final void q(i iVar, long j) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.q(iVar, j);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.b("http.connection.request_body_ms", new d(0, j));
            if (j > -1) {
                aVar.f12461c.b(Long.valueOf(j), "request_content_length");
                i1 i1Var = aVar.f12462d;
                if (i1Var != null) {
                    i1Var.l(Long.valueOf(j), "http.request_content_length");
                }
            }
        }
    }

    @Override // ou.p
    public final void r(i iVar) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.r(iVar);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.c("http.connection.request_body_ms");
        }
    }

    @Override // ou.p
    public final void s(i iVar, IOException iOException) {
        a aVar;
        l.e(iOException, "ioe");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.s(iVar, iOException);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.d(iOException.getMessage());
            aVar.b("http.connection.request_headers_ms", new b(iOException, 1));
            i1 i1Var = aVar.f12462d;
            k4 k4Var = (k4) aVar.f12460b.remove("http.connection.request_body_ms");
            if (k4Var == null || i1Var == null) {
                return;
            }
            i1Var.a(o6.INTERNAL_ERROR);
            i1Var.f(iOException);
            i1Var.l(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(c4.c().k().getDateProvider().a().b(k4Var))), "http.connection.request_body_ms");
        }
    }

    @Override // ou.p
    public final void t(i iVar, a0 a0Var) {
        a aVar;
        l.e(a0Var, "request");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.t(iVar, a0Var);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.b("http.connection.request_headers_ms", null);
        }
    }

    @Override // ou.p
    public final void u(i iVar) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.u(iVar);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.c("http.connection.request_headers_ms");
        }
    }

    @Override // ou.p
    public final void v(i iVar, long j) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.v(iVar, j);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            if (j > -1) {
                aVar.f12461c.b(Long.valueOf(j), "response_content_length");
                i1 i1Var = aVar.f12462d;
                if (i1Var != null) {
                    i1Var.l(Long.valueOf(j), "http.response_content_length");
                }
            }
            aVar.b("http.connection.response_body_ms", new d(1, j));
        }
    }

    @Override // ou.p
    public final void w(i iVar) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.w(iVar);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.c("http.connection.response_body_ms");
        }
    }

    @Override // ou.p
    public final void x(i iVar, IOException iOException) {
        a aVar;
        l.e(iOException, "ioe");
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.x(iVar, iOException);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.d(iOException.getMessage());
            aVar.b("http.connection.response_headers_ms", new b(iOException, 2));
            i1 i1Var = aVar.f12462d;
            k4 k4Var = (k4) aVar.f12460b.remove("http.connection.response_body_ms");
            if (k4Var == null || i1Var == null) {
                return;
            }
            i1Var.a(o6.INTERNAL_ERROR);
            i1Var.f(iOException);
            i1Var.l(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(c4.c().k().getDateProvider().a().b(k4Var))), "http.connection.response_body_ms");
        }
    }

    @Override // ou.p
    public final void y(i iVar, c0 c0Var) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.y(iVar, c0Var);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.f12463e = c0Var;
            io.sentry.e eVar = aVar.f12461c;
            z zVar = c0Var.f19885d;
            eVar.b(zVar.name(), "protocol");
            int i10 = c0Var.f19887r;
            eVar.b(Integer.valueOf(i10), "status_code");
            i1 i1Var = aVar.f12462d;
            if (i1Var != null) {
                i1Var.l(zVar.name(), "protocol");
            }
            if (i1Var != null) {
                i1Var.l(Integer.valueOf(i10), "http.response.status_code");
            }
            aVar.b("http.connection.response_headers_ms", new as.d(26, c0Var));
        }
    }

    @Override // ou.p
    public final void z(i iVar) {
        a aVar;
        p pVar = this.f12477c;
        if (pVar != null) {
            pVar.z(iVar);
        }
        if (D() && (aVar = (a) f12475d.get(iVar)) != null) {
            aVar.c("http.connection.response_headers_ms");
        }
    }
}
