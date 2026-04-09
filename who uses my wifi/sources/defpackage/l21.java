package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l21 {
    public final n21 a;

    public l21(n21 n21Var) {
        this.a = n21Var;
    }

    public static final l21 a(Context context) {
        k21 k21Var;
        int i = Build.VERSION.SDK_INT;
        c3 c3Var = c3.a;
        if ((i >= 30 ? c3Var.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) tc0.v());
            i30.l(systemService, "context.getSystemService…opicsManager::class.java)");
            k21Var = new k21(tc0.k(systemService), 1);
        } else {
            if ((i >= 30 ? c3Var.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) tc0.v());
                i30.l(systemService2, "context.getSystemService…opicsManager::class.java)");
                k21Var = new k21(tc0.k(systemService2), 0);
            } else {
                k21Var = null;
            }
        }
        if (k21Var != null) {
            return new l21(k21Var);
        }
        return null;
    }

    public n70 b(zy zyVar) {
        i30.m(zyVar, "request");
        on onVar = fp.a;
        return pu1.f(gi2.b(wl2.a(za0.a), new km(this, zyVar, null, 6)));
    }
}
