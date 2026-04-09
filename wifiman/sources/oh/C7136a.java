package oh;

/* renamed from: oh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C7136a {

    /* renamed from: a, reason: collision with root package name */
    public static final C7136a f55704a = new C7136a();

    /* renamed from: b, reason: collision with root package name */
    public static final double f55705b = Math.log(2.0d);

    /* renamed from: c, reason: collision with root package name */
    public static final double f55706c;

    /* renamed from: d, reason: collision with root package name */
    public static final double f55707d;

    /* renamed from: e, reason: collision with root package name */
    public static final double f55708e;

    /* renamed from: f, reason: collision with root package name */
    public static final double f55709f;

    /* renamed from: g, reason: collision with root package name */
    public static final double f55710g;

    static {
        double dUlp = Math.ulp(1.0d);
        f55706c = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        f55707d = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f55708e = dSqrt2;
        double d10 = 1;
        f55709f = d10 / dSqrt;
        f55710g = d10 / dSqrt2;
    }

    private C7136a() {
    }
}
