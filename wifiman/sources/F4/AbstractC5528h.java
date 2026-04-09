package f4;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: f4.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5528h {
    static AbstractC5524d a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new C5525e() : new C5530j();
    }

    static AbstractC5524d b() {
        return new C5530j();
    }

    static C5526f c() {
        return new C5526f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof C5527g) {
            ((C5527g) background).S(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C5527g) {
            f(view, (C5527g) background);
        }
    }

    public static void f(View view, C5527g c5527g) {
        if (c5527g.L()) {
            c5527g.W(com.google.android.material.internal.n.f(view));
        }
    }
}
