package s0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xbill.DNS.KEYRecord;
import s0.a0;

/* loaded from: classes.dex */
public class x {

    /* renamed from: d, reason: collision with root package name */
    public static int f24192d;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f24193a;

    /* renamed from: b, reason: collision with root package name */
    public int f24194b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f24195c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;

        /* renamed from: e, reason: collision with root package name */
        public static final a f24196e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f24197f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f24198g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f24199h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f24200i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f24201j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f24202k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f24203l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f24204m = new a(256, (CharSequence) null, a0.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f24205n = new a(512, (CharSequence) null, a0.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f24206o = new a(1024, (CharSequence) null, a0.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f24207p = new a(KEYRecord.Flags.FLAG4, (CharSequence) null, a0.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f24208q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f24209r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f24210s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f24211t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f24212u = new a(C.DEFAULT_BUFFER_SEGMENT_SIZE, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f24213v = new a(131072, (CharSequence) null, a0.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f24214w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f24215x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f24216y = new a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f24217z = new a(2097152, (CharSequence) null, a0.h.class);

        /* renamed from: a, reason: collision with root package name */
        public final Object f24218a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24219b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f24220c;

        /* renamed from: d, reason: collision with root package name */
        public final a0 f24221d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, a0.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, a0.f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, a0.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, a0 a0Var) {
            return new a(null, this.f24219b, charSequence, a0Var, this.f24220c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f24218a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f24218a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f24221d == null) {
                return false;
            }
            Class cls = this.f24220c;
            if (cls != null) {
                try {
                    androidx.appcompat.app.z.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f24220c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                }
            }
            return this.f24221d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f24218a;
            return obj2 == null ? aVar.f24218a == null : obj2.equals(aVar.f24218a);
        }

        public int hashCode() {
            Object obj = this.f24218a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strJ = x.j(this.f24219b);
            if (strJ.equals("ACTION_UNKNOWN") && c() != null) {
                strJ = c().toString();
            }
            sb.append(strJ);
            return sb.toString();
        }

        public a(int i10, CharSequence charSequence, a0 a0Var) {
            this(null, i10, charSequence, a0Var, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, a0 a0Var, Class cls) {
            this.f24219b = i10;
            this.f24221d = a0Var;
            if (obj == null) {
                this.f24218a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f24218a = obj;
            }
            this.f24220c = cls;
        }
    }

    public static class b {
        @DoNotInline
        public static Object a(int i10, float f10, float f11, float f12) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
        }

        @DoNotInline
        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        @DoNotInline
        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class c {
        @DoNotInline
        public static f a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        @DoNotInline
        public static x b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return x.S0(accessibilityNodeInfo.getChild(i10, i11));
        }

        @DoNotInline
        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        @DoNotInline
        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        @DoNotInline
        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        @DoNotInline
        public static x f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return x.S0(accessibilityNodeInfo.getParent(i10));
        }

        @DoNotInline
        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        @DoNotInline
        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        @DoNotInline
        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        @DoNotInline
        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    public static class d {
        @DoNotInline
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        @DoNotInline
        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        @DoNotInline
        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        @DoNotInline
        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        @DoNotInline
        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        @DoNotInline
        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        @DoNotInline
        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        @DoNotInline
        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        @DoNotInline
        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        @DoNotInline
        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j10));
        }

        @DoNotInline
        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        @DoNotInline
        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24222a;

        public e(Object obj) {
            this.f24222a = obj;
        }

        public static e a(int i10, int i11, boolean z10) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static e b(int i10, int i11, boolean z10, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24223a;

        public f(Object obj) {
            this.f24223a = obj;
        }

        public static f a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public x(Object obj) {
        this.f24193a = (AccessibilityNodeInfo) obj;
    }

    public static x R0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new x(accessibilityNodeInfo);
    }

    public static x S0(Object obj) {
        if (obj != null) {
            return new x(obj);
        }
        return null;
    }

    public static x Z() {
        return R0(AccessibilityNodeInfo.obtain());
    }

    public static x a0(View view) {
        return R0(AccessibilityNodeInfo.obtain(view));
    }

    public static x b0(x xVar) {
        return R0(AccessibilityNodeInfo.obtain(xVar.f24193a));
    }

    public static String j(int i10) {
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
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case KEYRecord.Flags.FLAG4 /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
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

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public CharSequence A() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f24193a) : this.f24193a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void A0(int i10) {
        this.f24193a.setMaxTextLength(i10);
    }

    public CharSequence B() {
        if (!F()) {
            return this.f24193a.getText();
        }
        List listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f24193a.getText(), 0, this.f24193a.getText().length()));
        for (int i10 = 0; i10 < listH.size(); i10++) {
            spannableString.setSpan(new s0.a(((Integer) listH4.get(i10)).intValue(), this, v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listH.get(i10)).intValue(), ((Integer) listH2.get(i10)).intValue(), ((Integer) listH3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void B0(CharSequence charSequence) {
        this.f24193a.setPackageName(charSequence);
    }

    public CharSequence C() {
        return Build.VERSION.SDK_INT >= 28 ? this.f24193a.getTooltipText() : this.f24193a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void C0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f24193a.setPaneTitle(charSequence);
        } else {
            this.f24193a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public String D() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f24193a) : this.f24193a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void D0(View view) {
        this.f24194b = -1;
        this.f24193a.setParent(view);
    }

    public String E() {
        return this.f24193a.getViewIdResourceName();
    }

    public void E0(View view, int i10) {
        this.f24194b = i10;
        this.f24193a.setParent(view, i10);
    }

    public final boolean F() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void F0(CharSequence charSequence) {
        this.f24193a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final int G(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f24192d;
        f24192d = i11 + 1;
        return i11;
    }

    public void G0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f24193a.setScreenReaderFocusable(z10);
        } else {
            h0(1, z10);
        }
    }

    public boolean H() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f24193a) : l(64);
    }

    public void H0(boolean z10) {
        this.f24193a.setScrollable(z10);
    }

    public boolean I() {
        return this.f24193a.isAccessibilityFocused();
    }

    public void I0(boolean z10) {
        this.f24193a.setSelected(z10);
    }

    public boolean J() {
        return this.f24193a.isCheckable();
    }

    public void J0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f24193a.setShowingHintText(z10);
        } else {
            h0(4, z10);
        }
    }

    public boolean K() {
        return this.f24193a.isChecked();
    }

    public void K0(View view) {
        this.f24195c = -1;
        this.f24193a.setSource(view);
    }

    public boolean L() {
        return this.f24193a.isClickable();
    }

    public void L0(View view, int i10) {
        this.f24195c = i10;
        this.f24193a.setSource(view, i10);
    }

    public boolean M() {
        return this.f24193a.isContextClickable();
    }

    public void M0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f24193a, charSequence);
        } else {
            this.f24193a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean N() {
        return this.f24193a.isEnabled();
    }

    public void N0(CharSequence charSequence) {
        this.f24193a.setText(charSequence);
    }

    public boolean O() {
        return this.f24193a.isFocusable();
    }

    public void O0(View view) {
        this.f24193a.setTraversalAfter(view);
    }

    public boolean P() {
        return this.f24193a.isFocused();
    }

    public void P0(boolean z10) {
        this.f24193a.setVisibleToUser(z10);
    }

    public boolean Q() {
        return l(67108864);
    }

    public AccessibilityNodeInfo Q0() {
        return this.f24193a;
    }

    public boolean R() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f24193a.isImportantForAccessibility();
        }
        return true;
    }

    public boolean S() {
        return this.f24193a.isLongClickable();
    }

    public boolean T() {
        return this.f24193a.isPassword();
    }

    public boolean U() {
        return this.f24193a.isScrollable();
    }

    public boolean V() {
        return this.f24193a.isSelected();
    }

    public boolean W() {
        return Build.VERSION.SDK_INT >= 26 ? this.f24193a.isShowingHintText() : l(4);
    }

    public boolean X() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f24193a) : l(8388608);
    }

    public boolean Y() {
        return this.f24193a.isVisibleToUser();
    }

    public void a(int i10) {
        this.f24193a.addAction(i10);
    }

    public void b(a aVar) {
        this.f24193a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f24218a);
    }

    public void c(View view) {
        this.f24193a.addChild(view);
    }

    public boolean c0(int i10, Bundle bundle) {
        return this.f24193a.performAction(i10, bundle);
    }

    public void d(View view, int i10) {
        this.f24193a.addChild(view, i10);
    }

    public final void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    public boolean e0(a aVar) {
        return this.f24193a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f24218a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f24193a;
        if (accessibilityNodeInfo == null) {
            if (xVar.f24193a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(xVar.f24193a)) {
            return false;
        }
        return this.f24195c == xVar.f24195c && this.f24194b == xVar.f24194b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            f0(view);
            ClickableSpan[] clickableSpanArrR = r(charSequence);
            if (clickableSpanArrR == null || clickableSpanArrR.length <= 0) {
                return;
            }
            v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", e0.c.accessibility_action_clickable_span);
            SparseArray sparseArrayX = x(view);
            for (int i10 = 0; i10 < clickableSpanArrR.length; i10++) {
                int iG = G(clickableSpanArrR[i10], sparseArrayX);
                sparseArrayX.put(iG, new WeakReference(clickableSpanArrR[i10]));
                e(clickableSpanArrR[i10], (Spanned) charSequence, iG);
            }
        }
    }

    public final void f0(View view) {
        SparseArray sparseArrayZ = z(view);
        if (sparseArrayZ != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayZ.size(); i10++) {
                if (((WeakReference) sparseArrayZ.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayZ.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    public final void g() {
        this.f24193a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f24193a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f24193a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f24193a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public void g0(boolean z10) {
        this.f24193a.setAccessibilityFocused(z10);
    }

    public final List h(String str) {
        ArrayList<Integer> integerArrayList = this.f24193a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f24193a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void h0(int i10, boolean z10) {
        Bundle bundleV = v();
        if (bundleV != null) {
            int i11 = bundleV.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleV.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f24193a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f24193a.getActionList();
        if (actionList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void i0(Rect rect) {
        this.f24193a.setBoundsInParent(rect);
    }

    public void j0(Rect rect) {
        this.f24193a.setBoundsInScreen(rect);
    }

    public int k() {
        return this.f24193a.getActions();
    }

    public void k0(boolean z10) {
        this.f24193a.setCheckable(z10);
    }

    public final boolean l(int i10) {
        Bundle bundleV = v();
        return bundleV != null && (bundleV.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public void l0(boolean z10) {
        this.f24193a.setChecked(z10);
    }

    public void m(Rect rect) {
        this.f24193a.getBoundsInParent(rect);
    }

    public void m0(CharSequence charSequence) {
        this.f24193a.setClassName(charSequence);
    }

    public void n(Rect rect) {
        this.f24193a.getBoundsInScreen(rect);
    }

    public void n0(boolean z10) {
        this.f24193a.setClickable(z10);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f24193a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f24193a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0(Object obj) {
        this.f24193a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f24222a);
    }

    public int p() {
        return this.f24193a.getChildCount();
    }

    public void p0(Object obj) {
        this.f24193a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f24223a);
    }

    public CharSequence q() {
        return this.f24193a.getClassName();
    }

    public void q0(CharSequence charSequence) {
        this.f24193a.setContentDescription(charSequence);
    }

    public void r0(boolean z10) {
        this.f24193a.setDismissable(z10);
    }

    public CharSequence s() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f24193a) : this.f24193a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void s0(boolean z10) {
        this.f24193a.setEnabled(z10);
    }

    public CharSequence t() {
        return this.f24193a.getContentDescription();
    }

    public void t0(CharSequence charSequence) {
        this.f24193a.setError(charSequence);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb.append("; boundsInParent: " + rect);
        n(rect);
        sb.append("; boundsInScreen: " + rect);
        o(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(y());
        sb.append("; className: ");
        sb.append(q());
        sb.append("; text: ");
        sb.append(B());
        sb.append("; error: ");
        sb.append(u());
        sb.append("; maxTextLength: ");
        sb.append(w());
        sb.append("; stateDescription: ");
        sb.append(A());
        sb.append("; contentDescription: ");
        sb.append(t());
        sb.append("; tooltipText: ");
        sb.append(C());
        sb.append("; viewIdResName: ");
        sb.append(E());
        sb.append("; uniqueId: ");
        sb.append(D());
        sb.append("; checkable: ");
        sb.append(J());
        sb.append("; checked: ");
        sb.append(K());
        sb.append("; focusable: ");
        sb.append(O());
        sb.append("; focused: ");
        sb.append(P());
        sb.append("; selected: ");
        sb.append(V());
        sb.append("; clickable: ");
        sb.append(L());
        sb.append("; longClickable: ");
        sb.append(S());
        sb.append("; contextClickable: ");
        sb.append(M());
        sb.append("; enabled: ");
        sb.append(N());
        sb.append("; password: ");
        sb.append(T());
        sb.append("; scrollable: " + U());
        sb.append("; containerTitle: ");
        sb.append(s());
        sb.append("; granularScrollingSupported: ");
        sb.append(Q());
        sb.append("; importantForAccessibility: ");
        sb.append(R());
        sb.append("; visible: ");
        sb.append(Y());
        sb.append("; isTextSelectable: ");
        sb.append(X());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(H());
        sb.append("; [");
        List listI = i();
        for (int i10 = 0; i10 < listI.size(); i10++) {
            a aVar = (a) listI.get(i10);
            String strJ = j(aVar.b());
            if (strJ.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strJ = aVar.c().toString();
            }
            sb.append(strJ);
            if (i10 != listI.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return this.f24193a.getError();
    }

    public void u0(boolean z10) {
        this.f24193a.setFocusable(z10);
    }

    public Bundle v() {
        return this.f24193a.getExtras();
    }

    public void v0(boolean z10) {
        this.f24193a.setFocused(z10);
    }

    public int w() {
        return this.f24193a.getMaxTextLength();
    }

    public void w0(boolean z10) {
        h0(67108864, z10);
    }

    public final SparseArray x(View view) {
        SparseArray sparseArrayZ = z(view);
        if (sparseArrayZ != null) {
            return sparseArrayZ;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(e0.c.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    public void x0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f24193a.setHeading(z10);
        } else {
            h0(2, z10);
        }
    }

    public CharSequence y() {
        return this.f24193a.getPackageName();
    }

    public void y0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f24193a.setHintText(charSequence);
        } else {
            this.f24193a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public final SparseArray z(View view) {
        return (SparseArray) view.getTag(e0.c.tag_accessibility_clickable_spans);
    }

    public void z0(View view) {
        this.f24193a.setLabelFor(view);
    }

    public x(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f24193a = accessibilityNodeInfo;
    }

    public void d0() {
    }
}
