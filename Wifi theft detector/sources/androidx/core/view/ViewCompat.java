package androidx.core.view;

import android.app.Activity;
import android.content.ClipData;
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
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xbill.DNS.KEYRecord;
import s0.x;

/* loaded from: classes.dex */
public abstract class ViewCompat {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2612a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2613b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2614c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2615d = {e0.c.accessibility_custom_action_0, e0.c.accessibility_custom_action_1, e0.c.accessibility_custom_action_2, e0.c.accessibility_custom_action_3, e0.c.accessibility_custom_action_4, e0.c.accessibility_custom_action_5, e0.c.accessibility_custom_action_6, e0.c.accessibility_custom_action_7, e0.c.accessibility_custom_action_8, e0.c.accessibility_custom_action_9, e0.c.accessibility_custom_action_10, e0.c.accessibility_custom_action_11, e0.c.accessibility_custom_action_12, e0.c.accessibility_custom_action_13, e0.c.accessibility_custom_action_14, e0.c.accessibility_custom_action_15, e0.c.accessibility_custom_action_16, e0.c.accessibility_custom_action_17, e0.c.accessibility_custom_action_18, e0.c.accessibility_custom_action_19, e0.c.accessibility_custom_action_20, e0.c.accessibility_custom_action_21, e0.c.accessibility_custom_action_22, e0.c.accessibility_custom_action_23, e0.c.accessibility_custom_action_24, e0.c.accessibility_custom_action_25, e0.c.accessibility_custom_action_26, e0.c.accessibility_custom_action_27, e0.c.accessibility_custom_action_28, e0.c.accessibility_custom_action_29, e0.c.accessibility_custom_action_30, e0.c.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final i0 f2616e = new i0() { // from class: androidx.core.view.y0
        @Override // androidx.core.view.i0
        public final ContentInfoCompat a(ContentInfoCompat contentInfoCompat) {
            return ViewCompat.a(contentInfoCompat);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final e f2617f = new e();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NestedScrollType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollIndicators {
    }

    public class a extends f {
        public a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.d(view));
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.j(view, bool.booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class b extends f {
        public b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.b(view);
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.h(view, charSequence);
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class c extends f {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.f(view, charSequence);
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends f {
        public d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakHashMap f2618a = new WeakHashMap();

        public void a(View view) {
            this.f2618a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        public final void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                ViewCompat.S(view, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.f2618a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f2618a.entrySet().iterator();
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

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f2619a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f2620b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2621c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2622d;

        public f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f2621c;
        }

        public abstract Object c(View view);

        public abstract void d(View view, Object obj);

        public Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f2619a);
            if (this.f2620b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                ViewCompat.j(view);
                view.setTag(this.f2619a, obj);
                ViewCompat.S(view, this.f2622d);
            }
        }

        public abstract boolean g(Object obj, Object obj2);

        public f(int i10, Class cls, int i11, int i12) {
            this.f2619a = i10;
            this.f2620b = cls;
            this.f2622d = i11;
            this.f2621c = i12;
        }
    }

    public static class g {
        @DoNotInline
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class h {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public WindowInsetsCompat f2623a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f2624b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g0 f2625c;

            public a(View view, g0 g0Var) {
                this.f2624b = view;
                this.f2625c = g0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompatX = WindowInsetsCompat.x(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f2624b);
                    if (windowInsetsCompatX.equals(this.f2623a)) {
                        return this.f2625c.a(view, windowInsetsCompatX).v();
                    }
                }
                this.f2623a = windowInsetsCompatX;
                WindowInsetsCompat windowInsetsCompatA = this.f2625c.a(view, windowInsetsCompatX);
                if (i10 >= 30) {
                    return windowInsetsCompatA.v();
                }
                ViewCompat.g0(view);
                return windowInsetsCompatA.v();
            }
        }

        @DoNotInline
        public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(e0.c.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        public static WindowInsetsCompat b(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets windowInsetsV = windowInsetsCompat.v();
            if (windowInsetsV != null) {
                return WindowInsetsCompat.x(view.computeSystemWindowInsets(windowInsetsV, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        @DoNotInline
        public static boolean c(@NonNull View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        @DoNotInline
        public static boolean d(@NonNull View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        @DoNotInline
        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        @DoNotInline
        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        @DoNotInline
        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        @DoNotInline
        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        @DoNotInline
        public static float i(View view) {
            return view.getElevation();
        }

        @Nullable
        @DoNotInline
        public static WindowInsetsCompat j(@NonNull View view) {
            return WindowInsetsCompat.a.a(view);
        }

        @DoNotInline
        public static String k(View view) {
            return view.getTransitionName();
        }

        @DoNotInline
        public static float l(View view) {
            return view.getTranslationZ();
        }

        @DoNotInline
        public static float m(@NonNull View view) {
            return view.getZ();
        }

        @DoNotInline
        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        @DoNotInline
        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        @DoNotInline
        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @DoNotInline
        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @DoNotInline
        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @DoNotInline
        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        @DoNotInline
        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        @DoNotInline
        public static void u(@NonNull View view, @Nullable g0 g0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(e0.c.tag_on_apply_window_listener, g0Var);
            }
            if (g0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(e0.c.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, g0Var));
            }
        }

        @DoNotInline
        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        @DoNotInline
        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        @DoNotInline
        public static void x(@NonNull View view, float f10) {
            view.setZ(f10);
        }

        @DoNotInline
        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        @DoNotInline
        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class i {
        @Nullable
        public static WindowInsetsCompat a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatW = WindowInsetsCompat.w(rootWindowInsets);
            windowInsetsCompatW.t(windowInsetsCompatW);
            windowInsetsCompatW.d(view.getRootView());
            return windowInsetsCompatW;
        }

        @DoNotInline
        public static int b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        @DoNotInline
        public static void c(@NonNull View view, int i10) {
            view.setScrollIndicators(i10);
        }

        @DoNotInline
        public static void d(@NonNull View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    public static class j {
        @DoNotInline
        public static void a(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        @DoNotInline
        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @DoNotInline
        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @DoNotInline
        public static void d(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @DoNotInline
        public static boolean e(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        @DoNotInline
        public static void f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static class k {
        @DoNotInline
        public static void a(@NonNull View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        @DoNotInline
        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        @DoNotInline
        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        @DoNotInline
        public static int d(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        @DoNotInline
        public static boolean e(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        @DoNotInline
        public static boolean f(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        @DoNotInline
        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        @DoNotInline
        public static boolean h(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        @DoNotInline
        public static View i(@NonNull View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        @DoNotInline
        public static boolean j(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        @DoNotInline
        public static void k(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @DoNotInline
        public static void l(@NonNull View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        @DoNotInline
        public static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        @DoNotInline
        public static void n(@NonNull View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        @DoNotInline
        public static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        @DoNotInline
        public static void p(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class l {
        @DoNotInline
        public static void a(@NonNull View view, @NonNull final q qVar) {
            int i10 = e0.c.tag_unhandled_key_listeners;
            r.k kVar = (r.k) view.getTag(i10);
            if (kVar == null) {
                kVar = new r.k();
                view.setTag(i10, kVar);
            }
            Objects.requireNonNull(qVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(qVar) { // from class: androidx.core.view.z0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            kVar.put(qVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @DoNotInline
        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        @DoNotInline
        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        @DoNotInline
        public static void e(@NonNull View view, @NonNull q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            r.k kVar = (r.k) view.getTag(e0.c.tag_unhandled_key_listeners);
            if (kVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        public static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        @DoNotInline
        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        @DoNotInline
        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @DoNotInline
        public static void i(View view, t0.a aVar) {
            view.setAutofillId(null);
        }

        @DoNotInline
        public static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    public static class m {
        @DoNotInline
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        @DoNotInline
        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        @DoNotInline
        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @DoNotInline
        public static void d(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        @DoNotInline
        public static void e(View view, u0.a aVar) {
            view.setContentCaptureSession(null);
        }

        @DoNotInline
        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class n {
        @DoNotInline
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        @DoNotInline
        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        @Nullable
        public static t2 c(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return t2.f(windowInsetsController);
            }
            return null;
        }

        @DoNotInline
        public static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        @DoNotInline
        public static void e(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        @DoNotInline
        public static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class o {
        @Nullable
        @DoNotInline
        public static String[] a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        @Nullable
        @DoNotInline
        public static ContentInfoCompat b(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfoF = contentInfoCompat.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? contentInfoCompat : ContentInfoCompat.g(contentInfoPerformReceiveContent);
        }

        @DoNotInline
        public static void c(@NonNull View view, @Nullable String[] strArr, @Nullable h0 h0Var) {
            if (h0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(h0Var));
            }
        }
    }

    public static final class p implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        public final h0 f2626a;

        public p(h0 h0Var) {
            this.f2626a = h0Var;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompatG = ContentInfoCompat.g(contentInfo);
            ContentInfoCompat contentInfoCompatA = this.f2626a.a(view, contentInfoCompatG);
            if (contentInfoCompatA == null) {
                return null;
            }
            return contentInfoCompatA == contentInfoCompatG ? contentInfo : contentInfoCompatA.f();
        }
    }

    public interface q {
    }

    public static class r {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList f2627d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap f2628a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray f2629b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference f2630c = null;

        public static r a(View view) {
            int i10 = e0.c.tag_unhandled_key_event_manager;
            r rVar = (r) view.getTag(i10);
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r();
            view.setTag(i10, rVar2);
            return rVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
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

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f2628a;
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

        public final SparseArray d() {
            if (this.f2629b == null) {
                this.f2629b = new SparseArray();
            }
            return this.f2629b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(e0.c.tag_unhandled_key_listeners);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            androidx.appcompat.app.z.a(arrayList.get(size));
            throw null;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f2630c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f2630c = new WeakReference(keyEvent);
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

        public final void g() {
            WeakHashMap weakHashMap = this.f2628a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f2627d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f2628a == null) {
                        this.f2628a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f2627d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2628a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2628a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static int A(View view) {
        return view.getMinimumWidth();
    }

    public static void A0(View view, WindowInsetsAnimationCompat.Callback callback) {
        WindowInsetsAnimationCompat.d(view, callback);
    }

    public static String[] B(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(e0.c.tag_on_receive_content_mime_types);
    }

    public static void B0(View view, float f10) {
        h.x(view, f10);
    }

    public static int C(View view) {
        return view.getPaddingEnd();
    }

    public static f C0() {
        return new c(e0.c.tag_state_description, CharSequence.class, 64, 30);
    }

    public static int D(View view) {
        return view.getPaddingStart();
    }

    public static void D0(View view) {
        h.z(view);
    }

    public static ViewParent E(View view) {
        return view.getParentForAccessibility();
    }

    public static WindowInsetsCompat F(View view) {
        return i.a(view);
    }

    public static CharSequence G(View view) {
        return (CharSequence) C0().e(view);
    }

    public static String H(View view) {
        return h.k(view);
    }

    public static float I(View view) {
        return h.l(view);
    }

    public static t2 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return k1.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float L(View view) {
        return h.m(view);
    }

    public static boolean M(View view) {
        return l(view) != null;
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
        Boolean bool = (Boolean) i0().e(view);
        return bool != null && bool.booleanValue();
    }

    public static void S(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = n(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : KEYRecord.Flags.FLAG4);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(n(view));
                    r0(view);
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
                accessibilityEventObtain2.getText().add(n(view));
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

    public static void T(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void U(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static WindowInsetsCompat V(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsV = windowInsetsCompat.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsV);
            if (!windowInsetsB.equals(windowInsetsV)) {
                return WindowInsetsCompat.x(windowInsetsB, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void W(View view, s0.x xVar) {
        view.onInitializeAccessibilityNodeInfo(xVar.Q0());
    }

    public static f X() {
        return new b(e0.c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static boolean Y(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static ContentInfoCompat Z(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, contentInfoCompat);
        }
        h0 h0Var = (h0) view.getTag(e0.c.tag_on_receive_content_listener);
        if (h0Var == null) {
            return u(view).a(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatA = h0Var.a(view, contentInfoCompat);
        if (contentInfoCompatA == null) {
            return null;
        }
        return u(view).a(contentInfoCompatA);
    }

    public static /* synthetic */ ContentInfoCompat a(ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    public static void a0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static f b() {
        return new d(e0.c.tag_accessibility_heading, Boolean.class, 28);
    }

    public static void b0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static int c(View view, CharSequence charSequence, s0.a0 a0Var) {
        int iP = p(view, charSequence);
        if (iP != -1) {
            d(view, new x.a(iP, charSequence, a0Var));
        }
        return iP;
    }

    public static void c0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static void d(View view, x.a aVar) {
        j(view);
        e0(aVar.b(), view);
        o(view).add(aVar);
        S(view, 0);
    }

    public static void d0(View view, int i10) {
        e0(i10, view);
        S(view, 0);
    }

    public static g1 e(View view) {
        if (f2612a == null) {
            f2612a = new WeakHashMap();
        }
        g1 g1Var = (g1) f2612a.get(view);
        if (g1Var != null) {
            return g1Var;
        }
        g1 g1Var2 = new g1(view);
        f2612a.put(view, g1Var2);
        return g1Var2;
    }

    public static void e0(int i10, View view) {
        List listO = o(view);
        for (int i11 = 0; i11 < listO.size(); i11++) {
            if (((x.a) listO.get(i11)).b() == i10) {
                listO.remove(i11);
                return;
            }
        }
    }

    public static WindowInsetsCompat f(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return h.b(view, windowInsetsCompat, rect);
    }

    public static void f0(View view, x.a aVar, CharSequence charSequence, s0.a0 a0Var) {
        if (a0Var == null && charSequence == null) {
            d0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, a0Var));
        }
    }

    public static WindowInsetsCompat g(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsV = windowInsetsCompat.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsV);
            if (!windowInsetsA.equals(windowInsetsV)) {
                return WindowInsetsCompat.x(windowInsetsA, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void g0(View view) {
        g.c(view);
    }

    public static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    public static void h0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    public static f i0() {
        return new a(e0.c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static void j(View view) {
        androidx.core.view.a aVarK = k(view);
        if (aVarK == null) {
            aVarK = new androidx.core.view.a();
        }
        j0(view, aVarK);
    }

    public static void j0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (l(view) instanceof a.C0023a)) {
            aVar = new androidx.core.view.a();
        }
        r0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static androidx.core.view.a k(View view) {
        View.AccessibilityDelegate accessibilityDelegateL = l(view);
        if (accessibilityDelegateL == null) {
            return null;
        }
        return accessibilityDelegateL instanceof a.C0023a ? ((a.C0023a) accessibilityDelegateL).f2705a : new androidx.core.view.a(accessibilityDelegateL);
    }

    public static void k0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    public static View.AccessibilityDelegate l(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : m(view);
    }

    public static void l0(View view, CharSequence charSequence) {
        X().f(view, charSequence);
        if (charSequence != null) {
            f2617f.a(view);
        } else {
            f2617f.d(view);
        }
    }

    public static View.AccessibilityDelegate m(View view) {
        if (f2614c) {
            return null;
        }
        if (f2613b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2613b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2614c = true;
                return null;
            }
        }
        try {
            Object obj = f2613b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2614c = true;
            return null;
        }
    }

    public static void m0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static CharSequence n(View view) {
        return (CharSequence) X().e(view);
    }

    public static void n0(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static List o(View view) {
        int i10 = e0.c.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static void o0(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static int p(View view, CharSequence charSequence) {
        List listO = o(view);
        for (int i10 = 0; i10 < listO.size(); i10++) {
            if (TextUtils.equals(charSequence, ((x.a) listO.get(i10)).c())) {
                return ((x.a) listO.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f2615d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listO.size(); i14++) {
                z10 &= ((x.a) listO.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void p0(View view, float f10) {
        h.s(view, f10);
    }

    public static ColorStateList q(View view) {
        return h.g(view);
    }

    public static void q0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static PorterDuff.Mode r(View view) {
        return h.h(view);
    }

    public static void r0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static Display s(View view) {
        return view.getDisplay();
    }

    public static void s0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.m(view, i10);
        }
    }

    public static float t(View view) {
        return h.i(view);
    }

    public static void t0(View view, g0 g0Var) {
        h.u(view, g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i0 u(View view) {
        return view instanceof i0 ? (i0) view : f2616e;
    }

    public static void u0(View view, k0 k0Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.d(view, x0.a(k0Var != null ? k0Var.a() : null));
        }
    }

    public static boolean v(View view) {
        return view.getFitsSystemWindows();
    }

    public static void v0(View view, boolean z10) {
        i0().f(view, Boolean.valueOf(z10));
    }

    public static int w(View view) {
        return view.getImportantForAccessibility();
    }

    public static void w0(View view, int i10, int i11) {
        i.d(view, i10, i11);
    }

    public static int x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.c(view);
        }
        return 0;
    }

    public static void x0(View view, CharSequence charSequence) {
        C0().f(view, charSequence);
    }

    public static int y(View view) {
        return view.getLayoutDirection();
    }

    public static void y0(View view, String str) {
        h.v(view, str);
    }

    public static int z(View view) {
        return view.getMinimumHeight();
    }

    public static void z0(View view, float f10) {
        h.w(view, f10);
    }
}
