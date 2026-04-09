package e5;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements a5.j, qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7868a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f7869d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7870g;

    public /* synthetic */ l(Object obj, float f10, int i10) {
        this.f7868a = i10;
        this.f7870g = obj;
        this.f7869d = f10;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7868a) {
            case 0:
                ((c) obj).onVolumeChanged((a) this.f7870g, this.f7869d);
                break;
            default:
                ((AnalyticsListener) obj).onVolumeChanged((x9.q) this.f7870g, this.f7869d);
                break;
        }
    }
}
