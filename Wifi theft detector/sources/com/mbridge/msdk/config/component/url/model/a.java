package com.mbridge.msdk.config.component.url.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f13744a;

    /* renamed from: b, reason: collision with root package name */
    private String f13745b;

    /* renamed from: c, reason: collision with root package name */
    private String f13746c;

    /* renamed from: d, reason: collision with root package name */
    private Map<Object, Object> f13747d;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("160"));
            if (obj != null) {
                a(String.valueOf(obj));
            }
            Object obj2 = map.get(c.a("151"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.a("109"));
            if (obj3 instanceof Map) {
                b((Map<Object, Object>) obj3);
            }
        }
    }

    public void b(String str) {
        this.f13746c = str;
    }

    public String c() {
        return this.f13745b;
    }

    public String d() {
        return this.f13746c;
    }

    public Map<Object, Object> b() {
        return this.f13747d;
    }

    public void b(Map<Object, Object> map) {
        this.f13747d = map;
    }

    public Context a() {
        return this.f13744a;
    }

    public void a(Context context) {
        this.f13744a = context;
    }

    public void a(String str) {
        this.f13745b = str;
    }
}
