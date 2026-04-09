package r1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f21191a;

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f21191a == ((m) obj).f21191a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21191a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f21191a + ')';
    }
}
