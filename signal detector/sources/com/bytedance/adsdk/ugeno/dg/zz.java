package com.bytedance.adsdk.ugeno.dg;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.dg.dg.xq;
import com.bytedance.adsdk.ugeno.dg.ycc;
import com.bytedance.adsdk.ugeno.dg.ypw.emc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zz implements gbl {
    private sz bw;
    private com.bytedance.adsdk.ugeno.core.bw dg;
    private emc emc;
    private boolean msw;
    private boolean uym;
    private com.bytedance.adsdk.ugeno.ypw.xq xq;
    private com.bytedance.adsdk.ugeno.core.ypw.emc ycc;
    private Map<String, List<com.bytedance.adsdk.ugeno.dg.dg.xq>> ypw;
    private boolean zz;

    public static class emc {
        public Map<String, List<com.bytedance.adsdk.ugeno.dg.dg.xq>> emc;
        public Map<String, com.bytedance.adsdk.ugeno.dg.dg.xq> ypw;

        public emc(Map<String, List<com.bytedance.adsdk.ugeno.dg.dg.xq>> map, Map<String, com.bytedance.adsdk.ugeno.dg.dg.xq> map2) {
            this.emc = map;
            this.ypw = map2;
        }
    }

    public zz(com.bytedance.adsdk.ugeno.ypw.xq xqVar, emc emcVar) {
        this.xq = xqVar;
        this.emc = emcVar;
        if (emcVar != null) {
            this.ypw = emcVar.emc;
        }
        if (xqVar != null && xqVar.but() && this.ycc == null) {
            this.ycc = new com.bytedance.adsdk.ugeno.core.ypw.emc();
        }
    }

    public void bw() {
        List<com.bytedance.adsdk.ugeno.dg.dg.xq> listEmc = emc("timer");
        if (listEmc == null || listEmc.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.dg.dg.xq xqVar : listEmc) {
            if (xqVar != null) {
                xqVar.emc(this);
                xqVar.emc(new Object[0]);
            }
        }
    }

    public void dg() {
        List<com.bytedance.adsdk.ugeno.dg.dg.xq> listEmc = emc("animateState");
        if (listEmc == null || listEmc.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.dg.dg.xq xqVar : listEmc) {
            if (xqVar != null) {
                xqVar.emc(this);
                xqVar.emc(new Object[0]);
            }
        }
    }

    public void emc(com.bytedance.adsdk.ugeno.core.bw bwVar) {
        this.dg = bwVar;
    }

    public void xq() {
        List<com.bytedance.adsdk.ugeno.dg.dg.xq> value;
        emc emcVar = this.emc;
        if (emcVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.dg.dg.xq>> entry : emcVar.emc.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.dg.dg.xq xqVar : value) {
                    if (xqVar instanceof com.bytedance.adsdk.ugeno.dg.dg.dg) {
                        xqVar.emc(this);
                        xqVar.emc(new Object[0]);
                    }
                }
            }
        }
    }

    public void ypw() {
        List<com.bytedance.adsdk.ugeno.dg.dg.xq> listEmc = emc("twist");
        if (listEmc == null || listEmc.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.dg.dg.xq xqVar : listEmc) {
            if (xqVar != null) {
                xqVar.emc(this);
                xqVar.emc(new Object[0]);
            }
        }
    }

    public void emc(sz szVar) {
        this.bw = szVar;
    }

    public void emc() {
        List<com.bytedance.adsdk.ugeno.dg.dg.xq> listEmc = emc("shake");
        if (listEmc == null || listEmc.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.dg.dg.xq xqVar : listEmc) {
            if (xqVar != null) {
                xqVar.emc(this);
                xqVar.emc(new Object[0]);
            }
        }
    }

    public com.bytedance.adsdk.ugeno.dg.dg.xq ypw(String str) {
        Map<String, com.bytedance.adsdk.ugeno.dg.dg.xq> map;
        if (this.emc == null || TextUtils.isEmpty(str) || (map = this.emc.ypw) == null) {
            return null;
        }
        return map.get(str);
    }

    public boolean emc(MotionEvent motionEvent) {
        List<com.bytedance.adsdk.ugeno.dg.dg.xq> listEmc = emc("touchStart");
        if (listEmc != null && !listEmc.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.dg.dg.xq xqVar : listEmc) {
                if (xqVar instanceof com.bytedance.adsdk.ugeno.dg.dg.sup) {
                    xqVar.emc(this);
                    xqVar.emc(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.dg.dg.xq> listEmc2 = emc("touchEnd");
        List<com.bytedance.adsdk.ugeno.dg.dg.xq> listEmc3 = emc("tap");
        List<com.bytedance.adsdk.ugeno.dg.dg.xq> listEmc4 = emc("slide");
        if (listEmc != null && !listEmc.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.dg.dg.xq xqVar2 : listEmc2) {
                if (xqVar2 instanceof com.bytedance.adsdk.ugeno.dg.dg.gbl) {
                    xqVar2.emc(this);
                    this.zz = xqVar2.emc(motionEvent);
                }
            }
        }
        if ((listEmc3 != null && !listEmc3.isEmpty()) || (listEmc4 != null && !listEmc4.isEmpty())) {
            if (this.zz && motionEvent.getAction() == 1) {
                return true;
            }
            com.bytedance.adsdk.ugeno.core.ypw.emc emcVar = this.ycc;
            if (emcVar != null) {
                if (emcVar.emc(motionEvent)) {
                    Log.d("GesThrough_UGEveFacade", "mockEvent，skip");
                    return false;
                }
                this.ycc.emc(this.xq, motionEvent);
            }
            if (listEmc3 != null && !listEmc3.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.dg.dg.xq xqVar3 : listEmc3) {
                    if (xqVar3 instanceof com.bytedance.adsdk.ugeno.dg.dg.zz) {
                        ((com.bytedance.adsdk.ugeno.dg.dg.zz) xqVar3).emc(this.bw);
                        xqVar3.emc(this);
                        this.uym = xqVar3.emc(motionEvent);
                    }
                }
            }
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && this.uym) {
                return true;
            }
            if (listEmc4 != null && !listEmc4.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.dg.dg.xq xqVar4 : listEmc4) {
                    if (xqVar4 instanceof com.bytedance.adsdk.ugeno.dg.dg.bw) {
                        xqVar4.emc(this);
                        this.msw = xqVar4.emc(motionEvent);
                    }
                }
            }
            if ((action == 1 || action == 3) && !this.uym && !this.msw && this.ycc != null) {
                Log.d("GesThrough_UGEveFacade", "Non-tap event & not satisfy slide requirements, need gesture through");
                this.ycc.emc(this.xq);
            }
            return this.uym || this.msw;
        }
        return this.zz;
    }

    private void emc(String str, List<ycc.emc> list) {
        com.bytedance.adsdk.ugeno.dg.ypw.emc emcVarEmc;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ycc.emc emcVar : list) {
            if (emcVar != null && (emcVarEmc = emc.C0008emc.emc(this.xq, str, emcVar)) != null) {
                emcVarEmc.emc();
                emcVarEmc.ypw();
            }
        }
    }

    public List<com.bytedance.adsdk.ugeno.dg.dg.xq> emc(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.dg.dg.xq>> map = this.ypw;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.ypw.get(str);
    }

    public void emc(String str, Object... objArr) {
        com.bytedance.adsdk.ugeno.dg.dg.xq xqVarYpw = ypw(str);
        if (xqVarYpw != null) {
            xqVarYpw.emc(this);
            xqVarYpw.emc(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.dg.gbl
    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, List<ycc.emc> list) {
        com.bytedance.adsdk.ugeno.core.bw bwVar = this.dg;
        if (bwVar != null) {
            bwVar.emc(xqVar, str, list);
        }
        emc(str, list);
    }

    public static zz emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str) {
        com.bytedance.adsdk.ugeno.dg.dg.xq xqVarEmc;
        if (xqVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                emc emcVar = new emc(new HashMap(), new HashMap());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && (xqVarEmc = xq.emc.emc(xqVar.gbl().getContext(), xqVar, jSONObjectOptJSONObject, xqVar.sup())) != null) {
                        if (emcVar.emc.containsKey(xqVarEmc.dg())) {
                            List<com.bytedance.adsdk.ugeno.dg.dg.xq> list = emcVar.emc.get(xqVarEmc.dg());
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(xqVarEmc);
                                emcVar.emc.put(xqVarEmc.dg(), arrayList);
                            } else {
                                list.add(xqVarEmc);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(xqVarEmc);
                            emcVar.emc.put(xqVarEmc.dg(), arrayList2);
                        }
                        emcVar.ypw.put(xqVarEmc.bw(), xqVarEmc);
                    }
                }
                return new zz(xqVar, emcVar);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
