package K1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
public class v extends t {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3044d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3045e = true;

    /* compiled from: ViewUtilsApi21.java */
    public static class a {
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @SuppressLint({"NewApi"})
    public void d(View view, Matrix matrix) {
        if (f3044d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3044d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void e(View view, Matrix matrix) {
        if (f3045e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3045e = false;
            }
        }
    }
}
