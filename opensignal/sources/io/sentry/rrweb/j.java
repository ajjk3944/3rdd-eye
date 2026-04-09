package io.sentry.rrweb;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import ir.f0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j extends b implements c2 {

    /* renamed from: g, reason: collision with root package name */
    public String f12713g;

    /* renamed from: r, reason: collision with root package name */
    public int f12714r;

    /* renamed from: x, reason: collision with root package name */
    public int f12715x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f12716y;

    public j() {
        super(c.Meta);
        this.f12713g = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12714r == jVar.f12714r && this.f12715x == jVar.f12715x && f0.s(this.f12713g, jVar.f12713g);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f12713g, Integer.valueOf(this.f12714r), Integer.valueOf(this.f12715x)});
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
        bVar.I("href");
        bVar.V(this.f12713g);
        bVar.I("height");
        bVar.R(this.f12714r);
        bVar.I("width");
        bVar.R(this.f12715x);
        HashMap map = this.f12716y;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12716y, str, bVar, str, u0Var);
            }
        }
        bVar.F();
        bVar.F();
    }
}
