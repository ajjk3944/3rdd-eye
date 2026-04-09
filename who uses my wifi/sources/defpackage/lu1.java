package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lu1 {
    public final Context a;
    public final nn2 b;
    public final long c;
    public final ScheduledExecutorService d;
    public final PackageInfo e;

    public lu1(Context context, long j, PackageInfo packageInfo, nn2 nn2Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.c = j;
        this.e = packageInfo;
        this.b = nn2Var;
        this.d = scheduledExecutorService;
    }

    public static final void b(int i, Bundle bundle) {
        if (((Boolean) tw1.e.c.a(mz1.a8)).booleanValue()) {
            ga1.n(hg4.C.k, bundle, ga1.b(i));
        }
    }

    public static final void c(int i, Bundle bundle) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    public final boolean a() {
        return this.b.d().size() >= ((Integer) tw1.e.c.a(mz1.Z7)).intValue();
    }
}
