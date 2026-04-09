package x9;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25126a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25127d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Exception f25128g;

    public /* synthetic */ b(q qVar, Exception exc, int i10) {
        this.f25126a = i10;
        this.f25127d = qVar;
        this.f25128g = exc;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25126a) {
            case 0:
                ((AnalyticsListener) obj).onDrmSessionManagerError(this.f25127d, this.f25128g);
                break;
            case 1:
                ((AnalyticsListener) obj).onVideoCodecError(this.f25127d, this.f25128g);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioSinkError(this.f25127d, this.f25128g);
                break;
            default:
                ((AnalyticsListener) obj).onAudioCodecError(this.f25127d, this.f25128g);
                break;
        }
    }
}
