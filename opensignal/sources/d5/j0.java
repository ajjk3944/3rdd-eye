package d5;

import android.util.Pair;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7001a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm.e f7002d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Pair f7003g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o5.v f7004r;

    public /* synthetic */ j0(bm.e eVar, Pair pair, o5.v vVar, int i10) {
        this.f7001a = i10;
        this.f7002d = eVar;
        this.f7003g = pair;
        this.f7004r = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7001a) {
            case 0:
                AnalyticsCollector analyticsCollector = (AnalyticsCollector) ((o0) this.f7002d.f2831g).f7052i;
                Pair pair = this.f7003g;
                int iIntValue = ((Integer) pair.first).intValue();
                o5.z zVar = (o5.z) pair.second;
                zVar.getClass();
                analyticsCollector.onUpstreamDiscarded(iIntValue, zVar, this.f7004r);
                break;
            default:
                AnalyticsCollector analyticsCollector2 = (AnalyticsCollector) ((o0) this.f7002d.f2831g).f7052i;
                Pair pair2 = this.f7003g;
                analyticsCollector2.onDownstreamFormatChanged(((Integer) pair2.first).intValue(), (o5.z) pair2.second, this.f7004r);
                break;
        }
    }
}
