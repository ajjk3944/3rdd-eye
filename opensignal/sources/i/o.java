package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final n f11099a = new n(new dd.o(1));

    /* renamed from: d, reason: collision with root package name */
    public static int f11100d = -100;

    /* renamed from: g, reason: collision with root package name */
    public static p3.d f11101g = null;

    /* renamed from: r, reason: collision with root package name */
    public static p3.d f11102r = null;

    /* renamed from: x, reason: collision with root package name */
    public static Boolean f11103x = null;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f11104y = false;
    public static final u.f B = new u.f(0);
    public static final Object D = new Object();
    public static final Object E = new Object();

    public static boolean b(Context context) {
        if (f11103x == null) {
            try {
                int i10 = f0.f11047a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) f0.class), e0.a() | 128).metaData;
                if (bundle != null) {
                    f11103x = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f11103x = Boolean.FALSE;
            }
        }
        return f11103x.booleanValue();
    }

    public static void e(a0 a0Var) {
        synchronized (D) {
            try {
                u.f fVar = B;
                fVar.getClass();
                u.a aVar = new u.a(fVar);
                while (aVar.hasNext()) {
                    o oVar = (o) ((WeakReference) aVar.next()).get();
                    if (oVar == a0Var || oVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i10);

    public abstract void g(int i10);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
