package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class aw2 implements ca4 {
    public final /* synthetic */ int a;
    public final da4 b;

    public /* synthetic */ aw2(da4 da4Var, int i) {
        this.a = i;
        this.b = da4Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new f20(22, (m42) this.b.a);
            case 1:
                return new vg0(23, (ei2) this.b.a);
            case 2:
                return new b33(3, (b73) this.b.a);
            case 3:
                return new m53((m73) this.b.a);
            case 4:
                File dir = ((Context) this.b.a).getDir("yqzdkcache", 0);
                i41.M(dir);
                return dir;
            case 5:
                ExecutorService executorService = (ExecutorService) this.b.a;
                if (executorService instanceof pq3) {
                    return (pq3) executorService;
                }
                return executorService instanceof ScheduledExecutorService ? new uq3((ScheduledExecutorService) executorService) : new ld2(executorService);
            case 6:
                return new mg3((ExecutorService) this.b.a);
            default:
                DisplayMetrics displayMetrics = ((Context) this.b.a).getResources().getDisplayMetrics();
                i41.M(displayMetrics);
                return displayMetrics;
        }
    }
}
