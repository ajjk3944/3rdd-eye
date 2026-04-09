package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    private mwh bly;
    private double fkw;

    /* renamed from: le, reason: collision with root package name */
    private int f7243le;
    private String pno;
    private double ra;
    public Map<String, lh> ouw = new HashMap();
    public Map<String, lh> vt = new HashMap();

    /* renamed from: lh, reason: collision with root package name */
    public Map<String, lh> f7244lh = new HashMap();
    private double yu = Math.random();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh {
        float ouw;
        float vt;

        public lh() {
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UnitSize{width=");
            sb2.append(this.ouw);
            sb2.append(", height=");
            return c.k(sb2, this.vt, '}');
        }

        public lh(float f10, float f11) {
            this.ouw = f10;
            this.vt = f11;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements Cloneable {

        /* renamed from: lh, reason: collision with root package name */
        float f7245lh;
        float ouw;
        boolean vt;

        public final Object clone() {
            try {
                return (ouw) super.clone();
            } catch (CloneNotSupportedException e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.fkw.vt$vt, reason: collision with other inner class name */
    public static class C0041vt {
        float fkw;

        /* renamed from: lh, reason: collision with root package name */
        int f7246lh;
        float ouw;
        int vt;
        double yu;

        public static JSONObject ouw(C0041vt c0041vt) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0041vt.ouw);
                jSONObject.put("letterSpacing", c0041vt.vt);
                jSONObject.put("lineHeight", c0041vt.yu);
                jSONObject.put("maxWidth", c0041vt.fkw);
                jSONObject.put("fontWeight", c0041vt.f7246lh);
                return jSONObject;
            } catch (JSONException e2) {
                e2.printStackTrace();
                return jSONObject;
            }
        }
    }

    public vt(double d10, int i4, double d11, String str, mwh mwhVar) {
        this.fkw = d10;
        this.f7243le = i4;
        this.ra = d11;
        this.pno = str;
        this.bly = mwhVar;
    }

    private lh lh(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list, float f10, float f11) throws JSONException, NumberFormatException {
        float fMax;
        yu(list);
        lh lhVar = new lh();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = pnoVar.bly.f7280lh;
            int i4 = leVar.hun;
            if (i4 == 1 || i4 == 2) {
                arrayList.add(pnoVar);
            }
            int i10 = leVar.hun;
            if (i10 != 1 && i10 != 2) {
                arrayList2.add(pnoVar);
            }
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ouw((com.bytedance.sdk.component.adexpress.dynamic.yu.pno) obj, f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return lhVar;
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            arrayList3.add(Float.valueOf(ouw((com.bytedance.sdk.component.adexpress.dynamic.yu.pno) obj2, f10, f11).ouw));
        }
        ArrayList arrayList4 = new ArrayList();
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 = (com.bytedance.sdk.component.adexpress.dynamic.yu.pno) arrayList2.get(i13);
            String str = pnoVar2.bly.f7280lh.zih;
            float fFloatValue = pnoVar2.f7305le;
            boolean zEquals = TextUtils.equals(str, "flex");
            if (TextUtils.equals(str, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list2 = pnoVar2.ryl;
                if (list2 == null || list2.size() <= 0) {
                    zEquals = false;
                } else {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> it = list2.iterator();
                    while (it.hasNext()) {
                        if (vt(it.next())) {
                            zEquals = true;
                            break;
                        }
                    }
                    zEquals = false;
                }
            }
            ouw ouwVar = new ouw();
            if (!zEquals) {
                fFloatValue = ((Float) arrayList3.get(i13)).floatValue();
            }
            ouwVar.ouw = fFloatValue;
            ouwVar.vt = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i13)).floatValue();
            }
            ouwVar.f7245lh = fMax;
            arrayList4.add(ouwVar);
            i13++;
        }
        ouw(arrayList4, f10, arrayList2);
        List<ouw> listOuw = tlj.ouw(f10, arrayList4);
        float f12 = 0.0f;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            f12 += listOuw.get(i14).ouw;
            if (((Float) arrayList3.get(i14)).floatValue() != listOuw.get(i14).ouw) {
                yu((com.bytedance.sdk.component.adexpress.dynamic.yu.pno) arrayList2.get(i14));
            }
        }
        int size3 = arrayList2.size();
        int i15 = 0;
        boolean z3 = false;
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                break;
            }
            Object obj3 = arrayList2.get(i16);
            i16++;
            i15++;
            if (!vt((com.bytedance.sdk.component.adexpress.dynamic.yu.pno) obj3)) {
                z3 = false;
                break;
            }
            if (i15 == arrayList2.size()) {
                z3 = true;
            }
        }
        fMax = z3 ? f11 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar3 = (com.bytedance.sdk.component.adexpress.dynamic.yu.pno) arrayList2.get(i17);
            lh lhVarOuw = ouw(pnoVar3, listOuw.get(i17).ouw, f11);
            if (!vt(pnoVar3)) {
                fMax = Math.max(fMax, lhVarOuw.vt);
            }
            arrayList5.add(lhVarOuw);
        }
        ArrayList arrayList6 = new ArrayList();
        int size4 = arrayList5.size();
        int i18 = 0;
        while (i18 < size4) {
            Object obj4 = arrayList5.get(i18);
            i18++;
            arrayList6.add(Float.valueOf(((lh) obj4).vt));
        }
        if (!z3) {
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar4 = (com.bytedance.sdk.component.adexpress.dynamic.yu.pno) arrayList2.get(i19);
                if (vt(pnoVar4) && ((Float) arrayList6.get(i19)).floatValue() != fMax) {
                    yu(pnoVar4);
                    ouw(pnoVar4, listOuw.get(i19).ouw, fMax);
                }
            }
        }
        lhVar.ouw = f12;
        lhVar.vt = fMax;
        return lhVar;
    }

    private lh vt(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar, float f10, float f11) throws JSONException, NumberFormatException {
        lh lhVar;
        lh lhVarOuw;
        lh lhVar2 = new lh();
        if (pnoVar.bly.f7280lh == null) {
            return lhVar2;
        }
        String str = pnoVar.ouw + "_" + f10 + "_" + f11;
        if (this.f7244lh.containsKey(str)) {
            lhVarOuw = this.f7244lh.get(str);
            lhVar = lhVar2;
        } else {
            new lh();
            com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = pnoVar.bly.f7280lh;
            float f12 = leVar.pno;
            int i4 = leVar.ey;
            double d10 = leVar.osn;
            int i10 = leVar.jvy;
            boolean z3 = leVar.uq;
            boolean z10 = leVar.fqk;
            int i11 = leVar.f7291pd;
            C0041vt c0041vt = new C0041vt();
            c0041vt.ouw = f12;
            c0041vt.vt = i4;
            c0041vt.f7246lh = i10;
            c0041vt.yu = d10;
            c0041vt.fkw = f10;
            lhVar = lhVar2;
            lhVarOuw = cf.ouw(pnoVar.bly.vt, pnoVar.bly.ouw, C0041vt.ouw(c0041vt).toString(), z3, z10, i11, pnoVar, this.fkw, this.f7243le, this.ra, this.bly);
            this.f7244lh.put(str, lhVarOuw);
        }
        float f13 = lhVarOuw.ouw;
        float f14 = lhVarOuw.vt;
        lh lhVar3 = lhVar;
        lhVar3.ouw = Math.min(f13, f10);
        lhVar3.vt = Math.min(f14, f11);
        return lhVar3;
    }

    private static String yu(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = list.get(i4).ouw;
            if (i4 < list.size() - 1) {
                sb2.append(str);
                sb2.append("-");
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.sdk.component.adexpress.dynamic.fkw.vt.lh ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.pno r23, float r24, float r25) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.fkw.vt.ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.pno, float, float):com.bytedance.sdk.component.adexpress.dynamic.fkw.vt$lh");
    }

    private void yu(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        this.ouw.remove(pnoVar.ouw);
        List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list = pnoVar.ryl;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> it = list.iterator();
        while (it.hasNext()) {
            lh(it.next());
        }
    }

    private boolean vt(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list2;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().bly.f7280lh.zih, "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z3 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar : list) {
                if (TextUtils.equals(pnoVar.bly.f7280lh.zih, "auto") && (list2 = pnoVar.ryl) != null) {
                    int i4 = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list3 : list2) {
                        i4++;
                        if (!vt(list3)) {
                            break;
                        }
                        if (i4 == list3.size()) {
                            z3 = true;
                        }
                    }
                }
            }
            return z3;
        }
    }

    private lh vt(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list, float f10, float f11) {
        lh lhVarOuw = ouw(list);
        if (lhVarOuw != null && (lhVarOuw.ouw != 0.0f || lhVarOuw.vt != 0.0f)) {
            return lhVarOuw;
        }
        lh lhVarLh = lh(list, f10, f11);
        ouw(list, lhVarLh);
        return lhVarLh;
    }

    private boolean vt(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        if (pnoVar == null) {
            return false;
        }
        if (TextUtils.equals(pnoVar.bly.f7280lh.rn, "flex")) {
            return true;
        }
        return lh(pnoVar);
    }

    private boolean lh(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list;
        if (!pnoVar.fkw() && TextUtils.equals(pnoVar.bly.f7280lh.rn, "auto") && (list = pnoVar.ryl) != null && list.size() > 0) {
            if (list.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = list.get(0).iterator();
                while (it.hasNext()) {
                    if (!vt(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> it2 = list.iterator();
            while (it2.hasNext()) {
                if (ouw(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void lh(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.vt.remove(yu(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = list.iterator();
        while (it.hasNext()) {
            yu(it.next());
        }
    }

    private void ouw(List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> it = list.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (ouw(it.next(), false)) {
                z3 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list2 : list) {
            ouw ouwVar = new ouw();
            boolean zOuw = ouw(list2, !z3);
            ouwVar.ouw = zOuw ? 1.0f : vt(list2, f10, f11).vt;
            ouwVar.vt = !zOuw;
            arrayList.add(ouwVar);
        }
        List<ouw> listOuw = tlj.ouw(f11, arrayList);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (((ouw) arrayList.get(i4)).ouw != listOuw.get(i4).ouw) {
                List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list3 = list.get(i4);
                lh(list3);
                vt(list3, f10, listOuw.get(i4).ouw);
            }
        }
    }

    private boolean ouw(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list, boolean z3) {
        for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = pnoVar.bly.f7280lh;
            String str = leVar.rn;
            if (TextUtils.equals(str, "flex") || (z3 && ((TextUtils.equals(leVar.zih, "flex") && TextUtils.equals(leVar.rn, "scale") && com.bytedance.sdk.component.adexpress.dynamic.yu.fkw.f7279le.get(pnoVar.bly.ouw).intValue() == 7) || TextUtils.equals(str, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = list.iterator();
        while (it.hasNext()) {
            if (lh(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static void ouw(List<ouw> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list2) {
        float f11 = 0.0f;
        for (ouw ouwVar : list) {
            if (ouwVar.vt) {
                f11 += ouwVar.ouw;
            }
        }
        if (f11 > f10) {
            int i4 = 0;
            for (int i10 = 0; i10 < list2.size(); i10++) {
                if (list.get(i10).vt && list2.get(i10).ra()) {
                    i4++;
                }
            }
            if (i4 > 0) {
                float fCeil = (float) (Math.ceil(((f11 - f10) / i4) * 1000.0f) / 1000.0d);
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    ouw ouwVar2 = list.get(i11);
                    if (ouwVar2.vt && list2.get(i11).ra()) {
                        ouwVar2.ouw -= fCeil;
                    }
                }
            }
        }
    }

    public final void ouw() {
        this.f7244lh.clear();
        this.ouw.clear();
        this.vt.clear();
    }

    public final lh ouw(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list) {
        return this.vt.get(yu(list));
    }

    private void ouw(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list, lh lhVar) {
        this.vt.put(yu(list), lhVar);
    }

    public final lh ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        return this.ouw.get(pnoVar.ouw);
    }
}
