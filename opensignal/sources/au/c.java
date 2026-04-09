package au;

import br.b0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final pq.c[] f2320a = new pq.c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final bu.t f2321b = new bu.t("NULL", 0);

    public static final Object a(pq.h hVar, Object obj, Object obj2, ar.n nVar, pq.c cVar) {
        Object objW;
        Object objL = bu.a.l(hVar, obj2);
        try {
            x xVar = new x(cVar, hVar);
            if (nVar == null) {
                objW = xu.l.d0(nVar, obj, xVar);
            } else {
                b0.c(2, nVar);
                objW = nVar.w(obj, xVar);
            }
            bu.a.g(hVar, objL);
            if (objW == qq.a.COROUTINE_SUSPENDED) {
                br.l.e(cVar, "frame");
            }
            return objW;
        } catch (Throwable th2) {
            bu.a.g(hVar, objL);
            throw th2;
        }
    }
}
