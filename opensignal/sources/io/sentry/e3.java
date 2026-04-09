package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e3 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.t f12234a;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap f12235d;

    public e3(io.sentry.protocol.t tVar) {
        this.f12234a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e3) {
            return this.f12234a.equals(((e3) obj).f12234a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12234a});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("profiler_id");
        bVar.S(u0Var, this.f12234a);
        ConcurrentHashMap concurrentHashMap = this.f12235d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12235d, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
