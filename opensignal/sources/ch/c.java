package ch;

/* loaded from: classes.dex */
public final class c extends br.n implements ar.a {
    public static final c B;
    public static final c D;
    public static final c E;
    public static final c F;
    public static final c G;
    public static final c H;

    /* renamed from: g, reason: collision with root package name */
    public static final c f3770g;

    /* renamed from: r, reason: collision with root package name */
    public static final c f3771r;

    /* renamed from: x, reason: collision with root package name */
    public static final c f3772x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f3773y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3774d;

    static {
        int i10 = 0;
        f3770g = new c(i10, 0);
        f3771r = new c(i10, 1);
        f3772x = new c(i10, 2);
        f3773y = new c(i10, 3);
        B = new c(i10, 4);
        D = new c(i10, 5);
        E = new c(i10, 6);
        F = new c(i10, 7);
        G = new c(i10, 8);
        H = new c(i10, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f3774d = i11;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f3774d) {
            case 0:
                return new ai.f(8);
            case 1:
                return new ai.g(10);
            case 2:
                return new ai.f(9);
            case 3:
                return new ai.g(12);
            case 4:
                return new jk.d();
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new jk.f();
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new zh.c();
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new ai.f(2);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new ai.f(20);
            default:
                return new ai.g(23);
        }
    }
}
