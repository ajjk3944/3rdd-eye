package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1037a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f1038b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1039c;

    public p0(f1 f1Var, p pVar, a aVar) {
        this.f1038b = f1Var;
        pVar.getClass();
        this.f1039c = pVar;
        this.f1037a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void a(Object obj, Object obj2) {
        y0.k(this.f1038b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void b(Object obj, g0 g0Var) {
        this.f1039c.getClass();
        d.h.C(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void c(Object obj) {
        this.f1038b.getClass();
        e1 e1Var = ((w) obj).unknownFields;
        if (e1Var.f968e) {
            e1Var.f968e = false;
        }
        this.f1039c.getClass();
        d.h.C(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean d(Object obj) {
        this.f1039c.getClass();
        d.h.C(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final int e(w wVar) {
        this.f1038b.getClass();
        e1 e1Var = wVar.unknownFields;
        int i4 = e1Var.f967d;
        if (i4 != -1) {
            return i4;
        }
        int iJ = 0;
        for (int i10 = 0; i10 < e1Var.f964a; i10++) {
            int i11 = e1Var.f965b[i10] >>> 3;
            iJ += m.J(3, (g) e1Var.f966c[i10]) + m.M(i11) + m.L(2) + (m.L(1) * 2);
        }
        e1Var.f967d = iJ;
        return iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final int f(w wVar) {
        this.f1038b.getClass();
        return wVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean g(w wVar, w wVar2) {
        this.f1038b.getClass();
        return wVar.unknownFields.equals(wVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void h(Object obj, k kVar, o oVar) {
        this.f1038b.getClass();
        f1.a(obj);
        this.f1039c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final w i() {
        a aVar = this.f1037a;
        return aVar instanceof w ? ((w) aVar).i() : ((u) ((w) aVar).c(5)).b();
    }
}
