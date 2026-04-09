package com.bytedance.sdk.openadsdk.core.sup;

import android.text.TextUtils;
import com.bykv.vk.openvk.emc.emc.emc.xq.c;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup.ypw.emc;
import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import com.bytedance.sdk.openadsdk.core.sup.ypw.ypw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg {
    private rie aa;
    private boolean cf;
    private boolean sba;
    private String sra;
    private boolean ul;
    private long vk;
    private String ylm;
    private boolean yzg;
    private final AtomicBoolean sz = new AtomicBoolean(false);
    private final AtomicBoolean qh = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> emc = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> ypw = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> xq = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> dg = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> bw = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> ycc = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> uym = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> msw = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> zz = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> ru = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.ypw> gbl = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.emc> sup = new ArrayList();

    public void bw(long j6) {
        if (this.qh.compareAndSet(false, true)) {
            emc(j6, this.ycc, (com.bytedance.sdk.openadsdk.core.sup.emc.emc) null);
        }
    }

    public void dg(long j6) {
        if (!emc(j6, this.bw, null, new xq.ypw(this.cf ? "video_progress" : "complete", this.aa, 1.0f)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_complete", (JSONObject) null);
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar) {
        if (!emc(-1L, this.emc, emcVar, this.cf ? null : new xq.ypw("error", this.aa, 0.0f)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_error", (JSONObject) null);
    }

    public void gbl(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.zz.addAll(list);
    }

    public void msw(long j6) {
        if (!emc(j6, this.zz, null, this.cf ? null : new xq.ypw("mute", this.aa, j6)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_mute", (JSONObject) null);
    }

    public void ru(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.emc.addAll(list);
    }

    public void sup(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.ru.addAll(list);
    }

    public void uym(long j6) {
        if (!emc(j6, this.msw, null, new xq.ypw(this.cf ? "click" : "clickTracking", this.aa)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_video_click", (JSONObject) null);
    }

    public void xq(long j6) {
        if (!emc(j6, this.dg, null, this.cf ? null : new xq.ypw("resume", this.aa, j6)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_resume", (JSONObject) null);
    }

    public void ycc(long j6) {
        if (!emc(j6, this.uym, null, this.cf ? null : new xq.ypw("skip", this.aa)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_skip", (JSONObject) null);
    }

    public void ypw(long j6) {
        if (!emc(j6, this.xq, null, this.cf ? null : new xq.ypw("pause", this.aa, j6)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_pause", (JSONObject) null);
    }

    public void zz(long j6) {
        if (!emc(j6, this.ru, null, this.cf ? null : new xq.ypw("unmute", this.aa, j6)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_unmute", (JSONObject) null);
    }

    public void bw(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.ycc.addAll(list);
    }

    private String ypw() {
        if (this.sra == null) {
            this.sra = UUID.randomUUID().toString();
        }
        return this.sra;
    }

    public void dg(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.bw.addAll(list);
    }

    public void emc(long j6) {
        if (this.sz.compareAndSet(false, true)) {
            if (!emc(j6, this.ypw, null, new xq.ypw(this.cf ? "show_impression" : "impression", this.aa)) || this.cf) {
                return;
            }
            com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_impression", (JSONObject) null);
        }
    }

    public void msw(List<com.bytedance.sdk.openadsdk.core.sup.ypw.ypw> list) {
        this.gbl.addAll(list);
        Collections.sort(this.gbl);
    }

    public void uym(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.msw.addAll(list);
    }

    public void xq(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.dg.addAll(list);
    }

    public void ycc(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.uym.addAll(list);
    }

    public void zz(List<com.bytedance.sdk.openadsdk.core.sup.ypw.emc> list) {
        this.sup.addAll(list);
        Collections.sort(this.sup);
    }

    private JSONArray dg() {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.sup.ypw.emc> it = this.sup.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().ypw());
        }
        return jSONArray;
    }

    private JSONArray xq() {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.sup.ypw.ypw> it = this.gbl.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().ypw());
        }
        return jSONArray;
    }

    public void ypw(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.xq.addAll(list);
    }

    public void emc(long j6, long j7, ycc yccVar) {
        xq.ypw ypwVar;
        if (System.currentTimeMillis() - this.vk >= 1000 && j6 >= 0 && j7 > 0) {
            this.vk = System.currentTimeMillis();
            float f2 = j6 / j7;
            List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> listEmc = emc(j6, f2);
            float f5 = 0.25f;
            if (f2 >= 0.25f && !this.sba) {
                emc("firstQuartile");
                this.sba = true;
                if (yccVar != null) {
                    emc(yccVar, 6);
                }
                if (!this.cf) {
                    ypwVar = new xq.ypw("firstQuartile", this.aa, 0.25f);
                    f2 = f5;
                }
                f2 = f5;
                ypwVar = null;
            } else {
                f5 = 0.5f;
                if (f2 >= 0.5f && !this.yzg) {
                    emc("midpoint");
                    this.yzg = true;
                    if (yccVar != null) {
                        emc(yccVar, 7);
                    }
                    if (!this.cf) {
                        ypwVar = new xq.ypw("midpoint", this.aa, 0.5f);
                        f2 = f5;
                    }
                    f2 = f5;
                    ypwVar = null;
                } else {
                    f5 = 0.75f;
                    if (f2 >= 0.75f && !this.ul) {
                        emc("thirdQuartile");
                        this.ul = true;
                        if (yccVar != null) {
                            emc(yccVar, 8);
                        }
                        if (!this.cf) {
                            ypwVar = new xq.ypw("thirdQuartile", this.aa, 0.75f);
                            f2 = f5;
                        }
                        f2 = f5;
                    }
                    ypwVar = null;
                }
            }
            if (f2 < 0.03f) {
                f2 = 0.0f;
            }
            if (!this.cf && !listEmc.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.sup.ypw.xq xqVar = listEmc.get(0);
                if ((xqVar instanceof com.bytedance.sdk.openadsdk.core.sup.ypw.emc) && ((com.bytedance.sdk.openadsdk.core.sup.ypw.emc) xqVar).emc() == 0) {
                    com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_start", (JSONObject) null);
                    ypwVar = new xq.ypw("start", this.aa, f2);
                }
            }
            if (listEmc.isEmpty()) {
                return;
            }
            if (ypwVar == null) {
                ypwVar = new xq.ypw("video_progress", this.aa, f2);
            }
            emc(j6, listEmc, null, ypwVar);
        }
    }

    private void emc(final ycc yccVar, final int i) {
        com.bytedance.sdk.component.utils.zz.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.dg.1
            @Override // java.lang.Runnable
            public void run() {
                ycc yccVar2 = yccVar;
                if (yccVar2 != null) {
                    yccVar2.emc(i);
                }
            }
        });
    }

    private void emc(String str) {
        try {
            if (this.cf) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", str);
                com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_first_quartile", (JSONObject) null);
            } else if ("midpoint".equals(str)) {
                com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.dg.xq.ypw(this.aa, this.ylm, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean emc(long j6, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list, com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar, xq.ypw ypwVar) {
        c cVarIat;
        rie rieVar = this.aa;
        String str = null;
        if (rieVar != null && (cVarIat = rieVar.iat()) != null) {
            str = cVarIat.f6586g;
        }
        return com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.aa, list, emcVar, j6, str, ypwVar, ypw());
    }

    private boolean emc(long j6, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list, com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar) {
        return emc(j6, list, emcVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> emc(long j6, float f2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.gbl.size(); i++) {
            com.bytedance.sdk.openadsdk.core.sup.ypw.ypw ypwVar = this.gbl.get(i);
            if (ypwVar.emc(f2)) {
                arrayList.add(ypwVar);
            }
        }
        for (int i3 = 0; i3 < this.sup.size(); i3++) {
            com.bytedance.sdk.openadsdk.core.sup.ypw.emc emcVar = this.sup.get(i3);
            if (emcVar.emc(j6)) {
                arrayList.add(emcVar);
            }
        }
        return arrayList;
    }

    public void emc(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.ypw.addAll(list);
    }

    public JSONObject emc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.emc));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.ypw));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.xq));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.dg));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.bw));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.ycc));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.uym));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.msw));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.zz));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.ru));
        jSONObject.put("fractionalTrackers", xq());
        jSONObject.put("absoluteTrackers", dg());
        return jSONObject;
    }

    public void emc(JSONObject jSONObject) {
        ru(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(jSONObject.optJSONArray("errorTrackers")));
        emc(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(jSONObject.optJSONArray("impressionTrackers")));
        ypw(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(jSONObject.optJSONArray("pauseTrackers"), true));
        xq(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(jSONObject.optJSONArray("resumeTrackers"), true));
        dg(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(jSONObject.optJSONArray("completeTrackers")));
        bw(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(jSONObject.optJSONArray("closeTrackers")));
        ycc(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(jSONObject.optJSONArray("skipTrackers")));
        uym(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(jSONObject.optJSONArray("clickTrackers")));
        gbl(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(jSONObject.optJSONArray("muteTrackers"), true));
        sup(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(jSONObject.optJSONArray("unMuteTrackers"), true));
        msw(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.ypw(jSONObject.optJSONArray("fractionalTrackers")));
        zz(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.xq(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void emc(rie rieVar) {
        this.aa = rieVar;
        this.ylm = rieVar.bw();
        this.cf = rieVar.ak();
    }

    public void emc(String str, long j6) {
        if (TextUtils.isEmpty(str) || j6 < 0) {
            return;
        }
        zz(Collections.singletonList(new emc.C0073emc(str, j6).emc()));
    }

    public void emc(String str, float f2) {
        if (TextUtils.isEmpty(str) || f2 < 0.0f) {
            return;
        }
        msw(Collections.singletonList(new ypw.emc(str, f2).emc()));
    }

    public void emc(dg dgVar) {
        ru(dgVar.emc);
        emc(dgVar.ypw);
        ypw(dgVar.xq);
        xq(dgVar.dg);
        dg(dgVar.bw);
        bw(dgVar.ycc);
        ycc(dgVar.uym);
        uym(dgVar.msw);
        gbl(dgVar.zz);
        sup(dgVar.ru);
        msw(dgVar.gbl);
        zz(dgVar.sup);
    }
}
