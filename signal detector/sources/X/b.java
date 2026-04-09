package X;

import R.C0175b;
import R.O;
import S4.r;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class b extends C0175b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f4106n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);

    /* renamed from: o, reason: collision with root package name */
    public static final r f4107o = new r(7);

    /* renamed from: p, reason: collision with root package name */
    public static final r f4108p = new r(8);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f4113h;
    public final View i;

    /* renamed from: j, reason: collision with root package name */
    public a f4114j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4109d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f4110e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f4111f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4112g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f4115k = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: l, reason: collision with root package name */
    public int f4116l = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: m, reason: collision with root package name */
    public int f4117m = LinearLayoutManager.INVALID_OFFSET;

    public b(View view) {
        this.i = view;
        this.f4113h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = O.f3270a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // R.C0175b
    public final A0.e b(View view) {
        if (this.f4114j == null) {
            this.f4114j = new a(this);
        }
        return this.f4114j;
    }

    @Override // R.C0175b
    public final void d(View view, S.d dVar) {
        this.f3302a.onInitializeAccessibilityNodeInfo(view, dVar.f3446a);
        t(dVar);
    }

    public final boolean j(int i) {
        if (this.f4116l != i) {
            return false;
        }
        this.f4116l = LinearLayoutManager.INVALID_OFFSET;
        v(i, false);
        x(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i3) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i3);
        S.d dVarR = r(i);
        accessibilityEventObtain2.getText().add(dVarR.g());
        AccessibilityNodeInfo accessibilityNodeInfo = dVarR.f3446a;
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

    public final S.d l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        S.d dVar = new S.d(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        dVar.i("android.view.View");
        Rect rect = f4106n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        View view = this.i;
        accessibilityNodeInfoObtain.setParent(view);
        u(i, dVar);
        if (dVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f4110e;
        dVar.f(rect2);
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
        dVar.f3447b = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.f4115k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            dVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            dVar.a(64);
        }
        boolean z6 = this.f4116l == i;
        if (z6) {
            dVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            dVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z6);
        int[] iArr = this.f4112g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f4109d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            dVar.f(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f4111f;
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
                            dVar.f3446a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return dVar;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.f4113h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i3 = this.f4117m;
            if (i3 != iN) {
                this.f4117m = iN;
                x(iN, 128);
                x(i3, 256);
            }
            if (iN == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.f4117m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.f4117m = LinearLayoutManager.INVALID_OFFSET;
                x(LinearLayoutManager.INVALID_OFFSET, 128);
                x(i, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f2, float f5);

    public abstract void o(ArrayList arrayList);

    public final void p(int i) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f4113h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(i, 2048);
        accessibilityEventK.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.b.q(int, android.graphics.Rect):boolean");
    }

    public final S.d r(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        S.d dVar = new S.d(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = O.f3270a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            dVar.f3446a.addChild(view, ((Integer) arrayList.get(i3)).intValue());
        }
        return dVar;
    }

    public abstract boolean s(int i, int i3, Bundle bundle);

    public abstract void u(int i, S.d dVar);

    public final boolean w(int i) {
        int i3;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i3 = this.f4116l) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            j(i3);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f4116l = i;
        v(i, true);
        x(i, 8);
        return true;
    }

    public final void x(int i, int i3) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f4113h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i3));
    }

    public void t(S.d dVar) {
    }

    public void v(int i, boolean z6) {
    }
}
