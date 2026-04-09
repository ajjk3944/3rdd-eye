package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: n, reason: collision with root package name */
    private static final String f15775n = "b";

    /* renamed from: a, reason: collision with root package name */
    private Context f15776a;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.data.b f15778c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f15779d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f15780e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.d f15781f;

    /* renamed from: b, reason: collision with root package name */
    private int f15777b = 0;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f15782g = false;

    /* renamed from: h, reason: collision with root package name */
    private Timer f15783h = new Timer();

    /* renamed from: i, reason: collision with root package name */
    private volatile List<String> f15784i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f15785j = false;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f15786k = false;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f15787l = false;

    /* renamed from: m, reason: collision with root package name */
    private String f15788m = "";

    public class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15790b;

        public a(String str, CampaignEx campaignEx) {
            this.f15789a = str;
            this.f15790b = campaignEx;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (b.this.f15782g) {
                return;
            }
            b.this.f15782g = true;
            b.this.a(this.f15789a, -1, "", false, this.f15790b);
        }
    }

    public class c extends c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15794a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15795b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f15796c;

        public c(String str, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f15794a = str;
            this.f15795b = campaignEx;
            this.f15796c = context;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f15794a);
            cVar.a(str, eVar);
            com.mbridge.msdk.mbbanner.common.report.a.a(str, cVar, this.f15795b, this.f15796c, null);
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f15798a;

        public d(CampaignUnit campaignUnit) {
            this.f15798a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.c(b.f15775n, "在单独子线程保存数据库 开始");
            j.a(g.a(b.this.f15776a)).d();
            CampaignUnit campaignUnit = this.f15798a;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f15798a.getAds().size() > 0) {
                BannerUtils.uisList(b.this.f15776a, this.f15798a.getAds());
            }
            q0.c(b.f15775n, "在单独子线程保存数据库 完成");
        }
    }

    public static class e implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        private b f15800a;

        /* renamed from: b, reason: collision with root package name */
        private String f15801b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f15802c;

        public e(b bVar, String str, CampaignEx campaignEx) {
            this.f15800a = bVar;
            this.f15801b = str;
            this.f15802c = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            String str3;
            if (MBridgeConstans.DEBUG) {
                q0.c(b.f15775n, "DownloadImageListener campaign image fail");
            }
            b bVar = this.f15800a;
            if (bVar != null) {
                str3 = str2;
                bVar.a(this.f15801b, 1, str3, false, this.f15802c);
            } else {
                str3 = str2;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f15801b, this.f15802c.getCurrentLocalRid());
                cVarA.a(this.f15802c);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                cVarA.e(10);
                eVar.a("resource_type", 10);
                eVar.a("result", 3);
                eVar.a("url", str3);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_end", cVarA, eVar);
            } catch (Throwable th) {
                q0.b(b.f15775n, th.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            String str2;
            if (MBridgeConstans.DEBUG) {
                q0.c(b.f15775n, "DownloadImageListener campaign image success");
            }
            b bVar = this.f15800a;
            if (bVar != null) {
                str2 = str;
                bVar.a(this.f15801b, 1, str2, true, this.f15802c);
            } else {
                str2 = str;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f15801b, this.f15802c.getCurrentLocalRid());
                cVarA.a(this.f15802c);
                cVarA.e(10);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("resource_type", 10);
                eVar.a("result", 1);
                eVar.a("url", str2);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_end", cVarA, eVar);
            } catch (Throwable th) {
                q0.b(b.f15775n, th.getMessage());
            }
        }
    }

    public b(Context context, com.mbridge.msdk.mbbanner.common.data.b bVar, com.mbridge.msdk.mbbanner.common.listener.b bVar2, com.mbridge.msdk.mbbanner.common.util.a aVar) {
        this.f15776a = context.getApplicationContext();
        this.f15778c = bVar;
        this.f15780e = bVar2;
        this.f15779d = aVar;
    }

    private void b(String str, List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                this.f15784i.add(campaignEx.getImageUrl());
                com.mbridge.msdk.foundation.same.image.b.a(this.f15776a).a(campaignEx.getImageUrl(), new e(this, str, campaignEx));
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str, campaignEx.getCurrentLocalRid());
                cVarA.a(campaignEx);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("resource_type", 10);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_start", cVarA, eVar);
            }
        }
    }

    private void a(String str, int i10) {
        if (this.f15787l) {
            return;
        }
        if ((this.f15785j || this.f15786k) && this.f15784i.size() == 0) {
            q0.c(f15775n, "在子线程处理业务逻辑 完成");
            this.f15782g = true;
            this.f15787l = true;
            this.f15783h.cancel();
            this.f15779d.a(this.f15780e, str, i10);
            this.f15781f.a(str);
        }
    }

    private void a(String str, CampaignEx campaignEx) {
        String str2 = f15775n;
        q0.c(str2, "在子线程处理业务逻辑 完成");
        q0.c(str2, "downloadResource--> Fail");
        this.f15782g = true;
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
        MBridgeIds mBridgeIds = new MBridgeIds();
        mBridgeIds.setUnitId(str);
        bVar.a(mBridgeIds);
        bVar.b(this.f15778c.a());
        bVar.a(campaignEx);
        this.f15779d.b(this.f15780e, bVar);
        this.f15781f.a(str);
    }

    /* renamed from: com.mbridge.msdk.mbbanner.common.manager.b$b, reason: collision with other inner class name */
    public class C0275b extends com.mbridge.msdk.mbbanner.common.response.a {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f15792c;

        public C0275b(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f15792c = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.a
        public void a(CampaignUnit campaignUnit) throws Throwable {
            try {
                q0.c(b.f15775n, "requestCampaign--> Succeed");
                campaignUnit.setLocalRequestId(this.f15792c.b());
                b.this.f15779d.a(b.this.f15780e, campaignUnit, this.unitId);
                b.this.a(this.unitId, this.f15792c.b(), campaignUnit);
            } catch (Exception e10) {
                q0.c(b.f15775n, "requestCampaign--> Fail with exception = " + e10.getMessage());
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
                bVar.a(new MBridgeIds(this.placementId, this.unitId));
                bVar.b(this.f15792c.b());
                bVar.a((campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().isEmpty()) ? null : campaignUnit.getAds().get(0));
                bVar.a((Throwable) e10);
                b.this.f15779d.a(b.this.f15780e, bVar);
                b.this.f15781f.a(this.unitId);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.a
        public void a(int i10, String str) {
            q0.c(b.f15775n, "requestCampaign--> Fail errorCode:" + i10 + " msg:" + str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
            bVar.c(i10 + "#" + str);
            bVar.a(new MBridgeIds(this.placementId, this.unitId));
            bVar.b(this.f15792c.b());
            b.this.f15779d.a(b.this.f15780e, bVar);
            b.this.f15781f.a(this.unitId);
        }
    }

    private void b(String str, String str2, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a(str, 3, str2, true, campaignEx);
    }

    private String b() {
        return this.f15778c.d();
    }

    private void b(String str) {
        this.f15778c.b(str);
    }

    public void a(String str, int i10, String str2, boolean z10, CampaignEx campaignEx) {
        if (!z10) {
            if (i10 == -1) {
                q0.b(f15775n, " unitId =" + str + " --> time out!");
            }
            this.f15783h.cancel();
            a(str, campaignEx);
            return;
        }
        if (i10 == 1) {
            q0.c(f15775n, "downloadResource--> Success Image");
            synchronized (this) {
                try {
                    this.f15784i.remove(str2);
                    if (this.f15784i.size() == 0) {
                        a(str, i10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (i10 == 2) {
            q0.c(f15775n, "downloadResource--> Success banner_html");
            this.f15786k = true;
            a(str, i10);
        } else if (i10 == 3) {
            q0.c(f15775n, "downloadResource--> Success banner_url");
            this.f15785j = true;
            a(str, i10);
        }
    }

    private void a(String str, int i10, CampaignEx campaignEx) {
        this.f15783h.schedule(new a(str, campaignEx), i10);
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.d dVar) {
        boolean z10;
        try {
            q0.c(f15775n, "requestCampaign--> started");
            this.f15781f = dVar;
            C0275b c0275b = new C0275b(aVar);
            c0275b.setUnitId(str2);
            c0275b.setPlacementId(str);
            c0275b.setAdType(296);
            com.mbridge.msdk.mbbanner.common.request.a aVar2 = new com.mbridge.msdk.mbbanner.common.request.a(this.f15776a);
            this.f15777b = a(str2);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = com.mbridge.msdk.mbbanner.common.data.c.a(false, this.f15776a, str2, b(), this.f15777b, aVar);
            String strD = v0.d(str2);
            if (!TextUtils.isEmpty(strD)) {
                eVarA.a("j", strD);
            }
            String strA = aVar.a();
            if (TextUtils.isEmpty(strA)) {
                z10 = false;
            } else {
                c0275b.a(strA);
                z10 = true;
            }
            this.f15779d.a(z10);
            aVar2.choiceV3OrV5BySetting(1, eVarA, c0275b, strA, 30000L);
        } catch (Exception e10) {
            q0.b(f15775n, e10.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.a(new MBridgeIds(str, str2));
            this.f15779d.a(this.f15780e, bVar);
            this.f15781f.a(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, CampaignUnit campaignUnit) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        CampaignEx campaignEx;
        if (campaignUnit == null) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880003);
            MBridgeIds mBridgeIds = new MBridgeIds();
            mBridgeIds.setUnitId(str);
            bVar2.a(mBridgeIds);
            bVar2.b(str2);
            this.f15779d.a(this.f15780e, bVar2);
            this.f15781f.a(str);
            return;
        }
        List<CampaignEx> listA = a(str, campaignUnit);
        a(campaignUnit);
        int i10 = 0;
        if (listA != null && listA.size() != 0) {
            q0.c(f15775n, "在子线程处理业务逻辑 开始");
            CampaignEx campaignEx2 = listA.get(0);
            a(str, 60000, campaignEx2);
            b(campaignUnit.getSessionId());
            a(str, listA);
            String strTrim = campaignEx2.getBannerUrl().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                b(str, strTrim, campaignEx2);
                if (listA.size() > 0) {
                    while (i10 < listA.size()) {
                        listA.get(i10).setBannerUrl(campaignEx2.getBannerUrl());
                        listA.get(i10).setHasMBTplMark(true);
                        i10++;
                    }
                }
            } else {
                String strTrim2 = campaignEx2.getBannerHtml().trim();
                if (!TextUtils.isEmpty(strTrim2)) {
                    String strA = a(str, strTrim2, campaignEx2);
                    if (listA.size() > 0) {
                        while (i10 < listA.size()) {
                            listA.get(i10).setBannerHtml(strA);
                            listA.get(i10).setHasMBTplMark(strTrim2.contains("<MBTPLMARK>"));
                            i10++;
                        }
                    }
                } else {
                    this.f15786k = true;
                    this.f15785j = true;
                }
            }
            b(str, listA);
            return;
        }
        q0.c(f15775n, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
        if (this.f15788m.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        MBridgeIds mBridgeIds2 = new MBridgeIds();
        mBridgeIds2.setUnitId(str);
        bVar.a(mBridgeIds2);
        bVar.b(str2);
        if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && (campaignEx = campaignUnit.getAds().get(0)) != null) {
            bVar.a(campaignEx);
        }
        this.f15779d.a(this.f15780e, bVar);
        this.f15781f.a(str);
    }

    private List<CampaignEx> a(String str, CampaignUnit campaignUnit) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    q0.c(f15775n, "getNeedShowList 总共返回的campaign有：" + ads.size());
                    y.a(ads);
                    int i10 = 0;
                    while (i10 < ads.size()) {
                        CampaignEx campaignEx = ads.get(i10);
                        if (campaignEx == null || campaignEx.getOfferType() == 99 || (TextUtils.isEmpty(campaignEx.getBannerUrl()) && TextUtils.isEmpty(campaignEx.getBannerHtml()) && TextUtils.isEmpty(campaignEx.getImageUrl()))) {
                            str2 = str;
                        } else {
                            if (v0.c(campaignEx)) {
                                campaignEx.setRtinsType(v0.c(this.f15776a, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (com.mbridge.msdk.foundation.same.c.b(this.f15776a, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                v0.a(str, campaignEx, com.mbridge.msdk.foundation.same.a.f15049x);
                                this.f15788m = "APP ALREADY INSTALLED";
                            }
                            str2 = str;
                            a(campaignEx, this.f15776a, (com.mbridge.msdk.foundation.same.report.metrics.c) null, str2, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
                        }
                        i10++;
                        str = str2;
                    }
                    q0.c(f15775n, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                    return arrayList;
                }
            } catch (Exception e10) {
                q0.b(f15775n, e10.getMessage());
            }
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, context, cVar, new c(str, campaignEx, context, aVar));
        } catch (Exception e10) {
            q0.b(f15775n, e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.lang.String r14, java.lang.String r15, com.mbridge.msdk.foundation.entity.CampaignEx r16) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb5
            r2 = 0
            com.mbridge.msdk.foundation.same.directory.c r0 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.lang.String r0 = com.mbridge.msdk.foundation.same.directory.e.b(r0)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.c1.b(r15)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            if (r4 == 0) goto L2c
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            goto L2c
        L26:
            r0 = move-exception
            r14 = r0
            goto La2
        L2a:
            r0 = move-exception
            goto L5c
        L2c:
            java.lang.String r4 = ".html"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            android.net.Uri r0 = android.net.Uri.parse(r15)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            r0.getPath()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2a
            byte[] r0 = r15.getBytes()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            r3.write(r0)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            r3.flush()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            r3.close()     // Catch: java.lang.Exception -> L55
            goto L74
        L55:
            r0 = move-exception
            goto L6b
        L57:
            r0 = move-exception
            r14 = r0
            goto La3
        L5a:
            r0 = move-exception
            r2 = r3
        L5c:
            java.lang.String r3 = com.mbridge.msdk.mbbanner.common.manager.b.f15775n     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L26
            com.mbridge.msdk.foundation.tools.q0.b(r3, r0)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L74
            r2.close()     // Catch: java.lang.Exception -> L55
            goto L74
        L6b:
            java.lang.String r2 = com.mbridge.msdk.mbbanner.common.manager.b.f15775n
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r2, r0)
        L74:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L97
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L97
            boolean r0 = r0.canRead()
            if (r0 != 0) goto L8c
            goto L97
        L8c:
            r4 = 2
            r6 = 1
            r2 = r13
            r3 = r14
            r5 = r15
            r7 = r16
            r2.a(r3, r4, r5, r6, r7)
            goto La1
        L97:
            r9 = 2
            r11 = 0
            r7 = r13
            r8 = r14
            r10 = r15
            r12 = r16
            r7.a(r8, r9, r10, r11, r12)
        La1:
            return r1
        La2:
            r3 = r2
        La3:
            if (r3 == 0) goto Lb4
            r3.close()     // Catch: java.lang.Exception -> La9
            goto Lb4
        La9:
            r0 = move-exception
            r15 = r0
            java.lang.String r0 = com.mbridge.msdk.mbbanner.common.manager.b.f15775n
            java.lang.String r15 = r15.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r0, r15)
        Lb4:
            throw r14
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.manager.b.a(java.lang.String, java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx):java.lang.String");
    }

    private void a(CampaignUnit campaignUnit) {
        new Thread(new d(campaignUnit)).start();
    }

    private int a(String str) {
        try {
            int iC = this.f15778c.c();
            if (iC > this.f15778c.b()) {
                return 0;
            }
            return iC;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private void a(String str, List<CampaignEx> list) {
        int size = this.f15777b;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    size += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (size > this.f15778c.b()) {
            q0.c(f15775n, "saveNextOffset 重置offset为0");
            size = 0;
        }
        q0.c(f15775n, "saveNextOffset 算出 下次的offset是:" + size);
        if (a1.b(str)) {
            this.f15778c.a(size);
        }
    }
}
