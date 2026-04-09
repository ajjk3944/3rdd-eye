package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3984u implements L {

    /* renamed from: a, reason: collision with root package name */
    private static final C3984u f30959a = new C3984u();

    private C3984u() {
    }

    public static C3984u c() {
        return f30959a;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public K a(Class cls) {
        if (!AbstractC3985v.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (K) AbstractC3985v.s(cls.asSubclass(AbstractC3985v.class)).j();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public boolean b(Class cls) {
        return AbstractC3985v.class.isAssignableFrom(cls);
    }
}
