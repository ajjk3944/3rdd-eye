package K1;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3041a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f3042b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3043c;

    /* compiled from: ViewUtilsApi19.java */
    public static class a {
        public static float a(View view) {
            return view.getTransitionAlpha();
        }

        public static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    @SuppressLint({"NewApi"})
    public float a(View view) {
        if (f3041a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f3041a = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void b(View view, float f10) {
        if (f3041a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f3041a = false;
            }
        }
        view.setAlpha(f10);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void c(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f3043c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3042b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f3043c = true;
        }
        Field field = f3042b;
        if (field != null) {
            try {
                f3042b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
