package b9;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p9.InterfaceC5480a;

/* compiled from: LazyJVM.kt */
/* loaded from: classes3.dex */
public final class o<T> implements InterfaceC2000g<T>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<o<?>, Object> f18087d = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "c");

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC5480a<? extends T> f18088b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f18089c;

    public o() {
        throw null;
    }

    @Override // b9.InterfaceC2000g
    public final T getValue() {
        T t10 = (T) this.f18089c;
        x xVar = x.f18108a;
        if (t10 != xVar) {
            return t10;
        }
        InterfaceC5480a<? extends T> interfaceC5480a = this.f18088b;
        if (interfaceC5480a != null) {
            T tInvoke = interfaceC5480a.invoke();
            AtomicReferenceFieldUpdater<o<?>, Object> atomicReferenceFieldUpdater = f18087d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != xVar) {
                }
            }
            this.f18088b = null;
            return tInvoke;
        }
        return (T) this.f18089c;
    }

    public final String toString() {
        return this.f18089c != x.f18108a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
