package com.mbridge.msdk.video.module.listener.impl;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class k extends f {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f19187a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f19188b;

    /* renamed from: c, reason: collision with root package name */
    protected List<CampaignEx> f19189c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f19190d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.download.a f19191e;

    /* renamed from: f, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.entity.c f19192f;

    /* renamed from: g, reason: collision with root package name */
    protected String f19193g;

    /* renamed from: h, reason: collision with root package name */
    protected String f19194h;

    /* renamed from: i, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f19195i;

    /* renamed from: j, reason: collision with root package name */
    protected int f19196j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19197k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19198l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19199m = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (!kVar.f19187a || kVar.f19188b == null || !a1.b(kVar.f19193g) || com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                    return;
                }
                com.mbridge.msdk.foundation.db.i iVarA = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                fVar.a(System.currentTimeMillis());
                fVar.b(k.this.f19193g);
                fVar.a(k.this.f19188b.getId());
                iVarA.a(fVar);
            } catch (Throwable th) {
                q0.b("NotifyListener", th.getMessage(), th);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (kVar.f19187a && kVar.f19188b != null && a1.b(kVar.f19193g)) {
                    com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                    k kVar2 = k.this;
                    aVarA.a(kVar2.f19188b, kVar2.f19193g);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.videocommon.cache.a aVarA2 = com.mbridge.msdk.videocommon.cache.a.a();
                k kVar3 = k.this;
                aVarA2.b(kVar3.f19194h, kVar3.f19188b.getAdType());
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            } catch (Throwable th) {
                q0.a("NotifyListener", th.getMessage());
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(k.this.f19188b.getId());
            } catch (Throwable th) {
                q0.b("NotifyListener", th.getMessage(), th);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.videocommon.download.a aVar;
            try {
                if (s0.a().a("c_r_v_f_w_s_e", false)) {
                    return;
                }
                k kVar = k.this;
                if (!kVar.f19187a || (aVar = kVar.f19191e) == null) {
                    return;
                }
                if (aVar.h() != null && !TextUtils.isEmpty(k.this.f19191e.h().getVideoUrlEncode())) {
                    com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(k.this.f19191e.h().getVideoUrlEncode());
                }
                if (TextUtils.isEmpty(k.this.f19191e.p())) {
                    return;
                }
                File file = new File(k.this.f19191e.p());
                if (file.exists() && file.isFile() && file.delete()) {
                    q0.a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        this.f19190d = false;
        this.f19195i = new f();
        this.f19196j = 1;
        if (!z10 && campaignEx != null && a1.b(str2) && aVar != null && aVar2 != null) {
            this.f19188b = campaignEx;
            this.f19194h = str;
            this.f19193g = str2;
            this.f19191e = aVar;
            this.f19192f = cVar;
            this.f19195i = aVar2;
            this.f19187a = true;
            this.f19196j = i10;
            this.f19190d = false;
            return;
        }
        if (!z10 || campaignEx == null || !a1.b(str2) || aVar2 == null) {
            return;
        }
        this.f19188b = campaignEx;
        this.f19194h = str;
        this.f19193g = str2;
        this.f19191e = aVar;
        this.f19192f = cVar;
        this.f19195i = aVar2;
        this.f19187a = true;
        this.f19196j = i10;
        this.f19190d = true;
    }

    private void d() {
        if (!this.f19187a || com.mbridge.msdk.foundation.same.buffer.b.f15067k == null || TextUtils.isEmpty(this.f19188b.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f19193g, this.f19188b, "reward");
    }

    private void f() {
        if (this.f19188b != null) {
            try {
                HashMap map = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f19188b.getCampaignUnitId(), this.f19188b.getRequestId());
                if (listA == null || listA.size() <= 0 || listA.get(0) == null) {
                    return;
                }
                if (listA.get(0).c() == 1) {
                    map.put("encrypt_p=", "encrypt_p=" + listA.get(0).b());
                    map.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        CampaignEx campaignEx = this.f19188b;
                        campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                        CampaignEx campaignEx2 = this.f19188b;
                        campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str, str2));
                    }
                }
                q0.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f19188b.getRequestId()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void m() {
        new Thread(new c()).start();
    }

    public void a(CampaignEx campaignEx) {
        this.f19188b = campaignEx;
    }

    public void b(int i10) {
        if (this.f19188b != null) {
            if (i10 == 1 || i10 == 2) {
                com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f19188b, i10, this.f19196j);
            }
        }
    }

    public void c() {
        a aVar = new a();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    public void e() {
        d dVar = new d();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(dVar);
        } else {
            dVar.run();
        }
    }

    public void g() {
        if (!this.f19187a || this.f19188b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f19188b.getId(), this.f19188b.getRequestId(), this.f19188b.getRequestIdNotice(), this.f19193g, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
        nVar.b(this.f19188b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.n().d(), this.f19193g);
    }

    public void h() {
        String str;
        try {
            if (!this.f19187a || this.f19197k || TextUtils.isEmpty(this.f19188b.getImpressionURL())) {
                return;
            }
            this.f19197k = true;
            if (this.f19188b.isBidCampaign()) {
                f();
            }
            String impressionURL = this.f19188b.getImpressionURL();
            if (this.f19188b.getSpareOfferFlag() == 1) {
                str = impressionURL + "&to=1&cbt=" + this.f19188b.getCbt() + "&tmorl=" + this.f19196j;
            } else {
                str = impressionURL + "&to=0&cbt=" + this.f19188b.getCbt() + "&tmorl=" + this.f19196j;
            }
            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f19188b, this.f19193g, str, false, true, com.mbridge.msdk.click.retry.a.f13049m);
            com.mbridge.msdk.video.module.report.b.d(com.mbridge.msdk.foundation.controller.c.n().d(), this.f19188b);
            m();
            d();
        } catch (Throwable th) {
            q0.b("NotifyListener", th.getMessage(), th);
        }
    }

    public void i() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f19188b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f19190d && !this.f19188b.isCampaignIsFiltered()) {
                this.f19198l = true;
                return;
            }
            if (!this.f19187a || (campaignEx = this.f19188b) == null || TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) || (map = com.mbridge.msdk.foundation.same.buffer.b.f15068l) == null || map.containsKey(this.f19188b.getOnlyImpressionURL()) || this.f19198l) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.f15068l.put(this.f19188b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            String onlyImpressionURL = this.f19188b.getOnlyImpressionURL();
            if (this.f19188b.getSpareOfferFlag() == 1) {
                str = onlyImpressionURL + "&to=1&cbt=" + this.f19188b.getCbt() + "&tmorl=" + this.f19196j;
            } else {
                str = onlyImpressionURL + "&to=0&cbt=" + this.f19188b.getCbt() + "&tmorl=" + this.f19196j;
            }
            String str2 = str;
            if (!this.f19190d || this.f19188b.isCampaignIsFiltered()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f19188b, this.f19193g, str2, false, true, com.mbridge.msdk.click.retry.a.f13050n);
                b();
            }
            this.f19198l = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (!this.f19187a || this.f19199m || (campaignEx = this.f19188b) == null) {
                return;
            }
            this.f19199m = true;
            if ((campaignEx.isDynamicView() && this.f19190d && !this.f19188b.isCampaignIsFiltered()) || (pv_urls = this.f19188b.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f19188b, this.f19193g, it.next(), false, true);
            }
        } catch (Throwable th) {
            q0.b("NotifyListener", th.getMessage());
        }
    }

    public void k() {
        CampaignEx campaignEx = this.f19188b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCampaignUnitId()) || this.f19188b.getNativeVideoTracking() == null || this.f19188b.getNativeVideoTracking().n() == null) {
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        CampaignEx campaignEx2 = this.f19188b;
        com.mbridge.msdk.click.a.a(contextD, campaignEx2, campaignEx2.getCampaignUnitId(), this.f19188b.getNativeVideoTracking().n(), false, false);
    }

    public void l() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f19191e;
        if (aVar != null) {
            aVar.d(true);
        }
    }

    public void a(List<CampaignEx> list) {
        this.f19189c = list;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        this.f19195i.a(i10, obj);
    }

    public void b() {
        try {
            b bVar = new b();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
            } else {
                bVar.run();
            }
        } catch (Throwable th) {
            q0.b("NotifyListener", th.getMessage(), th);
        }
    }

    public void a(int i10, String str) {
        if (this.f19188b != null) {
            com.mbridge.msdk.foundation.same.report.g.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.f19188b.getId(), this.f19188b.getRequestId(), this.f19188b.getRequestIdNotice(), this.f19193g, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()), i10, str), com.mbridge.msdk.foundation.controller.c.n().d(), this.f19193g);
        }
    }

    public void b(String str) {
        try {
            if (this.f19188b != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("url", this.f19188b.getVideoUrlEncode());
                eVar.a("reason", str);
                String noticeUrl = this.f19188b.getNoticeUrl();
                String clickURL = this.f19188b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        eVar.a("offer_url", clickURL);
                    }
                } else {
                    eVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000021", this.f19188b, eVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        CampaignEx campaignEx = this.f19188b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i10 == 1 || i10 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i10);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i10);
                    }
                    noticeUrl = sb.toString();
                } else if (i10 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f19188b.setNoticeUrl(noticeUrl);
            }
        }
    }

    public void a() {
        com.mbridge.msdk.videocommon.download.b.getInstance().a(false);
    }

    public void a(String str) {
        List<CampaignEx> list;
        if (this.f19188b == null || (list = this.f19189c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f19188b = this.f19189c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NotifyListener", e10.getMessage());
            }
        }
    }
}
