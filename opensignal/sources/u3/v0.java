package u3;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class v0 extends y0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f23224e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f23225f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f23226g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f23227h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f23228c;

    /* renamed from: d, reason: collision with root package name */
    public k3.d f23229d;

    public v0() {
        this.f23228c = i();
    }

    private static WindowInsets i() {
        if (!f23225f) {
            try {
                f23224e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f23225f = true;
        }
        Field field = f23224e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f23227h) {
            try {
                f23226g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f23227h = true;
        }
        Constructor constructor = f23226g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // u3.y0
    public h1 b() {
        a();
        h1 h1VarG = h1.g(null, this.f23228c);
        k3.d[] dVarArr = this.f23236b;
        f1 f1Var = h1VarG.f23176a;
        f1Var.q(dVarArr);
        f1Var.s(this.f23229d);
        return h1VarG;
    }

    @Override // u3.y0
    public void e(k3.d dVar) {
        this.f23229d = dVar;
    }

    @Override // u3.y0
    public void g(k3.d dVar) {
        WindowInsets windowInsets = this.f23228c;
        if (windowInsets != null) {
            this.f23228c = windowInsets.replaceSystemWindowInsets(dVar.f14014a, dVar.f14015b, dVar.f14016c, dVar.f14017d);
        }
    }

    public v0(h1 h1Var) {
        super(h1Var);
        this.f23228c = h1Var.f();
    }
}
