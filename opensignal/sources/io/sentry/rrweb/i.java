package io.sentry.rrweb;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends e implements c2 {
    public HashMap B;

    /* renamed from: r, reason: collision with root package name */
    public int f12710r;

    /* renamed from: x, reason: collision with root package name */
    public List f12711x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f12712y;

    public i() {
        super(d.TouchMove);
    }

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
        bVar.I("source");
        bVar.S(u0Var, this.f12701g);
        List list = this.f12711x;
        if (list != null && !list.isEmpty()) {
            bVar.I("positions");
            bVar.S(u0Var, this.f12711x);
        }
        bVar.I("pointerId");
        bVar.R(this.f12710r);
        HashMap map = this.B;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.B, str, bVar, str, u0Var);
            }
        }
        bVar.F();
        HashMap map2 = this.f12712y;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                h0.b.C(this.f12712y, str2, bVar, str2, u0Var);
            }
        }
        bVar.F();
    }
}
