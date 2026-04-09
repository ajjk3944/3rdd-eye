package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final c7.l f25328a = new c7.l(new ae.d(1));

    /* renamed from: b, reason: collision with root package name */
    public static int f25329b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static a4.h f25330c = null;

    /* renamed from: d, reason: collision with root package name */
    public static a4.h f25331d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f25332e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f25333f = false;
    public static final x.f g = new x.f(0);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f25334h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f25335i = new Object();

    public static boolean c(Context context) {
        if (f25332e == null) {
            try {
                int i4 = c0.f25251a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) c0.class), Build.VERSION.SDK_INT >= 24 ? b0.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f25332e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f25332e = Boolean.FALSE;
            }
        }
        return f25332e.booleanValue();
    }

    public static void g(v vVar) {
        synchronized (f25334h) {
            try {
                x.f fVar = g;
                fVar.getClass();
                x.a aVar = new x.a(fVar);
                while (aVar.hasNext()) {
                    l lVar = (l) ((WeakReference) aVar.next()).get();
                    if (lVar == vVar || lVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void l(int i4) {
        if (i4 != -1 && i4 != 0 && i4 != 1 && i4 != 2 && i4 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f25329b != i4) {
            f25329b = i4;
            synchronized (f25334h) {
                try {
                    x.f fVar = g;
                    fVar.getClass();
                    x.a aVar = new x.a(fVar);
                    while (aVar.hasNext()) {
                        l lVar = (l) ((WeakReference) aVar.next()).get();
                        if (lVar != null) {
                            ((v) lVar).n(true, true);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean h(int i4);

    public abstract void i(int i4);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}
