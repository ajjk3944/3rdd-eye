package J4;

import C.T;
import J4.j;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements j.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f2760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2761e;

    public /* synthetic */ b(i iVar, Object obj, long j4, TimeUnit timeUnit, int i) {
        this.f2757a = i;
        this.f2758b = iVar;
        this.f2761e = obj;
        this.f2759c = j4;
        this.f2760d = timeUnit;
    }

    @Override // J4.j.b
    public final ScheduledFuture a(final j.a aVar) {
        switch (this.f2757a) {
            case 0:
                i iVar = this.f2758b;
                return iVar.f2788c.schedule(new f(iVar, (Runnable) this.f2761e, aVar, 0), this.f2759c, this.f2760d);
            default:
                final i iVar2 = this.f2758b;
                final Callable callable = (Callable) this.f2761e;
                return iVar2.f2788c.schedule(new Callable() { // from class: J4.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        i iVar3 = iVar2;
                        int i = 6;
                        return iVar3.f2787b.submit(new T(i, callable, aVar));
                    }
                }, this.f2759c, this.f2760d);
        }
    }
}
