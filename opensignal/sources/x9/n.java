package x9;

import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25165a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25166d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f25167g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f25168r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f25169x;

    public /* synthetic */ n(q qVar, String str, long j, long j7, int i10) {
        this.f25165a = i10;
        this.f25166d = qVar;
        this.f25167g = str;
        this.f25168r = j;
        this.f25169x = j7;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25165a) {
            case 0:
                AnalyticsCollector.lambda$onAudioDecoderInitialized$6(this.f25166d, this.f25167g, this.f25168r, this.f25169x, (AnalyticsListener) obj);
                break;
            default:
                AnalyticsCollector.lambda$onVideoDecoderInitialized$19(this.f25166d, this.f25167g, this.f25168r, this.f25169x, (AnalyticsListener) obj);
                break;
        }
    }
}
