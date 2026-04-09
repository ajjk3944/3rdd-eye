package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0.d f32533a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.d f32534b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.d f32535c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.d f32536d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.d f32537e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.d f32538f;
    public final m0.d g;

    /* renamed from: h, reason: collision with root package name */
    public final m0.d f32539h;

    public g0(m0.d dVar, m0.d dVar2, m0.d dVar3, m0.d dVar4, m0.d dVar5) {
        m0.d dVar6 = f0.f32526e;
        m0.d dVar7 = f0.g;
        m0.d dVar8 = f0.f32528h;
        this.f32533a = dVar;
        this.f32534b = dVar2;
        this.f32535c = dVar3;
        this.f32536d = dVar4;
        this.f32537e = dVar5;
        this.f32538f = dVar6;
        this.g = dVar7;
        this.f32539h = dVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return nk.k.a(this.f32533a, g0Var.f32533a) && nk.k.a(this.f32534b, g0Var.f32534b) && nk.k.a(this.f32535c, g0Var.f32535c) && nk.k.a(this.f32536d, g0Var.f32536d) && nk.k.a(this.f32537e, g0Var.f32537e) && nk.k.a(this.f32538f, g0Var.f32538f) && nk.k.a(this.g, g0Var.g) && nk.k.a(this.f32539h, g0Var.f32539h);
    }

    public final int hashCode() {
        return this.f32539h.hashCode() + ((this.g.hashCode() + ((this.f32538f.hashCode() + ((this.f32537e.hashCode() + ((this.f32536d.hashCode() + ((this.f32535c.hashCode() + ((this.f32534b.hashCode() + (this.f32533a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f32533a + ", small=" + this.f32534b + ", medium=" + this.f32535c + ", large=" + this.f32536d + ", largeIncreased=" + this.f32538f + ", extraLarge=" + this.f32537e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.f32539h + ')';
    }
}
