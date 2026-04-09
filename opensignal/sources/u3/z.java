package u3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class z {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(f3.c.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static h1 b(View view, h1 h1Var, Rect rect) {
        WindowInsets windowInsetsF = h1Var.f();
        if (windowInsetsF != null) {
            return h1.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return h1Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static String e(View view) {
        return view.getTransitionName();
    }

    public static float f(View view) {
        return view.getZ();
    }

    public static void g(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void h(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void i(View view, float f10) {
        view.setElevation(f10);
    }

    public static void j(View view, n nVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(f3.c.tag_on_apply_window_listener, nVar);
        }
        if (nVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(f3.c.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new y(view, nVar));
        }
    }

    public static void k(View view) {
        view.stopNestedScroll();
    }
}
