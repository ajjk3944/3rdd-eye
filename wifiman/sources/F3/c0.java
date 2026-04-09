package F3;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static b0 f5892a;

    public static synchronized T a(O o10) {
        try {
            if (f5892a == null) {
                f5892a = new b0(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) f5892a.b(o10);
    }

    public static synchronized T b(String str) {
        return a(O.d("object-detection").c());
    }
}
