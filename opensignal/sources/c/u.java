package c;

/* loaded from: classes.dex */
public final class u implements androidx.lifecycle.t, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.o f3048a;

    /* renamed from: d, reason: collision with root package name */
    public final am.d f3049d;

    /* renamed from: g, reason: collision with root package name */
    public v f3050g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f3051r;

    public u(w wVar, androidx.lifecycle.o oVar, am.d dVar) {
        br.l.e(dVar, "onBackPressedCallback");
        this.f3051r = wVar;
        this.f3048a = oVar;
        this.f3049d = dVar;
        oVar.V0(this);
    }

    @Override // androidx.lifecycle.t
    public final void b(androidx.lifecycle.v vVar, androidx.lifecycle.m mVar) {
        if (mVar != androidx.lifecycle.m.ON_START) {
            if (mVar != androidx.lifecycle.m.ON_STOP) {
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                v vVar2 = this.f3050g;
                if (vVar2 != null) {
                    vVar2.cancel();
                    return;
                }
                return;
            }
        }
        w wVar = this.f3051r;
        wVar.getClass();
        am.d dVar = this.f3049d;
        br.l.e(dVar, "onBackPressedCallback");
        wVar.f3055b.addLast(dVar);
        v vVar3 = new v(wVar, dVar);
        dVar.f859b.add(vVar3);
        wVar.d();
        dVar.f860c = new bp.a(0, wVar, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 5);
        this.f3050g = vVar3;
    }

    @Override // c.c
    public final void cancel() {
        this.f3048a.m1(this);
        this.f3049d.f859b.remove(this);
        v vVar = this.f3050g;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f3050g = null;
    }
}
