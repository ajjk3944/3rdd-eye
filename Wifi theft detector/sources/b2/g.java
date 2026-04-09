package b2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebMessageCompat;
import c2.a;
import c2.a0;
import c2.j;
import c2.x;
import c2.y;
import c2.z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f4579a = Uri.parse(Marker.ANY_MARKER);

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f4580b = Uri.parse("");

    public interface a {
        void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z10, b2.a aVar);
    }

    public static e a(WebView webView, String str, Set set) {
        if (x.V.c()) {
            return h(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw x.a();
    }

    public static void b(WebView webView, String str, Set set, a aVar) {
        if (!x.U.c()) {
            throw x.a();
        }
        h(webView).b(str, (String[]) set.toArray(new String[0]), aVar);
    }

    public static void c(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        Looper looperB = j.b(webView);
        if (looperB == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + looperB + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    public static WebViewProviderBoundaryInterface d(WebView webView) {
        return f().createWebView(webView);
    }

    public static PackageInfo e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return c2.e.a();
        }
        try {
            return g();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static a0 f() {
        return y.d();
    }

    public static PackageInfo g() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static z h(WebView webView) {
        return new z(d(webView));
    }

    public static String i() {
        if (x.X.c()) {
            return f().getStatics().getVariationsHeader();
        }
        throw x.a();
    }

    public static WebViewClient j(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a.e eVar = x.H;
        if (eVar.b()) {
            return c2.e.b(webView);
        }
        if (!eVar.c()) {
            throw x.a();
        }
        c(webView);
        return h(webView).c();
    }

    public static boolean k() {
        if (x.R.c()) {
            return f().getStatics().isMultiProcessEnabled();
        }
        throw x.a();
    }

    public static void l(WebView webView, String str) {
        if (!x.U.c()) {
            throw x.a();
        }
        h(webView).d(str);
    }

    public static void m(WebView webView, boolean z10) {
        if (!x.f4675f0.c()) {
            throw x.a();
        }
        h(webView).e(z10);
    }

    public static void n(WebView webView, String str) {
        if (!x.f4669c0.c()) {
            throw x.a();
        }
        h(webView).f(str);
    }
}
