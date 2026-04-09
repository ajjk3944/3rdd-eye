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
public class t7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21474a;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f21478e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f21479f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f21480g;

    /* renamed from: h, reason: collision with root package name */
    private final long f21481h;

    /* renamed from: k, reason: collision with root package name */
    private int f21483k;

    /* renamed from: l, reason: collision with root package name */
    private float f21484l;

    /* renamed from: m, reason: collision with root package name */
    private float f21485m;

    /* renamed from: n, reason: collision with root package name */
    private long f21486n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21475b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f21476c = new Rect();
    private WeakReference i = new WeakReference(null);

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f21482j = new WeakReference(null);

    /* renamed from: o, reason: collision with root package name */
    private long f21487o = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f21477d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    public t7(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.f21474a = kVar.O();
        this.f21481h = ((Long) kVar.a(l4.f20052w1)).longValue();
        this.f21480g = new WeakReference(view);
        this.f21478e = new D(5, this, new WeakReference(aVar));
        this.f21479f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.O0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f18841b.a(view);
            }
        };
    }

    private void c(View view) {
        View viewB = r7.b((View) this.f21480g.get());
        if (viewB == null) {
            viewB = r7.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21474a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f21479f);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f21474a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f21480g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f21482j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21474a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    public void b() {
        synchronized (this.f21475b) {
            this.f21477d.removeMessages(0);
            b((View) this.f21480g.get());
            this.f21487o = Long.MIN_VALUE;
            this.f21482j.clear();
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f21476c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f21476c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f21476c.width());
        if (jPxToDp < this.f21483k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.f21484l) {
            return false;
        }
        return (((float) ((long) (this.f21476c.height() * this.f21476c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.f21485m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(y2 y2Var) {
        View viewL0;
        if (y2Var instanceof s2) {
            viewL0 = y2Var.y();
        } else if (!(y2Var instanceof u2)) {
            return;
        } else {
            viewL0 = ((u2) y2Var).l0();
        }
        a(y2Var.d0(), y2Var.f0(), y2Var.g0(), y2Var.h0(), viewL0);
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f21479f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f21479f);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f21474a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f21474a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.i.clear();
    }

    public void a(int i, float f10, float f11, long j4, View view) {
        synchronized (this.f21475b) {
            try {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21474a.a("VisibilityTracker", "Tracking visibility for " + view);
                }
                b();
                WeakReference weakReference = new WeakReference(view);
                this.f21482j = weakReference;
                this.f21483k = i;
                this.f21484l = f10;
                this.f21485m = f11;
                this.f21486n = j4;
                c((View) weakReference.get());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        this.f21477d.postDelayed(this.f21478e, this.f21481h);
    }

    private boolean a(View view, View view2) {
        if (b(view, view2)) {
            if (this.f21487o == Long.MIN_VALUE) {
                this.f21487o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.f21487o >= this.f21486n) {
                return true;
            }
        }
        return false;
    }
}
