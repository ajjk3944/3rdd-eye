package c2;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class y {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d0 f4700a = new d0(y.d().getWebkitToCompatConverter());
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a0 f4701a = y.a();
    }

    public static a0 a() {
        try {
            return new b0((WebViewProviderFactoryBoundaryInterface) da.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new l();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static d0 c() {
        return a.f4700a;
    }

    public static a0 d() {
        return b.f4701a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? j.a() : f().getClass().getClassLoader();
    }

    public static Object f() throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
