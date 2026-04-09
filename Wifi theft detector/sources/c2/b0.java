package c2;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f4645a;

    public b0(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f4645a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // c2.a0
    public String[] a() {
        return this.f4645a.getSupportedFeatures();
    }

    @Override // c2.a0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) da.a.a(WebViewProviderBoundaryInterface.class, this.f4645a.createWebView(webView));
    }

    @Override // c2.a0
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) da.a.a(DropDataContentProviderBoundaryInterface.class, this.f4645a.getDropDataProvider());
    }

    @Override // c2.a0
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) da.a.a(ProfileStoreBoundaryInterface.class, this.f4645a.getProfileStore());
    }

    @Override // c2.a0
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) da.a.a(StaticsBoundaryInterface.class, this.f4645a.getStatics());
    }

    @Override // c2.a0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) da.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f4645a.getWebkitToCompatConverter());
    }
}
