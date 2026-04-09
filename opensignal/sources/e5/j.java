package e5;

import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7834a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7835d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7836g;

    public /* synthetic */ j(a aVar, int i10, int i11) {
        this.f7834a = i11;
        this.f7835d = aVar;
        this.f7836g = i10;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7834a) {
            case 0:
                ((c) obj).onTimelineChanged(this.f7835d, this.f7836g);
                break;
            case 1:
                ((c) obj).onPlaybackSuppressionReasonChanged(this.f7835d, this.f7836g);
                break;
            case 2:
                ((c) obj).onPlaybackStateChanged(this.f7835d, this.f7836g);
                break;
            case 3:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$62(this.f7835d, this.f7836g, (c) obj);
                break;
            case 4:
                ((c) obj).onAudioSessionIdChanged(this.f7835d, this.f7836g);
                break;
            default:
                ((c) obj).onRepeatModeChanged(this.f7835d, this.f7836g);
                break;
        }
    }
}
