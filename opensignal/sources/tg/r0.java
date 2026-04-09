package tg;

/* loaded from: classes.dex */
public final class r0 implements vg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22840a;

    /* renamed from: d, reason: collision with root package name */
    public final kq.a f22841d;

    /* renamed from: g, reason: collision with root package name */
    public final vg.c f22842g;

    public /* synthetic */ r0(vg.c cVar, vg.c cVar2, int i10) {
        this.f22840a = i10;
        this.f22841d = cVar;
        this.f22842g = cVar2;
    }

    @Override // kq.a
    public final Object get() {
        switch (this.f22840a) {
            case 0:
                return new q0((e1) this.f22841d.get(), (f1) this.f22842g.get());
            default:
                return new wg.k((wg.p) this.f22841d.get(), (wg.p) this.f22842g.get());
        }
    }
}
