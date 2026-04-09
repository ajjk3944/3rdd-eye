package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7839a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7840d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7841g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f7842r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f7843x;

    public /* synthetic */ k(a aVar, int i10, long j, long j7, int i11) {
        this.f7839a = i11;
        this.f7840d = aVar;
        this.f7841g = i10;
        this.f7842r = j;
        this.f7843x = j7;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7839a) {
            case 0:
                ((c) obj).onBandwidthEstimate(this.f7840d, this.f7841g, this.f7842r, this.f7843x);
                break;
            default:
                ((c) obj).onAudioUnderrun(this.f7840d, this.f7841g, this.f7842r, this.f7843x);
                break;
        }
    }
}
