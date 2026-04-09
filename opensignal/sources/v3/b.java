package v3;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import u3.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f23825e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f23826f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f23827g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f23828h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f23829i;
    public static final b j;
    public static final b k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f23830l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f23831m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f23832n;

    /* renamed from: a, reason: collision with root package name */
    public final Object f23833a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23834b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f23835c;

    /* renamed from: d, reason: collision with root package name */
    public final m f23836d;

    static {
        new b(1, (String) null);
        new b(2, (String) null);
        new b(4, (String) null);
        new b(8, (String) null);
        f23825e = new b(16, (String) null);
        new b(32, (String) null);
        f23826f = new b(64, (String) null);
        f23827g = new b(128, (String) null);
        new b(256, f.class);
        new b(512, f.class);
        new b(1024, g.class);
        new b(2048, g.class);
        f23828h = new b(4096, (String) null);
        f23829i = new b(8192, (String) null);
        new b(16384, (String) null);
        new b(32768, (String) null);
        new b(65536, (String) null);
        new b(131072, k.class);
        j = new b(262144, (String) null);
        k = new b(524288, (String) null);
        f23830l = new b(1048576, (String) null);
        new b(2097152, l.class);
        int i10 = Build.VERSION.SDK_INT;
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, i.class);
        f23831m = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f23832n = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new b(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new b(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new b(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new b(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, j.class);
        new b(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, h.class);
        new b(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new b(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new b(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new b(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new b(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new b(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new b(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new b(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new b(i10 >= 34 ? r.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public b(int i10, String str) {
        this(null, i10, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f23833a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        Object obj2 = ((b) obj).f23833a;
        Object obj3 = this.f23833a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f23833a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strD = c.d(this.f23834b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f23833a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strD);
        return sb2.toString();
    }

    public b(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public b(Object obj, int i10, CharSequence charSequence, m mVar, Class cls) {
        this.f23834b = i10;
        this.f23836d = mVar;
        if (obj == null) {
            this.f23833a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.f23833a = obj;
        }
        this.f23835c = cls;
    }
}
