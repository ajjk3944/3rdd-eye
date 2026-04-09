package com.bytedance.adsdk.ugeno.dg;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dg.ycc;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sup {
    public static ycc.emc emc(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ycc.emc emcVar = new ycc.emc();
        String strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(str, jSONObject);
        if (strEmc.contains("#")) {
            strEmc = strEmc.replace("#", "%23");
        }
        Uri uri = Uri.parse(strEmc);
        if (uri == null) {
            return null;
        }
        emcVar.xq(strEmc);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            emcVar.emc(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        emcVar.ypw(authority);
        emcVar.dg(emcVar.emc() + "://" + emcVar.ypw());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.xq.ypw.emc(uri.getQueryParameter(str2), jSONObject));
            }
        }
        emcVar.emc(map);
        return emcVar;
    }
}
