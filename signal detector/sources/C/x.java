package c;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class x extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public static final x f5876b = new x(0);

    @Override // p5.a
    public final Object b() throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new z(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return y.f5877a;
        }
    }
}
