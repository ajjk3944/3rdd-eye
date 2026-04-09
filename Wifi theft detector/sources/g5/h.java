package g5;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.d0;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes2.dex */
public abstract class h {
    public static e a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new f() : new j();
    }

    public static e b() {
        return new j();
    }

    public static g c() {
        return new g();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).h0(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            f(view, (MaterialShapeDrawable) background);
        }
    }

    public static void f(View view, MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.Y()) {
            materialShapeDrawable.n0(d0.j(view));
        }
    }
}
