package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i implements c2 {
    public Boolean B;
    public String D;
    public String E;
    public ConcurrentHashMap F;

    /* renamed from: a, reason: collision with root package name */
    public String f12570a;

    /* renamed from: d, reason: collision with root package name */
    public Integer f12571d;

    /* renamed from: g, reason: collision with root package name */
    public String f12572g;

    /* renamed from: r, reason: collision with root package name */
    public String f12573r;

    /* renamed from: x, reason: collision with root package name */
    public Integer f12574x;

    /* renamed from: y, reason: collision with root package name */
    public String f12575y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (ir.f0.s(this.f12570a, iVar.f12570a) && ir.f0.s(this.f12571d, iVar.f12571d) && ir.f0.s(this.f12572g, iVar.f12572g) && ir.f0.s(this.f12573r, iVar.f12573r) && ir.f0.s(this.f12574x, iVar.f12574x) && ir.f0.s(this.f12575y, iVar.f12575y) && ir.f0.s(this.B, iVar.B) && ir.f0.s(this.D, iVar.D) && ir.f0.s(this.E, iVar.E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12570a, this.f12571d, this.f12572g, this.f12573r, this.f12574x, this.f12575y, this.B, this.D, this.E});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12570a != null) {
            bVar.I("name");
            bVar.V(this.f12570a);
        }
        if (this.f12571d != null) {
            bVar.I("id");
            bVar.U(this.f12571d);
        }
        if (this.f12572g != null) {
            bVar.I("vendor_id");
            bVar.V(this.f12572g);
        }
        if (this.f12573r != null) {
            bVar.I("vendor_name");
            bVar.V(this.f12573r);
        }
        if (this.f12574x != null) {
            bVar.I("memory_size");
            bVar.U(this.f12574x);
        }
        if (this.f12575y != null) {
            bVar.I("api_type");
            bVar.V(this.f12575y);
        }
        if (this.B != null) {
            bVar.I("multi_threaded_rendering");
            bVar.T(this.B);
        }
        if (this.D != null) {
            bVar.I("version");
            bVar.V(this.D);
        }
        if (this.E != null) {
            bVar.I("npot_support");
            bVar.V(this.E);
        }
        ConcurrentHashMap concurrentHashMap = this.F;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.F, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
