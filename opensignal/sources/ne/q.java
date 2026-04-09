package ne;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q implements n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17542a;

    public q(Object obj) {
        this.f17542a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return a.a.k(this.f17542a, ((q) obj).f17542a);
        }
        return false;
    }

    @Override // ne.n
    public final Object get() {
        return this.f17542a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17542a});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17542a);
        return c7.a.k(strValueOf.length() + 22, "Suppliers.ofInstance(", strValueOf, ")");
    }
}
