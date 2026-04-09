package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class m71 extends i41 {
    public static boolean D = true;
    public static boolean E = true;
    public static boolean F = true;
    public static boolean G = true;

    public void T(View view, int i, int i2, int i3, int i4) {
        if (F) {
            try {
                k71.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
    }

    public void U(View view, Matrix matrix) {
        if (D) {
            try {
                j71.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                D = false;
            }
        }
    }

    public void V(View view, Matrix matrix) {
        if (E) {
            try {
                j71.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                E = false;
            }
        }
    }

    @Override // defpackage.i41
    public void z(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.z(view, i);
        } else if (G) {
            try {
                l71.a(view, i);
            } catch (NoSuchMethodError unused) {
                G = false;
            }
        }
    }
}
