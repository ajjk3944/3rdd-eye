package com.bytedance.adsdk.ypw;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class sba {
    private boolean emc = false;
    private final Set<Object> ypw = new emc();
    private final Map<String, com.bytedance.adsdk.ypw.ycc.dg> xq = new HashMap();
    private final Comparator<Pair<String, Float>> dg = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.ypw.sba.1
        @Override // java.util.Comparator
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public void emc(boolean z10) {
        this.emc = z10;
    }

    public void emc(String str, float f10) {
        if (this.emc) {
            com.bytedance.adsdk.ypw.ycc.dg dgVar = this.xq.get(str);
            if (dgVar == null) {
                dgVar = new com.bytedance.adsdk.ypw.ycc.dg();
                this.xq.put(str, dgVar);
            }
            dgVar.emc(f10);
            if (str.equals("__container")) {
                Iterator<Object> it = this.ypw.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
