package y1;

/* loaded from: classes.dex */
public final class v1 implements w1, r1.i, k2.f, s1, r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f25786a = new v1();

    /* renamed from: b, reason: collision with root package name */
    public static final b2 f25787b = new b2();

    @Override // y1.w1
    public ar.a a(a aVar) {
        if (!aVar.isAttachedToWindow()) {
            br.w wVar = new br.w();
            o4.z zVar = new o4.z(1, aVar, wVar);
            aVar.addOnAttachStateChangeListener(zVar);
            wVar.f2917a = new qr.g(aVar, 9, zVar);
            return new pp.c(18, wVar);
        }
        androidx.lifecycle.v vVarC = androidx.lifecycle.o0.c(aVar);
        if (vVarC != null) {
            return e0.c(aVar, vVarC.h());
        }
        u1.a.c("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
        throw new bf.n();
    }
}
