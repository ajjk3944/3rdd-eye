package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f16427a;

    /* renamed from: b, reason: collision with root package name */
    private String f16428b;

    /* renamed from: c, reason: collision with root package name */
    private String f16429c;

    /* renamed from: d, reason: collision with root package name */
    private String f16430d;

    /* renamed from: e, reason: collision with root package name */
    private String f16431e;

    /* renamed from: f, reason: collision with root package name */
    private a f16432f;

    /* renamed from: g, reason: collision with root package name */
    private NewInterstitialListener f16433g;

    /* renamed from: h, reason: collision with root package name */
    private int f16434h = 2;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16435i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16436j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16437k = false;

    /* renamed from: l, reason: collision with root package name */
    private int f16438l;

    /* renamed from: m, reason: collision with root package name */
    private int f16439m;
    public String mUnitId;

    /* renamed from: n, reason: collision with root package name */
    private int f16440n;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) throws JSONException {
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        a(str, str2);
    }

    private void a(String str, String str2) throws JSONException {
        String strE = v0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            v0.d(str2, strE);
        }
        this.mUnitId = str2;
        this.f16427a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f16432f == null) {
                a aVar = new a();
                this.f16432f = aVar;
                aVar.d(true);
                this.f16432f.e(true);
                this.f16432f.c(str, str2);
            }
        } catch (Throwable th) {
            q0.b("MBBidInterstitialVideoHandler", th.getMessage(), th);
        }
    }

    private void c() throws JSONException {
        a aVar = this.f16432f;
        if (aVar != null) {
            aVar.a(this.f16438l, this.f16440n, this.f16439m);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f16432f;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f16432f;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f16432f;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() throws JSONException {
        a();
        a aVar = this.f16432f;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() throws JSONException {
        a();
        if (this.f16432f != null) {
            this.f16432f.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) throws JSONException {
        a();
        if (this.f16432f != null) {
            this.f16432f.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f16434h = i10;
        a aVar = this.f16432f;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f16429c = str;
        this.f16428b = str2;
        this.f16430d = str3;
        this.f16431e = str4;
        this.f16436j = true;
        MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) throws JSONException {
        c.n().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) throws JSONException {
        this.f16438l = i10;
        this.f16439m = i11;
        this.f16440n = com.mbridge.msdk.foundation.same.a.K;
        this.f16437k = true;
        c();
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f16433g = newInterstitialListener;
        this.f16435i = true;
        a aVar = this.f16432f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f16432f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f16435i = false;
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f16433g = newInterstitialListener;
        this.f16435i = true;
        a aVar = this.f16432f;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f16432f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
        this.f16435i = false;
    }

    public void showFromBid() throws JSONException {
        a();
        if (this.f16432f != null) {
            this.f16432f.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.mUnitId, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) throws JSONException {
        this.f16438l = i10;
        this.f16439m = (int) (d10 * 100.0d);
        this.f16440n = com.mbridge.msdk.foundation.same.a.J;
        this.f16437k = true;
        c();
    }

    private void a() throws JSONException {
        if (this.f16432f == null) {
            b(this.f16427a, this.mUnitId);
        }
        b();
    }

    private void b() throws JSONException {
        a aVar;
        if (this.f16435i) {
            a aVar2 = this.f16432f;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.newinterstitial.listener.a(this.f16433g));
            }
            this.f16435i = false;
        }
        if (this.f16436j) {
            a aVar3 = this.f16432f;
            if (aVar3 != null) {
                aVar3.a(this.f16429c, this.f16428b, this.f16430d, this.f16431e);
            }
            this.f16436j = false;
        }
        if (!this.f16437k || (aVar = this.f16432f) == null) {
            return;
        }
        aVar.a(this.f16438l, this.f16440n, this.f16439m);
        this.f16437k = false;
    }

    public MBBidInterstitialVideoHandler(String str, String str2) throws JSONException {
        a(str, str2);
    }
}
