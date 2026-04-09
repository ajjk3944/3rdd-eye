package e5;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f20951a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f20952b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f20953c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f20954d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f20955e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f20956f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f20952b;
        return new ColorStateList(new int[][]{f20954d, iArr, StateSet.NOTHING}, new int[]{c(colorStateList, f20953c), c(colorStateList, iArr), c(colorStateList, f20951a)});
    }

    public static int b(int i10) {
        return j0.a.k(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    public static int c(ColorStateList colorStateList, int[] iArr) {
        return b(colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0);
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f20955e, 0)) != 0) {
            Log.w(f20956f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
