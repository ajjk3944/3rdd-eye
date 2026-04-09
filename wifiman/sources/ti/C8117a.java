package ti;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ti.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8117a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f62657a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f62658b;

    public C8117a(Object obj, Object obj2) {
        this.f62657a = obj;
        this.f62658b = obj2;
    }

    public final Object a() {
        return this.f62657a;
    }

    public final Object b() {
        return this.f62658b;
    }

    public final Object c() {
        return this.f62657a;
    }

    public final Object d() {
        return this.f62658b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8117a)) {
            return false;
        }
        C8117a c8117a = (C8117a) obj;
        return AbstractC6492s.d(this.f62657a, c8117a.f62657a) && AbstractC6492s.d(this.f62658b, c8117a.f62658b);
    }

    public int hashCode() {
        Object obj = this.f62657a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f62658b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f62657a + ", upper=" + this.f62658b + ')';
    }
}
