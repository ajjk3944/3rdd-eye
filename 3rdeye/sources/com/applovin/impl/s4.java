package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class s4 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f20934a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Object f20935b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f20936c = new Handler();

    /* renamed from: d, reason: collision with root package name */
    private boolean f20937d = false;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f20938e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f20939f;

    /* renamed from: g, reason: collision with root package name */
    private a f20940g;

    public interface a {
        void a(int i, int i10);
    }

    public s4(View view) {
        this.f20938e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f20939f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.N0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f18835b.b();
            }
        };
        this.f20939f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f20935b) {
            try {
                this.f20937d = false;
                int iMin = -1;
                int iMax = -1;
                for (Map.Entry entry : this.f20934a.entrySet()) {
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
                a aVar = this.f20940g;
                if (aVar != null) {
                    aVar.a(iMin, iMax);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        if (this.f20937d) {
            return;
        }
        this.f20937d = true;
        this.f20936c.postDelayed(new C.V(this, 15), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f20940g = null;
        View view = (View) this.f20938e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f20939f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f20938e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f20935b) {
            this.f20934a.remove(view);
        }
    }

    public void a(a aVar) {
        this.f20940g = aVar;
    }

    public void a(View view, int i) {
        synchronized (this.f20935b) {
            this.f20934a.put(view, Integer.valueOf(i));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
