package G1;

import G1.w;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.ar.core.ImageMetadata;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f6767a;

    /* renamed from: b, reason: collision with root package name */
    public int f6768b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f6769c = -1;

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f6770A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f6771B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f6772C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f6773D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f6774E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f6775F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f6776G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f6777H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f6778I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f6779J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f6780K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f6781L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f6782M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f6783N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f6784O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f6785P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f6786Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f6787R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f6788S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f6789T;

        /* renamed from: U, reason: collision with root package name */
        public static final a f6790U;

        /* renamed from: V, reason: collision with root package name */
        public static final a f6791V;

        /* renamed from: e, reason: collision with root package name */
        public static final a f6792e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f6793f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f6794g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f6795h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f6796i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f6797j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f6798k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f6799l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f6800m = new a(PSKKeyManager.MAX_KEY_LENGTH_BYTES, (CharSequence) null, w.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f6801n = new a(512, (CharSequence) null, w.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f6802o = new a(1024, (CharSequence) null, w.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f6803p = new a(2048, (CharSequence) null, w.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f6804q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f6805r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f6806s = new a(TLSTM.TLS_MAX_FRAGMENT_SIZE, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f6807t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f6808u = new a(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f6809v = new a(131072, (CharSequence) null, w.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f6810w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f6811x = new a(ImageMetadata.LENS_APERTURE, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f6812y = new a(ImageMetadata.SHADING_MODE, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f6813z = new a(2097152, (CharSequence) null, w.h.class);

        /* renamed from: a, reason: collision with root package name */
        final Object f6814a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6815b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f6816c;

        /* renamed from: d, reason: collision with root package name */
        protected final w f6817d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f6770A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f6771B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, w.e.class);
            f6772C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f6773D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f6774E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f6775F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f6776G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f6777H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f6778I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f6779J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f6780K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f6781L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, w.f.class);
            f6782M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, w.d.class);
            f6783N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f6784O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f6785P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f6786Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f6787R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f6788S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f6789T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f6790U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f6791V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, w wVar) {
            return new a(null, this.f6815b, charSequence, wVar, this.f6816c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f6814a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f6814a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f6817d == null) {
                return false;
            }
            Class cls = this.f6816c;
            if (cls != null) {
                try {
                    AbstractC5487d.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f6816c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                }
            }
            return this.f6817d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f6814a;
            return obj2 == null ? aVar.f6814a == null : obj2.equals(aVar.f6814a);
        }

        public int hashCode() {
            Object obj = this.f6814a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strH = t.h(this.f6815b);
            if (strH.equals("ACTION_UNKNOWN") && c() != null) {
                strH = c().toString();
            }
            sb2.append(strH);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, w wVar) {
            this(null, i10, charSequence, wVar, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, w wVar, Class cls) {
            this.f6815b = i10;
            this.f6817d = wVar;
            if (obj == null) {
                this.f6814a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f6814a = obj;
            }
            this.f6816c = cls;
        }
    }

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        final Object f6818a;

        e(Object obj) {
            this.f6818a = obj;
        }

        public static e a(int i10, int i11, boolean z10, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        final Object f6819a;

        f(Object obj) {
            this.f6819a = obj;
        }

        public static f a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        final Object f6820a;

        g(Object obj) {
            this.f6820a = obj;
        }

        public static g a(int i10, float f10, float f11, float f12) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }
    }

    private t(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f6767a = accessibilityNodeInfo;
    }

    private boolean C() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static t U() {
        return V0(AccessibilityNodeInfo.obtain());
    }

    public static t V(t tVar) {
        return V0(AccessibilityNodeInfo.obtain(tVar.f6767a));
    }

    public static t V0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new t(accessibilityNodeInfo);
    }

    public static t W(View view) {
        return V0(AccessibilityNodeInfo.obtain(view));
    }

    private void b0(int i10, boolean z10) {
        Bundle bundleT = t();
        if (bundleT != null) {
            int i11 = bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleT.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private List f(String str) {
        ArrayList<Integer> integerArrayList = this.f6767a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f6767a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String h(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case TLSTM.TLS_MAX_FRAGMENT_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case ImageMetadata.CONTROL_AE_ANTIBANDING_MODE /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case ImageMetadata.LENS_APERTURE /* 524288 */:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean j(int i10) {
        Bundle bundleT = t();
        return bundleT != null && (bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public String A() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f6767a) : this.f6767a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void A0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6767a.setPaneTitle(charSequence);
        } else {
            this.f6767a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public String B() {
        return this.f6767a.getViewIdResourceName();
    }

    public void B0(View view) {
        this.f6768b = -1;
        this.f6767a.setParent(view);
    }

    public void C0(View view, int i10) {
        this.f6768b = i10;
        this.f6767a.setParent(view, i10);
    }

    public boolean D() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f6767a) : j(64);
    }

    public void D0(boolean z10) {
        this.f6767a.setPassword(z10);
    }

    public boolean E() {
        return this.f6767a.isCheckable();
    }

    public void E0(g gVar) {
        this.f6767a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f6820a);
    }

    public boolean F() {
        return this.f6767a.isChecked();
    }

    public void F0(CharSequence charSequence) {
        this.f6767a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean G() {
        return this.f6767a.isClickable();
    }

    public void G0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6767a.setScreenReaderFocusable(z10);
        } else {
            b0(1, z10);
        }
    }

    public boolean H() {
        return this.f6767a.isContextClickable();
    }

    public void H0(boolean z10) {
        this.f6767a.setScrollable(z10);
    }

    public boolean I() {
        return this.f6767a.isEnabled();
    }

    public void I0(boolean z10) {
        this.f6767a.setSelected(z10);
    }

    public boolean J() {
        return this.f6767a.isFocusable();
    }

    public void J0(boolean z10) {
        this.f6767a.setShowingHintText(z10);
    }

    public boolean K() {
        return this.f6767a.isFocused();
    }

    public void K0(View view, int i10) {
        this.f6769c = i10;
        this.f6767a.setSource(view, i10);
    }

    public boolean L() {
        return j(67108864);
    }

    public void L0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f6767a, charSequence);
        } else {
            this.f6767a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean M() {
        return this.f6767a.isImportantForAccessibility();
    }

    public void M0(CharSequence charSequence) {
        this.f6767a.setText(charSequence);
    }

    public boolean N() {
        return this.f6767a.isLongClickable();
    }

    public void N0(int i10, int i11) {
        this.f6767a.setTextSelection(i10, i11);
    }

    public boolean O() {
        return this.f6767a.isPassword();
    }

    public void O0(View view) {
        this.f6767a.setTraversalAfter(view);
    }

    public boolean P() {
        return this.f6767a.isScrollable();
    }

    public void P0(View view, int i10) {
        this.f6767a.setTraversalAfter(view, i10);
    }

    public boolean Q() {
        return this.f6767a.isSelected();
    }

    public void Q0(View view) {
        this.f6767a.setTraversalBefore(view);
    }

    public boolean R() {
        return this.f6767a.isShowingHintText();
    }

    public void R0(View view, int i10) {
        this.f6767a.setTraversalBefore(view, i10);
    }

    public boolean S() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f6767a) : j(8388608);
    }

    public void S0(String str) {
        this.f6767a.setViewIdResourceName(str);
    }

    public boolean T() {
        return this.f6767a.isVisibleToUser();
    }

    public void T0(boolean z10) {
        this.f6767a.setVisibleToUser(z10);
    }

    public AccessibilityNodeInfo U0() {
        return this.f6767a;
    }

    public boolean X(int i10, Bundle bundle) {
        return this.f6767a.performAction(i10, bundle);
    }

    public void Y() {
    }

    public void Z(boolean z10) {
        this.f6767a.setAccessibilityFocused(z10);
    }

    public void a(int i10) {
        this.f6767a.addAction(i10);
    }

    public void a0(List list) {
        this.f6767a.setAvailableExtraData(list);
    }

    public void b(a aVar) {
        this.f6767a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f6814a);
    }

    public void c(View view) {
        this.f6767a.addChild(view);
    }

    public void c0(Rect rect) {
        this.f6767a.setBoundsInParent(rect);
    }

    public void d(View view, int i10) {
        this.f6767a.addChild(view, i10);
    }

    public void d0(Rect rect) {
        this.f6767a.setBoundsInScreen(rect);
    }

    public void e(CharSequence charSequence, View view) {
    }

    public void e0(boolean z10) {
        this.f6767a.setCheckable(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6767a;
        if (accessibilityNodeInfo == null) {
            if (tVar.f6767a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(tVar.f6767a)) {
            return false;
        }
        return this.f6769c == tVar.f6769c && this.f6768b == tVar.f6768b;
    }

    public void f0(boolean z10) {
        this.f6767a.setChecked(z10);
    }

    public List g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f6767a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void g0(CharSequence charSequence) {
        this.f6767a.setClassName(charSequence);
    }

    public void h0(boolean z10) {
        this.f6767a.setClickable(z10);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6767a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public int i() {
        return this.f6767a.getActions();
    }

    public void i0(Object obj) {
        this.f6767a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f6818a);
    }

    public void j0(Object obj) {
        this.f6767a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f6819a);
    }

    public void k(Rect rect) {
        this.f6767a.getBoundsInParent(rect);
    }

    public void k0(CharSequence charSequence) {
        this.f6767a.setContentDescription(charSequence);
    }

    public void l(Rect rect) {
        this.f6767a.getBoundsInScreen(rect);
    }

    public void l0(boolean z10) {
        this.f6767a.setContentInvalid(z10);
    }

    public void m(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f6767a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f6767a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void m0(boolean z10) {
        this.f6767a.setEditable(z10);
    }

    public int n() {
        return this.f6767a.getChildCount();
    }

    public void n0(boolean z10) {
        this.f6767a.setEnabled(z10);
    }

    public CharSequence o() {
        return this.f6767a.getClassName();
    }

    public void o0(CharSequence charSequence) {
        this.f6767a.setError(charSequence);
    }

    public void p0(boolean z10) {
        this.f6767a.setFocusable(z10);
    }

    public CharSequence q() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f6767a) : this.f6767a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void q0(boolean z10) {
        this.f6767a.setFocused(z10);
    }

    public CharSequence r() {
        return this.f6767a.getContentDescription();
    }

    public void r0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6767a.setHeading(z10);
        } else {
            b0(2, z10);
        }
    }

    public CharSequence s() {
        return this.f6767a.getError();
    }

    public void s0(CharSequence charSequence) {
        this.f6767a.setHintText(charSequence);
    }

    public Bundle t() {
        return this.f6767a.getExtras();
    }

    public void t0(boolean z10) {
        this.f6767a.setImportantForAccessibility(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb2.append("; boundsInParent: " + rect);
        l(rect);
        sb2.append("; boundsInScreen: " + rect);
        m(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(w());
        sb2.append("; className: ");
        sb2.append(o());
        sb2.append("; text: ");
        sb2.append(y());
        sb2.append("; error: ");
        sb2.append(s());
        sb2.append("; maxTextLength: ");
        sb2.append(u());
        sb2.append("; stateDescription: ");
        sb2.append(x());
        sb2.append("; contentDescription: ");
        sb2.append(r());
        sb2.append("; tooltipText: ");
        sb2.append(z());
        sb2.append("; viewIdResName: ");
        sb2.append(B());
        sb2.append("; uniqueId: ");
        sb2.append(A());
        sb2.append("; checkable: ");
        sb2.append(E());
        sb2.append("; checked: ");
        sb2.append(F());
        sb2.append("; focusable: ");
        sb2.append(J());
        sb2.append("; focused: ");
        sb2.append(K());
        sb2.append("; selected: ");
        sb2.append(Q());
        sb2.append("; clickable: ");
        sb2.append(G());
        sb2.append("; longClickable: ");
        sb2.append(N());
        sb2.append("; contextClickable: ");
        sb2.append(H());
        sb2.append("; enabled: ");
        sb2.append(I());
        sb2.append("; password: ");
        sb2.append(O());
        sb2.append("; scrollable: " + P());
        sb2.append("; containerTitle: ");
        sb2.append(q());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(L());
        sb2.append("; importantForAccessibility: ");
        sb2.append(M());
        sb2.append("; visible: ");
        sb2.append(T());
        sb2.append("; isTextSelectable: ");
        sb2.append(S());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(D());
        sb2.append("; [");
        List listG = g();
        for (int i10 = 0; i10 < listG.size(); i10++) {
            a aVar = (a) listG.get(i10);
            String strH = h(aVar.b());
            if (strH.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strH = aVar.c().toString();
            }
            sb2.append(strH);
            if (i10 != listG.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int u() {
        return this.f6767a.getMaxTextLength();
    }

    public void u0(View view) {
        this.f6767a.setLabelFor(view);
    }

    public int v() {
        return this.f6767a.getMovementGranularities();
    }

    public void v0(int i10) {
        this.f6767a.setLiveRegion(i10);
    }

    public CharSequence w() {
        return this.f6767a.getPackageName();
    }

    public void w0(boolean z10) {
        this.f6767a.setLongClickable(z10);
    }

    public CharSequence x() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f6767a) : this.f6767a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void x0(int i10) {
        this.f6767a.setMaxTextLength(i10);
    }

    public CharSequence y() {
        if (!C()) {
            return this.f6767a.getText();
        }
        List listF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f6767a.getText(), 0, this.f6767a.getText().length()));
        for (int i10 = 0; i10 < listF.size(); i10++) {
            spannableString.setSpan(new G1.a(((Integer) listF4.get(i10)).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listF.get(i10)).intValue(), ((Integer) listF2.get(i10)).intValue(), ((Integer) listF3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void y0(int i10) {
        this.f6767a.setMovementGranularities(i10);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 28 ? this.f6767a.getTooltipText() : this.f6767a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void z0(CharSequence charSequence) {
        this.f6767a.setPackageName(charSequence);
    }
}
