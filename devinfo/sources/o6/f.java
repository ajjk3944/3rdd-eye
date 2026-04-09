package o6;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.dynamicloading.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p6.l;
import p6.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f30411a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set set, e eVar) {
        if (!l.f31390d.b()) {
            throw l.a();
        }
        o.e eVarC = c(webView);
        ((WebViewProviderBoundaryInterface) eVarC.f30195b).addWebMessageListener(str, (String[]) set.toArray(new String[0]), new i(1, new p6.i(eVar)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static o.e c(WebView webView) {
        return new o.e(4, m.f31394a.createWebView(webView));
    }

    public static String d() {
        if (l.f31392f.b()) {
            return m.f31394a.getStatics().getVariationsHeader();
        }
        throw l.a();
    }

    public static WebViewClient e(WebView webView) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        p6.b bVar = l.f31388b;
        if (bVar.a()) {
            return ub.a.i(webView);
        }
        if (!bVar.b()) {
            throw l.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Looper looperU = a4.f.u(webView);
            if (looperU != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + looperU + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        return ((WebViewProviderBoundaryInterface) c(webView).f30195b).getWebViewClient();
    }

    public static void f(WebView webView, String str) {
        if (!l.f31390d.b()) {
            throw l.a();
        }
        ((WebViewProviderBoundaryInterface) c(webView).f30195b).removeWebMessageListener(str);
    }
}
