package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3977m {

    /* renamed from: a, reason: collision with root package name */
    static final Class f30910a = c();

    public static C3978n a() {
        if (f30910a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C3978n.f30939e;
    }

    private static final C3978n b(String str) {
        return (C3978n) f30910a.getDeclaredMethod(str, null).invoke(null, null);
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
