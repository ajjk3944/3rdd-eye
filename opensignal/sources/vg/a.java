package vg;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f23909g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f23910a;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f23911d;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f23911d = f23909g;
        aVar.f23910a = bVar;
        return aVar;
    }

    @Override // kq.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f23911d;
        Object obj3 = f23909g;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f23911d;
                if (obj == obj3) {
                    obj = this.f23910a.get();
                    Object obj4 = this.f23911d;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f23911d = obj;
                    this.f23910a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
