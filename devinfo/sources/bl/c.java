package bl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ck.c[] f2284a = new ck.c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final cl.u f2285b = new cl.u("NULL", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final cl.u f2286c = new cl.u("UNINITIALIZED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final cl.u f2287d = new cl.u("DONE", 0);

    public static final Object a(ck.h hVar, Object obj, Object obj2, mk.e eVar, ck.c cVar) {
        Object objInvoke;
        Object objN = cl.b.n(hVar, obj2);
        try {
            b0 b0Var = new b0(cVar, hVar);
            if (a0.g.C(eVar)) {
                nk.x.d(2, eVar);
                objInvoke = eVar.invoke(obj, b0Var);
            } else {
                objInvoke = a.a.w(eVar, obj, b0Var);
            }
            cl.b.g(hVar, objN);
            if (objInvoke == dk.a.f22275a) {
                nk.k.e(cVar, "frame");
            }
            return objInvoke;
        } catch (Throwable th2) {
            cl.b.g(hVar, objN);
            throw th2;
        }
    }
}
