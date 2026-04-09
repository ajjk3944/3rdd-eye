package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Bh extends AbstractC4539ch {
    public Bh(C4940s5 c4940s5) {
        super(c4940s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        ((D5) this.f40632a.f41613p).e();
        Pk pk = this.f40632a.f41607j;
        synchronized (pk) {
            try {
                Bk bkB = pk.b(c4683i6);
                if (bkB.f39208g) {
                    bkB.f39208g = false;
                    Sk sk = bkB.f39203b;
                    sk.a(Sk.i, Boolean.FALSE);
                    sk.b();
                }
                if (pk.f39994g != 1) {
                    pk.b(pk.f39993f, c4683i6);
                }
                pk.f39994g = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }
}
