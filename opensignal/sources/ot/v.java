package ot;

/* loaded from: classes.dex */
public abstract class v implements e {

    /* renamed from: a, reason: collision with root package name */
    public final br.n f19844a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19845b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(String str, ar.k kVar) {
        this.f19844a = (br.n) kVar;
        this.f19845b = "must return ".concat(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ar.k, br.n] */
    @Override // ot.e
    public final boolean a(cs.g gVar) {
        return br.l.a(gVar.D, this.f19844a.a(xs.d.e(gVar)));
    }

    @Override // ot.e
    public final String b(cs.g gVar) {
        return a.a.t(this, gVar);
    }

    @Override // ot.e
    public final String getDescription() {
        return this.f19845b;
    }
}
