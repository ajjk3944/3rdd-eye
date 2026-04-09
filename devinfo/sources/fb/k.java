package fb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.sk;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23940a;

    /* renamed from: b, reason: collision with root package name */
    public final t f23941b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23942c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f23943d;

    /* renamed from: e, reason: collision with root package name */
    public final PackageInfo f23944e;

    public k(Context context, long j, PackageInfo packageInfo, t tVar, ScheduledExecutorService scheduledExecutorService) {
        this.f23940a = context;
        this.f23942c = j;
        this.f23944e = packageInfo;
        this.f23941b = tVar;
        this.f23943d = scheduledExecutorService;
    }

    public static final void b(int i4, Bundle bundle) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16369v8)).booleanValue()) {
            d.h.D(ua.j.C.f35267k, bundle, d7.f(i4));
        }
    }

    public static final void c(int i4, Bundle bundle) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i4 - 1);
    }

    public final boolean a() {
        return this.f23941b.g().size() >= ((Integer) va.s.f36163e.f36166c.a(sk.f16352u8)).intValue();
    }
}
