package com.mbridge.msdk.config.component.common.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {
    public static Map<String, Object> a(com.mbridge.msdk.config.component.base.b bVar, Map<String, Object> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map<String, Object> mapA;
        Map<String, Object> mapA2;
        Map<String, Object> mapA3;
        Map<String, Object> mapA4;
        Object obj;
        HashMap map2 = new HashMap();
        try {
            boolean zA = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.a("20"));
            boolean zA2 = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.a("21"));
            boolean zA3 = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.a("22"));
            boolean zA4 = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.a("23"));
            map2.put(com.mbridge.msdk.config.component.common.util.c.a("key"), bVar.c());
            if (zA && (mapA4 = a(aVar.b(com.mbridge.msdk.config.component.common.util.c.a("50")))) != null && (obj = mapA4.get(com.mbridge.msdk.config.component.common.util.c.a("event_name"))) != null) {
                map2.put(com.mbridge.msdk.config.component.common.util.c.a("e_s_name"), String.valueOf(obj));
            }
            HashMap map3 = null;
            Map<String, Object> mapA5 = map != null ? a(map.get("event_gen_data")) : null;
            Map<String, Object> mapA6 = map != null ? a(map.get("event_replace_data")) : null;
            if (mapA6 != null && mapA6.containsKey(com.mbridge.msdk.config.component.common.util.c.a("24")) && (mapA3 = a(mapA6.get(com.mbridge.msdk.config.component.common.util.c.a("24")))) != null && !mapA3.isEmpty()) {
                map3 = new HashMap(mapA3);
                mapA6.remove(com.mbridge.msdk.config.component.common.util.c.a("24"));
            }
            if (zA2 && mapA5 != null) {
                map2.put(com.mbridge.msdk.config.component.common.util.c.a("e_output"), mapA5);
            }
            if (zA3) {
                map2.put(com.mbridge.msdk.config.component.common.util.c.a("execute_c_config"), a(a(bVar.b().get(com.mbridge.msdk.config.component.common.util.c.a("52")))));
                if (mapA6 != null && !mapA6.isEmpty()) {
                    mapA6.remove(com.mbridge.msdk.config.component.common.util.c.a("pre_action"));
                    map2.put(com.mbridge.msdk.config.component.common.util.c.a("execute_e_config"), mapA6);
                }
            }
            if (zA4 && (mapA = a(bVar.b().get(com.mbridge.msdk.config.component.common.util.c.a("51")))) != null && (mapA2 = a(mapA.get(com.mbridge.msdk.config.component.common.util.c.a("metrics")))) != null && !mapA2.isEmpty()) {
                map2.putAll(mapA2);
            }
            if (map3 != null && !map3.isEmpty()) {
                map2.putAll(com.mbridge.msdk.config.component.common.util.c.a(map3));
            }
            return map2;
        } catch (Throwable th) {
            q0.b("MetricsUtil", th.getMessage());
            return map2;
        }
    }

    private static boolean a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return true;
        }
        return String.valueOf(obj).equals("1");
    }

    private static Map<String, Object> a(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
        }
        return null;
    }

    private static Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getKey().equals(com.mbridge.msdk.config.component.common.util.c.a("25")) && !entry.getKey().equals(com.mbridge.msdk.config.component.common.util.c.a("13"))) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }
}
