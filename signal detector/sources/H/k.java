package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import u.C2932a;
import u.C2937f;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final C0.B f20346a = new C0.B(new H1.f(3));

    /* renamed from: b, reason: collision with root package name */
    public static int f20347b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static N.h f20348c = null;

    /* renamed from: d, reason: collision with root package name */
    public static N.h f20349d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f20350e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f20351f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final C2937f f20352g = new C2937f(0);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f20353h = new Object();
    public static final Object i = new Object();

    public static void a() {
        N.h hVar;
        C2937f c2937f = f20352g;
        c2937f.getClass();
        C2932a c2932a = new C2932a(c2937f);
        while (c2932a.hasNext()) {
            k kVar = (k) ((WeakReference) c2932a.next()).get();
            if (kVar != null) {
                v vVar = (v) kVar;
                Context context = vVar.f20418k;
                if (e(context) && (hVar = f20348c) != null && !hVar.equals(f20349d)) {
                    f20346a.execute(new A0.h(context, 4));
                }
                vVar.s(true, true);
            }
        }
    }

    public static Object b() {
        Context context;
        C2937f c2937f = f20352g;
        c2937f.getClass();
        C2932a c2932a = new C2932a(c2937f);
        while (c2932a.hasNext()) {
            k kVar = (k) ((WeakReference) c2932a.next()).get();
            if (kVar != null && (context = ((v) kVar).f20418k) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean e(Context context) {
        if (f20350e == null) {
            try {
                int i3 = AppLocalesMetadataHolderService.f4759a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), Build.VERSION.SDK_INT >= 24 ? AbstractC2342B.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f20350e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f20350e = Boolean.FALSE;
            }
        }
        return f20350e.booleanValue();
    }

    public static void i(v vVar) {
        synchronized (f20353h) {
            try {
                C2937f c2937f = f20352g;
                c2937f.getClass();
                C2932a c2932a = new C2932a(c2937f);
                while (c2932a.hasNext()) {
                    k kVar = (k) ((WeakReference) c2932a.next()).get();
                    if (kVar == vVar || kVar == null) {
                        c2932a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k(N.h hVar) {
        Objects.requireNonNull(hVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objB = b();
            if (objB != null) {
                j.b(objB, i.a(hVar.f2966a.a()));
                return;
            }
            return;
        }
        if (hVar.equals(f20348c)) {
            return;
        }
        synchronized (f20353h) {
            f20348c = hVar;
            a();
        }
    }

    public static void p(int i3) {
        if (i3 != -1 && i3 != 0 && i3 != 1 && i3 != 2 && i3 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f20347b != i3) {
            f20347b = i3;
            synchronized (f20353h) {
                try {
                    C2937f c2937f = f20352g;
                    c2937f.getClass();
                    C2932a c2932a = new C2932a(c2937f);
                    while (c2932a.hasNext()) {
                        k kVar = (k) ((WeakReference) c2932a.next()).get();
                        if (kVar != null) {
                            ((v) kVar).s(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void r(Context context) {
        if (e(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f20351f) {
                    return;
                }
                f20346a.execute(new A0.h(context, 3));
                return;
            }
            synchronized (i) {
                try {
                    N.h hVar = f20348c;
                    if (hVar == null) {
                        if (f20349d == null) {
                            f20349d = N.h.b(G.c.g(context));
                        }
                        if (f20349d.f2966a.isEmpty()) {
                        } else {
                            f20348c = f20349d;
                        }
                    } else if (!hVar.equals(f20349d)) {
                        N.h hVar2 = f20348c;
                        f20349d = hVar2;
                        G.c.f(context, hVar2.f2966a.a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void g();

    public abstract void h();

    public abstract boolean j(int i3);

    public abstract void l(int i3);

    public abstract void m(View view);

    public abstract void n(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void q(CharSequence charSequence);
}
