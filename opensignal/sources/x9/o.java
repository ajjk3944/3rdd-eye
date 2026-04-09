package x9;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25170a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25171d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f25172g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f25173r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f25174x;

    public /* synthetic */ o(q qVar, int i10, long j, long j7, int i11) {
        this.f25170a = i11;
        this.f25171d = qVar;
        this.f25172g = i10;
        this.f25173r = j;
        this.f25174x = j7;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25170a) {
            case 0:
                ((AnalyticsListener) obj).onAudioUnderrun(this.f25171d, this.f25172g, this.f25173r, this.f25174x);
                break;
            default:
                ((AnalyticsListener) obj).onBandwidthEstimate(this.f25171d, this.f25172g, this.f25173r, this.f25174x);
                break;
        }
    }
}
