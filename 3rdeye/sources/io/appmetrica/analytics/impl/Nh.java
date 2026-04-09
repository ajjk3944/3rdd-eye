package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class Nh implements B4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4966t5 f39905a;

    public Nh(InterfaceC4966t5 interfaceC4966t5) {
        this.f39905a = interfaceC4966t5;
    }

    @Override // io.appmetrica.analytics.impl.B4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Lg a(Context context, C5091y5 c5091y5, C4758l4 c4758l4, K4 k42) {
        Mg mg;
        C4759l5 c4759l5 = new C4759l5(c4758l4.f41166b, c4758l4.f41165a);
        Ng ng = new Ng(this.f39905a);
        synchronized (c5091y5) {
            mg = (Mg) c5091y5.a(c4759l5, k42, ng, c5091y5.f42107a);
        }
        return new Lg(context, mg);
    }
}
