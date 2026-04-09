package L0;

import L0.C0770a;
import L0.C0773d;
import L0.X;
import M0.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.C5316i;
import o.C5391i;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, S> f3792a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f3793b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3794c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3795d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final D f3796e = new D();

    /* renamed from: f, reason: collision with root package name */
    public static final a f3797f = new a();

    /* compiled from: ViewCompat.java */
    public static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f3799a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<T> f3800b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3801c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3802d;

        public b(int i, Class<T> cls, int i10, int i11) {
            this.f3799a = i;
            this.f3800b = cls;
            this.f3802d = i10;
            this.f3801c = i11;
        }

        public abstract T a(View view);

        public abstract void b(View view, T t10);

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(View view, T t10) {
            Object tag;
            if (Build.VERSION.SDK_INT >= this.f3801c) {
                b(view, t10);
                return;
            }
            if (Build.VERSION.SDK_INT >= this.f3801c) {
                tag = a(view);
            } else {
                tag = view.getTag(this.f3799a);
                if (!this.f3800b.isInstance(tag)) {
                    tag = null;
                }
            }
            if (d(tag, t10)) {
                C0770a c0770aD = I.d(view);
                if (c0770aD == null) {
                    c0770aD = new C0770a();
                }
                I.o(view, c0770aD);
                view.setTag(this.f3799a, t10);
                I.i(this.f3802d, view);
            }
        }

        public abstract boolean d(T t10, T t11);
    }

    /* compiled from: ViewCompat.java */
    public static class c {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    public static class d {

        /* compiled from: ViewCompat.java */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public X f3803a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f3804b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0788t f3805c;

            public a(View view, InterfaceC0788t interfaceC0788t) {
                this.f3804b = view;
                this.f3805c = interfaceC0788t;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                X xH = X.h(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                InterfaceC0788t interfaceC0788t = this.f3805c;
                if (i < 30) {
                    d.a(windowInsets, this.f3804b);
                    if (xH.equals(this.f3803a)) {
                        return interfaceC0788t.d(view, xH).g();
                    }
                }
                this.f3803a = xH;
                X xD = interfaceC0788t.d(view, xH);
                if (i >= 30) {
                    return xD.g();
                }
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                c.c(view);
                return xD.g();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static X b(View view, X x10, Rect rect) {
            WindowInsets windowInsetsG = x10.g();
            if (windowInsetsG != null) {
                return X.h(view, view.computeSystemWindowInsets(windowInsetsG, rect));
            }
            rect.setEmpty();
            return x10;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i, int i10, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i10, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i10, int i11, int i12, int[] iArr) {
            return view.dispatchNestedScroll(i, i10, i11, i12, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static X j(View view) throws IllegalAccessException, IllegalArgumentException {
            if (!X.a.f3854d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = X.a.f3851a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) X.a.f3852b.get(obj);
                Rect rect2 = (Rect) X.a.f3853c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                int i = Build.VERSION.SDK_INT;
                X.e dVar = i >= 30 ? new X.d() : i >= 29 ? new X.c() : new X.b();
                dVar.e(C0.e.b(rect.left, rect.top, rect.right, rect.bottom));
                dVar.g(C0.e.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                X xB = dVar.b();
                xB.f3850a.p(xB);
                xB.f3850a.d(view.getRootView());
                return xB;
            } catch (IllegalAccessException e4) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
                return null;
            }
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, InterfaceC0788t interfaceC0788t) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, interfaceC0788t);
            }
            if (interfaceC0788t == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC0788t));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    public static class e {
        public static X a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            X xH = X.h(null, rootWindowInsets);
            X.k kVar = xH.f3850a;
            kVar.p(xH);
            kVar.d(view.getRootView());
            return xH;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(View view, int i, int i10) {
            view.setScrollIndicators(i, i10);
        }
    }

    /* compiled from: ViewCompat.java */
    public static class f {
        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void n(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    public static class g {
        public static void a(View view, final l lVar) {
            C5316i c5316i = (C5316i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (c5316i == null) {
                c5316i = new C5316i();
                view.setTag(R.id.tag_unhandled_key_listeners, c5316i);
            }
            Objects.requireNonNull(lVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: L0.J
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return lVar.a();
                }
            };
            c5316i.put(lVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, l lVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C5316i c5316i = (C5316i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (c5316i == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c5316i.get(lVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, O0.a aVar) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* compiled from: ViewCompat.java */
    public static class h {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i10) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i10);
        }

        public static void e(View view, P0.a aVar) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat.java */
    public static class i {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        public static void d(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    public static final class j {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C0773d b(View view, C0773d c0773d) {
            ContentInfo contentInfoD = c0773d.f3889a.d();
            Objects.requireNonNull(contentInfoD);
            ContentInfo contentInfoJ = I0.f.j(contentInfoD);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoJ);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoJ ? c0773d : new C0773d(new C0773d.C0069d(contentInfoPerformReceiveContent));
        }

        public static void c(View view, String[] strArr, InterfaceC0789u interfaceC0789u) {
            if (interfaceC0789u == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new k(interfaceC0789u));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    public static final class k implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0789u f3806a;

        public k(InterfaceC0789u interfaceC0789u) {
            this.f3806a = interfaceC0789u;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0773d c0773d = new C0773d(new C0773d.C0069d(contentInfo));
            C0773d c0773dA = this.f3806a.a(view, c0773d);
            if (c0773dA == null) {
                return null;
            }
            if (c0773dA == c0773d) {
                return contentInfo;
            }
            ContentInfo contentInfoD = c0773dA.f3889a.d();
            Objects.requireNonNull(contentInfoD);
            return I0.f.j(contentInfoD);
        }
    }

    /* compiled from: ViewCompat.java */
    public interface l {
        boolean a();
    }

    /* compiled from: ViewCompat.java */
    public static class m {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f3807d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f3808a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f3809b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f3810c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((l) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3808a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    @Deprecated
    public static S a(View view) {
        if (f3792a == null) {
            f3792a = new WeakHashMap<>();
        }
        S s10 = f3792a.get(view);
        if (s10 != null) {
            return s10;
        }
        S s11 = new S(view);
        f3792a.put(view, s11);
        return s11;
    }

    public static X b(View view, X x10) {
        WindowInsets windowInsetsG = x10.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = c.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return X.h(view, windowInsetsA);
            }
        }
        return x10;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = m.f3807d;
        m mVar = (m) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (mVar == null) {
            mVar = new m();
            view.setTag(R.id.tag_unhandled_key_event_manager, mVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = mVar.f3808a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = m.f3807d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (mVar.f3808a == null) {
                            mVar.f3808a = new WeakHashMap<>();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList<WeakReference<View>> arrayList3 = m.f3807d;
                            View view2 = arrayList3.get(size).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                mVar.f3808a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    mVar.f3808a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = mVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (mVar.f3809b == null) {
                    mVar.f3809b = new SparseArray<>();
                }
                mVar.f3809b.put(keyCode, new WeakReference<>(viewA));
            }
        }
        return viewA != null;
    }

    public static C0770a d(View view) {
        View.AccessibilityDelegate accessibilityDelegateE = e(view);
        if (accessibilityDelegateE == null) {
            return null;
        }
        return accessibilityDelegateE instanceof C0770a.C0068a ? ((C0770a.C0068a) accessibilityDelegateE).f3885a : new C0770a(accessibilityDelegateE);
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h.a(view);
        }
        if (f3794c) {
            return null;
        }
        if (f3793b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3793b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3794c = true;
                return null;
            }
        }
        try {
            Object obj = f3793b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3794c = true;
            return null;
        }
    }

    public static CharSequence f(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = g.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] h(C5391i c5391i) {
        return Build.VERSION.SDK_INT >= 31 ? j.a(c5391i) : (String[]) c5391i.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void i(int i10, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = f(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(f(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e4) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static X j(View view, X x10) {
        WindowInsets windowInsetsG = x10.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = c.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return X.h(view, windowInsetsB);
            }
        }
        return x10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0773d k(View view, C0773d c0773d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0773d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return j.b(view, c0773d);
        }
        InterfaceC0789u interfaceC0789u = (InterfaceC0789u) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0790v interfaceC0790v = f3796e;
        if (interfaceC0789u == null) {
            if (view instanceof InterfaceC0790v) {
                interfaceC0790v = (InterfaceC0790v) view;
            }
            return interfaceC0790v.a(c0773d);
        }
        C0773d c0773dA = interfaceC0789u.a(view, c0773d);
        if (c0773dA == null) {
            return null;
        }
        if (view instanceof InterfaceC0790v) {
            interfaceC0790v = (InterfaceC0790v) view;
        }
        return interfaceC0790v.a(c0773dA);
    }

    public static void l(int i10, View view) {
        ArrayList arrayListG = g(view);
        for (int i11 = 0; i11 < arrayListG.size(); i11++) {
            if (((g.a) arrayListG.get(i11)).a() == i10) {
                arrayListG.remove(i11);
                return;
            }
        }
    }

    public static void m(View view, g.a aVar, M0.i iVar) {
        g.a aVar2 = new g.a(null, aVar.f4133b, null, iVar, aVar.f4134c);
        C0770a c0770aD = d(view);
        if (c0770aD == null) {
            c0770aD = new C0770a();
        }
        o(view, c0770aD);
        l(aVar2.a(), view);
        g(view).add(aVar2);
        i(0, view);
    }

    public static void n(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            h.d(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void o(View view, C0770a c0770a) {
        if (c0770a == null && (e(view) instanceof C0770a.C0068a)) {
            c0770a = new C0770a();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0770a == null ? null : c0770a.f3884b);
    }

    public static void p(View view, CharSequence charSequence) {
        new F(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view, charSequence);
        a aVar = f3797f;
        if (charSequence == null) {
            aVar.f3798b.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        } else {
            aVar.f3798b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }

    /* compiled from: ViewCompat.java */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f3798b = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f3798b.entrySet()) {
                    View key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
                    if (zBooleanValue != z10) {
                        I.i(z10 ? 16 : 32, key);
                        entry.setValue(Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
