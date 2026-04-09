package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class n implements c2 {
    public ConcurrentHashMap B;
    public Long D;
    public ConcurrentHashMap E;
    public String F;
    public String G;
    public ConcurrentHashMap H;

    /* renamed from: a, reason: collision with root package name */
    public String f12596a;

    /* renamed from: d, reason: collision with root package name */
    public String f12597d;

    /* renamed from: g, reason: collision with root package name */
    public String f12598g;

    /* renamed from: r, reason: collision with root package name */
    public Object f12599r;

    /* renamed from: x, reason: collision with root package name */
    public String f12600x;

    /* renamed from: y, reason: collision with root package name */
    public ConcurrentHashMap f12601y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return ir.f0.s(this.f12596a, nVar.f12596a) && ir.f0.s(this.f12597d, nVar.f12597d) && ir.f0.s(this.f12598g, nVar.f12598g) && ir.f0.s(this.f12600x, nVar.f12600x) && ir.f0.s(this.f12601y, nVar.f12601y) && ir.f0.s(this.B, nVar.B) && ir.f0.s(this.D, nVar.D) && ir.f0.s(this.F, nVar.F) && ir.f0.s(this.G, nVar.G);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12596a, this.f12597d, this.f12598g, this.f12600x, this.f12601y, this.B, this.D, this.F, this.G});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12596a != null) {
            bVar.I("url");
            bVar.V(this.f12596a);
        }
        if (this.f12597d != null) {
            bVar.I("method");
            bVar.V(this.f12597d);
        }
        if (this.f12598g != null) {
            bVar.I("query_string");
            bVar.V(this.f12598g);
        }
        if (this.f12599r != null) {
            bVar.I("data");
            bVar.S(u0Var, this.f12599r);
        }
        if (this.f12600x != null) {
            bVar.I("cookies");
            bVar.V(this.f12600x);
        }
        if (this.f12601y != null) {
            bVar.I("headers");
            bVar.S(u0Var, this.f12601y);
        }
        if (this.B != null) {
            bVar.I("env");
            bVar.S(u0Var, this.B);
        }
        if (this.E != null) {
            bVar.I("other");
            bVar.S(u0Var, this.E);
        }
        if (this.F != null) {
            bVar.I("fragment");
            bVar.S(u0Var, this.F);
        }
        if (this.D != null) {
            bVar.I("body_size");
            bVar.S(u0Var, this.D);
        }
        if (this.G != null) {
            bVar.I("api_target");
            bVar.S(u0Var, this.G);
        }
        ConcurrentHashMap concurrentHashMap = this.H;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.H, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
