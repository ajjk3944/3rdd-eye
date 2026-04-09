package com.mbridge.msdk.mbnative.listener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class a implements NativeListener.NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    private NativeListener.NativeAdListener f16102a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16103b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f16104c;

    /* renamed from: d, reason: collision with root package name */
    private Context f16105d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16106e;

    public a() {
    }

    public void a(boolean z10) {
        this.f16106e = z10;
    }

    public void b() {
        this.f16103b = true;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.f16102a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.f16102a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        this.f16103b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f16102a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f16105d == null) {
                this.f16105d = c.n().d();
            }
            if (TextUtils.isEmpty(this.f16104c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f16105d, str, this.f16104c, this.f16106e, (CampaignEx) null);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f16103b = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.f16102a != null) {
                if (copyOnWriteArrayList.size() > 0) {
                    this.f16102a.onAdLoaded(copyOnWriteArrayList, i10);
                } else {
                    this.f16102a.onAdLoaded(list, i10);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        NativeListener.NativeAdListener nativeAdListener = this.f16102a;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i10);
        }
    }

    public void a(String str) {
        this.f16104c = str;
    }

    public a(NativeListener.NativeAdListener nativeAdListener) {
        this.f16102a = nativeAdListener;
    }

    public boolean a() {
        return this.f16103b;
    }

    public void a(CampaignEx campaignEx, String str) {
        this.f16103b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f16102a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f16105d == null) {
                this.f16105d = c.n().d();
            }
            if (TextUtils.isEmpty(this.f16104c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f16105d, str, this.f16104c, this.f16106e, campaignEx);
        }
    }
}
