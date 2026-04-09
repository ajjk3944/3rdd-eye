package R;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.C2195yo;
import h0.C2351a;
import java.util.List;
import m0.C2650a;

/* loaded from: classes.dex */
public final class W extends Z {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f3286e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C2650a f3287f = new C2650a(0);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f3288g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f3289h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        C2195yo c2195yoJ = j(view);
        if (c2195yoJ != null) {
            ((View) c2195yoJ.f17765d).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, r0 r0Var, boolean z6) {
        C2195yo c2195yoJ = j(view);
        if (c2195yoJ != null) {
            c2195yoJ.f17764c = r0Var;
            if (!z6) {
                View view2 = (View) c2195yoJ.f17765d;
                int[] iArr = (int[]) c2195yoJ.f17766e;
                view2.getLocationOnScreen(iArr);
                z6 = true;
                c2195yoJ.f17762a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), r0Var, z6);
            }
        }
    }

    public static void g(View view, r0 r0Var, List list) {
        C2195yo c2195yoJ = j(view);
        if (c2195yoJ != null) {
            c2195yoJ.a(r0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), r0Var, list);
            }
        }
    }

    public static void h(View view, C2351a c2351a) {
        C2195yo c2195yoJ = j(view);
        if (c2195yoJ != null) {
            View view2 = (View) c2195yoJ.f17765d;
            int[] iArr = (int[]) c2195yoJ.f17766e;
            view2.getLocationOnScreen(iArr);
            int i = c2195yoJ.f17762a - iArr[1];
            c2195yoJ.f17763b = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                h(viewGroup.getChildAt(i3), c2351a);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C2195yo j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof V) {
            return ((V) tag).f3284a;
        }
        return null;
    }
}
