package p;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f30713a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f30714b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f30715c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29 || i4 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f30713a);
        } else {
            drawable.setState(f30714b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            Insets insetsA = h1.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        boolean z3 = drawable instanceof w3.a;
        Object obj = drawable;
        if (z3) {
            ((w3.b) ((w3.a) drawable)).getClass();
            obj = null;
        }
        if (i4 >= 29) {
            boolean z10 = g1.f30696a;
        } else if (g1.f30696a) {
            try {
                Object objInvoke = g1.f30697b.invoke(obj, null);
                if (objInvoke != null) {
                    return new Rect(g1.f30698c.getInt(objInvoke), g1.f30699d.getInt(objInvoke), g1.f30700e.getInt(objInvoke), g1.f30701f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f30715c;
    }

    public static PorterDuff.Mode c(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
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
