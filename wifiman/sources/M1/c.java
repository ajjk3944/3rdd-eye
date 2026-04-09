package M1;

import F1.W;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x, reason: collision with root package name */
    private static final Interpolator f12435x = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f12436a;

    /* renamed from: b, reason: collision with root package name */
    private int f12437b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f12439d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f12440e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f12441f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f12442g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f12443h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f12444i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f12445j;

    /* renamed from: k, reason: collision with root package name */
    private int f12446k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f12447l;

    /* renamed from: m, reason: collision with root package name */
    private float f12448m;

    /* renamed from: n, reason: collision with root package name */
    private float f12449n;

    /* renamed from: o, reason: collision with root package name */
    private int f12450o;

    /* renamed from: p, reason: collision with root package name */
    private final int f12451p;

    /* renamed from: q, reason: collision with root package name */
    private int f12452q;

    /* renamed from: r, reason: collision with root package name */
    private OverScroller f12453r;

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC0492c f12454s;

    /* renamed from: t, reason: collision with root package name */
    private View f12455t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f12456u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f12457v;

    /* renamed from: c, reason: collision with root package name */
    private int f12438c = -1;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f12458w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* renamed from: M1.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0492c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0492c abstractC0492c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0492c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f12457v = viewGroup;
        this.f12454s = abstractC0492c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f12451p = i10;
        this.f12450o = i10;
        this.f12437b = viewConfiguration.getScaledTouchSlop();
        this.f12448m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f12449n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12453r = new OverScroller(context, f12435x);
    }

    private void A() {
        this.f12447l.computeCurrentVelocity(1000, this.f12448m);
        n(e(this.f12447l.getXVelocity(this.f12438c), this.f12449n, this.f12448m), e(this.f12447l.getYVelocity(this.f12438c), this.f12449n, this.f12448m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [M1.c$c] */
    private void B(float f10, float f11, int i10) {
        boolean zC = c(f10, f11, i10, 1);
        boolean z10 = zC;
        if (c(f11, f10, i10, 4)) {
            z10 = (zC ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f12444i;
            iArr[i10] = iArr[i10] | r02;
            this.f12454s.f(r02, i10);
        }
    }

    private void C(float f10, float f11, int i10) {
        q(i10);
        float[] fArr = this.f12439d;
        this.f12441f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f12440e;
        this.f12442g[i10] = f11;
        fArr2[i10] = f11;
        this.f12443h[i10] = t((int) f10, (int) f11);
        this.f12446k |= 1 << i10;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f12441f[pointerId] = x10;
                this.f12442g[pointerId] = y10;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f12443h[i10] & i11) != i11 || (this.f12452q & i11) == 0 || (this.f12445j[i10] & i11) == i11 || (this.f12444i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f12437b;
        if (fAbs <= i12 && fAbs2 <= i12) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f12454s.g(i11)) {
            return (this.f12444i[i10] & i11) == 0 && fAbs > ((float) this.f12437b);
        }
        int[] iArr = this.f12445j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    private boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f12454s.d(view) > 0;
        boolean z11 = this.f12454s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f12437b) : z11 && Math.abs(f11) > ((float) this.f12437b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i10 = this.f12437b;
        return f12 > ((float) (i10 * i10));
    }

    private float e(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        return fAbs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    private int f(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        return iAbs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void g() {
        float[] fArr = this.f12439d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f12440e, 0.0f);
        Arrays.fill(this.f12441f, 0.0f);
        Arrays.fill(this.f12442g, 0.0f);
        Arrays.fill(this.f12443h, 0);
        Arrays.fill(this.f12444i, 0);
        Arrays.fill(this.f12445j, 0);
        this.f12446k = 0;
    }

    private void h(int i10) {
        if (this.f12439d == null || !w(i10)) {
            return;
        }
        this.f12439d[i10] = 0.0f;
        this.f12440e[i10] = 0.0f;
        this.f12441f[i10] = 0.0f;
        this.f12442g[i10] = 0.0f;
        this.f12443h[i10] = 0;
        this.f12444i[i10] = 0;
        this.f12445j[i10] = 0;
        this.f12446k = (~(1 << i10)) & this.f12446k;
    }

    private int i(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f12457v.getWidth();
        float f10 = width / 2;
        float fO = f10 + (o(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iF = f(i12, (int) this.f12449n, (int) this.f12448m);
        int iF2 = f(i13, (int) this.f12449n, (int) this.f12448m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iF);
        int iAbs4 = Math.abs(iF2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iF != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iF2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((i(i10, iF, this.f12454s.d(view)) * f14) + (i(i11, iF2, this.f12454s.e(view)) * (f12 / f13)));
    }

    public static c l(ViewGroup viewGroup, float f10, AbstractC0492c abstractC0492c) {
        c cVarM = m(viewGroup, abstractC0492c);
        cVarM.f12437b = (int) (cVarM.f12437b * (1.0f / f10));
        return cVarM;
    }

    public static c m(ViewGroup viewGroup, AbstractC0492c abstractC0492c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0492c);
    }

    private void n(float f10, float f11) {
        this.f12456u = true;
        this.f12454s.l(this.f12455t, f10, f11);
        this.f12456u = false;
        if (this.f12436a == 1) {
            E(0);
        }
    }

    private float o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void p(int i10, int i11, int i12, int i13) {
        int left = this.f12455t.getLeft();
        int top = this.f12455t.getTop();
        if (i12 != 0) {
            i10 = this.f12454s.a(this.f12455t, i10, i12);
            W.W(this.f12455t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f12454s.b(this.f12455t, i11, i13);
            W.X(this.f12455t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f12454s.k(this.f12455t, i14, i15, i14 - left, i15 - top);
    }

    private void q(int i10) {
        float[] fArr = this.f12439d;
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
                float[] fArr6 = this.f12440e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f12441f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f12442g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f12443h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f12444i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f12445j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f12439d = fArr2;
            this.f12440e = fArr3;
            this.f12441f = fArr4;
            this.f12442g = fArr5;
            this.f12443h = iArr;
            this.f12444i = iArr2;
            this.f12445j = iArr3;
        }
    }

    private boolean s(int i10, int i11, int i12, int i13) {
        int left = this.f12455t.getLeft();
        int top = this.f12455t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f12453r.abortAnimation();
            E(0);
            return false;
        }
        this.f12453r.startScroll(left, top, i14, i15, j(this.f12455t, i14, i15, i12, i13));
        E(2);
        return true;
    }

    private int t(int i10, int i11) {
        int i12 = i10 < this.f12457v.getLeft() + this.f12450o ? 1 : 0;
        if (i11 < this.f12457v.getTop() + this.f12450o) {
            i12 |= 4;
        }
        if (i10 > this.f12457v.getRight() - this.f12450o) {
            i12 |= 2;
        }
        return i11 > this.f12457v.getBottom() - this.f12450o ? i12 | 8 : i12;
    }

    private boolean x(int i10) {
        if (w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    void E(int i10) {
        this.f12457v.removeCallbacks(this.f12458w);
        if (this.f12436a != i10) {
            this.f12436a = i10;
            this.f12454s.j(i10);
            if (this.f12436a == 0) {
                this.f12455t = null;
            }
        }
    }

    public boolean F(int i10, int i11) {
        if (this.f12456u) {
            return s(i10, i11, (int) this.f12447l.getXVelocity(this.f12438c), (int) this.f12447l.getYVelocity(this.f12438c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i10, int i11) {
        this.f12455t = view;
        this.f12438c = -1;
        boolean zS = s(i10, i11, 0, 0);
        if (!zS && this.f12436a == 0 && this.f12455t != null) {
            this.f12455t = null;
        }
        return zS;
    }

    boolean I(View view, int i10) {
        if (view == this.f12455t && this.f12438c == i10) {
            return true;
        }
        if (view == null || !this.f12454s.m(view, i10)) {
            return false;
        }
        this.f12438c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f12438c = -1;
        g();
        VelocityTracker velocityTracker = this.f12447l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12447l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f12457v) {
            this.f12455t = view;
            this.f12438c = i10;
            this.f12454s.i(view, i10);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f12457v + ")");
    }

    public boolean k(boolean z10) {
        if (this.f12436a == 2) {
            boolean zComputeScrollOffset = this.f12453r.computeScrollOffset();
            int currX = this.f12453r.getCurrX();
            int currY = this.f12453r.getCurrY();
            int left = currX - this.f12455t.getLeft();
            int top = currY - this.f12455t.getTop();
            if (left != 0) {
                W.W(this.f12455t, left);
            }
            if (top != 0) {
                W.X(this.f12455t, top);
            }
            if (left != 0 || top != 0) {
                this.f12454s.k(this.f12455t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f12453r.getFinalX() && currY == this.f12453r.getFinalY()) {
                this.f12453r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f12457v.post(this.f12458w);
                } else {
                    E(0);
                }
            }
        }
        return this.f12436a == 2;
    }

    public View r(int i10, int i11) {
        for (int childCount = this.f12457v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f12457v.getChildAt(this.f12454s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f12437b;
    }

    public boolean v(int i10, int i11) {
        return y(this.f12455t, i10, i11);
    }

    public boolean w(int i10) {
        return ((1 << i10) & this.f12446k) != 0;
    }

    public boolean y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f12447l == null) {
            this.f12447l = VelocityTracker.obtain();
        }
        this.f12447l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewR = r((int) x10, (int) y10);
            C(x10, y10, pointerId);
            I(viewR, pointerId);
            int i12 = this.f12443h[pointerId];
            int i13 = this.f12452q;
            if ((i12 & i13) != 0) {
                this.f12454s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f12436a == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f12436a == 1) {
                if (x(this.f12438c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f12438c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f12441f;
                    int i14 = this.f12438c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f12442g[i14]);
                    p(this.f12455t.getLeft() + i15, this.f12455t.getTop() + i16, i15, i16);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (x(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f12439d[pointerId2];
                    float f11 = y12 - this.f12440e[pointerId2];
                    B(f10, f11, pointerId2);
                    if (this.f12436a != 1) {
                        View viewR2 = r((int) x12, (int) y12);
                        if (d(viewR2, f10, f11) && I(viewR2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f12436a == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            C(x13, y13, pointerId3);
            if (this.f12436a != 0) {
                if (v((int) x13, (int) y13)) {
                    I(this.f12455t, pointerId3);
                    return;
                }
                return;
            } else {
                I(r((int) x13, (int) y13), pointerId3);
                int i17 = this.f12443h[pointerId3];
                int i18 = this.f12452q;
                if ((i17 & i18) != 0) {
                    this.f12454s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f12436a == 1 && pointerId4 == this.f12438c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f12438c) {
                    View viewR3 = r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f12455t;
                    if (viewR3 == view && I(view, pointerId5)) {
                        i10 = this.f12438c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                A();
            }
        }
        h(pointerId4);
    }
}
