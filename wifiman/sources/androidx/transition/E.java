package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
abstract class E extends B {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f32366d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f32367e = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    E() {
    }

    @Override // androidx.transition.B
    public void g(View view, Matrix matrix) {
        if (f32366d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f32366d = false;
            }
        }
    }

    @Override // androidx.transition.B
    public void h(View view, Matrix matrix) {
        if (f32367e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f32367e = false;
            }
        }
    }
}
