package c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class z extends w {

    /* renamed from: a, reason: collision with root package name */
    public final Field f5878a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f5879b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f5880c;

    public z(Field field, Field field2, Field field3) {
        this.f5878a = field;
        this.f5879b = field2;
        this.f5880c = field3;
    }

    @Override // c.w
    public final boolean a(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.f5880c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // c.w
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f5878a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // c.w
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f5879b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
