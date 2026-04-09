package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f5466a;

    /* renamed from: b, reason: collision with root package name */
    public int f5467b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f5468c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f5469d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5470e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5472g;

    public f0(RecyclerView recyclerView) {
        this.f5472g = recyclerView;
        X.e eVar = RecyclerView.f5306P0;
        this.f5469d = eVar;
        this.f5470e = false;
        this.f5471f = false;
        this.f5468c = new OverScroller(recyclerView.getContext(), eVar);
    }

    public final void a() {
        if (this.f5470e) {
            this.f5471f = true;
            return;
        }
        RecyclerView recyclerView = this.f5472g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = R.O.f3270a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i3, int i6, Interpolator interpolator) {
        RecyclerView recyclerView = this.f5472g;
        if (i6 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i3);
            boolean z6 = iAbs > iAbs2;
            int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z6) {
                iAbs = iAbs2;
            }
            i6 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i7 = i6;
        if (interpolator == null) {
            interpolator = RecyclerView.f5306P0;
        }
        if (this.f5469d != interpolator) {
            this.f5469d = interpolator;
            this.f5468c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f5467b = 0;
        this.f5466a = 0;
        recyclerView.setScrollState(2);
        this.f5468c.startScroll(0, 0, i, i3, i7);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i3;
        int i6;
        int i7;
        RecyclerView recyclerView = this.f5472g;
        int[] iArr = recyclerView.f5318G0;
        if (recyclerView.f5362m == null) {
            recyclerView.removeCallbacks(this);
            this.f5468c.abortAnimation();
            return;
        }
        this.f5471f = false;
        this.f5470e = true;
        recyclerView.m();
        OverScroller overScroller = this.f5468c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i8 = currX - this.f5466a;
            int i9 = currY - this.f5467b;
            this.f5466a = currX;
            this.f5467b = currY;
            int[] iArr2 = recyclerView.f5318G0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.s(i8, i9, 1, iArr2, null)) {
                i = i8 - iArr[0];
                i3 = i9 - iArr[1];
            } else {
                i = i8;
                i3 = i9;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i, i3);
            }
            if (recyclerView.f5360l != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.b0(iArr, i, i3);
                i6 = iArr[0];
                i7 = iArr[1];
                i -= i6;
                i3 -= i7;
                c0 c0Var = recyclerView.f5362m.mSmoothScroller;
                if (c0Var != null && !c0Var.isPendingInitialRun() && c0Var.isRunning()) {
                    int iB = recyclerView.f5372u0.b();
                    if (iB == 0) {
                        c0Var.stop();
                    } else if (c0Var.getTargetPosition() >= iB) {
                        c0Var.setTargetPosition(iB - 1);
                        c0Var.onAnimation(i6, i7);
                    } else {
                        c0Var.onAnimation(i6, i7);
                    }
                }
            } else {
                i6 = 0;
                i7 = 0;
            }
            if (!recyclerView.f5309C.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f5318G0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.t(i6, i7, i, i3, null, 1, iArr3);
            int i10 = i - iArr[0];
            int i11 = i3 - iArr[1];
            if (i6 != 0 || i7 != 0) {
                recyclerView.u(i6, i7);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
            c0 c0Var2 = recyclerView.f5362m.mSmoothScroller;
            if ((c0Var2 == null || !c0Var2.isPendingInitialRun()) && z6) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i12 = i10 < 0 ? -currVelocity : i10 > 0 ? currVelocity : 0;
                    if (i11 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i11 <= 0) {
                        currVelocity = 0;
                    }
                    if (i12 < 0) {
                        recyclerView.w();
                        if (recyclerView.f5338V.isFinished()) {
                            recyclerView.f5338V.onAbsorb(-i12);
                        }
                    } else if (i12 > 0) {
                        recyclerView.x();
                        if (recyclerView.f5341a0.isFinished()) {
                            recyclerView.f5341a0.onAbsorb(i12);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.y();
                        if (recyclerView.f5339W.isFinished()) {
                            recyclerView.f5339W.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.v();
                        if (recyclerView.b0.isFinished()) {
                            recyclerView.b0.onAbsorb(currVelocity);
                        }
                    }
                    if (i12 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = R.O.f3270a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0318o c0318o = recyclerView.f5371t0;
                int[] iArr4 = c0318o.f5560c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0318o.f5561d = 0;
            } else {
                a();
                RunnableC0320q runnableC0320q = recyclerView.f5370s0;
                if (runnableC0320q != null) {
                    runnableC0320q.a(recyclerView, i6, i7);
                }
            }
        }
        c0 c0Var3 = recyclerView.f5362m.mSmoothScroller;
        if (c0Var3 != null && c0Var3.isPendingInitialRun()) {
            c0Var3.onAnimation(0, 0);
        }
        this.f5470e = false;
        if (!this.f5471f) {
            recyclerView.setScrollState(0);
            recyclerView.h0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = R.O.f3270a;
            recyclerView.postOnAnimation(this);
        }
    }
}
