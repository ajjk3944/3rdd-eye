package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class u5 {
    public static final s5 f = new s5(new t5(0));
    public static int g = -100;
    public static y70 h = null;
    public static y70 i = null;
    public static Boolean j = null;
    public static boolean k = false;
    public static final u8 l = new u8(0);
    public static final Object m = new Object();
    public static final Object n = new Object();

    public static boolean b(Context context) {
        if (j == null) {
            try {
                int i2 = d8.f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) d8.class), c8.a() | 128).metaData;
                if (bundle != null) {
                    j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                j = Boolean.FALSE;
            }
        }
        return j.booleanValue();
    }

    public static void e(h6 h6Var) {
        synchronized (m) {
            try {
                u8 u8Var = l;
                u8Var.getClass();
                o8 o8Var = new o8(u8Var);
                while (o8Var.hasNext()) {
                    u5 u5Var = (u5) ((WeakReference) o8Var.next()).get();
                    if (u5Var == h6Var || u5Var == null) {
                        o8Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k(int i2) {
        if ((i2 == -1 || i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) && g != i2) {
            g = i2;
            synchronized (m) {
                try {
                    u8 u8Var = l;
                    u8Var.getClass();
                    o8 o8Var = new o8(u8Var);
                    while (o8Var.hasNext()) {
                        u5 u5Var = (u5) ((WeakReference) o8Var.next()).get();
                        if (u5Var != null) {
                            ((h6) u5Var).m(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
