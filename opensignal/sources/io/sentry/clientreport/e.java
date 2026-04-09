package io.sentry.clientreport;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12160a;

    /* renamed from: d, reason: collision with root package name */
    public final String f12161d;

    /* renamed from: g, reason: collision with root package name */
    public final Long f12162g;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f12163r;

    public e(String str, String str2, Long l10) {
        this.f12160a = str;
        this.f12161d = str2;
        this.f12162g = l10;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("reason");
        bVar.V(this.f12160a);
        bVar.I("category");
        bVar.V(this.f12161d);
        bVar.I("quantity");
        bVar.U(this.f12162g);
        HashMap map = this.f12163r;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12163r, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f12160a + "', category='" + this.f12161d + "', quantity=" + this.f12162g + '}';
    }
}
