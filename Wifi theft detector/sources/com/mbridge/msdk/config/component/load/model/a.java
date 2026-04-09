package com.mbridge.msdk.config.component.load.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f13544a;

    /* renamed from: c, reason: collision with root package name */
    private String f13546c;

    /* renamed from: f, reason: collision with root package name */
    private int f13549f;

    /* renamed from: b, reason: collision with root package name */
    private float f13545b = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f13547d = 30;

    /* renamed from: e, reason: collision with root package name */
    private int f13548e = 0;

    public a(Map<String, Object> map) throws NumberFormatException {
        a(map);
    }

    public void a(Map<String, Object> map) throws NumberFormatException {
        if (map != null) {
            Object obj = map.get(c.a("116"));
            if (obj != null) {
                this.f13544a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.a("191"));
            if (obj2 != null) {
                float f10 = Float.parseFloat(String.valueOf(obj2));
                if (f10 <= 0.0f || f10 > 1.0f) {
                    f10 = 1.0f;
                }
                this.f13545b = f10;
            }
            Object obj3 = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                this.f13546c = String.valueOf(obj3);
            }
            Object obj4 = map.get(c.a("162"));
            if (obj4 != null) {
                int i10 = Integer.parseInt(String.valueOf(obj4));
                if (i10 == 0) {
                    i10 = 30;
                }
                this.f13547d = i10;
            }
            Object obj5 = map.get(c.a("174"));
            if (obj5 != null) {
                this.f13548e = Integer.parseInt(String.valueOf(obj5));
            }
            Object obj6 = map.get(c.a("192"));
            if (obj6 != null) {
                this.f13549f = Integer.parseInt(String.valueOf(obj6));
            }
        }
    }

    public float b() {
        return this.f13545b;
    }

    public int c() {
        return this.f13549f;
    }

    public String d() {
        return this.f13544a;
    }

    public int e() {
        return this.f13548e;
    }

    public int f() {
        return this.f13547d * 1000;
    }

    public String a() {
        return this.f13546c;
    }
}
