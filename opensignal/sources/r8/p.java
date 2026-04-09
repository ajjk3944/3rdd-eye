package r8;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f21363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f21364c;

    public /* synthetic */ p(v vVar, float f10, int i10) {
        this.f21362a = i10;
        this.f21363b = vVar;
        this.f21364c = f10;
    }

    @Override // r8.t
    public final void run() {
        switch (this.f21362a) {
            case 0:
                v vVar = this.f21363b;
                h hVar = vVar.f21375a;
                float f10 = this.f21364c;
                if (hVar != null) {
                    e9.e eVar = vVar.f21379d;
                    eVar.i(eVar.F, e9.g.f(hVar.f21332l, hVar.f21333m, f10));
                    break;
                } else {
                    vVar.B.add(new p(vVar, f10, 0));
                    break;
                }
            case 1:
                v vVar2 = this.f21363b;
                h hVar2 = vVar2.f21375a;
                float f11 = this.f21364c;
                if (hVar2 != null) {
                    vVar2.r((int) e9.g.f(hVar2.f21332l, hVar2.f21333m, f11));
                    break;
                } else {
                    vVar2.B.add(new p(vVar2, f11, 1));
                    break;
                }
            default:
                this.f21363b.t(this.f21364c);
                break;
        }
    }
}
