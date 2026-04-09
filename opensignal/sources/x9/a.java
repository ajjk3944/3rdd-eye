package x9;

import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25099a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25100d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f25101g;

    public /* synthetic */ a(q qVar, boolean z10, int i10) {
        this.f25099a = i10;
        this.f25100d = qVar;
        this.f25101g = z10;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25099a) {
            case 0:
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(this.f25100d, this.f25101g);
                break;
            case 1:
                AnalyticsCollector.lambda$onIsLoadingChanged$39(this.f25100d, this.f25101g, (AnalyticsListener) obj);
                break;
            case 2:
                ((AnalyticsListener) obj).onShuffleModeChanged(this.f25100d, this.f25101g);
                break;
            default:
                ((AnalyticsListener) obj).onIsPlayingChanged(this.f25100d, this.f25101g);
                break;
        }
    }
}
