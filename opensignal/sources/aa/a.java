package aa;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f282a;

    /* renamed from: b, reason: collision with root package name */
    public final int f283b;

    public a(int i10, int i11) {
        this.f282a = i10;
        this.f283b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f282a == aVar.f282a && this.f283b == aVar.f283b;
    }

    public final int hashCode() {
        return ((16337 + this.f282a) * 31) + this.f283b;
    }
}
