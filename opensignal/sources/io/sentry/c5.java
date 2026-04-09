package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c5 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12113a;

    /* renamed from: d, reason: collision with root package name */
    public String f12114d;

    /* renamed from: g, reason: collision with root package name */
    public String f12115g;

    /* renamed from: r, reason: collision with root package name */
    public String f12116r;

    /* renamed from: x, reason: collision with root package name */
    public Long f12117x;

    /* renamed from: y, reason: collision with root package name */
    public ConcurrentHashMap f12118y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c5.class != obj.getClass()) {
            return false;
        }
        return ir.f0.s(this.f12114d, ((c5) obj).f12114d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12114d});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("type");
        bVar.R(this.f12113a);
        if (this.f12114d != null) {
            bVar.I("address");
            bVar.V(this.f12114d);
        }
        if (this.f12115g != null) {
            bVar.I("package_name");
            bVar.V(this.f12115g);
        }
        if (this.f12116r != null) {
            bVar.I("class_name");
            bVar.V(this.f12116r);
        }
        if (this.f12117x != null) {
            bVar.I("thread_id");
            bVar.U(this.f12117x);
        }
        ConcurrentHashMap concurrentHashMap = this.f12118y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12118y, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
