package com.bytedance.adsdk.ouw.vt;

import com.bytedance.adsdk.ouw.vt.lh.ouw.bly;
import com.bytedance.adsdk.ouw.vt.lh.ouw.fkw;
import com.bytedance.adsdk.ouw.vt.lh.ouw.le;
import com.bytedance.adsdk.ouw.vt.lh.ouw.lh;
import com.bytedance.adsdk.ouw.vt.lh.ouw.pno;
import com.bytedance.adsdk.ouw.vt.lh.ouw.ra;
import com.bytedance.adsdk.ouw.vt.lh.ouw.tlj;
import com.bytedance.adsdk.ouw.vt.lh.ouw.vt;
import com.bytedance.adsdk.ouw.vt.lh.ouw.yu;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private static final com.bytedance.adsdk.ouw.vt.lh.ouw ouw;
    private String fkw;

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.adsdk.ouw.vt.vt.ouw f6812lh;
    private final com.bytedance.adsdk.ouw.vt.lh.ouw vt;
    private Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> yu = new LinkedList();

    static {
        int i4 = 8;
        le[] leVarArr = {new tlj(), new yu(), new bly(), new vt(), new fkw(), new com.bytedance.adsdk.ouw.vt.lh.ouw.ouw(), new ra(), new lh(), new pno()};
        final com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar = new com.bytedance.adsdk.ouw.vt.lh.ouw() { // from class: com.bytedance.adsdk.ouw.vt.ouw.1
            @Override // com.bytedance.adsdk.ouw.vt.lh.ouw
            public final int ouw(String str, int i10, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque) {
                return i10;
            }
        };
        while (i4 >= 0) {
            final le leVar = leVarArr[i4];
            i4--;
            ouwVar = new com.bytedance.adsdk.ouw.vt.lh.ouw() { // from class: com.bytedance.adsdk.ouw.vt.ouw.2
                @Override // com.bytedance.adsdk.ouw.vt.lh.ouw
                public final int ouw(String str, int i10, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque) {
                    return leVar.ouw(str, i10, deque, ouwVar);
                }
            };
        }
        ouw = ouwVar;
    }

    private ouw(String str, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        this.vt = ouwVar;
        this.fkw = str;
        try {
            ouw();
        } catch (Exception e2) {
            throw new com.bytedance.adsdk.ouw.ouw.vt(str, e2);
        }
    }

    public static ouw ouw(String str) {
        return new ouw(str, ouw);
    }

    private void ouw() {
        int length = this.fkw.length();
        int i4 = 0;
        while (i4 < length) {
            int iOuw = this.vt.ouw(this.fkw, i4, this.yu);
            if (iOuw == i4) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.fkw.substring(0, i4));
            }
            i4 = iOuw;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.ouw.vt.vt.ouw ouwVarPollFirst = this.yu.pollFirst();
            if (ouwVarPollFirst == null) {
                this.f6812lh = com.bytedance.adsdk.ouw.vt.fkw.vt.ouw(arrayList, this.fkw, i4);
                this.yu = null;
                return;
            }
            arrayList.add(0, ouwVarPollFirst);
        }
    }

    public final <T> T ouw(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) ouw(map);
    }

    private <T> T ouw(Map<String, JSONObject> map) {
        return (T) this.f6812lh.ouw(map);
    }
}
