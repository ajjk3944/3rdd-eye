package x6;

/* loaded from: classes3.dex */
public final class c implements InterfaceC8423a {

    /* renamed from: a, reason: collision with root package name */
    private final float f65334a;

    /* renamed from: b, reason: collision with root package name */
    private final float f65335b;

    public c(float f10, float f11) {
        this.f65334a = f10;
        this.f65335b = f11;
    }

    @Override // x6.InterfaceC8423a
    public float a() {
        return this.f65334a;
    }

    @Override // x6.InterfaceC8423a
    public float b() {
        return this.f65335b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(a(), cVar.a()) == 0 && Float.compare(b(), cVar.b()) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(a()) * 31) + Float.hashCode(b());
    }

    public String toString() {
        return "FloatEntry(x=" + a() + ", y=" + b() + ')';
    }
}
