package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class E implements d0 {

    /* renamed from: b, reason: collision with root package name */
    private static final L f30778b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final L f30779a;

    static class a implements L {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.L
        public K a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.L
        public boolean b(Class cls) {
            return false;
        }
    }

    private static class b implements L {

        /* renamed from: a, reason: collision with root package name */
        private L[] f30780a;

        b(L... lArr) {
            this.f30780a = lArr;
        }

        @Override // androidx.datastore.preferences.protobuf.L
        public K a(Class cls) {
            for (L l10 : this.f30780a) {
                if (l10.b(cls)) {
                    return l10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.L
        public boolean b(Class cls) {
            for (L l10 : this.f30780a) {
                if (l10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public E() {
        this(b());
    }

    private static L b() {
        return new b(C3984u.c(), c());
    }

    private static L c() {
        try {
            return (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f30778b;
        }
    }

    private static boolean d(K k10) {
        return k10.getSyntax() == X.PROTO2;
    }

    private static c0 e(Class cls, K k10) {
        return AbstractC3985v.class.isAssignableFrom(cls) ? d(k10) ? P.M(cls, k10, U.b(), C.b(), e0.L(), AbstractC3981q.b(), J.b()) : P.M(cls, k10, U.b(), C.b(), e0.L(), null, J.b()) : d(k10) ? P.M(cls, k10, U.a(), C.a(), e0.G(), AbstractC3981q.a(), J.a()) : P.M(cls, k10, U.a(), C.a(), e0.H(), null, J.a());
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public c0 a(Class cls) {
        e0.I(cls);
        K kA = this.f30779a.a(cls);
        return kA.a() ? AbstractC3985v.class.isAssignableFrom(cls) ? Q.l(e0.L(), AbstractC3981q.b(), kA.b()) : Q.l(e0.G(), AbstractC3981q.a(), kA.b()) : e(cls, kA);
    }

    private E(L l10) {
        this.f30779a = (L) AbstractC3987x.b(l10, "messageInfoFactory");
    }
}
