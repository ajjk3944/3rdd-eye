package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class Qx extends Ox {
    public static Qx i;

    public static final Qx f(Context context) {
        Qx qx;
        synchronized (Qx.class) {
            try {
                if (i == null) {
                    i = new Qx(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                qx = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qx;
    }

    public final U1.b g(long j6, boolean z6) {
        synchronized (Qx.class) {
            try {
                if (this.f10284g.H()) {
                    return a(null, null, j6, z6);
                }
                return new U1.b(7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (Qx.class) {
            try {
                Vu vu = this.f10283f;
                if (((SharedPreferences) vu.f12106b).contains(this.f10278a)) {
                    c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
