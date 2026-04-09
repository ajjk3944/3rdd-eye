package com.mbridge.msdk.mbbanner.controll;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbanner.common.manager.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: x, reason: collision with root package name */
    private static String f15871x = "BannerController";

    /* renamed from: a, reason: collision with root package name */
    private String f15872a;

    /* renamed from: b, reason: collision with root package name */
    private String f15873b;

    /* renamed from: c, reason: collision with root package name */
    private String f15874c;

    /* renamed from: d, reason: collision with root package name */
    private MBridgeIds f15875d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15876e;

    /* renamed from: f, reason: collision with root package name */
    private int f15877f;

    /* renamed from: g, reason: collision with root package name */
    private MBBannerView f15878g;

    /* renamed from: h, reason: collision with root package name */
    private int f15879h;

    /* renamed from: i, reason: collision with root package name */
    private int f15880i;

    /* renamed from: j, reason: collision with root package name */
    private int f15881j;

    /* renamed from: l, reason: collision with root package name */
    private BannerAdListener f15883l;

    /* renamed from: m, reason: collision with root package name */
    private CampaignUnit f15884m;

    /* renamed from: n, reason: collision with root package name */
    private c f15885n;

    /* renamed from: o, reason: collision with root package name */
    private l f15886o;

    /* renamed from: p, reason: collision with root package name */
    private j f15887p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f15888q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f15889r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15890s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15891t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f15892u;

    /* renamed from: k, reason: collision with root package name */
    private int f15882k = -1;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.c f15893v = new C0280a();

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f15894w = new b();

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f15878g = mBBannerView;
        if (bannerSize != null) {
            this.f15879h = bannerSize.getHeight();
            this.f15880i = bannerSize.getWidth();
        }
        this.f15872a = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f15873b = str;
        this.f15875d = new MBridgeIds(str, this.f15872a);
        f();
    }

    private int a(int i10) {
        if (i10 > 0) {
            if (i10 < 10) {
                return 10;
            }
            if (i10 > 180) {
                return 180;
            }
        }
        return i10;
    }

    private void l() {
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f15872a);
        this.f15886o = lVarE;
        if (lVarE == null) {
            this.f15886o = l.i(this.f15872a);
        }
        if (this.f15882k == -1) {
            this.f15881j = a(this.f15886o.D());
        }
        if (this.f15877f == 0) {
            boolean z10 = this.f15886o.g() == 1;
            this.f15876e = z10;
            c cVar = this.f15885n;
            if (cVar != null) {
                cVar.c(z10);
            }
        }
    }

    public class b implements com.mbridge.msdk.mbbanner.common.listener.b {
        public b() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, CampaignUnit campaignUnit, boolean z10) {
            a.this.f15884m = campaignUnit;
            a.this.a(1, (com.mbridge.msdk.foundation.error.b) null);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void b(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(2, bVar);
            a.this.a(bVar.k(), bVar);
            a.this.c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.b
        public void a(String str, int i10, boolean z10) {
            if (a.this.f15878g != null) {
                a.this.f15891t = true;
                a.this.j();
            }
        }
    }

    private boolean a(View view) {
        return true;
    }

    private void f() {
        b(com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f15890s || !this.f15891t) {
            return;
        }
        if (!a(this.f15878g)) {
            a(new com.mbridge.msdk.foundation.error.b(880044));
        } else if (this.f15884m != null) {
            if (this.f15885n == null) {
                this.f15885n = new c(this.f15878g, this.f15893v, this.f15873b, this.f15872a, this.f15876e, this.f15886o);
            }
            this.f15885n.a(this.f15874c);
            this.f15885n.b(this.f15888q);
            this.f15885n.d(this.f15889r);
            this.f15885n.a(this.f15876e, this.f15877f);
            this.f15885n.b(this.f15884m);
        } else {
            a(new com.mbridge.msdk.foundation.error.b(880043));
        }
        this.f15891t = false;
    }

    private void k() {
        MBBannerView mBBannerView = this.f15878g;
        if (mBBannerView != null) {
            if (!this.f15888q || !this.f15889r || this.f15892u || e1.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, this.f15873b, this.f15872a, null, null);
            } else {
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f15873b, this.f15872a, new com.mbridge.msdk.mbbanner.common.data.a(this.f15880i + "x" + this.f15879h, this.f15881j * 1000), this.f15894w);
            }
            if (this.f15888q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f15873b, this.f15872a, null, null);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f15872a);
        }
    }

    public void c() {
        if (this.f15890s) {
            return;
        }
        k();
        l();
        com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f15880i + "x" + this.f15879h, this.f15881j * 1000);
        aVar.c(this.f15873b);
        aVar.a(true);
        aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(this.f15873b, this.f15872a, aVar, this.f15894w);
    }

    public String d() {
        CampaignUnit campaignUnit = this.f15884m;
        return campaignUnit != null ? com.mbridge.msdk.foundation.same.c.b(campaignUnit.getAds()) : "";
    }

    public String e() {
        CampaignUnit campaignUnit = this.f15884m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f15884m.getRequestId();
    }

    public void g() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f15873b, this.f15872a, new com.mbridge.msdk.mbbanner.common.data.a(this.f15880i + "x" + this.f15879h, this.f15881j * 1000), this.f15894w);
    }

    public void h() {
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, this.f15873b, this.f15872a, new com.mbridge.msdk.mbbanner.common.data.a(this.f15880i + "x" + this.f15879h, this.f15881j * 1000), this.f15894w);
    }

    public void i() {
        this.f15890s = true;
        if (this.f15883l != null) {
            this.f15883l = null;
        }
        if (this.f15894w != null) {
            this.f15894w = null;
        }
        if (this.f15893v != null) {
            this.f15893v = null;
        }
        if (this.f15878g != null) {
            this.f15878g = null;
        }
        com.mbridge.msdk.mbbanner.common.manager.a.b().a(4, this.f15873b, this.f15872a, null, null);
        com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f15872a);
        com.mbridge.msdk.mbbanner.common.manager.a.b().c();
        c cVar = this.f15885n;
        if (cVar != null) {
            cVar.h();
        }
    }

    public void b(int i10) {
        int iA = a(i10);
        this.f15882k = iA;
        this.f15881j = iA;
    }

    private void b(String str, String str2) {
        if (this.f15887p == null) {
            this.f15887p = new j();
        }
        this.f15887p.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, this.f15872a);
    }

    public void b(boolean z10) {
        this.f15888q = z10;
        b();
        j();
    }

    /* renamed from: com.mbridge.msdk.mbbanner.controll.a$a, reason: collision with other inner class name */
    public class C0280a implements com.mbridge.msdk.mbbanner.common.listener.c {
        public C0280a() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(List<CampaignEx> list) {
            q0.b(a.f15871x, "onShowSuccessed:");
            if (a.this.f15883l != null) {
                a.this.f15883l.onLoadSuccessed(a.this.f15875d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f15872a, list.get(0).getLocalRequestId());
                cVarA.b(list);
                cVarA.g(1);
                cVarA.d(TextUtils.isEmpty(list.get(0).getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000048", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f15871x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void b() {
            if (a.this.f15883l != null) {
                a.this.f15883l.onCloseBanner(a.this.f15875d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void c() {
            if (a.this.f15883l != null) {
                a.this.f15883l.onClick(a.this.f15875d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void d() {
            if (a.this.f15883l != null) {
                a.this.f15883l.closeFullScreen(a.this.f15875d);
                a.this.f15892u = false;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(3, a.this.f15873b, a.this.f15872a, new com.mbridge.msdk.mbbanner.common.data.a(a.this.f15880i + "x" + a.this.f15879h, a.this.f15881j * 1000), a.this.f15894w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void onLeaveApp() {
            if (a.this.f15883l != null) {
                a.this.f15883l.onLeaveApp(a.this.f15875d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(CampaignEx campaignEx) {
            a.this.c();
            if (a.this.f15883l != null) {
                a.this.f15883l.onLogImpression(a.this.f15875d);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(a.this.f15872a, campaignEx.getLocalRequestId());
                cVarA.a(campaignEx);
                cVarA.h(campaignEx.isBidCampaign() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
                int i10 = 1;
                cVarA.g(a.this.f15885n != null ? a.this.f15885n.c() : 1);
                if (a.this.f15881j != 0) {
                    i10 = 2;
                }
                cVarA.b(i10);
                cVarA.c(a.this.f15881j);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000128", cVarA, (e) null);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000130", cVarA, (e) null);
            } catch (Exception e10) {
                q0.b(a.f15871x, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a(com.mbridge.msdk.foundation.error.b bVar) {
            a.this.a(bVar);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.c
        public void a() {
            if (a.this.f15883l != null) {
                a.this.f15883l.showFullScreen(a.this.f15875d);
                a.this.f15892u = true;
                com.mbridge.msdk.mbbanner.common.manager.a.b().a(2, a.this.f15873b, a.this.f15872a, null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.error.b bVar) {
        CampaignUnit campaignUnit;
        String strL = "";
        if (bVar != null) {
            try {
                strL = bVar.l();
                if (TextUtils.isEmpty(str)) {
                    str = bVar.k();
                }
            } catch (Throwable th) {
                q0.b(f15871x, th.getMessage());
            }
        }
        if (TextUtils.isEmpty(str) && (campaignUnit = this.f15884m) != null) {
            str = campaignUnit.getLocalRequestId();
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f15872a, str);
        CampaignUnit campaignUnit2 = this.f15884m;
        cVarA.b(campaignUnit2 != null ? campaignUnit2.getAds() : null);
        cVarA.a(bVar);
        CampaignUnit campaignUnit3 = this.f15884m;
        if (campaignUnit3 != null && !campaignUnit3.getAds().isEmpty()) {
            cVarA.d(TextUtils.isEmpty(this.f15884m.getAds().get(0).getBannerUrl()) ? 1 : 2);
        }
        cVarA.b(true);
        com.mbridge.msdk.mbbanner.common.report.a.a("2000047", cVarA, (e) null);
        BannerAdListener bannerAdListener = this.f15883l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f15875d, strL);
        }
    }

    public void b() {
        k();
        c cVar = this.f15885n;
        if (cVar != null) {
            cVar.b(this.f15888q);
            this.f15885n.d(this.f15889r);
        }
    }

    public void c(boolean z10) {
        this.f15889r = z10;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, com.mbridge.msdk.foundation.error.b bVar) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f15872a, bVar == null ? this.f15884m.getLocalRequestId() : bVar.k());
            e eVar = new e();
            eVar.a("result", Integer.valueOf(i10));
            CampaignUnit campaignUnit = this.f15884m;
            if (campaignUnit != null && !campaignUnit.getAds().isEmpty()) {
                CampaignEx campaignEx = this.f15884m.getAds().get(0);
                if (campaignEx != null) {
                    cVarA.d(TextUtils.isEmpty(campaignEx.getBannerUrl()) ? 2 : 1);
                }
                cVarA.b(this.f15884m.getAds());
            }
            if (bVar != null) {
                cVarA.a(bVar);
            }
            com.mbridge.msdk.mbbanner.common.report.a.a("2000126", cVarA, eVar);
        } catch (Exception e10) {
            q0.b(f15871x, e10.getMessage());
        }
    }

    public void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f15879h = bannerSize.getHeight();
            this.f15880i = bannerSize.getWidth();
        }
    }

    public void a(boolean z10) {
        this.f15876e = z10;
        this.f15877f = z10 ? 1 : 2;
    }

    public void a(String str, String str2) {
        boolean zB;
        if (this.f15879h >= 1 && this.f15880i >= 1) {
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(f15871x, e10.getMessage());
                zB = false;
            }
            if (!zB) {
                a(str2, new com.mbridge.msdk.foundation.error.b(880029));
                return;
            }
            this.f15874c = str2;
            com.mbridge.msdk.mbbanner.common.data.a aVar = new com.mbridge.msdk.mbbanner.common.data.a(this.f15880i + "x" + this.f15879h, this.f15881j * 1000);
            aVar.a(str);
            aVar.c(this.f15873b);
            aVar.b(str2);
            com.mbridge.msdk.mbbanner.common.manager.a.b().b(this.f15873b, this.f15872a, aVar, this.f15894w);
            com.mbridge.msdk.mbbanner.common.manager.a.b().a(1, this.f15873b, this.f15872a, aVar, this.f15894w);
            return;
        }
        a(str2, new com.mbridge.msdk.foundation.error.b(880037));
    }

    public void a(BannerAdListener bannerAdListener) {
        this.f15883l = bannerAdListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        a(this.f15874c, bVar);
        if (bVar.g() != 880044) {
            c();
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        c cVar = this.f15885n;
        if (cVar != null) {
            cVar.a(i10, i11, i12, i13);
        }
    }
}
