package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.op0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class mp0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, t50 t50Var) {
        d60 d60VarE;
        i30.m(t50Var, "event");
        if (!(activity instanceof b60) || (d60VarE = ((b60) activity).e()) == null) {
            return;
        }
        d60VarE.d(t50Var);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            op0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new op0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new op0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
