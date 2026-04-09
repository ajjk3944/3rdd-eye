package a0;

import a0.a;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    private static Field f218b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f219c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f220d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f221e;

    /* renamed from: f, reason: collision with root package name */
    private static WeakHashMap<View, String> f222f;

    /* renamed from: h, reason: collision with root package name */
    private static Field f224h;

    /* renamed from: j, reason: collision with root package name */
    private static ThreadLocal<Rect> f226j;

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f217a = new AtomicInteger(1);

    /* renamed from: g, reason: collision with root package name */
    private static WeakHashMap<View, w> f223g = null;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f225i = false;

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f227k = {p.b.f3059b, p.b.f3060c, p.b.f3071n, p.b.f3082y, p.b.B, p.b.C, p.b.D, p.b.E, p.b.F, p.b.G, p.b.f3061d, p.b.f3062e, p.b.f3063f, p.b.f3064g, p.b.f3065h, p.b.f3066i, p.b.f3067j, p.b.f3068k, p.b.f3069l, p.b.f3070m, p.b.f3072o, p.b.f3073p, p.b.f3074q, p.b.f3075r, p.b.f3076s, p.b.f3077t, p.b.f3078u, p.b.f3079v, p.b.f3080w, p.b.f3081x, p.b.f3083z, p.b.A};

    /* renamed from: l, reason: collision with root package name */
    private static e f228l = new e();

    class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f229a;

        a(p pVar) {
            this.f229a = pVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.f229a.a(view, a0.l(windowInsets)).k();
        }
    }

    class b extends f<Boolean> {
        b(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a0.s.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }
    }

    class c extends f<CharSequence> {
        c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a0.s.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return view.getAccessibilityPaneTitle();
        }
    }

    class d extends f<Boolean> {
        d(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a0.s.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f230b = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z2) {
            boolean z3 = view.getVisibility() == 0;
            if (z2 != z3) {
                if (z3) {
                    s.F(view, 16);
                }
                this.f230b.put(view, Boolean.valueOf(z3));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.f230b.entrySet()) {
                a(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f231a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f232b;

        /* renamed from: c, reason: collision with root package name */
        private final int f233c;

        f(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        f(int i2, Class<T> cls, int i3, int i4) {
            this.f231a = i2;
            this.f232b = cls;
            this.f233c = i4;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f233c;
        }

        abstract T c(View view);

        T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T t2 = (T) view.getTag(this.f231a);
            if (this.f232b.isInstance(t2)) {
                return t2;
            }
            return null;
        }
    }

    private static class g {
        static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public interface h {
        boolean a(View view, KeyEvent keyEvent);
    }

    static class i {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f234d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f235a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f236b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f237c = null;

        i() {
        }

        static i a(View view) {
            int i2 = p.b.N;
            i iVar = (i) view.getTag(i2);
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i();
            view.setTag(i2, iVar2);
            return iVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f235a;
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

        private SparseArray<WeakReference<View>> d() {
            if (this.f236b == null) {
                this.f236b = new SparseArray<>();
            }
            return this.f236b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(p.b.O);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((h) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f235a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f234d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f235a == null) {
                    this.f235a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f234d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f235a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f235a.put((View) parent, Boolean.TRUE);
                        }
                    }
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
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f237c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f237c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && s.C(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static boolean A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean B(View view) {
        Boolean boolD = a().d(view);
        if (boolD == null) {
            return false;
        }
        return boolD.booleanValue();
    }

    public static boolean C(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    public static boolean D(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean E(View view) {
        Boolean boolD = P().d(view);
        if (boolD == null) {
            return false;
        }
        return boolD.booleanValue();
    }

    static void F(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z2 = l(view) != null;
            if (k(view) != 0 || (z2 && view.getVisibility() == 0)) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void G(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        if (i3 < 21) {
            c(view, i2);
            return;
        }
        Rect rectP = p();
        boolean z2 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectP.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !rectP.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        c(view, i2);
        if (z2 && rectP.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectP);
        }
    }

    public static void H(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        if (i3 < 21) {
            d(view, i2);
            return;
        }
        Rect rectP = p();
        boolean z2 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectP.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !rectP.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        d(view, i2);
        if (z2 && rectP.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectP);
        }
    }

    public static a0 I(View view, a0 a0Var) {
        WindowInsets windowInsetsK;
        if (Build.VERSION.SDK_INT >= 21 && (windowInsetsK = a0Var.k()) != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsK);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsK)) {
                return a0.l(windowInsetsOnApplyWindowInsets);
            }
        }
        return a0Var;
    }

    private static f<CharSequence> J() {
        return new c(p.b.K, CharSequence.class, 8, 28);
    }

    public static void K(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void L(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void M(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static void N(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static void O(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            g.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    private static f<Boolean> P() {
        return new b(p.b.L, Boolean.class, 28);
    }

    public static void Q(View view, a0.a aVar) {
        if (aVar == null && (i(view) instanceof a.C0000a)) {
            aVar = new a0.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void R(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void S(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof r) {
                ((r) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z2 = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z2) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void T(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof r) {
                ((r) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        view.setBackgroundTintMode(mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z2 = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z2) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static void U(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static void V(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 19) {
            if (i3 < 16) {
                return;
            }
            if (i2 == 4) {
                i2 = 2;
            }
        }
        view.setImportantForAccessibility(i2);
    }

    public static void W(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    public static void X(View view, p pVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(pVar));
            }
        }
    }

    public static void Y(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static void Z(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f222f == null) {
            f222f = new WeakHashMap<>();
        }
        f222f.put(view, str);
    }

    private static f<Boolean> a() {
        return new d(p.b.J, Boolean.class, 28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof j) {
            ((j) view).stopNestedScroll();
        }
    }

    public static w b(View view) {
        if (f223g == null) {
            f223g = new WeakHashMap<>();
        }
        w wVar = f223g.get(view);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(view);
        f223g.put(view, wVar2);
        return wVar2;
    }

    private static void b0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    private static void c(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            b0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                b0((View) parent);
            }
        }
    }

    private static void d(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            b0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                b0((View) parent);
            }
        }
    }

    public static a0 e(View view, a0 a0Var) {
        WindowInsets windowInsetsK;
        return (Build.VERSION.SDK_INT < 21 || (windowInsetsK = a0Var.k()) == null || view.dispatchApplyWindowInsets(windowInsetsK).equals(windowInsetsK)) ? a0Var : a0.l(windowInsetsK);
    }

    static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return i.a(view).b(view, keyEvent);
    }

    static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return i.a(view).f(keyEvent);
    }

    public static a0.a h(View view) {
        View.AccessibilityDelegate accessibilityDelegateI = i(view);
        if (accessibilityDelegateI == null) {
            return null;
        }
        return accessibilityDelegateI instanceof a.C0000a ? ((a.C0000a) accessibilityDelegateI).f179a : new a0.a(accessibilityDelegateI);
    }

    private static View.AccessibilityDelegate i(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : j(view);
    }

    private static View.AccessibilityDelegate j(View view) {
        if (f225i) {
            return null;
        }
        if (f224h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f224h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f225i = true;
                return null;
            }
        }
        try {
            Object obj = f224h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f225i = true;
            return null;
        }
    }

    public static int k(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static CharSequence l(View view) {
        return J().d(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ColorStateList m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof r) {
            return ((r) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PorterDuff.Mode n(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof r) {
            return ((r) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static Display o(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (C(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    private static Rect p() {
        if (f226j == null) {
            f226j = new ThreadLocal<>();
        }
        Rect rect = f226j.get();
        if (rect == null) {
            rect = new Rect();
            f226j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static int r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    public static int s(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static int t(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int u(View view) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f221e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f220d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f221e = true;
        }
        Field field = f220d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int v(View view) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f219c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f218b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f219c = true;
        }
        Field field = f218b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static String w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f222f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int x(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static float y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean z(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }
}
