package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class u0 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1369a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f1370b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1371c;

    public u0(l1 l1Var, q qVar, a aVar) {
        this.f1370b = l1Var;
        qVar.getClass();
        this.f1371c = qVar;
        this.f1369a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void a(Object obj, Object obj2) {
        e1.k(this.f1370b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void b(Object obj, l0 l0Var) {
        this.f1371c.getClass();
        w.g.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void c(Object obj) {
        this.f1370b.getClass();
        k1 k1Var = ((a0) obj).unknownFields;
        if (k1Var.f1310e) {
            k1Var.f1310e = false;
        }
        this.f1371c.getClass();
        w.g.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean d(Object obj) {
        this.f1371c.getClass();
        w.g.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final int e(a0 a0Var) {
        this.f1370b.getClass();
        k1 k1Var = a0Var.unknownFields;
        int i10 = k1Var.f1309d;
        if (i10 != -1) {
            return i10;
        }
        int iT = 0;
        for (int i11 = 0; i11 < k1Var.f1306a; i11++) {
            int i12 = k1Var.f1307b[i11] >>> 3;
            iT += n.T(3, (g) k1Var.f1308c[i11]) + n.W(i12) + n.V(2) + (n.V(1) * 2);
        }
        k1Var.f1309d = iT;
        return iT;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final int f(a0 a0Var) {
        this.f1370b.getClass();
        return a0Var.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean g(a0 a0Var, a0 a0Var2) {
        this.f1370b.getClass();
        return a0Var.unknownFields.equals(a0Var2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void h(Object obj, l lVar, p pVar) {
        this.f1370b.getClass();
        l1.a(obj);
        this.f1371c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final a0 i() {
        a aVar = this.f1369a;
        if (aVar instanceof a0) {
            return ((a0) aVar).i();
        }
        a0 a0Var = (a0) aVar;
        a0Var.getClass();
        return ((x) a0Var.c(z.NEW_BUILDER)).b();
    }
}
