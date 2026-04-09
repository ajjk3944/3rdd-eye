package com.mbridge.msdk.advanced.manager;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f12789a = "ResManager";

    /* renamed from: b, reason: collision with root package name */
    private static int f12790b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static e f12791c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));

    public class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12792a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12793b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12794c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f12795d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12796e;

        public a(String str, String str2, CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, long j10) {
            this.f12792a = str;
            this.f12793b = str2;
            this.f12794c = campaignEx;
            this.f12795d = mBNativeAdvancedView;
            this.f12796e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            if (i10 != 1) {
                this.f12795d.setH5Ready(false);
                q0.a("WindVaneWebView", "======渲染失败");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12794c, this.f12793b, "readyState 2", this.f12796e, 3);
                return;
            }
            com.mbridge.msdk.advanced.common.c.a(this.f12792a + this.f12793b + this.f12794c.getRequestId(), true);
            this.f12795d.setH5Ready(true);
            q0.a("WindVaneWebView", "======渲染成功：ready");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12794c, this.f12793b, "", this.f12796e, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f12794c.isHasMBTplMark()) {
                com.mbridge.msdk.advanced.common.c.a(this.f12792a + this.f12793b + this.f12794c.getRequestId(), true);
                this.f12795d.setH5Ready(true);
                q0.a("WindVaneWebView", "======渲染成功：finish");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12794c, this.f12793b, "", this.f12796e, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            this.f12795d.setH5Ready(false);
            q0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12794c, this.f12793b, "error code:" + i10 + str, this.f12796e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            this.f12795d.setH5Ready(false);
            q0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12794c, this.f12793b, "error url:" + sslError.getUrl(), this.f12796e, 3);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f12797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12798b;

        public b(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f12797a = mBNativeAdvancedWebview;
            this.f12798b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12797a.loadUrl(this.f12798b);
        }
    }

    public static CampaignEx a(MBNativeAdvancedView mBNativeAdvancedView, String str, String str2, String str3, int i10, boolean z10, boolean z11) {
        com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = h.b().a();
        }
        long jB0 = gVarD.b0() * 1000;
        long jC0 = gVarD.c0() * 1000;
        a(jC0, str2);
        List<CampaignEx> listA = a(str2, str3);
        if (listA != null && listA.size() > 0) {
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - jB0;
            if (z10) {
                if ((campaignEx.getPlct() <= 0 || (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() < jCurrentTimeMillis) && (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j10)) {
                    if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11) && campaignEx.isSpareOffer(jB0, jC0)) {
                        return a(campaignEx);
                    }
                    if (!campaignEx.isSpareOffer(jB0, jC0) && mBNativeAdvancedView != null) {
                        mBNativeAdvancedView.setVisibility(8);
                    }
                } else if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                    q0.b(f12789a, "cache campain is picked:" + campaignEx.getAppName());
                    return a(campaignEx);
                }
            } else if ((campaignEx.getPlct() <= 0 || (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() < jCurrentTimeMillis) && (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j10)) {
                q0.a(f12789a, "========已经超了缓存时间");
                if (!campaignEx.isSpareOffer(jB0, jC0) && mBNativeAdvancedView != null) {
                    mBNativeAdvancedView.setVisibility(8);
                    return null;
                }
            } else if (a(mBNativeAdvancedView, campaignEx, str, str2, i10, z11)) {
                q0.b(f12789a, "cache campain is picked:" + campaignEx.getAppName());
                return a(campaignEx);
            }
        }
        return null;
    }

    public static void b(String str) {
        if (f12791c == null) {
            f12791c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f12791c.a(str, 0, f12790b);
    }

    private static List<CampaignEx> a(String str, String str2) {
        if (f12791c == null) {
            f12791c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        return f12791c.b(str, 0, 0, f12790b);
    }

    private static CampaignEx a(CampaignEx campaignEx) {
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
            return campaignEx;
        }
        campaignEx.setHasMBTplMark(true);
        campaignEx.setIsMraid(false);
        return campaignEx;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.mbridge.msdk.advanced.view.MBNativeAdvancedView r9, com.mbridge.msdk.foundation.entity.CampaignEx r10, java.lang.String r11, java.lang.String r12, int r13, boolean r14) {
        /*
            r6 = 0
            if (r10 == 0) goto Lf9
            r9.clearResState()
            java.lang.String r1 = r10.getVideoUrlEncode()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r7 = 1
            if (r1 != 0) goto L26
            com.mbridge.msdk.videocommon.download.b r1 = com.mbridge.msdk.videocommon.download.b.getInstance()
            boolean r2 = r10.isBidCampaign()
            r5 = 298(0x12a, float:4.18E-43)
            boolean r1 = r1.b(r5, r12, r2)
            if (r1 == 0) goto L24
            r9.setVideoReady(r7)
        L24:
            r8 = r1
            goto L2a
        L26:
            r9.setVideoReady(r7)
            r8 = r7
        L2a:
            java.lang.String r1 = r10.getendcard_url()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4f
            boolean r1 = r9.isEndCardReady()
            if (r1 != 0) goto L4f
            com.mbridge.msdk.foundation.download.download.H5DownLoadManager r1 = com.mbridge.msdk.foundation.download.download.H5DownLoadManager.getInstance()
            java.lang.String r2 = r10.getendcard_url()
            java.lang.String r1 = r1.getH5ResAddress(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4f
            r9.setEndCardReady(r7)
        L4f:
            java.lang.String r1 = r10.getAdZip()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L9c
            boolean r1 = r9.isH5Ready()
            if (r1 != 0) goto L9c
            com.mbridge.msdk.foundation.download.download.H5DownLoadManager r1 = com.mbridge.msdk.foundation.download.download.H5DownLoadManager.getInstance()
            java.lang.String r2 = r10.getAdZip()
            java.lang.String r1 = r1.getH5ResAddress(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L9b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r12)
            java.lang.String r5 = r10.getRequestId()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            boolean r2 = com.mbridge.msdk.advanced.common.c.a(r2)
            if (r2 == 0) goto L91
            r9.setH5Ready(r7)
            goto L9c
        L91:
            r0 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            a(r0, r1, r2, r3, r4, r5)
            if (r14 != 0) goto L9c
        L9b:
            r8 = r6
        L9c:
            java.lang.String r1 = r10.getAdZip()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lf8
            java.lang.String r1 = r10.getAdHtml()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lf8
            boolean r1 = r9.isH5Ready()
            if (r1 != 0) goto Lf8
            java.lang.String r1 = r10.getAdHtml()
            java.lang.String r1 = a(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Lf7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r12)
            java.lang.String r5 = r10.getRequestId()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            boolean r2 = com.mbridge.msdk.advanced.common.c.a(r2)
            if (r2 == 0) goto Led
            r9.setH5Ready(r7)
            boolean r1 = r10.isMraid()
            if (r1 == 0) goto Lec
            r9.setVideoReady(r7)
        Lec:
            return r7
        Led:
            r0 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            a(r0, r1, r2, r3, r4, r5)
            if (r14 != 0) goto Lf8
        Lf7:
            return r6
        Lf8:
            return r8
        Lf9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.advanced.manager.d.a(com.mbridge.msdk.advanced.view.MBNativeAdvancedView, com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.String, java.lang.String, int, boolean):boolean");
    }

    private static void a(MBNativeAdvancedView mBNativeAdvancedView, String str, CampaignEx campaignEx, String str2, String str3, int i10) {
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(str3, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(i10);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(bVar);
        MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
        long jCurrentTimeMillis = System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new a(str2, str3, campaignEx, mBNativeAdvancedView, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            q0.a(f12789a, "======开始渲染：" + str);
            new Handler(Looper.getMainLooper()).post(new b(advancedNativeWebview, str));
            return;
        }
        mBNativeAdvancedView.setH5Ready(false);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str3, "webview had destory", jCurrentTimeMillis, 3);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e10) {
                e10.getMessage();
                return "";
            }
        }
    }

    public static boolean a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2) {
        boolean zA;
        boolean z10 = false;
        if (mBNativeAdvancedView == null) {
            q0.b(f12789a, "mbAdvancedNativeView  is null");
            return false;
        }
        if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            zA = true;
        } else {
            zA = mBNativeAdvancedView.isVideoReady();
            q0.b(f12789a, "======isReady isVideoReady:" + zA);
        }
        if (zA && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            zA = com.mbridge.msdk.advanced.common.c.a(str + str2 + campaignEx.getRequestId());
            q0.b(f12789a, "======isReady getAdZip:" + zA);
        }
        if (zA && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            zA = com.mbridge.msdk.advanced.common.c.a(str + str2 + campaignEx.getRequestId());
            q0.b(f12789a, "======isReady getAdHtml:" + zA);
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.b(f12789a, "======isReady getAdHtml  getAdZip all are empty");
        } else {
            z10 = zA;
        }
        if (!z10 || TextUtils.isEmpty(campaignEx.getendcard_url())) {
            return z10;
        }
        boolean zIsEndCardReady = mBNativeAdvancedView.isEndCardReady();
        q0.b(f12789a, "======isReady isEndCardReady:" + zIsEndCardReady);
        return zIsEndCardReady;
    }

    public static void a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (f12791c == null) {
            f12791c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f12791c.a(arrayList, str);
    }

    public static void a(long j10, String str) {
        if (f12791c == null) {
            f12791c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        f12791c.a(j10, str);
    }
}
