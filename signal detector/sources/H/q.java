package h;

import Y4.AbstractC0235o;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c.C0364D;
import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class q {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, v vVar) {
        Objects.requireNonNull(vVar);
        C0364D c0364d = new C0364D(1, vVar);
        AbstractC0235o.l(obj).registerOnBackInvokedCallback(1000000, c0364d);
        return c0364d;
    }

    public static void c(Object obj, Object obj2) {
        AbstractC0235o.l(obj).unregisterOnBackInvokedCallback(AbstractC0235o.f(obj2));
    }
}
