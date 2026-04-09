package com.bytedance.sdk.openadsdk.core.sup.ypw;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc extends xq implements Comparable<emc> {
    public long emc;

    /* renamed from: com.bytedance.sdk.openadsdk.core.sup.ypw.emc$emc, reason: collision with other inner class name */
    public static class C0073emc {
        private final String emc;
        private xq.EnumC0074xq xq = xq.EnumC0074xq.TRACKING_URL;
        private final long ypw;

        public C0073emc(String str, long j6) {
            this.emc = str;
            this.ypw = j6;
        }

        public emc emc() {
            return new emc(this.ypw, this.emc, this.xq, Boolean.FALSE);
        }
    }

    public emc(long j6, String str, xq.EnumC0074xq enumC0074xq, Boolean bool) {
        super(str, enumC0074xq, bool);
        this.emc = j6;
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
            return LinearLayoutManager.INVALID_OFFSET;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Float.parseFloat(strArrSplit[2]) * 1000.0f) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Integer.parseInt(strArrSplit[0]) * 3600000));
            } catch (Throwable unused) {
            }
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    public boolean emc(long j6) {
        return this.emc <= j6 && !bw();
    }

    @Override // java.lang.Comparable
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public int compareTo(emc emcVar) {
        if (emcVar == null) {
            return 1;
        }
        long j6 = this.emc;
        long j7 = emcVar.emc;
        if (j6 > j7) {
            return 1;
        }
        return j6 < j7 ? -1 : 0;
    }
}
