package com.bytedance.sdk.openadsdk.dg.emc;

import A.f;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.vk.xq.dg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym implements com.bytedance.sdk.component.ycc.emc.ypw.xq {
    public sra<com.bytedance.sdk.openadsdk.dg.emc> emc;
    private final emc ypw = emc.emc();

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.ycc.emc.dg.emc>> dg(List<com.bytedance.sdk.component.ycc.emc.dg.emc> list) {
        HashMap<String, List<com.bytedance.sdk.component.ycc.emc.dg.emc>> map = new HashMap<>();
        new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.sdk.component.ycc.emc.dg.emc emcVar = list.get(i);
            JSONObject jSONObjectUym = emcVar.uym();
            if (jSONObjectUym != null) {
                String strOptString = jSONObjectUym.optString("app_log_url");
                List<com.bytedance.sdk.component.ycc.emc.dg.emc> arrayList = map.get(strOptString);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(strOptString, arrayList);
                }
                arrayList.add(emcVar);
            }
        }
        return map;
    }

    private boolean xq(List<com.bytedance.sdk.openadsdk.dg.emc> list) {
        JSONObject jSONObjectXq;
        if (list == null || list.size() == 0 || (jSONObjectXq = list.get(0).xq()) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObjectXq.optString("app_log_url"));
    }

    public com.bytedance.sdk.openadsdk.dg.bw ypw(List<dg.emc> list) {
        if (this.emc == null) {
            this.emc = aa.xq();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<dg.emc> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().ypw);
                }
                jSONObject.put("stats_list", jSONArray);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j6 = jCurrentTimeMillis / 1000;
                jSONObject.put("ts", j6);
                jSONObject.put("ts_ms", jCurrentTimeMillis);
                String strDg = com.bytedance.sdk.openadsdk.core.zz.ypw().dg();
                if (strDg == null) {
                    strDg = "";
                }
                StringBuilder sb = new StringBuilder(db.emc());
                sb.append("-");
                sb.append(jCurrentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.bw.emc(strDg + j6 + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.bw.emc(sb.toString()));
                return this.emc.ypw(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ypw.xq
    public void emc(final List<com.bytedance.sdk.component.ycc.emc.dg.emc> list, final com.bytedance.sdk.component.ycc.emc.ypw.ypw ypwVar) {
        com.bytedance.sdk.component.ycc.emc.dg.emc emcVar;
        if (list == null || list.isEmpty() || !aa.dg().hj() || (emcVar = list.get(0)) == null) {
            return;
        }
        byte bDg = emcVar.dg();
        final ArrayList arrayList = new ArrayList();
        if (bDg == 0) {
            com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.1
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    return f.e("applog");
                }
            });
            iyl.emc(new com.bytedance.sdk.component.msw.xq.ypw(7, "upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = uym.this.dg(list).entrySet().iterator();
                    } catch (Throwable th) {
                        ul.xq("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    Iterator it2 = it;
                    if (it2 == null) {
                        com.bytedance.sdk.component.ycc.emc.ypw.ypw ypwVar2 = ypwVar;
                        if (ypwVar2 != null) {
                            ypwVar2.emc(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it2.hasNext()) {
                        try {
                            List<com.bytedance.sdk.component.ycc.emc.dg.emc> list2 = (List) ((Map.Entry) it2.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.ycc.emc.dg.emc emcVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.dg.emc(emcVar2.xq(), emcVar2.uym()));
                            }
                            com.bytedance.sdk.openadsdk.dg.bw bwVarEmc = uym.this.emc(arrayList2);
                            if (ypwVar != null && bwVarEmc != null) {
                                boolean z6 = bwVarEmc.dg;
                                if (uym.this.emc(arrayList2, bwVarEmc)) {
                                    z6 = true;
                                }
                                boolean z7 = z6;
                                arrayList.add(new com.bytedance.sdk.component.ycc.emc.ypw.xq.emc(new com.bytedance.sdk.component.ycc.emc.ypw.xq.ypw(bwVarEmc.emc, bwVarEmc.ypw, bwVarEmc.xq, z7, ""), list2));
                                if (bwVarEmc.ypw == 200) {
                                    com.bytedance.sdk.openadsdk.sba.xq.ypw(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.2.1
                                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                            return f.e("applog");
                                        }
                                    });
                                } else if (z7) {
                                    com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.2.2
                                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                            return f.e("applog");
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.2.3
                                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                            return f.e("applog");
                                        }
                                    });
                                }
                            }
                            if (ypwVar != null && bwVarEmc == null) {
                                com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.2.4
                                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                        return f.e("applog");
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            ul.xq("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.ycc.emc.ypw.ypw ypwVar3 = ypwVar;
                    if (ypwVar3 != null) {
                        ypwVar3.emc(arrayList);
                    }
                }
            });
            return;
        }
        if (bDg == 1) {
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.ycc.emc.dg.emc emcVar2 : list) {
                arrayList2.add(new dg.emc(emcVar2.xq(), emcVar2.uym()));
            }
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.3
                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                        return f.e("stats");
                    }
                });
                iyl.emc(new com.bytedance.sdk.component.msw.xq.ypw(6, "upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.4
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.dg.bw bwVarYpw = uym.this.ypw(arrayList2);
                        if (ypwVar != null && bwVarYpw != null) {
                            arrayList.add(new com.bytedance.sdk.component.ycc.emc.ypw.xq.emc(new com.bytedance.sdk.component.ycc.emc.ypw.xq.ypw(bwVarYpw.emc, bwVarYpw.ypw, bwVarYpw.xq, bwVarYpw.dg, ""), list));
                            ypwVar.emc(arrayList);
                            if (bwVarYpw.ypw == 200) {
                                com.bytedance.sdk.openadsdk.sba.xq.ypw(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.4.1
                                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                        return f.e("stats");
                                    }
                                });
                            } else if (bwVarYpw.dg) {
                                com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.4.2
                                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                        return f.e("stats");
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.4.3
                                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                        return f.e("stats");
                                    }
                                });
                            }
                        }
                        if (ypwVar == null || bwVarYpw != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.dg.emc.uym.4.4
                            @Override // com.bytedance.sdk.openadsdk.sba.dg
                            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                return f.e("stats");
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(List<com.bytedance.sdk.openadsdk.dg.emc> list, com.bytedance.sdk.openadsdk.dg.bw bwVar) {
        int i;
        return !xq(list) && (i = bwVar.ypw) >= 400 && i < 500;
    }

    public com.bytedance.sdk.openadsdk.dg.bw emc(List<com.bytedance.sdk.openadsdk.dg.emc> list) {
        if (this.emc == null) {
            this.emc = aa.xq();
        }
        if (this.emc == null) {
            return null;
        }
        return this.emc.emc(this.ypw.emc(this.ypw.emc(list, false), System.currentTimeMillis(), this.ypw.ypw(), true), this.ypw.emc(list), true);
    }
}
