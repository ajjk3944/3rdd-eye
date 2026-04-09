package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m4 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.t f12435a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.protocol.r f12436d;

    /* renamed from: g, reason: collision with root package name */
    public final q6 f12437g;

    /* renamed from: r, reason: collision with root package name */
    public Date f12438r;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f12439x;

    public m4(io.sentry.protocol.t tVar, io.sentry.protocol.r rVar, q6 q6Var) {
        this.f12435a = tVar;
        this.f12436d = rVar;
        this.f12437g = q6Var;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        io.sentry.protocol.t tVar = this.f12435a;
        if (tVar != null) {
            bVar.I("event_id");
            bVar.S(u0Var, tVar);
        }
        io.sentry.protocol.r rVar = this.f12436d;
        if (rVar != null) {
            bVar.I("sdk");
            bVar.S(u0Var, rVar);
        }
        q6 q6Var = this.f12437g;
        if (q6Var != null) {
            bVar.I("trace");
            bVar.S(u0Var, q6Var);
        }
        if (this.f12438r != null) {
            bVar.I("sent_at");
            bVar.S(u0Var, dr.a.A(this.f12438r));
        }
        HashMap map = this.f12439x;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12439x, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
