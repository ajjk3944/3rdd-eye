package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.y1;

/* loaded from: classes4.dex */
public abstract class b extends kotlinx.coroutines.a implements a {

    /* renamed from: d, reason: collision with root package name */
    public final a f22290d;

    public b(kotlin.coroutines.d dVar, a aVar, boolean z10, boolean z11) {
        super(dVar, z10, z11);
        this.f22290d = aVar;
    }

    @Override // kotlinx.coroutines.channels.o
    public boolean A(Throwable th) {
        return this.f22290d.A(th);
    }

    @Override // kotlinx.coroutines.channels.o
    public boolean B() {
        return this.f22290d.B();
    }

    @Override // kotlinx.coroutines.y1
    public void N(Throwable th) {
        CancellationException cancellationExceptionJ0 = y1.J0(this, th, null, 1, null);
        this.f22290d.a(cancellationExceptionJ0);
        L(cancellationExceptionJ0);
    }

    public final a U0() {
        return this.f22290d;
    }

    @Override // kotlinx.coroutines.y1, kotlinx.coroutines.r1, kotlinx.coroutines.channels.n
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(R(), null, this);
        }
        N(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.o
    public Object b(Object obj, c9.c cVar) {
        return this.f22290d.b(obj, cVar);
    }

    @Override // kotlinx.coroutines.channels.n
    public Object c(c9.c cVar) {
        Object objC = this.f22290d.c(cVar);
        kotlin.coroutines.intrinsics.a.f();
        return objC;
    }

    @Override // kotlinx.coroutines.channels.n
    public c iterator() {
        return this.f22290d.iterator();
    }

    @Override // kotlinx.coroutines.channels.o
    public Object n(Object obj) {
        return this.f22290d.n(obj);
    }

    @Override // kotlinx.coroutines.channels.n
    public kotlinx.coroutines.selects.e u() {
        return this.f22290d.u();
    }

    @Override // kotlinx.coroutines.channels.n
    public Object v() {
        return this.f22290d.v();
    }

    @Override // kotlinx.coroutines.channels.o
    public void w(l9.l lVar) {
        this.f22290d.w(lVar);
    }

    @Override // kotlinx.coroutines.channels.n
    public Object x(c9.c cVar) {
        return this.f22290d.x(cVar);
    }
}
