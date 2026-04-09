package x9;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25151a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25152d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Format f25153g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z9.e f25154r;

    public /* synthetic */ j(q qVar, Format format, z9.e eVar, int i10) {
        this.f25151a = i10;
        this.f25152d = qVar;
        this.f25153g = format;
        this.f25154r = eVar;
    }

    @Override // qb.h, a5.j
    public final void a(Object obj) {
        switch (this.f25151a) {
            case 0:
                AnalyticsCollector.lambda$onAudioInputFormatChanged$7(this.f25152d, this.f25153g, this.f25154r, (AnalyticsListener) obj);
                break;
            default:
                AnalyticsCollector.lambda$onVideoInputFormatChanged$20(this.f25152d, this.f25153g, this.f25154r, (AnalyticsListener) obj);
                break;
        }
    }
}
