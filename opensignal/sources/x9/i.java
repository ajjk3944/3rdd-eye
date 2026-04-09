package x9;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25148a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25149d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p0 f25150g;

    public /* synthetic */ i(q qVar, p0 p0Var, int i10) {
        this.f25148a = i10;
        this.f25149d = qVar;
        this.f25150g = p0Var;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25148a) {
            case 0:
                ((AnalyticsListener) obj).onMediaMetadataChanged(this.f25149d, this.f25150g);
                break;
            default:
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(this.f25149d, this.f25150g);
                break;
        }
    }
}
