package io.sentry.rrweb;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g extends e implements c2 {
    public float B;
    public int D;
    public int E;
    public HashMap F;
    public HashMap G;

    /* renamed from: r, reason: collision with root package name */
    public f f12702r;

    /* renamed from: x, reason: collision with root package name */
    public int f12703x;

    /* renamed from: y, reason: collision with root package name */
    public float f12704y;

    public g() {
        super(d.MouseInteraction);
        this.D = 2;
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
        bVar.I("type");
        bVar.S(u0Var, this.f12702r);
        bVar.I("id");
        bVar.R(this.f12703x);
        bVar.I("x");
        bVar.Q(this.f12704y);
        bVar.I("y");
        bVar.Q(this.B);
        bVar.I("pointerType");
        bVar.R(this.D);
        bVar.I("pointerId");
        bVar.R(this.E);
        HashMap map = this.G;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.G, str, bVar, str, u0Var);
            }
        }
        bVar.F();
        HashMap map2 = this.F;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                h0.b.C(this.F, str2, bVar, str2, u0Var);
            }
        }
        bVar.F();
    }
}
