package c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1788v;
import androidx.lifecycle.InterfaceC1790x;
import b9.C2001h;
import java.lang.reflect.Field;
import p9.InterfaceC5480a;

/* compiled from: ImmLeaksCleaner.kt */
/* renamed from: c.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2020r implements InterfaceC1788v {

    /* renamed from: c, reason: collision with root package name */
    public static final b9.p f18297c = C2001h.b(b.f18299g);

    /* renamed from: b, reason: collision with root package name */
    public final ActivityC2008f f18298b;

    /* compiled from: ImmLeaksCleaner.kt */
    /* renamed from: c.r$a */
    public static abstract class a {
        public abstract boolean a(InputMethodManager inputMethodManager);

        public abstract Object b(InputMethodManager inputMethodManager);

        public abstract View c(InputMethodManager inputMethodManager);
    }

    /* compiled from: ImmLeaksCleaner.kt */
    /* renamed from: c.r$b */
    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<a> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f18299g = new b(0);

        @Override // p9.InterfaceC5480a
        public final a invoke() throws NoSuchFieldException, SecurityException {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                declaredField3.setAccessible(true);
                return new d(declaredField3, declaredField, declaredField2);
            } catch (NoSuchFieldException unused) {
                return c.f18300a;
            }
        }
    }

    /* compiled from: ImmLeaksCleaner.kt */
    /* renamed from: c.r$c */
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18300a = new c();

        @Override // c.C2020r.a
        public final boolean a(InputMethodManager inputMethodManager) {
            return false;
        }

        @Override // c.C2020r.a
        public final Object b(InputMethodManager inputMethodManager) {
            return null;
        }

        @Override // c.C2020r.a
        public final View c(InputMethodManager inputMethodManager) {
            return null;
        }
    }

    /* compiled from: ImmLeaksCleaner.kt */
    /* renamed from: c.r$d */
    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Field f18301a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f18302b;

        /* renamed from: c, reason: collision with root package name */
        public final Field f18303c;

        public d(Field field, Field field2, Field field3) {
            this.f18301a = field;
            this.f18302b = field2;
            this.f18303c = field3;
        }

        @Override // c.C2020r.a
        public final boolean a(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
            try {
                this.f18303c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // c.C2020r.a
        public final Object b(InputMethodManager inputMethodManager) {
            try {
                return this.f18301a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // c.C2020r.a
        public final View c(InputMethodManager inputMethodManager) {
            try {
                return (View) this.f18302b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public C2020r(ActivityC2008f activityC2008f) {
        this.f18298b = activityC2008f;
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
        if (aVar != AbstractC1781n.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.f18298b.getSystemService("input_method");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        a aVar2 = (a) f18297c.getValue();
        Object objB = aVar2.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = aVar2.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = aVar2.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
