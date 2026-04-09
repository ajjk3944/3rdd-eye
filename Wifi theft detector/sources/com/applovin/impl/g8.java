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

/* loaded from: classes.dex */
public class g8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f6073a;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f6077e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f6078f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f6079g;

    /* renamed from: h, reason: collision with root package name */
    private final long f6080h;

    /* renamed from: k, reason: collision with root package name */
    private int f6083k;

    /* renamed from: l, reason: collision with root package name */
    private float f6084l;

    /* renamed from: m, reason: collision with root package name */
    private float f6085m;

    /* renamed from: n, reason: collision with root package name */
    private long f6086n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6074b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f6075c = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private WeakReference f6081i = new WeakReference(null);

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f6082j = new WeakReference(null);

    /* renamed from: o, reason: collision with root package name */
    private long f6087o = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f6076d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    public g8(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.f6073a = kVar.O();
        this.f6080h = ((Long) kVar.a(x4.f8620y1)).longValue();
        this.f6079g = new WeakReference(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f6077e = new Runnable() { // from class: com.applovin.impl.ua
            @Override // java.lang.Runnable
            public final void run() {
                this.f8234a.a(weakReference);
            }
        };
        this.f6078f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.va
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f8293a.a(view);
            }
        };
    }

    private void c(View view) {
        View viewB = e8.b((View) this.f6079g.get());
        if (viewB == null) {
            viewB = e8.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6073a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f6081i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f6078f);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f6073a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f6079g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f6082j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6073a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    public void b() {
        synchronized (this.f6074b) {
            this.f6076d.removeMessages(0);
            b((View) this.f6079g.get());
            this.f6087o = Long.MIN_VALUE;
            this.f6082j.clear();
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f6075c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f6075c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f6075c.height());
        if (jPxToDp < this.f6083k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.f6084l) {
            return false;
        }
        return (((float) ((long) (this.f6075c.width() * this.f6075c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.f6085m;
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
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f6081i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f6078f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f6078f);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f6073a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f6073a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f6081i.clear();
    }

    public void a(int i10, float f10, float f11, long j10, View view) {
        synchronized (this.f6074b) {
            try {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6073a.a("VisibilityTracker", "Tracking visibility for " + view);
                }
                b();
                WeakReference weakReference = new WeakReference(view);
                this.f6082j = weakReference;
                this.f6083k = i10;
                this.f6084l = f10;
                this.f6085m = f11;
                this.f6086n = j10;
                c((View) weakReference.get());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        this.f6076d.postDelayed(this.f6077e, this.f6080h);
    }

    private boolean a(View view, View view2) {
        if (b(view, view2)) {
            if (this.f6087o == Long.MIN_VALUE) {
                this.f6087o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.f6087o >= this.f6086n) {
                return true;
            }
        }
        return false;
    }
}
