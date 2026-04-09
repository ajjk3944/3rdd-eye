package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t implements m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f1058b = new t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1059a;

    public /* synthetic */ t(int i4) {
        this.f1059a = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final w0 a(Class cls) {
        switch (this.f1059a) {
            case 0:
                if (!w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (w0) w.d(cls.asSubclass(w.class)).c(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean b(Class cls) {
        switch (this.f1059a) {
            case 0:
                return w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
