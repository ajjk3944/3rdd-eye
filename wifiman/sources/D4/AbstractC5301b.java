package d4;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: d4.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5301b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f45755a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f45756b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f45757c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f45758d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f45759e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f45760f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f45761g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f45762h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f45763i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f45764j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f45765k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    static final String f45766l = AbstractC5301b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f45765k, 0)) != 0) {
            Log.w(f45766l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
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
