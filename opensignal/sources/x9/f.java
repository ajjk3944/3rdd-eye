package x9;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25138a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25139d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f25140g;

    public /* synthetic */ f(q qVar, long j, int i10) {
        this.f25138a = i10;
        this.f25139d = qVar;
        this.f25140g = j;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25138a) {
            case 0:
                ((AnalyticsListener) obj).onAudioPositionAdvancing(this.f25139d, this.f25140g);
                break;
            case 1:
                ((AnalyticsListener) obj).onSeekBackIncrementChanged(this.f25139d, this.f25140g);
                break;
            default:
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged(this.f25139d, this.f25140g);
                break;
        }
    }
}
