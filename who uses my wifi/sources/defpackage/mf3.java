package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mf3 extends lf3 {
    public static mf3 i;

    public static final mf3 f(Context context) {
        mf3 mf3Var;
        synchronized (mf3.class) {
            try {
                if (i == null) {
                    i = new mf3(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                mf3Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mf3Var;
    }
}
