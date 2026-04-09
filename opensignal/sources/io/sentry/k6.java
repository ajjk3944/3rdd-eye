package io.sentry;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class k6 implements c2 {
    public o6 B;
    public ConcurrentHashMap D;
    public String E;
    public Map F;
    public ConcurrentHashMap G;
    public p1 H;
    public c I;
    public final io.sentry.protocol.t J;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.t f12412a;

    /* renamed from: d, reason: collision with root package name */
    public final n6 f12413d;

    /* renamed from: g, reason: collision with root package name */
    public final n6 f12414g;

    /* renamed from: r, reason: collision with root package name */
    public transient cj.a f12415r;

    /* renamed from: x, reason: collision with root package name */
    public final String f12416x;

    /* renamed from: y, reason: collision with root package name */
    public String f12417y;

    public k6(io.sentry.protocol.t tVar, n6 n6Var, String str, n6 n6Var2) {
        this(tVar, n6Var, n6Var2, str, null, null, null, "manual");
    }

    public final void a(cj.a aVar) {
        this.f12415r = aVar;
        c cVar = this.I;
        if (cVar == null || aVar == null) {
            return;
        }
        Boolean bool = (Boolean) aVar.f3974d;
        Charset charset = io.sentry.util.k.f12817a;
        cVar.c("sentry-sampled", bool == null ? null : bool.toString());
        Double d6 = (Double) aVar.f3976r;
        if (d6 != null && cVar.f12097f) {
            cVar.f12095d = d6;
        }
        Double d10 = (Double) aVar.f3975g;
        if (d10 != null) {
            cVar.f12094c = d10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return this.f12412a.equals(k6Var.f12412a) && this.f12413d.equals(k6Var.f12413d) && ir.f0.s(this.f12414g, k6Var.f12414g) && this.f12416x.equals(k6Var.f12416x) && ir.f0.s(this.f12417y, k6Var.f12417y) && this.B == k6Var.B;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12412a, this.f12413d, this.f12414g, this.f12416x, this.f12417y, this.B});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("trace_id");
        this.f12412a.serialize(bVar, u0Var);
        bVar.I("span_id");
        this.f12413d.serialize(bVar, u0Var);
        n6 n6Var = this.f12414g;
        if (n6Var != null) {
            bVar.I("parent_span_id");
            n6Var.serialize(bVar, u0Var);
        }
        bVar.I("op");
        bVar.V(this.f12416x);
        if (this.f12417y != null) {
            bVar.I("description");
            bVar.V(this.f12417y);
        }
        if (this.B != null) {
            bVar.I("status");
            bVar.S(u0Var, this.B);
        }
        if (this.E != null) {
            bVar.I("origin");
            bVar.S(u0Var, this.E);
        }
        if (!this.D.isEmpty()) {
            bVar.I("tags");
            bVar.S(u0Var, this.D);
        }
        if (!this.F.isEmpty()) {
            bVar.I("data");
            bVar.S(u0Var, this.F);
        }
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.G, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }

    public k6(io.sentry.protocol.t tVar, n6 n6Var, n6 n6Var2, String str, String str2, cj.a aVar, o6 o6Var, String str3) {
        this.D = new ConcurrentHashMap();
        this.E = "manual";
        this.F = new ConcurrentHashMap();
        this.H = p1.SENTRY;
        this.J = io.sentry.protocol.t.f12636d;
        ir.f0.T(tVar, "traceId is required");
        this.f12412a = tVar;
        ir.f0.T(n6Var, "spanId is required");
        this.f12413d = n6Var;
        ir.f0.T(str, "operation is required");
        this.f12416x = str;
        this.f12414g = n6Var2;
        this.f12417y = str2;
        this.B = o6Var;
        this.E = str3;
        a(aVar);
        io.sentry.util.thread.a threadChecker = c4.c().k().getThreadChecker();
        this.F.put("thread.id", String.valueOf(threadChecker.b()));
        this.F.put("thread.name", threadChecker.a());
    }

    public k6(k6 k6Var) {
        this.D = new ConcurrentHashMap();
        this.E = "manual";
        this.F = new ConcurrentHashMap();
        this.H = p1.SENTRY;
        this.J = io.sentry.protocol.t.f12636d;
        this.f12412a = k6Var.f12412a;
        this.f12413d = k6Var.f12413d;
        this.f12414g = k6Var.f12414g;
        a(k6Var.f12415r);
        this.f12416x = k6Var.f12416x;
        this.f12417y = k6Var.f12417y;
        this.B = k6Var.B;
        ConcurrentHashMap concurrentHashMapO = com.google.android.gms.internal.measurement.b4.O(k6Var.D);
        if (concurrentHashMapO != null) {
            this.D = concurrentHashMapO;
        }
        ConcurrentHashMap concurrentHashMapO2 = com.google.android.gms.internal.measurement.b4.O(k6Var.G);
        if (concurrentHashMapO2 != null) {
            this.G = concurrentHashMapO2;
        }
        this.I = k6Var.I;
        ConcurrentHashMap concurrentHashMapO3 = com.google.android.gms.internal.measurement.b4.O(k6Var.F);
        if (concurrentHashMapO3 != null) {
            this.F = concurrentHashMapO3;
        }
    }
}
