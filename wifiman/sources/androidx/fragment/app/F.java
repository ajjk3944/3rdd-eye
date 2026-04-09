package androidx.fragment.app;

import android.view.View;
import androidx.transition.C4030e;
import java.util.ArrayList;
import o.C7010a;

/* loaded from: classes.dex */
abstract class F {

    /* renamed from: a, reason: collision with root package name */
    static final H f31219a = new G();

    /* renamed from: b, reason: collision with root package name */
    static final H f31220b = b();

    static void a(Fragment fragment, Fragment fragment2, boolean z10, C7010a c7010a, boolean z11) {
        if (z10) {
            fragment2.w();
        } else {
            fragment.w();
        }
    }

    private static H b() {
        try {
            return (H) C4030e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void c(C7010a c7010a, C7010a c7010a2) {
        for (int size = c7010a.size() - 1; size >= 0; size--) {
            if (!c7010a2.containsKey((String) c7010a.l(size))) {
                c7010a.j(size);
            }
        }
    }

    static void d(ArrayList arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i10);
        }
    }
}
