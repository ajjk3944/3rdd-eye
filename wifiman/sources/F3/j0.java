package F3;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static j0 f5922a;

    private j0() {
    }

    public static synchronized j0 a() {
        try {
            if (f5922a == null) {
                f5922a = new j0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f5922a;
    }
}
