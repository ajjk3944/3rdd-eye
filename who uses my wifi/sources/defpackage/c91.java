package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c91 extends f91 {
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;
    public y20 d;

    public c91() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.f91
    public o91 b() {
        a();
        o91 o91VarG = o91.g(null, this.c);
        y20[] y20VarArr = this.b;
        l91 l91Var = o91VarG.a;
        l91Var.o(y20VarArr);
        l91Var.q(this.d);
        return o91VarG;
    }

    @Override // defpackage.f91
    public void e(y20 y20Var) {
        this.d = y20Var;
    }

    @Override // defpackage.f91
    public void g(y20 y20Var) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(y20Var.a, y20Var.b, y20Var.c, y20Var.d);
        }
    }

    public c91(o91 o91Var) {
        super(o91Var);
        this.c = o91Var.f();
    }
}
