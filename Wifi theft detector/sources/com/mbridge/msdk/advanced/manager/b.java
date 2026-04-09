package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.out.MBridgeIds;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: z, reason: collision with root package name */
    private static String f12717z = "NativeAdvancedLoadManager";

    /* renamed from: a, reason: collision with root package name */
    private String f12718a;

    /* renamed from: b, reason: collision with root package name */
    private String f12719b;

    /* renamed from: c, reason: collision with root package name */
    private long f12720c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.b f12721d;

    /* renamed from: f, reason: collision with root package name */
    private MBNativeAdvancedView f12723f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.setting.l f12724g;

    /* renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f12725h;

    /* renamed from: i, reason: collision with root package name */
    private CampaignEx f12726i;

    /* renamed from: j, reason: collision with root package name */
    private int f12727j;

    /* renamed from: k, reason: collision with root package name */
    private int f12728k;

    /* renamed from: l, reason: collision with root package name */
    private int f12729l;

    /* renamed from: m, reason: collision with root package name */
    private int f12730m;

    /* renamed from: n, reason: collision with root package name */
    private String f12731n;

    /* renamed from: o, reason: collision with root package name */
    private int f12732o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12733p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f12734q;

    /* renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f12735r;

    /* renamed from: s, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f12736s;

    /* renamed from: t, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f12737t;

    /* renamed from: u, reason: collision with root package name */
    private String f12738u;

    /* renamed from: v, reason: collision with root package name */
    private int f12739v;

    /* renamed from: w, reason: collision with root package name */
    private String f12740w = "";

    /* renamed from: x, reason: collision with root package name */
    private Handler f12741x = new e(Looper.getMainLooper());

    /* renamed from: y, reason: collision with root package name */
    private Runnable f12742y = new f();

    /* renamed from: e, reason: collision with root package name */
    private Context f12722e = com.mbridge.msdk.foundation.controller.c.n().d();

    public class a implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12743a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12744b;

        public a(CampaignEx campaignEx, int i10) {
            this.f12743a = campaignEx;
            this.f12744b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f12717z, "zip 下载失败： " + str2 + " " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f12743a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 3);
            messageObtain.obj = bundle;
            b.this.f12741x.sendMessage(messageObtain);
            b.this.a(this.f12743a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f12717z, "zip 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f12743a;
            messageObtain.arg1 = this.f12744b;
            b.this.f12741x.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            b.this.a(this.f12743a, str, true, "");
        }
    }

    /* renamed from: com.mbridge.msdk.advanced.manager.b$b, reason: collision with other inner class name */
    public class C0232b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12746a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12747b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f12748c;

        public C0232b(CampaignEx campaignEx, int i10, long j10) {
            this.f12746a = campaignEx;
            this.f12747b = i10;
            this.f12748c = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) throws Throwable {
            super.a(webView, i10);
            q0.b("NativeAdvancedLoadManager", "=========readyState: " + i10);
            if (i10 != 1) {
                b.this.a(this.f12746a, "readyState 2", this.f12747b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12746a, b.this.f12718a, "readyState 2", this.f12748c, 3);
                return;
            }
            b.this.f12723f.setH5Ready(true);
            com.mbridge.msdk.advanced.common.c.a(b.this.f12719b + b.this.f12718a + this.f12746a.getRequestId(), true);
            b.this.h(this.f12746a, this.f12747b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12746a, b.this.f12718a, "", this.f12748c, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.f12746a.isHasMBTplMark()) {
                b.this.f12723f.setH5Ready(true);
                q0.b("NativeAdvancedLoadManager", "=======onPageFinished OK");
                com.mbridge.msdk.advanced.common.c.a(b.this.f12719b + b.this.f12718a + this.f12746a.getRequestId(), true);
                b.this.h(this.f12746a, this.f12747b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12746a, b.this.f12718a, "", this.f12748c, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) throws Throwable {
            super.onReceivedError(webView, i10, str, str2);
            q0.b("NativeAdvancedLoadManager", "onReceivedError： " + i10 + "  " + str + "  " + str2);
            b.this.a(this.f12746a, str, this.f12747b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12746a, b.this.f12718a, "error code:" + i10 + str, this.f12748c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws Throwable {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            q0.b("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            b.this.a(this.f12746a, "onReceivedSslError:" + sslError.getUrl(), this.f12747b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12746a, b.this.f12718a, "error url:" + sslError.getUrl(), this.f12748c, 3);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f12750a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12751b;

        public c(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f12750a = mBNativeAdvancedWebview;
            this.f12751b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12750a.loadUrl(this.f12751b);
        }
    }

    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            Object obj;
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                Object obj2 = message.obj;
                int i11 = message.arg1;
                if (obj2 == null || !(obj2 instanceof CampaignEx)) {
                    return;
                }
                CampaignEx campaignEx = (CampaignEx) obj2;
                b.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i11);
                return;
            }
            if (i10 == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i12 = ((Bundle) obj3).getInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i12 == 1 ? 880004 : i12 == 2 ? 880007 : i12 == 3 ? 880006 : 880024);
                        String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                        bVar.c(string);
                        bVar.a(campaignEx2);
                        b bVar2 = b.this;
                        bVar2.a(bVar, bVar2.f12731n, b.this.f12732o, campaignEx2);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880000);
                    bVar3.a((Throwable) e10);
                    b bVar4 = b.this;
                    bVar4.a(bVar3, bVar4.f12731n, b.this.f12732o, (CampaignEx) null);
                    return;
                }
            }
            if (i10 == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof CampaignEx)) {
                    return;
                }
                b bVar5 = b.this;
                bVar5.i((CampaignEx) obj4, bVar5.f12732o);
                return;
            }
            if (i10 != 4) {
                if (i10 == 5 && (obj = message.obj) != null && (obj instanceof CampaignEx)) {
                    if (b.this.f12723f != null) {
                        b.this.f12723f.setVideoReady(true);
                    }
                    b bVar6 = b.this;
                    bVar6.i((CampaignEx) obj, bVar6.f12732o);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof CampaignEx)) {
                return;
            }
            if (b.this.f12723f != null) {
                b.this.f12723f.setEndCardReady(true);
            }
            b bVar7 = b.this;
            bVar7.i((CampaignEx) obj5, bVar7.f12732o);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            b bVar2 = b.this;
            bVar2.a(bVar, bVar2.f12731n, b.this.f12732o, (CampaignEx) null);
        }
    }

    public class g extends com.mbridge.msdk.advanced.request.b {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f12757e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12758f;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f12760a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f12761b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f12762c;

            public a(Exception exc, int i10, CampaignUnit campaignUnit) {
                this.f12760a = exc;
                this.f12761b = i10;
                this.f12762c = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) this.f12760a);
                g gVar = g.this;
                b bVar2 = b.this;
                String str = gVar.f12757e;
                int i10 = this.f12761b;
                CampaignUnit campaignUnit = this.f12762c;
                bVar2.a(bVar, str, i10, (campaignUnit == null || campaignUnit.getAds() == null || this.f12762c.getAds().size() == 0) ? null : this.f12762c.getAds().get(0));
            }
        }

        /* renamed from: com.mbridge.msdk.advanced.manager.b$g$b, reason: collision with other inner class name */
        public class RunnableC0233b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f12764a;

            public RunnableC0233b(String str) {
                this.f12764a = str;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
                bVar.c(this.f12764a);
                g gVar = g.this;
                b.this.a(bVar, gVar.f12757e, gVar.f12758f, (CampaignEx) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, String str, int i11) {
            super(i10);
            this.f12757e = str;
            this.f12758f = i11;
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                b bVar = b.this;
                bVar.a(campaignUnit, i10, bVar.f12718a, this.f12757e);
                b.this.f12740w = campaignUnit.getRequestId();
                b.this.f12725h = campaignUnit.getAds();
            } catch (Exception e10) {
                q0.b(b.f12717z, e10.getMessage());
                q0.c(b.f12717z, "onLoadCompaginSuccess 数据刚请求失败");
                if (b.this.f12741x != null) {
                    b.this.f12741x.post(new a(e10, i10, campaignUnit));
                }
                b.this.f();
            }
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void b(int i10, String str) {
            q0.b(b.f12717z, str);
            q0.c(b.f12717z, "onLoadCompaginFailed load failed errorCode:" + i10 + " msg:" + str);
            if (b.this.f12741x != null) {
                b.this.f12741x.post(new RunnableC0233b(str));
            }
            b.this.f();
        }
    }

    public class h extends c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12766a;

        public h(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f12766a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.advanced.report.a.a(str, cVar, this.f12766a, b.this.f12722e, null);
        }
    }

    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12768a;

        public i(CampaignEx campaignEx) {
            this.f12768a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(b.this.f12722e)).d();
            y.a(b.this.f12722e, this.f12768a);
        }
    }

    public class j implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12770a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12771b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f12770a, jVar.f12771b);
            }
        }

        /* renamed from: com.mbridge.msdk.advanced.manager.b$j$b, reason: collision with other inner class name */
        public class RunnableC0234b implements Runnable {
            public RunnableC0234b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f12770a, jVar.f12771b);
            }
        }

        public j(CampaignEx campaignEx, int i10) {
            this.f12770a = campaignEx;
            this.f12771b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.a(b.f12717z, "gifurl 下载失败： " + str2);
            if (b.this.f12741x != null) {
                b.this.f12741x.post(new RunnableC0234b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            q0.a(b.f12717z, "giturl 下载成功： " + str);
            if (b.this.f12741x != null) {
                b.this.f12741x.post(new a());
            }
        }
    }

    public class k implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12775a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12776b;

        public k(CampaignEx campaignEx, int i10) {
            this.f12775a = campaignEx;
            this.f12776b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f12717z, "endcard 下载失败： " + str2);
            if (b.this.f12723f != null) {
                b.this.f12723f.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f12775a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 2);
            messageObtain.obj = bundle;
            b.this.f12741x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f12717z, "endcard 下载成功： " + str);
            if (b.this.f12741x != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f12775a;
                messageObtain.arg1 = this.f12776b;
                b.this.f12741x.sendMessage(messageObtain);
            }
        }
    }

    public class l implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12779b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f12778a, lVar.f12779b);
            }
        }

        /* renamed from: com.mbridge.msdk.advanced.manager.b$l$b, reason: collision with other inner class name */
        public class RunnableC0235b implements Runnable {
            public RunnableC0235b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f12778a, lVar.f12779b);
            }
        }

        public l(CampaignEx campaignEx, int i10) {
            this.f12778a = campaignEx;
            this.f12779b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.a(b.f12717z, "image 下载失败： " + str2);
            if (b.this.f12741x != null) {
                b.this.f12741x.post(new RunnableC0235b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            q0.a(b.f12717z, "image 下载成功： " + str);
            if (b.this.f12741x != null) {
                b.this.f12741x.post(new a());
            }
        }
    }

    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f12783a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12784b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12785c;

        public m(File file, CampaignEx campaignEx, int i10) {
            this.f12783a = file;
            this.f12784b = campaignEx;
            this.f12785c = i10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.a("file:////" + this.f12783a.getAbsolutePath(), this.f12784b, this.f12785c);
        }
    }

    public b(String str, String str2, long j10) {
        this.f12719b = str;
        this.f12718a = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.advanced.manager.d.a(this.f12723f, campaignEx, this.f12719b, this.f12718a) || this.f12734q) {
            return;
        }
        b();
        com.mbridge.msdk.advanced.manager.d.a(campaignEx, this.f12718a);
        this.f12734q = true;
        com.mbridge.msdk.advanced.middle.b bVar = this.f12721d;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void j(CampaignEx campaignEx, int i10) throws Throwable {
        this.f12726i = campaignEx;
        if (com.mbridge.msdk.advanced.manager.d.a(this.f12723f, campaignEx, this.f12719b, this.f12718a)) {
            i(campaignEx, i10);
        } else {
            e(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f12739v = 0;
    }

    private void g() {
        try {
            int i10 = this.f12739v + 1;
            this.f12739v = i10;
            com.mbridge.msdk.setting.l lVar = this.f12724g;
            if (lVar == null || i10 > lVar.y()) {
                q0.c(f12717z, "onload 重置offset为0");
                this.f12739v = 0;
            }
            q0.c(f12717z, "onload 算出 下次的offset是:" + this.f12739v);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (this.f12723f.isH5Ready()) {
            i(campaignEx, i10);
            com.mbridge.msdk.advanced.report.a.a(1, "", this.f12718a, campaignEx);
        }
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f12725h);
    }

    public String d() {
        return this.f12740w;
    }

    public void e() {
        if (this.f12721d != null) {
            this.f12721d = null;
        }
        if (this.f12735r != null) {
            this.f12735r = null;
        }
        if (this.f12736s != null) {
            this.f12736s = null;
        }
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl(), new l(campaignEx, i10));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:81|(4:80|3|91|4)|(8:6|(1:8)|13|82|14|(6:16|95|17|(1:19)|24|25)|89|72)(1:30)|87|31|(1:33)|45|(1:54)(2:51|(1:53))|(3:56|89|72)(1:98)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        r5 = r4;
        r4 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5 A[Catch: all -> 0x00b7, Exception -> 0x0130, TRY_ENTER, TryCatch #0 {Exception -> 0x0130, blocks: (B:43:0x00d5, B:45:0x00d9, B:47:0x00df, B:49:0x00e5, B:51:0x00eb, B:53:0x00fd, B:54:0x0106, B:33:0x00b3), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[Catch: all -> 0x00b7, Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:43:0x00d5, B:45:0x00d9, B:47:0x00df, B:49:0x00e5, B:51:0x00eb, B:53:0x00fd, B:54:0x0106, B:33:0x00b3), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106 A[Catch: all -> 0x00b7, Exception -> 0x0130, TRY_LEAVE, TryCatch #0 {Exception -> 0x0130, blocks: (B:43:0x00d5, B:45:0x00d9, B:47:0x00df, B:49:0x00e5, B:51:0x00eb, B:53:0x00fd, B:54:0x0106, B:33:0x00b3), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[Catch: IOException -> 0x0122, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x0122, blocks: (B:69:0x013c, B:56:0x011e), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c A[Catch: IOException -> 0x0122, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x0122, blocks: (B:69:0x013c, B:56:0x011e), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.mbridge.msdk.foundation.entity.CampaignEx r11, int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.advanced.manager.b.d(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    private void f(CampaignEx campaignEx, int i10) {
        this.f12735r = new d(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f12722e, this.f12718a, copyOnWriteArrayList, 298, this.f12735r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(298, this.f12718a, campaignEx.isBidCampaign())) {
            q0.a(f12717z, " load Video");
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f12718a);
        } else {
            q0.a(f12717z, " load Video isReady true");
            this.f12723f.setVideoReady(true);
            i(campaignEx, i10);
        }
    }

    public void b(String str, int i10) throws Throwable {
        String str2;
        CampaignEx campaignExA;
        List<Integer> listC;
        this.f12734q = false;
        this.f12731n = str;
        this.f12732o = i10;
        this.f12726i = null;
        if (this.f12723f == null) {
            a(new com.mbridge.msdk.foundation.error.b(880030), str, i10, (CampaignEx) null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f12723f, this.f12719b, this.f12718a, str, this.f12727j, false, false);
            str2 = str;
        } else {
            str2 = str;
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f12723f, this.f12719b, this.f12718a, str2, this.f12727j, false, true);
        }
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        com.mbridge.msdk.setting.l lVar = this.f12724g;
        if (lVar != null && lVar.t() == 1 && this.f12723f != null && campaignExA != null) {
            j(campaignExA, i10);
            return;
        }
        this.f12733p = false;
        com.mbridge.msdk.setting.l lVar2 = this.f12724g;
        if (lVar2 != null && (listC = lVar2.c()) != null && listC.size() > 0) {
            this.f12720c = listC.get(0).intValue() * 1000;
        } else {
            this.f12720c = 30000L;
        }
        q0.a(f12717z, "开始从V3请求新的 offer，超时 ：" + this.f12720c);
        if (this.f12724g == null || timestamp <= 0 || !TextUtils.isEmpty(str2)) {
            a(this.f12720c);
            a(this.f12722e, str2, i10);
        } else if (System.currentTimeMillis() - timestamp > this.f12724g.v() * 1000) {
            a(this.f12720c);
            a(this.f12722e, str2, i10);
        } else {
            j(campaignExA, i10);
        }
    }

    public class d implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12753a;

        public d(CampaignEx campaignEx) {
            this.f12753a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            q0.a(b.f12717z, "Video 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f12753a;
            messageObtain.what = 5;
            b.this.f12741x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            q0.a(b.f12717z, "Video 下载失败： " + str);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f12753a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            b.this.f12741x.sendMessage(messageObtain);
        }
    }

    private void e(CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f12723f;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            q0.a(f12717z, "开始下载zip： " + campaignEx.getAdZip());
            g(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.a(f12717z, "开始下载HTML： " + campaignEx.getAdHtml());
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            q0.a(f12717z, "开始下载Video： " + campaignEx.getVideoUrlEncode());
            f(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
            q0.a(f12717z, "开始下载image： " + campaignEx.getImageUrl());
            c(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
            q0.a(f12717z, "开始下载EndCard： " + campaignEx.getendcard_url());
            a(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getGifUrl())) {
            return;
        }
        q0.a(f12717z, "开始下载gitUrl： " + campaignEx.getGifUrl());
        b(campaignEx, i10);
    }

    private void g(CampaignEx campaignEx, int i10) {
        String adZip;
        this.f12736s = new a(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        if (campaignEx != null) {
            i = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            adZip = campaignEx.getAdZip();
        } else {
            adZip = "";
        }
        cVar.f(i);
        cVar.e(2);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, adZip, this.f12736s);
    }

    public void a(com.mbridge.msdk.setting.l lVar) {
        this.f12724g = lVar;
    }

    public void a(MBNativeAdvancedView mBNativeAdvancedView) {
        this.f12723f = mBNativeAdvancedView;
    }

    public void a(int i10) {
        this.f12727j = i10;
    }

    public void a(int i10, int i11) {
        this.f12730m = i10;
        this.f12729l = i11;
    }

    private void a(long j10) {
        this.f12741x.postDelayed(this.f12742y, j10);
    }

    private void a(Context context, String str, int i10) throws Throwable {
        Exception exc;
        String str2;
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i10, (CampaignEx) null);
                return;
            }
            try {
                if (a1.a(this.f12718a)) {
                    a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                    return;
                }
                try {
                    com.mbridge.msdk.advanced.manager.d.b(this.f12718a);
                } catch (Throwable th) {
                    q0.b(f12717z, th.getMessage());
                }
                q0.c(f12717z, "load 开始准备请求参数");
                MBridgeIds mBridgeIds = new MBridgeIds(this.f12719b, this.f12718a);
                com.mbridge.msdk.advanced.request.f fVar = new com.mbridge.msdk.advanced.request.f();
                fVar.d(i10);
                fVar.c(this.f12739v);
                fVar.a(this.f12738u);
                fVar.b(this.f12730m);
                fVar.a(this.f12729l);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.advanced.request.e.b(context, mBridgeIds, fVar);
                if (eVarB == null) {
                    q0.c(f12717z, "load 请求参数为空 load失败");
                    a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    eVarB.a(BidResponsed.KEY_TOKEN, str);
                }
                String strD = v0.d(this.f12718a);
                if (!TextUtils.isEmpty(strD)) {
                    eVarB.a("j", strD);
                }
                str2 = str;
                try {
                    new com.mbridge.msdk.advanced.request.c(context).choiceV3OrV5BySetting(1, eVarB, a(str, i10), str2, com.mbridge.msdk.foundation.same.c.a(this.f12720c, 30000L));
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    q0.b(f12717z, exc.getMessage());
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
                    bVar.a((Throwable) exc);
                    a(bVar, str2, i10, (CampaignEx) null);
                    f();
                }
            } catch (Exception e11) {
                e = e11;
                str2 = str;
            }
        } catch (Exception e12) {
            exc = e12;
            str2 = str;
        }
    }

    private void b() {
        this.f12741x.removeCallbacks(this.f12742y);
    }

    private void b(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getGifUrl(), new j(campaignEx, i10));
    }

    @NonNull
    private com.mbridge.msdk.advanced.request.b a(String str, int i10) {
        g gVar = new g(i10, str, i10);
        gVar.a(str);
        gVar.setUnitId(this.f12718a);
        gVar.setPlacementId(this.f12719b);
        gVar.setAdType(298);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        String str3;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 298);
        if (!TextUtils.isEmpty(str2)) {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        }
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            str3 = str2;
        } else {
            str3 = str2;
            campaignUnit.setLocalRequestId(com.mbridge.msdk.foundation.same.report.metrics.d.b().a(i10 == 1, str3, eVar, campaignUnit.getAds().get(0), str).t());
        }
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            q0.c(f12717z, "onload load成功 size:" + listA.size());
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            j(campaignEx, i10);
            return;
        }
        q0.c(f12717z, "onload load失败 返回的compaign没有可以用的");
        a(new com.mbridge.msdk.foundation.error.b(880033), str3, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setLocalRequestId(campaignUnit.getLocalRequestId());
        campaignEx.setCampaignUnitId(this.f12718a);
        a(campaignEx);
        this.f12738u = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f12722e, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f12722e, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f12718a, campaignEx, com.mbridge.msdk.foundation.same.a.f15049x);
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f12722e, cVar, new h(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new i(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.advanced.middle.b bVar) {
        this.f12721d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f12733p) {
            this.f12733p = false;
            a(bVar, i10, str);
        } else {
            if (bVar != null) {
                bVar.a(campaignEx);
            }
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f12723f, this.f12719b, this.f12718a, str, this.f12727j, true, true);
        if (campaignExA != null) {
            q0.b(f12717z, "load failed cache ");
            j(campaignExA, i10);
        } else {
            a(bVar, i10, campaignExA);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f12734q) {
            return;
        }
        b();
        if (bVar != null) {
            q0.b(f12717z, "real failed: " + bVar.l());
        }
        this.f12734q = true;
        com.mbridge.msdk.advanced.middle.b bVar2 = this.f12721d;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) {
        String str;
        this.f12737t = new k(campaignEx, i10);
        if (campaignEx != null) {
            i = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getendcard_url();
        } else {
            str = "";
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        cVar.f(i);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, str, this.f12737t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f12723f;
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(this.f12718a, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(this.f12723f.getContext(), this.f12719b, this.f12718a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(this.f12727j);
        bVar.b(this.f12728k);
        this.f12723f.setAdvancedNativeSignalCommunicationImpl(bVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        MBNativeAdvancedWebview advancedNativeWebview = this.f12723f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(campaignEx, "webview is null", i10);
            return;
        }
        if (advancedNativeWebview.isDestoryed()) {
            a(campaignEx, "webview is destroyed", i10);
            return;
        }
        advancedNativeWebview.setWebViewListener(new C0232b(campaignEx, i10, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            q0.b(f12717z, "=======开始渲染: " + str);
            Handler handler = this.f12741x;
            if (handler != null) {
                handler.post(new c(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.mbridge.msdk.foundation.error.b(880031), this.f12731n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, this.f12718a, "webview had destory", jCurrentTimeMillis, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, int i10) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f12731n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(2, str, this.f12718a, campaignEx);
    }

    public String a(String str) {
        int iO;
        if (this.f12726i != null) {
            try {
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f12718a, this.f12726i.getId() + this.f12726i.getVideoUrlEncode() + this.f12726i.getBidToken());
                if (aVarA != null && (iO = aVarA.o()) == 5) {
                    String strP = aVarA.p();
                    if (new File(strP).exists()) {
                        q0.b(f12717z, "本地已下载完 拿本地播放地址：" + strP + " state：" + iO);
                        return strP;
                    }
                }
            } catch (Exception e10) {
                q0.b(f12717z, e10.getMessage());
            }
            return str;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z10, String str2) {
        try {
            n nVar = new n();
            nVar.e(2);
            nVar.j("m_download_end");
            if (campaignEx != null) {
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                nVar.o(campaignEx.getRequestIdNotice());
            }
            nVar.b("url", str);
            nVar.b("scenes", "1");
            if (z10) {
                nVar.d(1);
            } else {
                nVar.d(3);
                nVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(f12717z, e10.getMessage());
            }
        }
    }
}
