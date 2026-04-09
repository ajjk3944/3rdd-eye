package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class a6 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, h6 h6Var) {
        Objects.requireNonNull(h6Var);
        z5 z5Var = new z5(0, h6Var);
        t0.i(obj).registerOnBackInvokedCallback(1000000, z5Var);
        return z5Var;
    }

    public static void c(Object obj, Object obj2) {
        t0.i(obj).unregisterOnBackInvokedCallback(t0.e(obj2));
    }
}
