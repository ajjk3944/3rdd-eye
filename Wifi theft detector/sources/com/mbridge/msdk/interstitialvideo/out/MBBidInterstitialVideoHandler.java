package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.controller.a;
import org.json.JSONException;

@Deprecated
/* loaded from: classes3.dex */
public class MBBidInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private a f15688a;

    /* renamed from: b, reason: collision with root package name */
    private String f15689b;

    /* renamed from: c, reason: collision with root package name */
    private String f15690c;

    /* renamed from: d, reason: collision with root package name */
    private String f15691d;

    /* renamed from: e, reason: collision with root package name */
    private String f15692e;

    /* renamed from: f, reason: collision with root package name */
    private String f15693f;

    /* renamed from: g, reason: collision with root package name */
    private String f15694g;

    /* renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f15695h;

    /* renamed from: i, reason: collision with root package name */
    private int f15696i = 2;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15697j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15698k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15699l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15700m = false;

    /* renamed from: n, reason: collision with root package name */
    private int f15701n;

    /* renamed from: o, reason: collision with root package name */
    private int f15702o;

    /* renamed from: p, reason: collision with root package name */
    private int f15703p;

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
        this.f15689b = str2;
        this.f15690c = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f15688a == null) {
                a aVar = new a();
                this.f15688a = aVar;
                aVar.d(true);
                this.f15688a.e(true);
                this.f15688a.c(str, str2);
            }
        } catch (Throwable th) {
            q0.b("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f15688a;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f15688a;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f15688a;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() throws JSONException {
        a();
        a aVar = this.f15688a;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() throws JSONException {
        a();
        if (this.f15688a != null) {
            this.f15688a.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f15689b, true, 1));
        }
    }

    public void loadFromBid(String str) throws JSONException {
        a();
        if (this.f15688a != null) {
            this.f15688a.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f15689b, true, 2));
        }
    }

    public void playVideoMute(int i10) {
        this.f15696i = i10;
        a aVar = this.f15688a;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f15691d = str;
        this.f15692e = str2;
        this.f15693f = str3;
        this.f15694g = str4;
        this.f15698k = true;
        this.f15699l = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f15689b, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i10, int i11) throws JSONException {
        this.f15701n = i10;
        this.f15702o = i11;
        this.f15703p = com.mbridge.msdk.foundation.same.a.K;
        this.f15700m = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f15695h = interstitialVideoListener;
        this.f15697j = true;
        a aVar = this.f15688a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f15688a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f15689b, true));
        this.f15697j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f15695h = interstitialVideoListener;
        this.f15697j = true;
        a aVar = this.f15688a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f15688a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.f15689b, true));
        this.f15697j = false;
    }

    public void showFromBid() throws JSONException {
        a();
        if (this.f15688a != null) {
            this.f15688a.a((String) null, (String) null, (String) null, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f15689b, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) throws JSONException {
        this.f15701n = i10;
        this.f15702o = (int) (d10 * 100.0d);
        this.f15703p = com.mbridge.msdk.foundation.same.a.J;
        this.f15700m = true;
        b();
    }

    private void a() throws JSONException {
        a aVar;
        if (this.f15688a == null) {
            b(this.f15690c, this.f15689b);
        }
        if (this.f15697j) {
            a aVar2 = this.f15688a;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f15695h, this.f15689b, true));
            }
            this.f15697j = false;
        }
        if (this.f15698k) {
            a aVar3 = this.f15688a;
            if (aVar3 != null) {
                aVar3.a(this.f15691d, this.f15692e, this.f15693f, this.f15694g);
            }
            this.f15698k = false;
        }
        if (!this.f15700m || (aVar = this.f15688a) == null) {
            return;
        }
        aVar.a(this.f15701n, this.f15703p, this.f15702o);
        this.f15700m = false;
    }

    private void b() throws JSONException {
        a aVar = this.f15688a;
        if (aVar != null) {
            aVar.a(this.f15701n, this.f15703p, this.f15702o);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) throws JSONException {
        a(str, str2);
    }
}
