package S3;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3481c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile c f3482a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3483b;

    public static c b(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.f3483b = f3481c;
        bVar.f3482a = cVar;
        return bVar;
    }

    @Override // S3.c, Y2.O
    public final Object a() {
        Object objA;
        Object obj = this.f3483b;
        Object obj2 = f3481c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f3483b;
                if (objA == obj2) {
                    objA = this.f3482a.a();
                    Object obj3 = this.f3483b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f3483b = objA;
                    this.f3482a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
