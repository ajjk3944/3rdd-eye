package com.bytedance.sdk.openadsdk.core.sup.ypw;

import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw extends xq implements Comparable<ypw> {
    private final float emc;

    public static class emc {
        private final String emc;
        private final float ypw;
        private xq.EnumC0159xq xq = xq.EnumC0159xq.TRACKING_URL;
        private boolean dg = false;

        public emc(String str, float f10) {
            this.emc = str;
            this.ypw = f10;
        }

        public ypw emc() {
            return new ypw(this.ypw, this.emc, this.xq, Boolean.valueOf(this.dg));
        }
    }

    public boolean emc(float f10) {
        return this.emc <= f10 && !bw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sup.ypw.xq
    public void l_() {
        super.l_();
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject ypw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", xq());
        jSONObject.put("trackingFraction", this.emc);
        return jSONObject;
    }

    private ypw(float f10, String str, xq.EnumC0159xq enumC0159xq, Boolean bool) {
        super(str, enumC0159xq, bool);
        this.emc = f10;
    }

    @Override // java.lang.Comparable
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public int compareTo(ypw ypwVar) {
        if (ypwVar == null) {
            return 1;
        }
        float f10 = this.emc;
        float f11 = ypwVar.emc;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }
}
