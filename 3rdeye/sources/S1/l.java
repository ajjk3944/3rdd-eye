package S1;

import H6.I;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: WebViewGlueCommunicator.java */
/* loaded from: classes.dex */
public final class l {

    /* compiled from: WebViewGlueCommunicator.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f11863a;

        static {
            n eVar;
            try {
                eVar = new I((WebViewProviderFactoryBoundaryInterface) ka.a.a(WebViewProviderFactoryBoundaryInterface.class, l.a()), 6);
            } catch (ClassNotFoundException unused) {
                eVar = new e();
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
            f11863a = eVar;
        }
    }

    public static InvocationHandler a() throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException, InvocationTargetException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = c.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }
}
