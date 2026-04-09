package b4;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.sentry.android.core.e0;
import java.util.Arrays;
import java.util.WeakHashMap;
import u3.i0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: v, reason: collision with root package name */
    public static final d f2399v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f2400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2401b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f2403d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f2404e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f2405f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f2406g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f2407h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f2408i;
    public int[] j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f2409l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2410m;

    /* renamed from: n, reason: collision with root package name */
    public final float f2411n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2412o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f2413p;

    /* renamed from: q, reason: collision with root package name */
    public final kc.f f2414q;

    /* renamed from: r, reason: collision with root package name */
    public View f2415r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2416s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f2417t;

    /* renamed from: c, reason: collision with root package name */
    public int f2402c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final e f2418u = new e(0, this);

    public f(Context context, CoordinatorLayout coordinatorLayout, kc.f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2417t = coordinatorLayout;
        this.f2414q = fVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2412o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2401b = viewConfiguration.getScaledTouchSlop();
        this.f2410m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2411n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2413p = new OverScroller(context, f2399v);
    }

    public final void a() {
        this.f2402c = -1;
        float[] fArr = this.f2403d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2404e, 0.0f);
            Arrays.fill(this.f2405f, 0.0f);
            Arrays.fill(this.f2406g, 0.0f);
            Arrays.fill(this.f2407h, 0);
            Arrays.fill(this.f2408i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.f2409l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2409l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f2417t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f2415r = view;
        this.f2402c = i10;
        this.f2414q.L(view, i10);
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
            kc.f r1 = r3.f2414q
            int r4 = r1.B(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.C()
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
            int r4 = r3.f2401b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f2401b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f2401b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.f.c(android.view.View, float, float):boolean");
    }

    public final void d(int i10) {
        float[] fArr = this.f2403d;
        if (fArr != null) {
            int i11 = this.k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f2404e[i10] = 0.0f;
                this.f2405f[i10] = 0.0f;
                this.f2406g[i10] = 0.0f;
                this.f2407h[i10] = 0;
                this.f2408i[i10] = 0;
                this.j[i10] = 0;
                this.k = (~i12) & i11;
            }
        }
    }

    public final int e(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        float width = this.f2417t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f2400a == 2) {
            OverScroller overScroller = this.f2413p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f2415r.getLeft();
            int top = currY - this.f2415r.getTop();
            if (left != 0) {
                View view = this.f2415r;
                WeakHashMap weakHashMap = i0.f23177a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f2415r;
                WeakHashMap weakHashMap2 = i0.f23177a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f2414q.N(this.f2415r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f2417t.post(this.f2418u);
            }
        }
        return this.f2400a == 2;
    }

    public final View g(int i10, int i11) {
        CoordinatorLayout coordinatorLayout = this.f2417t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f2414q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f2415r.getLeft();
        int top = this.f2415r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f2413p;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f2415r;
        int i16 = (int) this.f2411n;
        int i17 = (int) this.f2410m;
        int iAbs = Math.abs(i12);
        if (iAbs < i16) {
            i12 = 0;
        } else if (iAbs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i16) {
            i13 = 0;
        } else if (iAbs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i18 = iAbs5 + iAbs6;
        int i19 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f10 = iAbs5;
            f11 = i18;
        } else {
            f10 = iAbs3;
            f11 = i19;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = iAbs6;
            f13 = i18;
        } else {
            f12 = iAbs4;
            f13 = i19;
        }
        float f15 = f12 / f13;
        kc.f fVar = this.f2414q;
        overScroller.startScroll(left, top, i14, i15, (int) ((e(i15, i13, fVar.C()) * f15) + (e(i14, i12, fVar.B(view)) * f14)));
        n(2);
        return true;
    }

    public final boolean i(int i10) {
        if ((this.k & (1 << i10)) != 0) {
            return true;
        }
        e0.d("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2409l == null) {
            this.f2409l = VelocityTracker.obtain();
        }
        this.f2409l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x10, (int) y10);
            l(x10, y10, pointerId);
            q(viewG, pointerId);
            int i12 = this.f2407h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f2400a == 1) {
                k();
            }
            a();
            return;
        }
        kc.f fVar = this.f2414q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f2400a == 1) {
                    this.f2416s = true;
                    fVar.O(this.f2415r, 0.0f, 0.0f);
                    this.f2416s = false;
                    if (this.f2400a == 1) {
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
                l(x11, y11, pointerId2);
                if (this.f2400a == 0) {
                    q(g((int) x11, (int) y11), pointerId2);
                    int i13 = this.f2407h[pointerId2];
                    return;
                }
                int i14 = (int) x11;
                int i15 = (int) y11;
                View view = this.f2415r;
                if (view != null && i14 >= view.getLeft() && i14 < view.getRight() && i15 >= view.getTop() && i15 < view.getBottom()) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    q(this.f2415r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f2400a == 1 && pointerId3 == this.f2402c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i11 >= pointerCount) {
                        i10 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i11);
                    if (pointerId4 != this.f2402c) {
                        View viewG2 = g((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                        View view2 = this.f2415r;
                        if (viewG2 == view2 && q(view2, pointerId4)) {
                            i10 = this.f2402c;
                            break;
                        }
                    }
                    i11++;
                }
                if (i10 == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f2400a == 1) {
            if (i(this.f2402c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2402c);
                float x12 = motionEvent.getX(iFindPointerIndex);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f2405f;
                int i16 = this.f2402c;
                int i17 = (int) (x12 - fArr[i16]);
                int i18 = (int) (y12 - this.f2406g[i16]);
                int left = this.f2415r.getLeft() + i17;
                int top = this.f2415r.getTop() + i18;
                int left2 = this.f2415r.getLeft();
                int top2 = this.f2415r.getTop();
                if (i17 != 0) {
                    left = fVar.k(this.f2415r, left);
                    WeakHashMap weakHashMap = i0.f23177a;
                    this.f2415r.offsetLeftAndRight(left - left2);
                }
                if (i18 != 0) {
                    top = fVar.l(this.f2415r, top);
                    WeakHashMap weakHashMap2 = i0.f23177a;
                    this.f2415r.offsetTopAndBottom(top - top2);
                }
                if (i17 != 0 || i18 != 0) {
                    fVar.N(this.f2415r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i11 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i11);
            if (i(pointerId5)) {
                float x13 = motionEvent.getX(i11);
                float y13 = motionEvent.getY(i11);
                float f10 = x13 - this.f2403d[pointerId5];
                float f11 = y13 - this.f2404e[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i19 = this.f2407h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i20 = this.f2407h[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i21 = this.f2407h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i22 = this.f2407h[pointerId5];
                if (this.f2400a != 1) {
                    View viewG3 = g((int) x13, (int) y13);
                    if (c(viewG3, f10, f11) && q(viewG3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i11++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f2409l;
        float f10 = this.f2410m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f2409l.getXVelocity(this.f2402c);
        float fAbs = Math.abs(xVelocity);
        float f11 = this.f2411n;
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f2409l.getYVelocity(this.f2402c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f11) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f2416s = true;
        this.f2414q.O(this.f2415r, xVelocity, f10);
        this.f2416s = false;
        if (this.f2400a == 1) {
            n(0);
        }
    }

    public final void l(float f10, float f11, int i10) {
        float[] fArr = this.f2403d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2404e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2405f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2406g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2407h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2408i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2403d = fArr2;
            this.f2404e = fArr3;
            this.f2405f = fArr4;
            this.f2406g = fArr5;
            this.f2407h = iArr;
            this.f2408i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f2403d;
        this.f2405f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f2404e;
        this.f2406g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f2407h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        CoordinatorLayout coordinatorLayout = this.f2417t;
        int left = coordinatorLayout.getLeft();
        int i14 = this.f2412o;
        int i15 = i12 < left + i14 ? 1 : 0;
        if (i13 < coordinatorLayout.getTop() + i14) {
            i15 |= 4;
        }
        if (i12 > coordinatorLayout.getRight() - i14) {
            i15 |= 2;
        }
        if (i13 > coordinatorLayout.getBottom() - i14) {
            i15 |= 8;
        }
        iArr7[i10] = i15;
        this.k |= 1 << i10;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (i(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f2405f[pointerId] = x10;
                this.f2406g[pointerId] = y10;
            }
        }
    }

    public final void n(int i10) {
        this.f2417t.removeCallbacks(this.f2418u);
        if (this.f2400a != i10) {
            this.f2400a = i10;
            this.f2414q.M(i10);
            if (this.f2400a == 0) {
                this.f2415r = null;
            }
        }
    }

    public final boolean o(int i10, int i11) {
        if (this.f2416s) {
            return h(i10, i11, (int) this.f2409l.getXVelocity(this.f2402c), (int) this.f2409l.getYVelocity(this.f2402c));
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
        throw new UnsupportedOperationException("Method not decompiled: b4.f.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i10) {
        if (view == this.f2415r && this.f2402c == i10) {
            return true;
        }
        if (view == null || !this.f2414q.W(view, i10)) {
            return false;
        }
        this.f2402c = i10;
        b(view, i10);
        return true;
    }
}
