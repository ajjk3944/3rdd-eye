package x9;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25162a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25163d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ya.r f25164g;

    public /* synthetic */ m(q qVar, ya.r rVar, int i10) {
        this.f25162a = i10;
        this.f25163d = qVar;
        this.f25164g = rVar;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25162a) {
            case 0:
                ((AnalyticsListener) obj).onDownstreamFormatChanged(this.f25163d, this.f25164g);
                break;
            default:
                ((AnalyticsListener) obj).onUpstreamDiscarded(this.f25163d, this.f25164g);
                break;
        }
    }
}
