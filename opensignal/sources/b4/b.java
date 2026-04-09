package b4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import io.sentry.hints.i;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o2.g;
import u3.i0;

/* loaded from: classes.dex */
public abstract class b extends u3.b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f2381n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final i f2382o;

    /* renamed from: p, reason: collision with root package name */
    public static final sm.f f2383p;

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f2388h;

    /* renamed from: i, reason: collision with root package name */
    public final Chip f2389i;
    public a j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2384d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2385e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f2386f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2387g = new int[2];
    public int k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f2390l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f2391m = Integer.MIN_VALUE;

    static {
        int i10 = 2;
        f2382o = new i(i10);
        f2383p = new sm.f(i10);
    }

    public b(Chip chip) {
        this.f2389i = chip;
        this.f2388h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = i0.f23177a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // u3.b
    public final g b(View view) {
        if (this.j == null) {
            this.j = new a(this, 0);
        }
        return this.j;
    }

    @Override // u3.b
    public final void d(View view, v3.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f23838a;
        this.f23147a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((qd.c) this).f20847q;
        qd.e eVar = chip.f5570x;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f20880w0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        cVar.i(chip.getAccessibilityClassName());
        cVar.m(chip.getText());
    }

    public final boolean j(int i10) {
        if (this.f2390l != i10) {
            return false;
        }
        this.f2390l = Integer.MIN_VALUE;
        p(i10, false);
        r(i10, 8);
        return true;
    }

    public final v3.c k(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        v3.c cVar = new v3.c(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        cVar.i("android.view.View");
        Rect rect = f2381n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        cVar.f23839b = -1;
        Chip chip = this.f2389i;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i10, cVar);
        if (cVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f2385e;
        cVar.f(rect2);
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
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        cVar.f23840c = i10;
        accessibilityNodeInfoObtain.setSource(chip, i10);
        if (this.k == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            cVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            cVar.a(64);
        }
        boolean z10 = this.f2390l == i10;
        if (z10) {
            cVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            cVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z10);
        int[] iArr = this.f2387g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f2384d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            cVar.f(rect3);
            if (cVar.f23839b != -1) {
                v3.c cVar2 = new v3.c(AccessibilityNodeInfo.obtain());
                for (int i11 = cVar.f23839b; i11 != -1; i11 = cVar2.f23839b) {
                    cVar2.f23839b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = cVar2.f23838a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i11, cVar2);
                    cVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f2386f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = cVar.f23838a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return cVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.b.m(int, android.graphics.Rect):boolean");
    }

    public final v3.c n(int i10) {
        if (i10 != -1) {
            return k(i10);
        }
        Chip chip = this.f2389i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        v3.c cVar = new v3.c(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = i0.f23177a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            cVar.f23838a.addChild(chip, ((Integer) arrayList.get(i11)).intValue());
        }
        return cVar;
    }

    public abstract void o(int i10, v3.c cVar);

    public abstract void p(int i10, boolean z10);

    public final boolean q(int i10) {
        int i11;
        Chip chip = this.f2389i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i11 = this.f2390l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f2390l = i10;
        p(i10, true);
        r(i10, 8);
        return true;
    }

    public final void r(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i10 == Integer.MIN_VALUE || !this.f2388h.isEnabled() || (parent = (view = this.f2389i).getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            v3.c cVarN = n(i10);
            accessibilityEventObtain.getText().add(cVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = cVarN.f23838a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i10);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
