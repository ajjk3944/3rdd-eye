package c0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final l f3088a;

    static {
        c cVar = d.f3066a;
        f3088a = new l();
    }

    public static final l a(n0.p pVar) {
        Object obj = d.f3067b;
        z0.c cVar = z0.b.H;
        if (obj.equals(obj) && cVar.equals(cVar)) {
            pVar.S(-1446569784);
            pVar.o(false);
            return f3088a;
        }
        pVar.S(-1446515937);
        boolean zE = pVar.e(obj) | pVar.e(cVar);
        Object objI = pVar.I();
        if (zE || objI == n0.j.f17190a) {
            objI = new l();
            pVar.b0(objI);
        }
        l lVar = (l) objI;
        pVar.o(false);
        return lVar;
    }
}
