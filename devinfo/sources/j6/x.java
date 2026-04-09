package j6;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class x extends wb.e {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f27462f = true;
    public static boolean g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f27463h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f27464i = true;

    @Override // wb.e
    public void K(int i4, View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.K(i4, view);
        } else if (f27464i) {
            try {
                a4.l.k(i4, view);
            } catch (NoSuchMethodError unused) {
                f27464i = false;
            }
        }
    }

    public void c0(View view, int i4, int i10, int i11, int i12) {
        if (f27463h) {
            try {
                a4.l.h(view, i4, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f27463h = false;
            }
        }
    }

    public void d0(View view, Matrix matrix) {
        if (f27462f) {
            try {
                a4.l.p(view, matrix);
            } catch (NoSuchMethodError unused) {
                f27462f = false;
            }
        }
    }

    public void e0(View view, Matrix matrix) {
        if (g) {
            try {
                a4.l.q(view, matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
