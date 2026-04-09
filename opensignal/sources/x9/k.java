package x9;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25155a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25156d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f25157g;

    public /* synthetic */ k(q qVar, String str, int i10) {
        this.f25155a = i10;
        this.f25156d = qVar;
        this.f25157g = str;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25155a) {
            case 0:
                ((AnalyticsListener) obj).onAudioDecoderReleased(this.f25156d, this.f25157g);
                break;
            default:
                ((AnalyticsListener) obj).onVideoDecoderReleased(this.f25156d, this.f25157g);
                break;
        }
    }
}
