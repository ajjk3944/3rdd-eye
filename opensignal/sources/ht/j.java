package ht;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ir.v[] f10912a;

    /* renamed from: b, reason: collision with root package name */
    public static final c9.l f10913b;

    static {
        br.y yVar = br.x.f2918a;
        f10912a = new ir.v[]{yVar.f(new br.q(yVar.c(j.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        bm.e eVar = i0.f10910d;
        ir.d dVarB = yVar.b(i.class);
        eVar.getClass();
        int iZ = eVar.z(dVarB);
        c9.l lVar = new c9.l();
        lVar.f3420a = iZ;
        f10913b = lVar;
    }

    public static final sr.h a(i0 i0Var) {
        sr.h hVar;
        br.l.e(i0Var, "<this>");
        i iVar = (i) f10913b.b(f10912a[0], i0Var);
        return (iVar == null || (hVar = iVar.f10909a) == null) ? sr.g.f22217a : hVar;
    }
}
