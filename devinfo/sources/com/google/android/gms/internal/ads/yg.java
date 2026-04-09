package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yg implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    public static final long f18735o = ((Long) va.s.f36163e.f36166c.a(sk.K1)).longValue();

    /* renamed from: a, reason: collision with root package name */
    public final Context f18736a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f18737b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager f18738c;

    /* renamed from: d, reason: collision with root package name */
    public final KeyguardManager f18739d;

    /* renamed from: e, reason: collision with root package name */
    public kf f18740e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f18741f;
    public final WeakReference g;

    /* renamed from: h, reason: collision with root package name */
    public final we f18742h;

    /* renamed from: i, reason: collision with root package name */
    public final r9 f18743i = new r9(3, f18735o);
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f18744k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f18745l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final DisplayMetrics f18746m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f18747n;

    public yg(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f18736a = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f18738c = (PowerManager) applicationContext.getSystemService("power");
        this.f18739d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f18737b = (Application) applicationContext;
            this.f18742h = new we((Application) applicationContext, this);
        }
        this.f18746m = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f18747n = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.g;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.g = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f10 = rect.left;
        float f11 = this.f18746m.density;
        return new Rect((int) (f10 / f11), (int) (rect.top / f11), (int) (rect.right / f11), (int) (rect.bottom / f11));
    }

    public final void b() {
        ya.f0.f37440l.post(new s(7, this));
    }

    public final void c(Activity activity, int i4) {
        Window window;
        WeakReference weakReference = this.g;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f18744k = i4;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yg.d(int):void");
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f18741f = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f18740e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            kf kfVar = new kf(1, this);
            this.f18740e = kfVar;
            ua.j.C.f35282z.b(this.f18736a, kfVar, intentFilter);
        }
        Application application = this.f18737b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f18742h);
            } catch (Exception e2) {
                za.i.f("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f18741f;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f18741f = null;
            }
        } catch (Exception e2) {
            za.i.f("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e10) {
            za.i.f("Error while unregistering listeners from the ViewTreeObserver.", e10);
        }
        kf kfVar = this.f18740e;
        if (kfVar != null) {
            try {
                ua.j.C.f35282z.c(this.f18736a, kfVar);
            } catch (IllegalStateException e11) {
                za.i.f("Failed trying to unregister the receiver", e11);
            } catch (Exception e12) {
                ua.j.C.f35265h.f("ActiveViewUnit.stopScreenStatusMonitoring", e12);
            }
            this.f18740e = null;
        }
        Application application = this.f18737b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f18742h);
            } catch (Exception e13) {
                za.i.f("Error registering activity lifecycle callbacks.", e13);
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
        this.f18744k = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f18744k = -1;
        d(3);
        b();
        f(view);
    }
}
