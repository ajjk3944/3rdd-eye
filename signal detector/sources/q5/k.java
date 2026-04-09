package q5;

/* loaded from: classes3.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f23295a;

    public k(Class cls) {
        this.f23295a = cls;
    }

    @Override // q5.c
    public final Class a() {
        return this.f23295a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return i.a(this.f23295a, ((k) obj).f23295a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23295a.hashCode();
    }

    public final String toString() {
        return this.f23295a + " (Kotlin reflection is not available)";
    }
}
