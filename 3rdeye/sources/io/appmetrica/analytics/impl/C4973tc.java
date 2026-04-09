package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4973tc implements B4 {
    @Override // io.appmetrica.analytics.impl.B4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final P4 a(Context context, C5091y5 c5091y5, C4758l4 c4758l4, K4 k42) {
        S4 s42;
        Q4 q42 = new Q4(c4758l4.f41166b);
        T4 t42 = new T4();
        synchronized (c5091y5) {
            s42 = (S4) c5091y5.a(q42, k42, t42, c5091y5.f42108b);
        }
        return new P4(context, s42, k42);
    }
}
