package com.bytedance.adsdk.ypw;

import java.util.Map;

/* loaded from: classes.dex */
public class ul {
    private final Map<String, String> emc;
    private boolean ypw;

    public String emc(String str) {
        return str;
    }

    public final String ypw(String str, String str2) {
        if (this.ypw && this.emc.containsKey(str2)) {
            return this.emc.get(str2);
        }
        String strEmc = emc(str, str2);
        if (this.ypw) {
            this.emc.put(str2, strEmc);
        }
        return strEmc;
    }

    public String emc(String str, String str2) {
        return emc(str2);
    }
}
