package Fi;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6685a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6686b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6687c;

    public a(Object obj, Object obj2, Object obj3) {
        this.f6685a = obj;
        this.f6686b = obj2;
        this.f6687c = obj3;
    }

    public final boolean a() {
        return this.f6687c != Hi.c.f7979a;
    }

    public final boolean b() {
        return this.f6686b != Hi.c.f7979a;
    }

    public final Object c() {
        return this.f6687c;
    }

    public final Object d() {
        return this.f6686b;
    }

    public final Object e() {
        return this.f6685a;
    }

    public final a f(Object obj) {
        return new a(this.f6685a, this.f6686b, obj);
    }

    public final a g(Object obj) {
        return new a(this.f6685a, obj, this.f6687c);
    }

    public final a h(Object obj) {
        return new a(obj, this.f6686b, this.f6687c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Object obj) {
        Hi.c cVar = Hi.c.f7979a;
        this(obj, cVar, cVar);
    }

    public a(Object obj, Object obj2) {
        this(obj, obj2, Hi.c.f7979a);
    }
}
