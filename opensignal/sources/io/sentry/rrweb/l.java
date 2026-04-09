package io.sentry.rrweb;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class l extends b implements c2 {
    public double B;
    public ConcurrentHashMap D;
    public HashMap E;
    public ConcurrentHashMap F;
    public ConcurrentHashMap G;

    /* renamed from: g, reason: collision with root package name */
    public String f12719g;

    /* renamed from: r, reason: collision with root package name */
    public String f12720r;

    /* renamed from: x, reason: collision with root package name */
    public String f12721x;

    /* renamed from: y, reason: collision with root package name */
    public double f12722y;

    public l() {
        super(c.Custom);
        this.f12719g = "performanceSpan";
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("type");
        bVar.S(u0Var, this.f12699a);
        bVar.I("timestamp");
        bVar.R(this.f12700d);
        bVar.I("data");
        bVar.C();
        bVar.I("tag");
        bVar.V(this.f12719g);
        bVar.I("payload");
        bVar.C();
        if (this.f12720r != null) {
            bVar.I("op");
            bVar.V(this.f12720r);
        }
        if (this.f12721x != null) {
            bVar.I("description");
            bVar.V(this.f12721x);
        }
        bVar.I("startTimestamp");
        bVar.S(u0Var, BigDecimal.valueOf(this.f12722y));
        bVar.I("endTimestamp");
        bVar.S(u0Var, BigDecimal.valueOf(this.B));
        if (this.D != null) {
            bVar.I("data");
            bVar.S(u0Var, this.D);
        }
        ConcurrentHashMap concurrentHashMap = this.F;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.F, str, bVar, str, u0Var);
            }
        }
        bVar.F();
        ConcurrentHashMap concurrentHashMap2 = this.G;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                h0.b.D(this.G, str2, bVar, str2, u0Var);
            }
        }
        bVar.F();
        HashMap map = this.E;
        if (map != null) {
            for (String str3 : map.keySet()) {
                h0.b.C(this.E, str3, bVar, str3, u0Var);
            }
        }
        bVar.F();
    }
}
