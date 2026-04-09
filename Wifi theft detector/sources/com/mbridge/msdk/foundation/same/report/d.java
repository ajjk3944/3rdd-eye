package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements com.mbridge.msdk.tracker.d {
    private static void a(Map<String, String> map, StringBuilder sb) {
    }

    public static String b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        int i10 = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            i10++;
            if (i10 <= jSONObject.length() - 1) {
                sb.append(next);
                sb.append("=");
                sb.append(a(String.valueOf(jSONObject.opt(next))));
                sb.append("&");
            } else {
                sb.append(next);
                sb.append("=");
                sb.append(a(String.valueOf(jSONObject.opt(next))));
            }
        }
        return sb.toString();
    }

    @Override // com.mbridge.msdk.tracker.d
    public Map<String, String> a(com.mbridge.msdk.tracker.m mVar, List<com.mbridge.msdk.tracker.i> list, JSONObject jSONObject) {
        StringBuilder sbA;
        Map<String, String> mapA;
        if (list != null && !list.isEmpty()) {
            try {
                c.a(jSONObject);
                mapA = a(jSONObject);
                if (mapA == null) {
                    try {
                        mapA = new HashMap();
                    } catch (Exception unused) {
                        sbA = null;
                        a(mapA, sbA);
                        return null;
                    } catch (Throwable unused2) {
                        sbA = null;
                        a(mapA, sbA);
                        return null;
                    }
                }
                sbA = a(list);
                try {
                    mapA.put("tun", String.valueOf(m0.A()));
                    mapA.put("data", sbA.toString());
                    return mapA;
                } catch (Exception unused3) {
                    a(mapA, sbA);
                    return null;
                } catch (Throwable unused4) {
                    a(mapA, sbA);
                    return null;
                }
            } catch (Exception unused5) {
                sbA = null;
                mapA = null;
            } catch (Throwable unused6) {
                sbA = null;
                mapA = null;
            }
        }
        return null;
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return map;
    }

    private static StringBuilder a(List<com.mbridge.msdk.tracker.i> list) {
        com.mbridge.msdk.tracker.e eVarD;
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.mbridge.msdk.tracker.i iVar = list.get(i10);
            if (iVar != null && (eVarD = iVar.d()) != null) {
                JSONObject jSONObjectI = eVarD.i();
                c.a(jSONObjectI);
                if (jSONObjectI == null) {
                    jSONObjectI = new JSONObject();
                }
                try {
                    try {
                        jSONObjectI.put(CampaignEx.JSON_KEY_ST_TS, eVarD.l());
                        jSONObjectI.put("rts", System.currentTimeMillis());
                        String strI = iVar.i();
                        if (!TextUtils.isEmpty(strI)) {
                            jSONObjectI.put("reason_lib", strI);
                        }
                        int iH = iVar.h() - 1;
                        if (iH >= 1) {
                            jSONObjectI.put("retryed", iH);
                        }
                        long jD = eVarD.d();
                        if (jD > 0) {
                            jSONObjectI.put("duration", jD);
                        }
                    } catch (Exception e10) {
                        if (com.mbridge.msdk.tracker.a.f18222a) {
                            Log.e("TrackManager", "decorateRequestParams: ", e10);
                        }
                    }
                    sb.append(b(jSONObjectI));
                    if (i10 < list.size() - 1) {
                        sb.append("\n");
                    }
                } catch (Throwable th) {
                    sb.append(b(jSONObjectI));
                    throw th;
                }
            }
        }
        return sb;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception unused) {
            return str;
        }
    }
}
