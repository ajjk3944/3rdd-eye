package com.bytedance.adsdk.emc.ypw;

import com.bytedance.adsdk.emc.ypw.xq.emc.bw;
import com.bytedance.adsdk.emc.ypw.xq.emc.dg;
import com.bytedance.adsdk.emc.ypw.xq.emc.msw;
import com.bytedance.adsdk.emc.ypw.xq.emc.ru;
import com.bytedance.adsdk.emc.ypw.xq.emc.uym;
import com.bytedance.adsdk.emc.ypw.xq.emc.xq;
import com.bytedance.adsdk.emc.ypw.xq.emc.ycc;
import com.bytedance.adsdk.emc.ypw.xq.emc.ypw;
import com.bytedance.adsdk.emc.ypw.xq.emc.zz;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private static final com.bytedance.adsdk.emc.ypw.xq.emc emc;
    private String bw;
    private Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> dg = new LinkedList();
    private com.bytedance.adsdk.emc.ypw.ypw.emc xq;
    private final com.bytedance.adsdk.emc.ypw.xq.emc ypw;

    static {
        int i10 = 8;
        ycc[] yccVarArr = {new ru(), new dg(), new zz(), new ypw(), new bw(), new com.bytedance.adsdk.emc.ypw.xq.emc.emc(), new uym(), new xq(), new msw()};
        final com.bytedance.adsdk.emc.ypw.xq.emc emcVar = new com.bytedance.adsdk.emc.ypw.xq.emc() { // from class: com.bytedance.adsdk.emc.ypw.emc.1
            @Override // com.bytedance.adsdk.emc.ypw.xq.emc
            public int emc(String str, int i11, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque) {
                return i11;
            }
        };
        while (i10 >= 0) {
            final ycc yccVar = yccVarArr[i10];
            i10--;
            emcVar = new com.bytedance.adsdk.emc.ypw.xq.emc() { // from class: com.bytedance.adsdk.emc.ypw.emc.2
                @Override // com.bytedance.adsdk.emc.ypw.xq.emc
                public int emc(String str, int i11, Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque) {
                    return yccVar.emc(str, i11, deque, emcVar);
                }
            };
        }
        emc = emcVar;
    }

    private emc(String str, com.bytedance.adsdk.emc.ypw.xq.emc emcVar) {
        this.ypw = emcVar;
        this.bw = str;
        try {
            emc();
        } catch (Exception e10) {
            throw new com.bytedance.adsdk.emc.emc.ypw(str, e10);
        }
    }

    public static emc emc(String str) {
        return new emc(str, emc);
    }

    private void emc() {
        int length = this.bw.length();
        int i10 = 0;
        while (i10 < length) {
            int iEmc = this.ypw.emc(this.bw, i10, this.dg);
            if (iEmc == i10) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.bw.substring(0, i10));
            }
            i10 = iEmc;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.emc.ypw.ypw.emc emcVarPollFirst = this.dg.pollFirst();
            if (emcVarPollFirst == null) {
                this.xq = com.bytedance.adsdk.emc.ypw.bw.ypw.emc(arrayList, this.bw, i10);
                this.dg = null;
                return;
            }
            arrayList.add(0, emcVarPollFirst);
        }
    }

    public <T> T emc(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) emc(map);
    }

    public <T> T emc(Map<String, JSONObject> map) {
        return (T) this.xq.emc(map);
    }
}
