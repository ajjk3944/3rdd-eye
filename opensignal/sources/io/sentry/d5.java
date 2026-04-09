package io.sentry;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d5 implements c2 {
    public HashMap B;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.t f12191a;

    /* renamed from: d, reason: collision with root package name */
    public final Double f12192d;

    /* renamed from: g, reason: collision with root package name */
    public final String f12193g;

    /* renamed from: r, reason: collision with root package name */
    public final f5 f12194r;

    /* renamed from: x, reason: collision with root package name */
    public Integer f12195x;

    /* renamed from: y, reason: collision with root package name */
    public Map f12196y;

    public d5(io.sentry.protocol.t tVar, Double d6, String str, f5 f5Var) {
        this.f12191a = tVar;
        this.f12192d = d6;
        this.f12193g = str;
        this.f12194r = f5Var;
    }

    public final void a(String str, io.sentry.protocol.j jVar) {
        if (this.f12196y == null) {
            this.f12196y = new HashMap();
        }
        this.f12196y.put(str, jVar);
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("timestamp");
        bVar.S(u0Var, BigDecimal.valueOf(this.f12192d.doubleValue()).setScale(6, RoundingMode.DOWN));
        bVar.I("trace_id");
        bVar.S(u0Var, this.f12191a);
        bVar.I("body");
        bVar.V(this.f12193g);
        bVar.I("level");
        bVar.S(u0Var, this.f12194r);
        if (this.f12195x != null) {
            bVar.I("severity_number");
            bVar.S(u0Var, this.f12195x);
        }
        if (this.f12196y != null) {
            bVar.I("attributes");
            bVar.S(u0Var, this.f12196y);
        }
        HashMap map = this.B;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.B, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
