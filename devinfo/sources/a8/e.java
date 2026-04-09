package a8;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final f f224a;

    /* renamed from: b, reason: collision with root package name */
    public int f225b;

    /* renamed from: c, reason: collision with root package name */
    public Class f226c;

    public e(f fVar) {
        this.f224a = fVar;
    }

    @Override // a8.i
    public final void a() {
        this.f224a.u(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f225b == eVar.f225b && this.f226c == eVar.f226c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f225b * 31;
        Class cls = this.f226c;
        return i4 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f225b + "array=" + this.f226c + '}';
    }
}
