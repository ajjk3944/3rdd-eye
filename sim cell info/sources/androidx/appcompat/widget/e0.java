package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f930a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f931b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f932c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    private static Class<?> f933d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f933d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Drawable drawable) {
        Drawable drawable2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i2 < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i2 < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof u.c) {
                drawable2 = ((u.c) drawable).a();
            } else if (drawable instanceof d.c) {
                drawable2 = ((d.c) drawable).a();
            } else {
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return a(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable3)) {
                return false;
            }
        }
        return true;
    }

    static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f930a);
        } else {
            drawable.setState(f931b);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode d(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
