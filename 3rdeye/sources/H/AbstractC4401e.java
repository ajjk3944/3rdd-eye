package h;

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
import androidx.appcompat.widget.Toolbar;
import com.yandex.mobile.ads.impl.L;
import h.LayoutInflaterFactory2C4402f;
import h.o;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import m.AbstractC5304a;
import m0.C5309b;

/* compiled from: AppCompatDelegate.java */
/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4401e {

    /* renamed from: b, reason: collision with root package name */
    public static final c f37967b = new c(new d());

    /* renamed from: c, reason: collision with root package name */
    public static int f37968c = -100;

    /* renamed from: d, reason: collision with root package name */
    public static G0.j f37969d = null;

    /* renamed from: e, reason: collision with root package name */
    public static G0.j f37970e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f37971f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f37972g = false;

    /* renamed from: h, reason: collision with root package name */
    public static final C5309b<WeakReference<AbstractC4401e>> f37973h = new C5309b<>(0);
    public static final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f37974j = new Object();

    /* compiled from: AppCompatDelegate.java */
    /* renamed from: h.e$a */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    /* renamed from: h.e$b */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    /* renamed from: h.e$c */
    public static class c implements Executor {

        /* renamed from: b, reason: collision with root package name */
        public final Object f37975b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayDeque f37976c = new ArrayDeque();

        /* renamed from: d, reason: collision with root package name */
        public final d f37977d;

        /* renamed from: e, reason: collision with root package name */
        public Runnable f37978e;

        public c(d dVar) {
            this.f37977d = dVar;
        }

        public final void a() {
            synchronized (this.f37975b) {
                try {
                    Runnable runnable = (Runnable) this.f37976c.poll();
                    this.f37978e = runnable;
                    if (runnable != null) {
                        this.f37977d.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.f37975b) {
                try {
                    this.f37976c.add(new L(17, this, runnable));
                    if (this.f37978e == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: AppCompatDelegate.java */
    /* renamed from: h.e$d */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static boolean n(Context context) {
        if (f37971f == null) {
            try {
                int i10 = o.f38087b;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) o.class), Build.VERSION.SDK_INT >= 24 ? o.a.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f37971f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f37971f = Boolean.FALSE;
            }
        }
        return f37971f.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f) {
        synchronized (i) {
            try {
                C5309b<WeakReference<AbstractC4401e>> c5309b = f37973h;
                c5309b.getClass();
                C5309b.a aVar = new C5309b.a();
                while (aVar.hasNext()) {
                    AbstractC4401e abstractC4401e = (AbstractC4401e) ((WeakReference) aVar.next()).get();
                    if (abstractC4401e == layoutInflaterFactory2C4402f || abstractC4401e == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void A(Toolbar toolbar);

    public abstract void C(CharSequence charSequence);

    public abstract AbstractC5304a D(AbstractC5304a.InterfaceC0495a interfaceC0495a);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public abstract <T extends View> T f(int i10);

    public Context g() {
        return null;
    }

    public abstract LayoutInflaterFactory2C4402f.b h();

    public int i() {
        return -100;
    }

    public abstract MenuInflater j();

    public abstract AbstractC4397a k();

    public abstract void l();

    public abstract void m();

    public abstract void o(Configuration configuration);

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract boolean w(int i10);

    public abstract void x(int i10);

    public abstract void y(View view);

    public abstract void z(View view, ViewGroup.LayoutParams layoutParams);

    public void B(int i10) {
    }

    public Context e(Context context) {
        return context;
    }
}
