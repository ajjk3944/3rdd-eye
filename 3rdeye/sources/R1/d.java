package R1;

import S1.i;
import S1.k;
import S1.l;
import S1.m;
import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import ka.a;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: WebViewCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11635a = 0;

    /* compiled from: WebViewCompat.java */
    public interface a {
        void onPostMessage(WebView webView, c cVar, Uri uri, boolean z10, R1.a aVar);
    }

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set<String> set, a aVar) {
        if (!k.f11859d.d()) {
            throw k.a();
        }
        m mVarC = c(webView);
        String[] strArr = (String[]) set.toArray(new String[0]);
        i iVar = new i();
        iVar.f11854a = aVar;
        mVarC.f11864a.addWebMessageListener(str, strArr, new a.C0486a(iVar));
    }

    @SuppressLint({"PrivateApi"})
    public static PackageInfo b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static m c(WebView webView) {
        WebViewProviderBoundaryInterface webViewProviderBoundaryInterfaceCreateWebView = l.a.f11863a.createWebView(webView);
        m mVar = new m();
        mVar.f11864a = webViewProviderBoundaryInterfaceCreateWebView;
        return mVar;
    }
}
