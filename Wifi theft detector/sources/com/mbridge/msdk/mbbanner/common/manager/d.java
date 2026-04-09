package com.mbridge.msdk.mbbanner.common.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {
    private com.mbridge.msdk.mbbanner.common.communication.b A;
    private o5.b B;
    private o5.a C;
    private float F;
    private float G;

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.mbbanner.common.listener.c f15804a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15805b;

    /* renamed from: c, reason: collision with root package name */
    protected CampaignEx f15806c;

    /* renamed from: d, reason: collision with root package name */
    protected final MBBannerView f15807d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f15808e;

    /* renamed from: f, reason: collision with root package name */
    private MBBannerWebView f15809f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f15810g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f15811h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15812i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15813j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15814k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15815l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15816m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15817n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f15818o;

    /* renamed from: p, reason: collision with root package name */
    protected final String f15819p;

    /* renamed from: q, reason: collision with root package name */
    private final String f15820q;

    /* renamed from: r, reason: collision with root package name */
    private String f15821r;

    /* renamed from: t, reason: collision with root package name */
    com.mbridge.msdk.click.a f15823t;

    /* renamed from: u, reason: collision with root package name */
    private List<CampaignEx> f15824u;

    /* renamed from: w, reason: collision with root package name */
    private View.OnTouchListener f15826w;

    /* renamed from: y, reason: collision with root package name */
    private int f15828y;

    /* renamed from: s, reason: collision with root package name */
    private int f15822s = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f15825v = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f15827x = 1;

    /* renamed from: z, reason: collision with root package name */
    private final long f15829z = MBInterstitialActivity.WEB_LOAD_TIME;
    private final Handler D = new e(Looper.getMainLooper());
    private final com.mbridge.msdk.foundation.same.task.a E = new f();
    private final View.OnClickListener H = new g();
    private com.mbridge.msdk.mbbanner.common.listener.a I = new h();
    private com.mbridge.msdk.mbsignalcommon.listener.b J = new c();

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f15831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15832b;

        public b(Context context, CampaignEx campaignEx) {
            this.f15831a = context;
            this.f15832b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f15831a)).b(this.f15832b.getId());
            } catch (Exception e10) {
                q0.b("BannerShowManager", e10.getMessage());
            }
        }
    }

    public class c extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            d.this.f15814k = true;
            com.mbridge.msdk.mbbanner.common.communication.a.a(webView);
            d.this.f15816m = true;
            CampaignEx campaignEx = d.this.f15806c;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            d.this.p();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
            bVar.c(i10 + " WebView receive error: " + i10 + "  message : " + str);
            bVar.b(d.this.f15821r);
            d.this.a(bVar);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            d.this.g();
        }
    }

    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                if (d.this.B != null) {
                    d dVar = d.this;
                    dVar.C = o5.a.a(dVar.B);
                    if (d.this.C != null) {
                        d.this.C.c();
                        d.this.C.b();
                    }
                }
            } catch (Throwable th) {
                q0.a("BannerShowManager", th.getMessage());
            }
        }
    }

    public class f extends com.mbridge.msdk.foundation.same.task.a {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880045);
            bVar.b(d.this.f15806c.getLocalRequestId());
            d.this.a(bVar);
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            if (dVar.f15818o) {
                dVar.f15822s = 1;
                d.this.b();
            }
        }
    }

    public class h implements com.mbridge.msdk.mbbanner.common.listener.a {
        public h() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(CampaignEx campaignEx) {
            d.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void close() {
            d.this.f15822s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void readyStatus(int i10) {
            if (i10 != 1) {
                d.this.g();
            } else {
                d.this.p();
                d.this.a("", 1);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void toggleCloseBtn(int i10) {
            if (i10 == 2) {
                d.this.e();
            } else {
                d.this.n();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void triggerCloseBtn(String str) {
            d.this.f15822s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z10) {
            d dVar = d.this;
            if (dVar.f15804a != null) {
                dVar.f15817n = z10;
                if (z10) {
                    d.this.f15804a.a();
                } else {
                    d.this.f15804a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z10, String str) {
            try {
                if (d.this.f15804a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f15804a.c();
                        d.this.f15804a.onLeaveApp();
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.f15806c));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    d.this.a(campaignWithBackData, z10, str);
                }
            } catch (Exception e10) {
                q0.b("BannerShowManager", e10.getMessage());
            }
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f15809f != null) {
                    String str = d.this.f15825v == 2 ? "false" : "true";
                    d.this.f15809f.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class j implements View.OnTouchListener {
        public j() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            d.this.F = motionEvent.getRawX();
            d.this.G = motionEvent.getRawY();
            q0.b("BannerShowManager", d.this.F + "  " + d.this.G);
            return false;
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.F, d.this.G), d.this.f15806c), false, "");
        }
    }

    public class l implements com.mbridge.msdk.foundation.same.image.c {
        public l() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880039);
            bVar.b(d.this.f15821r);
            d.this.a(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (d.this.f15808e != null) {
                d.this.f15808e.setImageBitmap(bitmap);
            }
            d.this.f15814k = true;
            d.this.o();
            d.this.n();
            d.this.m();
            d dVar = d.this;
            if (dVar.f15818o) {
                return;
            }
            dVar.p();
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.p();
        }
    }

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.listener.c cVar, String str, String str2, boolean z10, com.mbridge.msdk.setting.l lVar) {
        this.f15805b = z10;
        this.f15807d = mBBannerView;
        this.f15819p = str2;
        this.f15820q = str;
        this.f15804a = new com.mbridge.msdk.mbbanner.common.listener.e(cVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        MBBannerView mBBannerView;
        if (this.f15814k && !this.f15815l && this.f15804a != null) {
            this.f15815l = true;
            this.D.removeCallbacks(this.E);
            CampaignEx campaignEx = this.f15806c;
            if (campaignEx != null && !campaignEx.isCallbacked()) {
                this.f15806c.setCallbacked(true);
                this.f15804a.a(this.f15824u);
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f15806c.getMaitve(), this.f15806c.getMaitve_src());
            }
        }
        if (this.f15814k && this.f15812i && this.f15813j && this.f15815l && this.f15806c != null && !d()) {
            boolean zA = a();
            if (!zA && (mBBannerView = this.f15807d) != null) {
                mBBannerView.postDelayed(new m(), 1000L);
            }
            if (this.f15816m && zA) {
                q0.b("BannerShowManager", "onBannerWebViewShow && transInfoToMraid");
                int[] iArr = new int[2];
                this.f15807d.getLocationInWindow(iArr);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f15809f, iArr[0], iArr[1]);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f15809f, iArr[0], iArr[1], this.f15807d.getWidth(), this.f15807d.getHeight());
                this.f15816m = false;
                this.f15827x = 1;
                if (!TextUtils.isEmpty(this.f15806c.getImageUrl())) {
                    com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f15806c.getImageUrl());
                }
                l();
            }
            q0.b("BannerShowManager", "showSuccessed:" + this.f15806c.getId());
            CampaignEx campaignEx2 = this.f15806c;
            if (!zA) {
                campaignEx2.setReport(false);
                return;
            }
            ImageView imageView = this.f15808e;
            if (imageView == null || imageView.getVisibility() != 0) {
                List<CampaignEx> list = this.f15824u;
                if (list != null && list.size() > 0) {
                    campaignEx2 = this.f15824u.get(0);
                    boolean z10 = false;
                    int i10 = 0;
                    for (int i11 = 0; i11 < this.f15824u.size(); i11++) {
                        if (!this.f15824u.get(i11).isHasMBTplMark() && (i11 == 0 || !this.f15824u.get(i11).isReport())) {
                            a(this.f15824u.get(i11), com.mbridge.msdk.foundation.controller.c.n().d(), this.f15819p);
                            this.f15824u.get(i11).setReport(true);
                            com.mbridge.msdk.foundation.same.buffer.b.a(this.f15819p, this.f15824u.get(i11), "banner");
                            i10 = i11;
                            z10 = true;
                        }
                    }
                    if (z10) {
                        b(this.f15824u.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), this.f15819p);
                        c(this.f15824u.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), this.f15819p);
                    }
                }
            } else {
                CampaignEx campaignEx3 = this.f15806c;
                if (campaignEx3 != null) {
                    b(campaignEx3);
                    this.f15806c.setReport(true);
                    this.f15827x = 2;
                    com.mbridge.msdk.foundation.same.buffer.b.a(this.f15819p, this.f15806c, "banner");
                }
            }
            this.f15818o = true;
            if (campaignEx2 == null || this.f15804a == null || e1.a(this.f15807d, campaignEx2.getImpReportType())) {
                return;
            }
            this.f15804a.a(this.f15806c);
            try {
                CampaignEx campaignEx4 = this.f15806c;
                if (campaignEx4 != null && campaignEx4.isActiveOm()) {
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    MBBannerWebView mBBannerWebView = this.f15809f;
                    o5.b bVarA = com.mbridge.msdk.omsdk.b.a(contextD, mBBannerWebView, mBBannerWebView.getUrl(), this.f15806c);
                    this.B = bVarA;
                    if (bVarA != null) {
                        try {
                            bVarA.d(this.f15809f);
                            ImageView imageView2 = this.f15810g;
                            if (imageView2 != null) {
                                this.B.a(imageView2, FriendlyObstructionPurpose.CLOSE_AD, null);
                            }
                            ImageView imageView3 = this.f15808e;
                            if (imageView3 != null) {
                                this.B.a(imageView3, FriendlyObstructionPurpose.OTHER, null);
                            }
                            this.B.g();
                        } catch (Exception e10) {
                            q0.a("OMSDK", e10.getMessage());
                        }
                    } else {
                        CampaignEx campaignEx5 = this.f15806c;
                        if (campaignEx5 != null) {
                            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx5.getRequestId(), this.f15806c.getRequestIdNotice(), this.f15806c.getId(), this.f15819p, "fetch OM failed, context null");
                        }
                    }
                }
            } catch (Exception unused) {
                CampaignEx campaignEx6 = this.f15806c;
                if (campaignEx6 != null) {
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx6.getRequestId(), this.f15806c.getRequestIdNotice(), this.f15806c.getId(), this.f15819p, "fetch OM failed, context null");
                }
            }
            this.D.sendEmptyMessageDelayed(1, 1000L);
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f15819p, this.f15806c.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f15811h == null) {
                    this.f15811h = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f15811h.getVisibility() != 0) {
                    this.f15811h.setVisibility(0);
                }
                v0.a(this.f15811h, bitmapDrawableA, this.f15807d.getResources().getDisplayMetrics());
                if (this.f15811h.getParent() == null) {
                    this.f15807d.addView(this.f15811h, new ViewGroup.LayoutParams(-1, -1));
                }
                o5.b bVar = this.B;
                if (bVar != null) {
                    bVar.a(this.f15811h, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        }
    }

    private boolean q() {
        String strA = a(this.f15806c);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        if (this.f15807d != null) {
            if (this.f15809f == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                    this.f15809f = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f15809f.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.f15819p, this.f15824u, this.I));
                } catch (Throwable unused) {
                    a(com.mbridge.msdk.foundation.error.a.a(880029), 1);
                    return false;
                }
            }
            ImageView imageView = this.f15808e;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f15809f.getVisibility() != 0) {
                this.f15809f.setVisibility(0);
            }
            if (this.f15809f.getParent() == null) {
                this.f15807d.addView(this.f15809f);
                a(this.f15806c.isMraid());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 296);
            if (TextUtils.isEmpty(this.f15806c.getBidToken())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f15819p, this.f15806c.getLocalRequestId());
            cVarA.a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar);
            b1.a(this.f15809f, cVarA.t(), this.f15806c.getLocalAllowTrackClick());
            if (this.f15806c.isMraid()) {
                m();
            }
            n();
            com.mbridge.msdk.mbbanner.common.communication.b bVar = new com.mbridge.msdk.mbbanner.common.communication.b(this.f15807d.getContext(), this.f15820q, this.f15819p);
            this.A = bVar;
            bVar.a(this.f15824u);
            this.A.a(this.I);
            this.A.a(this.f15828y);
            this.f15809f.setWebViewListener(this.J);
            this.f15809f.setObject(this.A);
            this.f15809f.loadUrl(strA);
            MBBannerWebView mBBannerWebView2 = this.f15809f;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new i(), 1000L);
            }
        } else {
            a(com.mbridge.msdk.foundation.error.a.a(880046), 2);
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880046);
            bVar2.b(this.f15821r);
            a(bVar2);
        }
        return true;
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    private synchronized boolean d() {
        boolean zIsReport;
        zIsReport = this.f15806c.isReport();
        if (!zIsReport) {
            this.f15806c.setReport(true);
        }
        return zIsReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ImageView imageView;
        if (this.f15805b && (imageView = this.f15810g) != null && imageView.getVisibility() == 0) {
            this.f15810g.setVisibility(8);
            this.f15810g.setOnClickListener(null);
            if (this.f15807d == null || this.f15810g.getParent() == null) {
                return;
            }
            this.f15807d.removeView(this.f15810g);
        }
    }

    private void f() {
        if (this.f15805b && this.f15810g == null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            this.f15810g = imageView;
            imageView.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_banner_close", "drawable"));
            this.f15810g.setVisibility(8);
            this.f15810g.setContentDescription("closeButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void g() {
        if (this.f15807d == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880046);
            bVar.b(this.f15821r);
            a(bVar);
            return;
        }
        MBBannerWebView mBBannerWebView = this.f15809f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f15807d.removeView(this.f15809f);
        }
        if (this.f15808e == null) {
            this.f15808e = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            this.f15826w = new j();
            this.f15808e.setOnClickListener(new k());
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 296);
        if (TextUtils.isEmpty(this.f15806c.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f15819p, this.f15806c.getLocalRequestId()).a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar);
        b1.a(this.f15808e, this.f15806c.getLocalRequestId(), this.f15806c.getLocalAllowTrackClick(), this.f15826w);
        String imageUrl = this.f15806c.getImageUrl();
        if (!TextUtils.isEmpty(imageUrl)) {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(imageUrl, new l());
            return;
        }
        com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880047);
        bVar2.b(this.f15821r);
        a(bVar2);
    }

    private void i() {
        o5.b bVar = this.B;
        if (bVar != null) {
            bVar.c();
            this.B = null;
            q0.a("omsdk", " adSession.finish() ");
        }
    }

    private void j() {
        try {
            CampaignEx campaignEx = this.f15806c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f15819p, campaignEx.getLocalRequestId());
                cVarA.g(this.f15827x);
                cVarA.b(true);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000152", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th) {
            q0.b("BannerShowManager", th.getMessage());
        }
    }

    private void k() {
        try {
            CampaignEx campaignEx = this.f15806c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f15819p, campaignEx.getLocalRequestId());
                cVarA.g(this.f15827x);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("close_click_type", Integer.valueOf(this.f15822s));
                eVar.a(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(this.f15806c.getCreativeId()));
                com.mbridge.msdk.mbbanner.common.report.a.a("2000069", cVarA, eVar);
            }
        } catch (Throwable th) {
            q0.b("BannerShowManager", th.getMessage());
        }
    }

    private void l() {
        try {
            CampaignEx campaignEx = this.f15806c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f15819p, campaignEx.getLocalRequestId());
                cVarA.g(this.f15827x);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000133", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th) {
            q0.b("BannerShowManager", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f15807d == null) {
            return;
        }
        CampaignEx campaignEx = this.f15806c;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() == 1) {
            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
            mBAdChoice.setCampaign(this.f15806c);
            mBAdChoice.setFeedbackDialogEventListener(new a());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 6.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f15807d.addView(mBAdChoice, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ImageView imageView;
        if (!this.f15805b || (imageView = this.f15810g) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f15810g.setVisibility(0);
            this.f15810g.setOnClickListener(this.H);
        }
        if (this.f15810g.getParent() != null || this.f15807d == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f15807d.addView(this.f15810g, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f15808e != null) {
            MBBannerWebView mBBannerWebView = this.f15809f;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (this.f15808e.getVisibility() != 0) {
                this.f15808e.setVisibility(0);
            }
            this.f15827x = 2;
            if (this.f15807d != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.f15808e.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f15808e.getParent() == null) {
                    this.f15807d.addView(this.f15808e, layoutParams);
                }
                a(true);
            }
        }
    }

    public void h() {
        i();
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f15806c, this.f15819p);
        if (this.f15804a != null) {
            this.f15804a = null;
        }
        MBBannerWebView mBBannerWebView = this.f15809f;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.J != null) {
            this.J = null;
        }
        ImageView imageView = this.f15810g;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f15808e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.f15807d;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f15809f;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.b bVar = this.A;
        if (bVar != null) {
            bVar.a();
        }
        if (this.I != null) {
            this.I = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f15819p);
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f15819p);
    }

    public void c(boolean z10) {
        this.f15805b = z10;
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
                q0.b("BannerShowManager", th.getMessage());
            }
        }
    }

    public void b(CampaignUnit campaignUnit) {
        CampaignEx campaignExA = a(campaignUnit);
        this.f15806c = campaignExA;
        if (campaignExA == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880043);
            bVar.b(this.f15821r);
            a(bVar);
            return;
        }
        if (!com.mbridge.msdk.foundation.tools.h.a(campaignExA, (Context) null, this.f15807d, campaignExA.getImpReportType())) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880044);
            bVar2.b(this.f15821r);
            a(bVar2);
            return;
        }
        this.D.removeCallbacks(this.E);
        f();
        this.f15814k = false;
        this.f15815l = false;
        this.f15818o = false;
        if (!TextUtils.isEmpty(this.f15806c.getBannerHtml()) || !TextUtils.isEmpty(this.f15806c.getBannerUrl())) {
            com.mbridge.msdk.mbbanner.common.report.a.a(this.f15819p, this.f15806c);
        }
        this.D.postDelayed(this.E, MBInterstitialActivity.WEB_LOAD_TIME);
        if (q()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f15806c.getBannerHtml()) || !TextUtils.isEmpty(this.f15806c.getBannerUrl())) {
            a(com.mbridge.msdk.foundation.error.a.a(880048), 2);
        }
        g();
    }

    public void d(boolean z10) {
        this.f15813j = z10;
        p();
    }

    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f15809f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f15809f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f15809f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* renamed from: com.mbridge.msdk.mbbanner.common.manager.d$d, reason: collision with other inner class name */
    public class C0276d implements com.mbridge.msdk.foundation.feedback.a {
        public C0276d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            d.this.f15807d.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f15809f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            d.this.f15807d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f15809f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            d.this.f15807d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f15809f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void a(boolean z10, int i10) {
        this.f15828y = i10;
        if (i10 != 0) {
            this.f15805b = z10;
            return;
        }
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f15819p);
        if (lVarE != null) {
            this.f15805b = lVarE.g() == 1;
        }
    }

    public int c() {
        return this.f15827x;
    }

    private CampaignEx a(CampaignUnit campaignUnit) {
        if (campaignUnit == null) {
            return null;
        }
        ArrayList<CampaignEx> ads = campaignUnit.getAds();
        this.f15824u = ads;
        if (ads == null || ads.size() <= 0) {
            return null;
        }
        return this.f15824u.get(0);
    }

    private String a(CampaignEx campaignEx) {
        String bannerUrl = "";
        if (campaignEx != null) {
            try {
                bannerUrl = campaignEx.getBannerUrl();
                if (TextUtils.isEmpty(bannerUrl)) {
                    bannerUrl = campaignEx.getBannerHtml();
                    File file = new File(bannerUrl);
                    if (file.exists() && file.isFile() && file.canRead()) {
                        return "file:////" + bannerUrl;
                    }
                }
                return bannerUrl;
            } catch (Throwable th) {
                q0.b("BannerShowManager", th.getMessage());
            }
        }
        return bannerUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        k();
        MBBannerWebView mBBannerWebView = this.f15809f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f15807d.removeView(this.f15809f);
        }
        ImageView imageView = this.f15808e;
        if (imageView != null && imageView.getParent() != null) {
            this.f15808e.setVisibility(8);
            this.f15807d.removeView(this.f15808e);
        }
        ImageView imageView2 = this.f15810g;
        if (imageView2 != null && imageView2.getParent() != null) {
            this.f15807d.removeView(this.f15810g);
            this.f15810g.setVisibility(8);
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f15819p);
        ImageView imageView3 = this.f15811h;
        if (imageView3 != null && imageView3.getParent() != null) {
            this.f15807d.removeView(this.f15811h);
            this.f15811h.setVisibility(8);
        }
        BannerUtils.inserCloseId(this.f15819p, this.f15824u);
        j();
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f15804a;
        if (cVar != null) {
            cVar.b();
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        if (this.f15806c == null || d()) {
            return;
        }
        this.D.removeCallbacks(this.E);
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f15804a;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    private boolean a() {
        if (this.f15807d == null) {
            return false;
        }
        CampaignEx campaignEx = this.f15806c;
        return (e1.a(this.f15807d, campaignEx != null ? campaignEx.getImpReportType() : 0) || this.f15817n) ? false : true;
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new b(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f13049m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    public void a(int i10, int i11, int i12, int i13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        com.mbridge.msdk.mbbanner.common.communication.a.a((WebView) this.f15809f, i10, i11);
    }

    private void a(boolean z10) {
        if (this.f15807d != null) {
            View viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f15819p);
            if (com.mbridge.msdk.foundation.feedback.b.b().a() && z10 && viewA != null) {
                ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewA);
                }
                viewA.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f14985e, com.mbridge.msdk.foundation.feedback.b.f14984d);
                }
                layoutParams.addRule(12);
                viewA.setLayoutParams(layoutParams);
                this.f15807d.addView(viewA);
            }
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f15819p, new C0276d());
            this.f15806c.setCampaignUnitId(this.f15819p);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f15819p, this.f15806c);
        }
    }

    public void b(boolean z10) {
        this.f15812i = z10;
        p();
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f15819p);
            b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f15819p);
            c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f15819p);
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
                q0.b("BannerShowManager", th.getMessage());
            }
        }
    }

    public void a(String str) {
        this.f15821r = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        try {
            CampaignEx campaignEx = this.f15806c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f15819p, campaignEx.getLocalRequestId());
                cVarA.g(this.f15827x);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", Integer.valueOf(i10));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                eVar.a("reason", str);
                cVarA.d(TextUtils.isEmpty(this.f15806c.getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000068", cVarA, eVar);
            }
        } catch (Throwable th) {
            q0.b("BannerShowManager", th.getMessage());
        }
    }
}
