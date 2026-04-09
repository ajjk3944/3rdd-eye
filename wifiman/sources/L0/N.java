package L0;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private final D f11091a;

    /* renamed from: b, reason: collision with root package name */
    private final D f11092b;

    /* renamed from: c, reason: collision with root package name */
    private final D f11093c;

    /* renamed from: d, reason: collision with root package name */
    private final D f11094d;

    public N(D d10, D d11, D d12, D d13) {
        this.f11091a = d10;
        this.f11092b = d11;
        this.f11093c = d12;
        this.f11094d = d13;
    }

    public final D a() {
        return this.f11092b;
    }

    public final D b() {
        return this.f11093c;
    }

    public final D c() {
        return this.f11094d;
    }

    public final D d() {
        return this.f11091a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return AbstractC6492s.d(this.f11091a, n10.f11091a) && AbstractC6492s.d(this.f11092b, n10.f11092b) && AbstractC6492s.d(this.f11093c, n10.f11093c) && AbstractC6492s.d(this.f11094d, n10.f11094d);
    }

    public int hashCode() {
        D d10 = this.f11091a;
        int iHashCode = (d10 != null ? d10.hashCode() : 0) * 31;
        D d11 = this.f11092b;
        int iHashCode2 = (iHashCode + (d11 != null ? d11.hashCode() : 0)) * 31;
        D d12 = this.f11093c;
        int iHashCode3 = (iHashCode2 + (d12 != null ? d12.hashCode() : 0)) * 31;
        D d13 = this.f11094d;
        return iHashCode3 + (d13 != null ? d13.hashCode() : 0);
    }
}
