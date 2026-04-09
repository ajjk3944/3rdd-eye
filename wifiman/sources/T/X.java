package T;

/* loaded from: classes.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    private final K0 f20990a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20991b;

    /* renamed from: c, reason: collision with root package name */
    private Object f20992c;

    public X(K0 k02, int i10, Object obj) {
        this.f20990a = k02;
        this.f20991b = i10;
        this.f20992c = obj;
    }

    public final Object a() {
        return this.f20992c;
    }

    public final int b() {
        return this.f20991b;
    }

    public final K0 c() {
        return this.f20990a;
    }

    public final boolean d() {
        return this.f20990a.u(this.f20992c);
    }

    public final void e(Object obj) {
        this.f20992c = obj;
    }
}
