package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;
import com.unity3d.services.core.network.model.HttpRequest;

/* loaded from: classes3.dex */
public class DomainMBCommonActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    String f12654a = "";

    /* renamed from: b, reason: collision with root package name */
    private final BrowserView.e f12655b = new a();
    protected BrowserView browserView;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f12656c;

    public class a implements BrowserView.e {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onPageFinished(WebView webView, String str) {
            q0.b("MBCommonActivity", "onPageFinished  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.b("MBCommonActivity", "onPageStarted  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q0.b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (u0.a.b(str) && u0.a.a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.a(webView, str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a() {
            DomainMBCommonActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            q0.b("MBCommonActivity", th.getMessage());
        }
        if (c.n().d() == null) {
            c.n().b(getApplicationContext());
        }
        c.n().a(this);
        a();
    }

    private void a() {
        String stringExtra = getIntent().getStringExtra("url");
        this.f12654a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, "Error: no data", 0).show();
            return;
        }
        this.f12656c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
        if (b.f15600a.containsKey(this.f12654a)) {
            BrowserView browserView = b.f15600a.get(this.f12654a);
            this.browserView = browserView;
            if (browserView != null) {
                browserView.setListener(this.f12655b);
            }
        } else {
            BrowserView browserView2 = new BrowserView(this, this.f12656c);
            this.browserView = browserView2;
            browserView2.setListener(this.f12655b);
            this.browserView.loadUrl(this.f12654a);
        }
        BrowserView browserView3 = this.browserView;
        if (browserView3 != null) {
            f1.a(browserView3);
            setContentView(this.browserView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        Intent uri;
        String str2;
        try {
        } catch (Throwable th) {
            q0.b("MBCommonActivity", th.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri2 = Uri.parse(str);
        if (!uri2.getScheme().equals("http") && !uri2.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
            if (uri2.getScheme().equals("intent") || uri2.getScheme().equals("android-app")) {
                String stringExtra = null;
                if (uri2.getScheme().equals("intent")) {
                    uri = Intent.parseUri(str, 1);
                } else {
                    uri = uri2.getScheme().equals("android-app") ? Intent.parseUri(str, 2) : null;
                }
                if (uri != null) {
                    uri.setComponent(null);
                    uri.setSelector(null);
                }
                if (uri == null) {
                    str2 = "";
                } else {
                    try {
                        str2 = uri.getPackage();
                    } catch (Throwable th2) {
                        q0.b("MBCommonActivity", th2.getMessage());
                    }
                }
                if (!TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    if (uri != null) {
                        uri.setFlags(268435456);
                    }
                    startActivityForResult(uri, 0);
                    finish();
                    return true;
                }
                if (uri != null) {
                    try {
                        stringExtra = uri.getStringExtra("browser_fallback_url");
                    } catch (Throwable th3) {
                        q0.b("MBCommonActivity", th3.getMessage());
                    }
                }
                if (!TextUtils.isEmpty(stringExtra)) {
                    Uri uri3 = Uri.parse(str);
                    if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                        str = stringExtra;
                    }
                    webView.loadUrl(stringExtra);
                    return false;
                }
                q0.b("MBCommonActivity", th.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(this, str)) {
                q0.b("MBCommonActivity", "openDeepLink");
                finish();
                return true;
            }
            if (!TextUtils.isEmpty(str)) {
                return !(str.startsWith("http") || str.startsWith(HttpRequest.DEFAULT_SCHEME));
            }
        }
        return false;
    }
}
