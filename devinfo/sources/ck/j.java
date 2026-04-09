package ck;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements c, ek.d {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2899b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final c f2900a;
    private volatile Object result;

    public j(c cVar) {
        dk.a aVar = dk.a.f22275a;
        this.f2900a = cVar;
        this.result = aVar;
    }

    @Override // ek.d
    public final ek.d getCallerFrame() {
        c cVar = this.f2900a;
        if (cVar instanceof ek.d) {
            return (ek.d) cVar;
        }
        return null;
    }

    @Override // ck.c
    public final h getContext() {
        return this.f2900a.getContext();
    }

    @Override // ck.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            dk.a aVar = dk.a.f22276b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2899b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            dk.a aVar2 = dk.a.f22275a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2899b;
            dk.a aVar3 = dk.a.f22277c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f2900a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f2900a;
    }
}
