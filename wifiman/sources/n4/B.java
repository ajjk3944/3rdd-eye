package N4;

import N4.G;

/* loaded from: classes3.dex */
final class B extends G {

    /* renamed from: a, reason: collision with root package name */
    private final G.a f14899a;

    /* renamed from: b, reason: collision with root package name */
    private final G.c f14900b;

    /* renamed from: c, reason: collision with root package name */
    private final G.b f14901c;

    B(G.a aVar, G.c cVar, G.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f14899a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f14900b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f14901c = bVar;
    }

    @Override // N4.G
    public G.a a() {
        return this.f14899a;
    }

    @Override // N4.G
    public G.b c() {
        return this.f14901c;
    }

    @Override // N4.G
    public G.c d() {
        return this.f14900b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return this.f14899a.equals(g10.a()) && this.f14900b.equals(g10.d()) && this.f14901c.equals(g10.c());
    }

    public int hashCode() {
        return ((((this.f14899a.hashCode() ^ 1000003) * 1000003) ^ this.f14900b.hashCode()) * 1000003) ^ this.f14901c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f14899a + ", osData=" + this.f14900b + ", deviceData=" + this.f14901c + "}";
    }
}
