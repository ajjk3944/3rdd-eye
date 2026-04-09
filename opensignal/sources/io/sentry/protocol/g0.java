package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 implements c2 {
    public Double B;
    public Double D;
    public String E;
    public Double F;
    public List G;
    public HashMap H;

    /* renamed from: a, reason: collision with root package name */
    public String f12560a;

    /* renamed from: d, reason: collision with root package name */
    public String f12561d;

    /* renamed from: g, reason: collision with root package name */
    public String f12562g;

    /* renamed from: r, reason: collision with root package name */
    public String f12563r;

    /* renamed from: x, reason: collision with root package name */
    public Double f12564x;

    /* renamed from: y, reason: collision with root package name */
    public Double f12565y;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12560a != null) {
            bVar.I("rendering_system");
            bVar.V(this.f12560a);
        }
        if (this.f12561d != null) {
            bVar.I("type");
            bVar.V(this.f12561d);
        }
        if (this.f12562g != null) {
            bVar.I("identifier");
            bVar.V(this.f12562g);
        }
        if (this.f12563r != null) {
            bVar.I("tag");
            bVar.V(this.f12563r);
        }
        if (this.f12564x != null) {
            bVar.I("width");
            bVar.U(this.f12564x);
        }
        if (this.f12565y != null) {
            bVar.I("height");
            bVar.U(this.f12565y);
        }
        if (this.B != null) {
            bVar.I("x");
            bVar.U(this.B);
        }
        if (this.D != null) {
            bVar.I("y");
            bVar.U(this.D);
        }
        if (this.E != null) {
            bVar.I("visibility");
            bVar.V(this.E);
        }
        if (this.F != null) {
            bVar.I("alpha");
            bVar.U(this.F);
        }
        List list = this.G;
        if (list != null && !list.isEmpty()) {
            bVar.I("children");
            bVar.S(u0Var, this.G);
        }
        HashMap map = this.H;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.H, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
