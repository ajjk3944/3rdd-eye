package I;

import C.T;
import E.u;
import java.util.concurrent.TimeUnit;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements b.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.d f2358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H.c f2359c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2360d;

    public /* synthetic */ i(b.d dVar, H.c cVar, long j4) {
        this.f2358b = dVar;
        this.f2359c = cVar;
        this.f2360d = j4;
    }

    @Override // o0.b.c
    public final Object i(b.a aVar) {
        b.d dVar = this.f2358b;
        j.g(dVar, aVar);
        b.d.a aVar2 = dVar.f44804c;
        if (!aVar2.isDone()) {
            aVar2.addListener(new g(this.f2359c.schedule(new T(4, aVar, dVar), this.f2360d, TimeUnit.MILLISECONDS), 1), u.y());
        }
        return "TimeoutFuture[" + dVar + "]";
    }
}
