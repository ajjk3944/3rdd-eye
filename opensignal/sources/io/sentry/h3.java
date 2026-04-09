package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h3 implements c2 {
    public Long B;
    public ConcurrentHashMap D;

    /* renamed from: a, reason: collision with root package name */
    public String f12301a;

    /* renamed from: d, reason: collision with root package name */
    public String f12302d;

    /* renamed from: g, reason: collision with root package name */
    public String f12303g;

    /* renamed from: r, reason: collision with root package name */
    public Long f12304r;

    /* renamed from: x, reason: collision with root package name */
    public Long f12305x;

    /* renamed from: y, reason: collision with root package name */
    public Long f12306y;

    public h3(k1 k1Var, Long l10, Long l11) {
        this.f12301a = k1Var.p().toString();
        this.f12302d = k1Var.t().f12412a.toString();
        this.f12303g = k1Var.getName().isEmpty() ? "unknown" : k1Var.getName();
        this.f12304r = l10;
        this.f12306y = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h3.class != obj.getClass()) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return this.f12301a.equals(h3Var.f12301a) && this.f12302d.equals(h3Var.f12302d) && this.f12303g.equals(h3Var.f12303g) && this.f12304r.equals(h3Var.f12304r) && this.f12306y.equals(h3Var.f12306y) && ir.f0.s(this.B, h3Var.B) && ir.f0.s(this.f12305x, h3Var.f12305x) && ir.f0.s(this.D, h3Var.D);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12301a, this.f12302d, this.f12303g, this.f12304r, this.f12305x, this.f12306y, this.B, this.D});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("id");
        bVar.S(u0Var, this.f12301a);
        bVar.I("trace_id");
        bVar.S(u0Var, this.f12302d);
        bVar.I("name");
        bVar.S(u0Var, this.f12303g);
        bVar.I("relative_start_ns");
        bVar.S(u0Var, this.f12304r);
        bVar.I("relative_end_ns");
        bVar.S(u0Var, this.f12305x);
        bVar.I("relative_cpu_start_ms");
        bVar.S(u0Var, this.f12306y);
        bVar.I("relative_cpu_end_ms");
        bVar.S(u0Var, this.B);
        ConcurrentHashMap concurrentHashMap = this.D;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.D, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
