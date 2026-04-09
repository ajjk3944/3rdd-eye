package o5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g f23647a;

    public a(g gVar) {
        this.f23647a = gVar;
    }

    public static a a(b bVar) {
        g gVar = (g) bVar;
        t5.g.c(bVar, "AdSession is null");
        t5.g.l(gVar);
        t5.g.g(gVar);
        a aVar = new a(gVar);
        gVar.t().i(aVar);
        return aVar;
    }

    public void b() {
        t5.g.g(this.f23647a);
        t5.g.j(this.f23647a);
        if (!this.f23647a.q()) {
            try {
                this.f23647a.g();
            } catch (Exception unused) {
            }
        }
        if (this.f23647a.q()) {
            this.f23647a.x();
        }
    }

    public void c() {
        t5.g.f(this.f23647a);
        t5.g.j(this.f23647a);
        this.f23647a.y();
    }

    public void d(com.iab.omid.library.mmadbridge.adsession.media.b bVar) {
        t5.g.c(bVar, "VastProperties is null");
        t5.g.f(this.f23647a);
        t5.g.j(this.f23647a);
        this.f23647a.k(bVar.a());
    }
}
