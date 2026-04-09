package o4;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i.g0 f18860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f18861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.b f18862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f.a f18863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ am.f f18864e;

    public t(am.f fVar, i.g0 g0Var, AtomicReference atomicReference, g.b bVar, f.a aVar) {
        this.f18864e = fVar;
        this.f18860a = g0Var;
        this.f18861b = atomicReference;
        this.f18862c = bVar;
        this.f18863d = aVar;
    }

    @Override // o4.v
    public final void a() {
        StringBuilder sb2 = new StringBuilder("fragment_");
        am.f fVar = this.f18864e;
        sb2.append(fVar.f1433y);
        sb2.append("_rq#");
        sb2.append(fVar.f1429s0.getAndIncrement());
        String string = sb2.toString();
        am.f fVar2 = (am.f) this.f18860a.f11051a;
        x xVar = fVar2.R;
        c.g gVar = xVar != null ? xVar.B.F : fVar2.W().F;
        HashMap map = gVar.f3014c;
        androidx.lifecycle.x xVar2 = fVar.f1423n0;
        if (xVar2.f1528x.isAtLeast(androidx.lifecycle.n.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + fVar + " is attempting to register while current state is " + xVar2.f1528x + ". LifecycleOwners must call register before they are STARTED.");
        }
        gVar.d(string);
        f.f fVar3 = (f.f) map.get(string);
        if (fVar3 == null) {
            fVar3 = new f.f(xVar2);
        }
        f.a aVar = this.f18863d;
        g.b bVar = this.f18862c;
        f.c cVar = new f.c(gVar, string, aVar, bVar);
        fVar3.f8379a.V0(cVar);
        fVar3.f8380b.add(cVar);
        map.put(string, fVar3);
        this.f18861b.set(new f.d(gVar, string, bVar, 0));
    }
}
