package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class E6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4987w6 f35857a;

    E6(C4987w6 c4987w6) {
        this.f35857a = c4987w6;
    }

    private final void c(long j10, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f35857a.j();
        if (this.f35857a.f36331a.n()) {
            this.f35857a.e().f36278r.b(j10);
            this.f35857a.zzj().G().b("Session started, time", Long.valueOf(this.f35857a.zzb().c()));
            long j11 = j10 / 1000;
            this.f35857a.n().m0("auto", "_sid", Long.valueOf(j11), j10);
            this.f35857a.e().f36279s.b(j11);
            this.f35857a.e().f36274n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            this.f35857a.n().g0("auto", "_s", j10, bundle);
            String strA = this.f35857a.e().f36284x.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            this.f35857a.n().g0("auto", "_ssr", j10, bundle2);
        }
    }

    final void a() {
        this.f35857a.j();
        if (this.f35857a.e().u(this.f35857a.zzb().a())) {
            this.f35857a.e().f36274n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f35857a.zzj().G().a("Detected application was in foreground");
                c(this.f35857a.zzb().a(), false);
            }
        }
    }

    final void b(long j10, boolean z10) {
        this.f35857a.j();
        this.f35857a.D();
        if (this.f35857a.e().u(j10)) {
            this.f35857a.e().f36274n.a(true);
            this.f35857a.l().G();
        }
        this.f35857a.e().f36278r.b(j10);
        if (this.f35857a.e().f36274n.b()) {
            c(j10, z10);
        }
    }
}
