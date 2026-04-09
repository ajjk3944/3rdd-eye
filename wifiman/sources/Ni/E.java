package Ni;

/* loaded from: classes4.dex */
abstract /* synthetic */ class E {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16575a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f16575a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
