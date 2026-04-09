package com.mbridge.msdk.config.component.eac;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class EacCpt extends a {

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.eac.model.a f13300h;

    /* renamed from: i, reason: collision with root package name */
    private d f13301i;

    private void a(Iterable<?> iterable, int i10) {
        int i11 = 0;
        for (Object obj : iterable) {
            Object objA = this.f13301i.a(this.f13300h.b(), this.f13090d);
            if (!(objA instanceof Integer) || ((Integer) objA).intValue() == 1) {
                Object objA2 = this.f13301i.a(this.f13300h.a(), this.f13090d);
                if ((objA2 instanceof Integer) && ((Integer) objA2).intValue() == 1) {
                    break;
                }
                HashMap map = new HashMap();
                map.put(c.a("count"), i10 + "");
                if (obj != null) {
                    map.put(c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE), obj);
                }
                if (obj instanceof Map.Entry) {
                    map.put(c.a("key"), ((Map.Entry) obj).getKey().toString());
                } else {
                    map.put(c.a("key"), i11 + "");
                }
                a(a("921002", map));
            }
            i11++;
        }
        HashMap map2 = new HashMap();
        map2.put(c.a("count"), Integer.valueOf(i10));
        a(a("921003", map2));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "921001";
        this.f13300h = new com.mbridge.msdk.config.component.eac.model.a(map);
        this.f13301i = new d();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objC = this.f13300h.c();
        if (objC == null) {
            Map<String, Object> map = new HashMap<>();
            map.put(c.a("code"), "");
            map.put(c.a("reason"), "iterationData is null");
            map.put(c.a("count"), 0);
            a(a("921003", map));
            return;
        }
        if (objC instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objC;
            a(aVar.a(), aVar.e());
            return;
        }
        if (objC instanceof Map) {
            Map map2 = (Map) objC;
            a(map2.entrySet(), map2.size());
        } else {
            if (objC instanceof List) {
                List list = (List) objC;
                a(list, list.size());
                return;
            }
            Map<String, Object> map3 = new HashMap<>();
            map3.put(c.a("code"), "");
            map3.put(c.a("reason"), "iterationData type not match");
            map3.put(c.a("count"), 0);
            a(a("921003", map3));
        }
    }
}
