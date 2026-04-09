package com.google.android.gms.measurement.internal;

import android.os.Handler;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
abstract class A {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f35768d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4821c4 f35769a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f35770b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f35771c;

    A(InterfaceC4821c4 interfaceC4821c4) {
        AbstractC7901p.l(interfaceC4821c4);
        this.f35769a = interfaceC4821c4;
        this.f35770b = new E(this, interfaceC4821c4);
    }

    private final Handler f() {
        Handler handler;
        if (f35768d != null) {
            return f35768d;
        }
        synchronized (A.class) {
            try {
                if (f35768d == null) {
                    f35768d = new com.google.android.gms.internal.measurement.N0(this.f35769a.zza().getMainLooper());
                }
                handler = f35768d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    final void a() {
        this.f35771c = 0L;
        f().removeCallbacks(this.f35770b);
    }

    public final void b(long j10) {
        a();
        if (j10 >= 0) {
            this.f35771c = this.f35769a.zzb().a();
            if (f().postDelayed(this.f35770b, j10)) {
                return;
            }
            this.f35769a.zzj().C().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f35771c != 0;
    }
}
