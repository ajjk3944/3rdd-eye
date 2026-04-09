package D3;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private static O f2845a;

    private O() {
    }

    public static synchronized O a() {
        try {
            if (f2845a == null) {
                f2845a = new O();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2845a;
    }
}
