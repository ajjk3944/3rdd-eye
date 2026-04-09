package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7817a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7818d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7819g;

    public /* synthetic */ f(a aVar, long j, int i10) {
        this.f7817a = i10;
        this.f7818d = aVar;
        this.f7819g = j;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7817a) {
            case 0:
                ((c) obj).onSeekForwardIncrementChanged(this.f7818d, this.f7819g);
                break;
            case 1:
                ((c) obj).onAudioPositionAdvancing(this.f7818d, this.f7819g);
                break;
            case 2:
                ((c) obj).onSeekBackIncrementChanged(this.f7818d, this.f7819g);
                break;
            default:
                ((c) obj).onMaxSeekToPreviousPositionChanged(this.f7818d, this.f7819g);
                break;
        }
    }
}
