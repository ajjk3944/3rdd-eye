package com.bytedance.sdk.openadsdk.ryl.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.osn;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm extends com.bytedance.sdk.component.ouw.vm<JSONObject, JSONObject> {
    public static final HashSet<String> yu = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private vpp fkw;

    private vm(vpp vppVar) {
        this.fkw = vppVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ Object ouw(String str, Object obj) throws Exception {
        String str2;
        Map<String, String> map;
        Map<String, String> map2;
        Map<String, String> map3;
        JSONObject jSONObject = (JSONObject) obj;
        vpp vppVar = this.fkw;
        String str3 = null;
        if (vppVar == null || (str2 = vppVar.rn) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        boolean z3 = true;
        boolean zContainsKey = false;
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1166163208:
                if (str.equals("getStorageItem")) {
                    c9 = 0;
                    break;
                }
                break;
            case 541948222:
                if (str.equals("removeAllStorage")) {
                    c9 = 1;
                    break;
                }
                break;
            case 1357067884:
                if (str.equals("setStorageItem")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1498706186:
                if (str.equals("removeStorageItem")) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                String strOptString = jSONObject.optString("key");
                if (!TextUtils.isEmpty(strOptString)) {
                    osn osnVarOuw = osn.ouw();
                    Map<String, Map<String, String>> map4 = osnVarOuw.ouw;
                    if (map4 != null && map4.containsKey(str2) && (map2 = osnVarOuw.ouw.get(str2)) != null) {
                        zContainsKey = map2.containsKey(strOptString);
                    }
                    if (zContainsKey) {
                        osn osnVarOuw2 = osn.ouw();
                        Map<String, Map<String, String>> map5 = osnVarOuw2.ouw;
                        if (map5 != null && map5.containsKey(str2) && (map = osnVarOuw2.ouw.get(str2)) != null) {
                            str3 = map.get(strOptString);
                        }
                        jSONObject2.put("value", str3);
                        jSONObject2.put("code", "0");
                        break;
                    }
                }
                jSONObject2.put("code", "1");
                break;
            case 1:
                osn.ouw().ouw(str2);
                jSONObject2.put("code", "0");
                break;
            case 2:
                String strOptString2 = jSONObject.optString("key");
                String strOptString3 = jSONObject.optString("value");
                if (strOptString2 == null) {
                    jSONObject2.put("code", "1");
                    break;
                } else {
                    osn osnVarOuw3 = osn.ouw();
                    Map<String, Map<String, String>> map6 = osnVarOuw3.ouw;
                    if (map6 != null) {
                        Map<String, String> map7 = map6.get(str2);
                        if (map7 != null) {
                            map7.put(strOptString2, strOptString3);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            concurrentHashMap.put(strOptString2, strOptString3);
                            osnVarOuw3.ouw.put(str2, concurrentHashMap);
                        }
                    }
                    jSONObject2.put("code", "0");
                    break;
                }
            case 3:
                String strOptString4 = jSONObject.optString("key");
                if (!TextUtils.isEmpty(strOptString4)) {
                    osn osnVarOuw4 = osn.ouw();
                    Map<String, Map<String, String>> map8 = osnVarOuw4.ouw;
                    if (map8 == null || !map8.containsKey(str2) || (map3 = osnVarOuw4.ouw.get(str2)) == null) {
                        z3 = false;
                    } else {
                        map3.remove(strOptString4);
                    }
                    jSONObject2.put("code", z3 ? "0" : "1");
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
                break;
        }
        return null;
    }

    public static void ouw(com.bytedance.sdk.component.ouw.ko koVar, vpp vppVar) {
        koVar.ouw(yu, new vm(vppVar));
    }
}
