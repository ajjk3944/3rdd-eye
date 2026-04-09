package Gi;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7503a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7504b;

    public a(Object obj, Object obj2) {
        this.f7503a = obj;
        this.f7504b = obj2;
    }

    public final boolean a() {
        return this.f7504b != Hi.c.f7979a;
    }

    public final boolean b() {
        return this.f7503a != Hi.c.f7979a;
    }

    public final Object c() {
        return this.f7504b;
    }

    public final Object d() {
        return this.f7503a;
    }

    public final a e(Object obj) {
        return new a(this.f7503a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f7504b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        Hi.c cVar = Hi.c.f7979a;
        this(cVar, cVar);
    }

    public a(Object obj) {
        this(obj, Hi.c.f7979a);
    }
}
