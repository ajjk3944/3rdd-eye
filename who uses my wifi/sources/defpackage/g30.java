package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class g30 {
    public static void a(Context context, String str, b3 b3Var, h30 h30Var) {
        ou1.k(context, "Context cannot be null.");
        ou1.k(str, "AdUnitId cannot be null.");
        ou1.k(b3Var, "AdRequest cannot be null.");
        ou1.h("#008 Must be called on the main UI thread.");
        mz1.a(context);
        if (((Boolean) q02.i.w()).booleanValue()) {
            if (((Boolean) tw1.e.c.a(mz1.Wb)).booleanValue()) {
                uu1.b.execute(new vd(context, str, b3Var, h30Var, 2, false));
                return;
            }
        }
        new k52(context, str).d(b3Var.a, h30Var);
    }

    public abstract void b(yc0 yc0Var);

    public abstract void c(Activity activity);
}
