package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class k0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public r0[] f1304a;

    @Override // androidx.datastore.preferences.protobuf.r0
    public final c1 a(Class cls) {
        for (r0 r0Var : this.f1304a) {
            if (r0Var.b(cls)) {
                return r0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean b(Class cls) {
        for (r0 r0Var : this.f1304a) {
            if (r0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
