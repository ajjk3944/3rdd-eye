package H9;

import A9.AbstractC0565a;
import A9.C;
import X8.a;
import b9.x;
import f9.InterfaceC4350h;
import java.util.concurrent.CancellationException;

/* compiled from: RxSingle.kt */
/* loaded from: classes3.dex */
public final class b<T> extends AbstractC0565a<T> {

    /* renamed from: e, reason: collision with root package name */
    public final a.C0198a f2337e;

    public b(InterfaceC4350h interfaceC4350h, a.C0198a c0198a) {
        super(interfaceC4350h, false, true);
        this.f2337e = c0198a;
    }

    @Override // A9.AbstractC0565a
    public final void d0(boolean z10, Throwable th) {
        try {
            if (this.f2337e.a(th)) {
                return;
            }
        } catch (Throwable th2) {
            x.a(th, th2);
        }
        if (th instanceof CancellationException) {
            return;
        }
        try {
            Z8.a.a(th);
        } catch (Throwable th3) {
            x.a(th, th3);
            C.a(this.f219d, th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [P8.b, java.util.concurrent.atomic.AtomicReference] */
    @Override // A9.AbstractC0565a
    public final void e0(T t10) {
        R8.a andSet;
        try {
            a.C0198a c0198a = this.f2337e;
            R8.a aVar = c0198a.get();
            U8.b bVar = U8.b.DISPOSED;
            if (aVar == bVar || (andSet = c0198a.getAndSet(bVar)) == bVar) {
                return;
            }
            ?? r02 = c0198a.f13661b;
            try {
                if (t10 == null) {
                    r02.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    r02.onSuccess(t10);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (th2 instanceof CancellationException) {
                return;
            }
            try {
                Z8.a.a(th2);
            } catch (Throwable th3) {
                x.a(th2, th3);
                C.a(this.f219d, th2);
            }
        }
    }
}
