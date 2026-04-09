package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f16035a;

    /* renamed from: b, reason: collision with root package name */
    private List<View> f16036b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f16037c;

    /* renamed from: d, reason: collision with root package name */
    private d f16038d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f16039e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16040f;

    /* renamed from: g, reason: collision with root package name */
    private int f16041g;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.b();
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d();
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.c$c, reason: collision with other inner class name */
    public class RunnableC0283c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f16044a;

        public RunnableC0283c(View view) {
            this.f16044a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserver viewTreeObserver = this.f16044a.getViewTreeObserver();
            if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                c.this.f16035a = new WeakReference(viewTreeObserver);
                if (c.this.f16037c != null) {
                    viewTreeObserver.addOnPreDrawListener(c.this.f16037c);
                }
            }
        }
    }

    public interface d {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public c(List<View> list, d dVar, Handler handler, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f16036b = arrayList;
        this.f16037c = null;
        this.f16038d = dVar;
        this.f16039e = handler;
        this.f16041g = i10;
        if (list != null) {
            this.f16036b = list;
        } else {
            arrayList.clear();
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f16040f = false;
            List<View> list = this.f16036b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i10 = 0; i10 < this.f16036b.size(); i10++) {
                View view = this.f16036b.get(i10);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            d dVar = this.f16038d;
            if (dVar != null) {
                dVar.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f16040f) {
            return;
        }
        Handler handler = this.f16039e;
        if (handler != null) {
            if (this.f16041g == 1) {
                d();
            } else {
                handler.postDelayed(new b(), 100L);
            }
        }
        this.f16040f = true;
    }

    private void c() {
        try {
            b();
        } catch (Throwable th) {
            q0.b("ImpressionTracker", th.getMessage(), th);
        }
        try {
            this.f16037c = new a();
        } catch (Throwable th2) {
            q0.b("ImpressionTracker", th2.getMessage(), th2);
        }
    }

    public void a(View view) {
        View viewA;
        View view2;
        if (view != null) {
            viewA = f.a(view.getContext(), view);
            this.f16036b.add(view);
        } else {
            List<View> list = this.f16036b;
            viewA = null;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f16036b.size() && ((view2 = this.f16036b.get(i10)) == null || (viewA = f.a(view2.getContext(), view2)) == null); i10++) {
                }
            }
        }
        if (viewA == null) {
            return;
        }
        viewA.post(new RunnableC0283c(viewA));
    }

    private boolean b(View view) {
        return !e1.a(view, this.f16041g);
    }

    public void a() {
        try {
            this.f16040f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f16035a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f16035a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f16037c);
                }
                this.f16035a.clear();
            }
            this.f16038d = null;
            this.f16037c = null;
            List<View> list = this.f16036b;
            if (list != null) {
                list.clear();
            }
            this.f16036b = null;
        } catch (Throwable unused) {
        }
    }
}
