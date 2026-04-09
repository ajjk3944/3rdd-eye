package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import o.C7011b;
import s1.AbstractC7877e;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static c f26493a = new c(new d());

    /* renamed from: b, reason: collision with root package name */
    private static int f26494b = -100;

    /* renamed from: c, reason: collision with root package name */
    private static A1.j f26495c = null;

    /* renamed from: d, reason: collision with root package name */
    private static A1.j f26496d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f26497e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f26498f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final C7011b f26499g = new C7011b();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f26500h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f26501i = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Object f26502a = new Object();

        /* renamed from: b, reason: collision with root package name */
        final Queue f26503b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        final Executor f26504c;

        /* renamed from: d, reason: collision with root package name */
        Runnable f26505d;

        c(Executor executor) {
            this.f26504c = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        protected void c() {
            synchronized (this.f26502a) {
                try {
                    Runnable runnable = (Runnable) this.f26503b.poll();
                    this.f26505d = runnable;
                    if (runnable != null) {
                        this.f26504c.execute(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f26502a) {
                try {
                    this.f26503b.add(new Runnable() { // from class: androidx.appcompat.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f26506a.b(runnable);
                        }
                    });
                    if (this.f26505d == null) {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    f() {
    }

    static void G(f fVar) {
        synchronized (f26500h) {
            H(fVar);
        }
    }

    private static void H(f fVar) {
        synchronized (f26500h) {
            try {
                Iterator it = f26499g.iterator();
                while (it.hasNext()) {
                    f fVar2 = (f) ((WeakReference) it.next()).get();
                    if (fVar2 == fVar || fVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void M(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f26494b != i10) {
            f26494b = i10;
            g();
        }
    }

    static void Q(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().e()) {
                    String strB = AbstractC7877e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void R(final Context context) {
        if (w(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f26498f) {
                    return;
                }
                f26493a.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.x(context);
                    }
                });
                return;
            }
            synchronized (f26501i) {
                try {
                    A1.j jVar = f26495c;
                    if (jVar == null) {
                        if (f26496d == null) {
                            f26496d = A1.j.b(AbstractC7877e.b(context));
                        }
                        if (f26496d.e()) {
                        } else {
                            f26495c = f26496d;
                        }
                    } else if (!jVar.equals(f26496d)) {
                        A1.j jVar2 = f26495c;
                        f26496d = jVar2;
                        AbstractC7877e.a(context, jVar2.g());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static void d(f fVar) {
        synchronized (f26500h) {
            H(fVar);
            f26499g.add(new WeakReference(fVar));
        }
    }

    private static void g() {
        synchronized (f26500h) {
            try {
                Iterator it = f26499g.iterator();
                while (it.hasNext()) {
                    f fVar = (f) ((WeakReference) it.next()).get();
                    if (fVar != null) {
                        fVar.f();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f j(Activity activity, androidx.appcompat.app.d dVar) {
        return new h(activity, dVar);
    }

    public static f k(Dialog dialog, androidx.appcompat.app.d dVar) {
        return new h(dialog, dVar);
    }

    public static A1.j m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objQ = q();
            if (objQ != null) {
                return A1.j.h(b.a(objQ));
            }
        } else {
            A1.j jVar = f26495c;
            if (jVar != null) {
                return jVar;
            }
        }
        return A1.j.d();
    }

    public static int o() {
        return f26494b;
    }

    static Object q() {
        Context contextN;
        Iterator it = f26499g.iterator();
        while (it.hasNext()) {
            f fVar = (f) ((WeakReference) it.next()).get();
            if (fVar != null && (contextN = fVar.n()) != null) {
                return contextN.getSystemService("locale");
            }
        }
        return null;
    }

    static A1.j s() {
        return f26495c;
    }

    static boolean w(Context context) {
        if (f26497e == null) {
            try {
                Bundle bundle = r.a(context).metaData;
                if (bundle != null) {
                    f26497e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f26497e = Boolean.FALSE;
            }
        }
        return f26497e.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Context context) {
        Q(context);
        f26498f = true;
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int i10);

    public abstract void J(int i10);

    public abstract void K(View view);

    public abstract void L(View view, ViewGroup.LayoutParams layoutParams);

    public void N(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void O(int i10);

    public abstract void P(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public void h(Context context) {
    }

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract View l(int i10);

    public abstract Context n();

    public abstract int p();

    public abstract MenuInflater r();

    public abstract androidx.appcompat.app.a t();

    public abstract void u();

    public abstract void v();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);
}
