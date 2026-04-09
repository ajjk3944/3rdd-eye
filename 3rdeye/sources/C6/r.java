package C6;

import L0.I;
import L0.S;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: Views.kt */
/* loaded from: classes.dex */
public final class r {
    public static final View a(View view) {
        View view2 = null;
        while (view != null) {
            if (!c(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    public static final v9.e b(View view, int i, int i10) {
        int i11 = i10 + i;
        return d(view) ? new v9.e(i11 - 1, i, -1) : v9.h.O(i, i11);
    }

    public static final boolean c(View view) {
        kotlin.jvm.internal.l.f(view, "<this>");
        return view.getWidth() > 0 || view.getHeight() > 0;
    }

    public static final boolean d(View view) {
        kotlin.jvm.internal.l.f(view, "<this>");
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        return view.getLayoutDirection() == 1;
    }
}
