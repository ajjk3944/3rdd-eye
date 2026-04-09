package h2;

/* loaded from: classes.dex */
public final class x implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public static final x f9883a = new x();

    @Override // ar.k
    public final Object a(Object obj) {
        if (br.l.a(obj, Boolean.FALSE)) {
            return new g1.r(g1.r.f9269g);
        }
        br.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
        return new g1.r(g1.f0.b(((Integer) obj).intValue()));
    }
}
