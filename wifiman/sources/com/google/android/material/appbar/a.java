package com.google.android.material.appbar;

import F1.W;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
abstract class a extends c {

    /* renamed from: d, reason: collision with root package name */
    private Runnable f36971d;

    /* renamed from: e, reason: collision with root package name */
    OverScroller f36972e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f36973f;

    /* renamed from: g, reason: collision with root package name */
    private int f36974g;

    /* renamed from: h, reason: collision with root package name */
    private int f36975h;

    /* renamed from: i, reason: collision with root package name */
    private int f36976i;

    /* renamed from: j, reason: collision with root package name */
    private VelocityTracker f36977j;

    /* renamed from: com.google.android.material.appbar.a$a, reason: collision with other inner class name */
    private class RunnableC1203a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f36978a;

        /* renamed from: b, reason: collision with root package name */
        private final View f36979b;

        RunnableC1203a(CoordinatorLayout coordinatorLayout, View view) {
            this.f36978a = coordinatorLayout;
            this.f36979b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f36979b == null || (overScroller = a.this.f36972e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.M(this.f36978a, this.f36979b);
                return;
            }
            a aVar = a.this;
            aVar.O(this.f36978a, this.f36979b, aVar.f36972e.getCurrY());
            W.e0(this.f36979b, this);
        }
    }

    public a() {
        this.f36974g = -1;
        this.f36976i = -1;
    }

    private void H() {
        if (this.f36977j == null) {
            this.f36977j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f36974g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f36975h = r12
            goto L4c
        L2d:
            int r0 = r11.f36974g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f36975h
            int r7 = r1 - r0
            r11.f36975h = r0
            int r8 = r11.J(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.N(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f36977j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f36977j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f36977j
            int r4 = r11.f36974g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.K(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.I(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f36973f = r3
            r11.f36974g = r1
            android.view.VelocityTracker r13 = r11.f36977j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f36977j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f36977j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f36973f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    abstract boolean G(View view);

    final boolean I(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f36971d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f36971d = null;
        }
        if (this.f36972e == null) {
            this.f36972e = new OverScroller(view.getContext());
        }
        this.f36972e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f36972e.computeScrollOffset()) {
            M(coordinatorLayout, view);
            return false;
        }
        RunnableC1203a runnableC1203a = new RunnableC1203a(coordinatorLayout, view);
        this.f36971d = runnableC1203a;
        W.e0(view, runnableC1203a);
        return true;
    }

    abstract int J(View view);

    abstract int K(View view);

    abstract int L();

    abstract void M(CoordinatorLayout coordinatorLayout, View view);

    final int N(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return P(coordinatorLayout, view, L() - i10, i11, i12);
    }

    int O(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return P(coordinatorLayout, view, i10, PduHandle.NONE, MPv3.MAX_MESSAGE_ID);
    }

    abstract int P(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f36976i < 0) {
            this.f36976i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f36973f) {
            int i10 = this.f36974g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f36975h) > this.f36976i) {
                this.f36975h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f36974g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = G(view) && coordinatorLayout.z(view, x10, y11);
            this.f36973f = z10;
            if (z10) {
                this.f36975h = y11;
                this.f36974g = motionEvent.getPointerId(0);
                H();
                OverScroller overScroller = this.f36972e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f36972e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f36977j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36974g = -1;
        this.f36976i = -1;
    }
}
