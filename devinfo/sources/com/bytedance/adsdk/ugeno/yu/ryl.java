package com.bytedance.adsdk.ugeno.yu;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.yu.le;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl {
    public static le.ouw ouw(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        le.ouw ouwVar = new le.ouw();
        String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str, jSONObject);
        if (strOuw.contains("#")) {
            strOuw = strOuw.replace("#", "%23");
        }
        Uri uri = Uri.parse(strOuw);
        if (uri == null) {
            return null;
        }
        ouwVar.ouw = strOuw;
        if (!TextUtils.isEmpty(uri.getScheme())) {
            ouwVar.f7010lh = uri.getScheme();
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        ouwVar.yu = authority;
        ouwVar.vt = ouwVar.f7010lh + "://" + ouwVar.yu;
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.lh.vt.ouw(uri.getQueryParameter(str2), jSONObject));
            }
        }
        ouwVar.fkw = map;
        return ouwVar;
    }
}
