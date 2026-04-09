package A3;

import a9.InterfaceC1676a;

/* compiled from: DoubleCheck.java */
/* loaded from: classes.dex */
public final class a<T> implements InterfaceC1676a<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f32d = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile b f33b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f34c;

    public static InterfaceC1676a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f34c = f32d;
        aVar.f33b = bVar;
        return aVar;
    }

    @Override // a9.InterfaceC1676a
    public final T get() {
        T t10;
        T t11 = (T) this.f34c;
        Object obj = f32d;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f34c;
                if (t10 == obj) {
                    t10 = this.f33b.get();
                    Object obj2 = this.f34c;
                    if (obj2 != obj && obj2 != t10) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t10 + ". This is likely due to a circular dependency.");
                    }
                    this.f34c = t10;
                    this.f33b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }
}
