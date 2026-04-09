package z3;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class a implements Provider {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f25322c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Provider f25323a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f25324b = f25322c;

    public a(Provider provider) {
        this.f25323a = provider;
    }

    public static Provider a(Provider provider) {
        d.b(provider);
        return provider instanceof a ? provider : new a(provider);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f25322c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj;
        Object obj2 = this.f25324b;
        Object obj3 = f25322c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f25324b;
                if (obj == obj3) {
                    obj = this.f25323a.get();
                    this.f25324b = b(this.f25324b, obj);
                    this.f25323a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
