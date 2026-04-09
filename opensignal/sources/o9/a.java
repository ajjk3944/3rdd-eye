package o9;

/* loaded from: classes.dex */
public final class a implements kq.a {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f19166g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f19167a;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f19168d;

    public static kq.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f19168d = f19166g;
        aVar.f19167a = bVar;
        return aVar;
    }

    @Override // kq.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f19168d;
        Object obj3 = f19166g;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f19168d;
                if (obj == obj3) {
                    obj = this.f19167a.get();
                    Object obj4 = this.f19168d;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f19168d = obj;
                    this.f19167a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
