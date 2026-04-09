package e5;

import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7912a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7913d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f7914g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f7915r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f7916x;

    public /* synthetic */ p(a aVar, String str, long j, long j7, int i10) {
        this.f7912a = i10;
        this.f7913d = aVar;
        this.f7914g = str;
        this.f7915r = j;
        this.f7916x = j7;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7912a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$4(this.f7913d, this.f7914g, this.f7915r, this.f7916x, (c) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$14(this.f7913d, this.f7914g, this.f7915r, this.f7916x, (c) obj);
                break;
        }
    }
}
