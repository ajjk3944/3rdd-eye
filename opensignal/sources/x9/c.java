package x9;

import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25129a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25130d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z9.b f25131g;

    public /* synthetic */ c(q qVar, int i10, z9.b bVar) {
        this.f25129a = i10;
        this.f25130d = qVar;
        this.f25131g = bVar;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25129a) {
            case 0:
                AnalyticsCollector.lambda$onVideoEnabled$18(this.f25130d, this.f25131g, (AnalyticsListener) obj);
                break;
            case 1:
                AnalyticsCollector.lambda$onAudioDisabled$11(this.f25130d, this.f25131g, (AnalyticsListener) obj);
                break;
            case 2:
                AnalyticsCollector.lambda$onVideoDisabled$23(this.f25130d, this.f25131g, (AnalyticsListener) obj);
                break;
            default:
                AnalyticsCollector.lambda$onAudioEnabled$5(this.f25130d, this.f25131g, (AnalyticsListener) obj);
                break;
        }
    }
}
