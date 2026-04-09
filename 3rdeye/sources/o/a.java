package O;

/* compiled from: AutoValue_DualOutConfig.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final P.b f10131a;

    /* renamed from: b, reason: collision with root package name */
    public final P.b f10132b;

    public a(P.b bVar, P.b bVar2) {
        this.f10131a = bVar;
        this.f10132b = bVar2;
    }

    @Override // O.d
    public final P.f a() {
        return this.f10131a;
    }

    @Override // O.d
    public final P.f b() {
        return this.f10132b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f10131a.equals(dVar.a()) && this.f10132b.equals(dVar.b());
    }

    public final int hashCode() {
        return ((this.f10131a.hashCode() ^ 1000003) * 1000003) ^ this.f10132b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f10131a + ", secondaryOutConfig=" + this.f10132b + "}";
    }
}
