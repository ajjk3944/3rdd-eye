package V0;

import L0.I;
import L0.S;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: w, reason: collision with root package name */
    public static final a f12847w = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f12848a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12849b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f12851d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f12852e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f12853f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f12854g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f12855h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f12856j;

    /* renamed from: k, reason: collision with root package name */
    public int f12857k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f12858l;

    /* renamed from: m, reason: collision with root package name */
    public final float f12859m;

    /* renamed from: n, reason: collision with root package name */
    public final float f12860n;

    /* renamed from: o, reason: collision with root package name */
    public final int f12861o;

    /* renamed from: p, reason: collision with root package name */
    public int f12862p;

    /* renamed from: q, reason: collision with root package name */
    public final OverScroller f12863q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0180c f12864r;

    /* renamed from: s, reason: collision with root package name */
    public View f12865s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12866t;

    /* renamed from: u, reason: collision with root package name */
    public final ViewGroup f12867u;

    /* renamed from: c, reason: collision with root package name */
    public int f12850c = -1;

    /* renamed from: v, reason: collision with root package name */
    public final b f12868v = new b();

    /* compiled from: ViewDragHelper.java */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.p(0);
        }
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0180c abstractC0180c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0180c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f12867u = viewGroup;
        this.f12864r = abstractC0180c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f12861o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f12849b = viewConfiguration.getScaledTouchSlop();
        this.f12859m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f12860n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12863q = new OverScroller(context, f12847w);
    }

    public final void a() {
        this.f12850c = -1;
        float[] fArr = this.f12851d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f12852e, 0.0f);
            Arrays.fill(this.f12853f, 0.0f);
            Arrays.fill(this.f12854g, 0.0f);
            Arrays.fill(this.f12855h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f12856j, 0);
            this.f12857k = 0;
        }
        VelocityTracker velocityTracker = this.f12858l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12858l = null;
        }
    }

    public final void b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f12867u;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f12865s = view;
        this.f12850c = i;
        this.f12864r.f(i, view);
        p(1);
    }

    public final boolean c(float f10, float f11, int i, int i10) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f12855h[i] & i10) != i10 || (this.f12862p & i10) == 0 || (this.f12856j[i] & i10) == i10 || (this.i[i] & i10) == i10) {
            return false;
        }
        float f12 = this.f12849b;
        if (fAbs <= f12 && fAbs2 <= f12) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f12864r.getClass();
        }
        return (this.i[i] & i10) == 0 && fAbs > ((float) this.f12849b);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            V0.c$c r1 = r3.f12864r
            int r4 = r1.c(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.d()
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
            int r4 = r3.f12849b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f12849b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f12849b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.c.d(android.view.View, float, float):boolean");
    }

    public final void e(int i) {
        float[] fArr = this.f12851d;
        if (fArr != null) {
            int i10 = this.f12857k;
            int i11 = 1 << i;
            if ((i10 & i11) != 0) {
                fArr[i] = 0.0f;
                this.f12852e[i] = 0.0f;
                this.f12853f[i] = 0.0f;
                this.f12854g[i] = 0.0f;
                this.f12855h[i] = 0;
                this.i[i] = 0;
                this.f12856j[i] = 0;
                this.f12857k = (~i11) & i10;
            }
        }
    }

    public final int f(int i, int i10, int i11) {
        if (i == 0) {
            return 0;
        }
        float width = this.f12867u.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i10);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i11) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f12848a == 2) {
            OverScroller overScroller = this.f12863q;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f12865s.getLeft();
            int top = currY - this.f12865s.getTop();
            if (left != 0) {
                View view = this.f12865s;
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f12865s;
                WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f12864r.h(this.f12865s, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f12867u.post(this.f12868v);
            }
        }
        return this.f12848a == 2;
    }

    public final View h(int i, int i10) {
        ViewGroup viewGroup = this.f12867u;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f12864r.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f12865s.getLeft();
        int top = this.f12865s.getTop();
        int i13 = i - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f12863q;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f12865s;
        int i15 = (int) this.f12860n;
        int i16 = (int) this.f12859m;
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
        AbstractC0180c abstractC0180c = this.f12864r;
        overScroller.startScroll(left, top, i13, i14, (int) ((f(i14, i12, abstractC0180c.d()) * f15) + (f(i13, i11, abstractC0180c.c(view)) * f14)));
        p(2);
        return true;
    }

    public final boolean j(int i) {
        if ((this.f12857k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f12858l == null) {
            this.f12858l = VelocityTracker.obtain();
        }
        this.f12858l.addMovement(motionEvent);
        int i10 = 0;
        AbstractC0180c abstractC0180c = this.f12864r;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x10, (int) y10);
            n(x10, y10, pointerId);
            s(pointerId, viewH);
            if ((this.f12855h[pointerId] & this.f12862p) != 0) {
                abstractC0180c.getClass();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f12848a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f12848a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i10 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i10);
                    if (j(pointerId2)) {
                        float x11 = motionEvent.getX(i10);
                        float y11 = motionEvent.getY(i10);
                        float f10 = x11 - this.f12851d[pointerId2];
                        float f11 = y11 - this.f12852e[pointerId2];
                        m(f10, f11, pointerId2);
                        if (this.f12848a != 1) {
                            View viewH2 = h((int) x11, (int) y11);
                            if (d(viewH2, f10, f11) && s(pointerId2, viewH2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i10++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.f12850c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f12850c);
                float x12 = motionEvent.getX(iFindPointerIndex);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f12853f;
                int i11 = this.f12850c;
                int i12 = (int) (x12 - fArr[i11]);
                int i13 = (int) (y12 - this.f12854g[i11]);
                int left = this.f12865s.getLeft() + i12;
                int top = this.f12865s.getTop() + i13;
                int left2 = this.f12865s.getLeft();
                int top2 = this.f12865s.getTop();
                if (i12 != 0) {
                    left = abstractC0180c.a(left, this.f12865s);
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    this.f12865s.offsetLeftAndRight(left - left2);
                }
                if (i13 != 0) {
                    top = abstractC0180c.b(top, this.f12865s);
                    WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                    this.f12865s.offsetTopAndBottom(top - top2);
                }
                if (i12 != 0 || i13 != 0) {
                    abstractC0180c.h(this.f12865s, left, top);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f12848a == 1) {
                this.f12866t = true;
                abstractC0180c.i(this.f12865s, 0.0f, 0.0f);
                this.f12866t = false;
                if (this.f12848a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            n(x13, y13, pointerId3);
            if (this.f12848a == 0) {
                s(pointerId3, h((int) x13, (int) y13));
                if ((this.f12855h[pointerId3] & this.f12862p) != 0) {
                    abstractC0180c.getClass();
                    return;
                }
                return;
            }
            int i14 = (int) x13;
            int i15 = (int) y13;
            View view = this.f12865s;
            if (view != null && i14 >= view.getLeft() && i14 < view.getRight() && i15 >= view.getTop() && i15 < view.getBottom()) {
                s(pointerId3, this.f12865s);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f12848a == 1 && pointerId4 == this.f12850c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i10 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i10);
                if (pointerId5 != this.f12850c) {
                    View viewH3 = h((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                    View view2 = this.f12865s;
                    if (viewH3 == view2 && s(pointerId5, view2)) {
                        i = this.f12850c;
                        break;
                    }
                }
                i10++;
            }
            if (i == -1) {
                l();
            }
        }
        e(pointerId4);
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f12858l;
        float f10 = this.f12859m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f12858l.getXVelocity(this.f12850c);
        float f11 = this.f12860n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f12858l.getYVelocity(this.f12850c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f11) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f12866t = true;
        this.f12864r.i(this.f12865s, xVelocity, f10);
        this.f12866t = false;
        if (this.f12848a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [V0.c$c] */
    public final void m(float f10, float f11, int i) {
        boolean zC = c(f10, f11, i, 1);
        boolean z10 = zC;
        if (c(f11, f10, i, 4)) {
            z10 = (zC ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (c(f10, f11, i, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (c(f11, f10, i, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r02;
            this.f12864r.e(r02);
        }
    }

    public final void n(float f10, float f11, int i) {
        float[] fArr = this.f12851d;
        if (fArr == null || fArr.length <= i) {
            int i10 = i + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f12852e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f12853f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f12854g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f12855h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f12856j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f12851d = fArr2;
            this.f12852e = fArr3;
            this.f12853f = fArr4;
            this.f12854g = fArr5;
            this.f12855h = iArr;
            this.i = iArr2;
            this.f12856j = iArr3;
        }
        float[] fArr9 = this.f12851d;
        this.f12853f[i] = f10;
        fArr9[i] = f10;
        float[] fArr10 = this.f12852e;
        this.f12854g[i] = f11;
        fArr10[i] = f11;
        int[] iArr7 = this.f12855h;
        int i11 = (int) f10;
        int i12 = (int) f11;
        ViewGroup viewGroup = this.f12867u;
        int left = viewGroup.getLeft();
        int i13 = this.f12861o;
        int i14 = i11 < left + i13 ? 1 : 0;
        if (i12 < viewGroup.getTop() + i13) {
            i14 |= 4;
        }
        if (i11 > viewGroup.getRight() - i13) {
            i14 |= 2;
        }
        if (i12 > viewGroup.getBottom() - i13) {
            i14 |= 8;
        }
        iArr7[i] = i14;
        this.f12857k |= 1 << i;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i);
                float y10 = motionEvent.getY(i);
                this.f12853f[pointerId] = x10;
                this.f12854g[pointerId] = y10;
            }
        }
    }

    public final void p(int i) {
        this.f12867u.removeCallbacks(this.f12868v);
        if (this.f12848a != i) {
            this.f12848a = i;
            this.f12864r.g(i);
            if (this.f12848a == 0) {
                this.f12865s = null;
            }
        }
    }

    public final boolean q(int i, int i10) {
        if (this.f12866t) {
            return i(i, i10, (int) this.f12858l.getXVelocity(this.f12850c), (int) this.f12858l.getYVelocity(this.f12850c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.c.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(int i, View view) {
        if (view == this.f12865s && this.f12850c == i) {
            return true;
        }
        if (view == null || !this.f12864r.j(i, view)) {
            return false;
        }
        this.f12850c = i;
        b(i, view);
        return true;
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: V0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0180c {
        public int a(int i, View view) {
            return 0;
        }

        public int b(int i, View view) {
            return 0;
        }

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public abstract boolean j(int i, View view);

        public void e(int i) {
        }

        public void g(int i) {
        }

        public void f(int i, View view) {
        }

        public void h(View view, int i, int i10) {
        }

        public void i(View view, float f10, float f11) {
        }
    }
}
