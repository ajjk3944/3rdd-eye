package ku;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a implements gu.a {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // gu.a
    public Object deserialize(ju.c cVar) {
        return e(cVar);
    }

    public final Object e(ju.c cVar) {
        Object objA = a();
        int iB = b(objA);
        ju.a aVarB = cVar.b(getDescriptor());
        while (true) {
            int iT = aVarB.t(getDescriptor());
            if (iT == -1) {
                aVarB.c(getDescriptor());
                return h(objA);
            }
            f(aVarB, iT + iB, objA);
        }
    }

    public abstract void f(ju.a aVar, int i10, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
