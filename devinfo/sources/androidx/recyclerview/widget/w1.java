package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f1521a;

    /* renamed from: b, reason: collision with root package name */
    public int f1522b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f1523c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f1524d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1525e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1526f;
    public final /* synthetic */ RecyclerView g;

    public w1(RecyclerView recyclerView) {
        this.g = recyclerView;
        q0 q0Var = RecyclerView.J0;
        this.f1524d = q0Var;
        this.f1525e = false;
        this.f1526f = false;
        this.f1523c = new OverScroller(recyclerView.getContext(), q0Var);
    }

    public final void a(int i4, int i10) {
        RecyclerView recyclerView = this.g;
        recyclerView.setScrollState(2);
        this.f1522b = 0;
        this.f1521a = 0;
        Interpolator interpolator = this.f1524d;
        q0 q0Var = RecyclerView.J0;
        if (interpolator != q0Var) {
            this.f1524d = q0Var;
            this.f1523c = new OverScroller(recyclerView.getContext(), q0Var);
        }
        this.f1523c.fling(0, 0, i4, i10, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f1525e) {
            this.f1526f = true;
            return;
        }
        RecyclerView recyclerView = this.g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i4, int i10, int i11, Interpolator interpolator) {
        RecyclerView recyclerView = this.g;
        if (i11 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i4);
            int iAbs2 = Math.abs(i10);
            boolean z3 = iAbs > iAbs2;
            int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z3) {
                iAbs = iAbs2;
            }
            i11 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), AdError.SERVER_ERROR_CODE);
        }
        int i12 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.J0;
        }
        if (this.f1524d != interpolator) {
            this.f1524d = interpolator;
            this.f1523c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f1522b = 0;
        this.f1521a = 0;
        recyclerView.setScrollState(2);
        this.f1523c.startScroll(0, 0, i4, i10, i12);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.g;
        int[] iArr = recyclerView.f1256t0;
        if (recyclerView.f1243n == null) {
            recyclerView.removeCallbacks(this);
            this.f1523c.abortAnimation();
            return;
        }
        this.f1526f = false;
        this.f1525e = true;
        recyclerView.q();
        OverScroller overScroller = this.f1523c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i13 = currX - this.f1521a;
            int i14 = currY - this.f1522b;
            this.f1521a = currX;
            this.f1522b = currY;
            int iP = RecyclerView.p(i13, recyclerView.I, recyclerView.K, recyclerView.getWidth());
            int iP2 = RecyclerView.p(i14, recyclerView.J, recyclerView.L, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f1256t0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(iP, iP2, 1, iArr2, null)) {
                iP -= iArr[0];
                iP2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(iP, iP2);
            }
            if (recyclerView.f1241m != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.j0(iArr, iP, iP2);
                int i15 = iArr[0];
                int i16 = iArr[1];
                int i17 = iP - i15;
                int i18 = iP2 - i16;
                s1 s1Var = recyclerView.f1243n.mSmoothScroller;
                if (s1Var != null && !s1Var.isPendingInitialRun() && s1Var.isRunning()) {
                    int iB = recyclerView.f1233h0.b();
                    if (iB == 0) {
                        s1Var.stop();
                    } else if (s1Var.getTargetPosition() >= iB) {
                        s1Var.setTargetPosition(iB - 1);
                        s1Var.onAnimation(i15, i16);
                    } else {
                        s1Var.onAnimation(i15, i16);
                    }
                }
                i4 = i17;
                i11 = i15;
                i10 = i18;
                i12 = i16;
            } else {
                i4 = iP;
                i10 = iP2;
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.f1249q.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1256t0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i11, i12, i4, i10, null, 1, iArr3);
            int i19 = i4 - iArr[0];
            int i20 = i10 - iArr[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.x(i11, i12);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
            s1 s1Var2 = recyclerView.f1243n.mSmoothScroller;
            if ((s1Var2 == null || !s1Var2.isPendingInitialRun()) && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i21 = i19 < 0 ? -currVelocity : i19 > 0 ? currVelocity : 0;
                    if (i20 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i20 <= 0) {
                        currVelocity = 0;
                    }
                    if (i21 < 0) {
                        recyclerView.z();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i21);
                        }
                    } else if (i21 > 0) {
                        recyclerView.A();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(i21);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(currVelocity);
                        }
                    }
                    if (i21 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.H0) {
                    y yVar = recyclerView.f1231g0;
                    int[] iArr4 = yVar.f1554c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    yVar.f1555d = 0;
                }
            } else {
                b();
                a0 a0Var = recyclerView.f1230f0;
                if (a0Var != null) {
                    a0Var.a(recyclerView, i11, i12);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                w0.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        s1 s1Var3 = recyclerView.f1243n.mSmoothScroller;
        if (s1Var3 != null && s1Var3.isPendingInitialRun()) {
            s1Var3.onAnimation(0, 0);
        }
        this.f1525e = false;
        if (!this.f1526f) {
            recyclerView.setScrollState(0);
            recyclerView.r0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = e4.v0.f22405a;
            recyclerView.postOnAnimation(this);
        }
    }
}
