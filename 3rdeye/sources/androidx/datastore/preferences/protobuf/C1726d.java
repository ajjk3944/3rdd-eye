package androidx.datastore.preferences.protobuf;

/* compiled from: Android.java */
/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f15588a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f15589b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f15588a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f15589b = cls2 != null;
    }

    public static boolean a() {
        return (f15588a == null || f15589b) ? false : true;
    }
}
