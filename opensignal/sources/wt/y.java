package wt;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f24672a;

    static {
        String property;
        a0 a0Var;
        int i10 = bu.u.f2991a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            du.f fVar = d0.f24610a;
            xt.c cVar = bu.n.f2983a;
            xt.c cVar2 = cVar.f25527y;
            a0Var = cVar;
            if (cVar == null) {
                a0Var = x.F;
            }
        } else {
            a0Var = x.F;
        }
        f24672a = a0Var;
    }
}
