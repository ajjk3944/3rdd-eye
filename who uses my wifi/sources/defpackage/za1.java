package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class za1 {
    public static final za1 b;
    public zj0 a;

    static {
        za1 za1Var = new za1();
        za1Var.a = null;
        b = za1Var;
    }

    public static zj0 a(Context context) {
        zj0 zj0Var;
        za1 za1Var = b;
        synchronized (za1Var) {
            try {
                if (za1Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    za1Var.a = new zj0(context);
                }
                zj0Var = za1Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zj0Var;
    }
}
