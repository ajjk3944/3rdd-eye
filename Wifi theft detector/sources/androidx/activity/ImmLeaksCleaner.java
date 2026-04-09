package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Field;

@RequiresApi(19)
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.j {

    /* renamed from: b, reason: collision with root package name */
    public static int f231b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f232c;

    /* renamed from: d, reason: collision with root package name */
    public static Field f233d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f234e;

    /* renamed from: a, reason: collision with root package name */
    public Activity f235a;

    public ImmLeaksCleaner(Activity activity) {
        this.f235a = activity;
    }

    public static void g() throws NoSuchFieldException, SecurityException {
        try {
            f231b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f233d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f234e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f232c = declaredField3;
            declaredField3.setAccessible(true);
            f231b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.j
    public void onStateChanged(androidx.lifecycle.n nVar, Lifecycle.Event event) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f231b == 0) {
            g();
        }
        if (f231b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f235a.getSystemService("input_method");
            try {
                Object obj = f232c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f233d.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f234e.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
