package e5;

import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7811a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7812d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d5.c f7813g;

    public /* synthetic */ e(a aVar, int i10, d5.c cVar) {
        this.f7811a = i10;
        this.f7812d = aVar;
        this.f7813g = cVar;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7811a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onAudioEnabled$3(this.f7812d, this.f7813g, (c) obj);
                break;
            case 1:
                DefaultAnalyticsCollector.lambda$onAudioDisabled$9(this.f7812d, this.f7813g, (c) obj);
                break;
            case 2:
                DefaultAnalyticsCollector.lambda$onVideoEnabled$13(this.f7812d, this.f7813g, (c) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onVideoDisabled$18(this.f7812d, this.f7813g, (c) obj);
                break;
        }
    }
}
