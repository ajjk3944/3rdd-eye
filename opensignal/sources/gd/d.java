package gd;

import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bc.e0;

/* loaded from: classes.dex */
public abstract class d extends f {

    /* renamed from: c, reason: collision with root package name */
    public e0 f9505c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f9506d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9507e;

    /* renamed from: f, reason: collision with root package name */
    public int f9508f;

    /* renamed from: g, reason: collision with root package name */
    public int f9509g;

    /* renamed from: h, reason: collision with root package name */
    public int f9510h;

    /* renamed from: i, reason: collision with root package name */
    public VelocityTracker f9511i;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    @Override // e3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.f9510h
            if (r0 >= 0) goto L12
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.f9510h = r0
        L12:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L42
            boolean r0 = r7.f9507e
            if (r0 == 0) goto L42
            int r0 = r7.f9508f
            if (r0 != r3) goto L26
            goto La8
        L26:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L2e
            goto La8
        L2e:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.f9509g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.f9510h
            if (r1 <= r5) goto L42
            r7.f9509g = r0
            return r2
        L42:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto La1
            r7.f9508f = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            r6 = r9
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            java.lang.ref.WeakReference r5 = r5.f5451n
            if (r5 == 0) goto L72
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L7a
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L7a
            boolean r3 = r5.canScrollVertically(r3)
            if (r3 != 0) goto L7a
        L72:
            boolean r8 = r8.p(r9, r0, r1)
            if (r8 == 0) goto L7a
            r8 = r2
            goto L7b
        L7a:
            r8 = r4
        L7b:
            r7.f9507e = r8
            if (r8 == 0) goto La1
            r7.f9509g = r1
            int r8 = r10.getPointerId(r4)
            r7.f9508f = r8
            android.view.VelocityTracker r8 = r7.f9511i
            if (r8 != 0) goto L91
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.f9511i = r8
        L91:
            android.widget.OverScroller r8 = r7.f9506d
            if (r8 == 0) goto La1
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto La1
            android.widget.OverScroller r8 = r7.f9506d
            r8.abortAnimation()
            return r2
        La1:
            android.view.VelocityTracker r8 = r7.f9511i
            if (r8 == 0) goto La8
            r8.addMovement(r10)
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.d.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb A[ADDED_TO_REGION] */
    @Override // e3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.d.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int u();

    public abstract int v(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    public final void w(CoordinatorLayout coordinatorLayout, View view, int i10) {
        v(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
