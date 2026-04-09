package E3;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1364a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1365b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1366c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1367d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1368e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f1369f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f1365b;
        return new ColorStateList(new int[][]{f1367d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f1366c), b(colorStateList, iArr), b(colorStateList, f1364a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return J.a.e(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f1368e, 0)) != 0) {
            Log.w(f1369f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }
}
