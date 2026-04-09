package lq;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f15585a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return br.l.g(this.f15585a ^ Integer.MIN_VALUE, ((u) obj).f15585a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f15585a == ((u) obj).f15585a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15585a);
    }

    public final String toString() {
        return String.valueOf(this.f15585a & 4294967295L);
    }
}
