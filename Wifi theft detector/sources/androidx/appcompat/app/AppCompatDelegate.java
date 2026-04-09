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
import androidx.annotation.DoNotInline;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* renamed from: a, reason: collision with root package name */
    public static c f409a = new c(new d());

    /* renamed from: b, reason: collision with root package name */
    public static int f410b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static n0.g f411c = null;

    /* renamed from: d, reason: collision with root package name */
    public static n0.g f412d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f413e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f414f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final r.b f415g = new r.b();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f416h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f417i = new Object();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NightMode {
    }

    public static class a {
        @DoNotInline
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        @DoNotInline
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Object f418a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final Queue f419b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        public final Executor f420c;

        /* renamed from: d, reason: collision with root package name */
        public Runnable f421d;

        public c(Executor executor) {
            this.f420c = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        public void b() {
            synchronized (this.f418a) {
                try {
                    Runnable runnable = (Runnable) this.f419b.poll();
                    this.f421d = runnable;
                    if (runnable != null) {
                        this.f420c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f418a) {
                try {
                    this.f419b.add(new Runnable() { // from class: androidx.appcompat.app.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppCompatDelegate.c.a(this.f577a, runnable);
                        }
                    });
                    if (this.f421d == null) {
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void E(AppCompatDelegate appCompatDelegate) {
        synchronized (f416h) {
            F(appCompatDelegate);
        }
    }

    public static void F(AppCompatDelegate appCompatDelegate) {
        synchronized (f416h) {
            try {
                Iterator it = f415g.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) it.next()).get();
                    if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void O(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (k().f()) {
                    String strB = f0.e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static void P(final Context context) {
        if (v(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f414f) {
                    return;
                }
                f409a.execute(new Runnable() { // from class: androidx.appcompat.app.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppCompatDelegate.c(context);
                    }
                });
                return;
            }
            synchronized (f417i) {
                try {
                    n0.g gVar = f411c;
                    if (gVar == null) {
                        if (f412d == null) {
                            f412d = n0.g.c(f0.e.b(context));
                        }
                        if (f412d.f()) {
                        } else {
                            f411c = f412d;
                        }
                    } else if (!gVar.equals(f412d)) {
                        n0.g gVar2 = f411c;
                        f412d = gVar2;
                        f0.e.a(context, gVar2.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        O(context);
        f414f = true;
    }

    public static void d(AppCompatDelegate appCompatDelegate) {
        synchronized (f416h) {
            F(appCompatDelegate);
            f415g.add(new WeakReference(appCompatDelegate));
        }
    }

    public static AppCompatDelegate h(Activity activity, androidx.appcompat.app.c cVar) {
        return new AppCompatDelegateImpl(activity, cVar);
    }

    public static AppCompatDelegate i(Dialog dialog, androidx.appcompat.app.c cVar) {
        return new AppCompatDelegateImpl(dialog, cVar);
    }

    public static n0.g k() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objP = p();
            if (objP != null) {
                return n0.g.j(b.a(objP));
            }
        } else {
            n0.g gVar = f411c;
            if (gVar != null) {
                return gVar;
            }
        }
        return n0.g.e();
    }

    public static int m() {
        return f410b;
    }

    public static Object p() {
        Context contextL;
        Iterator it = f415g.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) it.next()).get();
            if (appCompatDelegate != null && (contextL = appCompatDelegate.l()) != null) {
                return contextL.getSystemService("locale");
            }
        }
        return null;
    }

    public static n0.g r() {
        return f411c;
    }

    public static boolean v(Context context) {
        if (f413e == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.a(context).metaData;
                if (bundle != null) {
                    f413e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f413e = Boolean.FALSE;
            }
        }
        return f413e.booleanValue();
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D();

    public abstract boolean G(int i10);

    public abstract void H(int i10);

    public abstract void I(View view);

    public abstract void J(View view, ViewGroup.LayoutParams layoutParams);

    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void L(Toolbar toolbar);

    public abstract void M(int i10);

    public abstract void N(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i10);

    public abstract Context l();

    public abstract a.b n();

    public abstract int o();

    public abstract MenuInflater q();

    public abstract ActionBar s();

    public abstract void t();

    public abstract void u();

    public abstract void w(Configuration configuration);

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z(Bundle bundle);
}
