package z0;

/* loaded from: classes.dex */
public interface k extends m {
    @Override // z0.m
    default Object a(ar.n nVar, Object obj) {
        return nVar.w(obj, this);
    }

    @Override // z0.m
    default boolean b(ar.k kVar) {
        return ((Boolean) kVar.a(this)).booleanValue();
    }
}
