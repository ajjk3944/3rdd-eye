package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.activity.o;
import com.bytedance.adsdk.ugeno.core.uym;
import com.bytedance.adsdk.ugeno.ypw.emc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sup {

    /* renamed from: aa, reason: collision with root package name */
    private bw f9208aa;
    private cf bw;
    private boolean cf;
    private msw dg;
    private Context emc;
    private gbl gbl;
    private com.bytedance.adsdk.ugeno.dg.sz msw;
    private com.bytedance.adsdk.ugeno.dg.emc.emc qh;
    private String ru;
    private float sba;
    private boolean sup = true;
    private boolean sz = false;
    private zz ul;
    private vk uym;
    private List<String> vk;
    private com.bytedance.adsdk.ugeno.ypw.xq<View> xq;
    private sba ycc;
    private JSONObject ypw;
    private float yzg;
    private uym zz;

    public sup(Context context) {
        this.emc = context;
    }

    public void emc(String str, gbl gblVar) {
        this.gbl = gblVar;
        this.ru = str;
        if (gblVar != null) {
            this.ypw = gblVar.emc();
        }
    }

    public com.bytedance.adsdk.ugeno.ypw.xq<View> ypw(uym.emc emcVar, com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar) {
        List<uym.emc> listXq;
        emc.C0102emc c0102emcRu = null;
        if (!uym.dg(emcVar)) {
            return null;
        }
        String strXq = emcVar.xq();
        ypw ypwVarEmc = dg.emc(strXq);
        if (ypwVarEmc == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(strXq)));
            this.cf = true;
            if (this.vk == null) {
                this.vk = new ArrayList();
            }
            this.vk.add(strXq);
            return null;
        }
        com.bytedance.adsdk.ugeno.ypw.xq xqVarEmc = ypwVarEmc.emc(this.emc);
        if (xqVarEmc == null) {
            return null;
        }
        xqVarEmc.zz(com.bytedance.adsdk.ugeno.xq.ypw.emc(emcVar.emc(), this.ypw));
        xqVarEmc.ru(strXq);
        xqVarEmc.xq(emcVar.dg());
        xqVarEmc.emc(emcVar);
        xqVarEmc.emc(this.gbl);
        if (xqVar instanceof com.bytedance.adsdk.ugeno.ypw.emc) {
            com.bytedance.adsdk.ugeno.ypw.emc emcVar2 = (com.bytedance.adsdk.ugeno.ypw.emc) xqVar;
            xqVarEmc.emc(emcVar2);
            c0102emcRu = emcVar2.ru();
        }
        Iterator<String> itKeys = emcVar.dg().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(emcVar.dg().optString(next), this.ypw);
            xqVarEmc.emc(next, strEmc);
            if (c0102emcRu != null) {
                c0102emcRu.emc(this.emc, next, strEmc);
            }
        }
        if (xqVarEmc instanceof com.bytedance.adsdk.ugeno.ypw.emc) {
            List<uym.emc> listBw = emcVar.bw();
            if (listBw == null || listBw.size() <= 0) {
                if (TextUtils.equals(xqVarEmc.mkp(), "RecyclerLayout") && (listXq = this.zz.xq()) != null && listXq.size() > 0) {
                    Iterator<uym.emc> it = listXq.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVarYpw = ypw(it.next(), (com.bytedance.adsdk.ugeno.ypw.xq<View>) xqVarEmc);
                        if (xqVarYpw != null && xqVarYpw.tp()) {
                            ((com.bytedance.adsdk.ugeno.ypw.emc) xqVarEmc).emc(xqVarYpw);
                        }
                    }
                }
                return xqVarEmc;
            }
            if (TextUtils.equals(xqVarEmc.mkp(), "Swiper") && listBw.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<uym.emc> it2 = listBw.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.ypw.xq<View> xqVarYpw2 = ypw(it2.next(), (com.bytedance.adsdk.ugeno.ypw.xq<View>) xqVarEmc);
                if (xqVarYpw2 != null && xqVarYpw2.tp()) {
                    ((com.bytedance.adsdk.ugeno.ypw.emc) xqVarEmc).emc(xqVarYpw2);
                }
            }
        }
        if (c0102emcRu != null) {
            xqVarEmc.emc(c0102emcRu.emc());
        }
        this.xq = xqVarEmc;
        return xqVarEmc;
    }

    public com.bytedance.adsdk.ugeno.ypw.xq<View> emc(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        this.ypw = jSONObject2;
        sba sbaVar = this.ycc;
        if (sbaVar != null) {
            sbaVar.emc();
        }
        uym uymVar = new uym(jSONObject, jSONObject2, jSONObject3);
        this.zz = uymVar;
        uymVar.emc(this.sba, this.yzg);
        this.qh = new com.bytedance.adsdk.ugeno.dg.emc.emc();
        if (!(this.bw instanceof com.bytedance.adsdk.ugeno.core.emc.ypw)) {
            this.xq = emc(this.zz.emc(), (com.bytedance.adsdk.ugeno.ypw.xq<View>) null);
            if (this.ul == null) {
                sba sbaVar2 = this.ycc;
                if (sbaVar2 != null) {
                    sbaVar2.ypw();
                    this.xq.emc(this.ycc);
                    this.ycc.xq();
                }
                emc(this.xq);
                if (this.ycc != null) {
                    aa aaVar = new aa();
                    aaVar.emc(0);
                    aaVar.emc(this.xq);
                    this.ycc.emc(aaVar);
                }
                return this.xq;
            }
            throw null;
        }
        this.zz.ypw();
        throw null;
    }

    public com.bytedance.adsdk.ugeno.ypw.xq<View> emc(uym.emc emcVar, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        this.ypw = jSONObject;
        sba sbaVar = this.ycc;
        if (sbaVar != null) {
            sbaVar.emc();
        }
        this.qh = new com.bytedance.adsdk.ugeno.dg.emc.emc();
        if (!(this.bw instanceof com.bytedance.adsdk.ugeno.core.emc.ypw)) {
            this.xq = emc(emcVar, (com.bytedance.adsdk.ugeno.ypw.xq<View>) null);
            sba sbaVar2 = this.ycc;
            if (sbaVar2 != null) {
                sbaVar2.ypw();
                this.xq.emc(this.ycc);
            }
            emc(this.xq);
            return this.xq;
        }
        throw null;
    }

    public com.bytedance.adsdk.ugeno.ypw.xq<View> emc(uym.emc emcVar, com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar) {
        emc.C0102emc c0102emcRu;
        List<uym.emc> listXq;
        if (!uym.dg(emcVar)) {
            return null;
        }
        String strXq = emcVar.xq();
        ypw ypwVarEmc = dg.emc(strXq);
        ypw ypwVar = ypwVarEmc;
        if (ypwVarEmc == null) {
            this.cf = true;
            if (this.vk == null) {
                this.vk = new ArrayList();
            }
            this.vk.add(strXq);
            strXq = "View";
            emcVar.emc("View");
            ypw ypwVarEmc2 = dg.emc("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            ypwVar = ypwVarEmc2;
            if (ypwVarEmc2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat("View"));
                return null;
            }
        }
        com.bytedance.adsdk.ugeno.ypw.xq xqVarEmc = ypwVar.emc(this.emc);
        if (xqVarEmc == null) {
            return null;
        }
        JSONObject jSONObjectDg = emcVar.dg();
        xqVarEmc.zz(com.bytedance.adsdk.ugeno.xq.ypw.emc(emcVar.emc(), this.ypw));
        xqVarEmc.ru(strXq);
        xqVarEmc.xq(jSONObjectDg);
        xqVarEmc.emc(emcVar);
        xqVarEmc.ypw(this.ypw);
        uym uymVar = this.zz;
        if (uymVar == null) {
            xqVarEmc.emc(true);
        } else {
            xqVarEmc.emc(uymVar.dg());
        }
        xqVarEmc.emc(this.gbl);
        xqVarEmc.emc(this.qh);
        Iterator<String> itKeys = jSONObjectDg.keys();
        if (xqVar instanceof com.bytedance.adsdk.ugeno.ypw.emc) {
            com.bytedance.adsdk.ugeno.ypw.emc emcVar2 = (com.bytedance.adsdk.ugeno.ypw.emc) xqVar;
            c0102emcRu = emcVar2.ru();
            xqVarEmc.emc(emcVar2);
        } else {
            c0102emcRu = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObjectDg.optString(next), this.ypw);
            xqVarEmc.emc(next, strEmc);
            if (this.ul != null) {
                throw null;
            }
            if (c0102emcRu != null) {
                c0102emcRu.emc(this.emc, next, strEmc);
            }
        }
        if (c0102emcRu != null) {
            xqVarEmc.emc(c0102emcRu.emc());
        }
        if (xqVarEmc instanceof com.bytedance.adsdk.ugeno.ypw.emc) {
            List<uym.emc> listBw = emcVar.bw();
            if (listBw != null && listBw.size() > 0) {
                if (TextUtils.equals(xqVarEmc.mkp(), "Swiper") && listBw.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                try {
                    Collections.sort(listBw, new Comparator<uym.emc>() { // from class: com.bytedance.adsdk.ugeno.core.sup.1
                        @Override // java.util.Comparator
                        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
                        public int compare(uym.emc emcVar3, uym.emc emcVar4) {
                            return emcVar3.dg().optInt("order", 0) - emcVar4.dg().optInt("order", 0);
                        }
                    });
                } catch (Throwable unused) {
                }
                Iterator<uym.emc> it = listBw.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.ypw.xq<View> xqVarEmc2 = emc(it.next(), (com.bytedance.adsdk.ugeno.ypw.xq<View>) xqVarEmc);
                    if (xqVarEmc2 != null && !xqVarEmc2.wad()) {
                        ((com.bytedance.adsdk.ugeno.ypw.emc) xqVarEmc).emc(xqVarEmc2, xqVarEmc2.dr());
                    }
                }
            } else {
                if (TextUtils.equals(xqVarEmc.mkp(), "RecyclerLayout") && (listXq = this.zz.xq()) != null && listXq.size() > 0) {
                    Iterator<uym.emc> it2 = listXq.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVarEmc3 = emc(it2.next(), (com.bytedance.adsdk.ugeno.ypw.xq<View>) xqVarEmc);
                        if (xqVarEmc3 != null && xqVarEmc3.tp()) {
                            ((com.bytedance.adsdk.ugeno.ypw.emc) xqVarEmc).emc(xqVarEmc3);
                        }
                    }
                }
                return xqVarEmc;
            }
        }
        this.xq = xqVarEmc;
        return xqVarEmc;
    }

    public void ypw(JSONObject jSONObject) throws JSONException {
        sba sbaVar = this.ycc;
        if (sbaVar != null) {
            sbaVar.xq();
        }
        this.ypw = jSONObject;
        emc(this.xq, jSONObject);
        emc(this.xq);
        if (this.ycc != null) {
            aa aaVar = new aa();
            aaVar.emc(0);
            aaVar.emc(this.xq);
            this.ycc.emc(aaVar);
        }
    }

    private void ypw(com.bytedance.adsdk.ugeno.ypw.xq xqVar) throws JSONException {
        try {
            if (!xqVar.lt() || xqVar.xmt() == null || xqVar.xmt().ycc() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", xqVar.xmt().ycc());
            this.ypw.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void ypw(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.ypw.xq<View>> listZz;
        if (xqVar == null) {
            return;
        }
        xqVar.ypw(str, objArr);
        if (!(xqVar instanceof com.bytedance.adsdk.ugeno.ypw.emc) || (listZz = ((com.bytedance.adsdk.ugeno.ypw.emc) xqVar).zz()) == null || listZz.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.ypw.xq<View>> it = listZz.iterator();
        while (it.hasNext()) {
            ypw(it.next(), str, objArr);
        }
    }

    public List<String> ypw() {
        return this.vk;
    }

    private void ypw(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        List<com.bytedance.adsdk.ugeno.ypw.xq<View>> listZz;
        if (xqVar == null) {
            return;
        }
        this.ypw = jSONObject;
        xqVar.ypw(jSONObject);
        xqVar.emc(this.gbl);
        emc.C0102emc c0102emcRu = o.a(xqVar.cuf()) ? xqVar.cuf().ru() : null;
        Iterator<String> itKeys = xqVar.db().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(xqVar.db().optString(next), jSONObject);
            xqVar.emc(next, strEmc);
            if (c0102emcRu != null) {
                c0102emcRu.emc(this.emc, next, strEmc);
            }
        }
        if ((xqVar instanceof com.bytedance.adsdk.ugeno.ypw.emc) && (listZz = ((com.bytedance.adsdk.ugeno.ypw.emc) xqVar).zz()) != null && !listZz.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.ypw.xq<View>> it = listZz.iterator();
            while (it.hasNext()) {
                ypw(jSONObject, it.next());
            }
        }
        if (c0102emcRu != null) {
            xqVar.emc(c0102emcRu.emc());
        }
    }

    public com.bytedance.adsdk.ugeno.ypw.xq<View> emc(JSONObject jSONObject) {
        sba sbaVar = this.ycc;
        if (sbaVar != null) {
            sbaVar.emc();
        }
        uym uymVar = new uym(jSONObject, this.ypw);
        this.zz = uymVar;
        if (!(this.bw instanceof com.bytedance.adsdk.ugeno.core.emc.ypw)) {
            this.xq = ypw(uymVar.emc(), (com.bytedance.adsdk.ugeno.ypw.xq<View>) null);
            sba sbaVar2 = this.ycc;
            if (sbaVar2 != null) {
                sbaVar2.ypw();
                this.xq.emc(this.ycc);
            }
            return this.xq;
        }
        uymVar.ypw();
        throw null;
    }

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, JSONObject jSONObject) throws JSONException {
        if (xqVar == null) {
            return;
        }
        if (xqVar instanceof com.bytedance.adsdk.ugeno.ypw.emc) {
            xqVar.emc(jSONObject);
            List<com.bytedance.adsdk.ugeno.ypw.xq<View>> listZz = ((com.bytedance.adsdk.ugeno.ypw.emc) xqVar).zz();
            if (listZz == null || listZz.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.ypw.xq<View>> it = listZz.iterator();
            while (it.hasNext()) {
                emc(it.next(), jSONObject);
            }
            return;
        }
        xqVar.emc(jSONObject);
    }

    private void emc(com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar) throws JSONException {
        List<com.bytedance.adsdk.ugeno.ypw.xq<View>> listZz;
        if (xqVar == null) {
            return;
        }
        JSONObject jSONObjectDb = xqVar.db();
        Iterator<String> itKeys = jSONObjectDb.keys();
        com.bytedance.adsdk.ugeno.ypw.emc emcVarCuf = xqVar.cuf();
        emc.C0102emc c0102emcRu = emcVarCuf != null ? emcVarCuf.ru() : null;
        ypw(xqVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObjectDb.optString(next), this.ypw);
            xqVar.emc(next, strEmc);
            if (c0102emcRu != null) {
                c0102emcRu.emc(this.emc, next, strEmc);
            }
        }
        xqVar.emc(this.dg);
        xqVar.emc(this.bw);
        xqVar.emc(this.uym);
        zz zzVar = this.ul;
        if (zzVar != null) {
            xqVar.emc(zzVar);
        }
        bw bwVar = this.f9208aa;
        if (bwVar != null) {
            xqVar.emc(bwVar);
        }
        com.bytedance.adsdk.ugeno.dg.sz szVar = this.msw;
        if (szVar != null) {
            xqVar.emc(szVar);
        }
        if ((xqVar instanceof com.bytedance.adsdk.ugeno.ypw.emc) && (listZz = ((com.bytedance.adsdk.ugeno.ypw.emc) xqVar).zz()) != null && listZz.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.ypw.xq<View>> it = listZz.iterator();
            while (it.hasNext()) {
                emc(it.next());
            }
        }
        if (c0102emcRu != null) {
            xqVar.emc(c0102emcRu.emc());
        }
        xqVar.ypw();
    }

    public void emc(cf cfVar) {
        com.bytedance.adsdk.ugeno.core.emc.emc emcVarBw = com.bytedance.adsdk.ugeno.bw.emc().bw();
        if (emcVarBw == null) {
            this.bw = cfVar;
        } else {
            if (emcVarBw.emc(cfVar) == null) {
                this.bw = cfVar;
                return;
            }
            throw null;
        }
    }

    public void emc(vk vkVar) {
        this.uym = vkVar;
    }

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.ypw.xq<View>> listZz;
        if (xqVar == null) {
            return;
        }
        xqVar.emc(str, objArr);
        if (!(xqVar instanceof com.bytedance.adsdk.ugeno.ypw.emc) || (listZz = ((com.bytedance.adsdk.ugeno.ypw.emc) xqVar).zz()) == null || listZz.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.ypw.xq<View>> it = listZz.iterator();
        while (it.hasNext()) {
            emc(it.next(), str, objArr);
        }
    }

    public boolean emc() {
        return this.cf;
    }

    public void emc(bw bwVar) {
        this.f9208aa = bwVar;
    }

    public void emc(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ypw.xq xqVar) throws JSONException {
        ypw(jSONObject, xqVar);
        emc((com.bytedance.adsdk.ugeno.ypw.xq<View>) xqVar);
    }

    public void emc(com.bytedance.adsdk.ugeno.dg.sz szVar) {
        this.msw = szVar;
    }
}
