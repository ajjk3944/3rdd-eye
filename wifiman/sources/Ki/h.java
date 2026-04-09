package Ki;

import Ii.AbstractC3043a;
import Ii.D0;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class h extends AbstractC3043a implements g {

    /* renamed from: d, reason: collision with root package name */
    private final g f10872d;

    public h(InterfaceC5384i interfaceC5384i, g gVar, boolean z10, boolean z11) {
        super(interfaceC5384i, z10, z11);
        this.f10872d = gVar;
    }

    @Override // Ii.D0
    public void E(Throwable th2) {
        CancellationException cancellationExceptionG0 = D0.G0(this, th2, null, 1, null);
        this.f10872d.cancel(cancellationExceptionG0);
        A(cancellationExceptionG0);
    }

    public final g R0() {
        return this;
    }

    protected final g S0() {
        return this.f10872d;
    }

    @Override // Ki.w
    public Object b(Object obj, InterfaceC5380e interfaceC5380e) {
        return this.f10872d.b(obj, interfaceC5380e);
    }

    @Override // Ki.v
    public Object c(InterfaceC5380e interfaceC5380e) {
        return this.f10872d.c(interfaceC5380e);
    }

    @Override // Ii.D0, Ii.InterfaceC3091y0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(H(), null, this);
        }
        E(cancellationException);
    }

    @Override // Ki.v
    public Object d() {
        return this.f10872d.d();
    }

    @Override // Ki.w
    public void e(InterfaceC6835l interfaceC6835l) {
        this.f10872d.e(interfaceC6835l);
    }

    @Override // Ki.w
    public boolean f(Throwable th2) {
        return this.f10872d.f(th2);
    }

    @Override // Ki.v
    public Object i(InterfaceC5380e interfaceC5380e) {
        Object objI = this.f10872d.i(interfaceC5380e);
        AbstractC5467b.g();
        return objI;
    }

    @Override // Ki.v
    public i iterator() {
        return this.f10872d.iterator();
    }

    @Override // Ki.w
    public Object k(Object obj) {
        return this.f10872d.k(obj);
    }

    @Override // Ki.w
    public boolean l() {
        return this.f10872d.l();
    }

    @Override // Ii.D0, Ii.InterfaceC3091y0
    public /* synthetic */ void cancel() {
        E(new JobCancellationException(H(), null, this));
    }

    @Override // Ii.D0, Ii.InterfaceC3091y0
    public final /* synthetic */ boolean cancel(Throwable th2) {
        E(new JobCancellationException(H(), null, this));
        return true;
    }
}
