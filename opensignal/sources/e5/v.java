package e5;

import androidx.media3.common.r0;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.f1;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements a5.j, qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7934a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7935d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7936g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7937r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7938x;

    public /* synthetic */ v(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f7934a = i11;
        this.f7936g = obj;
        this.f7935d = i10;
        this.f7937r = obj2;
        this.f7938x = obj3;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7934a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$43((a) this.f7936g, this.f7935d, (r0) this.f7937r, (r0) this.f7938x, (c) obj);
                break;
            default:
                AnalyticsCollector.lambda$onPositionDiscontinuity$49((x9.q) this.f7936g, this.f7935d, (f1) this.f7937r, (f1) this.f7938x, (AnalyticsListener) obj);
                break;
        }
    }
}
