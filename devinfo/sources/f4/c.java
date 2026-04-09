package f4;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import e4.e0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f23632e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f23633f;
    public static final c g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f23634h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f23635i;
    public static final c j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f23636k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f23637l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f23638m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f23639n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f23640o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f23641p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f23642q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f23643r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f23644s;

    /* renamed from: a, reason: collision with root package name */
    public final Object f23645a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23646b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f23647c;

    /* renamed from: d, reason: collision with root package name */
    public final p f23648d;

    static {
        new c(1, (String) null);
        new c(2, (String) null);
        new c(4, (String) null);
        new c(8, (String) null);
        f23632e = new c(16, (String) null);
        new c(32, (String) null);
        f23633f = new c(64, (String) null);
        g = new c(128, (String) null);
        new c(256, i.class);
        new c(512, i.class);
        new c(Segment.SHARE_MINIMUM, j.class);
        new c(2048, j.class);
        f23634h = new c(Buffer.SEGMENTING_THRESHOLD, (String) null);
        f23635i = new c(Segment.SIZE, (String) null);
        new c(Http2.INITIAL_MAX_FRAME_SIZE, (String) null);
        new c(32768, (String) null);
        new c(65536, (String) null);
        new c(131072, n.class);
        j = new c(262144, (String) null);
        f23636k = new c(524288, (String) null);
        f23637l = new c(1048576, (String) null);
        new c(2097152, o.class);
        int i4 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        f23638m = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, l.class);
        f23639n = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f23640o = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f23641p = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f23642q = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new c(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new c(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new c(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new c(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        f23643r = new c(i4 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, m.class);
        new c(i4 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, k.class);
        new c(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new c(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new c(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new c(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new c(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new c(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new c(i4 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        f23644s = new c(i4 >= 34 ? e0.d() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public c(int i4, String str) {
        this(null, i4, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f23645a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f23645a;
        Object obj3 = this.f23645a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f23645a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strD = f.d(this.f23646b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f23645a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strD);
        return sb2.toString();
    }

    public c(int i4, Class cls) {
        this(null, i4, null, null, cls);
    }

    public c(Object obj, int i4, CharSequence charSequence, p pVar, Class cls) {
        this.f23646b = i4;
        this.f23648d = pVar;
        if (obj == null) {
            this.f23645a = new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence);
        } else {
            this.f23645a = obj;
        }
        this.f23647c = cls;
    }
}
