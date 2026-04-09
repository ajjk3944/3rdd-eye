package F1;

import F1.C2736a;
import F1.C2755j0;
import G1.t;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import f.AbstractC5487d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import r1.AbstractC7556b;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    private static WeakHashMap f5678a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Field f5679b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5680c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f5681d = {AbstractC7556b.f59978b, AbstractC7556b.f59979c, AbstractC7556b.f59990n, AbstractC7556b.f60001y, AbstractC7556b.f59959B, AbstractC7556b.f59960C, AbstractC7556b.f59961D, AbstractC7556b.f59962E, AbstractC7556b.f59963F, AbstractC7556b.f59964G, AbstractC7556b.f59980d, AbstractC7556b.f59981e, AbstractC7556b.f59982f, AbstractC7556b.f59983g, AbstractC7556b.f59984h, AbstractC7556b.f59985i, AbstractC7556b.f59986j, AbstractC7556b.f59987k, AbstractC7556b.f59988l, AbstractC7556b.f59989m, AbstractC7556b.f59991o, AbstractC7556b.f59992p, AbstractC7556b.f59993q, AbstractC7556b.f59994r, AbstractC7556b.f59995s, AbstractC7556b.f59996t, AbstractC7556b.f59997u, AbstractC7556b.f59998v, AbstractC7556b.f59999w, AbstractC7556b.f60000x, AbstractC7556b.f60002z, AbstractC7556b.f59958A};

    /* renamed from: e, reason: collision with root package name */
    private static final H f5682e = new H() { // from class: F1.V
        @Override // F1.H
        public final C2742d a(C2742d c2742d) {
            return W.U(c2742d);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final e f5683f = new e();

    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return k.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            k.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return m.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            m.c(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F1.W.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakHashMap f5684a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                W.V(view, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f5684a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f5684a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f5684a.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f5685a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f5686b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5687c;

        /* renamed from: d, reason: collision with root package name */
        private final int f5688d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f5687c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f5685a);
            if (this.f5686b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                W.j(view);
                view.setTag(this.f5685a, obj);
                W.V(view, this.f5688d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f5685a = i10;
            this.f5686b = cls;
            this.f5688d = i11;
            this.f5687c = i12;
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            C2780w0 f5689a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f5690b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ F f5691c;

            a(View view, F f10) {
                this.f5690b = view;
                this.f5691c = f10;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C2780w0 c2780w0X = C2780w0.x(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f5690b);
                    if (c2780w0X.equals(this.f5689a)) {
                        return this.f5691c.a(view, c2780w0X).v();
                    }
                }
                this.f5689a = c2780w0X;
                C2780w0 c2780w0A = this.f5691c.a(view, c2780w0X);
                if (i10 >= 30) {
                    return c2780w0A.v();
                }
                W.j0(view);
                return c2780w0A.v();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC7556b.f59976S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static C2780w0 b(View view, C2780w0 c2780w0, Rect rect) {
            WindowInsets windowInsetsV = c2780w0.v();
            if (windowInsetsV != null) {
                return C2780w0.x(view.computeSystemWindowInsets(windowInsetsV, rect), view);
            }
            rect.setEmpty();
            return c2780w0;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getZ();
        }

        static boolean h(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void i(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void j(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void k(View view, float f10) {
            view.setElevation(f10);
        }

        static void l(View view, F f10) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC7556b.f59969L, f10);
            }
            if (f10 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC7556b.f59976S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, f10));
            }
        }

        static void m(View view, String str) {
            view.setTransitionName(str);
        }

        static void n(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static C2780w0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C2780w0 c2780w0W = C2780w0.w(rootWindowInsets);
            c2780w0W.t(c2780w0W);
            c2780w0W.d(view.getRootView());
            return c2780w0W;
        }

        static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    static class j {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    static class k {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    private static class l {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static class m {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static V0 b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return V0.d(windowInsetsController);
            }
            return null;
        }

        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C2742d b(View view, C2742d c2742d) {
            ContentInfo contentInfoF = c2742d.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c2742d : C2742d.g(contentInfoPerformReceiveContent);
        }
    }

    static class o {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList f5692d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap f5693a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f5694b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference f5695c = null;

        o() {
        }

        static o a(View view) {
            int i10 = AbstractC7556b.f59974Q;
            o oVar = (o) view.getTag(i10);
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o();
            view.setTag(i10, oVar2);
            return oVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f5693a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f5694b == null) {
                this.f5694b = new SparseArray();
            }
            return this.f5694b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC7556b.f59975R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            AbstractC5487d.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f5693a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f5692d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f5693a == null) {
                        this.f5693a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f5692d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f5693a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f5693a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f5695c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f5695c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        return view.getMinimumHeight();
    }

    public static void A0(View view, boolean z10) {
        l0().f(view, Boolean.valueOf(z10));
    }

    public static int B(View view) {
        return view.getMinimumWidth();
    }

    public static void B0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(AbstractC7556b.f59971N);
    }

    public static void C0(View view, String str) {
        h.m(view, str);
    }

    public static int D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, C2755j0.b bVar) {
        C2755j0.d(view, bVar);
    }

    public static int E(View view) {
        return view.getPaddingStart();
    }

    private static f E0() {
        return new c(AbstractC7556b.f59973P, CharSequence.class, 64, 30);
    }

    public static C2780w0 F(View view) {
        return i.a(view);
    }

    public static void F0(View view) {
        h.n(view);
    }

    public static CharSequence G(View view) {
        return (CharSequence) E0().e(view);
    }

    public static String H(View view) {
        return h.f(view);
    }

    public static V0 I(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return AbstractC2753i0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static int J(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float K(View view) {
        return h.g(view);
    }

    public static boolean L(View view) {
        return m(view) != null;
    }

    public static boolean M(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean N(View view) {
        return view.hasTransientState();
    }

    public static boolean O(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean P(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean Q(View view) {
        return view.isLaidOut();
    }

    public static boolean R(View view) {
        return h.h(view);
    }

    public static boolean S(View view) {
        return view.isPaddingRelative();
    }

    public static boolean T(View view) {
        Boolean bool = (Boolean) l0().e(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C2742d U(C2742d c2742d) {
        return c2742d;
    }

    static void V(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(o(view));
                    v0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void W(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void X(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static C2780w0 Y(View view, C2780w0 c2780w0) {
        WindowInsets windowInsetsV = c2780w0.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsV);
            if (!windowInsetsB.equals(windowInsetsV)) {
                return C2780w0.x(windowInsetsB, view);
            }
        }
        return c2780w0;
    }

    public static void Z(View view, G1.t tVar) {
        view.onInitializeAccessibilityNodeInfo(tVar.U0());
    }

    private static f a0() {
        return new b(AbstractC7556b.f59968K, CharSequence.class, 8, 28);
    }

    private static f b() {
        return new d(AbstractC7556b.f59967J, Boolean.class, 28);
    }

    public static boolean b0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static int c(View view, CharSequence charSequence, G1.w wVar) {
        int iQ = q(view, charSequence);
        if (iQ != -1) {
            d(view, new t.a(iQ, charSequence, wVar));
        }
        return iQ;
    }

    public static C2742d c0(View view, C2742d c2742d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c2742d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, c2742d);
        }
        G g10 = (G) view.getTag(AbstractC7556b.f59970M);
        if (g10 == null) {
            return v(view).a(c2742d);
        }
        C2742d c2742dA = g10.a(view, c2742d);
        if (c2742dA == null) {
            return null;
        }
        return v(view).a(c2742dA);
    }

    private static void d(View view, t.a aVar) {
        j(view);
        h0(aVar.b(), view);
        p(view).add(aVar);
        V(view, 0);
    }

    public static void d0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static C2745e0 e(View view) {
        if (f5678a == null) {
            f5678a = new WeakHashMap();
        }
        C2745e0 c2745e0 = (C2745e0) f5678a.get(view);
        if (c2745e0 != null) {
            return c2745e0;
        }
        C2745e0 c2745e02 = new C2745e0(view);
        f5678a.put(view, c2745e02);
        return c2745e02;
    }

    public static void e0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static C2780w0 f(View view, C2780w0 c2780w0, Rect rect) {
        return h.b(view, c2780w0, rect);
    }

    public static void f0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static C2780w0 g(View view, C2780w0 c2780w0) {
        WindowInsets windowInsetsV = c2780w0.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsV);
            if (!windowInsetsA.equals(windowInsetsV)) {
                return C2780w0.x(windowInsetsA, view);
            }
        }
        return c2780w0;
    }

    public static void g0(View view, int i10) {
        h0(i10, view);
        V(view, 0);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.a(view).b(view, keyEvent);
    }

    private static void h0(int i10, View view) {
        List listP = p(view);
        for (int i11 = 0; i11 < listP.size(); i11++) {
            if (((t.a) listP.get(i11)).b() == i10) {
                listP.remove(i11);
                return;
            }
        }
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.a(view).f(keyEvent);
    }

    public static void i0(View view, t.a aVar, CharSequence charSequence, G1.w wVar) {
        if (wVar == null && charSequence == null) {
            g0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, wVar));
        }
    }

    static void j(View view) {
        C2736a c2736aL = l(view);
        if (c2736aL == null) {
            c2736aL = new C2736a();
        }
        m0(view, c2736aL);
    }

    public static void j0(View view) {
        g.c(view);
    }

    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static C2736a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof C2736a.C0234a ? ((C2736a.C0234a) accessibilityDelegateM).f5701a : new C2736a(accessibilityDelegateM);
    }

    private static f l0() {
        return new a(AbstractC7556b.f59972O, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : n(view);
    }

    public static void m0(View view, C2736a c2736a) {
        if (c2736a == null && (m(view) instanceof C2736a.C0234a)) {
            c2736a = new C2736a();
        }
        v0(view);
        view.setAccessibilityDelegate(c2736a == null ? null : c2736a.d());
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f5680c) {
            return null;
        }
        if (f5679b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5679b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5680c = true;
                return null;
            }
        }
        try {
            Object obj = f5679b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f5680c = true;
            return null;
        }
    }

    public static void n0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    public static CharSequence o(View view) {
        return (CharSequence) a0().e(view);
    }

    public static void o0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    private static List p(View view) {
        int i10 = AbstractC7556b.f59965H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, CharSequence charSequence) {
        a0().f(view, charSequence);
        if (charSequence != null) {
            f5683f.a(view);
        } else {
            f5683f.d(view);
        }
    }

    private static int q(View view, CharSequence charSequence) {
        List listP = p(view);
        for (int i10 = 0; i10 < listP.size(); i10++) {
            if (TextUtils.equals(charSequence, ((t.a) listP.get(i10)).c())) {
                return ((t.a) listP.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f5681d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listP.size(); i14++) {
                z10 &= ((t.a) listP.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void q0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    public static void r0(View view, ColorStateList colorStateList) {
        h.i(view, colorStateList);
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, PorterDuff.Mode mode) {
        h.j(view, mode);
    }

    public static Display t(View view) {
        return view.getDisplay();
    }

    public static void t0(View view, float f10) {
        h.k(view, f10);
    }

    public static float u(View view) {
        return h.e(view);
    }

    public static void u0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static H v(View view) {
        return view instanceof H ? (H) view : f5682e;
    }

    private static void v0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static boolean w(View view) {
        return view.getFitsSystemWindows();
    }

    public static void w0(View view, int i10) {
        j.b(view, i10);
    }

    public static int x(View view) {
        return view.getImportantForAccessibility();
    }

    public static void x0(View view, int i10) {
        view.setLabelFor(i10);
    }

    public static int y(View view) {
        return j.a(view);
    }

    public static void y0(View view, F f10) {
        h.l(view, f10);
    }

    public static int z(View view) {
        return view.getLayoutDirection();
    }

    public static void z0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }
}
