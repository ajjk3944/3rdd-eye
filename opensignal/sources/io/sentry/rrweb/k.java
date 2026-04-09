package io.sentry.rrweb;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k extends b implements c2 {

    /* renamed from: g, reason: collision with root package name */
    public String f12717g;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f12718r;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("type");
        bVar.S(u0Var, this.f12699a);
        bVar.I("timestamp");
        bVar.R(this.f12700d);
        bVar.I("data");
        bVar.C();
        bVar.I("tag");
        bVar.V(this.f12717g);
        bVar.I("payload");
        bVar.C();
        HashMap map = this.f12718r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                bVar.I(str);
                bVar.S(u0Var, obj);
            }
        }
        bVar.F();
        bVar.F();
        bVar.F();
    }
}
