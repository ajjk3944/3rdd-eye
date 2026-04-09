package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.ra;
import com.bytedance.adsdk.ugeno.vt.ouw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl {
    private pno bly;

    /* renamed from: cf, reason: collision with root package name */
    private vm f6859cf;
    public fkw fkw;

    /* renamed from: jg, reason: collision with root package name */
    private cf f6860jg;

    /* renamed from: le, reason: collision with root package name */
    private Context f6861le;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f6862lh;
    private String mwh;
    public rn ouw;
    private com.bytedance.adsdk.ugeno.vt.lh<View> pno;
    private bly qbp;
    private JSONObject ra;
    private ra ryl;

    /* renamed from: th, reason: collision with root package name */
    private float f6863th;
    private ko tlj;
    private float vm;
    public com.bytedance.adsdk.ugeno.yu.mwh vt;
    public List<String> yu;
    private com.bytedance.adsdk.ugeno.yu.ouw.ouw zih;
    private boolean ko = true;
    private boolean rn = false;

    public ryl(Context context) {
        this.f6861le = context;
    }

    private com.bytedance.adsdk.ugeno.vt.lh<View> vt(ra.ouw ouwVar, com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
        ouw.C0036ouw c0036ouwBly;
        List<ra.ouw> listVt;
        if (!ra.ouw(ouwVar)) {
            return null;
        }
        String str = ouwVar.vt;
        vt vtVarOuw = yu.ouw(str);
        vt vtVar = vtVarOuw;
        if (vtVarOuw == null) {
            this.f6862lh = true;
            if (this.yu == null) {
                this.yu = new ArrayList();
            }
            this.yu.add(str);
            str = "View";
            ouwVar.vt = "View";
            vt vtVarOuw2 = yu.ouw("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            vtVar = vtVarOuw2;
            if (vtVarOuw2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat("View"));
                return null;
            }
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarOuw = vtVar.ouw(this.f6861le);
        if (lhVarOuw == null) {
            return null;
        }
        JSONObject jSONObject = ouwVar.f6858lh;
        lhVarOuw.bly(com.bytedance.adsdk.ugeno.lh.vt.ouw(ouwVar.ouw, this.ra));
        lhVarOuw.tlj(str);
        lhVarOuw.lh(jSONObject);
        lhVarOuw.ouw(ouwVar);
        lhVarOuw.vt(this.ra);
        ra raVar = this.ryl;
        if (raVar == null) {
            lhVarOuw.ouw(true);
        } else {
            lhVarOuw.ouw(raVar.vt);
        }
        lhVarOuw.bly = this.f6860jg;
        lhVarOuw.lgp = this.zih;
        Iterator<String> itKeys = jSONObject.keys();
        if (lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            com.bytedance.adsdk.ugeno.vt.ouw ouwVar2 = (com.bytedance.adsdk.ugeno.vt.ouw) lhVar;
            c0036ouwBly = ouwVar2.bly();
            lhVarOuw.ouw(ouwVar2);
        } else {
            c0036ouwBly = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString(next), this.ra);
            lhVarOuw.ouw(next, strOuw);
            if (this.qbp != null && !TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOuw) && ((TextUtils.equals(next, "src") || TextUtils.equals(next, "backgroundImage")) && strOuw.startsWith("http"))) {
                throw null;
            }
            if (c0036ouwBly != null) {
                c0036ouwBly.ouw(this.f6861le, next, strOuw);
            }
        }
        if (c0036ouwBly != null) {
            lhVarOuw.ouw(c0036ouwBly.ouw());
        }
        if (lhVarOuw instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            LinkedList<ra.ouw> linkedList = ouwVar.fkw;
            if (linkedList == null || linkedList.size() <= 0) {
                if (TextUtils.equals(lhVarOuw.jae(), "RecyclerLayout") && (listVt = this.ryl.vt()) != null && listVt.size() > 0) {
                    Iterator<ra.ouw> it = listVt.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.vt.lh<View> lhVarVt = vt(it.next(), lhVarOuw);
                        if (lhVarVt != null && lhVarVt.uq()) {
                            ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarVt);
                        }
                    }
                }
                return lhVarOuw;
            }
            if (TextUtils.equals(lhVarOuw.jae(), "Swiper") && linkedList.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            try {
                Collections.sort(linkedList, new Comparator<ra.ouw>() { // from class: com.bytedance.adsdk.ugeno.core.ryl.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(ra.ouw ouwVar3, ra.ouw ouwVar4) {
                        return ouwVar3.f6858lh.optInt("order", 0) - ouwVar4.f6858lh.optInt("order", 0);
                    }
                });
            } catch (Throwable unused) {
            }
            Iterator<ra.ouw> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.vt.lh<View> lhVarVt2 = vt(it2.next(), lhVarOuw);
                if (lhVarVt2 != null && !lhVarVt2.xn) {
                    ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarVt2, lhVarVt2.vpp());
                }
            }
        }
        this.pno = lhVarOuw;
        return lhVarOuw;
    }

    public final void ouw(String str, cf cfVar) {
        this.f6860jg = cfVar;
        this.mwh = str;
        if (cfVar != null) {
            this.ra = cfVar.f6844lh;
        }
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        this.ra = jSONObject2;
        vm vmVar = this.f6859cf;
        if (vmVar != null) {
            vmVar.ouw();
        }
        ra raVar = new ra(jSONObject, jSONObject2, jSONObject3);
        this.ryl = raVar;
        float f10 = this.vm;
        float f11 = this.f6863th;
        raVar.f6856lh = f10;
        raVar.yu = f11;
        this.zih = new com.bytedance.adsdk.ugeno.yu.ouw.ouw();
        if (!(this.tlj instanceof com.bytedance.adsdk.ugeno.core.ouw.vt)) {
            this.pno = vt(this.ryl.ouw(), null);
            if (this.qbp == null) {
                vm vmVar2 = this.f6859cf;
                if (vmVar2 != null) {
                    vmVar2.vt();
                    com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.pno;
                    vm vmVar3 = this.f6859cf;
                    lhVar.ixm = vmVar3;
                    vmVar3.lh();
                }
                ouw(this.pno);
                if (this.f6859cf != null) {
                    zih zihVar = new zih();
                    zihVar.ouw = 0;
                    zihVar.f6876lh = this.pno;
                    this.f6859cf.ouw(zihVar);
                }
                return this.pno;
            }
            throw null;
        }
        throw null;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(ra.ouw ouwVar, JSONObject jSONObject) throws JSONException {
        this.ra = jSONObject;
        vm vmVar = this.f6859cf;
        if (vmVar != null) {
            vmVar.ouw();
        }
        this.zih = new com.bytedance.adsdk.ugeno.yu.ouw.ouw();
        if (!(this.tlj instanceof com.bytedance.adsdk.ugeno.core.ouw.vt)) {
            this.pno = vt(ouwVar, null);
            vm vmVar2 = this.f6859cf;
            if (vmVar2 != null) {
                vmVar2.vt();
                this.pno.ixm = this.f6859cf;
            }
            ouw(this.pno);
            return this.pno;
        }
        throw null;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(JSONObject jSONObject) {
        vm vmVar = this.f6859cf;
        if (vmVar != null) {
            vmVar.ouw();
        }
        ra raVar = new ra(jSONObject, this.ra);
        this.ryl = raVar;
        if (!(this.tlj instanceof com.bytedance.adsdk.ugeno.core.ouw.vt)) {
            this.pno = ouw(raVar.ouw(), (com.bytedance.adsdk.ugeno.vt.lh<View>) null);
            vm vmVar2 = this.f6859cf;
            if (vmVar2 != null) {
                vmVar2.vt();
                this.pno.ixm = this.f6859cf;
            }
            return this.pno;
        }
        throw null;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh<View> ouw(ra.ouw ouwVar, com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
        List<ra.ouw> listVt;
        ouw.C0036ouw c0036ouwBly = null;
        if (!ra.ouw(ouwVar)) {
            return null;
        }
        String str = ouwVar.vt;
        vt vtVarOuw = yu.ouw(str);
        if (vtVarOuw == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(str)));
            this.f6862lh = true;
            if (this.yu == null) {
                this.yu = new ArrayList();
            }
            this.yu.add(str);
            return null;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarOuw = vtVarOuw.ouw(this.f6861le);
        if (lhVarOuw == null) {
            return null;
        }
        lhVarOuw.bly(com.bytedance.adsdk.ugeno.lh.vt.ouw(ouwVar.ouw, this.ra));
        lhVarOuw.tlj(str);
        lhVarOuw.lh(ouwVar.f6858lh);
        lhVarOuw.ouw(ouwVar);
        lhVarOuw.bly = this.f6860jg;
        if (lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            com.bytedance.adsdk.ugeno.vt.ouw ouwVar2 = (com.bytedance.adsdk.ugeno.vt.ouw) lhVar;
            lhVarOuw.ouw(ouwVar2);
            c0036ouwBly = ouwVar2.bly();
        }
        Iterator<String> itKeys = ouwVar.f6858lh.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(ouwVar.f6858lh.optString(next), this.ra);
            lhVarOuw.ouw(next, strOuw);
            if (c0036ouwBly != null) {
                c0036ouwBly.ouw(this.f6861le, next, strOuw);
            }
        }
        if (lhVarOuw instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            LinkedList<ra.ouw> linkedList = ouwVar.fkw;
            if (linkedList != null && linkedList.size() > 0) {
                if (TextUtils.equals(lhVarOuw.jae(), "Swiper") && linkedList.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                Iterator<ra.ouw> it = linkedList.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw2 = ouw(it.next(), (com.bytedance.adsdk.ugeno.vt.lh<View>) lhVarOuw);
                    if (lhVarOuw2 != null && lhVarOuw2.uq()) {
                        ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarOuw2);
                    }
                }
            } else {
                if (TextUtils.equals(lhVarOuw.jae(), "RecyclerLayout") && (listVt = this.ryl.vt()) != null && listVt.size() > 0) {
                    Iterator<ra.ouw> it2 = listVt.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw3 = ouw(it2.next(), (com.bytedance.adsdk.ugeno.vt.lh<View>) lhVarOuw);
                        if (lhVarOuw3 != null && lhVarOuw3.uq()) {
                            ((com.bytedance.adsdk.ugeno.vt.ouw) lhVarOuw).ouw(lhVarOuw3);
                        }
                    }
                }
                return lhVarOuw;
            }
        }
        if (c0036ouwBly != null) {
            lhVarOuw.ouw(c0036ouwBly.ouw());
        }
        this.pno = lhVarOuw;
        return lhVarOuw;
    }

    public final void vt(JSONObject jSONObject) throws JSONException {
        vm vmVar = this.f6859cf;
        if (vmVar != null) {
            vmVar.lh();
        }
        this.ra = jSONObject;
        ouw(this.pno, jSONObject);
        ouw(this.pno);
        if (this.f6859cf != null) {
            zih zihVar = new zih();
            zihVar.ouw = 0;
            zihVar.f6876lh = this.pno;
            this.f6859cf.ouw(zihVar);
        }
    }

    private void vt(com.bytedance.adsdk.ugeno.vt.lh lhVar) throws JSONException {
        try {
            if (!lhVar.ex() || lhVar.jqy() == null || lhVar.jqy().yu == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", lhVar.jqy().yu);
            this.ra.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void vt(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        lhVar.vt(str, objArr);
        if (!(lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) || (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) == null || listPno.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
        while (it.hasNext()) {
            vt(it.next(), str, objArr);
        }
    }

    private void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) throws JSONException {
        if (lhVar == null) {
            return;
        }
        if (lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) {
            lhVar.ouw(jSONObject);
            List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno();
            if (listPno == null || listPno.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
            while (it.hasNext()) {
                ouw(it.next(), jSONObject);
            }
            return;
        }
        lhVar.ouw(jSONObject);
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) throws JSONException {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        JSONObject jSONObjectQbp = lhVar.qbp();
        Iterator<String> itKeys = jSONObjectQbp.keys();
        com.bytedance.adsdk.ugeno.vt.ouw ouwVarTc = lhVar.tc();
        ouw.C0036ouw c0036ouwBly = ouwVarTc != null ? ouwVarTc.bly() : null;
        vt(lhVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObjectQbp.optString(next), this.ra);
            lhVar.ouw(next, strOuw);
            if (c0036ouwBly != null) {
                c0036ouwBly.ouw(this.f6861le, next, strOuw);
            }
        }
        lhVar.ouw(this.bly);
        lhVar.ouw(this.tlj);
        lhVar.ouw(this.ouw);
        bly blyVar = this.qbp;
        if (blyVar != null) {
            lhVar.ms = blyVar;
        }
        fkw fkwVar = this.fkw;
        if (fkwVar != null) {
            lhVar.ouw(fkwVar);
        }
        com.bytedance.adsdk.ugeno.yu.mwh mwhVar = this.vt;
        if (mwhVar != null) {
            lhVar.ouw(mwhVar);
        }
        if ((lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) && (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) != null && listPno.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
            while (it.hasNext()) {
                ouw(it.next());
            }
        }
        if (c0036ouwBly != null) {
            lhVar.ouw(c0036ouwBly.ouw());
        }
        lhVar.vt();
    }

    public final void ouw(ko koVar) {
        com.bytedance.adsdk.ugeno.core.ouw.ouw ouwVar = com.bytedance.adsdk.ugeno.fkw.ouw().f6877le;
        if (ouwVar == null) {
            this.tlj = koVar;
        } else {
            if (ouwVar.ouw() == null) {
                this.tlj = koVar;
                return;
            }
            throw null;
        }
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(str, objArr);
        if (!(lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) || (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) == null || listPno.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
        while (it.hasNext()) {
            ouw(it.next(), str, objArr);
        }
    }

    public final void ouw(JSONObject jSONObject, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        List<com.bytedance.adsdk.ugeno.vt.lh<View>> listPno;
        if (lhVar == null) {
            return;
        }
        this.ra = jSONObject;
        lhVar.vt(jSONObject);
        lhVar.bly = this.f6860jg;
        ouw.C0036ouw c0036ouwBly = lhVar.tc() != null ? lhVar.tc().bly() : null;
        Iterator<String> itKeys = lhVar.qbp().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(lhVar.qbp().optString(next), jSONObject);
            lhVar.ouw(next, strOuw);
            if (c0036ouwBly != null) {
                c0036ouwBly.ouw(this.f6861le, next, strOuw);
            }
        }
        if ((lhVar instanceof com.bytedance.adsdk.ugeno.vt.ouw) && (listPno = ((com.bytedance.adsdk.ugeno.vt.ouw) lhVar).pno()) != null && !listPno.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.vt.lh<View>> it = listPno.iterator();
            while (it.hasNext()) {
                ouw(jSONObject, it.next());
            }
        }
        if (c0036ouwBly != null) {
            lhVar.ouw(c0036ouwBly.ouw());
        }
    }
}
