package d5;

import android.util.Pair;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7022a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm.e f7023d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Pair f7024g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o5.q f7025r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o5.v f7026x;

    public /* synthetic */ k0(bm.e eVar, Pair pair, o5.q qVar, o5.v vVar, int i10) {
        this.f7022a = i10;
        this.f7023d = eVar;
        this.f7024g = pair;
        this.f7025r = qVar;
        this.f7026x = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7022a) {
            case 0:
                AnalyticsCollector analyticsCollector = (AnalyticsCollector) ((o0) this.f7023d.f2831g).f7052i;
                Pair pair = this.f7024g;
                analyticsCollector.onLoadCanceled(((Integer) pair.first).intValue(), (o5.z) pair.second, this.f7025r, this.f7026x);
                break;
            case 1:
                AnalyticsCollector analyticsCollector2 = (AnalyticsCollector) ((o0) this.f7023d.f2831g).f7052i;
                Pair pair2 = this.f7024g;
                analyticsCollector2.onLoadStarted(((Integer) pair2.first).intValue(), (o5.z) pair2.second, this.f7025r, this.f7026x);
                break;
            default:
                AnalyticsCollector analyticsCollector3 = (AnalyticsCollector) ((o0) this.f7023d.f2831g).f7052i;
                Pair pair3 = this.f7024g;
                analyticsCollector3.onLoadCompleted(((Integer) pair3.first).intValue(), (o5.z) pair3.second, this.f7025r, this.f7026x);
                break;
        }
    }
}
