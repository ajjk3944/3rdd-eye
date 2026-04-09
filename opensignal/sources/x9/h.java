package x9;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25144a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25145d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ya.m f25146g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ya.r f25147r;

    public /* synthetic */ h(q qVar, ya.m mVar, ya.r rVar, int i10) {
        this.f25144a = i10;
        this.f25145d = qVar;
        this.f25146g = mVar;
        this.f25147r = rVar;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25144a) {
            case 0:
                ((AnalyticsListener) obj).onLoadCanceled(this.f25145d, this.f25146g, this.f25147r);
                break;
            case 1:
                ((AnalyticsListener) obj).onLoadCompleted(this.f25145d, this.f25146g, this.f25147r);
                break;
            default:
                ((AnalyticsListener) obj).onLoadStarted(this.f25145d, this.f25146g, this.f25147r);
                break;
        }
    }
}
