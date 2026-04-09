package yj;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements f, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f37642c = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile mk.a f37643a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f37644b;

    @Override // yj.f
    public final Object getValue() {
        Object obj = this.f37644b;
        s sVar = s.f37648a;
        if (obj != sVar) {
            return obj;
        }
        mk.a aVar = this.f37643a;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37642c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != sVar) {
                }
            }
            this.f37643a = null;
            return objInvoke;
        }
        return this.f37644b;
    }

    public final String toString() {
        return this.f37644b != s.f37648a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
