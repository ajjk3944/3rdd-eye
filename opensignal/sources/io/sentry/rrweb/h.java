package io.sentry.rrweb;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12705a;

    /* renamed from: d, reason: collision with root package name */
    public float f12706d;

    /* renamed from: g, reason: collision with root package name */
    public float f12707g;

    /* renamed from: r, reason: collision with root package name */
    public long f12708r;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f12709x;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("id");
        bVar.R(this.f12705a);
        bVar.I("x");
        bVar.Q(this.f12706d);
        bVar.I("y");
        bVar.Q(this.f12707g);
        bVar.I("timeOffset");
        bVar.R(this.f12708r);
        HashMap map = this.f12709x;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12709x, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
