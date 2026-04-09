package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7823a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7824d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f7825g;

    public /* synthetic */ h(a aVar, String str, int i10) {
        this.f7823a = i10;
        this.f7824d = aVar;
        this.f7825g = str;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7823a) {
            case 0:
                ((c) obj).onAudioDecoderReleased(this.f7824d, this.f7825g);
                break;
            default:
                ((c) obj).onVideoDecoderReleased(this.f7824d, this.f7825g);
                break;
        }
    }
}
