package com.bytedance.adsdk.ugeno.dg.ypw;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dg.ycc;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class emc {
    public static final HashSet<String> emc = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
    protected String bw;
    protected String dg;
    protected String msw;
    protected String uym;
    protected com.bytedance.adsdk.ugeno.ypw.xq xq;
    protected Map<String, String> ycc;
    protected ycc.emc ypw;

    /* renamed from: com.bytedance.adsdk.ugeno.dg.ypw.emc$emc, reason: collision with other inner class name */
    public static class C0008emc {
        public static emc emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
            if (emcVar == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.dg.ypw ypwVarEmc = com.bytedance.adsdk.ugeno.dg.dg.emc(emcVar.ypw());
            if (ypwVarEmc == null) {
                return new xq(xqVar, str, emcVar);
            }
            emc emcVarEmc = ypwVarEmc.emc(xqVar, str, emcVar);
            return emcVarEmc == null ? new xq(xqVar, str, emcVar) : emcVarEmc;
        }
    }

    public emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, ycc.emc emcVar) {
        this.xq = xqVar;
        this.ypw = emcVar;
        this.uym = str;
        bw();
    }

    private void bw() {
        ycc.emc emcVar = this.ypw;
        if (emcVar == null) {
            return;
        }
        this.dg = emcVar.emc();
        this.bw = this.ypw.ypw();
        Map<String, String> mapXq = this.ypw.xq();
        this.ycc = mapXq;
        if (mapXq == null || mapXq.isEmpty() || !this.ycc.containsKey("emitCustomEvent")) {
            return;
        }
        this.msw = this.ycc.get("emitCustomEvent");
    }

    public boolean dg() {
        return !TextUtils.isEmpty(this.msw);
    }

    public abstract void emc();

    public void xq() {
        if (dg()) {
            ycc.emc emcVar = new ycc.emc();
            emcVar.emc("custom");
            emcVar.ypw("emit");
            HashMap map = new HashMap();
            map.put("name", this.msw);
            emcVar.emc(map);
            new ypw(this.xq, this.bw, emcVar).emc();
        }
    }

    public void ypw() {
        xq();
    }
}
