package y0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import r.l;
import s0.x;
import s0.y;
import s0.z;
import y0.b;

/* loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f25037n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final b.a f25038o = new C0501a();

    /* renamed from: p, reason: collision with root package name */
    public static final b.InterfaceC0502b f25039p = new b();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f25044h;

    /* renamed from: i, reason: collision with root package name */
    public final View f25045i;

    /* renamed from: j, reason: collision with root package name */
    public c f25046j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f25040d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f25041e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f25042f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f25043g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f25047k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f25048l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f25049m = Integer.MIN_VALUE;

    /* renamed from: y0.a$a, reason: collision with other inner class name */
    public class C0501a implements b.a {
        @Override // y0.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Rect rect) {
            xVar.m(rect);
        }
    }

    public class b implements b.InterfaceC0502b {
        @Override // y0.b.InterfaceC0502b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public x a(l lVar, int i10) {
            return (x) lVar.j(i10);
        }

        @Override // y0.b.InterfaceC0502b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(l lVar) {
            return lVar.i();
        }
    }

    public class c extends y {
        public c() {
        }

        @Override // s0.y
        public x b(int i10) {
            return x.b0(a.this.H(i10));
        }

        @Override // s0.y
        public x d(int i10) {
            int i11 = i10 == 2 ? a.this.f25047k : a.this.f25048l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // s0.y
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f25045i = view;
        this.f25044h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (ViewCompat.w(view) == 0) {
            ViewCompat.q0(view, 1);
        }
    }

    public static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    public static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    public final int A() {
        return this.f25048l;
    }

    public abstract int B(float f10, float f11);

    public abstract void C(List list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f25045i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f25045i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i10, Rect rect) {
        x xVar;
        l lVarY = y();
        int i11 = this.f25048l;
        x xVar2 = i11 == Integer.MIN_VALUE ? null : (x) lVarY.d(i11);
        if (i10 == 1 || i10 == 2) {
            xVar = (x) y0.b.d(lVarY, f25039p, f25038o, xVar2, i10, ViewCompat.y(this.f25045i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f25048l;
            if (i12 != Integer.MIN_VALUE) {
                z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f25045i, i10, rect2);
            }
            xVar = (x) y0.b.c(lVarY, f25039p, f25038o, xVar2, rect2, i10);
        }
        return T(xVar != null ? lVarY.g(lVarY.f(xVar)) : Integer.MIN_VALUE);
    }

    public x H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f25048l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    public abstract boolean J(int i10, int i11, Bundle bundle);

    public abstract void M(x xVar);

    public abstract void N(int i10, x xVar);

    public abstract void O(int i10, boolean z10);

    public boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    public final boolean R(int i10, Bundle bundle) {
        return ViewCompat.Y(this.f25045i, i10, bundle);
    }

    public final boolean S(int i10) {
        int i11;
        if (!this.f25044h.isEnabled() || !this.f25044h.isTouchExplorationEnabled() || (i11 = this.f25047k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f25047k = i10;
        this.f25045i.invalidate();
        U(i10, 32768);
        return true;
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f25045i.isFocused() && !this.f25045i.requestFocus()) || (i11 = this.f25048l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f25048l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f25044h.isEnabled() || (parent = this.f25045i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f25045i, q(i10, i11));
    }

    public final void V(int i10) {
        int i11 = this.f25049m;
        if (i11 == i10) {
            return;
        }
        this.f25049m = i10;
        U(i10, 128);
        U(i11, 256);
    }

    @Override // androidx.core.view.a
    public y b(View view) {
        if (this.f25046j == null) {
            this.f25046j = new c();
        }
        return this.f25046j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, x xVar) {
        super.g(view, xVar);
        M(xVar);
    }

    public final boolean n(int i10) {
        if (this.f25047k != i10) {
            return false;
        }
        this.f25047k = Integer.MIN_VALUE;
        this.f25045i.invalidate();
        U(i10, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        return true;
    }

    public final boolean o(int i10) {
        if (this.f25048l != i10) {
            return false;
        }
        this.f25048l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean p() {
        int i10 = this.f25048l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    public final AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    public final AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        x xVarH = H(i10);
        accessibilityEventObtain.getText().add(xVarH.B());
        accessibilityEventObtain.setContentDescription(xVarH.t());
        accessibilityEventObtain.setScrollable(xVarH.U());
        accessibilityEventObtain.setPassword(xVarH.T());
        accessibilityEventObtain.setEnabled(xVarH.N());
        accessibilityEventObtain.setChecked(xVarH.K());
        L(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(xVarH.q());
        z.c(accessibilityEventObtain, this.f25045i, i10);
        accessibilityEventObtain.setPackageName(this.f25045i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f25045i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    public final x t(int i10) {
        x xVarZ = x.Z();
        xVarZ.s0(true);
        xVarZ.u0(true);
        xVarZ.m0("android.view.View");
        Rect rect = f25037n;
        xVarZ.i0(rect);
        xVarZ.j0(rect);
        xVarZ.D0(this.f25045i);
        N(i10, xVarZ);
        if (xVarZ.B() == null && xVarZ.t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        xVarZ.m(this.f25041e);
        if (this.f25041e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iK = xVarZ.k();
        if ((iK & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iK & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        xVarZ.B0(this.f25045i.getContext().getPackageName());
        xVarZ.L0(this.f25045i, i10);
        if (this.f25047k == i10) {
            xVarZ.g0(true);
            xVarZ.a(128);
        } else {
            xVarZ.g0(false);
            xVarZ.a(64);
        }
        boolean z10 = this.f25048l == i10;
        if (z10) {
            xVarZ.a(2);
        } else if (xVarZ.O()) {
            xVarZ.a(1);
        }
        xVarZ.v0(z10);
        this.f25045i.getLocationOnScreen(this.f25043g);
        xVarZ.n(this.f25040d);
        if (this.f25040d.equals(rect)) {
            xVarZ.m(this.f25040d);
            if (xVarZ.f24194b != -1) {
                x xVarZ2 = x.Z();
                for (int i11 = xVarZ.f24194b; i11 != -1; i11 = xVarZ2.f24194b) {
                    xVarZ2.E0(this.f25045i, -1);
                    xVarZ2.i0(f25037n);
                    N(i11, xVarZ2);
                    xVarZ2.m(this.f25041e);
                    Rect rect2 = this.f25040d;
                    Rect rect3 = this.f25041e;
                    rect2.offset(rect3.left, rect3.top);
                }
                xVarZ2.d0();
            }
            this.f25040d.offset(this.f25043g[0] - this.f25045i.getScrollX(), this.f25043g[1] - this.f25045i.getScrollY());
        }
        if (this.f25045i.getLocalVisibleRect(this.f25042f)) {
            this.f25042f.offset(this.f25043g[0] - this.f25045i.getScrollX(), this.f25043g[1] - this.f25045i.getScrollY());
            if (this.f25040d.intersect(this.f25042f)) {
                xVarZ.j0(this.f25040d);
                if (E(this.f25040d)) {
                    xVarZ.P0(true);
                }
            }
        }
        return xVarZ;
    }

    public final x u() {
        x xVarA0 = x.a0(this.f25045i);
        ViewCompat.W(this.f25045i, xVarA0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (xVarA0.p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            xVarA0.d(this.f25045i, ((Integer) arrayList.get(i10)).intValue());
        }
        return xVarA0;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f25044h.isEnabled() && this.f25044h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f25049m == Integer.MIN_VALUE) {
                    return false;
                }
                V(Integer.MIN_VALUE);
                return true;
            }
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            if (iB != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5d
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L46
            r3 = 66
            if (r0 == r3) goto L36
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L36;
                default: goto L18;
            }
        L18:
            goto L5d
        L19:
            boolean r3 = r7.hasNoModifiers()
            if (r3 == 0) goto L5d
            int r0 = F(r0)
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r3 = r1
        L29:
            if (r1 >= r7) goto L35
            boolean r5 = r6.G(r0, r4)
            if (r5 == 0) goto L35
            int r1 = r1 + 1
            r3 = r2
            goto L29
        L35:
            return r3
        L36:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L5d
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L5d
            r6.p()
            return r2
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L52
            r7 = 2
            boolean r7 = r6.G(r7, r4)
            return r7
        L52:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L5d
            boolean r7 = r6.G(r2, r4)
            return r7
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.a.w(android.view.KeyEvent):boolean");
    }

    public final int x() {
        return this.f25047k;
    }

    public final l y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        l lVar = new l();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            lVar.h(((Integer) arrayList.get(i10)).intValue(), t(((Integer) arrayList.get(i10)).intValue()));
        }
        return lVar;
    }

    public final void z(int i10, Rect rect) {
        H(i10).m(rect);
    }

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i10, AccessibilityEvent accessibilityEvent) {
    }
}
