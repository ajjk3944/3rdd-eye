package y5;

import d6.g;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f25128a;

    public a(f fVar) {
        this.f25128a = fVar;
    }

    public static a a(b bVar) {
        f fVar = (f) bVar;
        g.c(bVar, "AdSession is null");
        g.j(fVar);
        g.g(fVar);
        a aVar = new a(fVar);
        fVar.p().g(aVar);
        return aVar;
    }

    public void b() {
        g.g(this.f25128a);
        g.i(this.f25128a);
        if (!this.f25128a.m()) {
            try {
                this.f25128a.d();
            } catch (Exception unused) {
            }
        }
        if (this.f25128a.m()) {
            this.f25128a.s();
        }
    }

    public void c() {
        g.f(this.f25128a);
        g.i(this.f25128a);
        this.f25128a.t();
    }
}
