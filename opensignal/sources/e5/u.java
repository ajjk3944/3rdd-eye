package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7931a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7932d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.g0 f7933g;

    public /* synthetic */ u(a aVar, androidx.media3.common.g0 g0Var, int i10) {
        this.f7931a = i10;
        this.f7932d = aVar;
        this.f7933g = g0Var;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7931a) {
            case 0:
                ((c) obj).onPlaylistMetadataChanged(this.f7932d, this.f7933g);
                break;
            default:
                ((c) obj).onMediaMetadataChanged(this.f7932d, this.f7933g);
                break;
        }
    }
}
