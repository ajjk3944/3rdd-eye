package i6;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final h f21602a;

    public a(h hVar) {
        this.f21602a = hVar;
    }

    public static a a(b bVar) {
        h hVar = (h) bVar;
        n6.g.d(bVar, "AdSession is null");
        n6.g.j(hVar);
        n6.g.g(hVar);
        a aVar = new a(hVar);
        hVar.k().d(aVar);
        return aVar;
    }

    public void b() {
        n6.g.g(this.f21602a);
        n6.g.i(this.f21602a);
        if (!this.f21602a.o()) {
            try {
                this.f21602a.d();
            } catch (Exception unused) {
            }
        }
        if (this.f21602a.o()) {
            this.f21602a.s();
        }
    }

    public void c() {
        n6.g.c(this.f21602a);
        n6.g.i(this.f21602a);
        this.f21602a.t();
    }
}
