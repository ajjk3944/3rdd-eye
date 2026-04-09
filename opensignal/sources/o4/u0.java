package o4;

import android.view.View;

/* loaded from: classes.dex */
public final class u0 {
    public static w0 a(View view) {
        br.l.e(view, "<this>");
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? w0.INVISIBLE : b(view.getVisibility());
    }

    public static w0 b(int i10) {
        if (i10 == 0) {
            return w0.VISIBLE;
        }
        if (i10 == 4) {
            return w0.INVISIBLE;
        }
        if (i10 == 8) {
            return w0.GONE;
        }
        throw new IllegalArgumentException(h0.b.h(i10, "Unknown visibility "));
    }
}
