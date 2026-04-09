package n4;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import e4.v0;
import f4.f;
import j2.s;
import j6.i;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a extends e4.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f29730n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);

    /* renamed from: o, reason: collision with root package name */
    public static final i7.b f29731o = new i7.b();

    /* renamed from: p, reason: collision with root package name */
    public static final i f29732p = new i(7);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f29736h;

    /* renamed from: i, reason: collision with root package name */
    public final View f29737i;
    public s j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f29733d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f29734e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f29735f = new Rect();
    public final int[] g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f29738k = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: l, reason: collision with root package name */
    public int f29739l = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: m, reason: collision with root package name */
    public int f29740m = LinearLayoutManager.INVALID_OFFSET;

    public a(View view) {
        this.f29737i = view;
        this.f29736h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = v0.f22405a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // e4.b
    public final jf.c b(View view) {
        if (this.j == null) {
            this.j = new s(this, 1);
        }
        return this.j;
    }

    @Override // e4.b
    public final void d(View view, f fVar) {
        this.f22306a.onInitializeAccessibilityNodeInfo(view, fVar.f23651a);
        t(fVar);
    }

    public final boolean j(int i4) {
        if (this.f29739l != i4) {
            return false;
        }
        this.f29739l = LinearLayoutManager.INVALID_OFFSET;
        v(i4, false);
        x(i4, 8);
        return true;
    }

    public final AccessibilityEvent k(int i4, int i10) {
        View view = this.f29737i;
        if (i4 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i10);
        f fVarR = r(i4);
        accessibilityEventObtain2.getText().add(fVarR.g());
        AccessibilityNodeInfo accessibilityNodeInfo = fVarR.f23651a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i4);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final f l(int i4) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        f fVar = new f(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        fVar.k("android.view.View");
        Rect rect = f29730n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        fVar.f23652b = -1;
        View view = this.f29737i;
        accessibilityNodeInfoObtain.setParent(view);
        u(i4, fVar);
        if (fVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f29734e;
        fVar.f(rect2);
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
        fVar.f23653c = i4;
        accessibilityNodeInfoObtain.setSource(view, i4);
        if (this.f29738k == i4) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            fVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            fVar.a(64);
        }
        boolean z3 = this.f29739l == i4;
        if (z3) {
            fVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            fVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z3);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f29733d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            fVar.f(rect3);
            if (fVar.f23652b != -1) {
                f fVar2 = new f(AccessibilityNodeInfo.obtain());
                for (int i10 = fVar.f23652b; i10 != -1; i10 = fVar2.f23652b) {
                    fVar2.f23652b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = fVar2.f23651a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    u(i10, fVar2);
                    fVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f29735f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = fVar.f23651a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
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
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return fVar;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i4;
        AccessibilityManager accessibilityManager = this.f29736h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i10 = this.f29740m;
            if (i10 != iN) {
                this.f29740m = iN;
                x(iN, 128);
                x(i10, 256);
            }
            if (iN == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i4 = this.f29740m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f29740m = LinearLayoutManager.INVALID_OFFSET;
                x(LinearLayoutManager.INVALID_OFFSET, 128);
                x(i4, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f10, float f11);

    public abstract void o(ArrayList arrayList);

    public final void p(int i4) {
        View view;
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.f29736h.isEnabled() || (parent = (view = this.f29737i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(i4, 2048);
        accessibilityEventK.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a.q(int, android.graphics.Rect):boolean");
    }

    public final f r(int i4) {
        if (i4 != -1) {
            return l(i4);
        }
        View view = this.f29737i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        f fVar = new f(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = v0.f22405a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            fVar.f23651a.addChild(view, ((Integer) arrayList.get(i10)).intValue());
        }
        return fVar;
    }

    public abstract boolean s(int i4, int i10, Bundle bundle);

    public abstract void u(int i4, f fVar);

    public final boolean w(int i4) {
        int i10;
        View view = this.f29737i;
        if ((!view.isFocused() && !view.requestFocus()) || (i10 = this.f29739l) == i4) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            j(i10);
        }
        if (i4 == Integer.MIN_VALUE) {
            return false;
        }
        this.f29739l = i4;
        v(i4, true);
        x(i4, 8);
        return true;
    }

    public final void x(int i4, int i10) {
        View view;
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.f29736h.isEnabled() || (parent = (view = this.f29737i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i4, i10));
    }

    public void t(f fVar) {
    }

    public void v(int i4, boolean z3) {
    }
}
