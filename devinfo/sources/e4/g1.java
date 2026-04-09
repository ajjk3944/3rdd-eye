package e4;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.liuzh.deviceinfo.R;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g1 extends k1 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f22345e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final d5.a f22346f = new d5.a(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f22347h = new AccelerateInterpolator(1.5f);

    public static void f(View view, l1 l1Var) {
        androidx.datastore.preferences.protobuf.j jVarK = k(view);
        if (jVarK != null) {
            jVarK.d(l1Var);
            if (jVarK.f995a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                f(viewGroup.getChildAt(i4), l1Var);
            }
        }
    }

    public static void g(View view, l1 l1Var, c2 c2Var, boolean z3) {
        androidx.datastore.preferences.protobuf.j jVarK = k(view);
        if (jVarK != null) {
            jVarK.f996b = c2Var;
            if (!z3) {
                jVarK.e(l1Var);
                z3 = jVarK.f995a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                g(viewGroup.getChildAt(i4), l1Var, c2Var, z3);
            }
        }
    }

    public static void h(View view, c2 c2Var, List list) {
        androidx.datastore.preferences.protobuf.j jVarK = k(view);
        if (jVarK != null) {
            c2Var = jVarK.f(c2Var, list);
            if (jVarK.f995a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                h(viewGroup.getChildAt(i4), c2Var, list);
            }
        }
    }

    public static void i(View view, l1 l1Var, yb.i iVar) {
        androidx.datastore.preferences.protobuf.j jVarK = k(view);
        if (jVarK != null) {
            jVarK.g(l1Var, iVar);
            if (jVarK.f995a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                i(viewGroup.getChildAt(i4), l1Var, iVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static androidx.datastore.preferences.protobuf.j k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof f1) {
            return ((f1) tag).f22335a;
        }
        return null;
    }
}
