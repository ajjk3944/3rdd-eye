package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.cf;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import u2.e;

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

    /* renamed from: aa, reason: collision with root package name */
    private String f9242aa;
    private float bw;
    private String cf;
    private int db;
    private float dg;
    private boolean ee;
    private String emc;
    private String gbl;
    private int hxp;
    private String msw;
    private boolean qh;
    private int rie;
    private String ru;
    private long sb;
    private String sba;
    private Map<String, Object> sf;
    private int sra;
    private int sup;
    private boolean sz;
    private int ul;
    private boolean uym;
    private String vk;
    private int xq;
    private int ycc;
    private int ylm;
    private int ypw;
    private String yzg;
    private int zz;

    public static class Builder {

        /* renamed from: aa, reason: collision with root package name */
        private String f9243aa;
        private String cf;
        private String emc;
        private float gbl;
        private String msw;
        private String qh;
        private int ru;
        private String sba;
        private float sup;
        private boolean sz;
        private String vk;
        private int ylm;
        private int ypw = 640;
        private int xq = Sdk$SDKError.Reason.WEBVIEW_ERROR_VALUE;
        private final boolean dg = true;
        private int bw = 1;
        private final String ycc = "";
        private final int uym = 0;
        private String zz = "defaultUser";
        private boolean yzg = true;
        private Map<String, Object> ul = null;
        private int sra = 1;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.emc = this.emc;
            adSlot.ycc = this.bw;
            adSlot.uym = true;
            adSlot.ypw = this.ypw;
            adSlot.xq = this.xq;
            float f10 = this.gbl;
            if (f10 <= 0.0f) {
                adSlot.dg = this.ypw;
                adSlot.bw = this.xq;
            } else {
                adSlot.dg = f10;
                adSlot.bw = this.sup;
            }
            adSlot.msw = "";
            adSlot.zz = 0;
            adSlot.ru = this.msw;
            adSlot.gbl = this.zz;
            adSlot.sup = this.ru;
            adSlot.sz = this.yzg;
            adSlot.qh = this.sz;
            adSlot.cf = this.qh;
            adSlot.vk = this.cf;
            adSlot.f9242aa = this.vk;
            adSlot.sba = this.f9243aa;
            adSlot.yzg = this.sba;
            adSlot.sf = this.ul;
            adSlot.rie = this.ylm;
            adSlot.hxp = this.sra;
            return adSlot;
        }

        public Builder isExpressAd(boolean z10) {
            this.sz = z10;
            return this;
        }

        public Builder setAdCount(int i10) {
            if (i10 <= 0) {
                i10 = 1;
            }
            if (i10 > 20) {
                i10 = 20;
            }
            this.bw = i10;
            return this;
        }

        public Builder setAdId(String str) {
            this.cf = str;
            return this;
        }

        public Builder setBannerType(int i10) {
            this.sra = i10;
            return this;
        }

        public Builder setCodeId(String str) {
            this.emc = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.vk = str;
            return this;
        }

        public Builder setDurationSlotType(int i10) {
            this.ylm = i10;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.gbl = f10;
            this.sup = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.f9243aa = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i10, int i11) {
            this.ypw = i10;
            this.xq = i11;
            return this;
        }

        public Builder setIsAutoPlay(boolean z10) {
            this.yzg = z10;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.msw = str;
            return this;
        }

        public Builder setNativeAdType(int i10) {
            this.ru = i10;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.ul = map;
            return this;
        }

        public Builder setRewardAmount(int i10) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z10) {
            return this;
        }

        public Builder setUserData(String str) {
            this.sba = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.zz = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (cf.dg()) {
                e.a(str);
            }
            this.qh = str;
            return this;
        }
    }

    public static int getPosition(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return (i10 == 3 || i10 == 4 || i10 == 7 || i10 == 8) ? 5 : 3;
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
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", Sdk$SDKError.Reason.WEBVIEW_ERROR_VALUE);
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
        return this.ycc;
    }

    public String getAdId() {
        return this.vk;
    }

    public int getBannerType() {
        return this.hxp;
    }

    public String getBidAdm() {
        return this.cf;
    }

    public int getCacheScene() {
        return this.db;
    }

    public long getCacheTime() {
        return this.sb;
    }

    public String getCodeId() {
        return this.emc;
    }

    public String getCreativeId() {
        return this.f9242aa;
    }

    public int getDurationSlotType() {
        return this.rie;
    }

    public float getExpressViewAcceptedHeight() {
        return this.bw;
    }

    public float getExpressViewAcceptedWidth() {
        return this.dg;
    }

    public String getExt() {
        return this.sba;
    }

    public int getImgAcceptedHeight() {
        return this.xq;
    }

    public int getImgAcceptedWidth() {
        return this.ypw;
    }

    public int getIsRotateBanner() {
        return this.ul;
    }

    public String getMediaExtra() {
        return this.ru;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.sf;
    }

    public int getRewardAmount() {
        return this.zz;
    }

    public String getRewardName() {
        return this.msw;
    }

    public int getRotateOrder() {
        return this.sra;
    }

    public int getRotateTime() {
        return this.ylm;
    }

    public String getUserData() {
        return this.yzg;
    }

    public String getUserID() {
        return this.gbl;
    }

    public boolean isAutoPlay() {
        return this.sz;
    }

    public boolean isExpressAd() {
        return this.qh;
    }

    public boolean isPreload() {
        return this.ee;
    }

    public boolean isSupportDeepLink() {
        return this.uym;
    }

    public void setAdCount(int i10) {
        this.ycc = i10;
    }

    public void setCacheScene(int i10) {
        this.db = i10;
    }

    public void setCacheTime(long j10) {
        this.sb = j10;
    }

    public void setDurationSlotType(int i10) {
        this.rie = i10;
    }

    public void setExpressViewAccepted(float f10, float f11) {
        this.dg = f10;
        this.bw = f11;
    }

    public void setIsRotateBanner(int i10) {
        this.ul = i10;
    }

    public void setPreload(boolean z10) {
        this.ee = z10;
    }

    public void setRotateOrder(int i10) {
        this.sra = i10;
    }

    public void setRotateTime(int i10) {
        this.ylm = i10;
    }

    public void setUserData(String str) {
        this.yzg = str;
    }

    public JSONObject toJsonObj() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.emc);
            jSONObject.put("mAdCount", this.ycc);
            jSONObject.put("mIsAutoPlay", this.sz);
            jSONObject.put("mImgAcceptedWidth", this.ypw);
            jSONObject.put("mImgAcceptedHeight", this.xq);
            jSONObject.put("mExpressViewAcceptedWidth", this.dg);
            jSONObject.put("mExpressViewAcceptedHeight", this.bw);
            jSONObject.put("mSupportDeepLink", this.uym);
            jSONObject.put("mRewardName", this.msw);
            jSONObject.put("mRewardAmount", this.zz);
            jSONObject.put("mMediaExtra", this.ru);
            jSONObject.put("mUserID", this.gbl);
            jSONObject.put("mNativeAdType", this.sup);
            jSONObject.put("mIsExpressAd", this.qh);
            jSONObject.put("mAdId", this.vk);
            jSONObject.put("mCreativeId", this.f9242aa);
            jSONObject.put("mExt", this.sba);
            jSONObject.put("mBidAdm", this.cf);
            jSONObject.put("mUserData", this.yzg);
            jSONObject.put("mDurationSlotType", this.rie);
            jSONObject.put("mBannerType", this.hxp);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.sz = true;
        this.qh = false;
        this.ul = 0;
        this.ylm = 0;
        this.sra = 0;
        this.hxp = 1;
    }
}
