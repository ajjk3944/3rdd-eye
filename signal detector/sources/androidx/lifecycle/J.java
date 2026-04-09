package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.L;

/* loaded from: classes.dex */
public abstract class J {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0291m enumC0291m) {
        q5.i.e(enumC0291m, "event");
        if (activity instanceof InterfaceC0298u) {
            C0300w c0300wJ = ((InterfaceC0298u) activity).j();
            if (A.f.y(c0300wJ)) {
                c0300wJ.d(enumC0291m);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            L.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new L.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new L(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
