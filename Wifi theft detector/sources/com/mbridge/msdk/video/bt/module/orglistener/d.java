package com.mbridge.msdk.video.bt.module.orglistener;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public class d extends b {

    /* renamed from: c, reason: collision with root package name */
    private h f18679c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f18680d;

    /* renamed from: e, reason: collision with root package name */
    private String f18681e;

    /* renamed from: f, reason: collision with root package name */
    private String f18682f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18683g;

    /* renamed from: h, reason: collision with root package name */
    private Context f18684h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18685i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18686j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18687k = false;

    public d(Context context, boolean z10, com.mbridge.msdk.videocommon.setting.c cVar, CampaignEx campaignEx, h hVar, String str, String str2) {
        this.f18679c = hVar;
        this.f18680d = cVar;
        this.f18681e = str2;
        this.f18682f = str;
        this.f18683g = z10;
        this.f18684h = context;
        a(cVar, campaignEx);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.mbridge.msdk.videocommon.setting.c r7, com.mbridge.msdk.foundation.entity.CampaignEx r8) {
        /*
            r6 = this;
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Exception -> L5c
            java.lang.String r0 = r0.b()     // Catch: java.lang.Exception -> L5c
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L5c
            r2 = 0
            if (r1 != 0) goto L2c
            com.mbridge.msdk.setting.h r1 = com.mbridge.msdk.setting.h.b()     // Catch: java.lang.Exception -> L5c
            com.mbridge.msdk.setting.g r0 = r1.d(r0)     // Catch: java.lang.Exception -> L5c
            if (r0 != 0) goto L22
            com.mbridge.msdk.setting.h r0 = com.mbridge.msdk.setting.h.b()     // Catch: java.lang.Exception -> L5c
            com.mbridge.msdk.setting.g r0 = r0.a()     // Catch: java.lang.Exception -> L5c
        L22:
            if (r0 == 0) goto L2c
            long r0 = r0.c0()     // Catch: java.lang.Exception -> L5c
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            goto L2d
        L2c:
            r0 = r2
        L2d:
            com.mbridge.msdk.videocommon.setting.b r4 = com.mbridge.msdk.videocommon.setting.b.b()     // Catch: java.lang.Exception -> L5c
            com.mbridge.msdk.videocommon.setting.a r4 = r4.c()     // Catch: java.lang.Exception -> L5c
            if (r4 == 0) goto L3b
            long r2 = r4.e()     // Catch: java.lang.Exception -> L5c
        L3b:
            if (r8 == 0) goto L5c
            boolean r0 = r8.isSpareOffer(r2, r0)     // Catch: java.lang.Exception -> L5c
            r1 = 0
            if (r0 == 0) goto L56
            r0 = 1
            r8.setSpareOfferFlag(r0)     // Catch: java.lang.Exception -> L5c
            int r7 = r7.A()     // Catch: java.lang.Exception -> L5c
            if (r7 != r0) goto L52
            r8.setCbt(r0)     // Catch: java.lang.Exception -> L5c
            return
        L52:
            r8.setCbt(r1)     // Catch: java.lang.Exception -> L5c
            return
        L56:
            r8.setSpareOfferFlag(r1)     // Catch: java.lang.Exception -> L5c
            r8.setCbt(r1)     // Catch: java.lang.Exception -> L5c
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.orglistener.d.a(com.mbridge.msdk.videocommon.setting.c, com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        super.b(str, str2);
        h hVar = this.f18679c;
        if (hVar != null) {
            hVar.b(str, str2);
            this.f18679c.a(5, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        super.a(cVar);
        if (this.f18679c == null || this.f18685i) {
            return;
        }
        this.f18685i = true;
        b();
        this.f18679c.a(cVar);
        this.f18679c.a(2, this.f18682f, this.f18681e);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        super.a(cVar, z10, cVar2);
        h hVar = this.f18679c;
        if (hVar == null || this.f18687k) {
            return;
        }
        this.f18687k = true;
        hVar.a(7, this.f18682f, this.f18681e);
        this.f18679c.a(cVar, z10, cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, int i10) {
        super.a(z10, i10);
        h hVar = this.f18679c;
        if (hVar == null || this.f18687k) {
            return;
        }
        hVar.a(z10, i10);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        super.a(cVar, str);
        if (this.f18679c == null || this.f18686j) {
            return;
        }
        this.f18686j = true;
        a();
        this.f18679c.a(cVar, str);
        this.f18679c.a(4, this.f18682f, this.f18681e);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        super.a(z10, str, str2);
        h hVar = this.f18679c;
        if (hVar != null) {
            hVar.a(z10, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        super.a(str, str2);
        h hVar = this.f18679c;
        if (hVar != null) {
            hVar.a(str, str2);
            this.f18679c.a(6, str, str2);
        }
    }
}
