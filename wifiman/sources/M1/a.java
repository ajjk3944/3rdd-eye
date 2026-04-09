package M1;

import F1.C2736a;
import G1.t;
import G1.u;
import G1.v;
import M1.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
import o.W;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class a extends C2736a {

    /* renamed from: n, reason: collision with root package name */
    private static final Rect f12417n = new Rect(MPv3.MAX_MESSAGE_ID, MPv3.MAX_MESSAGE_ID, PduHandle.NONE, PduHandle.NONE);

    /* renamed from: o, reason: collision with root package name */
    private static final b.a f12418o = new C0490a();

    /* renamed from: p, reason: collision with root package name */
    private static final b.InterfaceC0491b f12419p = new b();

    /* renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f12424h;

    /* renamed from: i, reason: collision with root package name */
    private final View f12425i;

    /* renamed from: j, reason: collision with root package name */
    private c f12426j;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f12420d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f12421e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final Rect f12422f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private final int[] f12423g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    int f12427k = PduHandle.NONE;

    /* renamed from: l, reason: collision with root package name */
    int f12428l = PduHandle.NONE;

    /* renamed from: m, reason: collision with root package name */
    private int f12429m = PduHandle.NONE;

    /* renamed from: M1.a$a, reason: collision with other inner class name */
    class C0490a implements b.a {
        C0490a() {
        }

        @Override // M1.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, Rect rect) {
            tVar.k(rect);
        }
    }

    class b implements b.InterfaceC0491b {
        b() {
        }

        @Override // M1.b.InterfaceC0491b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(W w10, int i10) {
            return (t) w10.q(i10);
        }

        @Override // M1.b.InterfaceC0491b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(W w10) {
            return w10.p();
        }
    }

    private class c extends u {
        c() {
        }

        @Override // G1.u
        public t b(int i10) {
            return t.V(a.this.H(i10));
        }

        @Override // G1.u
        public t d(int i10) {
            int i11 = i10 == 2 ? a.this.f12427k : a.this.f12428l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // G1.u
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f12425i = view;
        this.f12424h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (F1.W.x(view) == 0) {
            F1.W.u0(view, 1);
        }
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f12425i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f12425i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i10, Rect rect) {
        t tVar;
        W wY = y();
        int i11 = this.f12428l;
        int iK = PduHandle.NONE;
        t tVar2 = i11 == Integer.MIN_VALUE ? null : (t) wY.f(i11);
        if (i10 == 1 || i10 == 2) {
            tVar = (t) M1.b.d(wY, f12419p, f12418o, tVar2, i10, F1.W.z(this.f12425i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f12428l;
            if (i12 != Integer.MIN_VALUE) {
                z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f12425i, i10, rect2);
            }
            tVar = (t) M1.b.c(wY, f12419p, f12418o, tVar2, rect2, i10);
        }
        if (tVar != null) {
            iK = wY.k(wY.i(tVar));
        }
        return T(iK);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return F1.W.b0(this.f12425i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f12424h.isEnabled() || !this.f12424h.isTouchExplorationEnabled() || (i11 = this.f12427k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f12427k = i10;
        this.f12425i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f12429m;
        if (i11 == i10) {
            return;
        }
        this.f12429m = i10;
        U(i10, 128);
        U(i11, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    private boolean n(int i10) {
        if (this.f12427k != i10) {
            return false;
        }
        this.f12427k = PduHandle.NONE;
        this.f12425i.invalidate();
        U(i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        return true;
    }

    private boolean p() {
        int i10 = this.f12428l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        t tVarH = H(i10);
        accessibilityEventObtain.getText().add(tVarH.y());
        accessibilityEventObtain.setContentDescription(tVarH.r());
        accessibilityEventObtain.setScrollable(tVarH.P());
        accessibilityEventObtain.setPassword(tVarH.O());
        accessibilityEventObtain.setEnabled(tVarH.I());
        accessibilityEventObtain.setChecked(tVarH.F());
        L(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(tVarH.o());
        v.c(accessibilityEventObtain, this.f12425i, i10);
        accessibilityEventObtain.setPackageName(this.f12425i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f12425i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private t t(int i10) {
        t tVarU = t.U();
        tVarU.n0(true);
        tVarU.p0(true);
        tVarU.g0("android.view.View");
        Rect rect = f12417n;
        tVarU.c0(rect);
        tVarU.d0(rect);
        tVarU.B0(this.f12425i);
        N(i10, tVarU);
        if (tVarU.y() == null && tVarU.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        tVarU.k(this.f12421e);
        if (this.f12421e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int i11 = tVarU.i();
        if ((i11 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((i11 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        tVarU.z0(this.f12425i.getContext().getPackageName());
        tVarU.K0(this.f12425i, i10);
        if (this.f12427k == i10) {
            tVarU.Z(true);
            tVarU.a(128);
        } else {
            tVarU.Z(false);
            tVarU.a(64);
        }
        boolean z10 = this.f12428l == i10;
        if (z10) {
            tVarU.a(2);
        } else if (tVarU.J()) {
            tVarU.a(1);
        }
        tVarU.q0(z10);
        this.f12425i.getLocationOnScreen(this.f12423g);
        tVarU.l(this.f12420d);
        if (this.f12420d.equals(rect)) {
            tVarU.k(this.f12420d);
            if (tVarU.f6768b != -1) {
                t tVarU2 = t.U();
                for (int i12 = tVarU.f6768b; i12 != -1; i12 = tVarU2.f6768b) {
                    tVarU2.C0(this.f12425i, -1);
                    tVarU2.c0(f12417n);
                    N(i12, tVarU2);
                    tVarU2.k(this.f12421e);
                    Rect rect2 = this.f12420d;
                    Rect rect3 = this.f12421e;
                    rect2.offset(rect3.left, rect3.top);
                }
                tVarU2.Y();
            }
            this.f12420d.offset(this.f12423g[0] - this.f12425i.getScrollX(), this.f12423g[1] - this.f12425i.getScrollY());
        }
        if (this.f12425i.getLocalVisibleRect(this.f12422f)) {
            this.f12422f.offset(this.f12423g[0] - this.f12425i.getScrollX(), this.f12423g[1] - this.f12425i.getScrollY());
            if (this.f12420d.intersect(this.f12422f)) {
                tVarU.d0(this.f12420d);
                if (E(this.f12420d)) {
                    tVarU.T0(true);
                }
            }
        }
        return tVarU;
    }

    private t u() {
        t tVarW = t.W(this.f12425i);
        F1.W.Z(this.f12425i, tVarW);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (tVarW.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            tVarW.d(this.f12425i, ((Integer) arrayList.get(i10)).intValue());
        }
        return tVarW;
    }

    private W y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        W w10 = new W();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w10.l(((Integer) arrayList.get(i10)).intValue(), t(((Integer) arrayList.get(i10)).intValue()));
        }
        return w10;
    }

    private void z(int i10, Rect rect) {
        H(i10).k(rect);
    }

    public final int A() {
        return this.f12428l;
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List list);

    t H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f12428l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    protected abstract boolean J(int i10, int i11, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void M(t tVar);

    protected abstract void N(int i10, t tVar);

    protected abstract void O(int i10, boolean z10);

    boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f12425i.isFocused() && !this.f12425i.requestFocus()) || (i11 = this.f12428l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f12428l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f12424h.isEnabled() || (parent = this.f12425i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f12425i, q(i10, i11));
    }

    @Override // F1.C2736a
    public u b(View view) {
        if (this.f12426j == null) {
            this.f12426j = new c();
        }
        return this.f12426j;
    }

    @Override // F1.C2736a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // F1.C2736a
    public void g(View view, t tVar) {
        super.g(view, tVar);
        M(tVar);
    }

    public final boolean o(int i10) {
        if (this.f12428l != i10) {
            return false;
        }
        this.f12428l = PduHandle.NONE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f12424h.isEnabled() || !this.f12424h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            return iB != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f12429m == Integer.MIN_VALUE) {
            return false;
        }
        V(PduHandle.NONE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case ImageFormat.RGBA_FP16 /* 22 */:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iF = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z10 = false;
                    while (i10 < repeatCount && G(iF, null)) {
                        i10++;
                        z10 = true;
                    }
                    return z10;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.f12427k;
    }
}
