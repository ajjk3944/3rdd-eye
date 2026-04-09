package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5030vj implements B4 {
    @Override // io.appmetrica.analytics.impl.B4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4928rj a(Context context, C5091y5 c5091y5, C4758l4 c4758l4, K4 k42) {
        Mg mg;
        C4759l5 c4759l5 = new C4759l5(c4758l4.f41166b, c4758l4.f41165a);
        synchronized (c5091y5) {
            mg = (Mg) c5091y5.f42107a.get(c4759l5.toString());
        }
        return new C4928rj(mg);
    }
}
