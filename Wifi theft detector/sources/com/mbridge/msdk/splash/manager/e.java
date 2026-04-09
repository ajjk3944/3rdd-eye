package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.common.c;
import com.mbridge.msdk.splash.manager.g;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class e {
    private static String A = "SplashLoadManager";

    /* renamed from: a, reason: collision with root package name */
    private String f17169a;

    /* renamed from: b, reason: collision with root package name */
    private String f17170b;

    /* renamed from: c, reason: collision with root package name */
    private long f17171c;

    /* renamed from: d, reason: collision with root package name */
    private long f17172d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.b f17173e;

    /* renamed from: g, reason: collision with root package name */
    private MBSplashView f17175g;

    /* renamed from: h, reason: collision with root package name */
    private l f17176h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17177i;

    /* renamed from: j, reason: collision with root package name */
    private int f17178j;

    /* renamed from: k, reason: collision with root package name */
    private int f17179k;

    /* renamed from: l, reason: collision with root package name */
    private int f17180l;

    /* renamed from: m, reason: collision with root package name */
    private String f17181m;

    /* renamed from: n, reason: collision with root package name */
    private int f17182n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17183o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f17184p;

    /* renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f17185q;

    /* renamed from: r, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f17186r;

    /* renamed from: s, reason: collision with root package name */
    private String f17187s;

    /* renamed from: t, reason: collision with root package name */
    private int f17188t;

    /* renamed from: v, reason: collision with root package name */
    private int f17190v;

    /* renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f17191w;

    /* renamed from: u, reason: collision with root package name */
    private String f17189u = "";

    /* renamed from: x, reason: collision with root package name */
    private String f17192x = "";

    /* renamed from: y, reason: collision with root package name */
    private Handler f17193y = new c(Looper.getMainLooper());

    /* renamed from: z, reason: collision with root package name */
    private Runnable f17194z = new d();

    /* renamed from: f, reason: collision with root package name */
    private Context f17174f = com.mbridge.msdk.foundation.controller.c.n().d();

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                Object obj = message.obj;
                int i11 = message.arg1;
                if (obj instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) obj;
                    e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i11);
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof CampaignEx) {
                    e eVar = e.this;
                    eVar.h((CampaignEx) obj2, eVar.f17182n);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i12 = ((Bundle) obj3).getInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
                    String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                    CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i12 == 1 ? 880004 : i12 == 2 ? 880006 : 880027);
                    bVar.c(string);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.f17181m, e.this.f17182n, campaignEx2);
                }
            } catch (Exception e10) {
                com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880024);
                bVar2.a((Throwable) e10);
                e eVar3 = e.this;
                eVar3.a(bVar2, eVar3.f17181m, e.this.f17182n, (CampaignEx) null);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.f17181m, e.this.f17182n, (CampaignEx) null);
        }
    }

    /* renamed from: com.mbridge.msdk.splash.manager.e$e, reason: collision with other inner class name */
    public class C0318e extends com.mbridge.msdk.splash.request.b {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f17202e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f17203f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0318e(int i10, String str, int i11) {
            super(i10);
            this.f17202e = str;
            this.f17203f = i11;
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                e eVar = e.this;
                eVar.a(campaignUnit, i10, eVar.f17169a, this.f17202e);
                e.this.f17189u = campaignUnit.getRequestId();
                e.this.f17191w = campaignUnit.getAds();
            } catch (Exception e10) {
                e10.printStackTrace();
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) e10);
                e.this.a(bVar, this.f17202e, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                e.this.f();
            }
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void b(int i10, String str) throws Throwable {
            q0.b(e.A, str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.c(str);
            e.this.a(bVar, this.f17202e, this.f17203f, (CampaignEx) null);
            e.this.f();
        }
    }

    public class f extends c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17205a;

        public f(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f17205a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.splash.report.a.a(str, cVar, this.f17205a, e.this.f17174f, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17207a;

        public g(CampaignEx campaignEx) {
            this.f17207a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(e.this.f17174f)).d();
            y.a(e.this.f17174f, this.f17207a);
        }
    }

    public class h implements com.mbridge.msdk.splash.view.nativeview.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17209a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17210b;

        public h(CampaignEx campaignEx, int i10) {
            this.f17209a = campaignEx;
            this.f17210b = i10;
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void a() {
            if (this.f17209a.isDynamicView() && e.this.f17175g != null) {
                e.this.f17175g.setImageReady(true);
                e.this.f(this.f17209a, this.f17210b);
            }
            e.this.h(this.f17209a, this.f17210b);
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void b() throws Throwable {
            if (!this.f17209a.isDynamicView() || e.this.f17175g == null) {
                return;
            }
            e.this.f17175g.setImageReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
            e eVar = e.this;
            eVar.a(bVar, eVar.f17181m, this.f17210b, this.f17209a);
        }
    }

    public class i implements z.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17212a;

        public i(CampaignEx campaignEx) {
            this.f17212a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            e.this.a(this.f17212a, str, true, "");
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            e.this.a(this.f17212a, str, false, message);
        }
    }

    public class j implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17214a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17215b;

        public j(CampaignEx campaignEx, int i10) {
            this.f17214a = campaignEx;
            this.f17215b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880006);
            e eVar = e.this;
            eVar.a(bVar, eVar.f17181m, this.f17215b, this.f17214a);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f17214a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 2);
            messageObtain.obj = bundle;
            e.this.f17193y.sendMessage(messageObtain);
            e.this.a(this.f17214a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f17214a;
            messageObtain.arg1 = this.f17215b;
            e.this.f17193y.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            CampaignEx campaignEx = this.f17214a;
            e.this.a(this.f17214a, campaignEx != null ? campaignEx.getAdZip() : "", true, "");
        }
    }

    public class k implements com.mbridge.msdk.splash.inter.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17217a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17218b;

        public k(CampaignEx campaignEx, int i10) {
            this.f17217a = campaignEx;
            this.f17218b = i10;
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void a(View view) {
            if (e.this.f17175g != null) {
                e.this.f17175g.setDynamicView(true);
                e.this.f17175g.setSplashNativeView(view);
                e.this.h(this.f17217a, this.f17218b);
            }
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void onError(String str) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880034);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f17181m, this.f17218b, this.f17217a);
        }
    }

    public e(String str, String str2, long j10) {
        this.f17170b = str;
        this.f17169a = str2;
        this.f17172d = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f17175g, campaignEx) || this.f17184p) {
            return;
        }
        b();
        if (this.f17183o) {
            com.mbridge.msdk.splash.manager.d.a(campaignEx, this.f17169a);
        }
        this.f17184p = true;
        com.mbridge.msdk.splash.middle.b bVar = this.f17173e;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void i(CampaignEx campaignEx, int i10) throws Throwable {
        MBSplashView mBSplashView = this.f17175g;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            c(campaignEx, i10);
        } else {
            MBSplashView mBSplashView2 = this.f17175g;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (com.mbridge.msdk.splash.manager.d.a(this.f17175g, campaignEx)) {
            h(campaignEx, i10);
        } else {
            a(campaignEx, i10);
        }
    }

    public class a implements g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17195a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17196b;

        public a(CampaignEx campaignEx, int i10) {
            this.f17195a = campaignEx;
            this.f17196b = i10;
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a() {
            if (this.f17195a.isHasMBTplMark()) {
                return;
            }
            e.this.g(this.f17195a, this.f17196b);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void onError(String str) throws Throwable {
            e.this.a(str, this.f17196b, this.f17195a);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a(int i10) throws Throwable {
            if (i10 == 1) {
                e.this.g(this.f17195a, this.f17196b);
            } else {
                e.this.a("readyState 2", this.f17196b, this.f17195a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f17188t = 0;
    }

    private void g() {
        try {
            int i10 = this.f17188t + 1;
            this.f17188t = i10;
            l lVar = this.f17176h;
            if (lVar != null && i10 <= lVar.y()) {
                return;
            }
            this.f17188t = 0;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String d() {
        return this.f17189u;
    }

    public void e() {
        if (this.f17173e != null) {
            this.f17173e = null;
        }
        if (this.f17185q != null) {
            this.f17185q = null;
        }
        if (this.f17186r != null) {
            this.f17186r = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(4:57|3|64|4)|(8:6|(1:8)|13|60|14|(6:16|66|17|(1:19)|24|25)|43|(2:50|69)(2:49|68))(1:30)|62|31|(1:33)|43|(1:45)|50|69) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r5 = r4;
        r4 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[Catch: Exception -> 0x011a, TRY_ENTER, TryCatch #3 {Exception -> 0x011a, blocks: (B:53:0x0116, B:54:0x0119, B:41:0x00d2, B:43:0x00d6, B:45:0x00dc, B:47:0x00e2, B:49:0x00e8, B:50:0x0108, B:33:0x00b3), top: B:59:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc A[Catch: Exception -> 0x011a, TryCatch #3 {Exception -> 0x011a, blocks: (B:53:0x0116, B:54:0x0119, B:41:0x00d2, B:43:0x00d6, B:45:0x00dc, B:47:0x00e2, B:49:0x00e8, B:50:0x0108, B:33:0x00b3), top: B:59:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.mbridge.msdk.foundation.entity.CampaignEx r11, int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.manager.e.d(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            c.a aVar = new c.a();
            aVar.b(this.f17169a).a(this.f17170b).a(this.f17177i).a(campaignEx).c(this.f17178j).f(this.f17190v);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri uri = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.e(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.a(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.g(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.h(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.i(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.d(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                q0.b(A, th.getMessage());
            }
            com.mbridge.msdk.splash.manager.c.a().a(this.f17175g, aVar.a(), new k(campaignEx, i10));
        }
    }

    public void b(int i10) {
        this.f17190v = i10;
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f17191w);
    }

    private void b() {
        this.f17193y.removeCallbacks(this.f17194z);
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.splash.manager.d.a(this.f17175g, campaignEx, new h(campaignEx, i10));
    }

    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17198a;

        public b(CampaignEx campaignEx) {
            this.f17198a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            e.this.f17175g.setVideoReady(true);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f17198a;
            messageObtain.what = 3;
            e.this.f17193y.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) throws Throwable {
            e.this.f17175g.setVideoReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880004);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f17181m, e.this.f17182n, this.f17198a);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f17198a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            e.this.f17193y.sendMessage(messageObtain);
        }
    }

    private void b(CampaignEx campaignEx, int i10) {
        this.f17185q = new b(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f17174f, this.f17169a, copyOnWriteArrayList, 297, this.f17185q);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(297, this.f17169a, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f17169a);
        } else {
            this.f17175g.setVideoReady(true);
            h(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(CampaignEx campaignEx, int i10) {
        if (this.f17175g.isH5Ready()) {
            return;
        }
        this.f17175g.setH5Ready(true);
        h(campaignEx, i10);
    }

    private void e(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            z.a(5, "", campaignEx.getAdZip(), new i(campaignEx), campaignEx);
            return;
        }
        this.f17186r = new j(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(297);
        cVar.e(2);
        cVar.a(campaignEx);
        cVar.f(campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getAdZip(), this.f17186r);
    }

    public void a(l lVar) {
        this.f17176h = lVar;
    }

    public void a(MBSplashView mBSplashView) {
        this.f17175g = mBSplashView;
    }

    public void a(boolean z10) {
        this.f17177i = z10;
    }

    public void a(int i10) {
        this.f17178j = i10;
    }

    public void a(int i10, int i11) {
        this.f17180l = i10;
        this.f17179k = i11;
    }

    public void a(String str, int i10) {
        this.f17184p = false;
        this.f17181m = str;
        this.f17182n = i10;
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f17175g, this.f17170b, this.f17169a, str, this.f17177i, this.f17178j, false, false);
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        if (this.f17176h.t() == 1 && i10 != 1 && campaignExA != null) {
            i(campaignExA, i10);
            return;
        }
        this.f17183o = true;
        if (i10 == 1) {
            List<Integer> listC = this.f17176h.c();
            if (listC != null && listC.size() > 0) {
                this.f17171c = listC.get(0).intValue() * 1000;
            } else {
                this.f17171c = 30000L;
            }
        } else {
            long j10 = this.f17172d;
            if (j10 <= 0) {
                this.f17171c = this.f17176h.E();
            } else {
                this.f17171c = j10;
            }
        }
        if (this.f17176h == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f17171c);
            a(this.f17174f, str, i10);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.f17176h.v() * 1000) {
            a(this.f17171c);
            a(this.f17174f, str, i10);
        } else {
            i(campaignExA, i10);
        }
    }

    private void a(long j10) {
        this.f17193y.postDelayed(this.f17194z, j10);
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
                if (a1.a(this.f17169a)) {
                    a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                    return;
                }
                MBridgeIds mBridgeIds = new MBridgeIds(this.f17170b, this.f17169a);
                com.mbridge.msdk.splash.request.f fVar = new com.mbridge.msdk.splash.request.f();
                fVar.d(i10);
                fVar.c(this.f17188t);
                fVar.a(this.f17187s);
                fVar.b(this.f17180l);
                fVar.a(this.f17179k);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.splash.request.e.b(context, mBridgeIds, fVar);
                if (eVarB == null) {
                    a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    eVarB.a(BidResponsed.KEY_TOKEN, str);
                }
                String strD = v0.d(this.f17169a);
                if (!TextUtils.isEmpty(strD)) {
                    eVarB.a("j", strD);
                }
                com.mbridge.msdk.splash.request.c cVar = new com.mbridge.msdk.splash.request.c(context);
                C0318e c0318e = new C0318e(i10, str, i10);
                c0318e.a(str);
                c0318e.setUnitId(this.f17169a);
                c0318e.setPlacementId(this.f17170b);
                c0318e.setAdType(297);
                str2 = str;
                try {
                    cVar.choiceV3OrV5BySetting(1, eVarB, c0318e, str2, com.mbridge.msdk.foundation.same.c.a(this.f17171c, 30000L));
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    q0.b(A, exc.getMessage());
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 297);
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            }
            CampaignEx campaignEx = listA.get(0);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, str2, eVar, campaignEx, str);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            i(campaignEx, i10);
            return;
        }
        if (this.f17192x.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        a(bVar, str2, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setCampaignUnitId(this.f17169a);
        a(campaignEx);
        this.f17187s = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f17174f, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f17174f, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f17169a, campaignEx, com.mbridge.msdk.foundation.same.a.f15049x);
                this.f17192x = "APP ALREADY INSTALLED";
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f17174f, cVar, new f(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new g(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.splash.middle.b bVar) {
        this.f17173e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f17183o) {
            this.f17183o = false;
            a(bVar, i10, str, campaignEx);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str, CampaignEx campaignEx) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f17175g, this.f17170b, this.f17169a, str, this.f17177i, this.f17178j, true, false);
        if (campaignExA != null) {
            i(campaignExA, i10);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f17184p) {
            return;
        }
        b();
        this.f17184p = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.middle.b bVar2 = this.f17173e;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(CampaignEx campaignEx, int i10) throws Throwable {
        this.f17175g.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            e(campaignEx, i10);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            b(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        c(campaignEx, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) {
        g.d dVar = new g.d();
        dVar.c(this.f17169a);
        dVar.b(this.f17170b);
        dVar.a(campaignEx);
        dVar.a(str);
        dVar.a(this.f17177i);
        dVar.a(this.f17178j);
        com.mbridge.msdk.splash.manager.g.a().a(this.f17175g, dVar, new a(campaignEx, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, CampaignEx campaignEx) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f17181m, i10, campaignEx);
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
                q0.b(A, e10.getMessage());
            }
        }
    }
}
