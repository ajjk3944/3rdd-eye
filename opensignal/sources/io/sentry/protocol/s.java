package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class s implements c2 {
    public HashMap B;

    /* renamed from: a, reason: collision with root package name */
    public String f12630a;

    /* renamed from: d, reason: collision with root package name */
    public String f12631d;

    /* renamed from: g, reason: collision with root package name */
    public String f12632g;

    /* renamed from: r, reason: collision with root package name */
    public Long f12633r;

    /* renamed from: x, reason: collision with root package name */
    public y f12634x;

    /* renamed from: y, reason: collision with root package name */
    public k f12635y;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12630a != null) {
            bVar.I("type");
            bVar.V(this.f12630a);
        }
        if (this.f12631d != null) {
            bVar.I("value");
            bVar.V(this.f12631d);
        }
        if (this.f12632g != null) {
            bVar.I("module");
            bVar.V(this.f12632g);
        }
        if (this.f12633r != null) {
            bVar.I("thread_id");
            bVar.U(this.f12633r);
        }
        if (this.f12634x != null) {
            bVar.I("stacktrace");
            bVar.S(u0Var, this.f12634x);
        }
        if (this.f12635y != null) {
            bVar.I("mechanism");
            bVar.S(u0Var, this.f12635y);
        }
        HashMap map = this.B;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.B, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
