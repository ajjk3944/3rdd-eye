package n0;

import android.content.Context;

/* loaded from: classes.dex */
public final class b0 implements j2 {
    @Override // n0.j2
    public final Object a(f1 f1Var) {
        a0 a0Var = y1.l0.f25734a;
        f1Var.getClass();
        w.j(f1Var, a0Var);
        return ((Context) w.j(f1Var, y1.l0.f25735b)).getResources();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        Object obj2 = y1.n.f25748y;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return y1.n.f25748y.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + y1.n.f25748y + ')';
    }
}
