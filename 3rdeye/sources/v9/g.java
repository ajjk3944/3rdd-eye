package v9;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes3.dex */
public final class g extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final g f47103e = new g(1, 0, 1);

    @Override // v9.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        if (this.f47096b == gVar.f47096b) {
            return this.f47097c == gVar.f47097c;
        }
        return false;
    }

    @Override // v9.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f47096b * 31) + this.f47097c;
    }

    @Override // v9.e
    public final boolean isEmpty() {
        return this.f47096b > this.f47097c;
    }

    @Override // v9.e
    public final String toString() {
        return this.f47096b + ".." + this.f47097c;
    }
}
