package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class v implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f12641a;

    /* renamed from: d, reason: collision with root package name */
    public String f12642d;

    /* renamed from: g, reason: collision with root package name */
    public String f12643g;

    /* renamed from: r, reason: collision with root package name */
    public ConcurrentHashMap f12644r;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12641a != null) {
            bVar.I("name");
            bVar.V(this.f12641a);
        }
        if (this.f12642d != null) {
            bVar.I("version");
            bVar.V(this.f12642d);
        }
        if (this.f12643g != null) {
            bVar.I("raw_description");
            bVar.V(this.f12643g);
        }
        ConcurrentHashMap concurrentHashMap = this.f12644r;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12644r, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
