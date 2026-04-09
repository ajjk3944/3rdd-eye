package rf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f32938c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f32939a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f32940b;

    public static d a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f32940b = f32938c;
        aVar.f32939a = bVar;
        return aVar;
    }

    @Override // xj.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f32940b;
        Object obj3 = f32938c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f32940b;
                if (obj == obj3) {
                    obj = this.f32939a.get();
                    Object obj4 = this.f32940b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f32940b = obj;
                    this.f32939a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
