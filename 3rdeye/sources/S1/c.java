package S1;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: ApiHelperForP.java */
/* loaded from: classes.dex */
public final class c {
    public static TracingController a() {
        return TracingController.getInstance();
    }

    public static ClassLoader b() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper c(WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean d(TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void e(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void f(TracingController tracingController, R1.b bVar) {
        I6.j.h();
        throw null;
    }

    public static boolean g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
