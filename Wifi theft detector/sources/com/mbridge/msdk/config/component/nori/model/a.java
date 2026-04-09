package com.mbridge.msdk.config.component.nori.model;

import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f13615a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f13616b;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f13618d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f13619e;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f13622h;

    /* renamed from: l, reason: collision with root package name */
    private String f13626l;

    /* renamed from: c, reason: collision with root package name */
    private String f13617c = "HTTP";

    /* renamed from: f, reason: collision with root package name */
    private int f13620f = 3;

    /* renamed from: g, reason: collision with root package name */
    private int f13621g = 10;

    /* renamed from: i, reason: collision with root package name */
    private String f13623i = "GET";

    /* renamed from: j, reason: collision with root package name */
    private long f13624j = 15;

    /* renamed from: k, reason: collision with root package name */
    private int f13625k = 9377;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(c.a("165"));
                if (obj instanceof List) {
                    b((List<String>) obj);
                } else if (obj instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj.toString());
                    b(arrayList);
                }
                Object obj2 = map.get(c.a("151"));
                if (obj2 != null) {
                    c(String.valueOf(obj2));
                }
                Object obj3 = map.get(c.a("170"));
                if (obj3 != null) {
                    a(String.valueOf(obj3));
                }
                Object obj4 = map.get(c.a("168"));
                if (obj4 instanceof Map) {
                    b((Map<String, Object>) obj4);
                }
                Object obj5 = map.get(c.a("172"));
                if (obj5 != null) {
                    c(Integer.parseInt(String.valueOf(obj5)));
                }
                Object obj6 = map.get(c.a("171"));
                if (obj6 instanceof Map) {
                    d((Map) obj6);
                }
                Object obj7 = map.get(c.a("174"));
                if (obj7 != null) {
                    try {
                        a(Integer.parseInt(String.valueOf(obj7)));
                    } catch (Exception e10) {
                        q0.b("NetworkRequestModel", e10.getMessage());
                    }
                }
                Object obj8 = map.get(c.a("175"));
                if (obj8 != null) {
                    try {
                        b(Integer.parseInt(String.valueOf(obj8)));
                    } catch (Exception e11) {
                        q0.b("NetworkRequestModel", e11.getMessage());
                    }
                }
                Object obj9 = map.get(c.a("162"));
                if (obj9 != null) {
                    try {
                        a(Long.parseLong(String.valueOf(obj9)));
                    } catch (Exception e12) {
                        q0.b("NetworkRequestModel", e12.getMessage());
                    }
                }
                Object obj10 = map.get(c.a("169"));
                if (obj10 instanceof Map) {
                    c((Map<String, Object>) obj10);
                }
                Object obj11 = map.get(c.a("173"));
                if (obj11 instanceof List) {
                    a((List<String>) obj11);
                } else if (obj11 instanceof String) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(obj11.toString());
                    a(arrayList2);
                }
                Object obj12 = map.get(c.a("request_type"));
                if (obj12 != null) {
                    b(String.valueOf(obj12));
                }
            } catch (Exception e13) {
                q0.b("NetworkRequestModel", e13.getMessage(), e13);
            }
        }
    }

    public void b(List<String> list) {
        this.f13616b = list;
    }

    public void c(String str) {
        this.f13617c = str;
    }

    public Map<String, String> d() {
        return this.f13618d;
    }

    public String e() {
        return this.f13623i;
    }

    public String f() {
        return this.f13626l;
    }

    public int g() {
        return this.f13620f;
    }

    public int h() {
        return this.f13621g;
    }

    public String i() {
        return this.f13617c;
    }

    public int j() {
        return this.f13625k;
    }

    public long k() {
        return this.f13624j;
    }

    public List<String> l() {
        return this.f13616b;
    }

    public Map<String, Object> b() {
        return this.f13619e;
    }

    public void c(Map<String, Object> map) {
        this.f13619e = map;
    }

    public void d(Map<String, String> map) {
        this.f13618d = map;
    }

    public void b(Map<String, Object> map) {
        this.f13622h = map;
    }

    public void c(int i10) {
        this.f13625k = i10;
    }

    public void b(int i10) {
        this.f13621g = i10;
    }

    public List<String> c() {
        return this.f13615a;
    }

    public void b(String str) {
        this.f13626l = str;
    }

    public void a(int i10) {
        this.f13620f = i10;
    }

    public Map<String, Object> a() {
        return this.f13622h;
    }

    public void a(String str) {
        this.f13623i = str;
    }

    public void a(long j10) {
        this.f13624j = j10;
    }

    public void a(List<String> list) {
        this.f13615a = list;
    }
}
