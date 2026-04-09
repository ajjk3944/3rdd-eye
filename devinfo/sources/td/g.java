package td;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34548a;

    public g(Object obj) {
        this.f34548a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        Object obj2 = ((g) obj).f34548a;
        Object obj3 = this.f34548a;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    @Override // td.d
    public final Object get() {
        return this.f34548a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34548a});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f34548a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
