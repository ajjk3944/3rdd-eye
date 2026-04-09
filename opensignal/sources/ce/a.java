package ce;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import io.sentry.android.core.e0;
import k3.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3698a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3699b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3700c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3701d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3702e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f3703f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f3699b;
        return new ColorStateList(new int[][]{f3701d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f3700c), b(colorStateList, iArr), b(colorStateList, f3698a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return c.d(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f3702e, 0)) != 0) {
            e0.p(f3703f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }
}
