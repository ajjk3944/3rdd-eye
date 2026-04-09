package com.mbridge.msdk.config.component.eac.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Object f13302a;

    /* renamed from: b, reason: collision with root package name */
    private String f13303b;

    /* renamed from: c, reason: collision with root package name */
    private String f13304c;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("135"));
            if (obj != null) {
                a(obj);
            }
            Object obj2 = map.get(c.a("136"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.a("137"));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
        }
    }

    public String b() {
        return this.f13303b;
    }

    public Object c() {
        return this.f13302a;
    }

    public void b(String str) {
        this.f13303b = str;
    }

    public void a(Object obj) {
        this.f13302a = obj;
    }

    public String a() {
        return this.f13304c;
    }

    public void a(String str) {
        this.f13304c = str;
    }
}
