package C0;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class A {
    public static final E0.Q a(E0.Q q10) {
        E0.G gG1 = q10.G1();
        while (true) {
            E0.G gO0 = gG1.o0();
            if ((gO0 != null ? gO0.a0() : null) == null) {
                E0.Q qC2 = gG1.m0().C2();
                AbstractC6492s.f(qC2);
                return qC2;
            }
            E0.G gO02 = gG1.o0();
            E0.G gA0 = gO02 != null ? gO02.a0() : null;
            AbstractC6492s.f(gA0);
            if (gA0.O0()) {
                gG1 = gG1.o0();
                AbstractC6492s.f(gG1);
            } else {
                E0.G gO03 = gG1.o0();
                AbstractC6492s.f(gO03);
                gG1 = gO03.a0();
                AbstractC6492s.f(gG1);
            }
        }
    }
}
