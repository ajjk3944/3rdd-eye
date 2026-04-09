package F9;

import A9.M0;
import f9.C4351i;
import f9.InterfaceC4350h;

/* compiled from: ThreadContext.kt */
/* loaded from: classes3.dex */
public final class B<T> implements M0<T> {

    /* renamed from: b, reason: collision with root package name */
    public final y1.k f1734b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadLocal<T> f1735c;

    /* renamed from: d, reason: collision with root package name */
    public final C f1736d;

    public B(y1.k kVar, ThreadLocal threadLocal) {
        this.f1734b = kVar;
        this.f1735c = threadLocal;
        this.f1736d = new C(threadLocal);
    }

    @Override // A9.M0
    public final T W(InterfaceC4350h interfaceC4350h) {
        ThreadLocal<T> threadLocal = this.f1735c;
        T t10 = (T) threadLocal.get();
        threadLocal.set(this.f1734b);
        return t10;
    }

    @Override // f9.InterfaceC4350h
    public final <R> R fold(R r9, p9.p<? super R, ? super InterfaceC4350h.a, ? extends R> pVar) {
        return (R) InterfaceC4350h.a.C0456a.a(this, r9, pVar);
    }

    @Override // f9.InterfaceC4350h
    public final <E extends InterfaceC4350h.a> E get(InterfaceC4350h.b<E> bVar) {
        if (this.f1736d.equals(bVar)) {
            return this;
        }
        return null;
    }

    @Override // f9.InterfaceC4350h.a
    public final InterfaceC4350h.b<?> getKey() {
        return this.f1736d;
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h minusKey(InterfaceC4350h.b<?> bVar) {
        return this.f1736d.equals(bVar) ? C4351i.f37871b : this;
    }

    @Override // f9.InterfaceC4350h
    public final InterfaceC4350h plus(InterfaceC4350h interfaceC4350h) {
        return InterfaceC4350h.a.C0456a.d(this, interfaceC4350h);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f1734b + ", threadLocal = " + this.f1735c + ')';
    }

    @Override // A9.M0
    public final void u0(Object obj) {
        this.f1735c.set(obj);
    }
}
