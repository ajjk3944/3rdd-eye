package x9;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25158a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25159d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f25160g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f25161r;

    public /* synthetic */ l(q qVar, boolean z10, int i10, int i11) {
        this.f25158a = i11;
        this.f25159d = qVar;
        this.f25160g = z10;
        this.f25161r = i10;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25158a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerStateChanged(this.f25159d, this.f25160g, this.f25161r);
                break;
            default:
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(this.f25159d, this.f25160g, this.f25161r);
                break;
        }
    }
}
