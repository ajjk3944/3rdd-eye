package com.mbridge.msdk.splash.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private MBSplashLoadListener f17235a;

    /* renamed from: b, reason: collision with root package name */
    private c f17236b;

    /* renamed from: c, reason: collision with root package name */
    private String f17237c;

    /* renamed from: d, reason: collision with root package name */
    private String f17238d;

    /* renamed from: e, reason: collision with root package name */
    private MBridgeIds f17239e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f17236b = cVar;
        this.f17239e = mBridgeIds;
        if (mBridgeIds != null) {
            this.f17237c = mBridgeIds.getUnitId();
        }
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        this.f17235a = mBSplashLoadListener;
    }

    public void a(String str) {
        this.f17238d = str;
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        c cVar2 = this.f17236b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.f17235a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.f17239e, i10);
            this.f17235a.isSupportZoomOut(this.f17239e, campaignEx.getFlb() == 1);
        }
        this.f17236b.b(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f17237c, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f17236b) == null) {
            return;
        }
        cVar.b(campaignEx, 0, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f17236b;
        if (cVar == null || !cVar.g()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String strL = bVar.l();
            if (!TextUtils.isEmpty(strL)) {
                str = strL;
            }
        }
        MBSplashLoadListener mBSplashLoadListener = this.f17235a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.f17239e, str, i10);
        }
        this.f17236b.b(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f17237c, !TextUtils.isEmpty(this.f17238d), bVar != null ? bVar.d() : null);
    }
}
