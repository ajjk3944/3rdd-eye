package y1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f37313a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f37313a == ((a) obj).f37313a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37313a;
    }

    public final String toString() {
        int i4 = this.f37313a;
        return i4 == 1 ? "Touch" : i4 == 2 ? "Keyboard" : "Error";
    }
}
