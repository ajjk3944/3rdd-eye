package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7917a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7918d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7919g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7920r;

    public /* synthetic */ q(a aVar, int i10, long j) {
        this.f7918d = aVar;
        this.f7920r = i10;
        this.f7919g = j;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7917a) {
            case 0:
                ((c) obj).onDroppedVideoFrames(this.f7918d, this.f7920r, this.f7919g);
                break;
            default:
                ((c) obj).onVideoFrameProcessingOffset(this.f7918d, this.f7919g, this.f7920r);
                break;
        }
    }

    public /* synthetic */ q(a aVar, long j, int i10) {
        this.f7918d = aVar;
        this.f7919g = j;
        this.f7920r = i10;
    }
}
