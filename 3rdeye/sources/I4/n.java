package I4;

import g5.InterfaceC4392b;

/* compiled from: Lazy.java */
/* loaded from: classes2.dex */
public final class n<T> implements InterfaceC4392b<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2471c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2472a = f2471c;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC4392b<T> f2473b;

    public n(InterfaceC4392b<T> interfaceC4392b) {
        this.f2473b = interfaceC4392b;
    }

    @Override // g5.InterfaceC4392b
    public final T get() {
        T t10;
        T t11 = (T) this.f2472a;
        Object obj = f2471c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f2472a;
                if (t10 == obj) {
                    t10 = this.f2473b.get();
                    this.f2472a = t10;
                    this.f2473b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }
}
