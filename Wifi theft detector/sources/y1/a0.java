package y1;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
public abstract class a0 extends w {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f25080d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f25081e = true;

    public static class a {
        @DoNotInline
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        @DoNotInline
        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        @DoNotInline
        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // y1.w
    public void g(View view, Matrix matrix) {
        if (f25080d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f25080d = false;
            }
        }
    }

    @Override // y1.w
    public void h(View view, Matrix matrix) {
        if (f25081e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f25081e = false;
            }
        }
    }
}
