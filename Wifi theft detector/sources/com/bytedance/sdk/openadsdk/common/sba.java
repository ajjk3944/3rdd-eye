package com.bytedance.sdk.openadsdk.common;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class sba {
    private static volatile sba bw;
    private AdSlot emc;
    private final Map<String, List<com.bytedance.sdk.openadsdk.component.bw.ypw>> ypw = new ConcurrentHashMap();
    private final Map<String, List<String>> xq = new ConcurrentHashMap();
    private final Object dg = new Object();
    private final Runnable ycc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sba.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.component.uym.emc.emc(2);
            com.bytedance.sdk.component.ycc.emc.uym.emc.emc().postDelayed(sba.this.ycc, com.bytedance.sdk.openadsdk.component.uym.emc.ru());
        }
    };

    private sba() {
    }

    private void xq(String str) {
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_material_cache_encrypt", "material".concat(String.valueOf(str)));
    }

    private void ypw(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.ypw.size() >= 10) {
            this.ypw.size();
            return;
        }
        List<com.bytedance.sdk.openadsdk.component.bw.ypw> list = this.ypw.get(str);
        if (list == null || list.isEmpty()) {
            List<com.bytedance.sdk.openadsdk.component.bw.ypw> listEmc = emc(str);
            if (listEmc == null) {
                listEmc = new ArrayList<>();
            }
            this.ypw.put(str, listEmc);
        }
        if (this.xq.containsKey(str)) {
            return;
        }
        this.xq.put(str, new ArrayList());
    }

    public void dg() {
        com.bytedance.sdk.component.ycc.emc.uym.emc.emc().postDelayed(this.ycc, com.bytedance.sdk.openadsdk.component.uym.emc.ru());
    }

    public static sba emc() {
        if (bw == null) {
            synchronized (sba.class) {
                try {
                    if (bw == null) {
                        bw = new sba();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bw;
    }

    public AdSlot xq() {
        return this.emc;
    }

    private List<com.bytedance.sdk.openadsdk.component.bw.ypw> emc(String str) {
        String strYpw;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            strYpw = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), null);
        } else {
            strYpw = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("tt_openad_material_cache_encrypt", "material".concat(String.valueOf(str)), null);
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strYpw)) {
            try {
                JSONArray jSONArray = new JSONArray(strYpw);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(com.bytedance.sdk.openadsdk.component.bw.ypw.emc(jSONArray.getJSONObject(i10)));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private com.bytedance.sdk.openadsdk.component.bw.ypw ypw(rie rieVar, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        if (rieVar == null || rieVar.vaf() == null || emcVar == null) {
            return null;
        }
        String codeId = rieVar.vaf().getCodeId();
        String strLvs = rieVar.lvs();
        long jAz = rieVar.az();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jOp = rieVar.op();
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            return new com.bytedance.sdk.openadsdk.component.bw.ypw(codeId, emcVar.qh(), jAz, jCurrentTimeMillis, jOp, strLvs);
        }
        return new com.bytedance.sdk.openadsdk.component.bw.ypw(codeId, com.bytedance.sdk.component.utils.emc.emc(rieVar.uie()).toString(), jAz, jCurrentTimeMillis, jOp, strLvs);
    }

    private void emc(String str, List<com.bytedance.sdk.openadsdk.component.bw.ypw> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.component.bw.ypw ypwVar : list) {
            if (ypwVar != null) {
                try {
                    jSONArray.put(ypwVar.emc());
                } catch (Exception unused) {
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), jSONArray.toString());
        } else {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_material_cache_encrypt", "material".concat(String.valueOf(str)), jSONArray.toString());
        }
    }

    public void ypw() {
        try {
            synchronized (this.dg) {
                this.ypw.clear();
                this.xq.clear();
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_material_cache_origin");
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tt_openad_material_cache_encrypt");
            }
        } catch (Exception unused) {
        }
    }

    public void emc(rie rieVar, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        AdSlot adSlotVaf;
        if (rieVar == null || emcVar == null || (adSlotVaf = rieVar.vaf()) == null || rieVar.wh() || !TextUtils.isEmpty(adSlotVaf.getBidAdm()) || rieVar.lad() == 2) {
            return;
        }
        String codeId = adSlotVaf.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        synchronized (this.dg) {
            try {
                ypw(codeId);
                if (!this.ypw.containsKey(codeId) && this.ypw.size() >= 10) {
                    this.ypw.size();
                    return;
                }
                com.bytedance.sdk.openadsdk.component.bw.ypw ypwVarYpw = ypw(rieVar, emcVar);
                List<com.bytedance.sdk.openadsdk.component.bw.ypw> arrayList = this.ypw.get(codeId);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                emc(arrayList);
                int iMsw = com.bytedance.sdk.openadsdk.component.uym.emc.msw();
                if (arrayList.size() < iMsw) {
                    arrayList.size();
                    com.bytedance.sdk.openadsdk.component.dg.emc.emc(rieVar, arrayList.size(), adSlotVaf.getCacheScene(), false);
                    arrayList.add(ypwVarYpw);
                    this.ypw.put(codeId, arrayList);
                    emc(adSlotVaf, rieVar.lvs());
                    emc(codeId, arrayList);
                    return;
                }
                if (emc(arrayList, adSlotVaf) && arrayList.size() < iMsw) {
                    arrayList.add(ypwVarYpw);
                    emc(codeId, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void ypw(AdSlot adSlot) {
        if (adSlot != null && TextUtils.isEmpty(adSlot.getBidAdm()) && this.emc == null) {
            this.emc = adSlot;
        }
    }

    public boolean emc(String str, int i10, int i11) {
        boolean z10 = true;
        if (!com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
            return i11 <= 0;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iMsw = com.bytedance.sdk.openadsdk.component.uym.emc.msw();
        synchronized (this.dg) {
            try {
                List<com.bytedance.sdk.openadsdk.component.bw.ypw> list = this.ypw.get(str);
                if (list != null && !list.isEmpty()) {
                    int size = list.size();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jZz = com.bytedance.sdk.openadsdk.component.uym.emc.zz();
                    for (com.bytedance.sdk.openadsdk.component.bw.ypw ypwVar : list) {
                        if (ypwVar != null && (jCurrentTimeMillis / 1000 > ypwVar.xq() || jCurrentTimeMillis - ypwVar.dg() > jZz)) {
                            size--;
                        }
                    }
                    if (i10 + size >= iMsw) {
                        z10 = false;
                    }
                    list.size();
                    return z10;
                }
                if (i10 >= iMsw) {
                    z10 = false;
                }
                return z10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.bytedance.sdk.openadsdk.component.bw.ypw emc(AdSlot adSlot) {
        if (adSlot == null) {
            return null;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return null;
        }
        synchronized (this.dg) {
            try {
                ypw(codeId);
                List<com.bytedance.sdk.openadsdk.component.bw.ypw> list = this.ypw.get(codeId);
                List<String> list2 = this.xq.get(codeId);
                if (list != null && !list.isEmpty()) {
                    boolean zEmc = emc(list);
                    if (list.isEmpty()) {
                        list.size();
                        emc(codeId, (String) null);
                        return null;
                    }
                    if (zEmc) {
                        emc(codeId, list);
                    }
                    List<com.bytedance.sdk.openadsdk.component.bw.ypw> listEmc = emc(list, adSlot, list2);
                    if (listEmc != null && !listEmc.isEmpty()) {
                        Collections.sort(listEmc, com.bytedance.sdk.openadsdk.component.bw.ypw.emc);
                        com.bytedance.sdk.openadsdk.component.bw.ypw ypwVar = listEmc.get(0);
                        if (com.bytedance.sdk.openadsdk.component.uym.emc.emc(adSlot) && list2 != null) {
                            if (list2.size() >= list.size()) {
                                return null;
                            }
                            list2.add(ypwVar.ycc());
                        }
                        return ypwVar;
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    private void emc(AdSlot adSlot, String str) {
        if (adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        boolean z10 = adSlot.getCacheScene() != 0;
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId) || z10 || !com.bytedance.sdk.openadsdk.component.uym.emc.emc(adSlot)) {
            return;
        }
        List<String> arrayList = this.xq.get(codeId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        this.xq.put(codeId, arrayList);
    }

    private boolean emc(List<com.bytedance.sdk.openadsdk.component.bw.ypw> list) {
        boolean z10 = false;
        if (list != null && !list.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<com.bytedance.sdk.openadsdk.component.bw.ypw> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.bw.ypw next = it.next();
                if (next != null && jCurrentTimeMillis > next.xq()) {
                    com.bytedance.sdk.openadsdk.component.ycc.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).emc(next.ypw());
                    it.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    private boolean emc(List<com.bytedance.sdk.openadsdk.component.bw.ypw> list, AdSlot adSlot) {
        if (list != null && !list.isEmpty() && adSlot != null) {
            long jZz = com.bytedance.sdk.openadsdk.component.uym.emc.zz();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<com.bytedance.sdk.openadsdk.component.bw.ypw> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.bw.ypw next = it.next();
                if (next != null && jCurrentTimeMillis - next.dg() > jZz) {
                    it.remove();
                    com.bytedance.sdk.openadsdk.component.dg.emc.emc(next.ypw(), list.size(), adSlot.getCacheScene(), true);
                    return true;
                }
            }
        }
        return false;
    }

    private List<com.bytedance.sdk.openadsdk.component.bw.ypw> emc(List<com.bytedance.sdk.openadsdk.component.bw.ypw> list, AdSlot adSlot, List<String> list2) {
        if (adSlot == null || list == null || list.isEmpty() || list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.component.bw.ypw ypwVar : list) {
            if (ypwVar != null) {
                if (com.bytedance.sdk.openadsdk.component.uym.emc.emc(adSlot) && list2.contains(ypwVar.ycc())) {
                    adSlot.getCodeId();
                    ypwVar.ycc();
                } else {
                    arrayList.add(ypwVar);
                }
            }
        }
        return arrayList;
    }

    public void emc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.dg) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.ypw.remove(str);
                    xq(str);
                    return;
                }
                List<com.bytedance.sdk.openadsdk.component.bw.ypw> list = this.ypw.get(str);
                if (list != null && !list.isEmpty()) {
                    Iterator<com.bytedance.sdk.openadsdk.component.bw.ypw> it = list.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.openadsdk.component.bw.ypw next = it.next();
                        if (next != null && str2.equals(next.ycc())) {
                            list.size();
                            it.remove();
                        }
                    }
                    if (list.isEmpty()) {
                        list.size();
                        this.ypw.remove(str);
                        xq(str);
                    } else if (list.size() < com.bytedance.sdk.openadsdk.component.uym.emc.msw()) {
                        list.size();
                        emc(str, list);
                    }
                    List<String> list2 = this.xq.get(str);
                    if (list2 != null && !list2.isEmpty()) {
                        if (TextUtils.isEmpty(str2)) {
                            this.xq.remove(str);
                        } else {
                            list2.remove(str2);
                            if (list2.isEmpty()) {
                                this.xq.remove(str);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
