package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7906a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7907d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7908g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f7909r;

    public /* synthetic */ o(a aVar, int i10, boolean z10) {
        this.f7906a = 1;
        this.f7907d = aVar;
        this.f7908g = i10;
        this.f7909r = z10;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7906a) {
            case 0:
                ((c) obj).onPlayerStateChanged(this.f7907d, this.f7909r, this.f7908g);
                break;
            case 1:
                ((c) obj).onDeviceVolumeChanged(this.f7907d, this.f7908g, this.f7909r);
                break;
            default:
                ((c) obj).onPlayWhenReadyChanged(this.f7907d, this.f7909r, this.f7908g);
                break;
        }
    }

    public /* synthetic */ o(a aVar, boolean z10, int i10, int i11) {
        this.f7906a = i11;
        this.f7907d = aVar;
        this.f7909r = z10;
        this.f7908g = i10;
    }
}
