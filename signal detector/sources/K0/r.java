package k0;

import e.InterfaceC2285b;
import h0.C2352b;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class r extends AbstractC2615t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2352b f21663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f21664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R2.a f21665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2285b f21666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC2617v f21667e;

    public r(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, C2352b c2352b, AtomicReference atomicReference, R2.a aVar, InterfaceC2285b interfaceC2285b) {
        this.f21667e = abstractComponentCallbacksC2617v;
        this.f21663a = c2352b;
        this.f21664b = atomicReference;
        this.f21665c = aVar;
        this.f21666d = interfaceC2285b;
    }

    @Override // k0.AbstractC2615t
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21667e;
        sb.append(abstractComponentCallbacksC2617v.f21710e);
        sb.append("_rq#");
        sb.append(abstractComponentCallbacksC2617v.f21715g0.getAndIncrement());
        String string = sb.toString();
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = (AbstractComponentCallbacksC2617v) this.f21663a.f20444b;
        x xVar = abstractComponentCallbacksC2617v2.f21685H;
        this.f21664b.set((xVar != null ? xVar.f21729m.i : abstractComponentCallbacksC2617v2.Q().i).d(string, abstractComponentCallbacksC2617v, this.f21665c, this.f21666d));
    }
}
