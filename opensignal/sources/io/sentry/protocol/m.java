package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class m implements c2 {
    public ConcurrentHashMap B;

    /* renamed from: a, reason: collision with root package name */
    public String f12590a;

    /* renamed from: d, reason: collision with root package name */
    public String f12591d;

    /* renamed from: g, reason: collision with root package name */
    public String f12592g;

    /* renamed from: r, reason: collision with root package name */
    public String f12593r;

    /* renamed from: x, reason: collision with root package name */
    public String f12594x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f12595y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (ir.f0.s(this.f12590a, mVar.f12590a) && ir.f0.s(this.f12591d, mVar.f12591d) && ir.f0.s(this.f12592g, mVar.f12592g) && ir.f0.s(this.f12593r, mVar.f12593r) && ir.f0.s(this.f12594x, mVar.f12594x) && ir.f0.s(this.f12595y, mVar.f12595y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12590a, this.f12591d, this.f12592g, this.f12593r, this.f12594x, this.f12595y});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12590a != null) {
            bVar.I("name");
            bVar.V(this.f12590a);
        }
        if (this.f12591d != null) {
            bVar.I("version");
            bVar.V(this.f12591d);
        }
        if (this.f12592g != null) {
            bVar.I("raw_description");
            bVar.V(this.f12592g);
        }
        if (this.f12593r != null) {
            bVar.I("build");
            bVar.V(this.f12593r);
        }
        if (this.f12594x != null) {
            bVar.I("kernel_version");
            bVar.V(this.f12594x);
        }
        if (this.f12595y != null) {
            bVar.I("rooted");
            bVar.T(this.f12595y);
        }
        ConcurrentHashMap concurrentHashMap = this.B;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.B, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
