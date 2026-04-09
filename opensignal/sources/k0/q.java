package k0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final e0.d f13927a;

    /* renamed from: b, reason: collision with root package name */
    public final e0.d f13928b;

    /* renamed from: c, reason: collision with root package name */
    public final e0.d f13929c;

    /* renamed from: d, reason: collision with root package name */
    public final e0.d f13930d;

    /* renamed from: e, reason: collision with root package name */
    public final e0.d f13931e;

    /* renamed from: f, reason: collision with root package name */
    public final e0.d f13932f;

    /* renamed from: g, reason: collision with root package name */
    public final e0.d f13933g;

    /* renamed from: h, reason: collision with root package name */
    public final e0.d f13934h;

    public q() {
        e0.d dVar = p.f13919a;
        e0.d dVar2 = p.f13920b;
        e0.d dVar3 = p.f13921c;
        e0.d dVar4 = p.f13922d;
        e0.d dVar5 = p.f13924f;
        e0.d dVar6 = p.f13923e;
        e0.d dVar7 = p.f13925g;
        e0.d dVar8 = p.f13926h;
        this.f13927a = dVar;
        this.f13928b = dVar2;
        this.f13929c = dVar3;
        this.f13930d = dVar4;
        this.f13931e = dVar5;
        this.f13932f = dVar6;
        this.f13933g = dVar7;
        this.f13934h = dVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return br.l.a(this.f13927a, qVar.f13927a) && br.l.a(this.f13928b, qVar.f13928b) && br.l.a(this.f13929c, qVar.f13929c) && br.l.a(this.f13930d, qVar.f13930d) && br.l.a(this.f13931e, qVar.f13931e) && br.l.a(this.f13932f, qVar.f13932f) && br.l.a(this.f13933g, qVar.f13933g) && br.l.a(this.f13934h, qVar.f13934h);
    }

    public final int hashCode() {
        return this.f13934h.hashCode() + ((this.f13933g.hashCode() + ((this.f13932f.hashCode() + ((this.f13931e.hashCode() + ((this.f13930d.hashCode() + ((this.f13929c.hashCode() + ((this.f13928b.hashCode() + (this.f13927a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f13927a + ", small=" + this.f13928b + ", medium=" + this.f13929c + ", large=" + this.f13930d + ", largeIncreased=" + this.f13932f + ", extraLarge=" + this.f13931e + ", extralargeIncreased=" + this.f13933g + ", extraExtraLarge=" + this.f13934h + ')';
    }
}
