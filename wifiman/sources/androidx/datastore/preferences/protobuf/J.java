package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class J {

    /* renamed from: a, reason: collision with root package name */
    private static final H f30791a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final H f30792b = new I();

    static H a() {
        return f30791a;
    }

    static H b() {
        return f30792b;
    }

    private static H c() {
        try {
            return (H) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
