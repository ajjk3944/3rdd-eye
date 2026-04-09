package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import com.bytedance.sdk.component.adexpress.dynamic.fkw.vt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj {
    public static float ouw(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<vt.ouw> ouw(float f10, List<vt.ouw> list) {
        ArrayList arrayList;
        int size;
        float f11;
        float f12;
        float f13;
        while (true) {
            arrayList = new ArrayList();
            Iterator<vt.ouw> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((vt.ouw) it.next().clone());
            }
            int size2 = arrayList.size();
            boolean z3 = true;
            int i4 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                vt.ouw ouwVar = (vt.ouw) obj;
                if (ouwVar.vt) {
                    i4 = (int) (i4 + ouwVar.ouw);
                } else {
                    i10 = (int) (i10 + ouwVar.ouw);
                    z3 = false;
                }
            }
            if (z3 && f10 > i4) {
                break;
            }
            f11 = i4;
            f12 = f10 < f11 ? f10 / f11 : 1.0f;
            f13 = f10 > f11 ? (f10 - f11) / i10 : 0.0f;
            if (f13 <= 1.0f) {
                break;
            }
            ArrayList arrayList2 = new ArrayList();
            int size3 = arrayList.size();
            boolean z10 = false;
            int i12 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList.get(i12);
                i12++;
                vt.ouw ouwVar2 = (vt.ouw) obj2;
                if (!ouwVar2.vt) {
                    float f14 = ouwVar2.f7245lh;
                    if (f14 != 0.0f && ouwVar2.ouw * f13 > f14) {
                        ouwVar2.ouw = f14;
                        ouwVar2.vt = true;
                        z10 = true;
                    }
                }
                arrayList2.add(ouwVar2);
            }
            if (!z10) {
                break;
            }
            list = arrayList2;
        }
        int size4 = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i14 < size4) {
            Object obj3 = arrayList.get(i14);
            i14++;
            vt.ouw ouwVar3 = (vt.ouw) obj3;
            if (ouwVar3.vt) {
                ouwVar3.ouw = ouw(ouwVar3.ouw * f12);
            } else {
                ouwVar3.ouw = ouw(ouwVar3.ouw * f13);
            }
            i13 = (int) (i13 + ouwVar3.ouw);
        }
        float f15 = i13;
        if (f15 < f10) {
            float f16 = f10 - f15;
            for (size = 0; size < arrayList.size() && f16 > 0.0f; size = (size + 1) % arrayList.size()) {
                vt.ouw ouwVar4 = (vt.ouw) arrayList.get(size);
                if ((f10 < f11 && ouwVar4.vt) || (f10 > f11 && !ouwVar4.vt)) {
                    ouwVar4.ouw += 0.0625f;
                    f16 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
