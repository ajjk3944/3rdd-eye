package I;

import E.u;
import Q4.b0;
import g5.InterfaceC4391a;
import g5.InterfaceC4392b;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements b.c, InterfaceC4391a.InterfaceC0459a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2349c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2350d;

    public /* synthetic */ e(A4.a aVar, H.c cVar, long j4) {
        this.f2349c = aVar;
        this.f2350d = cVar;
        this.f2348b = j4;
    }

    @Override // g5.InterfaceC4391a.InterfaceC0459a
    public void h(InterfaceC4392b interfaceC4392b) {
        ((L4.a) interfaceC4392b.get()).d((String) this.f2349c, this.f2348b, (b0) this.f2350d);
    }

    @Override // o0.b.c
    public Object i(final b.a aVar) {
        final A4.a aVar2 = (A4.a) this.f2349c;
        j.g(aVar2, aVar);
        if (!aVar2.isDone()) {
            final long j4 = this.f2348b;
            aVar2.addListener(new g(((H.c) this.f2350d).schedule(new Callable() { // from class: I.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(aVar.d(new TimeoutException("Future[" + aVar2 + "] is not done within " + j4 + " ms.")));
                }
            }, j4, TimeUnit.MILLISECONDS), 0), u.y());
        }
        return "TimeoutFuture[" + aVar2 + "]";
    }

    public /* synthetic */ e(String str, long j4, b0 b0Var) {
        this.f2349c = str;
        this.f2348b = j4;
        this.f2350d = b0Var;
    }
}
