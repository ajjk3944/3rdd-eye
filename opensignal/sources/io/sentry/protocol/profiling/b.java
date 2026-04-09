package io.sentry.protocol.profiling;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public double f12613a;

    /* renamed from: d, reason: collision with root package name */
    public int f12614d;

    /* renamed from: g, reason: collision with root package name */
    public String f12615g;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f12616r;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("timestamp");
        bVar.S(u0Var, BigDecimal.valueOf(this.f12613a).setScale(6, RoundingMode.DOWN));
        bVar.I("stack_id");
        bVar.S(u0Var, Integer.valueOf(this.f12614d));
        if (this.f12615g != null) {
            bVar.I("thread_id");
            bVar.S(u0Var, this.f12615g);
        }
        HashMap map = this.f12616r;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12616r, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
