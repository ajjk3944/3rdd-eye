package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.impl.i;
import com.mbridge.msdk.video.signal.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.impl.m;
import com.mbridge.msdk.video.signal.impl.n;
import com.mbridge.msdk.video.signal.impl.o;
import com.mbridge.msdk.video.signal.impl.q;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends a {

    /* renamed from: h, reason: collision with root package name */
    private Activity f19530h;

    /* renamed from: i, reason: collision with root package name */
    private WebView f19531i;

    /* renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f19532j;

    /* renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f19533k;

    /* renamed from: l, reason: collision with root package name */
    private CampaignEx f19534l;

    /* renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f19535m;

    /* renamed from: n, reason: collision with root package name */
    private a.InterfaceC0345a f19536n;

    /* renamed from: o, reason: collision with root package name */
    private String f19537o;

    /* renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f19538p;

    public b(Activity activity) {
        this.f19530h = activity;
    }

    public void a(k kVar) {
        this.f19524b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f19531i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f19523a == null) {
            this.f19523a = new i(webView);
        }
        return this.f19523a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f19533k;
        if (mBridgeContainerView == null || (activity = this.f19530h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f19528f == null) {
            this.f19528f = new o(activity, mBridgeContainerView);
        }
        return this.f19528f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f19530h == null || this.f19535m == null) {
            return super.getJSBTModule();
        }
        if (this.f19529g == null) {
            this.f19529g = new j(this.f19530h, this.f19535m);
        }
        return this.f19529g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f19530h;
        if (activity == null || (campaignEx = this.f19534l) == null) {
            return super.getJSCommon();
        }
        if (this.f19524b == null) {
            this.f19524b = new k(activity, campaignEx);
        }
        if (this.f19534l.getDynamicTempCode() == 5 && (list = this.f19538p) != null) {
            d dVar = this.f19524b;
            if (dVar instanceof k) {
                ((k) dVar).a(list);
            }
        }
        this.f19524b.setActivity(this.f19530h);
        this.f19524b.setUnitId(this.f19537o);
        this.f19524b.a(this.f19536n);
        return this.f19524b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f19533k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f19527e == null) {
            this.f19527e = new m(mBridgeContainerView);
        }
        return this.f19527e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.f19531i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f19526d == null) {
            this.f19526d = new n(webView);
        }
        return this.f19526d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f19532j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f19525c == null) {
            this.f19525c = new q(mBridgeVideoView);
        }
        return this.f19525c;
    }

    public void a(List<CampaignEx> list) {
        this.f19538p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f19530h = activity;
        this.f19535m = mBridgeBTContainer;
        this.f19531i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0345a interfaceC0345a) {
        this.f19530h = activity;
        this.f19531i = webView;
        this.f19532j = mBridgeVideoView;
        this.f19533k = mBridgeContainerView;
        this.f19534l = campaignEx;
        this.f19536n = interfaceC0345a;
        this.f19537o = mBridgeVideoView.getUnitId();
    }
}
