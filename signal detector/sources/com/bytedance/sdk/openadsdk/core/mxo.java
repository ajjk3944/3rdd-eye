package com.bytedance.sdk.openadsdk.core;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mxo {
    private static volatile mxo emc;
    private Map<String, Map<String, String>> ypw = new ConcurrentHashMap();

    private mxo() {
    }

    public static mxo emc() {
        if (emc == null) {
            synchronized (mxo.class) {
                try {
                    if (emc == null) {
                        emc = new mxo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public boolean xq(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.ypw;
        if (map2 == null || !map2.containsKey(str) || (map = this.ypw.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public boolean ypw(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.ypw;
        if (map2 == null || !map2.containsKey(str) || (map = this.ypw.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public void emc(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.ypw;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.ypw.put(str, concurrentHashMap);
    }

    public String emc(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.ypw;
        if (map2 == null || !map2.containsKey(str) || (map = this.ypw.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public void emc(String str) {
        Map<String, Map<String, String>> map = this.ypw;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.ypw.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.ypw.remove(str);
        }
    }
}
