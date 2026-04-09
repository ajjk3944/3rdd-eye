package c2;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.WebMessageCompat;
import b2.g;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* loaded from: classes.dex */
public class u implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public final g.a f4660a;

    public u(g.a aVar) {
        this.f4660a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        WebMessageCompat webMessageCompatB = t.b((WebMessageBoundaryInterface) da.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (webMessageCompatB != null) {
            this.f4660a.onPostMessage(webView, webMessageCompatB, uri, z10, n.b(invocationHandler2));
        }
    }
}
