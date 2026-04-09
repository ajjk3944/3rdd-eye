package R;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.apm.insight.R;

/* loaded from: classes.dex */
public abstract class F {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static r0 b(View view, r0 r0Var, Rect rect) {
        WindowInsets windowInsetsF = r0Var.f();
        if (windowInsetsF != null) {
            return r0.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return r0Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    public static float g(View view) {
        return view.getZ();
    }

    public static void h(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void i(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void j(View view, float f2) {
        view.setElevation(f2);
    }

    public static void k(View view, InterfaceC0188o interfaceC0188o) {
        E e6 = interfaceC0188o != null ? new E(view, interfaceC0188o) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, e6);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (e6 != null) {
            view.setOnApplyWindowInsetsListener(e6);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void l(View view) {
        view.stopNestedScroll();
    }
}
