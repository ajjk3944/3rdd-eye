package A2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.H9;
import java.util.concurrent.ScheduledExecutorService;
import q2.C2841s;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f318a;

    /* renamed from: b, reason: collision with root package name */
    public final E f319b;

    /* renamed from: c, reason: collision with root package name */
    public final long f320c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f321d;

    /* renamed from: e, reason: collision with root package name */
    public final PackageInfo f322e;

    public r(Context context, long j6, PackageInfo packageInfo, E e6, ScheduledExecutorService scheduledExecutorService) {
        this.f318a = context;
        this.f320c = j6;
        this.f322e = packageInfo;
        this.f319b = e6;
        this.f321d = scheduledExecutorService;
    }

    public static final void b(int i, Bundle bundle) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.v8)).booleanValue()) {
            A.f.r(p2.j.f22785C.f22797k, bundle, AbstractC1135f5.d(i));
        }
    }

    public static final void c(int i, Bundle bundle) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    public final boolean a() {
        return this.f319b.g().size() >= ((Integer) C2841s.f23267e.f23270c.a(H9.u8)).intValue();
    }
}
