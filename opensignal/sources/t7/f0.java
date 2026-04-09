package t7;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class f0 extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f22475f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f22476g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f22477h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f22478i = true;

    @Override // a.a
    public void C(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.C(view, i10);
        } else if (f22478i) {
            try {
                e0.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f22478i = false;
            }
        }
    }

    public void T(View view, int i10, int i11, int i12, int i13) {
        if (f22477h) {
            try {
                d0.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f22477h = false;
            }
        }
    }

    public void U(View view, Matrix matrix) {
        if (f22475f) {
            try {
                c0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f22475f = false;
            }
        }
    }

    public void V(View view, Matrix matrix) {
        if (f22476g) {
            try {
                c0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f22476g = false;
            }
        }
    }
}
