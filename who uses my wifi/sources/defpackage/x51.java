package defpackage;

import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class x51 {
    public static void a(View view, c61 c61Var) {
        bw0 bw0Var = (bw0) view.getTag(R.id.tag_unhandled_key_listeners);
        if (bw0Var == null) {
            bw0Var = new bw0(0);
            view.setTag(R.id.tag_unhandled_key_listeners, bw0Var);
        }
        Objects.requireNonNull(c61Var);
        View.OnUnhandledKeyEventListener w51Var = new w51();
        bw0Var.put(c61Var, w51Var);
        view.addOnUnhandledKeyEventListener(w51Var);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, c61 c61Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        bw0 bw0Var = (bw0) view.getTag(R.id.tag_unhandled_key_listeners);
        if (bw0Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) bw0Var.get(c61Var)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, c9 c9Var) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
