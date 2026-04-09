package io.sentry.protocol.profiling;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f12617a;

    /* renamed from: d, reason: collision with root package name */
    public int f12618d;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f12619g;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12617a != null) {
            bVar.I("name");
            bVar.S(u0Var, this.f12617a);
        }
        bVar.I("priority");
        bVar.S(u0Var, Integer.valueOf(this.f12618d));
        HashMap map = this.f12619g;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12619g, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
