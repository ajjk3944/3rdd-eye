package com.mbridge.msdk.config.component.info.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f13306a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f13307b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f13308c;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f13309d;

    /* renamed from: e, reason: collision with root package name */
    private int f13310e = 1;

    /* renamed from: f, reason: collision with root package name */
    private int f13311f = 1;

    /* renamed from: g, reason: collision with root package name */
    private int f13312g = 1;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.a f13313h;

    public a(Map<String, Object> map) {
        a(map);
        f();
    }

    private void f() {
        com.mbridge.msdk.config.component.info.provider.a aVar = new com.mbridge.msdk.config.component.info.provider.a(this.f13310e, this.f13311f, this.f13312g);
        this.f13313h = aVar;
        aVar.c();
        this.f13313h.a();
        this.f13313h.b();
    }

    public List<String> a() {
        return this.f13309d;
    }

    public List<String> b() {
        return this.f13308c;
    }

    public Map<String, Object> c() {
        Map<String, Object> mapA = this.f13313h.a();
        Map<String, Object> mapB = this.f13313h.b();
        HashMap map = new HashMap();
        map.putAll(mapA);
        map.putAll(mapB);
        return map;
    }

    public List<String> d() {
        return this.f13307b;
    }

    public String e() {
        return this.f13306a;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("138"));
            if (obj != null) {
                this.f13306a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.a("140"));
            if (obj2 instanceof List) {
                this.f13307b = (List) obj2;
            }
            Object obj3 = map.get(c.a("196"));
            if (obj3 instanceof List) {
                this.f13308c = (List) obj3;
            }
            Object obj4 = map.get(c.a("197"));
            if (obj4 instanceof List) {
                this.f13309d = (List) obj4;
            }
            Object obj5 = map.get(c.a("139"));
            if (obj5 != null) {
                this.f13310e = Integer.parseInt(String.valueOf(obj5));
            }
            Object obj6 = map.get(c.a("194"));
            if (obj6 != null) {
                this.f13311f = Integer.parseInt(String.valueOf(obj6));
            }
            Object obj7 = map.get(c.a("195"));
            if (obj7 != null) {
                this.f13312g = Integer.parseInt(String.valueOf(obj7));
            }
        }
    }

    public Object b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str);
    }

    private String a(String str) {
        return this.f13313h.a(str);
    }
}
