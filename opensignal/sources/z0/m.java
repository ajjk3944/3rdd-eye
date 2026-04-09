package z0;

/* loaded from: classes.dex */
public interface m {
    Object a(ar.n nVar, Object obj);

    boolean b(ar.k kVar);

    default m c(m mVar) {
        return mVar == j.f26494a ? this : new g(this, mVar);
    }
}
