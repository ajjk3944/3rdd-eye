package S;

import R.AbstractC0195w;
import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f3431e = new c(1, (String) null);

    /* renamed from: f, reason: collision with root package name */
    public static final c f3432f = new c(2, (String) null);

    /* renamed from: g, reason: collision with root package name */
    public static final c f3433g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f3434h;
    public static final c i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f3435j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f3436k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f3437l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f3438m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f3439n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f3440o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3441a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3442b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f3443c;

    /* renamed from: d, reason: collision with root package name */
    public final n f3444d;

    static {
        new c(4, (String) null);
        new c(8, (String) null);
        f3433g = new c(16, (String) null);
        new c(32, (String) null);
        new c(64, (String) null);
        new c(128, (String) null);
        new c(256, g.class);
        new c(512, g.class);
        new c(1024, h.class);
        new c(2048, h.class);
        f3434h = new c(4096, (String) null);
        i = new c(8192, (String) null);
        new c(16384, (String) null);
        new c(32768, (String) null);
        new c(65536, (String) null);
        new c(131072, l.class);
        f3435j = new c(262144, (String) null);
        f3436k = new c(524288, (String) null);
        f3437l = new c(1048576, (String) null);
        new c(2097152, m.class);
        int i3 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, j.class);
        f3438m = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f3439n = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new c(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        f3440o = new c(i3 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, k.class);
        new c(i3 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, i.class);
        new c(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new c(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new c(i3 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new c(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new c(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new c(i3 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new c(i3 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new c(i3 >= 34 ? AbstractC0195w.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public c(int i3, String str) {
        this(null, i3, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f3441a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f3441a;
        Object obj3 = this.f3441a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f3441a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = d.d(this.f3442b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f3441a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public c(int i3, Class cls) {
        this(null, i3, null, null, cls);
    }

    public c(Object obj, int i3, CharSequence charSequence, n nVar, Class cls) {
        this.f3442b = i3;
        this.f3444d = nVar;
        if (obj == null) {
            this.f3441a = new AccessibilityNodeInfo.AccessibilityAction(i3, charSequence);
        } else {
            this.f3441a = obj;
        }
        this.f3443c = cls;
    }
}
