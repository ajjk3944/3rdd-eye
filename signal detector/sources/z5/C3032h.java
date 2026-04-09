package z5;

import c5.C0412i;
import h5.InterfaceC2370d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: z5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3032h extends V {

    /* renamed from: e, reason: collision with root package name */
    public final C3030f f24534e;

    public C3032h(C3030f c3030f) {
        this.f24534e = c3030f;
    }

    @Override // p5.l
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        o((Throwable) obj);
        return C0412i.f5929a;
    }

    @Override // z5.X
    public final void o(Throwable th) {
        c0 c0VarN = n();
        C3030f c3030f = this.f24534e;
        Throwable thR = c3030f.r(c0VarN);
        if (c3030f.x()) {
            InterfaceC2370d interfaceC2370d = c3030f.f24531d;
            q5.i.c(interfaceC2370d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            E5.h hVar = (E5.h) interfaceC2370d;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E5.h.f1385h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                B2.a aVar = E5.a.f1375d;
                if (!q5.i.a(obj, aVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, thR)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                        break;
                    }
                }
                return;
            }
        }
        c3030f.o(thR);
        if (c3030f.x()) {
            return;
        }
        c3030f.p();
    }
}
