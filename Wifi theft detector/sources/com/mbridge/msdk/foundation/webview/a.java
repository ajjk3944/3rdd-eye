package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class a implements BrowserView.e {

    /* renamed from: o, reason: collision with root package name */
    private static String f15577o = "a";

    /* renamed from: a, reason: collision with root package name */
    private int f15578a;

    /* renamed from: c, reason: collision with root package name */
    private String f15580c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15581d;

    /* renamed from: e, reason: collision with root package name */
    private BaseTrackingListener f15582e;

    /* renamed from: f, reason: collision with root package name */
    private BrowserView f15583f;

    /* renamed from: g, reason: collision with root package name */
    private CampaignEx f15584g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.a f15585h;

    /* renamed from: i, reason: collision with root package name */
    private Context f15586i;

    /* renamed from: k, reason: collision with root package name */
    private JumpLoaderResult f15588k;

    /* renamed from: n, reason: collision with root package name */
    private long f15591n;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15579b = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15589l = false;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f15590m = new RunnableC0271a();

    /* renamed from: j, reason: collision with root package name */
    private Handler f15587j = new Handler(Looper.getMainLooper());

    /* renamed from: com.mbridge.msdk.foundation.webview.a$a, reason: collision with other inner class name */
    public class RunnableC0271a implements Runnable {
        public RunnableC0271a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b(a.f15577o, "webview js！超时上限：" + a.this.f15578a + "ms");
            if (a.this.f15585h != null && a.this.f15588k != null) {
                a.this.f15588k.setSuccess(false);
                a.this.f15588k.setUrl(a.this.f15580c);
                a.this.f15588k.setType(2);
                a.this.f15588k.setExceptionMsg("linktype 8 time out");
                a.this.f15585h.a(a.this.f15588k, a.this.f15584g, 1, false);
            }
            a aVar = a.this;
            if (aVar.b(null, aVar.f15580c) && !a.this.f15589l) {
                a.this.f15589l = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f15586i, a.this.f15580c, a.this.f15584g);
            }
            if (a.this.f15582e != null) {
                a.this.f15582e.onFinishRedirection(a.this.f15584g, a.this.f15580c);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15593a;

        public b(String str) {
            this.f15593a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f15585h != null && a.this.f15588k != null) {
                a.this.f15588k.setSuccess(true);
                a.this.f15588k.setUrl(this.f15593a);
                a.this.f15588k.setType(2);
                a.this.f15585h.a(a.this.f15588k, a.this.f15584g, 1, true);
            }
            if (a.this.f15582e != null) {
                a.this.f15582e.onFinishRedirection(a.this.f15584g, this.f15593a);
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15595a;

        public c(String str) {
            this.f15595a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f15582e != null) {
                a.this.f15582e.onFinishRedirection(a.this.f15584g, this.f15595a);
            }
            if (a.this.f15585h == null || a.this.f15588k == null) {
                return;
            }
            a.this.f15588k.setSuccess(true);
            a.this.f15588k.setUrl(this.f15595a);
            a.this.f15588k.setType(2);
            a.this.f15585h.a(a.this.f15588k, a.this.f15584g, 1, true);
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15598b;

        public d(String str, String str2) {
            this.f15597a = str;
            this.f15598b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f15582e != null) {
                a.this.f15582e.onFinishRedirection(a.this.f15584g, this.f15597a);
            }
            if (a.this.f15585h == null || a.this.f15588k == null) {
                return;
            }
            a.this.f15588k.setSuccess(false);
            a.this.f15588k.setUrl(this.f15597a);
            a.this.f15588k.setType(2);
            a.this.f15588k.setExceptionMsg(this.f15598b);
            a.this.f15585h.a(a.this.f15588k, a.this.f15584g, 1, true);
        }
    }

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f15578a = 10000;
        this.f15588k = null;
        this.f15586i = context;
        this.f15584g = campaignEx;
        this.f15583f = browserView;
        this.f15582e = baseTrackingListener;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        gVarD = gVarD == null ? h.b().a() : gVarD;
        this.f15585h = aVar;
        this.f15588k = new JumpLoaderResult();
        this.f15578a = (int) gVarD.s0();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a() {
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageFinished(WebView webView, String str) {
        q0.b(f15577o, "onPageFinished1  " + str);
        if (this.f15579b) {
            this.f15591n = 0L;
            this.f15579b = false;
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new c(str));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri uri = Uri.parse(str);
            if ((uri.getScheme().equals("http") || uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) && !this.f15589l) {
                this.f15589l = true;
                a(this.f15586i, str, this.f15584g);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f15591n == 0) {
            this.f15591n = System.currentTimeMillis();
            if (!this.f15581d) {
                this.f15581d = true;
                d();
            }
            this.f15589l = false;
        }
        this.f15580c = str;
        this.f15579b = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        q0.d(f15577o, str);
        c();
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(str2, str));
        if (!b(webView, str2) || this.f15589l) {
            return;
        }
        this.f15589l = true;
        a(this.f15586i, str2, this.f15584g);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        q0.b(f15577o, "shouldOverrideUrlLoading1  " + str);
        this.f15579b = false;
        if (u0.a.b(str) && u0.a.a(this.f15586i, str, null)) {
            this.f15589l = true;
        }
        boolean zC = c(webView, str);
        if (zC) {
            this.f15591n = 0L;
            this.f15579b = false;
            c();
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new b(str));
        }
        return zC;
    }

    private boolean c(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th) {
            q0.b(f15577o, th.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (!uri.getScheme().equals("http") && !uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
            if (uri.getScheme().equals("intent")) {
                Intent uri2 = Intent.parseUri(str, 1);
                try {
                    str2 = uri2.getPackage();
                } catch (Throwable th2) {
                    q0.b(f15577o, th2.getMessage());
                }
                if (!TextUtils.isEmpty(str2) && this.f15586i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    uri2.setFlags(268435456);
                    this.f15586i.startActivity(uri2);
                    this.f15589l = true;
                    return true;
                }
                try {
                    String stringExtra = uri2.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Uri uri3 = Uri.parse(str);
                        if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                            str = stringExtra;
                        }
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                } catch (Throwable th3) {
                    q0.b(f15577o, th3.getMessage());
                }
                q0.b(f15577o, th.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(this.f15586i, str)) {
                q0.b(f15577o, "openDeepLink");
                this.f15589l = true;
                return true;
            }
        }
        return false;
    }

    private void d() {
        this.f15587j.postDelayed(this.f15590m, this.f15578a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2)) {
                            if (this.f15586i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                                return false;
                            }
                        }
                    } catch (Throwable th) {
                        q0.b(f15577o, th.getMessage());
                    }
                    try {
                        String stringExtra = uri2.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri uri3 = Uri.parse(str);
                            if (!uri3.getScheme().equals("http")) {
                                if (!uri3.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) {
                                    str = stringExtra;
                                }
                            }
                            return true;
                        }
                    } catch (Throwable th2) {
                        q0.b(f15577o, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f15586i, str)) {
                    q0.b(f15577o, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th3) {
            q0.b(f15577o, th3.getMessage());
            return true;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a(WebView webView, String str) {
        if (this.f15591n == 0) {
            this.f15591n = System.currentTimeMillis();
            if (!this.f15581d) {
                this.f15581d = true;
                d();
            }
        }
        this.f15580c = str;
        this.f15579b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i10 = MBCommonActivity.f12667e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.webview.b.f15600a.put(str, this.f15583f);
            if (u0.a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            q0.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            u0.a(context, str, this.f15582e, campaignEx, new ArrayList());
        }
    }

    private void c() {
        this.f15587j.removeCallbacks(this.f15590m);
    }
}
