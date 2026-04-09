package hr;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: r, reason: collision with root package name */
    public static final d f10870r = new d(1, 0, 1);

    @Override // hr.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f10863a == dVar.f10863a && this.f10864d == dVar.f10864d;
    }

    @Override // hr.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f10863a * 31) + this.f10864d;
    }

    @Override // hr.b
    public final boolean isEmpty() {
        return this.f10863a > this.f10864d;
    }

    @Override // hr.b
    public final String toString() {
        return this.f10863a + ".." + this.f10864d;
    }
}
