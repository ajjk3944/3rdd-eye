package o1;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2756d implements InterfaceC2759g {

    /* renamed from: a, reason: collision with root package name */
    public final C2757e f22675a;

    /* renamed from: b, reason: collision with root package name */
    public int f22676b;

    /* renamed from: c, reason: collision with root package name */
    public Class f22677c;

    public C2756d(C2757e c2757e) {
        this.f22675a = c2757e;
    }

    @Override // o1.InterfaceC2759g
    public final void a() {
        this.f22675a.f(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2756d) {
            C2756d c2756d = (C2756d) obj;
            if (this.f22676b == c2756d.f22676b && this.f22677c == c2756d.f22677c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f22676b * 31;
        Class cls = this.f22677c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f22676b + "array=" + this.f22677c + '}';
    }
}
