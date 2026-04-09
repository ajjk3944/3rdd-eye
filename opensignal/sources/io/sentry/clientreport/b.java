package io.sentry.clientreport;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final Date f12155a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12156d;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f12157g;

    public b(Date date, ArrayList arrayList) {
        this.f12155a = date;
        this.f12156d = arrayList;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("timestamp");
        bVar.V(dr.a.A(this.f12155a));
        bVar.I("discarded_events");
        bVar.S(u0Var, this.f12156d);
        HashMap map = this.f12157g;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12157g, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
