package com.mbridge.msdk.splash.manager;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17220a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17221b;

    public class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f17222a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBSplashView f17223b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17224c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17225d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f17226e;

        public a(c cVar, MBSplashView mBSplashView, CampaignEx campaignEx, String str, long j10) {
            this.f17222a = cVar;
            this.f17223b = mBSplashView;
            this.f17224c = campaignEx;
            this.f17225d = str;
            this.f17226e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            c cVar = this.f17222a;
            if (cVar != null) {
                cVar.a(i10);
            }
            if (i10 == 1) {
                g.this.f17220a = true;
                this.f17223b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f17224c, this.f17225d, "", this.f17226e, 1);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f17225d, this.f17224c);
                return;
            }
            g.this.f17220a = false;
            this.f17223b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "readyState 2", this.f17225d, this.f17224c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f17224c, this.f17225d, "readyState 2", this.f17226e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c cVar = this.f17222a;
            if (cVar != null) {
                cVar.a();
            }
            g.this.f17221b = true;
            if (!this.f17224c.isHasMBTplMark()) {
                this.f17223b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f17225d, this.f17224c);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f17224c, this.f17225d, "", this.f17226e, 1);
            }
            com.mbridge.msdk.splash.signal.c.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            c cVar = this.f17222a;
            if (cVar != null) {
                cVar.onError(str);
            }
            g.this.b();
            this.f17223b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error code:" + i10 + str, this.f17225d, this.f17224c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f17224c, this.f17225d, "error code:" + i10 + str, this.f17226e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            c cVar = this.f17222a;
            if (cVar != null) {
                cVar.onError(sslError.toString());
            }
            g.this.b();
            this.f17223b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error url:" + sslError.getUrl(), this.f17225d, this.f17224c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f17224c, this.f17225d, "error url:" + sslError.getUrl(), this.f17226e, 3);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final g f17228a = new g(null);
    }

    public interface c {
        void a();

        void a(int i10);

        void onError(String str);
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private String f17229a;

        /* renamed from: b, reason: collision with root package name */
        private String f17230b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f17231c;

        /* renamed from: d, reason: collision with root package name */
        private String f17232d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17233e;

        /* renamed from: f, reason: collision with root package name */
        private int f17234f;

        public void a(String str) {
            this.f17232d = str;
        }

        public void b(String str) {
            this.f17229a = str;
        }

        public String c() {
            return this.f17232d;
        }

        public String d() {
            return this.f17229a;
        }

        public String e() {
            return this.f17230b;
        }

        public boolean f() {
            return this.f17233e;
        }

        public CampaignEx a() {
            return this.f17231c;
        }

        public int b() {
            return this.f17234f;
        }

        public void c(String str) {
            this.f17230b = str;
        }

        public void a(CampaignEx campaignEx) {
            this.f17231c = campaignEx;
        }

        public void a(boolean z10) {
            this.f17233e = z10;
        }

        public void a(int i10) {
            this.f17234f = i10;
        }
    }

    public /* synthetic */ g(a aVar) {
        this();
    }

    private g() {
        this.f17220a = false;
        this.f17221b = false;
    }

    public static g a() {
        return b.f17228a;
    }

    public void b() {
        this.f17220a = false;
        this.f17221b = false;
    }

    public void a(MBSplashView mBSplashView, d dVar, c cVar) {
        String requestId;
        if (mBSplashView == null || dVar == null) {
            return;
        }
        String strE = dVar.e();
        String strD = dVar.d();
        CampaignEx campaignExA = dVar.a();
        String strC = dVar.c();
        boolean zF = dVar.f();
        int iB = dVar.b();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        com.mbridge.msdk.splash.signal.b bVar = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), strD, strE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignExA);
        bVar.a(arrayList);
        bVar.a(zF ? 1 : 0);
        bVar.b(iB);
        mBSplashView.setSplashSignalCommunicationImpl(bVar);
        if (TextUtils.isEmpty(campaignExA.getRequestId())) {
            requestId = campaignExA.getRequestIdNotice();
        } else {
            requestId = campaignExA.getRequestId();
        }
        String requestId2 = splashWebview.getRequestId();
        q0.b("WebViewRenderManager", "CampaignEx RequestId = " + requestId + " WebView RequestId = " + requestId2);
        if (!TextUtils.isEmpty(requestId2) && requestId2.equals(requestId) && (this.f17220a || this.f17221b)) {
            mBSplashView.setH5Ready(true);
            if (cVar != null) {
                cVar.a(1);
                return;
            }
            return;
        }
        b();
        splashWebview.setRequestId(requestId);
        com.mbridge.msdk.splash.report.a.b(strE, campaignExA);
        long jCurrentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new a(cVar, mBSplashView, campaignExA, strE, jCurrentTimeMillis));
        if (!splashWebview.isDestoryed()) {
            splashWebview.loadUrl(strC);
        } else {
            mBSplashView.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignExA, strE, "webview had destory", jCurrentTimeMillis, 3);
        }
    }
}
