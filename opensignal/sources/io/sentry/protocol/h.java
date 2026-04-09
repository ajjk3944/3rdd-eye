package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f12566a;

    /* renamed from: d, reason: collision with root package name */
    public String f12567d;

    /* renamed from: g, reason: collision with root package name */
    public String f12568g;

    /* renamed from: r, reason: collision with root package name */
    public ConcurrentHashMap f12569r;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12566a != null) {
            bVar.I("city");
            bVar.V(this.f12566a);
        }
        if (this.f12567d != null) {
            bVar.I("country_code");
            bVar.V(this.f12567d);
        }
        if (this.f12568g != null) {
            bVar.I("region");
            bVar.V(this.f12568g);
        }
        ConcurrentHashMap concurrentHashMap = this.f12569r;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12569r, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
