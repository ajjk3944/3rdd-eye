package lq;

/* loaded from: classes.dex */
public final class z implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final short f15590a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return br.l.g(this.f15590a & 65535, ((z) obj).f15590a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f15590a == ((z) obj).f15590a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f15590a);
    }

    public final String toString() {
        return String.valueOf(this.f15590a & 65535);
    }
}
