package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4863p5 extends AbstractC4837o5 {
    public C4863p5(C4940s5 c4940s5) {
        super(c4940s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4837o5
    public final boolean b(int i) {
        return i < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4837o5
    public final void c() {
        Cif cif = this.f41344a.f41601c;
        try {
            Sk sk = new Sk(cif, L2.f39740g);
            Long lA = sk.f40133c.a(Sk.f40126d);
            if (lA != null) {
                sk.a(Sk.f40126d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA.longValue())));
            }
            Long lA2 = sk.f40133c.a(Sk.f40127e);
            if (lA2 != null) {
                sk.a(Sk.f40127e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Sk sk2 = new Sk(cif, Aa.f39095g);
            Long lA3 = sk2.f40133c.a(Sk.f40126d);
            if (lA3 != null) {
                sk2.a(Sk.f40126d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA3.longValue())));
            }
            Long lA4 = sk2.f40133c.a(Sk.f40127e);
            if (lA4 != null) {
                sk2.a(Sk.f40127e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
