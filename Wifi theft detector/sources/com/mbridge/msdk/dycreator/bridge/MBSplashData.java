package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.viewdata.base.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public class MBSplashData implements a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f14463a;

    /* renamed from: b, reason: collision with root package name */
    private String f14464b;

    /* renamed from: c, reason: collision with root package name */
    private String f14465c;

    /* renamed from: d, reason: collision with root package name */
    private String f14466d;

    /* renamed from: e, reason: collision with root package name */
    private String f14467e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f14468f;

    /* renamed from: g, reason: collision with root package name */
    private int f14469g;

    /* renamed from: h, reason: collision with root package name */
    private int f14470h;

    /* renamed from: i, reason: collision with root package name */
    private float f14471i;

    /* renamed from: j, reason: collision with root package name */
    private float f14472j;

    /* renamed from: k, reason: collision with root package name */
    private int f14473k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f14463a = dyOption;
        this.f14468f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f14465c;
    }

    public String getAppInfo() {
        return this.f14464b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f14468f;
    }

    public int getClickType() {
        return this.f14473k;
    }

    public String getCountDownText() {
        return this.f14466d;
    }

    public DyOption getDyOption() {
        return this.f14463a;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f14463a;
    }

    public int getLogoImage() {
        return this.f14470h;
    }

    public String getLogoText() {
        return this.f14467e;
    }

    public int getNoticeImage() {
        return this.f14469g;
    }

    public float getxInScreen() {
        return this.f14471i;
    }

    public float getyInScreen() {
        return this.f14472j;
    }

    public void setAdClickText(String str) {
        this.f14465c = str;
    }

    public void setAppInfo(String str) {
        this.f14464b = str;
    }

    public void setClickType(int i10) {
        this.f14473k = i10;
    }

    public void setCountDownText(String str) {
        this.f14466d = str;
    }

    public void setLogoImage(int i10) {
        this.f14470h = i10;
    }

    public void setLogoText(String str) {
        this.f14467e = str;
    }

    public void setNoticeImage(int i10) {
        this.f14469g = i10;
    }

    public void setxInScreen(float f10) {
        this.f14471i = f10;
    }

    public void setyInScreen(float f10) {
        this.f14472j = f10;
    }
}
