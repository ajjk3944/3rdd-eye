package l4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public abstract class d extends f {

    /* renamed from: d, reason: collision with root package name */
    public Runnable f23150d;

    /* renamed from: e, reason: collision with root package name */
    public OverScroller f23151e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23152f;

    /* renamed from: g, reason: collision with root package name */
    public int f23153g;

    /* renamed from: h, reason: collision with root package name */
    public int f23154h;

    /* renamed from: i, reason: collision with root package name */
    public int f23155i;

    /* renamed from: j, reason: collision with root package name */
    public VelocityTracker f23156j;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f23157a;

        /* renamed from: b, reason: collision with root package name */
        public final View f23158b;

        public a(CoordinatorLayout coordinatorLayout, View view) {
            this.f23157a = coordinatorLayout;
            this.f23158b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f23158b == null || (overScroller = d.this.f23151e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                d.this.R(this.f23157a, this.f23158b);
                return;
            }
            d dVar = d.this;
            dVar.T(this.f23157a, this.f23158b, dVar.f23151e.getCurrY());
            this.f23158b.postOnAnimation(this);
        }
    }

    public d() {
        this.f23153g = -1;
        this.f23155i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean H(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 0
            r8 = 1
            if (r1 == r8) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = r8
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.f23153g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.f23154h = r1
            goto L4b
        L2d:
            int r1 = r9.f23153g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r7
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.f23154h
            int r3 = r3 - r1
            r9.f23154h = r1
            int r4 = r9.O(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.S(r1, r2, r3, r4, r5)
        L4b:
            r1 = r7
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.f23156j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.f23156j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.f23156j
            int r3 = r9.f23153g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.P(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.N(r1, r2, r3, r4, r5)
            r1 = r8
            goto L72
        L71:
            r1 = r7
        L72:
            r9.f23152f = r7
            r9.f23153g = r6
            android.view.VelocityTracker r2 = r9.f23156j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.f23156j = r2
        L80:
            android.view.VelocityTracker r2 = r9.f23156j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f23152f
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r7
        L8f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.d.H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract boolean L(View view);

    public final void M() {
        if (this.f23156j == null) {
            this.f23156j = VelocityTracker.obtain();
        }
    }

    public final boolean N(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f23150d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f23150d = null;
        }
        if (this.f23151e == null) {
            this.f23151e = new OverScroller(view.getContext());
        }
        this.f23151e.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f23151e.computeScrollOffset()) {
            R(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f23150d = aVar;
        view.postOnAnimation(aVar);
        return true;
    }

    public abstract int O(View view);

    public abstract int P(View view);

    public abstract int Q();

    public abstract void R(CoordinatorLayout coordinatorLayout, View view);

    public final int S(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return U(coordinatorLayout, view, Q() - i10, i11, i12);
    }

    public int T(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return U(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int U(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f23155i < 0) {
            this.f23155i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f23152f) {
            int i10 = this.f23153g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f23154h) > this.f23155i) {
                this.f23154h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f23153g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = L(view) && coordinatorLayout.B(view, x10, y11);
            this.f23152f = z10;
            if (z10) {
                this.f23154h = y11;
                this.f23153g = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f23151e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f23151e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f23156j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23153g = -1;
        this.f23155i = -1;
    }
}
