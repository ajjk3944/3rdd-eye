package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3981q {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC3979o f30948a = new C3980p();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC3979o f30949b = c();

    static AbstractC3979o a() {
        AbstractC3979o abstractC3979o = f30949b;
        if (abstractC3979o != null) {
            return abstractC3979o;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC3979o b() {
        return f30948a;
    }

    private static AbstractC3979o c() {
        try {
            return (AbstractC3979o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
