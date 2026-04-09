package D3;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    private static M f2844a;

    public static synchronized F a(B b10) {
        try {
            if (f2844a == null) {
                f2844a = new M(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (F) f2844a.b(b10);
    }

    public static synchronized F b(String str) {
        return a(B.d("common").c());
    }
}
