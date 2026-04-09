package com.bumptech.glide;

import B4.A;
import B4.C;
import R.InterfaceC0182i;
import R.N;
import R.O;
import a4.t;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.d0;
import c.InterfaceC0373M;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1212ga;
import com.google.android.gms.internal.ads.AbstractC2022vd;
import com.google.android.gms.internal.ads.C0504Ff;
import d3.AbstractC2266a;
import f4.InterfaceFutureC2326a;
import h.AbstractActivityC2349g;
import h5.C2371e;
import h5.InterfaceC2370d;
import h5.InterfaceC2372f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k0.K;
import o.a1;
import q0.C2789b;
import q0.z;
import z5.AbstractC3042s;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f6491a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f6492b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f6493c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f6494d;

    public static InterfaceC2370d B(InterfaceC2370d interfaceC2370d) {
        q5.i.e(interfaceC2370d, "<this>");
        j5.b bVar = interfaceC2370d instanceof j5.b ? (j5.b) interfaceC2370d : null;
        if (bVar == null || (interfaceC2370d = bVar.f21464c) != null) {
            return interfaceC2370d;
        }
        InterfaceC2372f interfaceC2372f = (InterfaceC2372f) bVar.getContext().h(C2371e.f20485a);
        InterfaceC2370d hVar = interfaceC2372f != null ? new E5.h((AbstractC3042s) interfaceC2372f, bVar) : bVar;
        bVar.f21464c = hVar;
        return hVar;
    }

    public static boolean C(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean E(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final void J(View view, InterfaceC0373M interfaceC0373M) {
        q5.i.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC0373M);
    }

    public static void K(Object obj, Integer num) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField;
        if (obj == null) {
            throw new IllegalArgumentException("object can't be null");
        }
        Class<?> superclass = obj.getClass();
        while (true) {
            if (superclass == Object.class) {
                declaredField = null;
                break;
            }
            try {
                declaredField = superclass.getDeclaredField("mSubId");
                if ((!Modifier.isPublic(declaredField.getModifiers()) || !Modifier.isPublic(declaredField.getDeclaringClass().getModifiers()) || Modifier.isFinal(declaredField.getModifiers())) && !declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        if (declaredField != null) {
            try {
                declaredField.set(obj, num);
            } catch (IllegalAccessException | IllegalArgumentException unused2) {
            }
        } else {
            throw new IllegalArgumentException("Could not find field [mSubId] on target [" + obj + "]");
        }
    }

    public static void M(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        AbstractActivityC2349g abstractActivityC2349gO = O(context);
        K kS = (!(abstractActivityC2349gO instanceof AbstractActivityC2349g) && abstractActivityC2349gO == null) ? null : abstractActivityC2349gO.s();
        if (kS == null) {
            C c6 = new C(context, R.style.customDialog);
            c6.f692g = str;
            c6.f693h = str2;
            c6.show();
            return;
        }
        A a6 = new A();
        a6.f687A0 = str;
        a6.f688B0 = str2;
        a6.e0(kS, "share_copy_dialog");
    }

    public static AbstractActivityC2349g O(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof AbstractActivityC2349g) {
            return (AbstractActivityC2349g) context;
        }
        if (context instanceof ContextWrapper) {
            return O(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void R(Context context) {
        boolean z6;
        Object obj = u2.h.f23803b;
        if (((Boolean) AbstractC1212ga.f14271a.v()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (u2.h.f23803b) {
                        z6 = u2.h.f23804c;
                    }
                    if (z6) {
                        return;
                    }
                    InterfaceFutureC2326a interfaceFutureC2326aK = new C0504Ff(context).k();
                    u2.k.g("Updating ad debug logging enablement.");
                    AbstractC2022vd.g(interfaceFutureC2326aK, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e6) {
                u2.k.i("Fail to determine debug setting.", e6);
            }
        }
    }

    public static void a(StringBuilder sb, Object obj, p5.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.f(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static int g(d0 d0Var, androidx.recyclerview.widget.A a6, View view, View view2, Q q3, boolean z6) {
        if (q3.getChildCount() == 0 || d0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return Math.abs(q3.getPosition(view) - q3.getPosition(view2)) + 1;
        }
        return Math.min(a6.l(), a6.b(view2) - a6.e(view));
    }

    public static int h(d0 d0Var, androidx.recyclerview.widget.A a6, View view, View view2, Q q3, boolean z6, boolean z7) {
        if (q3.getChildCount() == 0 || d0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z7 ? Math.max(0, (d0Var.b() - Math.max(q3.getPosition(view), q3.getPosition(view2))) - 1) : Math.max(0, Math.min(q3.getPosition(view), q3.getPosition(view2)));
        if (z6) {
            return Math.round((iMax * (Math.abs(a6.b(view2) - a6.e(view)) / (Math.abs(q3.getPosition(view) - q3.getPosition(view2)) + 1))) + (a6.k() - a6.e(view)));
        }
        return iMax;
    }

    public static int i(d0 d0Var, androidx.recyclerview.widget.A a6, View view, View view2, Q q3, boolean z6) {
        if (q3.getChildCount() == 0 || d0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return d0Var.b();
        }
        return (int) (((a6.b(view2) - a6.e(view)) / (Math.abs(q3.getPosition(view) - q3.getPosition(view2)) + 1)) * d0Var.b());
    }

    public static X j(Class cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            q5.i.d(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return (X) objNewInstance;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }

    public static boolean k(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = O.f3270a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = N.f3266d;
        N n6 = (N) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (n6 == null) {
            n6 = new N();
            n6.f3267a = null;
            n6.f3268b = null;
            n6.f3269c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, n6);
        }
        WeakReference weakReference2 = n6.f3269c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        n6.f3269c = new WeakReference(keyEvent);
        if (n6.f3268b == null) {
            n6.f3268b = new SparseArray();
        }
        SparseArray sparseArray = n6.f3268b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean l(InterfaceC0182i interfaceC0182i, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0182i != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0182i.g(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f6491a) {
                            try {
                                f6492b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f6491a = true;
                        }
                        Method method = f6492b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (O.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f6493c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f6494d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f6493c = true;
                }
                Field field = f6494d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (O.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && O.c(view, keyEvent)) || interfaceC0182i.g(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final z m(View view) {
        q5.i.e(view, "view");
        x5.c cVar = new x5.c(new x5.d(new x5.f(2, x5.h.L(view, C2789b.i), C2789b.f22953j), false, new D4.d(12)));
        z zVar = (z) (!cVar.hasNext() ? null : cVar.next());
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static ColorStateList n(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = G.c.b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public static ColorStateList o(Context context, a1 a1Var, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) a1Var.f22480c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = G.c.b(context, resourceId)) == null) ? a1Var.c(i) : colorStateListB;
    }

    public static int q(Context context, TypedArray typedArray, int i, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i3);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable r(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableI;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableI = t.i(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableI;
    }

    public static int z(Context context, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2266a.f19727E);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(4, typedValue);
        if (!value) {
            value = typedArrayObtainStyledAttributes.getValue(2, typedValue);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (value) {
            return typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public abstract float A(Object obj);

    public abstract boolean D(float f2);

    public abstract boolean F(View view);

    public abstract boolean G(float f2, float f5);

    public abstract void H(g1.h hVar, g1.h hVar2);

    public abstract void I(g1.h hVar, Thread thread);

    public abstract void L(Object obj, float f2);

    public abstract boolean N(View view, float f2);

    public abstract void P(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void Q(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i3);

    public abstract int b(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float c(int i);

    public abstract boolean d(g1.i iVar, g1.d dVar, g1.d dVar2);

    public abstract boolean e(g1.i iVar, Object obj, Object obj2);

    public abstract boolean f(g1.i iVar, g1.h hVar, g1.h hVar2);

    public abstract int p(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int s();

    public abstract int t();

    public abstract int u();

    public abstract int v();

    public abstract int w(View view);

    public abstract int x(CoordinatorLayout coordinatorLayout);

    public abstract int y();
}
