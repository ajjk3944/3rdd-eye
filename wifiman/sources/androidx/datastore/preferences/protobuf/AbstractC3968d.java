package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3968d {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f30831a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f30832b;

    static {
        f30832b = a("org.robolectric.Robolectric") != null;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f30831a;
    }

    static boolean c() {
        return (f30831a == null || f30832b) ? false : true;
    }
}
