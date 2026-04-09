package kotlinx.coroutines.internal;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22529a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f22529a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
