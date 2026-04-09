package l0;

import android.util.Log;
import k0.AbstractComponentCallbacksC2617v;
import k0.K;
import q5.i;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2632d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2631c f21809a = C2631c.f21808a;

    public static C2631c a(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        while (abstractComponentCallbacksC2617v != null) {
            if (abstractComponentCallbacksC2617v.v()) {
                abstractComponentCallbacksC2617v.p();
            }
            abstractComponentCallbacksC2617v = abstractComponentCallbacksC2617v.f21687J;
        }
        return f21809a;
    }

    public static void b(AbstractC2634f abstractC2634f) {
        if (K.H(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(abstractC2634f.f21811a.getClass().getName()), abstractC2634f);
        }
    }

    public static final void c(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, String str) {
        i.e(str, "previousFragmentId");
        b(new C2629a(abstractComponentCallbacksC2617v, "Attempting to reuse fragment " + abstractComponentCallbacksC2617v + " with previous ID " + str));
        a(abstractComponentCallbacksC2617v).getClass();
    }
}
