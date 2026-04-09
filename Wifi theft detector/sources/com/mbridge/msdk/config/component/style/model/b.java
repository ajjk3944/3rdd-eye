package com.mbridge.msdk.config.component.style.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f13726a;

    /* renamed from: b, reason: collision with root package name */
    private String f13727b;

    /* renamed from: c, reason: collision with root package name */
    private String f13728c;

    /* renamed from: d, reason: collision with root package name */
    private List<a> f13729d;

    public b(Map<String, Object> map) {
        a(map);
    }

    private a b(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        a aVar = new a();
        Object obj = map.get(c.a("130"));
        if (obj != null) {
            aVar.a(String.valueOf(obj));
        }
        Object obj2 = map.get(c.a("123"));
        if (obj2 != null) {
            aVar.c(String.valueOf(obj2));
        }
        Object obj3 = map.get(c.a("131"));
        if (obj3 != null) {
            aVar.a(obj3);
        }
        Object obj4 = map.get(c.a("134"));
        if (obj4 != null) {
            aVar.b(String.valueOf(obj4));
        }
        Object obj5 = map.get(c.a("132"));
        if (obj5 != null) {
            aVar.e(String.valueOf(obj5));
        }
        Object obj6 = map.get(c.a("133"));
        if (obj6 != null) {
            aVar.d(String.valueOf(obj6));
        }
        return aVar;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(c.a("116"));
                if (obj != null) {
                    c(String.valueOf(obj));
                }
                Object obj2 = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
                if (obj2 != null) {
                    a(String.valueOf(obj2));
                }
                Object obj3 = map.get(c.a("129"));
                if (obj3 != null) {
                    a(obj3);
                }
                Object obj4 = map.get(c.a("156"));
                if (obj4 != null) {
                    b(String.valueOf(obj4));
                } else {
                    b(String.valueOf(m0.F(com.mbridge.msdk.foundation.controller.c.n().d())));
                }
            } catch (Exception e10) {
                q0.b("XMLViewModel", e10.getMessage());
            }
        }
    }

    public String c() {
        return this.f13726a;
    }

    public List<a> d() {
        return this.f13729d;
    }

    public void c(String str) {
        this.f13726a = str;
    }

    private void a(Object obj) {
        a aVarB;
        a aVarB2;
        if (obj == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if ((obj2 instanceof Map) && (aVarB2 = b((Map<String, Object>) obj2)) != null) {
                    arrayList.add(aVarB2);
                }
            }
        } else if ((obj instanceof Map) && (aVarB = b((Map<String, Object>) obj)) != null) {
            arrayList.add(aVarB);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a((List<a>) arrayList);
    }

    public String b() {
        return this.f13728c;
    }

    public void b(String str) {
        this.f13728c = str;
    }

    public String a() {
        return this.f13727b;
    }

    public void a(String str) {
        this.f13727b = str;
    }

    public void a(List<a> list) {
        this.f13729d = list;
    }
}
