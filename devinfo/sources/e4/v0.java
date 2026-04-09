package e4;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import com.liuzh.deviceinfo.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f22405a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f22406b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f22407c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f22408d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final h0 f22409e = new h0();

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f22410f = new j0();

    public static void a(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        nk.k.e(view2, "<this>");
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static c1 b(View view) {
        if (f22405a == null) {
            f22405a = new WeakHashMap();
        }
        c1 c1Var = (c1) f22405a.get(view);
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1(view);
        f22405a.put(view, c1Var2);
        return c1Var2;
    }

    public static c2 c(View view, c2 c2Var) {
        int i4 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsG = c2Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = i4 >= 30 ? s0.a(view, windowInsetsG) : k0.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return c2.h(view, windowInsetsA);
            }
        }
        return c2Var;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = u0.f22400d;
        u0 u0Var = (u0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (u0Var == null) {
            u0Var = new u0();
            u0Var.f22401a = null;
            u0Var.f22402b = null;
            u0Var.f22403c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, u0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = u0Var.f22401a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = u0.f22400d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (u0Var.f22401a == null) {
                            u0Var.f22401a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = u0.f22400d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                u0Var.f22401a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    u0Var.f22401a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = u0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (u0Var.f22402b == null) {
                    u0Var.f22402b = new SparseArray();
                }
                u0Var.f22402b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r0.a(view);
        }
        if (f22407c) {
            return null;
        }
        if (f22406b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f22406b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f22407c = true;
                return null;
            }
        }
        try {
            Object obj = f22406b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f22407c = true;
            return null;
        }
    }

    public static CharSequence f(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = q0.a(view);
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

    public static String[] h(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? t0.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void i(int i4, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = f(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z3 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i4);
                if (z3) {
                    accessibilityEventObtain.getText().add(f(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i4 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i4);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static c2 j(View view, c2 c2Var) {
        WindowInsets windowInsetsG = c2Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = k0.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return c2.h(view, windowInsetsB);
            }
        }
        return c2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h k(View view, h hVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + hVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t0.b(view, hVar);
        }
        j4.j jVar = (j4.j) view.getTag(R.id.tag_on_receive_content_listener);
        t tVar = f22409e;
        if (jVar == null) {
            if (view instanceof t) {
                tVar = (t) view;
            }
            return tVar.a(hVar);
        }
        h hVarA = j4.j.a(view, hVar);
        if (hVarA == null) {
            return null;
        }
        if (view instanceof t) {
            tVar = (t) view;
        }
        return tVar.a(hVarA);
    }

    public static void l(int i4, View view) {
        ArrayList arrayListG = g(view);
        for (int i10 = 0; i10 < arrayListG.size(); i10++) {
            if (((f4.c) arrayListG.get(i10)).a() == i4) {
                arrayListG.remove(i10);
                return;
            }
        }
    }

    public static void m(View view, f4.c cVar, f4.p pVar) {
        f4.c cVar2 = new f4.c(null, cVar.f23646b, null, pVar, cVar.f23647c);
        View.AccessibilityDelegate accessibilityDelegateE = e(view);
        b bVar = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof a ? ((a) accessibilityDelegateE).f22299a : new b(accessibilityDelegateE);
        if (bVar == null) {
            bVar = new b();
        }
        o(view, bVar);
        l(cVar2.a(), view);
        g(view).add(cVar2);
        i(0, view);
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            r0.b(view, context, iArr, attributeSet, typedArray, i4, 0);
        }
    }

    public static void o(View view, b bVar) {
        if (bVar == null && (e(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f22307b);
    }

    public static void p(View view, CharSequence charSequence) {
        new i0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        j0 j0Var = f22410f;
        if (charSequence == null) {
            j0Var.f22361a.remove(view);
            view.removeOnAttachStateChangeListener(j0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(j0Var);
        } else {
            j0Var.f22361a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(j0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(j0Var);
            }
        }
    }

    public static void q(jd.k kVar, p6.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            o0.a(kVar, (PointerIcon) iVar.f31385a);
        }
    }

    public static void r(View view, androidx.datastore.preferences.protobuf.j jVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            j1.h(view, jVar);
            return;
        }
        PathInterpolator pathInterpolator = g1.f22345e;
        View.OnApplyWindowInsetsListener f1Var = jVar != null ? new f1(view, jVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, f1Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(f1Var);
        }
    }
}
