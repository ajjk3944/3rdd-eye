package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.k0;

/* loaded from: classes.dex */
public abstract class i0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, m mVar) {
        br.l.e(mVar, "event");
        if (activity instanceof v) {
            o oVarH = ((v) activity).h();
            if (oVarH instanceof x) {
                ((x) oVarH).v1(mVar);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            k0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new k0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new k0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
