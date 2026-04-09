package com.bytedance.sdk.component.adexpress.dynamic.bw;

import A.f;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.ypw.sz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private double bw;
    private String msw;
    private double uym;
    private int ycc;
    private sz zz;
    public Map<String, xq> emc = new HashMap();
    public Map<String, xq> ypw = new HashMap();
    public Map<String, xq> xq = new HashMap();
    private double dg = Math.random();

    public static class emc implements Cloneable {
        float emc;
        float xq;
        boolean ypw;

        public Object clone() {
            try {
                return (emc) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    public static class xq {
        float emc;
        float ypw;

        public xq() {
        }

        public String toString() {
            return "UnitSize{width=" + this.emc + ", height=" + this.ypw + '}';
        }

        public xq(float f2, float f5) {
            this.emc = f2;
            this.ypw = f5;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bw.ypw$ypw, reason: collision with other inner class name */
    public static class C0022ypw {
        float bw;
        double dg;
        float emc;
        int xq;
        int ypw;

        public static JSONObject emc(C0022ypw c0022ypw) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0022ypw.emc);
                jSONObject.put("letterSpacing", c0022ypw.ypw);
                jSONObject.put("lineHeight", c0022ypw.dg);
                jSONObject.put("maxWidth", c0022ypw.bw);
                jSONObject.put("fontWeight", c0022ypw.xq);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public ypw(double d6, int i, double d7, String str, sz szVar) {
        this.bw = d6;
        this.ycc = i;
        this.uym = d7;
        this.msw = str;
        this.zz = szVar;
    }

    private xq bw(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f2, float f5) {
        String str = mswVar.xq() + "_" + f2 + "_" + f5;
        if (this.xq.containsKey(str)) {
            return this.xq.get(str);
        }
        xq xqVarYcc = ycc(mswVar, f2, f5);
        this.xq.put(str, xqVarYcc);
        return xqVarYcc;
    }

    private xq ycc(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f2, float f5) {
        new xq();
        com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw = mswVar.ru().bw();
        mswVar.ru().xq();
        yccVarBw.wd();
        float fSba = yccVarBw.sba();
        int iBut = yccVarBw.but();
        double dWad = yccVarBw.wad();
        int iFfd = yccVarBw.ffd();
        boolean zXxg = yccVarBw.xxg();
        boolean zNdl = yccVarBw.ndl();
        int iYz = yccVarBw.yz();
        C0022ypw c0022ypw = new C0022ypw();
        c0022ypw.emc = fSba;
        c0022ypw.ypw = iBut;
        c0022ypw.xq = iFfd;
        c0022ypw.dg = dWad;
        c0022ypw.bw = f2;
        return emc(mswVar.ru().xq(), c0022ypw, zXxg, zNdl, iYz, mswVar);
    }

    public xq dg(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f2, float f5) {
        float fMin;
        float f6;
        float f7;
        xq xqVar = new xq();
        float f8 = 0.0f;
        if (f5 <= 0.0f || f2 <= 0.0f) {
            xqVar.emc = 0.0f;
            xqVar.ypw = 0.0f;
            return xqVar;
        }
        if (mswVar.sba()) {
            return emc(mswVar, f2, f5);
        }
        float fMsw = mswVar.msw();
        float fZz = mswVar.zz();
        float fCf = mswVar.cf();
        float fVk = mswVar.vk();
        com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw = mswVar.ru().bw();
        String strSf = yccVarBw.sf();
        String strSb = yccVarBw.sb();
        float fMin2 = ((TextUtils.equals(strSf, "flex") || TextUtils.equals(strSf, "auto")) ? f2 : Math.min(fMsw, f2)) - fCf;
        if (TextUtils.equals(strSb, "scale")) {
            fMin = Math.round(fMin2 / fZz) + fVk;
            if (fMin > f5) {
                fMin2 = Math.round((f5 - fVk) * fZz);
            }
        } else {
            fMin = (TextUtils.equals(strSb, "auto") || TextUtils.equals(strSb, "flex")) ? f5 : Math.min(fZz, f5);
        }
        float f9 = fMin - fVk;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> listAa = mswVar.aa();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list : listAa) {
            float f10 = f8;
            float f11 = fCf;
            xq xqVarYpw = ypw(list, fMin2, f9);
            if (ypw(list)) {
                f7 = f10 + 1.0f;
            } else {
                fMax = Math.max(fMax, xqVarYpw.emc);
                f7 = f10;
            }
            float f12 = f7;
            float f13 = fMin2;
            fMax2 = mswVar.ru().ypw().equals("carousel") ? Math.max(mswVar.zz(), xqVarYpw.ypw) : fMax2 + xqVarYpw.ypw;
            fCf = f11;
            f8 = f12;
            fMin2 = f13;
        }
        float f14 = f8;
        float f15 = fMin2;
        float f16 = fCf;
        if (!TextUtils.equals(strSf, "auto")) {
            f6 = f15;
        } else if (f14 == listAa.size()) {
            f6 = f2;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list2 : listAa) {
                xq(list2);
                ypw(list2, fMax, f9);
            }
            f6 = fMax;
        }
        if (TextUtils.equals(strSb, "auto")) {
            if (fMax2 <= f5) {
                f9 = fMax2;
            } else {
                emc(listAa, f6, f9);
            }
        } else if ((TextUtils.equals(strSb, "fixed") || TextUtils.equals(strSb, "flex")) && f9 < fMax2) {
            emc(listAa, f6, f9);
        }
        xqVar.emc = Math.min(f6 + f16, f2);
        xqVar.ypw = Math.min(f9 + fVk, f5);
        return xqVar;
    }

    public xq emc(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f2, float f5) {
        float f6;
        if (TextUtils.isEmpty(mswVar.ru().xq()) && mswVar.ru().bw().jp() == null) {
            return new xq(0.0f, 0.0f);
        }
        if (f.x(mswVar, "creative-playable-bait")) {
            return new xq(0.0f, 0.0f);
        }
        float fMsw = mswVar.msw();
        float fZz = mswVar.zz();
        com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw = mswVar.ru().bw();
        String strSf = yccVarBw.sf();
        String strSb = yccVarBw.sb();
        float fSz = mswVar.sz();
        float fQh = mswVar.qh();
        float fCf = mswVar.cf();
        float fVk = mswVar.vk();
        if (TextUtils.equals(strSf, "fixed")) {
            f2 = Math.min(fMsw, f2);
            if (TextUtils.equals(strSb, "auto")) {
                f6 = ypw(mswVar, f2 - fCf, f5 - fVk).ypw;
                fZz = f6 + fVk;
            }
        } else if (TextUtils.equals(strSf, "auto")) {
            xq xqVarYpw = ypw(mswVar, f2 - fCf, f5 - fVk);
            f2 = xqVarYpw.emc + fCf;
            if (TextUtils.equals(strSb, "auto")) {
                f6 = xqVarYpw.ypw;
                fZz = f6 + fVk;
            }
        } else if (!TextUtils.equals(strSf, "flex")) {
            f2 = fMsw;
        } else if (TextUtils.equals(strSb, "auto")) {
            f6 = ypw(mswVar, f2 - fCf, f5 - fVk).ypw;
            fZz = f6 + fVk;
        }
        if (TextUtils.equals(strSb, "scale")) {
            float fRound = Math.round((f2 - fSz) / fZz) + fQh;
            if (fRound > f5) {
                f2 = Math.round((f5 - fQh) * fZz) + fSz;
            } else {
                f5 = fRound;
            }
        } else if (TextUtils.equals(strSb, "fixed")) {
            f5 = Math.min(fZz + fQh, f5);
        } else if (!TextUtils.equals(strSb, "flex")) {
            f5 = fZz;
        }
        xq xqVar = new xq();
        xqVar.emc = f2;
        xqVar.ypw = f5;
        return xqVar;
    }

    public xq xq(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f2, float f5) {
        if (mswVar == null) {
            return null;
        }
        xq xqVarEmc = emc(mswVar);
        if (xqVarEmc != null && (xqVarEmc.emc != 0.0f || xqVarEmc.ypw != 0.0f)) {
            return xqVarEmc;
        }
        xq xqVarDg = dg(mswVar, f2, f5);
        emc(mswVar, xqVarDg);
        return xqVarDg;
    }

    public xq ypw(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f2, float f5) {
        xq xqVar = new xq();
        if (mswVar.ru().bw() == null) {
            return xqVar;
        }
        xq xqVarBw = bw(mswVar, f2, f5);
        float f6 = xqVarBw.emc;
        float f7 = xqVarBw.ypw;
        xqVar.emc = Math.min(f6, f2);
        xqVar.ypw = Math.min(f7, f5);
        return xqVar;
    }

    private xq xq(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list, float f2, float f5) {
        float fMax;
        dg(list);
        xq xqVar = new xq();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw = mswVar.ru().bw();
            if (yccVarBw.hj() == 1 || yccVarBw.hj() == 2) {
                arrayList.add(mswVar);
            }
            if (yccVarBw.hj() != 1 && yccVarBw.hj() != 2) {
                arrayList2.add(mswVar);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xq((com.bytedance.sdk.component.adexpress.dynamic.dg.msw) obj, f2, f5);
        }
        if (arrayList2.size() <= 0) {
            return xqVar;
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            arrayList3.add(Float.valueOf(xq((com.bytedance.sdk.component.adexpress.dynamic.dg.msw) obj2, f2, f5).emc));
        }
        ArrayList arrayList4 = new ArrayList();
        int i6 = 0;
        while (true) {
            if (i6 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar2 = (com.bytedance.sdk.component.adexpress.dynamic.dg.msw) arrayList2.get(i6);
            String strSf = mswVar2.ru().bw().sf();
            float fMsw = mswVar2.msw();
            boolean zEquals = TextUtils.equals(strSf, "flex");
            if (TextUtils.equals(strSf, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> listAa = mswVar2.aa();
                if (listAa == null || listAa.size() <= 0) {
                    zEquals = false;
                } else {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> it = listAa.iterator();
                    while (it.hasNext()) {
                        if (ypw(it.next())) {
                            zEquals = true;
                            break;
                        }
                    }
                    zEquals = false;
                }
            }
            emc emcVar = new emc();
            if (!zEquals) {
                fMsw = ((Float) arrayList3.get(i6)).floatValue();
            }
            emcVar.emc = fMsw;
            emcVar.ypw = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i6)).floatValue();
            }
            emcVar.xq = fMax;
            arrayList4.add(emcVar);
            i6++;
        }
        emc(arrayList4, f2, arrayList2);
        List<emc> listEmc = ru.emc(f2, arrayList4);
        float f6 = 0.0f;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            f6 += listEmc.get(i7).emc;
            if (((Float) arrayList3.get(i7)).floatValue() != listEmc.get(i7).emc) {
                dg((com.bytedance.sdk.component.adexpress.dynamic.dg.msw) arrayList2.get(i7));
            }
        }
        int size3 = arrayList2.size();
        int i8 = 0;
        boolean z6 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                break;
            }
            Object obj3 = arrayList2.get(i9);
            i9++;
            i8++;
            if (!ypw((com.bytedance.sdk.component.adexpress.dynamic.dg.msw) obj3)) {
                z6 = false;
                break;
            }
            if (i8 == arrayList2.size()) {
                z6 = true;
            }
        }
        fMax = z6 ? f5 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar3 = (com.bytedance.sdk.component.adexpress.dynamic.dg.msw) arrayList2.get(i10);
            xq xqVarXq = xq(mswVar3, listEmc.get(i10).emc, f5);
            if (!ypw(mswVar3)) {
                fMax = Math.max(fMax, xqVarXq.ypw);
            }
            arrayList5.add(xqVarXq);
        }
        ArrayList arrayList6 = new ArrayList();
        int size4 = arrayList5.size();
        int i11 = 0;
        while (i11 < size4) {
            Object obj4 = arrayList5.get(i11);
            i11++;
            arrayList6.add(Float.valueOf(((xq) obj4).ypw));
        }
        if (!z6) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar4 = (com.bytedance.sdk.component.adexpress.dynamic.dg.msw) arrayList2.get(i12);
                if (ypw(mswVar4) && ((Float) arrayList6.get(i12)).floatValue() != fMax) {
                    dg(mswVar4);
                    xq(mswVar4, listEmc.get(i12).emc, fMax);
                }
            }
        }
        xqVar.emc = f6;
        xqVar.ypw = fMax;
        return xqVar;
    }

    private boolean ypw(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> listAa;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().ru().bw().sf(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z6 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar : list) {
                if (TextUtils.equals(mswVar.ru().bw().sf(), "auto") && (listAa = mswVar.aa()) != null) {
                    int i = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list2 : listAa) {
                        i++;
                        if (!ypw(list2)) {
                            break;
                        }
                        if (i == list2.size()) {
                            z6 = true;
                        }
                    }
                }
            }
            return z6;
        }
    }

    private String bw(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        return mswVar.xq();
    }

    private xq ypw(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list, float f2, float f5) {
        xq xqVarEmc = emc(list);
        if (xqVarEmc != null && (xqVarEmc.emc != 0.0f || xqVarEmc.ypw != 0.0f)) {
            return xqVarEmc;
        }
        xq xqVarXq = xq(list, f2, f5);
        emc(list, xqVarXq);
        return xqVarXq;
    }

    private boolean ypw(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        if (mswVar == null) {
            return false;
        }
        if (TextUtils.equals(mswVar.ru().bw().sb(), "flex")) {
            return true;
        }
        return xq(mswVar);
    }

    private xq emc(String str, C0022ypw c0022ypw, boolean z6, boolean z7, int i, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) throws JSONException {
        return gbl.emc(str, mswVar.ru().ypw(), C0022ypw.emc(c0022ypw).toString(), z6, z7, i, mswVar, this.bw, this.ycc, this.uym, this.msw, this.zz);
    }

    private void dg(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        this.emc.remove(bw(mswVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> listAa = mswVar.aa();
        if (listAa == null || listAa.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> it = listAa.iterator();
        while (it.hasNext()) {
            xq(it.next());
        }
    }

    private void emc(List<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> list, float f2, float f5) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> it = list.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (emc(it.next(), false)) {
                z6 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list2 : list) {
            emc emcVar = new emc();
            boolean zEmc = emc(list2, !z6);
            emcVar.emc = zEmc ? 1.0f : ypw(list2, f2, f5).ypw;
            emcVar.ypw = !zEmc;
            arrayList.add(emcVar);
        }
        List<emc> listEmc = ru.emc(f5, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((emc) arrayList.get(i)).emc != listEmc.get(i).emc) {
                List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list3 = list.get(i);
                xq(list3);
                ypw(list3, f2, listEmc.get(i).emc);
            }
        }
    }

    private String dg(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String strXq = list.get(i).xq();
            if (i < list.size() - 1) {
                sb.append(strXq);
                sb.append("-");
            } else {
                sb.append(strXq);
            }
        }
        return sb.toString();
    }

    private boolean emc(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list, boolean z6) {
        for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw = mswVar.ru().bw();
            String strSb = yccVarBw.sb();
            if (TextUtils.equals(strSb, "flex") || (z6 && ((TextUtils.equals(yccVarBw.sf(), "flex") && TextUtils.equals(yccVarBw.sb(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.dg.bw.emc.get(mswVar.ru().ypw()).intValue() == 7) || TextUtils.equals(strSb, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> it = list.iterator();
        while (it.hasNext()) {
            if (xq(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean xq(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> listAa;
        if (!mswVar.sba() && TextUtils.equals(mswVar.ru().bw().sb(), "auto") && (listAa = mswVar.aa()) != null && listAa.size() > 0) {
            if (listAa.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> it = listAa.get(0).iterator();
                while (it.hasNext()) {
                    if (!ypw(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> it2 = listAa.iterator();
            while (it2.hasNext()) {
                if (emc(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void emc(List<emc> list, float f2, List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list2) {
        float f5 = 0.0f;
        for (emc emcVar : list) {
            if (emcVar.ypw) {
                f5 += emcVar.emc;
            }
        }
        if (f5 > f2) {
            int i = 0;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if (list.get(i3).ypw && list2.get(i3).sra()) {
                    i++;
                }
            }
            if (i > 0) {
                float fCeil = (float) (Math.ceil(((f5 - f2) / i) * 1000.0f) / 1000.0d);
                for (int i6 = 0; i6 < list2.size(); i6++) {
                    emc emcVar2 = list.get(i6);
                    if (emcVar2.ypw && list2.get(i6).sra()) {
                        emcVar2.emc -= fCeil;
                    }
                }
            }
        }
    }

    private void xq(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.ypw.remove(dg(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> it = list.iterator();
        while (it.hasNext()) {
            dg(it.next());
        }
    }

    public void emc() {
        this.xq.clear();
        this.emc.clear();
        this.ypw.clear();
    }

    public xq emc(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        return this.emc.get(bw(mswVar));
    }

    public xq emc(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list) {
        return this.ypw.get(dg(list));
    }

    private void emc(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, xq xqVar) {
        this.emc.put(bw(mswVar), xqVar);
    }

    private void emc(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list, xq xqVar) {
        this.ypw.put(dg(list), xqVar);
    }
}
