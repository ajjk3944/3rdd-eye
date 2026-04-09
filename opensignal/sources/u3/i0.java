package u3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f23177a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f23178b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f23179c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f23180d = {f3.c.accessibility_custom_action_0, f3.c.accessibility_custom_action_1, f3.c.accessibility_custom_action_2, f3.c.accessibility_custom_action_3, f3.c.accessibility_custom_action_4, f3.c.accessibility_custom_action_5, f3.c.accessibility_custom_action_6, f3.c.accessibility_custom_action_7, f3.c.accessibility_custom_action_8, f3.c.accessibility_custom_action_9, f3.c.accessibility_custom_action_10, f3.c.accessibility_custom_action_11, f3.c.accessibility_custom_action_12, f3.c.accessibility_custom_action_13, f3.c.accessibility_custom_action_14, f3.c.accessibility_custom_action_15, f3.c.accessibility_custom_action_16, f3.c.accessibility_custom_action_17, f3.c.accessibility_custom_action_18, f3.c.accessibility_custom_action_19, f3.c.accessibility_custom_action_20, f3.c.accessibility_custom_action_21, f3.c.accessibility_custom_action_22, f3.c.accessibility_custom_action_23, f3.c.accessibility_custom_action_24, f3.c.accessibility_custom_action_25, f3.c.accessibility_custom_action_26, f3.c.accessibility_custom_action_27, f3.c.accessibility_custom_action_28, f3.c.accessibility_custom_action_29, f3.c.accessibility_custom_action_30, f3.c.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final u f23181e = new u();

    /* renamed from: f, reason: collision with root package name */
    public static final w f23182f = new w();

    public static l0 a(View view) {
        if (f23177a == null) {
            f23177a = new WeakHashMap();
        }
        l0 l0Var = (l0) f23177a.get(view);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(view);
        f23177a.put(view, l0Var2);
        return l0Var2;
    }

    public static h1 b(View view, h1 h1Var) {
        WindowInsets windowInsetsF = h1Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = x.a(view, windowInsetsF);
            if (!windowInsetsA.equals(windowInsetsF)) {
                return h1.g(view, windowInsetsA);
            }
        }
        return h1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = h0.f23171d;
        h0 h0Var = (h0) view.getTag(f3.c.tag_unhandled_key_event_manager);
        if (h0Var == null) {
            h0Var = new h0();
            h0Var.f23172a = null;
            h0Var.f23173b = null;
            h0Var.f23174c = null;
            view.setTag(f3.c.tag_unhandled_key_event_manager, h0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = h0Var.f23172a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = h0.f23171d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (h0Var.f23172a == null) {
                            h0Var.f23172a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = h0.f23171d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                h0Var.f23172a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    h0Var.f23172a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = h0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (h0Var.f23173b == null) {
                    h0Var.f23173b = new SparseArray();
                }
                h0Var.f23173b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e0.a(view);
        }
        if (f23179c) {
            return null;
        }
        if (f23178b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f23178b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f23179c = true;
                return null;
            }
        }
        try {
            Object obj = f23178b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f23179c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        int i10 = f3.c.tag_accessibility_pane_title;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = d0.a(view);
        } else {
            tag = view.getTag(i10);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(f3.c.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(f3.c.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(p.r rVar) {
        return Build.VERSION.SDK_INT >= 31 ? g0.a(rVar) : (String[]) rVar.getTag(f3.c.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(e(view));
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
                        io.sentry.android.core.e0.c("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
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
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static h1 i(View view, h1 h1Var) {
        WindowInsets windowInsetsF = h1Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsB = x.b(view, windowInsetsF);
            if (!windowInsetsB.equals(windowInsetsF)) {
                return h1.g(view, windowInsetsB);
            }
        }
        return h1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f j(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(fVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return g0.b(view, fVar);
        }
        y3.h hVar = (y3.h) view.getTag(f3.c.tag_on_receive_content_listener);
        o oVar = f23181e;
        if (hVar == null) {
            if (view instanceof o) {
                oVar = (o) view;
            }
            return oVar.a(fVar);
        }
        f fVarA = y3.h.a(view, fVar);
        if (fVarA == null) {
            return null;
        }
        if (view instanceof o) {
            oVar = (o) view;
        }
        return oVar.a(fVarA);
    }

    public static void k(View view, int i10) {
        ArrayList arrayListF = f(view);
        for (int i11 = 0; i11 < arrayListF.size(); i11++) {
            if (((v3.b) arrayListF.get(i11)).a() == i10) {
                arrayListF.remove(i11);
                return;
            }
        }
    }

    public static void l(View view, v3.b bVar, v3.m mVar) {
        v3.b bVar2 = new v3.b(null, bVar.f23834b, null, mVar, bVar.f23835c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        b bVar3 = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof a ? ((a) accessibilityDelegateD).f23144a : new b(accessibilityDelegateD);
        if (bVar3 == null) {
            bVar3 = new b();
        }
        n(view, bVar3);
        k(view, bVar2.a());
        f(view).add(bVar2);
        h(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            e0.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static void n(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f23148b);
    }

    public static void o(View view, CharSequence charSequence) {
        new v(f3.c.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        w wVar = f23182f;
        if (charSequence == null) {
            wVar.f23230a.remove(view);
            view.removeOnAttachStateChangeListener(wVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(wVar);
        } else {
            wVar.f23230a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(wVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(wVar);
            }
        }
    }

    public static void p(View view, androidx.datastore.preferences.protobuf.j jVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(jVar != null ? new r0(jVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = p0.f23203e;
        Object tag = view.getTag(f3.c.tag_on_apply_window_listener);
        if (jVar == null) {
            view.setTag(f3.c.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener o0Var = new o0(view, jVar);
        view.setTag(f3.c.tag_window_insets_animation_callback, o0Var);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(o0Var);
        }
    }
}
