package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hw1 {
    public final kw1 a;
    public final iw1 b = new iw1("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    public hw1(kw1 kw1Var, String str) {
        new AtomicLong();
        this.a = kw1Var;
        new AtomicReference(str);
    }

    public static void a(Context context, String str, b3 b3Var, bx2 bx2Var) {
        ou1.k(context, "Context cannot be null.");
        ou1.k(str, "adUnitId cannot be null.");
        ou1.h("#008 Must be called on the main UI thread.");
        mz1.a(context);
        if (((Boolean) q02.d.w()).booleanValue()) {
            if (((Boolean) tw1.e.c.a(mz1.Wb)).booleanValue()) {
                uu1.b.execute(new vd(context, str, b3Var, bx2Var, 4, false));
                return;
            }
        }
        new uk1(context, str, b3Var.a, bx2Var).i();
    }
}
