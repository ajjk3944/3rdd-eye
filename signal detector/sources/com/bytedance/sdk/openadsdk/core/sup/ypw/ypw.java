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
        private xq.EnumC0074xq xq = xq.EnumC0074xq.TRACKING_URL;
        private boolean dg = false;

        public emc(String str, float f2) {
            this.emc = str;
            this.ypw = f2;
        }

        public ypw emc() {
            return new ypw(this.ypw, this.emc, this.xq, Boolean.valueOf(this.dg));
        }
    }

    public boolean emc(float f2) {
        return this.emc <= f2 && !bw();
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

    private ypw(float f2, String str, xq.EnumC0074xq enumC0074xq, Boolean bool) {
        super(str, enumC0074xq, bool);
        this.emc = f2;
    }

    @Override // java.lang.Comparable
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public int compareTo(ypw ypwVar) {
        if (ypwVar == null) {
            return 1;
        }
        float f2 = this.emc;
        float f5 = ypwVar.emc;
        if (f2 > f5) {
            return 1;
        }
        return f2 < f5 ? -1 : 0;
    }
}
