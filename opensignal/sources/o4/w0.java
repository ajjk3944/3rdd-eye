package o4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public enum w0 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static final u0 Companion = new u0();

    public static final w0 from(int i10) {
        Companion.getClass();
        return u0.b(i10);
    }

    public final void applyState(View view, ViewGroup viewGroup) {
        br.l.e(view, "view");
        br.l.e(viewGroup, "container");
        androidx.fragment.app.d.K(2);
        int i10 = v0.f18874a[ordinal()];
        if (i10 == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (androidx.fragment.app.d.K(2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (androidx.fragment.app.d.K(2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (androidx.fragment.app.d.K(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (i10 == 3) {
            if (androidx.fragment.app.d.K(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (i10 != 4) {
                return;
            }
            if (androidx.fragment.app.d.K(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }
}
