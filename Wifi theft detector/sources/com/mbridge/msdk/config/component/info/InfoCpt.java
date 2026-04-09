package com.mbridge.msdk.config.component.info;

import android.content.Context;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class InfoCpt extends a {

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.model.a f13305h;

    private Object a(String str, Context context) {
        com.mbridge.msdk.config.component.info.model.a aVar = this.f13305h;
        if (aVar == null || context == null) {
            return null;
        }
        return aVar.b(str);
    }

    private Map<String, Object> g() {
        HashMap map = new HashMap();
        com.mbridge.msdk.config.component.info.model.a aVar = this.f13305h;
        return aVar != null ? aVar.c() : map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f13092f = "918001";
        this.f13305h = new com.mbridge.msdk.config.component.info.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        a(a("918001", new HashMap<>()));
        String strE = this.f13305h.e();
        Map<String, Object> map = new HashMap<>();
        Context contextD = c.n().d();
        HashMap map2 = new HashMap();
        if (strE != null) {
            if (strE.equals(com.mbridge.msdk.config.component.common.util.c.a("330"))) {
                map2.putAll(g());
            } else {
                map2.put(strE, a(strE, contextD));
            }
        }
        if (this.f13305h.d() != null && !this.f13305h.d().isEmpty()) {
            int size = this.f13305h.d().size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < this.f13305h.d().size(); i10++) {
                iArr[i10] = v0.c(contextD, this.f13305h.d().get(i10)) ? 1 : 0;
            }
            try {
                List<String> listB = this.f13305h.b();
                List<String> listA = this.f13305h.a();
                if (listB != null && listB.size() == this.f13305h.d().size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < size; i11++) {
                        HashMap map3 = new HashMap();
                        map3.put(com.mbridge.msdk.config.component.common.util.c.a("ind"), Integer.valueOf(iArr[i11]));
                        map3.put(com.mbridge.msdk.config.component.common.util.c.a(BidResponsedEx.KEY_CID), listB.get(i11));
                        map3.put(com.mbridge.msdk.config.component.common.util.c.a(CampaignEx.JSON_KEY_RETARGET_OFFER), listA.get(i11));
                        arrayList.add(map3);
                    }
                    map2.put(com.mbridge.msdk.config.component.common.util.c.a("filter_list"), arrayList);
                }
            } catch (Exception e10) {
                q0.a("InfoCpt", e10.getMessage());
            }
            map2.put(com.mbridge.msdk.config.component.common.util.c.a("575"), iArr);
        }
        map.put(com.mbridge.msdk.config.component.common.util.c.a("500"), map2);
        a(a("918002", map));
    }
}
