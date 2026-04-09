package u3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* loaded from: classes.dex */
public final class p0 extends t0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f23203e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final q4.a f23204f = new q4.a(0);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f23205g = new DecelerateInterpolator();

    public static void e(View view, u0 u0Var) {
        androidx.datastore.preferences.protobuf.j jVarJ = j(view);
        if (jVarJ != null) {
            jVarJ.d(u0Var);
            if (jVarJ.f1300a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), u0Var);
            }
        }
    }

    public static void f(View view, u0 u0Var, WindowInsets windowInsets, boolean z10) {
        androidx.datastore.preferences.protobuf.j jVarJ = j(view);
        if (jVarJ != null) {
            jVarJ.f1301d = windowInsets;
            if (!z10) {
                jVarJ.e();
                z10 = jVarJ.f1300a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), u0Var, windowInsets, z10);
            }
        }
    }

    public static void g(View view, h1 h1Var, List list) {
        androidx.datastore.preferences.protobuf.j jVarJ = j(view);
        if (jVarJ != null) {
            h1Var = jVarJ.f(h1Var, list);
            if (jVarJ.f1300a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), h1Var, list);
            }
        }
    }

    public static void h(View view, u0 u0Var, om.f fVar) {
        androidx.datastore.preferences.protobuf.j jVarJ = j(view);
        if (jVarJ != null) {
            jVarJ.g(u0Var, fVar);
            if (jVarJ.f1300a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), u0Var, fVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(f3.c.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static androidx.datastore.preferences.protobuf.j j(View view) {
        Object tag = view.getTag(f3.c.tag_window_insets_animation_callback);
        if (tag instanceof o0) {
            return ((o0) tag).f23198a;
        }
        return null;
    }
}
