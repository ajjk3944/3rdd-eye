package lq;

/* loaded from: classes.dex */
public final class s implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final byte f15583a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return br.l.g(this.f15583a & 255, ((s) obj).f15583a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f15583a == ((s) obj).f15583a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f15583a);
    }

    public final String toString() {
        return String.valueOf(this.f15583a & 255);
    }
}
