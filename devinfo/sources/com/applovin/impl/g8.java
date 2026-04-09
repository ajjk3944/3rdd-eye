package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f4168a;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f4172e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f4173f;
    private final WeakReference g;

    /* renamed from: h, reason: collision with root package name */
    private final long f4174h;

    /* renamed from: k, reason: collision with root package name */
    private int f4176k;

    /* renamed from: l, reason: collision with root package name */
    private float f4177l;

    /* renamed from: m, reason: collision with root package name */
    private float f4178m;

    /* renamed from: n, reason: collision with root package name */
    private long f4179n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4169b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f4170c = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private WeakReference f4175i = new WeakReference(null);
    private WeakReference j = new WeakReference(null);

    /* renamed from: o, reason: collision with root package name */
    private long f4180o = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f4171d = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void onLogVisibilityImpression();
    }

    public g8(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.f4168a = kVar.O();
        this.f4174h = ((Long) kVar.a(x4.f6179y1)).longValue();
        this.g = new WeakReference(view);
        this.f4172e = new w8(8, this, new WeakReference(aVar));
        this.f4173f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.k9
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f4379a.a(view);
            }
        };
    }

    private void c(View view) {
        View viewB = e8.b((View) this.g.get());
        if (viewB == null) {
            viewB = e8.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4168a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f4175i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f4173f);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f4168a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4168a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    public void b() {
        synchronized (this.f4169b) {
            this.f4171d.removeMessages(0);
            b((View) this.g.get());
            this.f4180o = Long.MIN_VALUE;
            this.j.clear();
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f4170c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f4170c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f4170c.width());
        if (jPxToDp < this.f4176k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.f4177l) {
            return false;
        }
        return (((float) ((long) (this.f4170c.height() * this.f4170c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.f4178m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(h3 h3Var) {
        View viewS0;
        if (h3Var instanceof b3) {
            viewS0 = h3Var.y();
        } else if (!(h3Var instanceof d3)) {
            return;
        } else {
            viewS0 = ((d3) h3Var).s0();
        }
        a(h3Var.k0(), h3Var.m0(), h3Var.n0(), h3Var.o0(), viewS0);
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f4175i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f4173f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f4173f);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f4168a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f4168a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f4175i.clear();
    }

    public void a(int i4, float f10, float f11, long j, View view) {
        synchronized (this.f4169b) {
            try {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4168a.a("VisibilityTracker", "Tracking visibility for " + view);
                }
                b();
                WeakReference weakReference = new WeakReference(view);
                this.j = weakReference;
                this.f4176k = i4;
                this.f4177l = f10;
                this.f4178m = f11;
                this.f4179n = j;
                c((View) weakReference.get());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a() {
        this.f4171d.postDelayed(this.f4172e, this.f4174h);
    }

    private boolean a(View view, View view2) {
        if (b(view, view2)) {
            if (this.f4180o == Long.MIN_VALUE) {
                this.f4180o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.f4180o >= this.f4179n) {
                return true;
            }
        }
        return false;
    }
}
