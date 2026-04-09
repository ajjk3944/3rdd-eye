package com.bytedance.sdk.openadsdk.tc.vt;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {
    private static final Map<Integer, vt> ouw = new ConcurrentHashMap();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public int ouw;
        public int vt = -1;

        public ouw(int i4) {
            this.ouw = i4;
        }
    }

    public static void ouw(vt vtVar, int i4) {
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(i4);
    }

    public static void vt(Integer num) {
        ouw.remove(num);
    }

    public static vt ouw(Integer num) {
        return ouw.get(num);
    }

    public static Integer vt(vpp vppVar) {
        return Integer.valueOf((vppVar.ux() + vppVar.pv).hashCode());
    }

    public static void ouw(View view, vpp vppVar, ouw ouwVar) {
        int i4;
        vt pnoVar;
        if (view == null || vppVar == null || vppVar.vrp) {
            return;
        }
        String strOuw = uoy.ouw(vppVar);
        boolean z3 = ((!"open_ad".equals(strOuw) && !"fullscreen_interstitial_ad".equals(strOuw) && !"rewarded_video".equals(strOuw)) || od.vt(vppVar) || (i4 = vppVar.fvf) == 5 || i4 == 33 || !vpp.fkw(vppVar) || vppVar.f8309sd == null) ? false : true;
        if (od.vt(vppVar) && ouwVar != null) {
            ouwVar.ouw = -1;
        }
        if (vppVar.pv == null) {
            pnoVar = null;
        } else {
            Integer numVt = vt(vppVar);
            Map<Integer, vt> map = ouw;
            if (map.containsKey(numVt)) {
                vt vtVar = map.get(numVt);
                if (vtVar != null) {
                    vtVar.ouw(view);
                }
                pnoVar = vtVar;
            } else {
                pnoVar = z3 ? new pno(numVt, view, vppVar, ouwVar) : new lh(numVt, view, vppVar, ouwVar);
                map.put(numVt, pnoVar);
            }
        }
        if (pnoVar != null) {
            pnoVar.ouw();
        }
    }

    public static void ouw(vpp vppVar, int i4) {
        if (vppVar == null || vppVar.pv == null) {
            return;
        }
        ouw(ouw.get(vt(vppVar)), i4);
    }

    public static void ouw(vpp vppVar) {
        if (vppVar == null || vppVar.pv == null) {
            return;
        }
        Integer numVt = vt(vppVar);
        Map<Integer, vt> map = ouw;
        vt vtVar = map.get(numVt);
        if (vtVar != null) {
            vtVar.pno();
        }
        vt(numVt);
        if (map.size() <= 0) {
            ra.ouw();
        }
    }
}
