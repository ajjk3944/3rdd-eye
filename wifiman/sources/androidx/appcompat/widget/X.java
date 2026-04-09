package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import h.AbstractC5936j;
import w1.AbstractC8253a;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f27294a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f27295b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f27296c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f27297d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f27298e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f27299f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f27300g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f27301h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f27302i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f27303j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC5936j.f48298y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(AbstractC5936j.f48098D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListE = e(context, i10);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f27295b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i10, typedValueF.getFloat());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f27303j;
        iArr[0] = i10;
        b0 b0VarU = b0.u(context, null, iArr);
        try {
            return b0VarU.b(0, 0);
        } finally {
            b0VarU.x();
        }
    }

    static int d(Context context, int i10, float f10) {
        return AbstractC8253a.k(c(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f27303j;
        iArr[0] = i10;
        b0 b0VarU = b0.u(context, null, iArr);
        try {
            return b0VarU.c(0);
        } finally {
            b0VarU.x();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f27294a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
