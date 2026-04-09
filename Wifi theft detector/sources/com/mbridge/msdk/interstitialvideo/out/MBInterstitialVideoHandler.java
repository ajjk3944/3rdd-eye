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
import com.mbridge.msdk.setting.h;
import org.json.JSONException;

@Deprecated
/* loaded from: classes3.dex */
public class MBInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f15704a;

    /* renamed from: b, reason: collision with root package name */
    private a f15705b;

    /* renamed from: c, reason: collision with root package name */
    private String f15706c;

    /* renamed from: d, reason: collision with root package name */
    private String f15707d;

    /* renamed from: e, reason: collision with root package name */
    private String f15708e;

    /* renamed from: f, reason: collision with root package name */
    private String f15709f;

    /* renamed from: g, reason: collision with root package name */
    private String f15710g;

    /* renamed from: h, reason: collision with root package name */
    private InterstitialVideoListener f15711h;

    /* renamed from: i, reason: collision with root package name */
    private int f15712i = 2;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15713j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15714k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15715l = false;

    /* renamed from: m, reason: collision with root package name */
    private int f15716m;

    /* renamed from: n, reason: collision with root package name */
    private int f15717n;

    /* renamed from: o, reason: collision with root package name */
    private int f15718o;

    public MBInterstitialVideoHandler(Context context, String str, String str2) throws JSONException {
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
        this.f15706c = str2;
        this.f15704a = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.f15705b == null) {
                a aVar = new a();
                this.f15705b = aVar;
                aVar.d(true);
                this.f15705b.c(str, str2);
                h.b().h(str2);
            }
        } catch (Throwable th) {
            q0.b("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.f15705b;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.f15705b;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.f15705b;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isReady() throws JSONException {
        a();
        a aVar = this.f15705b;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void load() throws JSONException {
        a();
        if (this.f15705b != null) {
            this.f15705b.a(true, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f15706c, true, 2));
        }
    }

    public void loadFormSelfFilling() throws JSONException {
        a();
        if (this.f15705b != null) {
            this.f15705b.a(false, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f15706c, true, 1));
        }
    }

    public void playVideoMute(int i10) {
        this.f15712i = i10;
        a aVar = this.f15705b;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f15707d = str;
        this.f15708e = str2;
        this.f15709f = str3;
        this.f15710g = str4;
        this.f15714k = true;
        MBridgeGlobalCommon.setAlertDialogText(this.f15706c, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i10, int i11) throws JSONException {
        this.f15716m = i10;
        this.f15717n = i11;
        this.f15718o = com.mbridge.msdk.foundation.same.a.K;
        this.f15715l = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f15711h = interstitialVideoListener;
        this.f15713j = true;
        a aVar = this.f15705b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f15705b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f15713j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f15711h = interstitialVideoListener;
        this.f15713j = true;
        a aVar = this.f15705b;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.f15705b.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener));
        this.f15713j = false;
    }

    public void show() throws JSONException {
        a();
        if (this.f15705b != null) {
            this.f15705b.a((String) null, (String) null, (String) null, d.b().a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f15706c, false, -1));
        }
    }

    public void setIVRewardEnable(int i10, double d10) throws JSONException {
        this.f15716m = i10;
        this.f15717n = (int) (d10 * 100.0d);
        this.f15718o = com.mbridge.msdk.foundation.same.a.J;
        this.f15715l = true;
        b();
    }

    private void a() throws JSONException {
        a aVar;
        if (this.f15705b == null) {
            b(this.f15704a, this.f15706c);
        }
        if (this.f15713j) {
            this.f15705b.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.f15711h, this.f15706c, false));
            this.f15713j = false;
        }
        if (this.f15714k) {
            this.f15705b.a(this.f15707d, this.f15708e, this.f15709f, this.f15710g);
            this.f15714k = false;
        }
        if (!this.f15715l || (aVar = this.f15705b) == null) {
            return;
        }
        aVar.a(this.f15716m, this.f15718o, this.f15717n);
        this.f15715l = false;
    }

    private void b() throws JSONException {
        a aVar = this.f15705b;
        if (aVar != null) {
            aVar.a(this.f15716m, this.f15718o, this.f15717n);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) throws JSONException {
        a(str, str2);
    }
}
