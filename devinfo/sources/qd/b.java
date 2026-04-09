package qd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f32241c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile c f32242a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f32243b;

    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.f32243b = f32241c;
        bVar.f32242a = cVar;
        return bVar;
    }

    @Override // qd.c
    public final Object b() {
        Object objB;
        Object obj = this.f32243b;
        Object obj2 = f32241c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objB = this.f32243b;
                if (objB == obj2) {
                    objB = this.f32242a.b();
                    Object obj3 = this.f32243b;
                    if (obj3 != obj2 && obj3 != objB) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objB + ". This is likely due to a circular dependency.");
                    }
                    this.f32243b = objB;
                    this.f32242a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objB;
    }
}
