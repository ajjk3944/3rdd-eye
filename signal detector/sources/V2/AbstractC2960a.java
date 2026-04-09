package v2;

import A2.RunnableC0114b;
import E2.b;
import M2.u;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC1266ha;
import com.google.android.gms.internal.ads.C1268hc;
import com.google.android.gms.internal.ads.H9;
import j2.C2551g;
import q2.C2841s;
import u2.AbstractC2953c;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2960a {
    public static void a(Context context, String str, C2551g c2551g, b bVar) {
        u.f(context, "Context cannot be null.");
        u.f(str, "AdUnitId cannot be null.");
        u.f(c2551g, "AdRequest cannot be null.");
        u.c("#008 Must be called on the main UI thread.");
        H9.a(context);
        if (((Boolean) AbstractC1266ha.i.v()).booleanValue()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.tc)).booleanValue()) {
                AbstractC2953c.f23792b.execute(new RunnableC0114b(context, str, c2551g, bVar, 7));
                return;
            }
        }
        new C1268hc(context, str).c(c2551g.f21337a, bVar);
    }

    public abstract void b(Activity activity);
}
