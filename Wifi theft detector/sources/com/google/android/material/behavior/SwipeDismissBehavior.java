package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import s0.a0;
import s0.x;
import y0.c;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    public y0.c f9919a;

    /* renamed from: b, reason: collision with root package name */
    public c f9920b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9921c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9922d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9924f;

    /* renamed from: e, reason: collision with root package name */
    public float f9923e = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public int f9925g = 2;

    /* renamed from: h, reason: collision with root package name */
    public float f9926h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    public float f9927i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f9928j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    public final c.AbstractC0503c f9929k = new a();

    public class a extends c.AbstractC0503c {

        /* renamed from: a, reason: collision with root package name */
        public int f9930a;

        /* renamed from: b, reason: collision with root package name */
        public int f9931b = -1;

        public a() {
        }

        @Override // y0.c.AbstractC0503c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = view.getLayoutDirection() == 1;
            int i12 = SwipeDismissBehavior.this.f9925g;
            if (i12 == 0) {
                if (z10) {
                    width = this.f9930a - view.getWidth();
                    width2 = this.f9930a;
                } else {
                    width = this.f9930a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f9930a - view.getWidth();
                width2 = view.getWidth() + this.f9930a;
            } else if (z10) {
                width = this.f9930a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f9930a - view.getWidth();
                width2 = this.f9930a;
            }
            return SwipeDismissBehavior.L(width, i10, width2);
        }

        @Override // y0.c.AbstractC0503c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // y0.c.AbstractC0503c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // y0.c.AbstractC0503c
        public void i(View view, int i10) {
            this.f9931b = i10;
            this.f9930a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f9922d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f9922d = false;
            }
        }

        @Override // y0.c.AbstractC0503c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f9920b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // y0.c.AbstractC0503c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f9927i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f9928j;
            float fAbs = Math.abs(i10 - this.f9930a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // y0.c.AbstractC0503c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f9931b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f9930a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f9930a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f9930a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                y0.c r5 = r5.f9919a
                int r1 = r3.getTop()
                boolean r5 = r5.O(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$d r5 = new com.google.android.material.behavior.SwipeDismissBehavior$d
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                r3.postOnAnimation(r5)
                return
            L3f:
                if (r4 == 0) goto L4a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$c r4 = r4.f9920b
                if (r4 == 0) goto L4a
                r4.a(r3)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        @Override // y0.c.AbstractC0503c
        public boolean m(View view, int i10) {
            int i11 = this.f9931b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.J(view);
        }

        public final boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f9930a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f9926h);
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f9925g;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                return z10 ? f10 < 0.0f : f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }
    }

    public class b implements a0 {
        public b() {
        }

        @Override // s0.a0
        public boolean a(View view, a0.a aVar) {
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f9925g;
            ViewCompat.T(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f9920b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final View f9934a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9935b;

        public d(View view, boolean z10) {
            this.f9934a = view;
            this.f9935b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            y0.c cVar2 = SwipeDismissBehavior.this.f9919a;
            if (cVar2 != null && cVar2.m(true)) {
                this.f9934a.postOnAnimation(this);
            } else {
                if (!this.f9935b || (cVar = SwipeDismissBehavior.this.f9920b) == null) {
                    return;
                }
                cVar.a(this.f9934a);
            }
        }
    }

    public static float K(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    public static int L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    public static float N(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f9919a == null) {
            return false;
        }
        if (this.f9922d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f9919a.F(motionEvent);
        return true;
    }

    public boolean J(View view) {
        return true;
    }

    public final void M(ViewGroup viewGroup) {
        if (this.f9919a == null) {
            this.f9919a = this.f9924f ? y0.c.n(viewGroup, this.f9923e, this.f9929k) : y0.c.o(viewGroup, this.f9929k);
        }
    }

    public void O(float f10) {
        this.f9928j = K(0.0f, f10, 1.0f);
    }

    public void P(c cVar) {
        this.f9920b = cVar;
    }

    public void Q(float f10) {
        this.f9927i = K(0.0f, f10, 1.0f);
    }

    public void R(int i10) {
        this.f9925g = i10;
    }

    public final void S(View view) {
        ViewCompat.d0(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        if (J(view)) {
            ViewCompat.f0(view, x.a.f24216y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zB = this.f9921c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9921c = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f9921c = false;
        }
        if (zB) {
            M(coordinatorLayout);
            if (!this.f9922d && this.f9919a.P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean zP = super.p(coordinatorLayout, view, i10);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S(view);
        }
        return zP;
    }
}
