package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sup {

    /* renamed from: aa, reason: collision with root package name */
    private final JSONObject f9293aa;
    private final float bw;
    private final JSONObject cf;
    private final float dg;
    private final int[] emc;
    private final int gbl;
    private final long msw;
    private final int qh;
    private final int ru;
    private final int sup;
    private final SparseArray<xq.emc> sz;
    private final long uym;
    private final String vk;
    private final float xq;
    private final float ycc;
    private final int[] ypw;
    private final int zz;

    public static class emc {

        /* renamed from: aa, reason: collision with root package name */
        private String f9294aa;
        private long bw;
        private SparseArray<xq.emc> cf;
        private long dg;
        float emc;
        private int[] gbl;
        private float msw;
        private int qh;
        private int[] ru;
        private int sba;
        private int sup;
        private int sz;
        private JSONObject ul;
        private float uym;
        private int vk;
        float xq;
        private float ycc;
        int ypw;
        private JSONObject yzg;
        private float zz;

        public emc bw(float f10) {
            this.msw = f10;
            return this;
        }

        public emc dg(float f10) {
            this.uym = f10;
            return this;
        }

        public emc emc(int i10) {
            this.sba = i10;
            return this;
        }

        public emc xq(int i10) {
            this.ypw = i10;
            return this;
        }

        public emc ycc(float f10) {
            this.zz = f10;
            return this;
        }

        public emc ypw(JSONObject jSONObject) {
            this.ul = jSONObject;
            return this;
        }

        public emc bw(int i10) {
            this.sz = i10;
            return this;
        }

        public emc dg(int i10) {
            this.sup = i10;
            return this;
        }

        public emc emc(JSONObject jSONObject) {
            this.yzg = jSONObject;
            return this;
        }

        public emc xq(float f10) {
            this.ycc = f10;
            return this;
        }

        public emc ycc(int i10) {
            this.qh = i10;
            return this;
        }

        public emc ypw(int i10) {
            this.vk = i10;
            return this;
        }

        public emc emc(SparseArray<xq.emc> sparseArray) {
            this.cf = sparseArray;
            return this;
        }

        public emc ypw(float f10) {
            this.xq = f10;
            return this;
        }

        public emc emc(float f10) {
            this.emc = f10;
            return this;
        }

        public emc ypw(long j10) {
            this.bw = j10;
            return this;
        }

        public emc emc(long j10) {
            this.dg = j10;
            return this;
        }

        public emc ypw(int[] iArr) {
            this.gbl = iArr;
            return this;
        }

        public emc emc(int[] iArr) {
            this.ru = iArr;
            return this;
        }

        public emc emc(String str) {
            this.f9294aa = str;
            return this;
        }

        public sup emc() {
            return new sup(this);
        }
    }

    public JSONObject emc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.f9293aa;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.f9293aa.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.emc;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.emc[1]));
            }
            int[] iArr2 = this.ypw;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.ypw[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.xq)).putOpt("down_y", Float.toString(this.dg)).putOpt("up_x", Float.toString(this.bw)).putOpt("up_y", Float.toString(this.ycc)).putOpt("down_time", Long.valueOf(this.uym)).putOpt("up_time", Long.valueOf(this.msw)).putOpt("toolType", Integer.valueOf(this.zz)).putOpt("deviceId", Integer.valueOf(this.ru)).putOpt("source", Integer.valueOf(this.gbl)).putOpt("ft", emc(this.sz, this.sup)).putOpt("click_area_type", this.vk);
            int i10 = this.qh;
            if (i10 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i10));
            }
            JSONObject jSONObject3 = this.cf;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private sup(@NonNull emc emcVar) {
        this.emc = emcVar.ru;
        this.ypw = emcVar.gbl;
        this.xq = emcVar.zz;
        this.dg = emcVar.msw;
        this.bw = emcVar.uym;
        this.ycc = emcVar.ycc;
        this.uym = emcVar.bw;
        this.msw = emcVar.dg;
        this.zz = emcVar.sup;
        this.ru = emcVar.sz;
        this.gbl = emcVar.qh;
        this.sup = emcVar.vk;
        this.sz = emcVar.cf;
        this.vk = emcVar.f9294aa;
        this.qh = emcVar.sba;
        this.cf = emcVar.yzg;
        this.f9293aa = emcVar.ul;
    }

    public static JSONObject emc(SparseArray<xq.emc> sparseArray, int i10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    xq.emc emcVarValueAt = sparseArray.valueAt(i11);
                    if (emcVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(emcVarValueAt.xq)).putOpt("mr", Double.valueOf(emcVarValueAt.ypw)).putOpt("phase", Integer.valueOf(emcVarValueAt.emc)).putOpt(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(emcVarValueAt.dg));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i10)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
