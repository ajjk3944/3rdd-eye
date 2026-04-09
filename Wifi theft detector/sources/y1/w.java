package y1;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f25100a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f25101b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f25102c;

    public static class a {
        @DoNotInline
        public static float a(View view) {
            return view.getTransitionAlpha();
        }

        @DoNotInline
        public static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    public float b(View view) {
        if (f25100a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f25100a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void d(View view, int i10, int i11, int i12, int i13);

    public void e(View view, float f10) {
        if (f25100a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f25100a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f25102c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f25101b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f25102c = true;
        }
        Field field = f25101b;
        if (field != null) {
            try {
                f25101b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);

    public void a(View view) {
    }

    public void c(View view) {
    }
}
