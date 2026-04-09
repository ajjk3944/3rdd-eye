package com.bytedance.sdk.openadsdk.core.sup.ypw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc extends xq implements Comparable<emc> {
    public long emc;

    /* renamed from: com.bytedance.sdk.openadsdk.core.sup.ypw.emc$emc, reason: collision with other inner class name */
    public static class C0158emc {
        private final String emc;
        private xq.EnumC0159xq xq = xq.EnumC0159xq.TRACKING_URL;
        private final long ypw;

        public C0158emc(String str, long j10) {
            this.emc = str;
            this.ypw = j10;
        }

        public emc emc() {
            return new emc(this.ypw, this.emc, this.xq, Boolean.FALSE);
        }
    }

    public emc(long j10, String str, xq.EnumC0159xq enumC0159xq, Boolean bool) {
        super(str, enumC0159xq, bool);
        this.emc = j10;
    }

    public long emc() {
        return this.emc;
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject ypw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", xq());
        jSONObject.put("trackingMilliseconds", this.emc);
        return jSONObject;
    }

    public static int emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Integer.parseInt(strArrSplit[0]) * 3600000) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Float.parseFloat(strArrSplit[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean emc(long j10) {
        return this.emc <= j10 && !bw();
    }

    @Override // java.lang.Comparable
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public int compareTo(emc emcVar) {
        if (emcVar == null) {
            return 1;
        }
        long j10 = this.emc;
        long j11 = emcVar.emc;
        if (j10 > j11) {
            return 1;
        }
        return j10 < j11 ? -1 : 0;
    }
}
