package e4;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m1 extends r1 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f22374e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f22375f = false;
    public static Constructor g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f22376h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f22377c;

    /* renamed from: d, reason: collision with root package name */
    public v3.b f22378d;

    public m1() {
        this.f22377c = i();
    }

    private static WindowInsets i() {
        if (!f22375f) {
            try {
                f22374e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f22375f = true;
        }
        Field field = f22374e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f22376h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f22376h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // e4.r1
    public c2 b() {
        a();
        c2 c2VarH = c2.h(null, this.f22377c);
        v3.b[] bVarArr = this.f22386b;
        z1 z1Var = c2VarH.f22315a;
        z1Var.r(bVarArr);
        z1Var.u(this.f22378d);
        return c2VarH;
    }

    @Override // e4.r1
    public void e(v3.b bVar) {
        this.f22378d = bVar;
    }

    @Override // e4.r1
    public void g(v3.b bVar) {
        WindowInsets windowInsets = this.f22377c;
        if (windowInsets != null) {
            this.f22377c = windowInsets.replaceSystemWindowInsets(bVar.f35793a, bVar.f35794b, bVar.f35795c, bVar.f35796d);
        }
    }

    public m1(c2 c2Var) {
        super(c2Var);
        this.f22377c = c2Var.g();
    }
}
