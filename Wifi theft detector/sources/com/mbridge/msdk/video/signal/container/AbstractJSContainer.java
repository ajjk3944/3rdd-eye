package com.mbridge.msdk.video.signal.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.setting.c;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    private int f19506a;

    /* renamed from: b, reason: collision with root package name */
    private int f19507b;

    /* renamed from: c, reason: collision with root package name */
    protected Activity f19508c;

    /* renamed from: d, reason: collision with root package name */
    protected String f19509d;

    /* renamed from: e, reason: collision with root package name */
    protected String f19510e;

    /* renamed from: f, reason: collision with root package name */
    protected c f19511f;

    /* renamed from: g, reason: collision with root package name */
    protected String f19512g;

    /* renamed from: h, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.entity.c f19513h;

    /* renamed from: i, reason: collision with root package name */
    protected String f19514i;

    /* renamed from: j, reason: collision with root package name */
    protected int f19515j;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f19516k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f19517l;

    /* renamed from: m, reason: collision with root package name */
    protected int f19518m;

    /* renamed from: n, reason: collision with root package name */
    protected int f19519n;

    /* renamed from: o, reason: collision with root package name */
    protected int f19520o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f19521p;

    /* renamed from: q, reason: collision with root package name */
    protected IJSFactory f19522q;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f19506a = 0;
        this.f19507b = 1;
        this.f19515j = 2;
        this.f19516k = false;
        this.f19517l = false;
        this.f19521p = false;
        this.f19522q = new a();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private boolean i(int i10) {
        try {
            if (i10 == 1) {
                this.f19508c.setRequestedOrientation(12);
            } else {
                if (i10 != 2) {
                    return false;
                }
                this.f19508c.setRequestedOrientation(11);
            }
            return true;
        } catch (Throwable th) {
            q0.b("AbstractJSContainer", th.getMessage(), th);
            return false;
        }
    }

    public void a(Object obj) {
        f.a().b(obj, h(this.f19506a));
    }

    public void b(Object obj, String str) {
        f.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f19522q.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f19522q.getIJSRewardVideoV1();
    }

    public String getInnerPlacementId() {
        c cVar;
        return (!TextUtils.isEmpty(this.f19510e) || (cVar = this.f19511f) == null || TextUtils.isEmpty(cVar.t())) ? this.f19510e : this.f19511f.t();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f19522q.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f19522q.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.f getJSContainerModule() {
        return this.f19522q.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.f19522q.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f19522q.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f19510e;
    }

    public String getUnitId() {
        return this.f19509d;
    }

    public String h(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            q0.b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().a()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().a()) {
            getActivityProxy().b();
        }
    }

    public void onPause() {
        if (getJSCommon().a()) {
            getActivityProxy().g();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().a()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.mbridge.msdk.foundation.feedback.b.f14986f) {
            return;
        }
        if (getJSCommon().a()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().a()) {
            getActivityProxy().h();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().a()) {
            getActivityProxy().c();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f19522q = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f19508c = activity;
    }

    public void setBidCampaign(boolean z10) {
        this.f19517l = z10;
    }

    public void setBigOffer(boolean z10) {
        this.f19521p = z10;
    }

    public void setIV(boolean z10) {
        this.f19516k = z10;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f19518m = i10;
        this.f19519n = i11;
        this.f19520o = i12;
    }

    public void setMute(int i10) {
        this.f19515j = i10;
    }

    public void setPlacementId(String str) {
        this.f19510e = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.entity.c cVar) {
        this.f19513h = cVar;
    }

    public void setRewardId(String str) {
        this.f19514i = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f19511f = cVar;
    }

    public void setUnitId(String str) {
        this.f19509d = str;
    }

    public void setUserId(String str) {
        this.f19512g = str;
    }

    public void a(Object obj, String str) {
        f.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public void b(String str) {
        q0.b("AbstractJSContainer", str);
        Activity activity = this.f19508c;
        if (activity != null) {
            activity.finish();
        }
    }

    public int a(CampaignEx campaignEx) {
        k kVarB = b(campaignEx);
        if (kVarB != null) {
            return kVarB.n();
        }
        return 0;
    }

    public void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (a(campaignEx) == 1) {
            return;
        }
        if (((campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) ? false : i(rewardTemplateMode.g())) || cVar == null) {
            return;
        }
        i(this.f19511f.y());
    }

    public k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        a.C0347a c0347aA = com.mbridge.msdk.videocommon.a.a(this.f19516k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, campaignEx);
        if (c0347aA != null && c0347aA.c()) {
            WindVaneWebView windVaneWebViewB = c0347aA.b();
            if (windVaneWebViewB.getObject() instanceof k) {
                return (k) windVaneWebViewB.getObject();
            }
        }
        return null;
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19506a = 0;
        this.f19507b = 1;
        this.f19515j = 2;
        this.f19516k = false;
        this.f19517l = false;
        this.f19521p = false;
        this.f19522q = new com.mbridge.msdk.video.signal.factory.a();
    }
}
