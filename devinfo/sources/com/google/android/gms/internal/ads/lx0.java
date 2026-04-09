package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lx0 extends jx0 {

    /* renamed from: i, reason: collision with root package name */
    public static lx0 f13678i;

    public static final lx0 f(Context context) {
        lx0 lx0Var;
        synchronized (lx0.class) {
            try {
                if (f13678i == null) {
                    f13678i = new lx0(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                lx0Var = f13678i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lx0Var;
    }

    public final androidx.recyclerview.widget.d g(long j, boolean z3) {
        synchronized (lx0.class) {
            try {
                if (this.g.s()) {
                    return a(null, null, j, z3);
                }
                return new androidx.recyclerview.widget.d(6);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (lx0.class) {
            try {
                ce1 ce1Var = this.f12867f;
                if (((SharedPreferences) ce1Var.f10095c).contains(this.f12862a)) {
                    c(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
