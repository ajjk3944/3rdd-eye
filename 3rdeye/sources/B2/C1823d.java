package b2;

/* compiled from: Preference.kt */
/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1823d {

    /* renamed from: a, reason: collision with root package name */
    public final String f17115a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f17116b;

    public C1823d(String str, Long l5) {
        this.f17115a = str;
        this.f17116b = l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1823d)) {
            return false;
        }
        C1823d c1823d = (C1823d) obj;
        return kotlin.jvm.internal.l.b(this.f17115a, c1823d.f17115a) && kotlin.jvm.internal.l.b(this.f17116b, c1823d.f17116b);
    }

    public final int hashCode() {
        int iHashCode = this.f17115a.hashCode() * 31;
        Long l5 = this.f17116b;
        return iHashCode + (l5 == null ? 0 : l5.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f17115a + ", value=" + this.f17116b + ')';
    }
}
