package pi;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class L0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final S a(S s10) {
        AbstractC6492s.i(s10, "<this>");
        if (s10 instanceof K0) {
            return ((K0) s10).I();
        }
        return null;
    }

    public static final M0 b(M0 m02, S origin) {
        AbstractC6492s.i(m02, "<this>");
        AbstractC6492s.i(origin, "origin");
        return d(m02, a(origin));
    }

    public static final M0 c(M0 m02, S origin, InterfaceC6835l transform) {
        AbstractC6492s.i(m02, "<this>");
        AbstractC6492s.i(origin, "origin");
        AbstractC6492s.i(transform, "transform");
        S sA = a(origin);
        return d(m02, sA != null ? (S) transform.invoke(sA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final M0 d(M0 m02, S s10) {
        AbstractC6492s.i(m02, "<this>");
        if (m02 instanceof K0) {
            return d(((K0) m02).G0(), s10);
        }
        if (s10 == null || AbstractC6492s.d(s10, m02)) {
            return m02;
        }
        if (m02 instanceof AbstractC7346d0) {
            return new C7352g0((AbstractC7346d0) m02, s10);
        }
        if (m02 instanceof I) {
            return new K((I) m02, s10);
        }
        throw new NoWhenBranchMatchedException();
    }
}
