package o;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: TooltipCompat.java */
/* loaded from: classes.dex */
public final class a0 {

    /* compiled from: TooltipCompat.java */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        c0 c0Var = c0.f44630l;
        if (c0Var != null && c0Var.f44632b == view) {
            c0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new c0(view, charSequence);
            return;
        }
        c0 c0Var2 = c0.f44631m;
        if (c0Var2 != null && c0Var2.f44632b == view) {
            c0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
