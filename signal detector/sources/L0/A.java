package L0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class A extends a4.t {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2397e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2398f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2399g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2400h = true;

    public void J(View view, int i, int i3, int i6, int i7) {
        if (f2399g) {
            try {
                y.a(view, i, i3, i6, i7);
            } catch (NoSuchMethodError unused) {
                f2399g = false;
            }
        }
    }

    public void K(View view, Matrix matrix) {
        if (f2397e) {
            try {
                x.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2397e = false;
            }
        }
    }

    public void L(View view, Matrix matrix) {
        if (f2398f) {
            try {
                x.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2398f = false;
            }
        }
    }

    @Override // a4.t
    public void s(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.s(view, i);
        } else if (f2400h) {
            try {
                z.a(view, i);
            } catch (NoSuchMethodError unused) {
                f2400h = false;
            }
        }
    }
}
