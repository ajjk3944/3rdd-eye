package f9;

import b9.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: SafeContinuationJvm.kt */
/* renamed from: f9.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4352j<T> implements InterfaceC4347e<T>, h9.d {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<C4352j<?>, Object> f37872c = AtomicReferenceFieldUpdater.newUpdater(C4352j.class, Object.class, "result");

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4347e<T> f37873b;
    private volatile Object result;

    public C4352j() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4352j(InterfaceC4347e<? super T> interfaceC4347e) {
        g9.a aVar = g9.a.UNDECIDED;
        this.f37873b = interfaceC4347e;
        this.result = aVar;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        g9.a aVar = g9.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<C4352j<?>, Object> atomicReferenceFieldUpdater = f37872c;
            g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return g9.a.COROUTINE_SUSPENDED;
        }
        if (obj == g9.a.RESUMED) {
            return g9.a.COROUTINE_SUSPENDED;
        }
        if (obj instanceof m.a) {
            throw ((m.a) obj).f18086b;
        }
        return obj;
    }

    @Override // h9.d
    public final h9.d getCallerFrame() {
        InterfaceC4347e<T> interfaceC4347e = this.f37873b;
        if (interfaceC4347e instanceof h9.d) {
            return (h9.d) interfaceC4347e;
        }
        return null;
    }

    @Override // f9.InterfaceC4347e
    public final InterfaceC4350h getContext() {
        return this.f37873b.getContext();
    }

    @Override // f9.InterfaceC4347e
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            g9.a aVar = g9.a.UNDECIDED;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater<C4352j<?>, Object> atomicReferenceFieldUpdater = f37872c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater<C4352j<?>, Object> atomicReferenceFieldUpdater2 = f37872c;
            g9.a aVar3 = g9.a.RESUMED;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f37873b.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f37873b;
    }
}
