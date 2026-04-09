package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.e91;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public t0 f20227a;

    @Override // java.lang.Runnable
    public final void run() {
        r0 r0Var;
        d0 d0Var;
        t0 t0Var = this.f20227a;
        if (t0Var == null || (r0Var = t0Var.f20229h) == null) {
            return;
        }
        this.f20227a = null;
        if (r0Var.isDone()) {
            Object obj = t0Var.f20169a;
            if (obj == null) {
                if (r0Var.isDone()) {
                    if (k0.g.M(t0Var, null, t0.h(r0Var))) {
                        t0.j(t0Var);
                        return;
                    }
                    return;
                }
                c0 c0Var = new c0(t0Var, r0Var);
                if (k0.g.M(t0Var, null, c0Var)) {
                    try {
                        r0Var.c(c0Var, o0.f20198a);
                        return;
                    } catch (Throwable th2) {
                        try {
                            d0Var = new d0(th2);
                        } catch (Error | Exception unused) {
                            d0Var = d0.f20098b;
                        }
                        k0.g.M(t0Var, c0Var, d0Var);
                        return;
                    }
                }
                obj = t0Var.f20169a;
            }
            if (obj instanceof b0) {
                r0Var.cancel(((b0) obj).f20087a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = t0Var.f20230i;
            t0Var.f20230i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th3) {
                    if (k0.g.M(t0Var, null, new d0(new e91(str, 1)))) {
                        t0.j(t0Var);
                    }
                    throw th3;
                }
            }
            if (k0.g.M(t0Var, null, new d0(new e91(str + ": " + r0Var.toString(), 1)))) {
                t0.j(t0Var);
            }
        } finally {
            r0Var.cancel(true);
        }
    }
}
