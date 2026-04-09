package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g.C4353a;
import z0.C5848a;

/* compiled from: ThemeUtils.java */
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f44595a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f44596b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f44597c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f44598d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f44599e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f44600f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f44601g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C4353a.f37884j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList colorStateListD = d(context, i);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f44596b, colorStateListD.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f44595a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return C0.d.e(c(context, i), Math.round(Color.alpha(r4) * f10));
    }

    public static int c(Context context, int i) {
        int[] iArr = f44601g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f44601g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C5848a.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
