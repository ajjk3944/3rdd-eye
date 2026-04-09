package qg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f32328a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressBar f32329b;

    /* renamed from: c, reason: collision with root package name */
    public final Toolbar f32330c;

    /* renamed from: d, reason: collision with root package name */
    public final WebView f32331d;

    public /* synthetic */ c(FrameLayout frameLayout, ProgressBar progressBar, Toolbar toolbar, WebView webView) {
        this.f32328a = frameLayout;
        this.f32329b = progressBar;
        this.f32330c = toolbar;
        this.f32331d = webView;
    }

    public static c a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_web, (ViewGroup) null, false);
        int i4 = R.id.progress;
        ProgressBar progressBar = (ProgressBar) wb.e.s(R.id.progress, viewInflate);
        if (progressBar != null) {
            i4 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) wb.e.s(R.id.toolbar, viewInflate);
            if (toolbar != null) {
                i4 = R.id.webview;
                WebView webView = (WebView) wb.e.s(R.id.webview, viewInflate);
                if (webView != null) {
                    return new c((FrameLayout) viewInflate, progressBar, toolbar, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    public static c b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.appi_acitvity_manifest, (ViewGroup) null, false);
        int i4 = R.id.progress;
        ProgressBar progressBar = (ProgressBar) wb.e.s(R.id.progress, viewInflate);
        if (progressBar != null) {
            i4 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) wb.e.s(R.id.toolbar, viewInflate);
            if (toolbar != null) {
                i4 = R.id.webview;
                WebView webView = (WebView) wb.e.s(R.id.webview, viewInflate);
                if (webView != null) {
                    return new c((FrameLayout) viewInflate, progressBar, toolbar, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
