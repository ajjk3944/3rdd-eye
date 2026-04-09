package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String[] f12526a;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap f12527d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12526a, ((b0) obj).f12526a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12526a);
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12526a != null) {
            bVar.I("active_profiles");
            bVar.S(u0Var, this.f12526a);
        }
        ConcurrentHashMap concurrentHashMap = this.f12527d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12527d, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
