package h1;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f9679a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f9680b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f9681c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f9682d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f9683e = 0;

    static {
        long j = 3;
        long j7 = j << 32;
        f9679a = (0 & 4294967295L) | j7;
        f9680b = (1 & 4294967295L) | j7;
        f9681c = j7 | (2 & 4294967295L);
        f9682d = (j & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j, long j7) {
        return j == j7;
    }

    public static String b(long j) {
        return a(j, f9679a) ? "Rgb" : a(j, f9680b) ? "Xyz" : a(j, f9681c) ? "Lab" : a(j, f9682d) ? "Cmyk" : "Unknown";
    }
}
