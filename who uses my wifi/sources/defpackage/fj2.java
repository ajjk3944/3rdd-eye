package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class fj2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ gj2 g;
    public final /* synthetic */ Throwable h;

    public /* synthetic */ fj2(gj2 gj2Var, Throwable th, int i) {
        this.f = i;
        this.g = gj2Var;
        this.h = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                Context context = this.g.a;
                boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.db)).booleanValue();
                Throwable th = this.h;
                if (!zBooleanValue) {
                    r92.a(context).e("AttributionReportingSampled", th);
                    break;
                } else {
                    r92.c(context).e("AttributionReporting", th);
                    break;
                }
            default:
                Context context2 = this.g.a;
                boolean zBooleanValue2 = ((Boolean) tw1.e.c.a(mz1.db)).booleanValue();
                Throwable th2 = this.h;
                if (!zBooleanValue2) {
                    r92.a(context2).e("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th2);
                    break;
                } else {
                    r92.c(context2).e("AttributionReporting.getUpdatedUrlAndRegisterSource", th2);
                    break;
                }
        }
    }
}
