package ah;

import android.content.Context;
import ch.l;
import ch.n;
import mj.g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f371a = l.f3962t5.F().f3943c;

    public static final String a(Context context) {
        br.l.e(context, "context");
        l lVar = l.f3962t5;
        Context applicationContext = context.getApplicationContext();
        br.l.d(applicationContext, "getApplicationContext(...)");
        lVar.c1(applicationContext);
        return lVar.N().A0();
    }

    public static final void b(Context context, String str) {
        br.l.e(context, "context");
        n.b("OpensignalSdk", "initialise");
        if (f371a) {
            g.g0(context, str);
        } else {
            n.b("OpensignalSdk", "Not initialising SDK. This Android API is too low to run SDK.");
        }
    }
}
