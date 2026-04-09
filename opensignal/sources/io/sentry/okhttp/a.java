package io.sentry.okhttp;

import ar.k;
import br.l;
import io.sentry.c4;
import io.sentry.h0;
import io.sentry.i1;
import io.sentry.k4;
import io.sentry.k6;
import io.sentry.util.g;
import io.sentry.v3;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ou.a0;
import ou.c0;
import ou.t;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f12459a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12460b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.e f12461c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f12462d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f12463e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f12464f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f12465g;

    /* renamed from: h, reason: collision with root package name */
    public String f12466h;

    /* renamed from: i, reason: collision with root package name */
    public String f12467i;

    public a(a0 a0Var) {
        l.e(a0Var, "request");
        this.f12459a = a0Var;
        this.f12460b = new ConcurrentHashMap();
        this.f12465g = new AtomicBoolean(false);
        String str = (String) vc.e.D(a0Var.f19860a.f19974h).f12397d;
        this.f12466h = str == null ? "unknown" : str;
        this.f12467i = a0Var.f19861b;
        i1 i1VarL = g.f12810a ? c4.c().l() : c4.c().h();
        i1 i1VarQ = i1VarL != null ? i1VarL.q("http.client") : null;
        this.f12462d = i1VarQ;
        k6 k6VarT = i1VarQ != null ? i1VarQ.t() : null;
        if (k6VarT != null) {
            k6VarT.E = "auto.http.okhttp";
        }
        io.sentry.e eVar = new io.sentry.e();
        eVar.f12204x = "http";
        eVar.B = "http";
        eVar.b(Long.valueOf(System.currentTimeMillis()), "http.start_timestamp");
        this.f12461c = eVar;
        e(a0Var);
    }

    public final void a(b bVar) {
        if (this.f12465g.getAndSet(true)) {
            return;
        }
        this.f12460b.clear();
        h0 h0Var = new h0();
        h0Var.c(this.f12459a, "okHttp:request");
        c0 c0Var = this.f12463e;
        if (c0Var != null) {
            h0Var.c(c0Var, "okHttp:response");
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        io.sentry.e eVar = this.f12461c;
        eVar.b(lValueOf, "http.end_timestamp");
        v3 v3Var = v3.f12830a;
        v3Var.g(eVar, h0Var);
        i1 i1Var = this.f12462d;
        if (i1Var != null && bVar != null) {
            bVar.a(i1Var);
        }
        c0 c0Var2 = this.f12464f;
        if (c0Var2 != null) {
            a.a.f(v3Var, c0Var2.f19884a, c0Var2);
        }
        if (i1Var != null) {
            i1Var.k();
        }
    }

    public final void b(String str, k kVar) {
        i1 i1Var;
        k4 k4Var = (k4) this.f12460b.remove(str);
        if (k4Var == null || (i1Var = this.f12462d) == null) {
            return;
        }
        if (kVar != null) {
            kVar.a(i1Var);
        }
        i1Var.l(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(c4.c().k().getDateProvider().a().b(k4Var))), str);
    }

    public final void c(String str) {
        if (this.f12462d == null) {
            return;
        }
        k4 k4VarA = c4.c().k().getDateProvider().a();
        l.d(k4VarA, "now(...)");
        this.f12460b.put(str, k4VarA);
    }

    public final void d(String str) {
        if (str != null) {
            this.f12461c.b(str, "error_message");
            i1 i1Var = this.f12462d;
            if (i1Var != null) {
                i1Var.l(str, "error_message");
            }
        }
    }

    public final void e(a0 a0Var) {
        l.e(a0Var, "request");
        t tVar = a0Var.f19860a;
        io.sentry.k kVarD = vc.e.D(tVar.f19974h);
        String str = (String) kVarD.f12399r;
        String str2 = (String) kVarD.f12398g;
        String str3 = (String) kVarD.f12397d;
        this.f12466h = str3 == null ? "unknown" : str3;
        String str4 = tVar.f19970d;
        String strB = tVar.b();
        this.f12467i = a0Var.f19861b;
        i1 i1Var = this.f12462d;
        if (i1Var != null) {
            i1Var.o(this.f12467i + ' ' + this.f12466h);
        }
        if (i1Var != null) {
            if (str2 != null) {
                i1Var.l(str2, "http.query");
            }
            if (str != null) {
                i1Var.l(str, "http.fragment");
            }
        }
        io.sentry.e eVar = this.f12461c;
        eVar.b(str4, "host");
        eVar.b(strB, "path");
        if (str3 != null) {
            eVar.b(str3, "url");
        }
        String str5 = this.f12467i;
        Locale locale = Locale.ROOT;
        String upperCase = str5.toUpperCase(locale);
        l.d(upperCase, "toUpperCase(...)");
        eVar.b(upperCase, "method");
        if (str2 != null) {
            eVar.b(str2, "http.query");
        }
        if (str != null) {
            eVar.b(str, "http.fragment");
        }
        if (i1Var != null) {
            i1Var.l(this.f12466h, "url");
        }
        if (i1Var != null) {
            i1Var.l(str4, "host");
        }
        if (i1Var != null) {
            i1Var.l(strB, "path");
        }
        if (i1Var != null) {
            String upperCase2 = this.f12467i.toUpperCase(locale);
            l.d(upperCase2, "toUpperCase(...)");
            i1Var.l(upperCase2, "http.request.method");
        }
    }
}
