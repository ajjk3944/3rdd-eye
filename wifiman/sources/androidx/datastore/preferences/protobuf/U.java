package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private static final S f30816a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final S f30817b = new T();

    static S a() {
        return f30816a;
    }

    static S b() {
        return f30817b;
    }

    private static S c() {
        try {
            return (S) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
