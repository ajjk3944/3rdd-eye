package e5;

import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7927a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7928d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.r f7929g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d5.d f7930r;

    public /* synthetic */ t(a aVar, androidx.media3.common.r rVar, d5.d dVar, int i10) {
        this.f7927a = i10;
        this.f7928d = aVar;
        this.f7929g = rVar;
        this.f7930r = dVar;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7927a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onVideoInputFormatChanged$15(this.f7928d, this.f7929g, this.f7930r, (c) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onAudioInputFormatChanged$5(this.f7928d, this.f7929g, this.f7930r, (c) obj);
                break;
        }
    }
}
