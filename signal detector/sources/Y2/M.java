package Y2;

/* loaded from: classes.dex */
public final class M implements O {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4275c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile N f4276a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f4277b;

    /* JADX WARN: Multi-variable type inference failed */
    public static M b(N n6) {
        if (n6 instanceof M) {
            return (M) n6;
        }
        M m6 = new M();
        m6.f4277b = f4275c;
        m6.f4276a = n6;
        return m6;
    }

    @Override // Y2.O
    public final Object a() {
        Object obj = this.f4277b;
        Object obj2 = f4275c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f4277b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objA = this.f4276a.a();
                Object obj4 = this.f4277b;
                if (obj4 != obj2 && obj4 != objA) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objA + ". This is likely due to a circular dependency.");
                }
                this.f4277b = objA;
                this.f4276a = null;
                return objA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
