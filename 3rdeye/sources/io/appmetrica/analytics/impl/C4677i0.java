package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4677i0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f41030a = new HashMap();

    public final synchronized C4651h0 a(C4759l5 c4759l5, PublicLogger publicLogger, Cif cif) {
        C4651h0 c4651h0;
        c4651h0 = (C4651h0) this.f41030a.get(c4759l5.toString());
        if (c4651h0 == null) {
            C4625g0 c4625g0D = cif.d();
            c4651h0 = new C4651h0(c4625g0D.f40909a, c4625g0D.f40910b, new C4853ol(publicLogger, "[App Environment]"));
            this.f41030a.put(c4759l5.toString(), c4651h0);
        }
        return c4651h0;
    }

    public final synchronized void a(C4625g0 c4625g0, Cif cif) {
        cif.a(c4625g0).b();
    }
}
