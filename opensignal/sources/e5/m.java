package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7871a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7872d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Exception f7873g;

    public /* synthetic */ m(a aVar, Exception exc, int i10) {
        this.f7871a = i10;
        this.f7872d = aVar;
        this.f7873g = exc;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7871a) {
            case 0:
                ((c) obj).onVideoCodecError(this.f7872d, this.f7873g);
                break;
            case 1:
                ((c) obj).onDrmSessionManagerError(this.f7872d, this.f7873g);
                break;
            case 2:
                ((c) obj).onAudioCodecError(this.f7872d, this.f7873g);
                break;
            default:
                ((c) obj).onAudioSinkError(this.f7872d, this.f7873g);
                break;
        }
    }
}
