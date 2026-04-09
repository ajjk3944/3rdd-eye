package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7921a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7922d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.m0 f7923g;

    public /* synthetic */ r(a aVar, androidx.media3.common.m0 m0Var, int i10) {
        this.f7921a = i10;
        this.f7922d = aVar;
        this.f7923g = m0Var;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7921a) {
            case 0:
                ((c) obj).onPlayerErrorChanged(this.f7922d, this.f7923g);
                break;
            default:
                ((c) obj).onPlayerError(this.f7922d, this.f7923g);
                break;
        }
    }
}
