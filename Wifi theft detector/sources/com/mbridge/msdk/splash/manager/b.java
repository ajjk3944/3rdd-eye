package com.mbridge.msdk.splash.manager;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f17118b;

    /* renamed from: c, reason: collision with root package name */
    protected MBSplashView f17119c;

    /* renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f17120d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f17121e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17122f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f17123g;

    /* renamed from: h, reason: collision with root package name */
    private View f17124h;

    /* renamed from: i, reason: collision with root package name */
    protected String f17125i;

    /* renamed from: j, reason: collision with root package name */
    private String f17126j;

    /* renamed from: k, reason: collision with root package name */
    protected MBridgeIds f17127k;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f17133q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17134r;

    /* renamed from: s, reason: collision with root package name */
    protected Context f17135s;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f17137u;

    /* renamed from: v, reason: collision with root package name */
    private i f17138v;

    /* renamed from: w, reason: collision with root package name */
    private o5.b f17139w;

    /* renamed from: a, reason: collision with root package name */
    protected final String f17117a = "SplashShowManager";

    /* renamed from: l, reason: collision with root package name */
    protected int f17128l = 5;

    /* renamed from: m, reason: collision with root package name */
    protected String f17129m = "点击跳过|";

    /* renamed from: n, reason: collision with root package name */
    protected String f17130n = "点击跳过|";

    /* renamed from: o, reason: collision with root package name */
    protected String f17131o = "秒";

    /* renamed from: p, reason: collision with root package name */
    protected String f17132p = "秒后自动关闭";

    /* renamed from: t, reason: collision with root package name */
    protected boolean f17136t = true;

    /* renamed from: x, reason: collision with root package name */
    private View.OnClickListener f17140x = new a();

    /* renamed from: y, reason: collision with root package name */
    public Handler f17141y = new HandlerC0316b(Looper.getMainLooper());

    /* renamed from: z, reason: collision with root package name */
    private boolean f17142z = true;
    protected j A = new e();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (b.this.f17122f) {
                b.this.b(1);
                b.this.d(-1);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.splash.manager.b$b, reason: collision with other inner class name */
    public class HandlerC0316b extends Handler {
        public HandlerC0316b(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r9) throws org.json.JSONException {
            /*
                r8 = this;
                java.lang.String r1 = "OMSDK"
                super.handleMessage(r9)
                int r9 = r9.what
                r0 = 2
                r2 = 1
                if (r9 == r2) goto Lac
                if (r9 == r0) goto Lf
                goto Lab
            Lf:
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r9 = com.mbridge.msdk.splash.manager.b.d(r9)
                if (r9 == 0) goto Lab
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r9 = com.mbridge.msdk.splash.manager.b.d(r9)
                boolean r9 = r9.isActiveOm()
                if (r9 == 0) goto Lab
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.splash.view.MBSplashView r9 = r9.f17119c
                if (r9 == 0) goto Lab
                com.mbridge.msdk.splash.view.MBSplashWebview r9 = r9.getSplashWebview()
                if (r9 == 0) goto Lab
                com.mbridge.msdk.splash.manager.b r0 = com.mbridge.msdk.splash.manager.b.this     // Catch: java.lang.Throwable -> L51
                o5.b r2 = r9.getAdSession()     // Catch: java.lang.Throwable -> L51
                com.mbridge.msdk.splash.manager.b.a(r0, r2)     // Catch: java.lang.Throwable -> L51
                com.mbridge.msdk.splash.manager.b r0 = com.mbridge.msdk.splash.manager.b.this     // Catch: java.lang.Throwable -> L51
                o5.b r0 = com.mbridge.msdk.splash.manager.b.e(r0)     // Catch: java.lang.Throwable -> L51
                if (r0 == 0) goto L53
                com.mbridge.msdk.splash.manager.b r0 = com.mbridge.msdk.splash.manager.b.this     // Catch: java.lang.Throwable -> L51
                o5.b r0 = com.mbridge.msdk.splash.manager.b.e(r0)     // Catch: java.lang.Throwable -> L51
                o5.a r0 = o5.a.a(r0)     // Catch: java.lang.Throwable -> L51
                r0.c()     // Catch: java.lang.Throwable -> L51
                r0.b()     // Catch: java.lang.Throwable -> L51
                goto L53
            L51:
                r0 = move-exception
                goto L59
            L53:
                java.lang.String r0 = "adSession.impressionOccurred()"
                com.mbridge.msdk.foundation.tools.q0.a(r1, r0)     // Catch: java.lang.Throwable -> L51
                return
            L59:
                java.lang.String r2 = r0.getMessage()
                com.mbridge.msdk.foundation.tools.q0.a(r1, r2)
                com.mbridge.msdk.splash.manager.b r1 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.splash.manager.b.d(r1)
                if (r1 == 0) goto Lab
                com.mbridge.msdk.splash.manager.b r1 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.splash.manager.b.d(r1)
                java.lang.String r3 = r1.getRequestId()
                com.mbridge.msdk.splash.manager.b r1 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.splash.manager.b.d(r1)
                java.lang.String r4 = r1.getRequestIdNotice()
                com.mbridge.msdk.splash.manager.b r1 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.splash.manager.b.d(r1)
                java.lang.String r5 = r1.getId()
                com.mbridge.msdk.foundation.same.report.h r2 = new com.mbridge.msdk.foundation.same.report.h
                android.content.Context r9 = r9.getContext()
                r2.<init>(r9)
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                java.lang.String r6 = r9.f17125i
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = "fetch OM failed, exception"
                r9.append(r1)
                java.lang.String r0 = r0.getMessage()
                r9.append(r0)
                java.lang.String r7 = r9.toString()
                r2.a(r3, r4, r5, r6, r7)
            Lab:
                return
            Lac:
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                boolean r9 = com.mbridge.msdk.splash.manager.b.b(r9)
                if (r9 != 0) goto Lb9
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                com.mbridge.msdk.splash.manager.b.c(r9)
            Lb9:
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                int r1 = r9.f17128l
                if (r1 <= 0) goto Led
                boolean r9 = com.mbridge.msdk.foundation.feedback.b.f14986f
                if (r9 != 0) goto Ldb
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                boolean r0 = r9.f17133q
                if (r0 != 0) goto Ldb
                int r0 = r9.f17128l
                int r0 = r0 - r2
                r9.f17128l = r0
                com.mbridge.msdk.splash.manager.b.a(r9, r0)
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                boolean r0 = r9.f17136t
                if (r0 != 0) goto Le0
                r9.g()
                goto Le0
            Ldb:
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                r9.f()
            Le0:
                com.mbridge.msdk.splash.manager.b r9 = com.mbridge.msdk.splash.manager.b.this
                android.os.Handler r9 = r9.f17141y
                r9.removeMessages(r2)
                r0 = 1000(0x3e8, double:4.94E-321)
                r8.sendEmptyMessageDelayed(r2, r0)
                return
            Led:
                r9.b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.manager.b.HandlerC0316b.handleMessage(android.os.Message):void");
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
        }
    }

    public class e implements j {
        public e() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f17119c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f17119c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            u0.b(campaign, b.this.f17119c);
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17148a;

        public f(int i10) {
            this.f17148a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f17148a);
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f17150a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17151b;

        public g(Context context, CampaignEx campaignEx) {
            this.f17150a = context;
            this.f17151b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f17150a)).b(this.f17151b.getId());
            } catch (Exception unused) {
                q0.b("SplashShowManager", "campain can't insert db");
            }
        }
    }

    public class h implements com.mbridge.msdk.foundation.feedback.a {
        public h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            b.this.f();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            b.this.g();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            b.this.g();
        }
    }

    public class i implements com.mbridge.msdk.splash.middle.a {
        private i() {
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(CampaignEx campaignEx) {
            b.this.b(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void close() {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void toggleCloseBtn(int i10) {
            MBSplashView mBSplashView = b.this.f17119c;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            b.this.b(1);
        }

        public /* synthetic */ i(b bVar, a aVar) {
            this();
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10) {
            q0.b("SplashShowManager", "resetCountdown" + i10);
            b bVar = b.this;
            bVar.f17128l = i10;
            bVar.f17141y.removeMessages(1);
            b.this.f17141y.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10) {
            if (z10) {
                b.this.f17141y.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10, String str) {
            try {
                if (b.this.f17120d != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f17120d.a(bVar.f17127k);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.f17118b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    b.this.b(campaignWithBackData, true, str);
                }
            } catch (Exception e10) {
                q0.b("SplashShowManager", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10, int i11) {
            if (i10 == 1) {
                b.this.f17141y.removeMessages(1);
            }
            if (i10 == 2) {
                b bVar = b.this;
                bVar.f17128l = i11;
                bVar.f17141y.removeMessages(1);
                b.this.f17141y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    public b(Context context, String str, String str2) throws Resources.NotFoundException {
        this.f17125i = str2;
        this.f17126j = str;
        this.f17127k = new MBridgeIds(str, str2);
        this.f17135s = context;
        if (this.f17123g == null) {
            TextView textView = new TextView(context);
            this.f17123g = textView;
            textView.setGravity(1);
            this.f17123g.setTextIsSelectable(false);
            this.f17123g.setPadding(v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f17123g.getLayoutParams();
            this.f17123g.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v0.a(context, 100.0f), v0.a(context, 50.0f)) : layoutParams);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        MBSplashView mBSplashView;
        try {
            if (this.f17118b == null) {
                return;
            }
            this.f17134r = true;
            if (this.f17120d != null && (mBSplashView = this.f17119c) != null) {
                if (mBSplashView.getContext() != null && (this.f17119c.getContext() instanceof Activity) && ((Activity) this.f17119c.getContext()).isFinishing()) {
                    q0.a("SplashShowManager", "Activity is finishing");
                }
                if (this.f17119c.isShown()) {
                    this.f17120d.b(this.f17127k);
                } else {
                    this.f17120d.a(this.f17127k, "SplashView or container is not visibility");
                }
            }
            if (!this.f17118b.isReport()) {
                MBSplashView mBSplashView2 = this.f17119c;
                if (mBSplashView2 == null || mBSplashView2.isDynamicView()) {
                    a(this.f17118b);
                } else {
                    b(this.f17118b);
                }
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f17118b, this.f17125i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void j() {
        String str;
        if (this.f17122f) {
            str = this.f17130n + this.f17128l + this.f17131o;
        } else {
            str = this.f17128l + this.f17132p;
        }
        this.f17123g.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MBSplashView mBSplashView;
        MBSplashWebview splashWebview;
        View splashWebview2 = this.f17119c.getSplashWebview();
        if (splashWebview2 == null) {
            splashWebview2 = this.f17119c.getSplashNativeView();
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(splashWebview2, this.f17118b.getImpReportType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f17118b);
        if (lVarA.a()) {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        } else if (this.f17142z) {
            this.f17142z = false;
            this.f17119c.postDelayed(new c(), 200L);
            return;
        } else {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
            if (this.f17118b.getLocalCheckShow() == 1) {
                a("ad env is not available");
                return;
            }
        }
        CampaignEx campaignEx = this.f17118b;
        if (campaignEx != null && campaignEx.isActiveOm() && (mBSplashView = this.f17119c) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                o5.b bVarA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), splashWebview, splashWebview.getUrl(), this.f17118b);
                this.f17139w = bVarA;
                if (bVarA != null) {
                    splashWebview.setAdSession(bVarA);
                    this.f17139w.d(splashWebview);
                    this.f17139w.g();
                }
                q0.a("OMSDK", "adSession.start()");
            } catch (Throwable th) {
                q0.a("OMSDK", th.getMessage());
                CampaignEx campaignEx2 = this.f17118b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = this.f17118b.getRequestIdNotice();
                    String id = this.f17118b.getId();
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(requestId, requestIdNotice, id, this.f17125i, "fetch OM failed, exception" + th.getMessage());
                }
            }
        }
        com.mbridge.msdk.splash.manager.d.b(this.f17125i);
        this.f17141y.removeMessages(1);
        this.f17141y.sendEmptyMessageDelayed(1, 1000L);
        this.f17141y.sendEmptyMessageDelayed(2, 1000L);
        b();
        if (!this.f17118b.isMraid()) {
            a();
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f17118b.getMaitve(), this.f17118b.getMaitve_src());
        try {
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f17125i, this.f17118b.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f17137u == null) {
                    this.f17137u = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f17137u.getVisibility() != 0) {
                    this.f17137u.setVisibility(0);
                }
                v0.a(this.f17137u, bitmapDrawableA, this.f17119c.getResources().getDisplayMetrics());
                if (this.f17137u.getParent() == null) {
                    this.f17119c.addView(this.f17137u, new ViewGroup.LayoutParams(-1, -1));
                }
                o5.b bVar = this.f17139w;
                if (bVar != null) {
                    bVar.a(this.f17137u, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public void g() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f17136t = true;
        if (this.f17119c != null && this.f17128l > 0 && (handler = this.f17141y) != null) {
            handler.removeMessages(1);
            View splashWebview = this.f17119c.getSplashWebview();
            if (splashWebview == null) {
                splashWebview = this.f17119c.getSplashNativeView();
            }
            CampaignEx campaignEx = this.f17118b;
            if (campaignEx != null ? com.mbridge.msdk.foundation.tools.h.b(campaignEx, null, splashWebview, campaignEx.getImpReportType()) : true) {
                this.f17141y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
        if (com.mbridge.msdk.foundation.feedback.b.f14986f || (mBSplashView = this.f17119c) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview2 = this.f17119c.getSplashWebview();
        if (splashWebview2 == null || splashWebview2.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.c.a(splashWebview2, "onSystemPause", "");
    }

    public void h() {
        if (this.f17120d != null) {
            this.f17120d = null;
        }
        if (this.f17138v != null) {
            this.f17138v = null;
        }
        if (this.f17140x != null) {
            this.f17140x = null;
        }
        MBSplashView mBSplashView = this.f17119c;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f17125i);
    }

    private void e() throws Resources.NotFoundException {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            int identifier = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip", "string", strI);
            int identifier2 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", "string", strI);
            int identifier3 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", "string", strI);
            this.f17130n = contextD.getResources().getString(identifier);
            String string = contextD.getResources().getString(identifier2);
            this.f17132p = string;
            this.f17129m = string;
            this.f17131o = contextD.getResources().getString(identifier3);
            this.f17123g.setBackgroundResource(contextD.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f17123g.setTextColor(contextD.getResources().getColor(contextD.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", TtmlNode.ATTR_TTS_COLOR, strI)));
        }
    }

    public void c(int i10) {
        this.f17128l = i10;
    }

    public String d() {
        CampaignEx campaignEx = this.f17118b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f17118b.getRequestId();
    }

    public void f() {
        Handler handler;
        this.f17136t = false;
        if (this.f17119c != null && this.f17128l > 0 && (handler = this.f17141y) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.f17119c;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.f17119c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.c.a(splashWebview, "onSystemPause", "");
        }
    }

    public String c() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f17118b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f17125i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f17125i, campaignEx, "splash");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f17125i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f17125i);
    }

    public void a(com.mbridge.msdk.splash.middle.d dVar) {
        this.f17120d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i10) throws JSONException {
        MBSplashView mBSplashView = this.f17119c;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i10);
            if (this.f17119c.getSplashSignalCommunicationImpl() != null) {
                this.f17119c.getSplashSignalCommunicationImpl().c(i10);
            }
        }
        if (i10 < 0) {
            this.f17128l = i10;
            return;
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f17120d;
        if (dVar != null) {
            dVar.a(this.f17127k, i10 * 1000);
        }
        if (this.f17124h == null) {
            j();
        }
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f17140x);
        }
        this.f17124h = viewGroup;
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th) {
                q0.b("SplashShowManager", th.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        a(this.f17122f);
        this.f17118b = campaignEx;
        this.f17119c = mBSplashView;
        com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        if (splashSignalCommunicationImpl == null) {
            splashSignalCommunicationImpl = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), this.f17126j, this.f17125i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            splashSignalCommunicationImpl.a(arrayList);
        }
        splashSignalCommunicationImpl.b(this.f17128l);
        splashSignalCommunicationImpl.a(this.f17122f ? 1 : 0);
        if (this.f17138v == null) {
            this.f17138v = new i(this, null);
        }
        splashSignalCommunicationImpl.a(this.f17138v);
        mBSplashView.setSplashSignalCommunicationImpl(splashSignalCommunicationImpl);
        boolean zIsHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f17124h;
        if (view == null) {
            if (zIsHasMBTplMark) {
                this.f17123g.setVisibility(8);
            }
            j();
            a(this.f17123g);
            mBSplashView.setCloseView(this.f17123g);
        } else {
            if (zIsHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.f17124h);
            mBSplashView.setCloseView(this.f17124h);
        }
        b1.a(mBSplashView.getSplashWebview() != null ? mBSplashView.getSplashWebview() : mBSplashView.getSplashNativeView(), this.f17118b.getLocalRequestId(), this.f17118b.getLocalAllowTrackClick(), mBSplashView.getAllowClickSplashTouchListener());
        mBSplashView.show(campaignEx);
        this.f17142z = true;
        k();
    }

    public class d implements com.mbridge.msdk.foundation.feedback.a {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            b.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("SplashShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f17119c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("SplashShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f17119c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("SplashShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f17119c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void b(int i10) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.f17119c;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f17141y != null && (campaignEx = this.f17118b) != null && campaignEx.isActiveOm()) {
            this.f17141y.postDelayed(new f(i10), 1500L);
        } else {
            a(i10);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f13050n);
            } catch (Throwable th) {
                q0.b("SplashShowManager", th.getMessage());
            }
        }
    }

    public void b() {
        MBSplashView mBSplashView;
        Context context;
        CampaignEx campaignEx = this.f17118b;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() != 1 || (mBSplashView = this.f17119c) == null || mBSplashView.getSplashWebview() == null || this.f17119c.isDynamicView() || !this.f17118b.isMraid() || (context = this.f17119c.getContext()) == null) {
            return;
        }
        try {
            int iA = i0.a(context, "mbridge_splash_notice", "drawable");
            int iA2 = v0.a(context, 35.0f);
            int iA3 = v0.a(context, 9.0f);
            ImageView imageView = new ImageView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.setMargins(iA3, iA3, iA3, iA3);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(iA);
            v0.a(3, imageView, this.f17118b, context, true, new h());
            this.f17119c.addView(imageView);
        } catch (Throwable th) {
            q0.b("SplashShowManager", th.getMessage());
        }
    }

    private void a() {
        RelativeLayout.LayoutParams layoutParams;
        CampaignEx campaignEx = this.f17118b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f17125i);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f17125i, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f17125i, this.f17118b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            MBSplashView mBSplashView = this.f17119c;
            if (mBSplashView == null || !mBSplashView.isDynamicView()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f17125i, new d());
                FeedBackButton feedBackButtonA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f17125i);
                if (feedBackButtonA != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonA.getLayoutParams();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f14985e, com.mbridge.msdk.foundation.feedback.b.f14984d);
                    }
                    layoutParams.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    layoutParams.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonA);
                    }
                    MBSplashView mBSplashView2 = this.f17119c;
                    if (mBSplashView2 != null) {
                        mBSplashView2.addView(feedBackButtonA, layoutParams);
                    }
                }
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f17125i);
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f17125i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f17125i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f17125i, campaignEx, "splash");
    }

    private void a(String str) {
        com.mbridge.msdk.splash.middle.d dVar = this.f17120d;
        if (dVar != null) {
            dVar.a(this.f17127k, "web show failed:" + str);
        }
        MBSplashView mBSplashView = this.f17119c;
        if (mBSplashView == null || mBSplashView.getParent() == null || !(this.f17119c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.f17119c.getParent()).removeView(this.f17119c);
    }

    public void a(boolean z10) {
        this.f17122f = z10;
        if (z10) {
            this.f17129m = this.f17130n;
        } else {
            this.f17129m = this.f17132p;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f17121e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f17125i);
            this.f17121e = aVar;
            aVar.a(this.A);
        }
        campaignEx.setCampaignUnitId(this.f17125i);
        this.f17121e.a(campaignEx);
        if (!this.f17118b.isReportClick()) {
            this.f17118b.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f17120d;
        if (dVar != null) {
            dVar.a(this.f17127k);
            b(3);
        }
        if (!z10 || TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f17125i, str);
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f17140x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.middle.d dVar = this.f17120d;
            if (dVar != null) {
                dVar.a(this.f17127k, i10);
                this.f17120d = null;
                com.mbridge.msdk.splash.report.a.a(this.f17125i, this.f17118b);
            }
            ImageView imageView = this.f17137u;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.f17119c) != null) {
                mBSplashView.removeView(this.f17137u);
                this.f17137u.setVisibility(8);
            }
            this.f17134r = false;
            com.mbridge.msdk.splash.report.a.a(this.f17125i, i10, this.f17118b);
            Handler handler = this.f17141y;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e10) {
            q0.b("SplashShowManager", e10.getMessage());
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new g(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f13049m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }
}
