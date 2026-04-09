package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ko;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import z8.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private int bly;

    /* renamed from: cf, reason: collision with root package name */
    private String f7675cf;
    private int ex;
    private float fkw;

    /* renamed from: jg, reason: collision with root package name */
    private boolean f7676jg;
    private int jqy;
    private String ko;
    private Map<String, Object> ksc;

    /* renamed from: le, reason: collision with root package name */
    private int f7677le;

    /* renamed from: lh, reason: collision with root package name */
    private int f7678lh;
    private boolean mwh;
    private String ouw;
    private String pno;
    private int qbp;
    private boolean ra;
    private String rn;
    private int ryl;
    private boolean tc;

    /* renamed from: th, reason: collision with root package name */
    private String f7679th;
    private String tlj;
    private String vm;
    private int vpp;
    private int vt;
    private float yu;
    private String zih;
    private int zin;

    public /* synthetic */ AdSlot(byte b10) {
        this();
    }

    public static int getPosition(int i4) {
        if (i4 == 1) {
            return 2;
        }
        if (i4 != 2) {
            return (i4 == 3 || i4 == 4 || i4 == 7 || i4 == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.f7677le;
    }

    public String getAdId() {
        return this.rn;
    }

    public int getBannerType() {
        return this.ex;
    }

    public String getBidAdm() {
        return this.ko;
    }

    public String getCodeId() {
        return this.ouw;
    }

    public String getCreativeId() {
        return this.zih;
    }

    public int getDurationSlotType() {
        return this.jqy;
    }

    public float getExpressViewAcceptedHeight() {
        return this.fkw;
    }

    public float getExpressViewAcceptedWidth() {
        return this.yu;
    }

    public String getExt() {
        return this.vm;
    }

    public int getImgAcceptedHeight() {
        return this.f7678lh;
    }

    public int getImgAcceptedWidth() {
        return this.vt;
    }

    public int getIsRotateBanner() {
        return this.qbp;
    }

    public String getMediaExtra() {
        return this.tlj;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.ksc;
    }

    public int getRewardAmount() {
        return this.bly;
    }

    public String getRewardName() {
        return this.pno;
    }

    public int getRotateOrder() {
        return this.vpp;
    }

    public int getRotateTime() {
        return this.zin;
    }

    public String getUserData() {
        return this.f7679th;
    }

    public String getUserID() {
        return this.f7675cf;
    }

    public boolean isAutoPlay() {
        return this.mwh;
    }

    public boolean isExpressAd() {
        return this.f7676jg;
    }

    public boolean isPreload() {
        return this.tc;
    }

    public boolean isSupportDeepLink() {
        return this.ra;
    }

    public void setAdCount(int i4) {
        this.f7677le = i4;
    }

    public void setDurationSlotType(int i4) {
        this.jqy = i4;
    }

    public void setExpressViewAccepted(float f10, float f11) {
        this.yu = f10;
        this.fkw = f11;
    }

    public void setIsRotateBanner(int i4) {
        this.qbp = i4;
    }

    public void setPreload(boolean z3) {
        this.tc = z3;
    }

    public void setRotateOrder(int i4) {
        this.vpp = i4;
    }

    public void setRotateTime(int i4) {
        this.zin = i4;
    }

    public void setUserData(String str) {
        this.f7679th = str;
    }

    public JSONObject toJsonObj() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.ouw);
            jSONObject.put("mAdCount", this.f7677le);
            jSONObject.put("mIsAutoPlay", this.mwh);
            jSONObject.put("mImgAcceptedWidth", this.vt);
            jSONObject.put("mImgAcceptedHeight", this.f7678lh);
            jSONObject.put("mExpressViewAcceptedWidth", this.yu);
            jSONObject.put("mExpressViewAcceptedHeight", this.fkw);
            jSONObject.put("mSupportDeepLink", this.ra);
            jSONObject.put("mRewardName", this.pno);
            jSONObject.put("mRewardAmount", this.bly);
            jSONObject.put("mMediaExtra", this.tlj);
            jSONObject.put("mUserID", this.f7675cf);
            jSONObject.put("mNativeAdType", this.ryl);
            jSONObject.put("mIsExpressAd", this.f7676jg);
            jSONObject.put("mAdId", this.rn);
            jSONObject.put("mCreativeId", this.zih);
            jSONObject.put("mExt", this.vm);
            jSONObject.put("mBidAdm", this.ko);
            jSONObject.put("mUserData", this.f7679th);
            jSONObject.put("mDurationSlotType", this.jqy);
            jSONObject.put("mBannerType", this.ex);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.mwh = true;
        this.f7676jg = false;
        this.qbp = 0;
        this.zin = 0;
        this.vpp = 0;
        this.ex = 1;
    }

    public static /* synthetic */ int vt(AdSlot adSlot) {
        adSlot.bly = 0;
        return 0;
    }

    public static /* synthetic */ boolean ouw(AdSlot adSlot) {
        adSlot.ra = true;
        return true;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class Builder {

        /* renamed from: cf, reason: collision with root package name */
        private float f7680cf;

        /* renamed from: jg, reason: collision with root package name */
        private String f7681jg;
        private String ko;
        private boolean mwh;
        private String ouw;
        private String pno;
        private String rn;
        private float ryl;
        private int tlj;
        private String vm;
        private String zih;
        private int zin;
        private int vt = 640;

        /* renamed from: lh, reason: collision with root package name */
        private int f7683lh = 320;
        private final boolean yu = true;
        private int fkw = 1;

        /* renamed from: le, reason: collision with root package name */
        private final String f7682le = "";
        private final int ra = 0;
        private String bly = "defaultUser";

        /* renamed from: th, reason: collision with root package name */
        private boolean f7684th = true;
        private Map<String, Object> qbp = null;
        private int vpp = 1;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot((byte) 0);
            adSlot.ouw = this.ouw;
            adSlot.f7677le = this.fkw;
            AdSlot.ouw(adSlot);
            adSlot.vt = this.vt;
            adSlot.f7678lh = this.f7683lh;
            float f10 = this.f7680cf;
            if (f10 <= 0.0f) {
                adSlot.yu = this.vt;
                adSlot.fkw = this.f7683lh;
            } else {
                adSlot.yu = f10;
                adSlot.fkw = this.ryl;
            }
            adSlot.pno = "";
            AdSlot.vt(adSlot);
            adSlot.tlj = this.pno;
            adSlot.f7675cf = this.bly;
            adSlot.ryl = this.tlj;
            adSlot.mwh = this.f7684th;
            adSlot.f7676jg = this.mwh;
            adSlot.ko = this.f7681jg;
            adSlot.rn = this.ko;
            adSlot.zih = this.rn;
            adSlot.vm = this.zih;
            adSlot.f7679th = this.vm;
            adSlot.ksc = this.qbp;
            adSlot.jqy = this.zin;
            adSlot.ex = this.vpp;
            return adSlot;
        }

        public Builder isExpressAd(boolean z3) {
            this.mwh = z3;
            return this;
        }

        public Builder setAdCount(int i4) {
            if (i4 <= 0) {
                ko.lh(TTAdConstant.TAG, "setAdCount: adCount must greater than 0 ");
                i4 = 1;
            }
            if (i4 > 20) {
                ko.lh(TTAdConstant.TAG, "setAdCount: adCount must less than or equal to 20 ");
                i4 = 20;
            }
            this.fkw = i4;
            return this;
        }

        public Builder setAdId(String str) {
            this.ko = str;
            return this;
        }

        public Builder setBannerType(int i4) {
            this.vpp = i4;
            return this;
        }

        public Builder setCodeId(String str) {
            this.ouw = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.rn = str;
            return this;
        }

        public Builder setDurationSlotType(int i4) {
            this.zin = i4;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.f7680cf = f10;
            this.ryl = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.zih = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i4, int i10) {
            this.vt = i4;
            this.f7683lh = i10;
            return this;
        }

        public Builder setIsAutoPlay(boolean z3) {
            this.f7684th = z3;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.pno = str;
            return this;
        }

        public Builder setNativeAdType(int i4) {
            this.tlj = i4;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.qbp = map;
            return this;
        }

        public Builder setUserData(String str) {
            this.vm = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.bly = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (ko.yu()) {
                ko.lh("bidding", "AdSlot -> bidAdm=" + a.a(str));
            }
            this.f7681jg = str;
            return this;
        }

        public Builder setRewardAmount(int i4) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z3) {
            return this;
        }
    }
}
