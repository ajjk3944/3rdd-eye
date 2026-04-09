package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class l3 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f12422a;

    /* renamed from: d, reason: collision with root package name */
    public List f12423d;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f12424g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l3.class == obj.getClass()) {
            l3 l3Var = (l3) obj;
            if (ir.f0.s(this.f12422a, l3Var.f12422a) && ir.f0.s(this.f12423d, l3Var.f12423d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12422a, this.f12423d});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) bVar.f11196a;
        if (this.f12422a != null) {
            bVar.I("segment_id");
            bVar.U(this.f12422a);
        }
        HashMap map = this.f12424g;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12424g, str, bVar, str, u0Var);
            }
        }
        bVar.F();
        cVar.f12849y = true;
        if (this.f12422a != null) {
            cVar.y();
            cVar.b();
            cVar.f12844a.append((CharSequence) "\n");
        }
        List list = this.f12423d;
        if (list != null) {
            bVar.S(u0Var, list);
        }
        cVar.f12849y = false;
    }
}
