package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class w implements r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w f1373b = new w(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1374a;

    public /* synthetic */ w(int i10) {
        this.f1374a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final c1 a(Class cls) {
        switch (this.f1374a) {
            case 0:
                if (!a0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (c1) a0.d(cls.asSubclass(a0.class)).c(z.BUILD_MESSAGE_INFO);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean b(Class cls) {
        switch (this.f1374a) {
            case 0:
                return a0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
