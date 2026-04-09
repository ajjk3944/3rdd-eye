package M3;

import L0.I;
import L0.S;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: HeaderBehavior.java */
/* loaded from: classes2.dex */
public abstract class a<V extends View> extends c<V> {

    /* renamed from: c, reason: collision with root package name */
    public RunnableC0074a f4160c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f4161d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4162e;

    /* renamed from: f, reason: collision with root package name */
    public int f4163f;

    /* renamed from: g, reason: collision with root package name */
    public int f4164g;

    /* renamed from: h, reason: collision with root package name */
    public int f4165h;
    public VelocityTracker i;

    /* compiled from: HeaderBehavior.java */
    /* renamed from: M3.a$a, reason: collision with other inner class name */
    public class RunnableC0074a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final CoordinatorLayout f4166b;

        /* renamed from: c, reason: collision with root package name */
        public final V f4167c;

        public RunnableC0074a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f4166b = coordinatorLayout;
            this.f4167c = v10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar;
            OverScroller overScroller;
            V v10 = this.f4167c;
            if (v10 == null || (overScroller = (aVar = a.this).f4161d) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f4166b;
            if (!zComputeScrollOffset) {
                aVar.y(coordinatorLayout, v10);
                return;
            }
            aVar.A(coordinatorLayout, v10, aVar.f4161d.getCurrY());
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            v10.postOnAnimation(this);
        }
    }

    public a() {
        this.f4163f = -1;
        this.f4165h = -1;
    }

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i) {
        z(coordinatorLayout, view, i, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.f4165h
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.f4165h = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L40
            boolean r0 = r6.f4162e
            if (r0 == 0) goto L40
            int r0 = r6.f4163f
            if (r0 != r3) goto L25
            goto L8e
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 != r3) goto L2c
            goto L8e
        L2c:
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.f4164g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.f4165h
            if (r1 <= r5) goto L40
            r6.f4164g = r0
            return r2
        L40:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L87
            r6.f4163f = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.v(r8)
            if (r3 == 0) goto L60
            boolean r7 = r7.p(r8, r0, r1)
            if (r7 == 0) goto L60
            r7 = r2
            goto L61
        L60:
            r7 = r4
        L61:
            r6.f4162e = r7
            if (r7 == 0) goto L87
            r6.f4164g = r1
            int r7 = r9.getPointerId(r4)
            r6.f4163f = r7
            android.view.VelocityTracker r7 = r6.i
            if (r7 != 0) goto L77
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.i = r7
        L77:
            android.widget.OverScroller r7 = r6.f4161d
            if (r7 == 0) goto L87
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L87
            android.widget.OverScroller r7 = r6.f4161d
            r7.abortAnimation()
            return r2
        L87:
            android.view.VelocityTracker r7 = r6.i
            if (r7 == 0) goto L8e
            r7.addMovement(r9)
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r19, V r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.a.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean v(V v10) {
        return false;
    }

    public int w(V v10) {
        return -v10.getHeight();
    }

    public int x(V v10) {
        return v10.getHeight();
    }

    public int z(CoordinatorLayout coordinatorLayout, V v10, int i, int i10, int i11) {
        int iH;
        int iS = s();
        if (i10 == 0 || iS < i10 || iS > i11 || iS == (iH = B7.d.h(i, i10, i11))) {
            return 0;
        }
        d dVar = this.f4173a;
        if (dVar == null) {
            this.f4174b = iH;
        } else if (dVar.f4177c != iH) {
            dVar.f4177c = iH;
            dVar.b();
        }
        return iS - iH;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4163f = -1;
        this.f4165h = -1;
    }

    public void y(CoordinatorLayout coordinatorLayout, V v10) {
    }
}
