package com.bytedance.sdk.openadsdk.core.ryl;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;
import com.bytedance.sdk.openadsdk.core.ryl.vt.vt;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    private boolean ko;
    private boolean qbp;
    private long rn;

    /* renamed from: th, reason: collision with root package name */
    private boolean f8436th;
    private boolean vm;
    private String vpp;
    private vpp zih;
    private String zin;
    private final AtomicBoolean mwh = new AtomicBoolean(false);

    /* renamed from: jg, reason: collision with root package name */
    private final AtomicBoolean f8433jg = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> ouw = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> vt = new ArrayList();

    /* renamed from: lh, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f8435lh = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> yu = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> fkw = new ArrayList();

    /* renamed from: le, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f8434le = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> ra = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> pno = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> bly = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> tlj = new ArrayList();

    /* renamed from: cf, reason: collision with root package name */
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.vt> f8432cf = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.ryl.vt.ouw> ryl = new ArrayList();

    private void ryl(List<com.bytedance.sdk.openadsdk.core.ryl.vt.vt> list) {
        this.f8432cf.addAll(list);
        Collections.sort(this.f8432cf);
    }

    public final void bly(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.ouw.addAll(list);
    }

    public final void cf(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.tlj.addAll(list);
    }

    public final void fkw(long j) {
        if (!ouw(j, this.ra, null, this.ko ? null : new lh.vt("skip", this.zih)) || this.ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_skip", (JSONObject) null);
    }

    public final void le(long j) {
        if (!ouw(j, this.pno, null, new lh.vt(this.ko ? "click" : "clickTracking", this.zih)) || this.ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_video_click", (JSONObject) null);
    }

    public final void lh(long j) {
        if (!ouw(j, this.fkw, null, new lh.vt(this.ko ? "video_progress" : "complete", this.zih, 1.0f)) || this.ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_complete", (JSONObject) null);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar) {
        if (!ouw(-1L, this.ouw, ouwVar, this.ko ? null : new lh.vt("error", this.zih, 0.0f)) || this.ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_error", (JSONObject) null);
    }

    public final void pno(long j) {
        if (!ouw(j, this.tlj, null, this.ko ? null : new lh.vt("unmute", this.zih, j)) || this.ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_unmute", (JSONObject) null);
    }

    public final void ra(long j) {
        if (!ouw(j, this.bly, null, this.ko ? null : new lh.vt("mute", this.zih, j)) || this.ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_mute", (JSONObject) null);
    }

    public final void tlj(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.bly.addAll(list);
    }

    public final void vt(long j) {
        if (!ouw(j, this.yu, null, this.ko ? null : new lh.vt("resume", this.zih, j)) || this.ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_resume", (JSONObject) null);
    }

    public final void yu(long j) {
        if (this.f8433jg.compareAndSet(false, true)) {
            ouw(j, this.f8434le, (com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw) null);
        }
    }

    public final void yu(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.fkw.addAll(list);
    }

    private String lh() {
        if (this.vpp == null) {
            this.vpp = UUID.randomUUID().toString();
        }
        return this.vpp;
    }

    private JSONArray yu() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.core.ryl.vt.vt vtVar : this.f8432cf) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, vtVar.vt);
            jSONObject.put("trackingFraction", vtVar.ouw);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public final void fkw(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.f8434le.addAll(list);
    }

    public final void le(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.ra.addAll(list);
    }

    public final void ouw() {
        if (this.mwh.compareAndSet(false, true)) {
            if (!ouw(0L, this.vt, null, new lh.vt(this.ko ? "show_impression" : AdSDKNotificationListener.IMPRESSION_EVENT, this.zih)) || this.ko) {
                return;
            }
            com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_impression", (JSONObject) null);
        }
    }

    public final void pno(List<com.bytedance.sdk.openadsdk.core.ryl.vt.ouw> list) {
        this.ryl.addAll(list);
        Collections.sort(this.ryl);
    }

    public final void ra(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.pno.addAll(list);
    }

    public final void vt(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.f8435lh.addAll(list);
    }

    private JSONArray fkw() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.core.ryl.vt.ouw ouwVar : this.ryl) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, ouwVar.vt);
            jSONObject.put("trackingMilliseconds", ouwVar.ouw);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public final JSONObject vt() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.ouw));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.vt));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.f8435lh));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.yu));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.fkw));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.f8434le));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.ra));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.pno));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.bly));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.tlj));
        jSONObject.put("fractionalTrackers", yu());
        jSONObject.put("absoluteTrackers", fkw());
        return jSONObject;
    }

    public final void lh(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.yu.addAll(list);
    }

    public final void ouw(long j) {
        if (!ouw(j, this.f8435lh, null, this.ko ? null : new lh.vt("pause", this.zih, j)) || this.ko) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_pause", (JSONObject) null);
    }

    public final void ouw(long j, long j8, le leVar) {
        lh.vt vtVar;
        if (System.currentTimeMillis() - this.rn >= 1000 && j >= 0 && j8 > 0) {
            this.rn = System.currentTimeMillis();
            float f10 = j / j8;
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < this.f8432cf.size(); i4++) {
                com.bytedance.sdk.openadsdk.core.ryl.vt.vt vtVar2 = this.f8432cf.get(i4);
                if (vtVar2.ouw <= f10 && !vtVar2.f8423lh) {
                    arrayList.add(vtVar2);
                }
            }
            for (int i10 = 0; i10 < this.ryl.size(); i10++) {
                com.bytedance.sdk.openadsdk.core.ryl.vt.ouw ouwVar = this.ryl.get(i10);
                if (ouwVar.ouw <= j && !ouwVar.f8423lh) {
                    arrayList.add(ouwVar);
                }
            }
            float f11 = 0.25f;
            if (f10 >= 0.25f && !this.vm) {
                ouw("firstQuartile");
                this.vm = true;
                if (leVar != null) {
                    ouw(leVar, 6);
                }
                if (!this.ko) {
                    vtVar = new lh.vt("firstQuartile", this.zih, 0.25f);
                    f10 = f11;
                }
                f10 = f11;
                vtVar = null;
            } else {
                f11 = 0.5f;
                if (f10 >= 0.5f && !this.f8436th) {
                    ouw("midpoint");
                    this.f8436th = true;
                    if (leVar != null) {
                        ouw(leVar, 7);
                    }
                    if (!this.ko) {
                        vtVar = new lh.vt("midpoint", this.zih, 0.5f);
                        f10 = f11;
                    }
                    f10 = f11;
                    vtVar = null;
                } else {
                    f11 = 0.75f;
                    if (f10 >= 0.75f && !this.qbp) {
                        ouw("thirdQuartile");
                        this.qbp = true;
                        if (leVar != null) {
                            ouw(leVar, 8);
                        }
                        if (!this.ko) {
                            vtVar = new lh.vt("thirdQuartile", this.zih, 0.75f);
                            f10 = f11;
                        }
                        f10 = f11;
                    }
                    vtVar = null;
                }
            }
            if (f10 < 0.03f) {
                f10 = 0.0f;
            }
            if (!this.ko && !arrayList.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.ryl.vt.lh lhVar = (com.bytedance.sdk.openadsdk.core.ryl.vt.lh) arrayList.get(0);
                if ((lhVar instanceof com.bytedance.sdk.openadsdk.core.ryl.vt.ouw) && ((com.bytedance.sdk.openadsdk.core.ryl.vt.ouw) lhVar).ouw == 0) {
                    com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_start", (JSONObject) null);
                    vtVar = new lh.vt("start", this.zih, f10);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (vtVar == null) {
                vtVar = new lh.vt("video_progress", this.zih, f10);
            }
            ouw(j, arrayList, null, vtVar);
        }
    }

    private void ouw(final le leVar, final int i4) {
        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.yu.1
            @Override // java.lang.Runnable
            public final void run() {
                le leVar2 = leVar;
                if (leVar2 != null) {
                    leVar2.ouw(i4);
                }
            }
        });
    }

    private void ouw(String str) {
        try {
            if (this.ko) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", str);
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_first_quartile", (JSONObject) null);
            } else if ("midpoint".equals(str)) {
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.zih, this.zin, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean ouw(long j, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list, com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar, lh.vt vtVar) {
        c cVar;
        vpp vppVar = this.zih;
        String str = null;
        if (vppVar != null && (cVar = vppVar.f8309sd) != null) {
            str = cVar.g;
        }
        return com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(vppVar, list, ouwVar, j, str, vtVar, lh());
    }

    private boolean ouw(long j, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list, com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar) {
        return ouw(j, list, ouwVar, null);
    }

    public final void ouw(List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) {
        this.vt.addAll(list);
    }

    public final void ouw(JSONObject jSONObject) {
        bly(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("errorTrackers")));
        ouw(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("impressionTrackers")));
        vt(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("pauseTrackers"), true));
        lh(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("resumeTrackers"), true));
        yu(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("completeTrackers")));
        fkw(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("closeTrackers")));
        le(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("skipTrackers")));
        ra(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("clickTrackers")));
        tlj(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("muteTrackers"), true));
        cf(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(jSONObject.optJSONArray("unMuteTrackers"), true));
        ryl(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.vt(jSONObject.optJSONArray("fractionalTrackers")));
        pno(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.lh(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public final void ouw(vpp vppVar) {
        this.zih = vppVar;
        this.zin = vppVar.vt();
        this.ko = vppVar.cd();
    }

    public final void ouw(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < 0.0f) {
            return;
        }
        ryl(Collections.singletonList(new vt.ouw(str, f10).ouw()));
    }

    public final void ouw(yu yuVar) {
        bly(yuVar.ouw);
        ouw(yuVar.vt);
        vt(yuVar.f8435lh);
        lh(yuVar.yu);
        yu(yuVar.fkw);
        fkw(yuVar.f8434le);
        le(yuVar.ra);
        ra(yuVar.pno);
        tlj(yuVar.bly);
        cf(yuVar.tlj);
        ryl(yuVar.f8432cf);
        pno(yuVar.ryl);
    }
}
