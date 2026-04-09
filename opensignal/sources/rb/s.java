package rb;

import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.b5;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21516a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21517d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f21518g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21519r;

    public /* synthetic */ s(Object obj, long j, int i10, int i11) {
        this.f21516a = i11;
        this.f21517d = obj;
        this.f21518g = j;
        this.f21519r = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f21516a;
        int i11 = this.f21519r;
        long j = this.f21518g;
        Object obj = this.f21517d;
        switch (i10) {
            case 0:
                u uVar = (u) ((q3.a) obj).f20680g;
                int i12 = qb.v.f20828a;
                uVar.onDroppedFrames(i11, j);
                break;
            case 1:
                u uVar2 = (u) ((q3.a) obj).f20680g;
                int i13 = qb.v.f20828a;
                uVar2.onVideoFrameProcessingOffset(j, i11);
                break;
            default:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj;
                if (appComponentsBreadcrumbsIntegration.f11489d != null) {
                    io.sentry.e eVar = new io.sentry.e(j);
                    eVar.f12204x = "system";
                    eVar.B = "device.event";
                    eVar.f12203r = "Low memory";
                    eVar.b("LOW_MEMORY", "action");
                    eVar.b(Integer.valueOf(i11), "level");
                    eVar.E = b5.WARNING;
                    appComponentsBreadcrumbsIntegration.f11489d.g(eVar, AppComponentsBreadcrumbsIntegration.f11487x);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s(q3.a aVar, int i10, long j) {
        this.f21516a = 0;
        this.f21517d = aVar;
        this.f21519r = i10;
        this.f21518g = j;
    }
}
