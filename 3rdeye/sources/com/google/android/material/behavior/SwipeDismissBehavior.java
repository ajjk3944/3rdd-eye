package com.google.android.material.behavior;

import L0.I;
import L0.S;
import M0.g;
import V0.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public c f22498a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22499b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22500c;

    /* renamed from: d, reason: collision with root package name */
    public int f22501d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final float f22502e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public float f22503f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f22504g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final a f22505h = new a();

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final View f22509b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22510c;

        public b(View view, boolean z10) {
            this.f22509b = view;
            this.f22510c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = SwipeDismissBehavior.this.f22498a;
            View view = this.f22509b;
            if (cVar == null || !cVar.g()) {
                return;
            }
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            view.postOnAnimation(this);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean zP = this.f22499b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zP = coordinatorLayout.p(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f22499b = zP;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f22499b = false;
        }
        if (zP) {
            if (this.f22498a == null) {
                this.f22498a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f22505h);
            }
            if (!this.f22500c && this.f22498a.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i) {
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (v10.getImportantForAccessibility() == 0) {
            v10.setImportantForAccessibility(1);
            I.l(1048576, v10);
            I.i(0, v10);
            if (s(v10)) {
                I.m(v10, g.a.f4129k, new N3.b(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f22498a == null) {
            return false;
        }
        if (this.f22500c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f22498a.k(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }

    public class a extends c.AbstractC0180c {

        /* renamed from: a, reason: collision with root package name */
        public int f22506a;

        /* renamed from: b, reason: collision with root package name */
        public int f22507b = -1;

        public a() {
        }

        @Override // V0.c.AbstractC0180c
        public final int a(int i, View view) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f22501d;
            if (i10 == 0) {
                if (z10) {
                    width = this.f22506a - view.getWidth();
                    width2 = this.f22506a;
                } else {
                    width = this.f22506a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i10 != 1) {
                width = this.f22506a - view.getWidth();
                width2 = view.getWidth() + this.f22506a;
            } else if (z10) {
                width = this.f22506a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f22506a - view.getWidth();
                width2 = this.f22506a;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // V0.c.AbstractC0180c
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // V0.c.AbstractC0180c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // V0.c.AbstractC0180c
        public final void f(int i, View view) {
            this.f22507b = i;
            this.f22506a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f22500c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f22500c = false;
            }
        }

        @Override // V0.c.AbstractC0180c
        public final void h(View view, int i, int i10) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f10 = width * swipeDismissBehavior.f22503f;
            float width2 = view.getWidth() * swipeDismissBehavior.f22504g;
            float fAbs = Math.abs(i - this.f22506a);
            if (fAbs <= f10) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
        @Override // V0.c.AbstractC0180c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void i(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f22507b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L39
                java.util.WeakHashMap<android.view.View, L0.S> r5 = L0.I.f3792a
                int r5 = r9.getLayoutDirection()
                if (r5 != r3) goto L1a
                r5 = r3
                goto L1b
            L1a:
                r5 = r4
            L1b:
                int r6 = r2.f22501d
                r7 = 2
                if (r6 != r7) goto L21
                goto L52
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L66
                goto L52
            L2a:
                if (r1 <= 0) goto L66
                goto L52
            L2d:
                if (r6 != r3) goto L66
                if (r5 == 0) goto L34
                if (r1 <= 0) goto L66
                goto L52
            L34:
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L66
                goto L52
            L39:
                int r1 = r9.getLeft()
                int r5 = r8.f22506a
                int r1 = r1 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                float r6 = r2.f22502e
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r5) goto L66
            L52:
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L61
                int r10 = r9.getLeft()
                int r0 = r8.f22506a
                if (r10 >= r0) goto L5f
                goto L61
            L5f:
                int r0 = r0 + r11
                goto L69
            L61:
                int r10 = r8.f22506a
                int r0 = r10 - r11
                goto L69
            L66:
                int r0 = r8.f22506a
                r3 = r4
            L69:
                V0.c r10 = r2.f22498a
                int r11 = r9.getTop()
                boolean r10 = r10.q(r0, r11)
                if (r10 == 0) goto L7f
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                r10.<init>(r9, r3)
                java.util.WeakHashMap<android.view.View, L0.S> r11 = L0.I.f3792a
                r9.postOnAnimation(r10)
            L7f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.i(android.view.View, float, float):void");
        }

        @Override // V0.c.AbstractC0180c
        public final boolean j(int i, View view) {
            int i10 = this.f22507b;
            return (i10 == -1 || i10 == i) && SwipeDismissBehavior.this.s(view);
        }

        @Override // V0.c.AbstractC0180c
        public final void g(int i) {
        }
    }
}
