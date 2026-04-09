package T0;

import U0.j;
import U0.m;
import U0.n;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3557a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set set, e eVar) {
        if (!m.f3682d.b()) {
            throw m.a();
        }
        A0.e eVarC = c(webView);
        ((WebViewProviderBoundaryInterface) eVarC.f73b).addWebMessageListener(str, (String[]) set.toArray(new String[0]), new I5.a(new j(0, eVar)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static A0.e c(WebView webView) {
        return new A0.e(16, n.f3687a.createWebView(webView));
    }

    public static String d() {
        if (m.f3684f.b()) {
            return n.f3687a.getStatics().getVariationsHeader();
        }
        throw m.a();
    }

    public static WebViewClient e(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        U0.b bVar = m.f3680b;
        if (bVar.a()) {
            return webView.getWebViewClient();
        }
        if (!bVar.b()) {
            throw m.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Looper webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }
        return ((WebViewProviderBoundaryInterface) c(webView).f73b).getWebViewClient();
    }
}
