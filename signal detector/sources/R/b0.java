package R;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f3304e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3305f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f3306g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f3307h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f3308c;

    /* renamed from: d, reason: collision with root package name */
    public J.c f3309d;

    public b0() {
        this.f3308c = i();
    }

    private static WindowInsets i() {
        if (!f3305f) {
            try {
                f3304e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f3305f = true;
        }
        Field field = f3304e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
            }
        }
        if (!f3307h) {
            try {
                f3306g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e8);
            }
            f3307h = true;
        }
        Constructor constructor = f3306g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e9);
            }
        }
        return null;
    }

    @Override // R.f0
    public r0 b() {
        a();
        r0 r0VarG = r0.g(null, this.f3308c);
        J.c[] cVarArr = this.f3319b;
        o0 o0Var = r0VarG.f3359a;
        o0Var.o(cVarArr);
        o0Var.q(this.f3309d);
        return r0VarG;
    }

    @Override // R.f0
    public void e(J.c cVar) {
        this.f3309d = cVar;
    }

    @Override // R.f0
    public void g(J.c cVar) {
        WindowInsets windowInsets = this.f3308c;
        if (windowInsets != null) {
            this.f3308c = windowInsets.replaceSystemWindowInsets(cVar.f2007a, cVar.f2008b, cVar.f2009c, cVar.f2010d);
        }
    }

    public b0(r0 r0Var) {
        super(r0Var);
        this.f3308c = r0Var.f();
    }
}
