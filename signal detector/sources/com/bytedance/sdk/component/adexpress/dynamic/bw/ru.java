package com.bytedance.sdk.component.adexpress.dynamic.bw;

import com.bytedance.sdk.component.adexpress.dynamic.bw.ypw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ru {
    public static float emc(float f2) {
        return (float) Math.ceil((f2 * 16.0f) / 16.0f);
    }

    public static List<ypw.emc> emc(float f2, List<ypw.emc> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ypw.emc> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((ypw.emc) it.next().clone());
        }
        int size = arrayList.size();
        boolean z6 = true;
        int i = 0;
        int i3 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ypw.emc emcVar = (ypw.emc) obj;
            if (emcVar.ypw) {
                i = (int) (i + emcVar.emc);
            } else {
                i3 = (int) (i3 + emcVar.emc);
                z6 = false;
            }
        }
        if (!z6 || f2 <= i) {
            float f5 = i;
            float f6 = f2 < f5 ? f2 / f5 : 1.0f;
            float f7 = f2 > f5 ? (f2 - f5) / i3 : 0.0f;
            if (f7 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                boolean z7 = false;
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    ypw.emc emcVar2 = (ypw.emc) obj2;
                    if (!emcVar2.ypw) {
                        float f8 = emcVar2.xq;
                        if (f8 != 0.0f && emcVar2.emc * f7 > f8) {
                            emcVar2.emc = f8;
                            emcVar2.ypw = true;
                            z7 = true;
                        }
                    }
                    arrayList2.add(emcVar2);
                }
                if (z7) {
                    return emc(f2, arrayList2);
                }
            }
            int size3 = arrayList.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size3) {
                Object obj3 = arrayList.get(i9);
                i9++;
                ypw.emc emcVar3 = (ypw.emc) obj3;
                if (emcVar3.ypw) {
                    emcVar3.emc = emc(emcVar3.emc * f6);
                } else {
                    emcVar3.emc = emc(emcVar3.emc * f7);
                }
                i8 = (int) (i8 + emcVar3.emc);
            }
            float f9 = i8;
            if (f9 < f2) {
                float f10 = f2 - f9;
                for (int size4 = 0; size4 < arrayList.size() && f10 > 0.0f; size4 = (size4 + 1) % arrayList.size()) {
                    ypw.emc emcVar4 = (ypw.emc) arrayList.get(size4);
                    if ((f2 < f5 && emcVar4.ypw) || (f2 > f5 && !emcVar4.ypw)) {
                        emcVar4.emc += 0.0625f;
                        f10 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
