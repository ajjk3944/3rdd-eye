package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nf3 extends lf3 {
    public static nf3 i;

    public static final nf3 f(Context context) {
        nf3 nf3Var;
        synchronized (nf3.class) {
            try {
                if (i == null) {
                    i = new nf3(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                nf3Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nf3Var;
    }

    public final ue g(long j, boolean z) {
        boolean z2;
        synchronized (nf3.class) {
            try {
                kf3 kf3Var = this.g;
                kf3Var.getClass();
                synchronized (kf3.class) {
                    z2 = ((SharedPreferences) ((wt2) kf3Var.g).h).getBoolean("paidv2_publisher_option", true);
                }
                if (z2) {
                    return a(null, null, j, z);
                }
                return new ue(8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (nf3.class) {
            try {
                wt2 wt2Var = this.f;
                if (((SharedPreferences) wt2Var.h).contains(this.a)) {
                    c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
