package io.sentry;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final com.squareup.picasso.c f12091i = new com.squareup.picasso.c(7);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f12092a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f12093b;

    /* renamed from: c, reason: collision with root package name */
    public Double f12094c;

    /* renamed from: d, reason: collision with root package name */
    public Double f12095d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12096e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12097f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12098g;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f12099h;

    public c(u0 u0Var) {
        this(new ConcurrentHashMap(), null, null, null, false, u0Var);
    }

    public static String b(Double d6) {
        if (lf.t1.z(d6, false)) {
            return ((DecimalFormat) f12091i.get()).format(d6);
        }
        return null;
    }

    public final String a(String str) {
        return (String) this.f12092a.get(str);
    }

    public final void c(String str, String str2) {
        if (this.f12097f) {
            ConcurrentHashMap concurrentHashMap = this.f12092a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    public final void d(io.sentry.protocol.t tVar, io.sentry.protocol.t tVar2, x5 x5Var, cj.a aVar, String str, io.sentry.protocol.c0 c0Var) {
        c("sentry-trace_id", tVar.toString());
        c("sentry-public_key", x5Var.retrieveParsedDsn().f12871b);
        c("sentry-release", x5Var.getRelease());
        c("sentry-environment", x5Var.getEnvironment());
        if (c0Var == null || io.sentry.protocol.c0.URL.equals(c0Var)) {
            str = null;
        }
        c("sentry-transaction", str);
        if (tVar2 != null && !io.sentry.protocol.t.f12636d.equals(tVar2)) {
            c("sentry-replay_id", tVar2.toString());
        }
        Double d6 = aVar == null ? null : (Double) aVar.f3975g;
        if (this.f12097f) {
            this.f12094c = d6;
        }
        Boolean bool = aVar == null ? null : (Boolean) aVar.f3974d;
        c("sentry-sampled", bool == null ? null : bool.toString());
        Double d10 = aVar != null ? (Double) aVar.f3976r : null;
        if (this.f12097f) {
            this.f12095d = d10;
        }
    }

    public final q6 e() {
        String strA = a("sentry-trace_id");
        String strA2 = a("sentry-replay_id");
        String strA3 = a("sentry-public_key");
        if (strA == null || strA3 == null) {
            return null;
        }
        q6 q6Var = new q6(new io.sentry.protocol.t(strA), strA3, a("sentry-release"), a("sentry-environment"), a("sentry-user_id"), a("sentry-transaction"), b(this.f12094c), a("sentry-sampled"), strA2 != null ? new io.sentry.protocol.t(strA2) : null, b(this.f12095d));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        q qVarA = this.f12093b.a();
        try {
            for (Map.Entry entry : this.f12092a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!b.f12066a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            qVarA.close();
            q6Var.G = concurrentHashMap;
            return q6Var;
        } finally {
        }
    }

    public c(ConcurrentHashMap concurrentHashMap, Double d6, Double d10, String str, boolean z10, u0 u0Var) {
        this.f12093b = new io.sentry.util.a();
        this.f12092a = concurrentHashMap;
        this.f12094c = d6;
        this.f12095d = d10;
        this.f12099h = u0Var;
        this.f12096e = str;
        this.f12097f = true;
        this.f12098g = z10;
    }
}
