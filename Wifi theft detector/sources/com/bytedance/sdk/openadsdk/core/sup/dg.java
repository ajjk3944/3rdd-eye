package com.bytedance.sdk.openadsdk.core.sup;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup.ypw.emc;
import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import com.bytedance.sdk.openadsdk.core.sup.ypw.ypw;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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

    /* renamed from: aa, reason: collision with root package name */
    private rie f9299aa;
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

    public void bw(long j10) {
        if (this.qh.compareAndSet(false, true)) {
            emc(j10, this.ycc, (com.bytedance.sdk.openadsdk.core.sup.emc.emc) null);
        }
    }

    public void dg(long j10) {
        if (!emc(j10, this.bw, null, new xq.ypw(this.cf ? "video_progress" : CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, this.f9299aa, 1.0f)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_complete", (JSONObject) null);
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar) {
        if (!emc(-1L, this.emc, emcVar, this.cf ? null : new xq.ypw("error", this.f9299aa, 0.0f)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_error", (JSONObject) null);
    }

    public void gbl(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.zz.addAll(list);
    }

    public void msw(long j10) {
        if (!emc(j10, this.zz, null, this.cf ? null : new xq.ypw(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.f9299aa, j10)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_mute", (JSONObject) null);
    }

    public void ru(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.emc.addAll(list);
    }

    public void sup(List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) {
        this.ru.addAll(list);
    }

    public void uym(long j10) {
        if (!emc(j10, this.msw, null, new xq.ypw(this.cf ? CampaignEx.JSON_NATIVE_VIDEO_CLICK : "clickTracking", this.f9299aa)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_video_click", (JSONObject) null);
    }

    public void xq(long j10) {
        if (!emc(j10, this.dg, null, this.cf ? null : new xq.ypw(CampaignEx.JSON_NATIVE_VIDEO_RESUME, this.f9299aa, j10)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_resume", (JSONObject) null);
    }

    public void ycc(long j10) {
        if (!emc(j10, this.uym, null, this.cf ? null : new xq.ypw("skip", this.f9299aa)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_skip", (JSONObject) null);
    }

    public void ypw(long j10) {
        if (!emc(j10, this.xq, null, this.cf ? null : new xq.ypw(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, this.f9299aa, j10)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_pause", (JSONObject) null);
    }

    public void zz(long j10) {
        if (!emc(j10, this.ru, null, this.cf ? null : new xq.ypw(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, this.f9299aa, j10)) || this.cf) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_unmute", (JSONObject) null);
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

    public void emc(long j10) {
        if (this.sz.compareAndSet(false, true)) {
            if (!emc(j10, this.ypw, null, new xq.ypw(this.cf ? "show_impression" : "impression", this.f9299aa)) || this.cf) {
                return;
            }
            com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_impression", (JSONObject) null);
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

    private JSONArray dg() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.sup.ypw.emc> it = this.sup.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().ypw());
        }
        return jSONArray;
    }

    private JSONArray xq() throws JSONException {
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

    public void emc(long j10, long j11, ycc yccVar) {
        xq.ypw ypwVar;
        if (System.currentTimeMillis() - this.vk >= 1000 && j10 >= 0 && j11 > 0) {
            this.vk = System.currentTimeMillis();
            float f10 = j10 / j11;
            List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> listEmc = emc(j10, f10);
            float f11 = 0.25f;
            if (f10 >= 0.25f && !this.sba) {
                emc("firstQuartile");
                this.sba = true;
                if (yccVar != null) {
                    emc(yccVar, 6);
                }
                if (!this.cf) {
                    ypwVar = new xq.ypw("firstQuartile", this.f9299aa, 0.25f);
                    f10 = f11;
                }
                f10 = f11;
                ypwVar = null;
            } else {
                f11 = 0.5f;
                if (f10 >= 0.5f && !this.yzg) {
                    emc(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                    this.yzg = true;
                    if (yccVar != null) {
                        emc(yccVar, 7);
                    }
                    if (!this.cf) {
                        ypwVar = new xq.ypw(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, this.f9299aa, 0.5f);
                        f10 = f11;
                    }
                    f10 = f11;
                    ypwVar = null;
                } else {
                    f11 = 0.75f;
                    if (f10 >= 0.75f && !this.ul) {
                        emc("thirdQuartile");
                        this.ul = true;
                        if (yccVar != null) {
                            emc(yccVar, 8);
                        }
                        if (!this.cf) {
                            ypwVar = new xq.ypw("thirdQuartile", this.f9299aa, 0.75f);
                            f10 = f11;
                        }
                        f10 = f11;
                    }
                    ypwVar = null;
                }
            }
            if (f10 < 0.03f) {
                f10 = 0.0f;
            }
            if (!this.cf && !listEmc.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.sup.ypw.xq xqVar = listEmc.get(0);
                if ((xqVar instanceof com.bytedance.sdk.openadsdk.core.sup.ypw.emc) && ((com.bytedance.sdk.openadsdk.core.sup.ypw.emc) xqVar).emc() == 0) {
                    com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_start", (JSONObject) null);
                    ypwVar = new xq.ypw("start", this.f9299aa, f10);
                }
            }
            if (listEmc.isEmpty()) {
                return;
            }
            if (ypwVar == null) {
                ypwVar = new xq.ypw("video_progress", this.f9299aa, f10);
            }
            emc(j10, listEmc, null, ypwVar);
        }
    }

    private void emc(final ycc yccVar, final int i10) {
        com.bytedance.sdk.component.utils.zz.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sup.dg.1
            @Override // java.lang.Runnable
            public void run() {
                ycc yccVar2 = yccVar;
                if (yccVar2 != null) {
                    yccVar2.emc(i10);
                }
            }
        });
    }

    private void emc(String str) {
        try {
            if (this.cf) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
                com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_first_quartile", (JSONObject) null);
            } else if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equals(str)) {
                com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.dg.xq.ypw(this.f9299aa, this.ylm, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean emc(long j10, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list, com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar, xq.ypw ypwVar) {
        b bVarIat;
        rie rieVar = this.f9299aa;
        String strN = null;
        if (rieVar != null && (bVarIat = rieVar.iat()) != null) {
            strN = bVarIat.n();
        }
        return com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.f9299aa, list, emcVar, j10, strN, ypwVar, ypw());
    }

    private boolean emc(long j10, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list, com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar) {
        return emc(j10, list, emcVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> emc(long j10, float f10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.gbl.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.sup.ypw.ypw ypwVar = this.gbl.get(i10);
            if (ypwVar.emc(f10)) {
                arrayList.add(ypwVar);
            }
        }
        for (int i11 = 0; i11 < this.sup.size(); i11++) {
            com.bytedance.sdk.openadsdk.core.sup.ypw.emc emcVar = this.sup.get(i11);
            if (emcVar.emc(j10)) {
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
        this.f9299aa = rieVar;
        this.ylm = rieVar.bw();
        this.cf = rieVar.ak();
    }

    public void emc(String str, long j10) {
        if (TextUtils.isEmpty(str) || j10 < 0) {
            return;
        }
        zz(Collections.singletonList(new emc.C0158emc(str, j10).emc()));
    }

    public void emc(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < 0.0f) {
            return;
        }
        msw(Collections.singletonList(new ypw.emc(str, f10).emc()));
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
