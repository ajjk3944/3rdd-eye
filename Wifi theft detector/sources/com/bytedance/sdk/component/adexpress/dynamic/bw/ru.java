package com.bytedance.sdk.component.adexpress.dynamic.bw;

import com.bytedance.sdk.component.adexpress.dynamic.bw.ypw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ru {
    public static float emc(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<ypw.emc> emc(float f10, List<ypw.emc> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ypw.emc> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((ypw.emc) it.next().clone());
        }
        int size = arrayList.size();
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ypw.emc emcVar = (ypw.emc) obj;
            if (emcVar.ypw) {
                i10 = (int) (i10 + emcVar.emc);
            } else {
                i11 = (int) (i11 + emcVar.emc);
                z10 = false;
            }
        }
        if (!z10 || f10 <= i10) {
            float f11 = i10;
            float f12 = f10 < f11 ? f10 / f11 : 1.0f;
            float f13 = f10 > f11 ? (f10 - f11) / i11 : 0.0f;
            if (f13 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                boolean z11 = false;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    ypw.emc emcVar2 = (ypw.emc) obj2;
                    if (!emcVar2.ypw) {
                        float f14 = emcVar2.xq;
                        if (f14 != 0.0f && emcVar2.emc * f13 > f14) {
                            emcVar2.emc = f14;
                            emcVar2.ypw = true;
                            z11 = true;
                        }
                    }
                    arrayList2.add(emcVar2);
                }
                if (z11) {
                    return emc(f10, arrayList2);
                }
            }
            int size3 = arrayList.size();
            int i14 = 0;
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList.get(i15);
                i15++;
                ypw.emc emcVar3 = (ypw.emc) obj3;
                if (emcVar3.ypw) {
                    emcVar3.emc = emc(emcVar3.emc * f12);
                } else {
                    emcVar3.emc = emc(emcVar3.emc * f13);
                }
                i14 = (int) (i14 + emcVar3.emc);
            }
            float f15 = i14;
            if (f15 < f10) {
                float f16 = f10 - f15;
                for (int size4 = 0; size4 < arrayList.size() && f16 > 0.0f; size4 = (size4 + 1) % arrayList.size()) {
                    ypw.emc emcVar4 = (ypw.emc) arrayList.get(size4);
                    if ((f10 < f11 && emcVar4.ypw) || (f10 > f11 && !emcVar4.ypw)) {
                        emcVar4.emc += 0.0625f;
                        f16 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
