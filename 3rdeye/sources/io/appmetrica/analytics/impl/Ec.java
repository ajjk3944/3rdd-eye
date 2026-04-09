package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class Ec implements B4 {
    @Override // io.appmetrica.analytics.impl.B4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Fc a(Context context, C5091y5 c5091y5, C4758l4 c4758l4, K4 k42) {
        Mg mg;
        Gc gc = new Gc(c4758l4.f41166b, c4758l4.f41165a);
        Ng ng = new Ng(new Jc());
        synchronized (c5091y5) {
            mg = (Mg) c5091y5.a(gc, k42, ng, c5091y5.f42107a);
        }
        return new Fc(context, mg);
    }
}
