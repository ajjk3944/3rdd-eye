package com.mbridge.msdk.config.component.cal.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f13108a;

    /* renamed from: b, reason: collision with root package name */
    private String f13109b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f13110c;

    /* renamed from: d, reason: collision with root package name */
    private String f13111d;

    /* renamed from: e, reason: collision with root package name */
    private String f13112e;

    /* renamed from: f, reason: collision with root package name */
    private int f13113f;

    /* renamed from: g, reason: collision with root package name */
    private String f13114g;

    /* renamed from: h, reason: collision with root package name */
    private int f13115h;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj != null) {
                this.f13108a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.a("106"));
            if (obj2 != null) {
                this.f13109b = String.valueOf(obj2);
            }
            Object obj3 = map.get(c.a("103"));
            if (obj3 instanceof Map) {
                this.f13110c = (Map) obj3;
            }
            Object obj4 = map.get(c.a(StatisticData.ERROR_CODE_IO_ERROR));
            if (obj4 != null) {
                this.f13111d = String.valueOf(obj4);
            }
            Object obj5 = map.get(c.a("102"));
            if (obj5 != null) {
                this.f13112e = String.valueOf(obj5);
            }
            Object obj6 = map.get(c.a("104"));
            if (obj6 instanceof String) {
                this.f13113f = Integer.parseInt(String.valueOf(obj6));
            }
            if (obj6 instanceof Integer) {
                this.f13113f = ((Integer) obj6).intValue();
            }
            Object obj7 = map.get(c.a("115"));
            if (obj7 instanceof String) {
                this.f13114g = String.valueOf(obj7);
            }
            String strValueOf = String.valueOf(map.get(c.a("init_status")));
            if (strValueOf.equalsIgnoreCase("null")) {
                a(1);
            } else {
                a(Integer.parseInt(strValueOf));
            }
        }
    }

    public String b() {
        return this.f13108a;
    }

    public String c() {
        return this.f13112e;
    }

    public int d() {
        return this.f13115h;
    }

    public int e() {
        return this.f13113f;
    }

    public Map<String, Object> f() {
        return this.f13110c;
    }

    public String g() {
        return this.f13109b;
    }

    public String a() {
        return this.f13114g;
    }

    public void a(int i10) {
        this.f13115h = i10;
    }
}
