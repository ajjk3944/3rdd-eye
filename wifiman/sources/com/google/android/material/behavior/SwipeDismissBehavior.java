package com.google.android.material.behavior;

import F1.W;
import G1.t;
import G1.w;
import M1.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ar.core.ImageMetadata;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    M1.c f37008a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37009b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37010c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37012e;

    /* renamed from: d, reason: collision with root package name */
    private float f37011d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    int f37013f = 2;

    /* renamed from: g, reason: collision with root package name */
    float f37014g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    float f37015h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    float f37016i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    private final c.AbstractC0492c f37017j = new a();

    class a extends c.AbstractC0492c {

        /* renamed from: a, reason: collision with root package name */
        private int f37018a;

        /* renamed from: b, reason: collision with root package name */
        private int f37019b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f37018a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f37014g);
            }
            boolean z10 = W.z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f37013f;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z10) {
                    if (f10 >= 0.0f) {
                        return false;
                    }
                } else if (f10 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            if (z10) {
                if (f10 <= 0.0f) {
                    return false;
                }
            } else if (f10 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // M1.c.AbstractC0492c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = W.z(view) == 1;
            int i12 = SwipeDismissBehavior.this.f37013f;
            if (i12 == 0) {
                if (z10) {
                    width = this.f37018a - view.getWidth();
                    width2 = this.f37018a;
                } else {
                    width = this.f37018a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f37018a - view.getWidth();
                width2 = view.getWidth() + this.f37018a;
            } else if (z10) {
                width = this.f37018a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f37018a - view.getWidth();
                width2 = this.f37018a;
            }
            return SwipeDismissBehavior.H(width, i10, width2);
        }

        @Override // M1.c.AbstractC0492c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // M1.c.AbstractC0492c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // M1.c.AbstractC0492c
        public void i(View view, int i10) {
            this.f37019b = i10;
            this.f37018a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f37010c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f37010c = false;
            }
        }

        @Override // M1.c.AbstractC0492c
        public void j(int i10) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // M1.c.AbstractC0492c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f37015h;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f37016i;
            float fAbs = Math.abs(i10 - this.f37018a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // M1.c.AbstractC0492c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f37019b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f37018a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f37018a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f37018a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                M1.c r5 = r5.f37008a
                int r1 = r3.getTop()
                boolean r5 = r5.F(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$c r5 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                F1.W.e0(r3, r5)
                goto L46
            L3f:
                if (r4 == 0) goto L46
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r3.getClass()
            L46:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        @Override // M1.c.AbstractC0492c
        public boolean m(View view, int i10) {
            int i11 = this.f37019b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.F(view);
        }
    }

    class b implements w {
        b() {
        }

        @Override // G1.w
        public boolean a(View view, w.a aVar) {
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z10 = W.z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f37013f;
            W.W(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    private class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final View f37022a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f37023b;

        c(View view, boolean z10) {
            this.f37022a = view;
            this.f37023b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            M1.c cVar = SwipeDismissBehavior.this.f37008a;
            if (cVar != null && cVar.k(true)) {
                W.e0(this.f37022a, this);
            } else if (this.f37023b) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    static float G(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int H(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void I(ViewGroup viewGroup) {
        if (this.f37008a == null) {
            this.f37008a = this.f37012e ? M1.c.l(viewGroup, this.f37011d, this.f37017j) : M1.c.m(viewGroup, this.f37017j);
        }
    }

    static float J(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void N(View view) {
        W.g0(view, ImageMetadata.SHADING_MODE);
        if (F(view)) {
            W.i0(view, t.a.f6812y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f37008a == null) {
            return false;
        }
        if (this.f37010c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f37008a.z(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f10) {
        this.f37016i = G(0.0f, f10, 1.0f);
    }

    public void L(float f10) {
        this.f37015h = G(0.0f, f10, 1.0f);
    }

    public void M(int i10) {
        this.f37013f = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f37009b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f37009b = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f37009b = false;
        }
        if (!z10) {
            return false;
        }
        I(coordinatorLayout);
        return !this.f37010c && this.f37008a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean zL = super.l(coordinatorLayout, view, i10);
        if (W.x(view) == 0) {
            W.u0(view, 1);
            N(view);
        }
        return zL;
    }
}
