package z9;

/* loaded from: classes4.dex */
public abstract class k {
    public static final a a(a from, l9.l builderAction) {
        kotlin.jvm.internal.p.e(from, "from");
        kotlin.jvm.internal.p.e(builderAction, "builderAction");
        c cVar = new c(from);
        builderAction.invoke(cVar);
        return new j(cVar.a(), cVar.b());
    }

    public static /* synthetic */ a b(a aVar, l9.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = a.f25415d;
        }
        return a(aVar, lVar);
    }
}
