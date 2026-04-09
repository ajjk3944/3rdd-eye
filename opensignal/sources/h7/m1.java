package h7;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m1 implements Runnable {
    public final /* synthetic */ RecyclerView B;

    /* renamed from: a, reason: collision with root package name */
    public int f10136a;

    /* renamed from: d, reason: collision with root package name */
    public int f10137d;

    /* renamed from: g, reason: collision with root package name */
    public OverScroller f10138g;

    /* renamed from: r, reason: collision with root package name */
    public Interpolator f10139r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10140x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10141y;

    public m1(RecyclerView recyclerView) {
        this.B = recyclerView;
        b4.d dVar = RecyclerView.f2054e1;
        this.f10139r = dVar;
        this.f10140x = false;
        this.f10141y = false;
        this.f10138g = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i10, int i11) {
        RecyclerView recyclerView = this.B;
        recyclerView.setScrollState(2);
        this.f10137d = 0;
        this.f10136a = 0;
        Interpolator interpolator = this.f10139r;
        b4.d dVar = RecyclerView.f2054e1;
        if (interpolator != dVar) {
            this.f10139r = dVar;
            this.f10138g = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f10138g.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f10140x) {
            this.f10141y = true;
            return;
        }
        RecyclerView recyclerView = this.B;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = u3.i0.f23177a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i10, int i11, int i12, Interpolator interpolator) {
        RecyclerView recyclerView = this.B;
        if (i12 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i13 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.f2054e1;
        }
        if (this.f10139r != interpolator) {
            this.f10139r = interpolator;
            this.f10138g = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f10137d = 0;
        this.f10136a = 0;
        recyclerView.setScrollState(2);
        this.f10138g.startScroll(0, 0, i10, i11, i13);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        RecyclerView recyclerView = this.B;
        int[] iArr = recyclerView.P0;
        if (recyclerView.J == null) {
            recyclerView.removeCallbacks(this);
            this.f10138g.abortAnimation();
            return;
        }
        this.f10141y = false;
        this.f10140x = true;
        recyclerView.p();
        OverScroller overScroller = this.f10138g;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f10136a;
            int i15 = currY - this.f10137d;
            this.f10136a = currX;
            this.f10137d = currY;
            int iO = RecyclerView.o(i14, recyclerView.f2066h0, recyclerView.f2068j0, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i15, recyclerView.f2067i0, recyclerView.f2069k0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.P0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(iO, iO2, 1, iArr2, null)) {
                iO -= iArr[0];
                iO2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.I != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.h0(iO, iO2, iArr);
                int i16 = iArr[0];
                int i17 = iArr[1];
                int i18 = iO - i16;
                int i19 = iO2 - i17;
                e0 e0Var = recyclerView.J.f10277e;
                if (e0Var != null && !e0Var.f10041d && e0Var.f10042e) {
                    int iB = recyclerView.D0.b();
                    if (iB == 0) {
                        e0Var.j();
                    } else if (e0Var.f10038a >= iB) {
                        e0Var.f10038a = iB - 1;
                        e0Var.h(i16, i17);
                    } else {
                        e0Var.h(i16, i17);
                    }
                }
                i10 = i18;
                i12 = i16;
                i11 = i19;
                i13 = i17;
            } else {
                i10 = iO;
                i11 = iO2;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.L.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.P0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i12, i13, i10, i11, null, 1, iArr3);
            int i20 = i10 - iArr[0];
            int i21 = i11 - iArr[1];
            if (i12 != 0 || i13 != 0) {
                recyclerView.x(i12, i13);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i20 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i21 != 0));
            e0 e0Var2 = recyclerView.J.f10277e;
            if ((e0Var2 == null || !e0Var2.f10041d) && z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i22 = i20 < 0 ? -currVelocity : i20 > 0 ? currVelocity : 0;
                    if (i21 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i21 <= 0) {
                        currVelocity = 0;
                    }
                    if (i22 < 0) {
                        recyclerView.z();
                        if (recyclerView.f2066h0.isFinished()) {
                            recyclerView.f2066h0.onAbsorb(-i22);
                        }
                    } else if (i22 > 0) {
                        recyclerView.A();
                        if (recyclerView.f2068j0.isFinished()) {
                            recyclerView.f2068j0.onAbsorb(i22);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.f2067i0.isFinished()) {
                            recyclerView.f2067i0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.f2069k0.isFinished()) {
                            recyclerView.f2069k0.onAbsorb(currVelocity);
                        }
                    }
                    if (i22 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = u3.i0.f23177a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f2052c1) {
                    androidx.datastore.preferences.protobuf.l lVar = recyclerView.C0;
                    int[] iArr4 = (int[]) lVar.f1314d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    lVar.f1313c = 0;
                }
            } else {
                b();
                z zVar = recyclerView.B0;
                if (zVar != null) {
                    zVar.a(recyclerView, i12, i13);
                }
            }
        }
        e0 e0Var3 = recyclerView.J.f10277e;
        if (e0Var3 != null && e0Var3.f10041d) {
            e0Var3.h(0, 0);
        }
        this.f10140x = false;
        if (!this.f10141y) {
            recyclerView.setScrollState(0);
            recyclerView.o0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = u3.i0.f23177a;
            recyclerView.postOnAnimation(this);
        }
    }
}
