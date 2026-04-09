package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a implements c2 {
    public String B;
    public AbstractMap D;
    public List E;
    public String F;
    public Boolean G;
    public Boolean H;
    public List I;
    public ConcurrentHashMap J;

    /* renamed from: a, reason: collision with root package name */
    public String f12517a;

    /* renamed from: d, reason: collision with root package name */
    public Date f12518d;

    /* renamed from: g, reason: collision with root package name */
    public String f12519g;

    /* renamed from: r, reason: collision with root package name */
    public String f12520r;

    /* renamed from: x, reason: collision with root package name */
    public String f12521x;

    /* renamed from: y, reason: collision with root package name */
    public String f12522y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return ir.f0.s(this.f12517a, aVar.f12517a) && ir.f0.s(this.f12518d, aVar.f12518d) && ir.f0.s(this.f12519g, aVar.f12519g) && ir.f0.s(this.f12520r, aVar.f12520r) && ir.f0.s(this.f12521x, aVar.f12521x) && ir.f0.s(this.f12522y, aVar.f12522y) && ir.f0.s(this.B, aVar.B) && ir.f0.s(this.D, aVar.D) && ir.f0.s(this.G, aVar.G) && ir.f0.s(this.E, aVar.E) && ir.f0.s(this.F, aVar.F) && ir.f0.s(this.H, aVar.H) && ir.f0.s(this.I, aVar.I);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12517a, this.f12518d, this.f12519g, this.f12520r, this.f12521x, this.f12522y, this.B, this.D, this.G, this.E, this.F, this.H, this.I});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12517a != null) {
            bVar.I("app_identifier");
            bVar.V(this.f12517a);
        }
        if (this.f12518d != null) {
            bVar.I("app_start_time");
            bVar.S(u0Var, this.f12518d);
        }
        if (this.f12519g != null) {
            bVar.I("device_app_hash");
            bVar.V(this.f12519g);
        }
        if (this.f12520r != null) {
            bVar.I("build_type");
            bVar.V(this.f12520r);
        }
        if (this.f12521x != null) {
            bVar.I("app_name");
            bVar.V(this.f12521x);
        }
        if (this.f12522y != null) {
            bVar.I("app_version");
            bVar.V(this.f12522y);
        }
        if (this.B != null) {
            bVar.I("app_build");
            bVar.V(this.B);
        }
        AbstractMap abstractMap = this.D;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            bVar.I("permissions");
            bVar.S(u0Var, this.D);
        }
        if (this.G != null) {
            bVar.I("in_foreground");
            bVar.T(this.G);
        }
        if (this.E != null) {
            bVar.I("view_names");
            bVar.S(u0Var, this.E);
        }
        if (this.F != null) {
            bVar.I("start_type");
            bVar.V(this.F);
        }
        if (this.H != null) {
            bVar.I("is_split_apks");
            bVar.T(this.H);
        }
        List list = this.I;
        if (list != null && !list.isEmpty()) {
            bVar.I("split_names");
            bVar.S(u0Var, this.I);
        }
        ConcurrentHashMap concurrentHashMap = this.J;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.J, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
