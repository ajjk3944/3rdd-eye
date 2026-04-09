package com.bytedance.sdk.openadsdk.ee.ypw;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.tp;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class bw {
    private static final Map<Integer, ypw> emc = new ConcurrentHashMap();

    public static class emc {
        public int emc;
        public int ypw = -1;

        public emc(int i) {
            this.emc = i;
        }
    }

    public static void emc(View view, rie rieVar, emc emcVar) {
        if (view == null || rieVar == null || rieVar.dk()) {
            return;
        }
        boolean zXq = xq(rieVar);
        if (dr.ypw(rieVar) && emcVar != null) {
            emcVar.emc = -1;
        }
        emc(emc(view, rieVar, zXq, emcVar));
    }

    private static boolean xq(rie rieVar) {
        if (rieVar == null) {
            return false;
        }
        String strEmc = tp.emc(rieVar);
        return ((!"open_ad".equals(strEmc) && !"fullscreen_interstitial_ad".equals(strEmc) && !"rewarded_video".equals(strEmc)) || dr.ypw(rieVar) || rieVar.fu() == 5 || rieVar.fu() == 33 || !rie.bw(rieVar) || rieVar.iat() == null) ? false : true;
    }

    public static void ypw(Integer num) {
        emc.remove(num);
    }

    public static Integer ypw(rie rieVar) {
        return Integer.valueOf((rieVar.lvs() + rieVar.ye()).hashCode());
    }

    private static ypw emc(View view, rie rieVar, boolean z6, emc emcVar) {
        if (view == null || rieVar == null || rieVar.ye() == null) {
            return null;
        }
        Integer numYpw = ypw(rieVar);
        Map<Integer, ypw> map = emc;
        if (map.containsKey(numYpw)) {
            ypw ypwVar = map.get(numYpw);
            if (ypwVar != null) {
                ypwVar.emc(view);
            }
            return ypwVar;
        }
        ypw ypwVarEmc = ypw.emc(z6, numYpw, view, rieVar, emcVar);
        map.put(numYpw, ypwVarEmc);
        return ypwVarEmc;
    }

    private static void emc(ypw ypwVar) {
        if (ypwVar == null) {
            return;
        }
        ypwVar.emc();
    }

    public static void emc(rie rieVar, int i) {
        if (rieVar == null || rieVar.ye() == null) {
            return;
        }
        emc(emc.get(ypw(rieVar)), i);
    }

    public static void emc(ypw ypwVar, int i) {
        if (ypwVar == null) {
            return;
        }
        ypwVar.emc(i);
    }

    public static void emc(rie rieVar) {
        if (rieVar == null || rieVar.ye() == null) {
            return;
        }
        Integer numYpw = ypw(rieVar);
        Map<Integer, ypw> map = emc;
        ypw ypwVar = map.get(numYpw);
        if (ypwVar != null) {
            ypwVar.ru();
        }
        ypw(numYpw);
        if (map.size() <= 0) {
            uym.emc();
        }
    }

    public static ypw emc(Integer num) {
        return emc.get(num);
    }
}
