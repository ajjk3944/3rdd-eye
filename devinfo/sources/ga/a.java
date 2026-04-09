package ga;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements xj.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f24621c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f24622a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f24623b;

    public static xj.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f24623b = f24621c;
        aVar.f24622a = bVar;
        return aVar;
    }

    @Override // xj.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f24623b;
        Object obj3 = f24621c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f24623b;
                if (obj == obj3) {
                    obj = this.f24622a.get();
                    Object obj4 = this.f24623b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f24623b = obj;
                    this.f24622a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
