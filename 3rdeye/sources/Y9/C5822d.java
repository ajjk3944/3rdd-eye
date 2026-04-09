package y9;

/* compiled from: Regex.kt */
/* renamed from: y9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5822d {

    /* renamed from: a, reason: collision with root package name */
    public final String f48375a;

    /* renamed from: b, reason: collision with root package name */
    public final v9.g f48376b;

    public C5822d(String str, v9.g gVar) {
        this.f48375a = str;
        this.f48376b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5822d)) {
            return false;
        }
        C5822d c5822d = (C5822d) obj;
        return kotlin.jvm.internal.l.b(this.f48375a, c5822d.f48375a) && kotlin.jvm.internal.l.b(this.f48376b, c5822d.f48376b);
    }

    public final int hashCode() {
        return this.f48376b.hashCode() + (this.f48375a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f48375a + ", range=" + this.f48376b + ')';
    }
}
