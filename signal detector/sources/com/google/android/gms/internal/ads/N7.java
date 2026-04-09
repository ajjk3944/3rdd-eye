package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;
import q2.C2841s;
import t2.C2911G;

/* loaded from: classes.dex */
public final class N7 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: C, reason: collision with root package name */
    public static final long f9959C = ((Long) C2841s.f23267e.f23270c.a(H9.f8622K1)).longValue();

    /* renamed from: a, reason: collision with root package name */
    public final Context f9960a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f9961b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager f9962c;

    /* renamed from: d, reason: collision with root package name */
    public final KeyguardManager f9963d;

    /* renamed from: e, reason: collision with root package name */
    public A1.t f9964e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f9965f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f9966g;

    /* renamed from: h, reason: collision with root package name */
    public final O6 f9967h;
    public final H1.l i = new H1.l(2, f9959C);

    /* renamed from: j, reason: collision with root package name */
    public boolean f9968j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f9969k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f9970l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final DisplayMetrics f9971m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f9972n;

    public N7(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f9960a = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f9962c = (PowerManager) applicationContext.getSystemService("power");
        this.f9963d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f9961b = application;
            this.f9967h = new O6(application, this);
        }
        this.f9971m = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f9972n = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f9966g;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.f9966g = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f2 = rect.left;
        float f5 = this.f9971m.density;
        return new Rect((int) (f2 / f5), (int) (rect.top / f5), (int) (rect.right / f5), (int) (rect.bottom / f5));
    }

    public final void b() {
        C2911G.f23576l.post(new RunnableC1883t(8, this));
    }

    public final void c(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.f9966g;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f9969k = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r30) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.N7.d(int):void");
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f9965f = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f9964e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            A1.t tVar = new A1.t(9, this);
            this.f9964e = tVar;
            Context context = this.f9960a;
            Ou ou = p2.j.f22785C.f22812z;
            synchronized (ou) {
                if (ou.f10270b) {
                    ((WeakHashMap) ou.f10272d).put(tVar, intentFilter);
                } else {
                    H9.a(context);
                    if (!((Boolean) C2841s.f23267e.f23270c.a(H9.kc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                        context.registerReceiver(tVar, intentFilter);
                    } else {
                        context.registerReceiver(tVar, intentFilter, 4);
                    }
                }
            }
        }
        Application application = this.f9961b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f9967h);
            } catch (Exception e6) {
                u2.k.f("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f9965f;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f9965f = null;
            }
        } catch (Exception e6) {
            u2.k.f("Error while unregistering listeners from the last ViewTreeObserver.", e6);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e7) {
            u2.k.f("Error while unregistering listeners from the ViewTreeObserver.", e7);
        }
        A1.t tVar = this.f9964e;
        if (tVar != null) {
            try {
                p2.j.f22785C.f22812z.d(this.f9960a, tVar);
            } catch (IllegalStateException e8) {
                u2.k.f("Failed trying to unregister the receiver", e8);
            } catch (Exception e9) {
                p2.j.f22785C.f22795h.f("ActiveViewUnit.stopScreenStatusMonitoring", e9);
            }
            this.f9964e = null;
        }
        Application application = this.f9961b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f9967h);
            } catch (Exception e10) {
                u2.k.f("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d(3);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d(2);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f9969k = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9969k = -1;
        d(3);
        b();
        f(view);
    }
}
