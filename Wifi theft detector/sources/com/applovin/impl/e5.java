package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class e5 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f5929a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Object f5930b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f5931c = new Handler();

    /* renamed from: d, reason: collision with root package name */
    private boolean f5932d = false;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f5933e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f5934f;

    /* renamed from: g, reason: collision with root package name */
    private a f5935g;

    public interface a {
        void a(int i10, int i11);
    }

    public e5(View view) {
        this.f5933e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f5934f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.ba
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f5619a.b();
            }
        };
        this.f5934f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f5930b) {
            try {
                this.f5932d = false;
                int iMin = -1;
                int iMax = -1;
                for (Map.Entry entry : this.f5929a.entrySet()) {
                    if (a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (iMin == -1 && iMax == -1) {
                            iMin = num.intValue();
                            iMax = num.intValue();
                        } else {
                            iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                            iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.f5935g;
                if (aVar != null) {
                    aVar.a(iMin, iMax);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        if (this.f5932d) {
            return;
        }
        this.f5932d = true;
        this.f5931c.postDelayed(new Runnable() { // from class: com.applovin.impl.ca
            @Override // java.lang.Runnable
            public final void run() {
                this.f5672a.c();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f5935g = null;
        View view = (View) this.f5933e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f5934f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f5933e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f5930b) {
            this.f5929a.remove(view);
        }
    }

    public void a(a aVar) {
        this.f5935g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f5930b) {
            this.f5929a.put(view, Integer.valueOf(i10));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
