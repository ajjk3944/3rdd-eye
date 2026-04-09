package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf {
    private final int bly;

    /* renamed from: cf, reason: collision with root package name */
    private final int f8210cf;
    private final float fkw;

    /* renamed from: jg, reason: collision with root package name */
    private final int f8211jg;
    private final JSONObject ko;

    /* renamed from: le, reason: collision with root package name */
    private final float f8212le;

    /* renamed from: lh, reason: collision with root package name */
    private final float f8213lh;
    private final SparseArray<lh.ouw> mwh;
    private final int[] ouw;
    private final long pno;
    private final long ra;
    private final String rn;
    private final int ryl;
    private final int tlj;
    private final int[] vt;
    private final float yu;
    private final JSONObject zih;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public int bly;

        /* renamed from: cf, reason: collision with root package name */
        public int f8214cf;
        public float fkw;

        /* renamed from: jg, reason: collision with root package name */
        public float f8215jg;
        public int ko;

        /* renamed from: le, reason: collision with root package name */
        public float f8216le;

        /* renamed from: lh, reason: collision with root package name */
        public float f8217lh;
        public int mwh;
        public long ouw;
        public int[] pno;
        public JSONObject qbp;
        public int[] ra;
        public float rn;
        public SparseArray<lh.ouw> ryl;

        /* renamed from: th, reason: collision with root package name */
        public JSONObject f8218th;
        public int tlj;
        public int vm;
        public long vt;
        public float yu;
        public String zih;

        public final cf ouw() {
            return new cf(this, (byte) 0);
        }
    }

    public /* synthetic */ cf(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    public final JSONObject ouw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.zih;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.zih.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.ouw;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.ouw[1]));
            }
            int[] iArr2 = this.vt;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.vt[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.f8213lh)).putOpt("down_y", Float.toString(this.yu)).putOpt("up_x", Float.toString(this.fkw)).putOpt("up_y", Float.toString(this.f8212le)).putOpt("down_time", Long.valueOf(this.ra)).putOpt("up_time", Long.valueOf(this.pno)).putOpt("toolType", Integer.valueOf(this.bly)).putOpt("deviceId", Integer.valueOf(this.tlj)).putOpt("source", Integer.valueOf(this.f8210cf)).putOpt("ft", ouw(this.mwh, this.ryl)).putOpt("click_area_type", this.rn);
            int i4 = this.f8211jg;
            if (i4 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i4));
            }
            JSONObject jSONObject3 = this.ko;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private cf(ouw ouwVar) {
        this.ouw = ouwVar.ra;
        this.vt = ouwVar.pno;
        this.f8213lh = ouwVar.f8216le;
        this.yu = ouwVar.fkw;
        this.fkw = ouwVar.yu;
        this.f8212le = ouwVar.f8217lh;
        this.ra = ouwVar.vt;
        this.pno = ouwVar.ouw;
        this.bly = ouwVar.bly;
        this.tlj = ouwVar.tlj;
        this.f8210cf = ouwVar.f8214cf;
        this.ryl = ouwVar.mwh;
        this.mwh = ouwVar.ryl;
        this.rn = ouwVar.zih;
        this.f8211jg = ouwVar.vm;
        this.ko = ouwVar.f8218th;
        this.zih = ouwVar.qbp;
    }

    public static JSONObject ouw(SparseArray<lh.ouw> sparseArray, int i4) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    lh.ouw ouwVarValueAt = sparseArray.valueAt(i10);
                    if (ouwVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(ouwVarValueAt.f8204lh)).putOpt("mr", Double.valueOf(ouwVarValueAt.vt)).putOpt("phase", Integer.valueOf(ouwVarValueAt.ouw)).putOpt("ts", Long.valueOf(ouwVarValueAt.yu));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i4)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
