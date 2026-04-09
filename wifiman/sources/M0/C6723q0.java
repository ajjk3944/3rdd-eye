package m0;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: m0.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6723q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C6723q0 f52942a = new C6723q0();

    /* renamed from: b, reason: collision with root package name */
    private static Method f52943b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f52944c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f52945d;

    private C6723q0() {
    }

    public final void a(Canvas canvas, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            C6729t0.f52947a.a(canvas, z10);
            return;
        }
        if (!f52945d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f52943b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f52944c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f52943b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f52944c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f52943b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f52944c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f52945d = true;
        }
        if (z10) {
            try {
                Method method4 = f52943b;
                if (method4 != null) {
                    AbstractC6492s.f(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f52944c) == null) {
            return;
        }
        AbstractC6492s.f(method);
        method.invoke(canvas, null);
    }
}
