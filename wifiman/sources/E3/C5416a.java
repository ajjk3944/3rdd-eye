package e3;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5416a implements Jg.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f46169c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Jg.a f46170a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f46171b = f46169c;

    private C5416a(Jg.a aVar) {
        this.f46170a = aVar;
    }

    public static Jg.a a(Jg.a aVar) {
        AbstractC5419d.b(aVar);
        return aVar instanceof C5416a ? aVar : new C5416a(aVar);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f46169c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // Jg.a
    public Object get() {
        Object obj = this.f46171b;
        Object obj2 = f46169c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f46171b;
                    if (obj == obj2) {
                        obj = this.f46170a.get();
                        this.f46171b = b(this.f46171b, obj);
                        this.f46170a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
