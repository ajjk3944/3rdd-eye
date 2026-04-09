package i;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class q {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, v vVar) {
        Objects.requireNonNull(vVar);
        ad.c cVar = new ad.c(1, vVar);
        f4.b.h(obj).registerOnBackInvokedCallback(1000000, cVar);
        return cVar;
    }

    public static void c(Object obj, Object obj2) {
        f4.b.h(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
