package com.bytedance.sdk.openadsdk.core.sup;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ru {
    private final String dg;
    private final String emc;
    private final String xq;
    private final URL ypw;

    private ru(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.emc = str2;
        this.ypw = new URL(str);
        this.xq = str3;
        this.dg = str4;
    }

    public JSONObject dg() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", CampaignEx.KEY_OMID);
            jSONObject.put("javascriptResourceUrl", this.ypw.toString());
            if (!TextUtils.isEmpty(this.emc)) {
                jSONObject.put("vendorKey", this.emc);
            }
            if (!TextUtils.isEmpty(this.xq)) {
                jSONObject.put("verificationParameters", this.xq);
            }
            if (!TextUtils.isEmpty(this.dg)) {
                jSONObject.put("verificationNotExecuted", this.dg);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String emc() {
        return this.emc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        if (emc(this.emc, ruVar.emc) && emc(this.ypw, ruVar.ypw) && emc(this.xq, ruVar.xq)) {
            return emc(this.dg, ruVar.dg);
        }
        return false;
    }

    public int hashCode() {
        String str = this.emc;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.ypw.hashCode()) * 31;
        String str2 = this.xq;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.dg;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public URL xq() {
        return this.ypw;
    }

    public String ypw() {
        return this.xq;
    }

    private boolean emc(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static ru emc(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ru(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ru emc(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new ru(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<ru> emc(JSONArray jSONArray) {
        HashSet<ru> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    hashSet.add(emc(jSONArray.getJSONObject(i10)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
