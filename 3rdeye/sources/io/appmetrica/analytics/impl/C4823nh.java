package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.nh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4823nh extends AbstractC4539ch {
    public C4823nh(C4940s5 c4940s5) {
        super(c4940s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        Bk bkB;
        Rk rk;
        C9 c92 = this.f40632a.f41611n;
        Pk pk = c92.f39235c;
        if (pk.f39994g == 0) {
            bkB = pk.f39991d.b();
            Bk bkB2 = pk.f39992e.b();
            if ((bkB == null ? -1L : bkB.f39205d) <= (bkB2 != null ? bkB2.f39205d : -1L)) {
                bkB = bkB2;
            }
        } else {
            bkB = pk.f39993f;
        }
        if (bkB != null) {
            rk = new Rk();
            rk.f40071a = bkB.f39205d;
            long andIncrement = bkB.f39207f.getAndIncrement();
            Sk sk = bkB.f39203b;
            sk.a(Sk.f40129g, Long.valueOf(bkB.f39207f.get()));
            sk.b();
            rk.f40072b = andIncrement;
            rk.f40073c = TimeUnit.MILLISECONDS.toSeconds(bkB.f39210j);
            rk.f40074d = bkB.f39204c.f39373a;
        } else {
            long j4 = c4683i6.f41052j;
            long jA = pk.f39989b.a();
            C4555d7 c4555d7 = pk.f39988a.f41603e;
            Tk tk = Tk.BACKGROUND;
            c4555d7.a(jA, tk, j4);
            rk = new Rk();
            rk.f40071a = jA;
            rk.f40074d = tk;
            rk.f40072b = 0L;
            rk.f40073c = 0L;
        }
        c92.a(c4683i6, rk);
        return true;
    }
}
