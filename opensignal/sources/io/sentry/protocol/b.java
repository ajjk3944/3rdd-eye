package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f12523a;

    /* renamed from: d, reason: collision with root package name */
    public String f12524d;

    /* renamed from: g, reason: collision with root package name */
    public ConcurrentHashMap f12525g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (ir.f0.s(this.f12523a, bVar.f12523a) && ir.f0.s(this.f12524d, bVar.f12524d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12523a, this.f12524d});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12523a != null) {
            bVar.I("name");
            bVar.V(this.f12523a);
        }
        if (this.f12524d != null) {
            bVar.I("version");
            bVar.V(this.f12524d);
        }
        ConcurrentHashMap concurrentHashMap = this.f12525g;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12525g, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
