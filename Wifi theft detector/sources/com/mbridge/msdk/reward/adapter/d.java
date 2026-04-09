package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f16743a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f16744b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16745c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f16746d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f16747e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f16748f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f16749g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f16750h = 0;

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f16743a = copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList<CampaignEx> b() {
        return this.f16743a;
    }

    public int c() {
        return this.f16749g;
    }

    public int d() {
        return this.f16748f;
    }

    public boolean e() {
        return this.f16745c;
    }

    public void a(boolean z10) {
        this.f16745c = z10;
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f16744b = campaignEx;
            this.f16746d = campaignEx.getSecondRequestIndex();
            this.f16747e = campaignEx.getSecondShowIndex();
            this.f16748f = campaignEx.getFilterCallBackState();
            this.f16750h = campaignEx.getFilterAdsShowCallState();
            this.f16749g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    public boolean a() {
        return this.f16746d == 1 && this.f16745c;
    }
}
