package o;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2720j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f22537a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f22538b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f22539c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f22537a);
        } else {
            drawable.setState(f22538b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsA = AbstractC2718i0.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        boolean z6 = drawable instanceof K.c;
        Object obj = drawable;
        if (z6) {
            ((K.d) ((K.c) drawable)).getClass();
            obj = null;
        }
        if (i >= 29) {
            boolean z7 = AbstractC2716h0.f22512a;
        } else if (AbstractC2716h0.f22512a) {
            try {
                Object objInvoke = AbstractC2716h0.f22513b.invoke(obj, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC2716h0.f22514c.getInt(objInvoke), AbstractC2716h0.f22515d.getInt(objInvoke), AbstractC2716h0.f22516e.getInt(objInvoke), AbstractC2716h0.f22517f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f22539c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
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
