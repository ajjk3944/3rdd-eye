package com.mbridge.msdk.config.component.log.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f13552a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f13553b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f13554c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f13555d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f13556e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f13557f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f13558g = 0;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f13559h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f13560i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f13561j;

    /* renamed from: k, reason: collision with root package name */
    private int f13562k;

    public void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(c.a("181"))) {
                this.f13552a = ((Integer) map.get(c.a("181"))).intValue();
            }
            if (map.containsKey(c.a("162"))) {
                this.f13553b = ((Integer) map.get(c.a("162"))).intValue();
            }
            if (map.containsKey(c.a("182"))) {
                this.f13554c = ((Integer) map.get(c.a("182"))).intValue();
            }
            if (map.containsKey(c.a("183"))) {
                this.f13555d = ((Integer) map.get(c.a("183"))).intValue();
            }
            if (map.containsKey(c.a("174"))) {
                this.f13556e = ((Integer) map.get(c.a("174"))).intValue();
            }
            if (map.containsKey(c.a("184"))) {
                this.f13557f = ((Integer) map.get(c.a("184"))).intValue();
            }
            if (map.containsKey(c.a("185"))) {
                this.f13558g = ((Integer) map.get(c.a("185"))).intValue();
            }
            if (map.containsKey(c.a("180"))) {
                this.f13559h = (Map) map.get(c.a("180"));
            }
            if (map.containsKey(c.a("179"))) {
                this.f13560i = (Map) map.get(c.a("179"));
            }
            if (map.containsKey(c.a("186"))) {
                this.f13561j = (Map) map.get(c.a("186"));
            }
            this.f13562k = map.containsKey(c.a("178")) ? ((Integer) map.get(c.a("178"))).intValue() : 0;
        }
    }

    public int b() {
        return this.f13553b;
    }

    public String c() {
        Map<String, Object> map = this.f13559h;
        return (map == null || !map.containsKey(c.a("116"))) ? "" : (String) this.f13559h.get(c.a("116"));
    }

    public int d() {
        return this.f13557f;
    }

    public int e() {
        return this.f13562k;
    }

    public int f() {
        Map<String, Object> map = this.f13559h;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.f13556e;
    }

    public Map<String, Object> h() {
        return this.f13561j;
    }

    public String i() {
        Map<String, Object> map = this.f13560i;
        return (map == null || !map.containsKey(c.a("114"))) ? "" : (String) this.f13560i.get(c.a("114"));
    }

    public int j() {
        Map<String, Object> map = this.f13560i;
        if (map == null || !map.containsKey(c.a("172"))) {
            return 0;
        }
        return ((Integer) this.f13560i.get(c.a("172"))).intValue();
    }

    public int k() {
        return this.f13558g;
    }

    public int a() {
        return this.f13552a;
    }
}
