package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class hxp {
    private static ypw emc;

    public static abstract class emc {
        public abstract JSONObject emc();

        public final String ypw() {
            try {
                return emc().toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public interface ypw {
        void emc(String str, boolean z6, emc emcVar);
    }

    public static void emc(ypw ypwVar) {
        emc = ypwVar;
    }

    public static void emc(String str, emc emcVar) {
        ypw ypwVar = emc;
        if (ypwVar == null) {
            return;
        }
        ypwVar.emc(str, false, emcVar);
    }
}
