package X;

import C0.k;
import R.O;
import T2.g;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: x, reason: collision with root package name */
    public static final e f4123x = new e(0);

    /* renamed from: a, reason: collision with root package name */
    public int f4124a;

    /* renamed from: b, reason: collision with root package name */
    public int f4125b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f4127d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4128e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f4129f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f4130g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f4131h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4132j;

    /* renamed from: k, reason: collision with root package name */
    public int f4133k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f4134l;

    /* renamed from: m, reason: collision with root package name */
    public final float f4135m;

    /* renamed from: n, reason: collision with root package name */
    public float f4136n;

    /* renamed from: o, reason: collision with root package name */
    public int f4137o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4138p;

    /* renamed from: q, reason: collision with root package name */
    public int f4139q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f4140r;

    /* renamed from: s, reason: collision with root package name */
    public final g f4141s;

    /* renamed from: t, reason: collision with root package name */
    public View f4142t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4143u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f4144v;

    /* renamed from: c, reason: collision with root package name */
    public int f4126c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final k f4145w = new k(11, this);

    public f(Context context, ViewGroup viewGroup, g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f4144v = viewGroup;
        this.f4141s = gVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f4138p = i;
        this.f4137o = i;
        this.f4125b = viewConfiguration.getScaledTouchSlop();
        this.f4135m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4136n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4140r = new OverScroller(context, f4123x);
    }

    public final void a() {
        this.f4126c = -1;
        float[] fArr = this.f4127d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4128e, 0.0f);
            Arrays.fill(this.f4129f, 0.0f);
            Arrays.fill(this.f4130g, 0.0f);
            Arrays.fill(this.f4131h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f4132j, 0);
            this.f4133k = 0;
        }
        VelocityTracker velocityTracker = this.f4134l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4134l = null;
        }
    }

    public final void b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f4144v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f4142t = view;
        this.f4126c = i;
        this.f4141s.z(i, view);
        p(1);
    }

    public final boolean c(float f2, int i, float f5, int i3) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f5);
        if ((this.f4131h[i] & i3) != i3 || (this.f4139q & i3) == 0 || (this.f4132j[i] & i3) == i3 || (this.i[i] & i3) == i3) {
            return false;
        }
        float f6 = this.f4125b;
        if (fAbs <= f6 && fAbs2 <= f6) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f4141s.getClass();
        }
        return (this.i[i] & i3) == 0 && fAbs > ((float) this.f4125b);
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
            T2.g r1 = r3.f4141s
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
            int r4 = r3.f4125b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f4125b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f4125b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.f.d(android.view.View, float, float):boolean");
    }

    public final void e(int i) {
        float[] fArr = this.f4127d;
        if (fArr != null) {
            int i3 = this.f4133k;
            int i6 = 1 << i;
            if ((i3 & i6) != 0) {
                fArr[i] = 0.0f;
                this.f4128e[i] = 0.0f;
                this.f4129f[i] = 0.0f;
                this.f4130g[i] = 0.0f;
                this.f4131h[i] = 0;
                this.i[i] = 0;
                this.f4132j[i] = 0;
                this.f4133k = (~i6) & i3;
            }
        }
    }

    public final int f(int i, int i3, int i6) {
        if (i == 0) {
            return 0;
        }
        float width = this.f4144v.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i6) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f4124a == 2) {
            OverScroller overScroller = this.f4140r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f4142t.getLeft();
            int top = currY - this.f4142t.getTop();
            if (left != 0) {
                View view = this.f4142t;
                WeakHashMap weakHashMap = O.f3270a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f4142t;
                WeakHashMap weakHashMap2 = O.f3270a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f4141s.B(this.f4142t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f4144v.post(this.f4145w);
            }
        }
        return this.f4124a == 2;
    }

    public final View h(int i, int i3) {
        ViewGroup viewGroup = this.f4144v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f4141s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i, int i3, int i6, int i7) {
        float f2;
        float f5;
        float f6;
        float f7;
        int left = this.f4142t.getLeft();
        int top = this.f4142t.getTop();
        int i8 = i - left;
        int i9 = i3 - top;
        OverScroller overScroller = this.f4140r;
        if (i8 == 0 && i9 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f4142t;
        int i10 = (int) this.f4136n;
        int i11 = (int) this.f4135m;
        int iAbs = Math.abs(i6);
        if (iAbs < i10) {
            i6 = 0;
        } else if (iAbs > i11) {
            i6 = i6 > 0 ? i11 : -i11;
        }
        int i12 = (int) this.f4136n;
        int iAbs2 = Math.abs(i7);
        if (iAbs2 < i12) {
            i7 = 0;
        } else if (iAbs2 > i11) {
            i7 = i7 > 0 ? i11 : -i11;
        }
        int iAbs3 = Math.abs(i8);
        int iAbs4 = Math.abs(i9);
        int iAbs5 = Math.abs(i6);
        int iAbs6 = Math.abs(i7);
        int i13 = iAbs5 + iAbs6;
        int i14 = iAbs3 + iAbs4;
        if (i6 != 0) {
            f2 = iAbs5;
            f5 = i13;
        } else {
            f2 = iAbs3;
            f5 = i14;
        }
        float f8 = f2 / f5;
        if (i7 != 0) {
            f6 = iAbs6;
            f7 = i13;
        } else {
            f6 = iAbs4;
            f7 = i14;
        }
        float f9 = f6 / f7;
        g gVar = this.f4141s;
        overScroller.startScroll(left, top, i8, i9, (int) ((f(i9, i7, gVar.s()) * f9) + (f(i8, i6, gVar.r(view)) * f8)));
        p(2);
        return true;
    }

    public final boolean j(int i) {
        if ((this.f4133k & (1 << i)) != 0) {
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
        if (this.f4134l == null) {
            this.f4134l = VelocityTracker.obtain();
        }
        this.f4134l.addMovement(motionEvent);
        g gVar = this.f4141s;
        int i3 = 0;
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x6, (int) y3);
            n(pointerId, x6, y3);
            t(pointerId, viewH);
            if ((this.f4131h[pointerId] & this.f4139q) != 0) {
                gVar.w();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f4124a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f4124a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i3 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i3);
                    if (j(pointerId2)) {
                        float x7 = motionEvent.getX(i3);
                        float y4 = motionEvent.getY(i3);
                        float f2 = x7 - this.f4127d[pointerId2];
                        float f5 = y4 - this.f4128e[pointerId2];
                        m(pointerId2, f2, f5);
                        if (this.f4124a != 1) {
                            View viewH2 = h((int) x7, (int) y4);
                            if (d(viewH2, f2, f5) && t(pointerId2, viewH2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i3++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.f4126c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4126c);
                float x8 = motionEvent.getX(iFindPointerIndex);
                float y6 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f4129f;
                int i6 = this.f4126c;
                int i7 = (int) (x8 - fArr[i6]);
                int i8 = (int) (y6 - this.f4130g[i6]);
                int left = this.f4142t.getLeft() + i7;
                int top = this.f4142t.getTop() + i8;
                int left2 = this.f4142t.getLeft();
                int top2 = this.f4142t.getTop();
                if (i7 != 0) {
                    left = gVar.d(left, this.f4142t);
                    WeakHashMap weakHashMap = O.f3270a;
                    this.f4142t.offsetLeftAndRight(left - left2);
                }
                if (i8 != 0) {
                    top = gVar.e(top, this.f4142t);
                    WeakHashMap weakHashMap2 = O.f3270a;
                    this.f4142t.offsetTopAndBottom(top - top2);
                }
                if (i7 != 0 || i8 != 0) {
                    gVar.B(this.f4142t, left, top);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f4124a == 1) {
                this.f4143u = true;
                gVar.C(this.f4142t, 0.0f, 0.0f);
                this.f4143u = false;
                if (this.f4124a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f4124a == 1 && pointerId3 == this.f4126c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i3 >= pointerCount2) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i3);
                    if (pointerId4 != this.f4126c) {
                        View viewH3 = h((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                        View view = this.f4142t;
                        if (viewH3 == view && t(pointerId4, view)) {
                            i = this.f4126c;
                            break;
                        }
                    }
                    i3++;
                }
                if (i == -1) {
                    l();
                }
            }
            e(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x9 = motionEvent.getX(actionIndex);
        float y7 = motionEvent.getY(actionIndex);
        n(pointerId5, x9, y7);
        if (this.f4124a == 0) {
            t(pointerId5, h((int) x9, (int) y7));
            if ((this.f4131h[pointerId5] & this.f4139q) != 0) {
                gVar.w();
                return;
            }
            return;
        }
        int i9 = (int) x9;
        int i10 = (int) y7;
        View view2 = this.f4142t;
        if (view2 != null && i9 >= view2.getLeft() && i9 < view2.getRight() && i10 >= view2.getTop() && i10 < view2.getBottom()) {
            i3 = 1;
        }
        if (i3 != 0) {
            t(pointerId5, this.f4142t);
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f4134l;
        float f2 = this.f4135m;
        velocityTracker.computeCurrentVelocity(TTAdConstant.STYLE_SIZE_RADIO_1_1, f2);
        float xVelocity = this.f4134l.getXVelocity(this.f4126c);
        float f5 = this.f4136n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f5) {
            xVelocity = 0.0f;
        } else if (fAbs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f4134l.getYVelocity(this.f4126c);
        float f6 = this.f4136n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f6) {
            f2 = 0.0f;
        } else if (fAbs2 <= f2) {
            f2 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f2 = -f2;
        }
        this.f4143u = true;
        this.f4141s.C(this.f4142t, xVelocity, f2);
        this.f4143u = false;
        if (this.f4124a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r4v3, types: [T2.g] */
    public final void m(int i, float f2, float f5) {
        boolean zC = c(f2, i, f5, 1);
        boolean z6 = zC;
        if (c(f5, i, f2, 4)) {
            z6 = (zC ? 1 : 0) | 4;
        }
        boolean z7 = z6;
        if (c(f2, i, f5, 2)) {
            z7 = (z6 ? 1 : 0) | 2;
        }
        ?? r02 = z7;
        if (c(f5, i, f2, 8)) {
            r02 = (z7 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r02;
            this.f4141s.v(r02, i);
        }
    }

    public final void n(int i, float f2, float f5) {
        float[] fArr = this.f4127d;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4128e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f4129f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f4130g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4131h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4132j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4127d = fArr2;
            this.f4128e = fArr3;
            this.f4129f = fArr4;
            this.f4130g = fArr5;
            this.f4131h = iArr;
            this.i = iArr2;
            this.f4132j = iArr3;
        }
        float[] fArr9 = this.f4127d;
        this.f4129f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f4128e;
        this.f4130g[i] = f5;
        fArr10[i] = f5;
        int[] iArr7 = this.f4131h;
        int i6 = (int) f2;
        int i7 = (int) f5;
        ViewGroup viewGroup = this.f4144v;
        int i8 = i6 < viewGroup.getLeft() + this.f4137o ? 1 : 0;
        if (i7 < viewGroup.getTop() + this.f4137o) {
            i8 |= 4;
        }
        if (i6 > viewGroup.getRight() - this.f4137o) {
            i8 |= 2;
        }
        if (i7 > viewGroup.getBottom() - this.f4137o) {
            i8 |= 8;
        }
        iArr7[i] = i8;
        this.f4133k = (1 << i) | this.f4133k;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (j(pointerId)) {
                float x6 = motionEvent.getX(i);
                float y3 = motionEvent.getY(i);
                this.f4129f[pointerId] = x6;
                this.f4130g[pointerId] = y3;
            }
        }
    }

    public final void p(int i) {
        this.f4144v.removeCallbacks(this.f4145w);
        if (this.f4124a != i) {
            this.f4124a = i;
            this.f4141s.A(i);
            if (this.f4124a == 0) {
                this.f4142t = null;
            }
        }
    }

    public final boolean q(int i, int i3) {
        if (this.f4143u) {
            return i(i, i3, (int) this.f4134l.getXVelocity(this.f4126c), (int) this.f4134l.getYVelocity(this.f4126c));
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
        throw new UnsupportedOperationException("Method not decompiled: X.f.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i, int i3) {
        this.f4142t = view;
        this.f4126c = -1;
        boolean zI = i(i, i3, 0, 0);
        if (!zI && this.f4124a == 0 && this.f4142t != null) {
            this.f4142t = null;
        }
        return zI;
    }

    public final boolean t(int i, View view) {
        if (view == this.f4142t && this.f4126c == i) {
            return true;
        }
        if (view == null || !this.f4141s.N(i, view)) {
            return false;
        }
        this.f4126c = i;
        b(i, view);
        return true;
    }
}
