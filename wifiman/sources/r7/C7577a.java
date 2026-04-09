package r7;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7577a implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final int f60129a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f60130b;

    public C7577a(int i10, Object obj) {
        this.f60129a = i10;
        this.f60130b = obj;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7577a other) {
        AbstractC6492s.i(other, "other");
        if (this.f60129a != other.f60129a || AbstractC6492s.d(this.f60130b, other.f60130b)) {
            return AbstractC6492s.k(this.f60129a, other.f60129a) * (-1);
        }
        return -1;
    }

    public final int b() {
        return this.f60129a;
    }

    public final Object c() {
        return this.f60130b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7577a)) {
            return false;
        }
        C7577a c7577a = (C7577a) obj;
        return this.f60129a == c7577a.f60129a && AbstractC6492s.d(this.f60130b, c7577a.f60130b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f60129a) * 31;
        Object obj = this.f60130b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "PriorityValue(priority=" + this.f60129a + ", value=" + this.f60130b + ")";
    }
}
