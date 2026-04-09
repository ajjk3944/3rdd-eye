package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w81 extends z81 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final fu f = new fu(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view) {
        z20 z20VarJ = j(view);
        if (z20VarJ != null) {
            ((View) z20VarJ.d).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z) {
        z20 z20VarJ = j(view);
        if (z20VarJ != null) {
            z20VarJ.c = windowInsets;
            if (!z) {
                View view2 = (View) z20VarJ.d;
                int[] iArr = (int[]) z20VarJ.e;
                view2.getLocationOnScreen(iArr);
                z = true;
                z20VarJ.a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    public static void g(View view, o91 o91Var, List list) {
        z20 z20VarJ = j(view);
        if (z20VarJ != null) {
            z20VarJ.a(o91Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), o91Var, list);
            }
        }
    }

    public static void h(View view, vq2 vq2Var) {
        z20 z20VarJ = j(view);
        if (z20VarJ != null) {
            View view2 = (View) z20VarJ.d;
            int[] iArr = (int[]) z20VarJ.e;
            view2.getLocationOnScreen(iArr);
            int i = z20VarJ.a - iArr[1];
            z20VarJ.b = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), vq2Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static z20 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof v81) {
            return ((v81) tag).a;
        }
        return null;
    }
}
