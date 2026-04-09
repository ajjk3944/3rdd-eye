package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    Context f13359a;

    /* renamed from: b, reason: collision with root package name */
    String f13360b;

    /* renamed from: c, reason: collision with root package name */
    String f13361c;

    /* renamed from: d, reason: collision with root package name */
    String f13362d;

    /* renamed from: e, reason: collision with root package name */
    String f13363e;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Object> f13364f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("117"));
            if (obj != null) {
                d(String.valueOf(obj));
            }
            Object obj2 = map.get(c.a("116"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.a("159"));
            if (obj3 instanceof Map) {
                Map<String, Object> map2 = (Map) obj3;
                b(map2);
                if (map2 != null && !map2.isEmpty()) {
                    c(String.valueOf(map2.get(c.a("160"))));
                }
            }
            Object obj4 = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
        }
    }

    public void b(String str) {
        this.f13361c = str;
    }

    public void c(String str) {
        this.f13362d = str;
    }

    public void d(String str) {
        this.f13360b = str;
    }

    public String e() {
        return this.f13362d;
    }

    public String f() {
        return this.f13360b;
    }

    public Map<String, Object> b() {
        return this.f13364f;
    }

    public String c() {
        return this.f13363e;
    }

    public String d() {
        return this.f13361c;
    }

    public void b(Map<String, Object> map) {
        this.f13364f = map;
    }

    public Context a() {
        return this.f13359a;
    }

    public void a(Context context) {
        this.f13359a = context;
    }

    public void a(String str) {
        this.f13363e = str;
    }
}
