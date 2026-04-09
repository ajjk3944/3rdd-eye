package io.sentry.rrweb;

import io.sentry.b5;
import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a extends b implements c2 {
    public String B;
    public b5 D;
    public ConcurrentHashMap E;
    public HashMap F;
    public ConcurrentHashMap G;
    public ConcurrentHashMap H;

    /* renamed from: g, reason: collision with root package name */
    public String f12695g;

    /* renamed from: r, reason: collision with root package name */
    public double f12696r;

    /* renamed from: x, reason: collision with root package name */
    public String f12697x;

    /* renamed from: y, reason: collision with root package name */
    public String f12698y;

    public a() {
        super(c.Custom);
        this.f12695g = "breadcrumb";
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
        bVar.V(this.f12695g);
        bVar.I("payload");
        bVar.C();
        if (this.f12697x != null) {
            bVar.I("type");
            bVar.V(this.f12697x);
        }
        bVar.I("timestamp");
        bVar.S(u0Var, BigDecimal.valueOf(this.f12696r));
        if (this.f12698y != null) {
            bVar.I("category");
            bVar.V(this.f12698y);
        }
        if (this.B != null) {
            bVar.I("message");
            bVar.V(this.B);
        }
        if (this.D != null) {
            bVar.I("level");
            bVar.S(u0Var, this.D);
        }
        if (this.E != null) {
            bVar.I("data");
            bVar.S(u0Var, this.E);
        }
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.G, str, bVar, str, u0Var);
            }
        }
        bVar.F();
        ConcurrentHashMap concurrentHashMap2 = this.H;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                h0.b.D(this.H, str2, bVar, str2, u0Var);
            }
        }
        bVar.F();
        HashMap map = this.F;
        if (map != null) {
            for (String str3 : map.keySet()) {
                h0.b.C(this.F, str3, bVar, str3, u0Var);
            }
        }
        bVar.F();
    }
}
