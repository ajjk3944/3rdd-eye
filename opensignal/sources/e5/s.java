package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7924a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7925d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o5.v f7926g;

    public /* synthetic */ s(a aVar, o5.v vVar, int i10) {
        this.f7924a = i10;
        this.f7925d = aVar;
        this.f7926g = vVar;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7924a) {
            case 0:
                ((c) obj).onDownstreamFormatChanged(this.f7925d, this.f7926g);
                break;
            default:
                ((c) obj).onUpstreamDiscarded(this.f7925d, this.f7926g);
                break;
        }
    }
}
