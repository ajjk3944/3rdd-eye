package V0;

import L0.C0770a;
import L0.I;
import L0.S;
import M0.g;
import M0.h;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends C0770a {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f12830n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o, reason: collision with root package name */
    public static final C0179a f12831o = new C0179a();

    /* renamed from: p, reason: collision with root package name */
    public static final b f12832p = new b();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f12837h;
    public final View i;

    /* renamed from: j, reason: collision with root package name */
    public c f12838j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f12833d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f12834e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f12835f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f12836g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f12839k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l, reason: collision with root package name */
    public int f12840l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m, reason: collision with root package name */
    public int f12841m = RecyclerView.UNDEFINED_DURATION;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: V0.a$a, reason: collision with other inner class name */
    public class C0179a {
    }

    /* compiled from: ExploreByTouchHelper.java */
    public class b {
    }

    /* compiled from: ExploreByTouchHelper.java */
    public class c extends h {
        public c() {
        }

        @Override // M0.h
        public final g a(int i) {
            return new g(AccessibilityNodeInfo.obtain(a.this.s(i).f4122a));
        }

        @Override // M0.h
        public final g b(int i) {
            a aVar = a.this;
            int i10 = i == 2 ? aVar.f12839k : aVar.f12840l;
            if (i10 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i10);
        }

        @Override // M0.h
        public final boolean c(int i, int i10, Bundle bundle) {
            int i11;
            a aVar = a.this;
            View view = aVar.i;
            if (i == -1) {
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                return view.performAccessibilityAction(i10, bundle);
            }
            if (i10 == 1) {
                return aVar.y(i);
            }
            if (i10 == 2) {
                return aVar.j(i);
            }
            if (i10 != 64) {
                if (i10 != 128) {
                    return aVar.u(i, i10, bundle);
                }
                if (aVar.f12839k != i) {
                    return false;
                }
                aVar.f12839k = RecyclerView.UNDEFINED_DURATION;
                view.invalidate();
                aVar.z(i, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = aVar.f12837h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i11 = aVar.f12839k) == i) {
                return false;
            }
            if (i11 != Integer.MIN_VALUE) {
                aVar.f12839k = RecyclerView.UNDEFINED_DURATION;
                aVar.i.invalidate();
                aVar.z(i11, 65536);
            }
            aVar.f12839k = i;
            view.invalidate();
            aVar.z(i, Constants.QUEUE_ELEMENT_MAX_SIZE);
            return true;
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.f12837h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // L0.C0770a
    public final h b(View view) {
        if (this.f12838j == null) {
            this.f12838j = new c();
        }
        return this.f12838j;
    }

    @Override // L0.C0770a
    public final void d(View view, g gVar) {
        this.f3883a.onInitializeAccessibilityNodeInfo(view, gVar.f4122a);
        v(gVar);
    }

    public final boolean j(int i) {
        if (this.f12840l != i) {
            return false;
        }
        this.f12840l = RecyclerView.UNDEFINED_DURATION;
        x(i, false);
        z(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i10) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i10);
        g gVarS = s(i);
        accessibilityEventObtain2.getText().add(gVarS.g());
        AccessibilityNodeInfo accessibilityNodeInfo = gVarS.f4122a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final g l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        gVar.j("android.view.View");
        Rect rect = f12830n;
        gVar.i(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        View view = this.i;
        accessibilityNodeInfoObtain.setParent(view);
        w(i, gVar);
        if (gVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f12834e;
        gVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        gVar.f4123b = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.f12839k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            gVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            gVar.a(64);
        }
        boolean z10 = this.f12840l == i;
        if (z10) {
            gVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            gVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z10);
        int[] iArr = this.f12836g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f12833d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            gVar.f(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f12835f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return gVar;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.f12837h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iO = o(motionEvent.getX(), motionEvent.getY());
            int i10 = this.f12841m;
            if (i10 != iO) {
                this.f12841m = iO;
                z(iO, 128);
                z(i10, 256);
            }
            if (iO == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.f12841m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.f12841m = RecyclerView.UNDEFINED_DURATION;
                z(i, 256);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L75
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L5e
            r3 = 66
            if (r0 == r3) goto L46
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L46;
                default: goto L18;
            }
        L18:
            goto L75
        L19:
            boolean r5 = r7.hasNoModifiers()
            if (r5 == 0) goto L75
            r5 = 19
            if (r0 == r5) goto L31
            r5 = 21
            if (r0 == r5) goto L2e
            r5 = 22
            if (r0 == r5) goto L33
            r3 = 130(0x82, float:1.82E-43)
            goto L33
        L2e:
            r3 = 17
            goto L33
        L31:
            r3 = 33
        L33:
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r0 = r1
        L39:
            if (r1 >= r7) goto L45
            boolean r5 = r6.r(r3, r4)
            if (r5 == 0) goto L45
            int r1 = r1 + 1
            r0 = r2
            goto L39
        L45:
            return r0
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L75
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L75
            int r7 = r6.f12840l
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r0) goto L5d
            r0 = 16
            r6.u(r7, r0, r4)
        L5d:
            return r2
        L5e:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L6a
            r7 = 2
            boolean r7 = r6.r(r7, r4)
            return r7
        L6a:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L75
            boolean r7 = r6.r(r2, r4)
            return r7
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.a.n(android.view.KeyEvent):boolean");
    }

    public abstract int o(float f10, float f11);

    public abstract void p(ArrayList arrayList);

    public final void q(int i, int i10) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f12837h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(i, 2048);
        accessibilityEventK.setContentChangeTypes(i10);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.a.r(int, android.graphics.Rect):boolean");
    }

    public final g s(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        g gVar = new g(accessibilityNodeInfoObtain);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        p(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            gVar.f4122a.addChild(view, ((Integer) arrayList.get(i10)).intValue());
        }
        return gVar;
    }

    public final void t(boolean z10, int i, Rect rect) {
        int i10 = this.f12840l;
        if (i10 != Integer.MIN_VALUE) {
            j(i10);
        }
        if (z10) {
            r(i, rect);
        }
    }

    public abstract boolean u(int i, int i10, Bundle bundle);

    public abstract void w(int i, g gVar);

    public final boolean y(int i) {
        int i10;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i10 = this.f12840l) == i) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            j(i10);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f12840l = i;
        x(i, true);
        z(i, 8);
        return true;
    }

    public final void z(int i, int i10) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f12837h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i10));
    }

    public void v(g gVar) {
    }

    public void x(int i, boolean z10) {
    }
}
