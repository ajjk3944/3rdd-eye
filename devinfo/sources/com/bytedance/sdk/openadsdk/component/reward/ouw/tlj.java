package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.R;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import b9.e;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.component.reward.ouw.yu;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj {

    /* renamed from: lh, reason: collision with root package name */
    public final com.bytedance.sdk.openadsdk.core.lh.fkw f7990lh;
    public final ouw ouw;
    public final com.bytedance.sdk.openadsdk.core.lh.vt vt;

    public tlj(ouw ouwVar) {
        this.ouw = ouwVar;
        this.f7990lh = ouw(ouwVar, ouwVar.vt);
        this.vt = new com.bytedance.sdk.openadsdk.core.lh.vt(ouwVar.jvy, ouwVar.vt, ouwVar.fkw, ouwVar.yu ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.tlj.1
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
            public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
                try {
                    tlj.ouw(tlj.this, view, f10, f11, f12, f13, sparseArray, this.fak, this.fvf, this.bs);
                } catch (Exception e2) {
                    qbp.lh("TTAD.RFReportManager", "onClickReport error :" + e2.getMessage());
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(tlj.this.ouw.vt, 9);
                tlj.this.ouw.ex.ex();
            }
        };
    }

    private JSONObject yu() {
        try {
            e eVar = this.ouw.ex.ra;
            long jTh = eVar != null ? eVar.th() : 0L;
            int iMwh = this.ouw.ex.mwh();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", jTh);
                jSONObject.put("percent", iMwh);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final void lh() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.ouw.tlj.get()) {
                ouw ouwVar = this.ouw;
                rn rnVar = ouwVar.bs;
                jSONObject.put("endcard_content", rnVar.uoy ? 1 : ouwVar.fak.ko ? 3 : rnVar.fak ? 2 : 0);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        ouw ouwVar2 = this.ouw;
        com.bytedance.sdk.openadsdk.yu.lh.vt(ouwVar2.vt, ouwVar2.fkw, "click_close", jSONObject);
    }

    public final void ouw() {
        if (this.ouw.mwh.get()) {
            return;
        }
        boolean z3 = false;
        if (this.ouw.mwh.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.ouw.f7959gh;
            if (pnoVar != null && (pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu)) {
                ouw ouwVar = this.ouw;
                if (!ouwVar.pv && !ouwVar.f7959gh.f7766th) {
                    return;
                }
            }
            JSONObject jSONObject = new JSONObject();
            int iFkw = -1;
            try {
                if (this.ouw.vt.lh()) {
                    ouw ouwVar2 = this.ouw;
                    if (ouwVar2.jae != null && ouwVar2.vt.rn() == 2) {
                        jSONObject.put("dynamic_show_type", this.ouw.jae.fkw());
                        this.ouw.jae.ouw(jSONObject);
                        iFkw = this.ouw.jae.fkw();
                        z3 = true;
                    }
                }
            } catch (Throwable th2) {
                qbp.ouw("TTAD.RFReportManager", "reportShow: ", th2);
            }
            ouw(jSONObject, vt(), z3, iFkw, true);
        }
    }

    public final JSONObject vt() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        ouw ouwVar = this.ouw;
        if (!ouwVar.euf || (pnoVar = ouwVar.f7959gh) == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.yu.lh.ouw(pnoVar.f7763cf + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void vt(boolean z3) {
        ouw ouwVar = this.ouw;
        if (ouwVar == null) {
            return;
        }
        if (!z3 && ouwVar.mwh.get() && this.ouw.myk > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.ouw.myk);
            ouw ouwVar2 = this.ouw;
            com.bytedance.sdk.openadsdk.yu.lh.ouw(strValueOf, ouwVar2.vt, ouwVar2.fkw, ouwVar2.ex.zin);
            this.ouw.myk = 0L;
        } else {
            this.ouw.myk = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.ouw.vt, z3 ? 4 : 8);
        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(this.ouw.vt, z3 ? 4 : 8);
    }

    public final void lh(boolean z3) {
        ouw ouwVar = this.ouw;
        if (ouwVar != null && z3 && ouwVar.vt.cj()) {
            ouw ouwVar2 = this.ouw;
            vpp vppVar = ouwVar2.vt;
            if (vppVar.vr) {
                return;
            }
            vppVar.vr = true;
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, ouwVar2.fkw, vppVar.f8304od);
        }
    }

    public final void ouw(JSONObject jSONObject, JSONObject jSONObject2, boolean z3, int i4, boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        ouw ouwVar = this.ouw;
        vpp vppVar = ouwVar.vt;
        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, ouwVar.fkw, jSONObject, jSONObject2);
        this.ouw.fqk.tlj();
        if (!z3) {
            i4 = -1;
        }
        fkw.ouw ouwVar2 = new fkw.ouw(i4);
        ouw(ouwVar2);
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.ouw.jvy.findViewById(R.id.content), vppVar, ouwVar2);
        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(vppVar);
        if (!z10 || (yuVarSd = vppVar.sd()) == null) {
            return;
        }
        yuVarSd.ouw.ouw();
    }

    private void ouw(fkw.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        ouw ouwVar2 = this.ouw;
        if (!ouwVar2.euf || (pnoVar = ouwVar2.f7959gh) == null) {
            return;
        }
        ouwVar.vt = pnoVar.f7763cf;
    }

    public final void ouw(boolean z3) {
        vpp vppVar = this.ouw.vt;
        if (vppVar == null) {
            return;
        }
        int iFqk = vppVar.fqk();
        String strUx = this.ouw.vt.ux();
        com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
        yuVar.yu = z3 ? 7 : 8;
        yuVar.vt = String.valueOf(iFqk);
        yuVar.fkw = strUx;
        ouw ouwVar = this.ouw;
        rn rnVar = ouwVar.bs;
        yuVar.f8641le = rnVar.f7978jg;
        yuVar.ra = rnVar.ko;
        vpp vppVar2 = ouwVar.vt;
        yuVar.pno = vppVar2.yhj;
        yuVar.f8642lh = vppVar2.pv;
        com.bytedance.sdk.openadsdk.rn.lh.ouw().vt(yuVar);
    }

    public final void ouw(String str, JSONObject jSONObject) {
        ouw ouwVar = this.ouw;
        vpp vppVar = ouwVar.vt;
        String str2 = ouwVar.fkw;
        if (!ouwVar.yu) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str2, str, jSONObject);
    }

    public final com.bytedance.sdk.openadsdk.core.lh.fkw ouw(final ouw ouwVar, final vpp vppVar) {
        return new com.bytedance.sdk.openadsdk.core.lh.fkw(ouwVar.jvy, vppVar, ouwVar.fkw, ouwVar.yu ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.tlj.4
            @Override // com.bytedance.sdk.openadsdk.core.lh.fkw
            public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, int i4, int i10, int i11) {
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFReportManager", "onRewardBarClick , x = ".concat(String.valueOf(f10)));
                if (vppVar.cd() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        this.ex = (String) tag;
                    }
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(ouwVar.ex.fkw()));
                if (ouwVar.tlj.get()) {
                    map.put("click_scence", 2);
                } else {
                    map.put("click_scence", 1);
                }
                com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f7959gh;
                if (pnoVar != null) {
                    pnoVar.ouw(map, f10, f11);
                }
                ouw(map);
                ouwVar.fqk.osn();
                yu yuVar = ouwVar.tc;
                yu.ouw ouwVar2 = new yu.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.tlj.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.yu.ouw
                    public final void ouw(String str, JSONObject jSONObject) {
                        tlj.this.ouw(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.yu.ouw
                    public final void ouw(View view2, float f14, float f15, float f16, float f17, SparseArray<lh.ouw> sparseArray2, int i12, int i13, int i14) {
                        tlj.ouw(tlj.this, view2, f14, f15, f16, f17, sparseArray2, i12, i13, i14);
                    }
                };
                if (yuVar.f7993lh != null) {
                    int id2 = view.getId();
                    if (id2 == com.bytedance.sdk.openadsdk.utils.rn.fkw) {
                        ouwVar2.ouw("click_play_star_level", null);
                    } else if (id2 == com.bytedance.sdk.openadsdk.utils.rn.yu) {
                        ouwVar2.ouw("click_play_star_nums", null);
                    } else if (id2 == com.bytedance.sdk.openadsdk.utils.rn.f8721lh) {
                        ouwVar2.ouw("click_play_source", null);
                    } else if (id2 == com.bytedance.sdk.openadsdk.utils.rn.vt) {
                        ouwVar2.ouw("click_play_logo", null);
                    }
                } else {
                    ouwVar2.ouw(view, f10, f11, f12, f13, sparseArray, i4, i10, i11);
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(vppVar, 9);
                ouwVar.ex.ex();
            }
        };
    }

    public static /* synthetic */ void ouw(tlj tljVar, View view, float f10, float f11, float f12, float f13, SparseArray sparseArray, int i4, int i10, int i11) {
        if (view != null) {
            int id2 = view.getId();
            int i12 = com.bytedance.sdk.openadsdk.utils.rn.fkw;
            if (id2 == i12) {
                tljVar.ouw("click_play_star_level", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.rn.yu && view.getId() != com.bytedance.sdk.openadsdk.utils.rn.ra) {
                if (view.getId() == com.bytedance.sdk.openadsdk.utils.rn.f8721lh) {
                    tljVar.ouw("click_play_source", (JSONObject) null);
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.rn.vt) {
                    tljVar.ouw("click_play_logo", (JSONObject) null);
                } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.rn.ryl && view.getId() != com.bytedance.sdk.openadsdk.utils.rn.xn && view.getId() != com.bytedance.sdk.openadsdk.utils.rn.rn) {
                    if (view.getId() == 520093705) {
                        tljVar.ouw("click_start_play", tljVar.yu());
                    } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.rn.f8714cf) {
                        tljVar.ouw("click_video", tljVar.yu());
                    } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.rn.pno) {
                        tljVar.ouw("fallback_endcard_click", tljVar.yu());
                    }
                } else {
                    tljVar.ouw("click_start_play_bar", tljVar.yu());
                }
            } else {
                tljVar.ouw("click_play_star_nums", (JSONObject) null);
            }
            vpp vppVar = tljVar.ouw.vt;
            if (vppVar != null) {
                if (vppVar.qbp() != 1 || tljVar.ouw.vt == null) {
                    return;
                }
                int id3 = view.getId();
                if (id3 == i12 || id3 == com.bytedance.sdk.openadsdk.utils.rn.yu || id3 == com.bytedance.sdk.openadsdk.utils.rn.f8721lh || id3 == com.bytedance.sdk.openadsdk.utils.rn.vt || id3 == com.bytedance.sdk.openadsdk.utils.rn.ryl || id3 == com.bytedance.sdk.openadsdk.utils.rn.xn || id3 == com.bytedance.sdk.openadsdk.utils.rn.rn || id3 == 520093705 || id3 == com.bytedance.sdk.openadsdk.utils.rn.f8714cf || id3 == 520093707 || id3 == com.bytedance.sdk.openadsdk.utils.rn.ra) {
                    int iCf = osn.cf(com.bytedance.sdk.openadsdk.core.zih.ouw());
                    float fBly = osn.bly(com.bytedance.sdk.openadsdk.core.zih.ouw());
                    float fTlj = osn.tlj(com.bytedance.sdk.openadsdk.core.zih.ouw());
                    cf.ouw ouwVar = new cf.ouw();
                    ouwVar.f8216le = f10;
                    ouwVar.fkw = f11;
                    ouwVar.yu = f12;
                    ouwVar.f8217lh = f13;
                    ouwVar.vt = System.currentTimeMillis();
                    ouwVar.ouw = 0L;
                    ouwVar.ra = osn.ouw(tljVar.ouw.ey.cf());
                    ouwVar.pno = osn.lh(tljVar.ouw.ey.cf());
                    ouwVar.bly = i10;
                    ouwVar.tlj = i11;
                    ouwVar.f8214cf = i4;
                    ouwVar.ryl = sparseArray;
                    ouwVar.mwh = com.bytedance.sdk.openadsdk.core.bly.ouw().tlj ? 1 : 2;
                    ouwVar.ko = iCf;
                    ouwVar.f8215jg = fBly;
                    ouwVar.rn = fTlj;
                    com.bytedance.sdk.openadsdk.core.model.cf cfVarOuw = ouwVar.ouw();
                    HashMap map = new HashMap();
                    map.put("duration", Long.valueOf(tljVar.ouw.ex.fkw()));
                    ouw ouwVar2 = tljVar.ouw;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw("click_other", ouwVar2.vt, cfVarOuw, ouwVar2.fkw, true, (Map<String, Object>) map, -1);
                }
            }
        }
    }
}
