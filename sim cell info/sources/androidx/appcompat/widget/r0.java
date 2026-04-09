package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* loaded from: classes.dex */
class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1113a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f1114b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f1115c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f1116d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f1117e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f1118f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f1119g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f1120h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f1121i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f1122j = new int[1];

    public static int a(Context context, int i2) {
        ColorStateList colorStateListD = d(context, i2);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f1114b, colorStateListD.getDefaultColor());
        }
        TypedValue typedValueE = e();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueE, true);
        return c(context, i2, typedValueE.getFloat());
    }

    public static int b(Context context, int i2) {
        int[] iArr = f1122j;
        iArr[0] = i2;
        w0 w0VarS = w0.s(context, null, iArr);
        try {
            return w0VarS.b(0, 0);
        } finally {
            w0VarS.u();
        }
    }

    static int c(Context context, int i2, float f2) {
        return t.a.d(b(context, i2), Math.round(Color.alpha(r0) * f2));
    }

    public static ColorStateList d(Context context, int i2) {
        int[] iArr = f1122j;
        iArr[0] = i2;
        w0 w0VarS = w0.s(context, null, iArr);
        try {
            return w0VarS.c(0);
        } finally {
            w0VarS.u();
        }
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f1113a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
