package x9;

import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25141a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25142d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f25143g;

    public /* synthetic */ g(q qVar, int i10, int i11) {
        this.f25141a = i11;
        this.f25142d = qVar;
        this.f25143g = i10;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25141a) {
            case 0:
                ((AnalyticsListener) obj).onTimelineChanged(this.f25142d, this.f25143g);
                break;
            case 1:
                AnalyticsCollector.lambda$onDrmSessionAcquired$59(this.f25142d, this.f25143g, (AnalyticsListener) obj);
                break;
            case 2:
                ((AnalyticsListener) obj).onPlaybackStateChanged(this.f25142d, this.f25143g);
                break;
            case 3:
                ((AnalyticsListener) obj).onAudioSessionIdChanged(this.f25142d, this.f25143g);
                break;
            case 4:
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(this.f25142d, this.f25143g);
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ((AnalyticsListener) obj).onRepeatModeChanged(this.f25142d, this.f25143g);
                break;
            default:
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(this.f25142d, this.f25143g);
                break;
        }
    }
}
