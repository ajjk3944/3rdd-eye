package com.bytedance.sdk.component.adexpress.dynamic.bw;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.ypw.sz;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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

        public xq(float f10, float f11) {
            this.emc = f10;
            this.ypw = f11;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bw.ypw$ypw, reason: collision with other inner class name */
    public static class C0107ypw {
        float bw;
        double dg;
        float emc;
        int xq;
        int ypw;

        public static JSONObject emc(C0107ypw c0107ypw) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_SIZE, c0107ypw.emc);
                jSONObject.put("letterSpacing", c0107ypw.ypw);
                jSONObject.put("lineHeight", c0107ypw.dg);
                jSONObject.put("maxWidth", c0107ypw.bw);
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_WEIGHT, c0107ypw.xq);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public ypw(double d10, int i10, double d11, String str, sz szVar) {
        this.bw = d10;
        this.ycc = i10;
        this.uym = d11;
        this.msw = str;
        this.zz = szVar;
    }

    private xq bw(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f10, float f11) {
        String str = mswVar.xq() + "_" + f10 + "_" + f11;
        if (this.xq.containsKey(str)) {
            return this.xq.get(str);
        }
        xq xqVarYcc = ycc(mswVar, f10, f11);
        this.xq.put(str, xqVarYcc);
        return xqVarYcc;
    }

    private xq ycc(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f10, float f11) {
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
        C0107ypw c0107ypw = new C0107ypw();
        c0107ypw.emc = fSba;
        c0107ypw.ypw = iBut;
        c0107ypw.xq = iFfd;
        c0107ypw.dg = dWad;
        c0107ypw.bw = f10;
        return emc(mswVar.ru().xq(), c0107ypw, zXxg, zNdl, iYz, mswVar);
    }

    public xq dg(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f10, float f11) {
        float fMin;
        float f12;
        float f13;
        xq xqVar = new xq();
        float f14 = 0.0f;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            xqVar.emc = 0.0f;
            xqVar.ypw = 0.0f;
            return xqVar;
        }
        if (mswVar.sba()) {
            return emc(mswVar, f10, f11);
        }
        float fMsw = mswVar.msw();
        float fZz = mswVar.zz();
        float fCf = mswVar.cf();
        float fVk = mswVar.vk();
        com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw = mswVar.ru().bw();
        String strSf = yccVarBw.sf();
        String strSb = yccVarBw.sb();
        float fMin2 = ((TextUtils.equals(strSf, "flex") || TextUtils.equals(strSf, "auto")) ? f10 : Math.min(fMsw, f10)) - fCf;
        if (TextUtils.equals(strSb, "scale")) {
            fMin = Math.round(fMin2 / fZz) + fVk;
            if (fMin > f11) {
                fMin2 = Math.round((f11 - fVk) * fZz);
            }
        } else {
            fMin = (TextUtils.equals(strSb, "auto") || TextUtils.equals(strSb, "flex")) ? f11 : Math.min(fZz, f11);
        }
        float f15 = fMin - fVk;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> listAa = mswVar.aa();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list : listAa) {
            float f16 = f14;
            float f17 = fCf;
            xq xqVarYpw = ypw(list, fMin2, f15);
            if (ypw(list)) {
                f13 = f16 + 1.0f;
            } else {
                fMax = Math.max(fMax, xqVarYpw.emc);
                f13 = f16;
            }
            float f18 = f13;
            float f19 = fMin2;
            fMax2 = mswVar.ru().ypw().equals("carousel") ? Math.max(mswVar.zz(), xqVarYpw.ypw) : fMax2 + xqVarYpw.ypw;
            fCf = f17;
            f14 = f18;
            fMin2 = f19;
        }
        float f20 = f14;
        float f21 = fMin2;
        float f22 = fCf;
        if (!TextUtils.equals(strSf, "auto")) {
            f12 = f21;
        } else if (f20 == listAa.size()) {
            f12 = f10;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list2 : listAa) {
                xq(list2);
                ypw(list2, fMax, f15);
            }
            f12 = fMax;
        }
        if (TextUtils.equals(strSb, "auto")) {
            if (fMax2 <= f11) {
                f15 = fMax2;
            } else {
                emc(listAa, f12, f15);
            }
        } else if ((TextUtils.equals(strSb, "fixed") || TextUtils.equals(strSb, "flex")) && f15 < fMax2) {
            emc(listAa, f12, f15);
        }
        xqVar.emc = Math.min(f12 + f22, f10);
        xqVar.ypw = Math.min(f15 + fVk, f11);
        return xqVar;
    }

    public xq emc(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f10, float f11) {
        float f12;
        if (TextUtils.isEmpty(mswVar.ru().xq()) && mswVar.ru().bw().jp() == null) {
            return new xq(0.0f, 0.0f);
        }
        if (TextUtils.equals(mswVar.ru().ypw(), "creative-playable-bait")) {
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
            f10 = Math.min(fMsw, f10);
            if (TextUtils.equals(strSb, "auto")) {
                f12 = ypw(mswVar, f10 - fCf, f11 - fVk).ypw;
                fZz = f12 + fVk;
            }
        } else if (TextUtils.equals(strSf, "auto")) {
            xq xqVarYpw = ypw(mswVar, f10 - fCf, f11 - fVk);
            f10 = xqVarYpw.emc + fCf;
            if (TextUtils.equals(strSb, "auto")) {
                f12 = xqVarYpw.ypw;
                fZz = f12 + fVk;
            }
        } else if (!TextUtils.equals(strSf, "flex")) {
            f10 = fMsw;
        } else if (TextUtils.equals(strSb, "auto")) {
            f12 = ypw(mswVar, f10 - fCf, f11 - fVk).ypw;
            fZz = f12 + fVk;
        }
        if (TextUtils.equals(strSb, "scale")) {
            float fRound = Math.round((f10 - fSz) / fZz) + fQh;
            if (fRound > f11) {
                f10 = Math.round((f11 - fQh) * fZz) + fSz;
            } else {
                f11 = fRound;
            }
        } else if (TextUtils.equals(strSb, "fixed")) {
            f11 = Math.min(fZz + fQh, f11);
        } else if (!TextUtils.equals(strSb, "flex")) {
            f11 = fZz;
        }
        xq xqVar = new xq();
        xqVar.emc = f10;
        xqVar.ypw = f11;
        return xqVar;
    }

    public xq xq(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f10, float f11) {
        if (mswVar == null) {
            return null;
        }
        xq xqVarEmc = emc(mswVar);
        if (xqVarEmc != null && (xqVarEmc.emc != 0.0f || xqVarEmc.ypw != 0.0f)) {
            return xqVarEmc;
        }
        xq xqVarDg = dg(mswVar, f10, f11);
        emc(mswVar, xqVarDg);
        return xqVarDg;
    }

    public xq ypw(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, float f10, float f11) {
        xq xqVar = new xq();
        if (mswVar.ru().bw() == null) {
            return xqVar;
        }
        xq xqVarBw = bw(mswVar, f10, f11);
        float f12 = xqVarBw.emc;
        float f13 = xqVarBw.ypw;
        xqVar.emc = Math.min(f12, f10);
        xqVar.ypw = Math.min(f13, f11);
        return xqVar;
    }

    private xq xq(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list, float f10, float f11) {
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            xq((com.bytedance.sdk.component.adexpress.dynamic.dg.msw) obj, f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return xqVar;
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            arrayList3.add(Float.valueOf(xq((com.bytedance.sdk.component.adexpress.dynamic.dg.msw) obj2, f10, f11).emc));
        }
        List<emc> arrayList4 = new ArrayList<>();
        int i12 = 0;
        while (true) {
            if (i12 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar2 = (com.bytedance.sdk.component.adexpress.dynamic.dg.msw) arrayList2.get(i12);
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
                fMsw = ((Float) arrayList3.get(i12)).floatValue();
            }
            emcVar.emc = fMsw;
            emcVar.ypw = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i12)).floatValue();
            }
            emcVar.xq = fMax;
            arrayList4.add(emcVar);
            i12++;
        }
        emc(arrayList4, f10, arrayList2);
        List<emc> listEmc = ru.emc(f10, arrayList4);
        float f12 = 0.0f;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            f12 += listEmc.get(i13).emc;
            if (((Float) arrayList3.get(i13)).floatValue() != listEmc.get(i13).emc) {
                dg((com.bytedance.sdk.component.adexpress.dynamic.dg.msw) arrayList2.get(i13));
            }
        }
        int size3 = arrayList2.size();
        int i14 = 0;
        boolean z10 = false;
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                break;
            }
            Object obj3 = arrayList2.get(i15);
            i15++;
            i14++;
            if (!ypw((com.bytedance.sdk.component.adexpress.dynamic.dg.msw) obj3)) {
                z10 = false;
                break;
            }
            if (i14 == arrayList2.size()) {
                z10 = true;
            }
        }
        fMax = z10 ? f11 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar3 = (com.bytedance.sdk.component.adexpress.dynamic.dg.msw) arrayList2.get(i16);
            xq xqVarXq = xq(mswVar3, listEmc.get(i16).emc, f11);
            if (!ypw(mswVar3)) {
                fMax = Math.max(fMax, xqVarXq.ypw);
            }
            arrayList5.add(xqVarXq);
        }
        ArrayList arrayList6 = new ArrayList();
        int size4 = arrayList5.size();
        int i17 = 0;
        while (i17 < size4) {
            Object obj4 = arrayList5.get(i17);
            i17++;
            arrayList6.add(Float.valueOf(((xq) obj4).ypw));
        }
        if (!z10) {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar4 = (com.bytedance.sdk.component.adexpress.dynamic.dg.msw) arrayList2.get(i18);
                if (ypw(mswVar4) && ((Float) arrayList6.get(i18)).floatValue() != fMax) {
                    dg(mswVar4);
                    xq(mswVar4, listEmc.get(i18).emc, fMax);
                }
            }
        }
        xqVar.emc = f12;
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
            boolean z10 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar : list) {
                if (TextUtils.equals(mswVar.ru().bw().sf(), "auto") && (listAa = mswVar.aa()) != null) {
                    int i10 = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list2 : listAa) {
                        i10++;
                        if (!ypw(list2)) {
                            break;
                        }
                        if (i10 == list2.size()) {
                            z10 = true;
                        }
                    }
                }
            }
            return z10;
        }
    }

    private String bw(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        return mswVar.xq();
    }

    private xq ypw(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list, float f10, float f11) {
        xq xqVarEmc = emc(list);
        if (xqVarEmc != null && (xqVarEmc.emc != 0.0f || xqVarEmc.ypw != 0.0f)) {
            return xqVarEmc;
        }
        xq xqVarXq = xq(list, f10, f11);
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

    private xq emc(String str, C0107ypw c0107ypw, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) throws JSONException {
        return gbl.emc(str, mswVar.ru().ypw(), C0107ypw.emc(c0107ypw).toString(), z10, z11, i10, mswVar, this.bw, this.ycc, this.uym, this.msw, this.zz);
    }

    private void emc(List<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (emc(it.next(), false)) {
                z10 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list2 : list) {
            emc emcVar = new emc();
            boolean zEmc = emc(list2, !z10);
            emcVar.emc = zEmc ? 1.0f : ypw(list2, f10, f11).ypw;
            emcVar.ypw = !zEmc;
            arrayList.add(emcVar);
        }
        List<emc> listEmc = ru.emc(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((emc) arrayList.get(i10)).emc != listEmc.get(i10).emc) {
                List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list3 = list.get(i10);
                xq(list3);
                ypw(list3, f10, listEmc.get(i10).emc);
            }
        }
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

    private String dg(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strXq = list.get(i10).xq();
            if (i10 < list.size() - 1) {
                sb.append(strXq);
                sb.append("-");
            } else {
                sb.append(strXq);
            }
        }
        return sb.toString();
    }

    private boolean emc(List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list, boolean z10) {
        for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw = mswVar.ru().bw();
            String strSb = yccVarBw.sb();
            if (TextUtils.equals(strSb, "flex") || (z10 && ((TextUtils.equals(yccVarBw.sf(), "flex") && TextUtils.equals(yccVarBw.sb(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.dg.bw.emc.get(mswVar.ru().ypw()).intValue() == 7) || TextUtils.equals(strSb, "flex")))) {
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

    private void emc(List<emc> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> list2) {
        float f11 = 0.0f;
        for (emc emcVar : list) {
            if (emcVar.ypw) {
                f11 += emcVar.emc;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).ypw && list2.get(i11).sra()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float fCeil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    emc emcVar2 = list.get(i12);
                    if (emcVar2.ypw && list2.get(i12).sra()) {
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
