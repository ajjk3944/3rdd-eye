package b0;

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
import b0.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static int f2410d;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f2411a;

    /* renamed from: b, reason: collision with root package name */
    public int f2412b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f2413c = -1;

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

        /* renamed from: e, reason: collision with root package name */
        public static final a f2414e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f2415f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f2416g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f2417h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f2418i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f2419j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f2420k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f2421l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f2422m = new a(256, null, f.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f2423n = new a(512, null, f.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f2424o = new a(1024, null, f.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f2425p = new a(2048, null, f.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f2426q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f2427r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f2428s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f2429t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f2430u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f2431v = new a(131072, null, f.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f2432w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f2433x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f2434y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f2435z = new a(2097152, null, f.h.class);

        /* renamed from: a, reason: collision with root package name */
        final Object f2436a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2437b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<? extends f.a> f2438c;

        /* renamed from: d, reason: collision with root package name */
        protected final f f2439d;

        static {
            int i2 = Build.VERSION.SDK_INT;
            A = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, f.e.class);
            C = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, f.C0023f.class);
            M = new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, f.d.class);
            N = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f2437b = i2;
            this.f2439d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.f2436a = obj;
            this.f2438c = cls;
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2436a).getId();
            }
            return 0;
        }

        public CharSequence b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2436a).getLabel();
            }
            return null;
        }

        public boolean c(View view, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (this.f2439d == null) {
                return false;
            }
            f.a aVar = null;
            Class<? extends f.a> cls = this.f2438c;
            if (cls != null) {
                try {
                    f.a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e2) {
                        e = e2;
                        aVar = aVarNewInstance;
                        Class<? extends f.a> cls2 = this.f2438c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        return this.f2439d.a(view, aVar);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            return this.f2439d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f2436a;
            Object obj3 = ((a) obj).f2436a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f2436a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final Object f2440a;

        b(Object obj) {
            this.f2440a = obj;
        }

        public static b a(int i2, int i3, boolean z2, int i4) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2, i4)) : i5 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2)) : new b(null);
        }
    }

    /* renamed from: b0.c$c, reason: collision with other inner class name */
    public static class C0022c {

        /* renamed from: a, reason: collision with root package name */
        final Object f2441a;

        C0022c(Object obj) {
            this.f2441a = obj;
        }

        public static C0022c a(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
            int i6 = Build.VERSION.SDK_INT;
            return i6 >= 21 ? new C0022c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2, z3)) : i6 >= 19 ? new C0022c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2)) : new C0022c(null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2411a = accessibilityNodeInfo;
    }

    private void H(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayR = r(view);
        if (sparseArrayR != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < sparseArrayR.size(); i2++) {
                if (sparseArrayR.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                sparseArrayR.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void I(int i2, boolean z2) {
        Bundle bundleO = o();
        if (bundleO != null) {
            int i3 = bundleO.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i2 ^ (-1));
            if (!z2) {
                i2 = 0;
            }
            bundleO.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    public static c R(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private void c(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
    }

    private void e() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2411a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f2411a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f2411a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f2411a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> f(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f2411a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2411a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String h(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
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
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
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
            default:
                switch (i2) {
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
                        switch (i2) {
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
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] m(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> p(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayR = r(view);
        if (sparseArrayR != null) {
            return sparseArrayR;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(p.b.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> r(View view) {
        return (SparseArray) view.getTag(p.b.I);
    }

    private boolean u() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int v(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f2410d;
        f2410d = i3 + 1;
        return i3;
    }

    public boolean A() {
        return this.f2411a.isFocusable();
    }

    public boolean B() {
        return this.f2411a.isFocused();
    }

    public boolean C() {
        return this.f2411a.isLongClickable();
    }

    public boolean D() {
        return this.f2411a.isPassword();
    }

    public boolean E() {
        return this.f2411a.isScrollable();
    }

    public boolean F() {
        return this.f2411a.isSelected();
    }

    public boolean G(int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2411a.performAction(i2, bundle);
        }
        return false;
    }

    public void J(CharSequence charSequence) {
        this.f2411a.setClassName(charSequence);
    }

    public void K(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2411a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f2440a);
        }
    }

    public void L(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2411a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0022c) obj).f2441a);
        }
    }

    public void M(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2411a.setHeading(z2);
        } else {
            I(2, z2);
        }
    }

    public void N(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.f2411a.setPaneTitle(charSequence);
        } else if (i2 >= 19) {
            this.f2411a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void O(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2411a.setScreenReaderFocusable(z2);
        } else {
            I(1, z2);
        }
    }

    public void P(boolean z2) {
        this.f2411a.setScrollable(z2);
    }

    public AccessibilityNodeInfo Q() {
        return this.f2411a;
    }

    public void a(int i2) {
        this.f2411a.addAction(i2);
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2411a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2436a);
        }
    }

    public void d(CharSequence charSequence, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19 || i2 >= 26) {
            return;
        }
        e();
        H(view);
        ClickableSpan[] clickableSpanArrM = m(charSequence);
        if (clickableSpanArrM == null || clickableSpanArrM.length <= 0) {
            return;
        }
        o().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", p.b.f3058a);
        SparseArray<WeakReference<ClickableSpan>> sparseArrayP = p(view);
        for (int i3 = 0; i3 < clickableSpanArrM.length; i3++) {
            int iV = v(clickableSpanArrM[i3], sparseArrayP);
            sparseArrayP.put(iV, new WeakReference<>(clickableSpanArrM[i3]));
            c(clickableSpanArrM[i3], (Spanned) charSequence, iV);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2411a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f2411a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f2411a)) {
            return false;
        }
        return this.f2413c == cVar.f2413c && this.f2412b == cVar.f2412b;
    }

    public List<a> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f2411a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2411a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public int i() {
        return this.f2411a.getActions();
    }

    @Deprecated
    public void j(Rect rect) {
        this.f2411a.getBoundsInParent(rect);
    }

    public void k(Rect rect) {
        this.f2411a.getBoundsInScreen(rect);
    }

    public CharSequence l() {
        return this.f2411a.getClassName();
    }

    public CharSequence n() {
        return this.f2411a.getContentDescription();
    }

    public Bundle o() {
        return Build.VERSION.SDK_INT >= 19 ? this.f2411a.getExtras() : new Bundle();
    }

    public CharSequence q() {
        return this.f2411a.getPackageName();
    }

    public CharSequence s() {
        if (!u()) {
            return this.f2411a.getText();
        }
        List<Integer> listF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2411a.getText(), 0, this.f2411a.getText().length()));
        for (int i2 = 0; i2 < listF.size(); i2++) {
            spannableString.setSpan(new b0.a(listF4.get(i2).intValue(), this, o().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listF.get(i2).intValue(), listF2.get(i2).intValue(), listF3.get(i2).intValue());
        }
        return spannableString;
    }

    public String t() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f2411a.getViewIdResourceName();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb.append("; boundsInParent: " + rect);
        k(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(q());
        sb.append("; className: ");
        sb.append(l());
        sb.append("; text: ");
        sb.append(s());
        sb.append("; contentDescription: ");
        sb.append(n());
        sb.append("; viewId: ");
        sb.append(t());
        sb.append("; checkable: ");
        sb.append(w());
        sb.append("; checked: ");
        sb.append(x());
        sb.append("; focusable: ");
        sb.append(A());
        sb.append("; focused: ");
        sb.append(B());
        sb.append("; selected: ");
        sb.append(F());
        sb.append("; clickable: ");
        sb.append(y());
        sb.append("; longClickable: ");
        sb.append(C());
        sb.append("; enabled: ");
        sb.append(z());
        sb.append("; password: ");
        sb.append(D());
        sb.append("; scrollable: " + E());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> listG = g();
            for (int i2 = 0; i2 < listG.size(); i2++) {
                a aVar = listG.get(i2);
                String strH = h(aVar.a());
                if (strH.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                    strH = aVar.b().toString();
                }
                sb.append(strH);
                if (i2 != listG.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int i3 = i();
            while (i3 != 0) {
                int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i3);
                i3 &= iNumberOfTrailingZeros ^ (-1);
                sb.append(h(iNumberOfTrailingZeros));
                if (i3 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean w() {
        return this.f2411a.isCheckable();
    }

    public boolean x() {
        return this.f2411a.isChecked();
    }

    public boolean y() {
        return this.f2411a.isClickable();
    }

    public boolean z() {
        return this.f2411a.isEnabled();
    }
}
