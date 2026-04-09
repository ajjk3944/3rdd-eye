package bf;

/* loaded from: classes.dex */
public final class q implements eg.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2733c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2734a = f2733c;

    /* renamed from: b, reason: collision with root package name */
    public volatile eg.b f2735b;

    public q(eg.b bVar) {
        this.f2735b = bVar;
    }

    @Override // eg.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f2734a;
        Object obj3 = f2733c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f2734a;
                if (obj == obj3) {
                    obj = this.f2735b.get();
                    this.f2734a = obj;
                    this.f2735b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
