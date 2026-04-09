package g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final o f24153a;

    static {
        l lVar = e.f24108a;
        f24153a = new o();
    }

    public static final o a(u0.p pVar) {
        Object obj = e.f24109b;
        i1.c cVar = i1.b.f25540l;
        if (obj.equals(obj) && cVar.equals(cVar)) {
            pVar.W(-1446604504);
            pVar.p(false);
            return f24153a;
        }
        pVar.W(-1446550657);
        boolean zF = pVar.f(obj) | pVar.f(cVar);
        Object objL = pVar.L();
        if (zF || objL == u0.l.f34851a) {
            objL = new o();
            pVar.g0(objL);
        }
        o oVar = (o) objL;
        pVar.p(false);
        return oVar;
    }
}
