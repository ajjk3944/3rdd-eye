package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class k implements c2 {
    public Boolean B;
    public Integer D;
    public Integer E;
    public Boolean F;
    public HashMap G;

    /* renamed from: a, reason: collision with root package name */
    public String f12580a;

    /* renamed from: d, reason: collision with root package name */
    public String f12581d;

    /* renamed from: g, reason: collision with root package name */
    public String f12582g;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f12583r;

    /* renamed from: x, reason: collision with root package name */
    public ConcurrentHashMap f12584x;

    /* renamed from: y, reason: collision with root package name */
    public ConcurrentHashMap f12585y;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12580a != null) {
            bVar.I("type");
            bVar.V(this.f12580a);
        }
        if (this.f12581d != null) {
            bVar.I("description");
            bVar.V(this.f12581d);
        }
        if (this.f12582g != null) {
            bVar.I("help_link");
            bVar.V(this.f12582g);
        }
        if (this.f12583r != null) {
            bVar.I("handled");
            bVar.T(this.f12583r);
        }
        if (this.f12584x != null) {
            bVar.I("meta");
            bVar.S(u0Var, this.f12584x);
        }
        if (this.f12585y != null) {
            bVar.I("data");
            bVar.S(u0Var, this.f12585y);
        }
        if (this.B != null) {
            bVar.I("synthetic");
            bVar.T(this.B);
        }
        if (this.D != null) {
            bVar.I("exception_id");
            bVar.S(u0Var, this.D);
        }
        if (this.E != null) {
            bVar.I("parent_id");
            bVar.S(u0Var, this.E);
        }
        if (this.F != null) {
            bVar.I("is_exception_group");
            bVar.T(this.F);
        }
        HashMap map = this.G;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.G, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
