package x9;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25132a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25133d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f25134g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f25135r;

    public /* synthetic */ d(q qVar, int i10, long j) {
        this.f25133d = qVar;
        this.f25135r = i10;
        this.f25134g = j;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25132a) {
            case 0:
                ((AnalyticsListener) obj).onDroppedVideoFrames(this.f25133d, this.f25135r, this.f25134g);
                break;
            default:
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(this.f25133d, this.f25134g, this.f25135r);
                break;
        }
    }

    public /* synthetic */ d(q qVar, long j, int i10) {
        this.f25133d = qVar;
        this.f25134g = j;
        this.f25135r = i10;
    }
}
