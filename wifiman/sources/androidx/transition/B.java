package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class B {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f32363a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Field f32364b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f32365c;

    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    B() {
    }

    public void a(View view) {
    }

    public float b(View view) {
        if (f32363a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f32363a = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    public abstract void d(View view, int i10, int i11, int i12, int i13);

    public void e(View view, float f10) {
        if (f32363a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f32363a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f32365c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f32364b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f32365c = true;
        }
        Field field = f32364b;
        if (field != null) {
            try {
                f32364b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
