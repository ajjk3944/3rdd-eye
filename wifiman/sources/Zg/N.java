package Zg;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private final int f25340a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25341b;

    public N(int i10, Object obj) {
        this.f25340a = i10;
        this.f25341b = obj;
    }

    public final int a() {
        return this.f25340a;
    }

    public final Object b() {
        return this.f25341b;
    }

    public final int c() {
        return this.f25340a;
    }

    public final Object d() {
        return this.f25341b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return this.f25340a == n10.f25340a && AbstractC6492s.d(this.f25341b, n10.f25341b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f25340a) * 31;
        Object obj = this.f25341b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f25340a + ", value=" + this.f25341b + ')';
    }
}
