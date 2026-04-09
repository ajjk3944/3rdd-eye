package v5;

/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f23901d = new c(1, 0, 1);

    public c(int i, int i3) {
        super(i, i3, 1);
    }

    public final boolean a(int i) {
        return this.f23894a <= i && i <= this.f23895b;
    }

    @Override // v5.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f23894a == cVar.f23894a && this.f23895b == cVar.f23895b;
    }

    @Override // v5.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f23894a * 31) + this.f23895b;
    }

    @Override // v5.a
    public final boolean isEmpty() {
        return this.f23894a > this.f23895b;
    }

    @Override // v5.a
    public final String toString() {
        return this.f23894a + ".." + this.f23895b;
    }
}
