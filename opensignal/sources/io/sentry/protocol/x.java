package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.c5;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class x implements c2 {
    public Integer B;
    public Integer D;
    public String E;
    public String F;
    public Boolean G;
    public String H;
    public Boolean I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public ConcurrentHashMap P;
    public String Q;
    public c5 R;

    /* renamed from: a, reason: collision with root package name */
    public List f12651a;

    /* renamed from: d, reason: collision with root package name */
    public List f12652d;

    /* renamed from: g, reason: collision with root package name */
    public Map f12653g;

    /* renamed from: r, reason: collision with root package name */
    public String f12654r;

    /* renamed from: x, reason: collision with root package name */
    public String f12655x;

    /* renamed from: y, reason: collision with root package name */
    public String f12656y;

    public final boolean equals(Object obj) {
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return Objects.equals(this.f12651a, xVar.f12651a) && Objects.equals(this.f12652d, xVar.f12652d) && Objects.equals(this.f12653g, xVar.f12653g) && Objects.equals(this.f12654r, xVar.f12654r) && Objects.equals(this.f12655x, xVar.f12655x) && Objects.equals(this.f12656y, xVar.f12656y) && Objects.equals(this.B, xVar.B) && Objects.equals(this.D, xVar.D) && Objects.equals(this.E, xVar.E) && Objects.equals(this.F, xVar.F) && Objects.equals(this.G, xVar.G) && Objects.equals(this.H, xVar.H) && Objects.equals(this.I, xVar.I) && Objects.equals(this.J, xVar.J) && Objects.equals(this.K, xVar.K) && Objects.equals(this.L, xVar.L) && Objects.equals(this.M, xVar.M) && Objects.equals(this.N, xVar.N) && Objects.equals(this.O, xVar.O) && Objects.equals(this.P, xVar.P) && Objects.equals(this.Q, xVar.Q) && Objects.equals(this.R, xVar.R);
    }

    public final int hashCode() {
        return Objects.hash(this.f12651a, this.f12652d, this.f12653g, null, this.f12654r, this.f12655x, this.f12656y, this.B, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R);
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12654r != null) {
            bVar.I("filename");
            bVar.V(this.f12654r);
        }
        if (this.f12655x != null) {
            bVar.I("function");
            bVar.V(this.f12655x);
        }
        if (this.f12656y != null) {
            bVar.I("module");
            bVar.V(this.f12656y);
        }
        if (this.B != null) {
            bVar.I("lineno");
            bVar.U(this.B);
        }
        if (this.D != null) {
            bVar.I("colno");
            bVar.U(this.D);
        }
        if (this.E != null) {
            bVar.I("abs_path");
            bVar.V(this.E);
        }
        if (this.F != null) {
            bVar.I("context_line");
            bVar.V(this.F);
        }
        if (this.G != null) {
            bVar.I("in_app");
            bVar.T(this.G);
        }
        if (this.H != null) {
            bVar.I("package");
            bVar.V(this.H);
        }
        if (this.I != null) {
            bVar.I("native");
            bVar.T(this.I);
        }
        if (this.J != null) {
            bVar.I("platform");
            bVar.V(this.J);
        }
        if (this.K != null) {
            bVar.I("image_addr");
            bVar.V(this.K);
        }
        if (this.L != null) {
            bVar.I("symbol_addr");
            bVar.V(this.L);
        }
        if (this.M != null) {
            bVar.I("instruction_addr");
            bVar.V(this.M);
        }
        if (this.N != null) {
            bVar.I("addr_mode");
            bVar.V(this.N);
        }
        if (this.Q != null) {
            bVar.I("raw_function");
            bVar.V(this.Q);
        }
        if (this.O != null) {
            bVar.I("symbol");
            bVar.V(this.O);
        }
        if (this.R != null) {
            bVar.I("lock");
            bVar.S(u0Var, this.R);
        }
        List list = this.f12651a;
        if (list != null && !list.isEmpty()) {
            bVar.I("pre_context");
            bVar.S(u0Var, this.f12651a);
        }
        List list2 = this.f12652d;
        if (list2 != null && !list2.isEmpty()) {
            bVar.I("post_context");
            bVar.S(u0Var, this.f12652d);
        }
        Map map = this.f12653g;
        if (map != null && !map.isEmpty()) {
            bVar.I("vars");
            bVar.S(u0Var, this.f12653g);
        }
        ConcurrentHashMap concurrentHashMap = this.P;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.P, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
