package i4;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* compiled from: RippleUtils.java */
/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4456a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f38452a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final String f38453b = C4456a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f38452a, 0)) != 0) {
            Log.w(f38453b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z10 = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
