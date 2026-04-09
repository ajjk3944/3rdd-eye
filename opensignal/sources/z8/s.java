package z8;

/* loaded from: classes.dex */
public final class s implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f26769a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26770b;

    /* renamed from: c, reason: collision with root package name */
    public final y8.a f26771c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26772d;

    public s(String str, int i10, y8.a aVar, boolean z10) {
        this.f26769a = str;
        this.f26770b = i10;
        this.f26771c = aVar;
        this.f26772d = z10;
    }

    @Override // z8.b
    public final t8.c a(r8.v vVar, r8.h hVar, a9.b bVar) {
        return new t8.t(vVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f26769a);
        sb2.append(", index=");
        return c7.a.q(sb2, this.f26770b, '}');
    }
}
