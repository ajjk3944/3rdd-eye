package fg;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final l f8856a;

    /* renamed from: b, reason: collision with root package name */
    public final dd.h f8857b;

    public h(l lVar, dd.h hVar) {
        this.f8856a = lVar;
        this.f8857b = hVar;
    }

    @Override // fg.k
    public final boolean a(gg.b bVar) {
        if (bVar.f9571b != gg.d.REGISTERED || this.f8856a.a(bVar)) {
            return false;
        }
        String str = bVar.f9572c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f8857b.a(new a(str, bVar.f9574e, bVar.f9575f));
        return true;
    }

    @Override // fg.k
    public final boolean b(Exception exc) {
        this.f8857b.b(exc);
        return true;
    }
}
