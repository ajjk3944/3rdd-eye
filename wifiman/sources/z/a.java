package Z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25061a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25062b;

    public a(Object obj, Object obj2) {
        this.f25061a = obj;
        this.f25062b = obj2;
    }

    public final boolean a() {
        return this.f25062b != a0.c.f25713a;
    }

    public final boolean b() {
        return this.f25061a != a0.c.f25713a;
    }

    public final Object c() {
        return this.f25062b;
    }

    public final Object d() {
        return this.f25061a;
    }

    public final a e(Object obj) {
        return new a(this.f25061a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f25062b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        a0.c cVar = a0.c.f25713a;
        this(cVar, cVar);
    }

    public a(Object obj) {
        this(obj, a0.c.f25713a);
    }
}
