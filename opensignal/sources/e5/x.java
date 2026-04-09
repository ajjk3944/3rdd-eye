package e5;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements a5.j, qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7943a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7944d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7945g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7946r;

    public /* synthetic */ x(Object obj, int i10, int i11, int i12) {
        this.f7943a = i12;
        this.f7946r = obj;
        this.f7944d = i10;
        this.f7945g = i11;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7943a) {
            case 0:
                ((c) obj).onSurfaceSizeChanged((a) this.f7946r, this.f7944d, this.f7945g);
                break;
            default:
                ((AnalyticsListener) obj).onSurfaceSizeChanged((x9.q) this.f7946r, this.f7944d, this.f7945g);
                break;
        }
    }
}
