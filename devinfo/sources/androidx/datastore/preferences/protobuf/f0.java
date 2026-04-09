package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public m0[] f971a;

    @Override // androidx.datastore.preferences.protobuf.m0
    public final w0 a(Class cls) {
        for (m0 m0Var : this.f971a) {
            if (m0Var.b(cls)) {
                return m0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean b(Class cls) {
        for (m0 m0Var : this.f971a) {
            if (m0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
