package y0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x, reason: collision with root package name */
    public static final Interpolator f25055x = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f25056a;

    /* renamed from: b, reason: collision with root package name */
    public int f25057b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f25059d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f25060e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f25061f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f25062g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f25063h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f25064i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f25065j;

    /* renamed from: k, reason: collision with root package name */
    public int f25066k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f25067l;

    /* renamed from: m, reason: collision with root package name */
    public float f25068m;

    /* renamed from: n, reason: collision with root package name */
    public float f25069n;

    /* renamed from: o, reason: collision with root package name */
    public int f25070o;

    /* renamed from: p, reason: collision with root package name */
    public final int f25071p;

    /* renamed from: q, reason: collision with root package name */
    public int f25072q;

    /* renamed from: r, reason: collision with root package name */
    public OverScroller f25073r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC0503c f25074s;

    /* renamed from: t, reason: collision with root package name */
    public View f25075t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25076u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f25077v;

    /* renamed from: c, reason: collision with root package name */
    public int f25058c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f25078w = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.K(0);
        }
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0503c abstractC0503c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0503c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f25077v = viewGroup;
        this.f25074s = abstractC0503c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f25071p = i10;
        this.f25070o = i10;
        this.f25057b = viewConfiguration.getScaledTouchSlop();
        this.f25068m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f25069n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f25073r = new OverScroller(context, f25055x);
    }

    public static c n(ViewGroup viewGroup, float f10, AbstractC0503c abstractC0503c) {
        c cVarO = o(viewGroup, abstractC0503c);
        cVarO.f25057b = (int) (cVarO.f25057b * (1.0f / f10));
        return cVarO;
    }

    public static c o(ViewGroup viewGroup, AbstractC0503c abstractC0503c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0503c);
    }

    public int A() {
        return this.f25056a;
    }

    public boolean B(int i10, int i11) {
        return E(this.f25075t, i10, i11);
    }

    public boolean C(int i10) {
        return ((1 << i10) & this.f25066k) != 0;
    }

    public final boolean D(int i10) {
        if (C(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean E(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f25067l == null) {
            this.f25067l = VelocityTracker.obtain();
        }
        this.f25067l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewT = t((int) x10, (int) y10);
            I(x10, y10, pointerId);
            R(viewT, pointerId);
            int i12 = this.f25063h[pointerId];
            int i13 = this.f25072q;
            if ((i12 & i13) != 0) {
                this.f25074s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f25056a == 1) {
                G();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f25056a == 1) {
                if (D(this.f25058c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f25058c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f25061f;
                    int i14 = this.f25058c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f25062g[i14]);
                    r(this.f25075t.getLeft() + i15, this.f25075t.getTop() + i16, i15, i16);
                    J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (D(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f25059d[pointerId2];
                    float f11 = y12 - this.f25060e[pointerId2];
                    H(f10, f11, pointerId2);
                    if (this.f25056a != 1) {
                        View viewT2 = t((int) x12, (int) y12);
                        if (f(viewT2, f10, f11) && R(viewT2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            J(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f25056a == 1) {
                p(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            I(x13, y13, pointerId3);
            if (this.f25056a != 0) {
                if (B((int) x13, (int) y13)) {
                    R(this.f25075t, pointerId3);
                    return;
                }
                return;
            } else {
                R(t((int) x13, (int) y13), pointerId3);
                int i17 = this.f25063h[pointerId3];
                int i18 = this.f25072q;
                if ((i17 & i18) != 0) {
                    this.f25074s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f25056a == 1 && pointerId4 == this.f25058c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f25058c) {
                    View viewT3 = t((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f25075t;
                    if (viewT3 == view && R(view, pointerId5)) {
                        i10 = this.f25058c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                G();
            }
        }
        j(pointerId4);
    }

    public final void G() {
        this.f25067l.computeCurrentVelocity(1000, this.f25068m);
        p(g(this.f25067l.getXVelocity(this.f25058c), this.f25069n, this.f25068m), g(this.f25067l.getYVelocity(this.f25058c), this.f25069n, this.f25068m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [y0.c$c] */
    public final void H(float f10, float f11, int i10) {
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
            int[] iArr = this.f25064i;
            iArr[i10] = iArr[i10] | r02;
            this.f25074s.f(r02, i10);
        }
    }

    public final void I(float f10, float f11, int i10) {
        s(i10);
        float[] fArr = this.f25059d;
        this.f25061f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f25060e;
        this.f25062g[i10] = f11;
        fArr2[i10] = f11;
        this.f25063h[i10] = y((int) f10, (int) f11);
        this.f25066k |= 1 << i10;
    }

    public final void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (D(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f25061f[pointerId] = x10;
                this.f25062g[pointerId] = y10;
            }
        }
    }

    public void K(int i10) {
        this.f25077v.removeCallbacks(this.f25078w);
        if (this.f25056a != i10) {
            this.f25056a = i10;
            this.f25074s.j(i10);
            if (this.f25056a == 0) {
                this.f25075t = null;
            }
        }
    }

    public void L(int i10) {
        this.f25070o = i10;
    }

    public void M(int i10) {
        this.f25072q = i10;
    }

    public void N(float f10) {
        this.f25069n = f10;
    }

    public boolean O(int i10, int i11) {
        if (this.f25076u) {
            return u(i10, i11, (int) this.f25067l.getXVelocity(this.f25058c), (int) this.f25067l.getYVelocity(this.f25058c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean P(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.c.P(android.view.MotionEvent):boolean");
    }

    public boolean Q(View view, int i10, int i11) {
        this.f25075t = view;
        this.f25058c = -1;
        boolean zU = u(i10, i11, 0, 0);
        if (!zU && this.f25056a == 0 && this.f25075t != null) {
            this.f25075t = null;
        }
        return zU;
    }

    public boolean R(View view, int i10) {
        if (view == this.f25075t && this.f25058c == i10) {
            return true;
        }
        if (view == null || !this.f25074s.m(view, i10)) {
            return false;
        }
        this.f25058c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f25058c = -1;
        i();
        VelocityTracker velocityTracker = this.f25067l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f25067l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f25077v) {
            this.f25075t = view;
            this.f25058c = i10;
            this.f25074s.i(view, i10);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f25077v + ")");
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f25063h[i10] & i11) == i11 && (this.f25072q & i11) != 0 && (this.f25065j[i10] & i11) != i11 && (this.f25064i[i10] & i11) != i11) {
            int i12 = this.f25057b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f25074s.g(i11)) {
                    int[] iArr = this.f25065j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f25064i[i10] & i11) == 0 && fAbs > this.f25057b) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int length = this.f25059d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (e(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10, int i11) {
        if (!C(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.f25061f[i11] - this.f25059d[i11];
        float f11 = this.f25062g[i11] - this.f25060e[i11];
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f25057b) : z11 && Math.abs(f11) > ((float) this.f25057b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i12 = this.f25057b;
        return f12 > ((float) (i12 * i12));
    }

    public final boolean f(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f25074s.d(view) > 0;
        boolean z11 = this.f25074s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f25057b) : z11 && Math.abs(f11) > ((float) this.f25057b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i10 = this.f25057b;
        return f12 > ((float) (i10 * i10));
    }

    public final float g(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        return fAbs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final int h(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        return iAbs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    public final void i() {
        float[] fArr = this.f25059d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f25060e, 0.0f);
        Arrays.fill(this.f25061f, 0.0f);
        Arrays.fill(this.f25062g, 0.0f);
        Arrays.fill(this.f25063h, 0);
        Arrays.fill(this.f25064i, 0);
        Arrays.fill(this.f25065j, 0);
        this.f25066k = 0;
    }

    public final void j(int i10) {
        if (this.f25059d == null || !C(i10)) {
            return;
        }
        this.f25059d[i10] = 0.0f;
        this.f25060e[i10] = 0.0f;
        this.f25061f[i10] = 0.0f;
        this.f25062g[i10] = 0.0f;
        this.f25063h[i10] = 0;
        this.f25064i[i10] = 0;
        this.f25065j[i10] = 0;
        this.f25066k = (~(1 << i10)) & this.f25066k;
    }

    public final int k(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f25077v.getWidth();
        float f10 = width / 2;
        float fQ = f10 + (q(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fQ / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), Sdk$SDKError.Reason.NATIVE_ASSET_ERROR_VALUE);
    }

    public final int l(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iH = h(i12, (int) this.f25069n, (int) this.f25068m);
        int iH2 = h(i13, (int) this.f25069n, (int) this.f25068m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iH);
        int iAbs4 = Math.abs(iH2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iH != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iH2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((k(i10, iH, this.f25074s.d(view)) * f14) + (k(i11, iH2, this.f25074s.e(view)) * (f12 / f13)));
    }

    public boolean m(boolean z10) {
        if (this.f25056a == 2) {
            boolean zComputeScrollOffset = this.f25073r.computeScrollOffset();
            int currX = this.f25073r.getCurrX();
            int currY = this.f25073r.getCurrY();
            int left = currX - this.f25075t.getLeft();
            int top = currY - this.f25075t.getTop();
            if (left != 0) {
                ViewCompat.T(this.f25075t, left);
            }
            if (top != 0) {
                ViewCompat.U(this.f25075t, top);
            }
            if (left != 0 || top != 0) {
                this.f25074s.k(this.f25075t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f25073r.getFinalX() && currY == this.f25073r.getFinalY()) {
                this.f25073r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f25077v.post(this.f25078w);
                } else {
                    K(0);
                }
            }
        }
        return this.f25056a == 2;
    }

    public final void p(float f10, float f11) {
        this.f25076u = true;
        this.f25074s.l(this.f25075t, f10, f11);
        this.f25076u = false;
        if (this.f25056a == 1) {
            K(0);
        }
    }

    public final float q(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        int left = this.f25075t.getLeft();
        int top = this.f25075t.getTop();
        if (i12 != 0) {
            i10 = this.f25074s.a(this.f25075t, i10, i12);
            ViewCompat.T(this.f25075t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f25074s.b(this.f25075t, i11, i13);
            ViewCompat.U(this.f25075t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f25074s.k(this.f25075t, i14, i15, i14 - left, i15 - top);
    }

    public final void s(int i10) {
        float[] fArr = this.f25059d;
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
                float[] fArr6 = this.f25060e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f25061f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f25062g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f25063h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f25064i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f25065j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f25059d = fArr2;
            this.f25060e = fArr3;
            this.f25061f = fArr4;
            this.f25062g = fArr5;
            this.f25063h = iArr;
            this.f25064i = iArr2;
            this.f25065j = iArr3;
        }
    }

    public View t(int i10, int i11) {
        for (int childCount = this.f25077v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f25077v.getChildAt(this.f25074s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean u(int i10, int i11, int i12, int i13) {
        int left = this.f25075t.getLeft();
        int top = this.f25075t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f25073r.abortAnimation();
            K(0);
            return false;
        }
        this.f25073r.startScroll(left, top, i14, i15, l(this.f25075t, i14, i15, i12, i13));
        K(2);
        return true;
    }

    public View v() {
        return this.f25075t;
    }

    public int w() {
        return this.f25071p;
    }

    public int x() {
        return this.f25070o;
    }

    public final int y(int i10, int i11) {
        int i12 = i10 < this.f25077v.getLeft() + this.f25070o ? 1 : 0;
        if (i11 < this.f25077v.getTop() + this.f25070o) {
            i12 |= 4;
        }
        if (i10 > this.f25077v.getRight() - this.f25070o) {
            i12 |= 2;
        }
        return i11 > this.f25077v.getBottom() - this.f25070o ? i12 | 8 : i12;
    }

    public int z() {
        return this.f25057b;
    }

    /* renamed from: y0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0503c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i10) {
            return false;
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);

        public int c(int i10) {
            return i10;
        }

        public void f(int i10, int i11) {
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }
    }
}
