package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e0 implements c2 {
    public ConcurrentHashMap B;
    public ConcurrentHashMap D;

    /* renamed from: a, reason: collision with root package name */
    public String f12534a;

    /* renamed from: d, reason: collision with root package name */
    public String f12535d;

    /* renamed from: g, reason: collision with root package name */
    public String f12536g;

    /* renamed from: r, reason: collision with root package name */
    public String f12537r;

    /* renamed from: x, reason: collision with root package name */
    public String f12538x;

    /* renamed from: y, reason: collision with root package name */
    public h f12539y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (ir.f0.s(this.f12534a, e0Var.f12534a) && ir.f0.s(this.f12535d, e0Var.f12535d) && ir.f0.s(this.f12536g, e0Var.f12536g) && ir.f0.s(this.f12537r, e0Var.f12537r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12534a, this.f12535d, this.f12536g, this.f12537r});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12534a != null) {
            bVar.I("email");
            bVar.V(this.f12534a);
        }
        if (this.f12535d != null) {
            bVar.I("id");
            bVar.V(this.f12535d);
        }
        if (this.f12536g != null) {
            bVar.I("username");
            bVar.V(this.f12536g);
        }
        if (this.f12537r != null) {
            bVar.I("ip_address");
            bVar.V(this.f12537r);
        }
        if (this.f12538x != null) {
            bVar.I("name");
            bVar.V(this.f12538x);
        }
        if (this.f12539y != null) {
            bVar.I("geo");
            this.f12539y.serialize(bVar, u0Var);
        }
        if (this.B != null) {
            bVar.I("data");
            bVar.S(u0Var, this.B);
        }
        ConcurrentHashMap concurrentHashMap = this.D;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.D, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
