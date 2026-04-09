package x9;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25136a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25137d;

    public /* synthetic */ e(q qVar, int i10) {
        this.f25136a = i10;
        this.f25137d = qVar;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25136a) {
            case 0:
                ((AnalyticsListener) obj).onSeekStarted(this.f25137d);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmKeysRemoved(this.f25137d);
                break;
            case 2:
                ((AnalyticsListener) obj).onDrmKeysLoaded(this.f25137d);
                break;
            case 3:
                ((AnalyticsListener) obj).onSeekProcessed(this.f25137d);
                break;
            case 4:
                ((AnalyticsListener) obj).onDrmKeysRestored(this.f25137d);
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ((AnalyticsListener) obj).onDrmSessionReleased(this.f25137d);
                break;
            default:
                ((AnalyticsListener) obj).onPlayerReleased(this.f25137d);
                break;
        }
    }
}
