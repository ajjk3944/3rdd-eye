package A9;

import F9.C0658a;
import f9.InterfaceC4347e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: JobSupport.kt */
/* renamed from: A9.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0589m extends AbstractC0598q0 {

    /* renamed from: f, reason: collision with root package name */
    public final C0583j<?> f258f;

    public C0589m(C0583j<?> c0583j) {
        this.f258f = c0583j;
    }

    @Override // A9.InterfaceC0588l0
    public final void a(Throwable th) {
        C0605u0 c0605u0I = i();
        C0583j<?> c0583j = this.f258f;
        Throwable thQ = c0583j.q(c0605u0I);
        if (c0583j.w()) {
            InterfaceC4347e<?> interfaceC4347e = c0583j.f252e;
            kotlin.jvm.internal.l.d(interfaceC4347e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            F9.i iVar = (F9.i) interfaceC4347e;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F9.i.i;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                F9.y yVar = C0658a.f1746c;
                if (!kotlin.jvm.internal.l.b(obj, yVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar, yVar, thQ)) {
                    if (atomicReferenceFieldUpdater.get(iVar) != yVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0583j.m(thQ);
        if (c0583j.w()) {
            return;
        }
        c0583j.n();
    }
}
