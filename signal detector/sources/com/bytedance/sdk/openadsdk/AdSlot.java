package com.bytedance.sdk.openadsdk;

import N1.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.cf;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

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
    private String aa;
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
        private String aa;
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
        private int xq = 320;
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
            float f2 = this.gbl;
            if (f2 <= 0.0f) {
                adSlot.dg = this.ypw;
                adSlot.bw = this.xq;
            } else {
                adSlot.dg = f2;
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
            adSlot.aa = this.vk;
            adSlot.sba = this.aa;
            adSlot.yzg = this.sba;
            adSlot.sf = this.ul;
            adSlot.rie = this.ylm;
            adSlot.hxp = this.sra;
            return adSlot;
        }

        public Builder isExpressAd(boolean z6) {
            this.sz = z6;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.bw = i;
            return this;
        }

        public Builder setAdId(String str) {
            this.cf = str;
            return this;
        }

        public Builder setBannerType(int i) {
            this.sra = i;
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

        public Builder setDurationSlotType(int i) {
            this.ylm = i;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f2, float f5) {
            this.gbl = f2;
            this.sup = f5;
            return this;
        }

        public Builder setExt(String str) {
            this.aa = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i3) {
            this.ypw = i;
            this.xq = i3;
            return this;
        }

        public Builder setIsAutoPlay(boolean z6) {
            this.yzg = z6;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.msw = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.ru = i;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.ul = map;
            return this;
        }

        public Builder setRewardAmount(int i) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z6) {
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
                a.a(str);
            }
            this.qh = str;
            return this;
        }
    }

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
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
        return this.aa;
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

    public void setAdCount(int i) {
        this.ycc = i;
    }

    public void setCacheScene(int i) {
        this.db = i;
    }

    public void setCacheTime(long j6) {
        this.sb = j6;
    }

    public void setDurationSlotType(int i) {
        this.rie = i;
    }

    public void setExpressViewAccepted(float f2, float f5) {
        this.dg = f2;
        this.bw = f5;
    }

    public void setIsRotateBanner(int i) {
        this.ul = i;
    }

    public void setPreload(boolean z6) {
        this.ee = z6;
    }

    public void setRotateOrder(int i) {
        this.sra = i;
    }

    public void setRotateTime(int i) {
        this.ylm = i;
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
            jSONObject.put("mCreativeId", this.aa);
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
