package R;

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
import com.apm.insight.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C2738t;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f3270a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f3271b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3272c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3273d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final C0198z f3274e = new C0198z();

    /* renamed from: f, reason: collision with root package name */
    public static final B f3275f = new B();

    public static S a(View view) {
        if (f3270a == null) {
            f3270a = new WeakHashMap();
        }
        S s5 = (S) f3270a.get(view);
        if (s5 != null) {
            return s5;
        }
        S s6 = new S(view);
        f3270a.put(view, s6);
        return s6;
    }

    public static void b(View view, r0 r0Var) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsF = r0Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = i >= 30 ? L.a(view, windowInsetsF) : D.a(view, windowInsetsF);
            if (windowInsetsA.equals(windowInsetsF)) {
                return;
            }
            r0.g(view, windowInsetsA);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = N.f3266d;
        N n6 = (N) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (n6 == null) {
            n6 = new N();
            n6.f3267a = null;
            n6.f3268b = null;
            n6.f3269c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, n6);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = n6.f3267a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = N.f3266d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (n6.f3267a == null) {
                            n6.f3267a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = N.f3266d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                n6.f3267a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    n6.f3267a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = n6.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (n6.f3268b == null) {
                    n6.f3268b = new SparseArray();
                }
                n6.f3268b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return K.a(view);
        }
        if (f3272c) {
            return null;
        }
        if (f3271b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3271b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3272c = true;
                return null;
            }
        }
        try {
            Object obj = f3271b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3272c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = J.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(C2738t c2738t) {
        return Build.VERSION.SDK_INT >= 31 ? M.a(c2738t) : (String[]) c2738t.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z6 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z6) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e6) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0179f i(View view, C0179f c0179f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0179f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return M.b(view, c0179f);
        }
        U.i iVar = (U.i) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0189p interfaceC0189p = f3274e;
        if (iVar == null) {
            if (view instanceof InterfaceC0189p) {
                interfaceC0189p = (InterfaceC0189p) view;
            }
            return interfaceC0189p.a(c0179f);
        }
        C0179f c0179fA = U.i.a(view, c0179f);
        if (c0179fA == null) {
            return null;
        }
        if (view instanceof InterfaceC0189p) {
            interfaceC0189p = (InterfaceC0189p) view;
        }
        return interfaceC0189p.a(c0179fA);
    }

    public static void j(int i, View view) {
        ArrayList arrayListF = f(view);
        for (int i3 = 0; i3 < arrayListF.size(); i3++) {
            if (((S.c) arrayListF.get(i3)).a() == i) {
                arrayListF.remove(i3);
                return;
            }
        }
    }

    public static void k(View view, S.c cVar, S.n nVar) {
        if (nVar == null) {
            j(cVar.a(), view);
            h(0, view);
            return;
        }
        S.c cVar2 = new S.c(null, cVar.f3442b, null, nVar, cVar.f3443c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        C0175b c0175b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C0174a ? ((C0174a) accessibilityDelegateD).f3299a : new C0175b(accessibilityDelegateD);
        if (c0175b == null) {
            c0175b = new C0175b();
        }
        m(view, c0175b);
        j(cVar2.a(), view);
        f(view).add(cVar2);
        h(0, view);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            K.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void m(View view, C0175b c0175b) {
        if (c0175b == null && (d(view) instanceof C0174a)) {
            c0175b = new C0175b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0175b == null ? null : c0175b.f3303b);
    }

    public static void n(View view, CharSequence charSequence) {
        new A(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        B b5 = f3275f;
        if (charSequence == null) {
            b5.f3258a.remove(view);
            view.removeOnAttachStateChangeListener(b5);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(b5);
        } else {
            b5.f3258a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(b5);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(b5);
            }
        }
    }
}
