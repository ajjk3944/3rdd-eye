package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class l implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f12586a;

    /* renamed from: d, reason: collision with root package name */
    public String f12587d;

    /* renamed from: g, reason: collision with root package name */
    public List f12588g;

    /* renamed from: r, reason: collision with root package name */
    public ConcurrentHashMap f12589r;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12586a != null) {
            bVar.I("formatted");
            bVar.V(this.f12586a);
        }
        if (this.f12587d != null) {
            bVar.I("message");
            bVar.V(this.f12587d);
        }
        List list = this.f12588g;
        if (list != null && !list.isEmpty()) {
            bVar.I("params");
            bVar.S(u0Var, this.f12588g);
        }
        ConcurrentHashMap concurrentHashMap = this.f12589r;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12589r, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
