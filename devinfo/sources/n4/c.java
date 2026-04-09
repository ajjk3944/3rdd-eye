package n4;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.q0;
import b5.o;
import e4.v0;
import java.util.Arrays;
import java.util.WeakHashMap;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static final q0 f29745v = new q0(1);

    /* renamed from: a, reason: collision with root package name */
    public int f29746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29747b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f29749d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f29750e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f29751f;
    public float[] g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f29752h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f29753i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f29754k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f29755l;

    /* renamed from: m, reason: collision with root package name */
    public final float f29756m;

    /* renamed from: n, reason: collision with root package name */
    public final float f29757n;

    /* renamed from: o, reason: collision with root package name */
    public final int f29758o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f29759p;

    /* renamed from: q, reason: collision with root package name */
    public final t1 f29760q;

    /* renamed from: r, reason: collision with root package name */
    public View f29761r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f29762s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f29763t;

    /* renamed from: c, reason: collision with root package name */
    public int f29748c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final o f29764u = new o(27, this);

    public c(Context context, CoordinatorLayout coordinatorLayout, t1 t1Var) {
        if (t1Var == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f29763t = coordinatorLayout;
        this.f29760q = t1Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f29758o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f29747b = viewConfiguration.getScaledTouchSlop();
        this.f29756m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f29757n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f29759p = new OverScroller(context, f29745v);
    }

    public final void a() {
        this.f29748c = -1;
        float[] fArr = this.f29749d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f29750e, 0.0f);
            Arrays.fill(this.f29751f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.f29752h, 0);
            Arrays.fill(this.f29753i, 0);
            Arrays.fill(this.j, 0);
            this.f29754k = 0;
        }
        VelocityTracker velocityTracker = this.f29755l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f29755l = null;
        }
    }

    public final void b(int i4, View view) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f29763t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f29761r = view;
        this.f29748c = i4;
        this.f29760q.y(i4, view);
        n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            me.t1 r1 = r3.f29760q
            int r4 = r1.r(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.s()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f29747b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f29747b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f29747b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.c.c(android.view.View, float, float):boolean");
    }

    public final void d(int i4) {
        float[] fArr = this.f29749d;
        if (fArr != null) {
            int i10 = this.f29754k;
            int i11 = 1 << i4;
            if ((i10 & i11) != 0) {
                fArr[i4] = 0.0f;
                this.f29750e[i4] = 0.0f;
                this.f29751f[i4] = 0.0f;
                this.g[i4] = 0.0f;
                this.f29752h[i4] = 0;
                this.f29753i[i4] = 0;
                this.j[i4] = 0;
                this.f29754k = (~i11) & i10;
            }
        }
    }

    public final int e(int i4, int i10, int i11) {
        if (i4 == 0) {
            return 0;
        }
        float width = this.f29763t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i4) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i10);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / i11) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f29746a == 2) {
            OverScroller overScroller = this.f29759p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f29761r.getLeft();
            int top = currY - this.f29761r.getTop();
            if (left != 0) {
                View view = this.f29761r;
                WeakHashMap weakHashMap = v0.f22405a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f29761r;
                WeakHashMap weakHashMap2 = v0.f22405a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f29760q.A(this.f29761r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f29763t.post(this.f29764u);
            }
        }
        return this.f29746a == 2;
    }

    public final View g(int i4, int i10) {
        CoordinatorLayout coordinatorLayout = this.f29763t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f29760q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i4, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f29761r.getLeft();
        int top = this.f29761r.getTop();
        int i13 = i4 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f29759p;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f29761r;
        int i15 = (int) this.f29757n;
        int i16 = (int) this.f29756m;
        int iAbs = Math.abs(i11);
        if (iAbs < i15) {
            i11 = 0;
        } else if (iAbs > i16) {
            i11 = i11 > 0 ? i16 : -i16;
        }
        int iAbs2 = Math.abs(i12);
        if (iAbs2 < i15) {
            i12 = 0;
        } else if (iAbs2 > i16) {
            i12 = i12 > 0 ? i16 : -i16;
        }
        int iAbs3 = Math.abs(i13);
        int iAbs4 = Math.abs(i14);
        int iAbs5 = Math.abs(i11);
        int iAbs6 = Math.abs(i12);
        int i17 = iAbs5 + iAbs6;
        int i18 = iAbs3 + iAbs4;
        if (i11 != 0) {
            f10 = iAbs5;
            f11 = i17;
        } else {
            f10 = iAbs3;
            f11 = i18;
        }
        float f14 = f10 / f11;
        if (i12 != 0) {
            f12 = iAbs6;
            f13 = i17;
        } else {
            f12 = iAbs4;
            f13 = i18;
        }
        float f15 = f12 / f13;
        t1 t1Var = this.f29760q;
        overScroller.startScroll(left, top, i13, i14, (int) ((e(i14, i12, t1Var.s()) * f15) + (e(i13, i11, t1Var.r(view)) * f14)));
        n(2);
        return true;
    }

    public final boolean i(int i4) {
        if ((this.f29754k & (1 << i4)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f29755l == null) {
            this.f29755l = VelocityTracker.obtain();
        }
        this.f29755l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x10, (int) y10);
            l(pointerId, x10, y10);
            q(pointerId, viewG);
            int i11 = this.f29752h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f29746a == 1) {
                k();
            }
            a();
            return;
        }
        t1 t1Var = this.f29760q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f29746a == 1) {
                    this.f29762s = true;
                    t1Var.B(this.f29761r, 0.0f, 0.0f);
                    this.f29762s = false;
                    if (this.f29746a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                l(pointerId2, x11, y11);
                if (this.f29746a == 0) {
                    q(pointerId2, g((int) x11, (int) y11));
                    int i12 = this.f29752h[pointerId2];
                    return;
                }
                int i13 = (int) x11;
                int i14 = (int) y11;
                View view = this.f29761r;
                if (view != null && i13 >= view.getLeft() && i13 < view.getRight() && i14 >= view.getTop() && i14 < view.getBottom()) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    q(pointerId2, this.f29761r);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f29746a == 1 && pointerId3 == this.f29748c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i10 >= pointerCount) {
                        i4 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f29748c) {
                        View viewG2 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view2 = this.f29761r;
                        if (viewG2 == view2 && q(pointerId4, view2)) {
                            i4 = this.f29748c;
                            break;
                        }
                    }
                    i10++;
                }
                if (i4 == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f29746a == 1) {
            if (i(this.f29748c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f29748c);
                float x12 = motionEvent.getX(iFindPointerIndex);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f29751f;
                int i15 = this.f29748c;
                int i16 = (int) (x12 - fArr[i15]);
                int i17 = (int) (y12 - this.g[i15]);
                int left = this.f29761r.getLeft() + i16;
                int top = this.f29761r.getTop() + i17;
                int left2 = this.f29761r.getLeft();
                int top2 = this.f29761r.getTop();
                if (i16 != 0) {
                    left = t1Var.f(left, this.f29761r);
                    WeakHashMap weakHashMap = v0.f22405a;
                    this.f29761r.offsetLeftAndRight(left - left2);
                }
                if (i17 != 0) {
                    top = t1Var.g(top, this.f29761r);
                    WeakHashMap weakHashMap2 = v0.f22405a;
                    this.f29761r.offsetTopAndBottom(top - top2);
                }
                if (i16 != 0 || i17 != 0) {
                    t1Var.A(this.f29761r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i10 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i10);
            if (i(pointerId5)) {
                float x13 = motionEvent.getX(i10);
                float y13 = motionEvent.getY(i10);
                float f10 = x13 - this.f29749d[pointerId5];
                float f11 = y13 - this.f29750e[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i18 = this.f29752h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i19 = this.f29752h[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i20 = this.f29752h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i21 = this.f29752h[pointerId5];
                if (this.f29746a != 1) {
                    View viewG3 = g((int) x13, (int) y13);
                    if (c(viewG3, f10, f11) && q(pointerId5, viewG3)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i10++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f29755l;
        float f10 = this.f29756m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f29755l.getXVelocity(this.f29748c);
        float fAbs = Math.abs(xVelocity);
        float f11 = this.f29757n;
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f29755l.getYVelocity(this.f29748c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f11) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f29762s = true;
        this.f29760q.B(this.f29761r, xVelocity, f10);
        this.f29762s = false;
        if (this.f29746a == 1) {
            n(0);
        }
    }

    public final void l(int i4, float f10, float f11) {
        float[] fArr = this.f29749d;
        if (fArr == null || fArr.length <= i4) {
            int i10 = i4 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f29750e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f29751f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f29752h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f29753i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f29749d = fArr2;
            this.f29750e = fArr3;
            this.f29751f = fArr4;
            this.g = fArr5;
            this.f29752h = iArr;
            this.f29753i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f29749d;
        this.f29751f[i4] = f10;
        fArr9[i4] = f10;
        float[] fArr10 = this.f29750e;
        this.g[i4] = f11;
        fArr10[i4] = f11;
        int[] iArr7 = this.f29752h;
        int i11 = (int) f10;
        int i12 = (int) f11;
        CoordinatorLayout coordinatorLayout = this.f29763t;
        int left = coordinatorLayout.getLeft();
        int i13 = this.f29758o;
        int i14 = i11 < left + i13 ? 1 : 0;
        if (i12 < coordinatorLayout.getTop() + i13) {
            i14 |= 4;
        }
        if (i11 > coordinatorLayout.getRight() - i13) {
            i14 |= 2;
        }
        if (i12 > coordinatorLayout.getBottom() - i13) {
            i14 |= 8;
        }
        iArr7[i4] = i14;
        this.f29754k = (1 << i4) | this.f29754k;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if (i(pointerId)) {
                float x10 = motionEvent.getX(i4);
                float y10 = motionEvent.getY(i4);
                this.f29751f[pointerId] = x10;
                this.g[pointerId] = y10;
            }
        }
    }

    public final void n(int i4) {
        this.f29763t.removeCallbacks(this.f29764u);
        if (this.f29746a != i4) {
            this.f29746a = i4;
            this.f29760q.z(i4);
            if (this.f29746a == 0) {
                this.f29761r = null;
            }
        }
    }

    public final boolean o(int i4, int i10) {
        if (this.f29762s) {
            return h(i4, i10, (int) this.f29755l.getXVelocity(this.f29748c), (int) this.f29755l.getYVelocity(this.f29748c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.c.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(int i4, View view) {
        if (view == this.f29761r && this.f29748c == i4) {
            return true;
        }
        if (view == null || !this.f29760q.G(i4, view)) {
            return false;
        }
        this.f29748c = i4;
        b(i4, view);
        return true;
    }
}
