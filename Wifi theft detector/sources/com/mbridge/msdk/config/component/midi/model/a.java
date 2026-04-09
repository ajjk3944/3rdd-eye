package com.mbridge.msdk.config.component.midi.model;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f13580a;

    /* renamed from: b, reason: collision with root package name */
    private String f13581b;

    /* renamed from: d, reason: collision with root package name */
    private int f13583d;

    /* renamed from: e, reason: collision with root package name */
    private int f13584e;

    /* renamed from: g, reason: collision with root package name */
    private String f13586g;

    /* renamed from: h, reason: collision with root package name */
    private String f13587h;

    /* renamed from: i, reason: collision with root package name */
    private CusPlayerView f13588i;

    /* renamed from: c, reason: collision with root package name */
    private String f13582c = MBridgeConstans.ENDCARD_URL_TYPE_PL;

    /* renamed from: f, reason: collision with root package name */
    private int f13585f = 5000;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(c.a("116"));
                if (obj != null) {
                    String strValueOf = String.valueOf(obj);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        e(strValueOf);
                    }
                }
                Object obj2 = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
                if (obj2 != null) {
                    String strValueOf2 = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf2)) {
                        a(strValueOf2);
                    }
                }
                Object obj3 = map.get(c.a("122"));
                if (obj3 != null) {
                    String strValueOf3 = String.valueOf(obj3);
                    if (!TextUtils.isEmpty(strValueOf3)) {
                        c(strValueOf3);
                    }
                }
                Object obj4 = map.get(c.a("123"));
                if (obj4 != null) {
                    String strValueOf4 = String.valueOf(obj4);
                    if (!TextUtils.isEmpty(strValueOf4)) {
                        d(strValueOf4);
                    }
                }
                Object obj5 = map.get(c.a("124"));
                if (obj5 != null) {
                    b(String.valueOf(obj5));
                }
            } catch (Exception e10) {
                q0.b("PlayerModel", e10.getMessage(), e10);
            }
        }
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (map.containsKey(c.a("162"))) {
                    Object obj = map.get(c.a("162"));
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        Object obj2 = map2.get("playTimeout");
                        if (obj2 instanceof String) {
                            b(Integer.valueOf(obj2.toString()).intValue() * 1000);
                        } else if (obj2 instanceof Integer) {
                            b(((Integer) obj2).intValue() * 1000);
                        }
                        Object obj3 = map2.get("bufferTimeout");
                        if (obj3 instanceof String) {
                            a(Integer.valueOf(obj3.toString()).intValue() * 1000);
                        } else if (obj3 instanceof Integer) {
                            a(((Integer) obj3).intValue() * 1000);
                        }
                    }
                }
            } catch (Exception e10) {
                q0.b("PlayerModel", e10.getMessage(), e10);
            }
        }
    }

    public void c(String str) {
        this.f13582c = str;
    }

    public CusPlayerView d() {
        return this.f13588i;
    }

    public void e(String str) {
        this.f13580a = str;
    }

    public String f() {
        return this.f13582c;
    }

    public int g() {
        return this.f13585f;
    }

    public String h() {
        return this.f13586g;
    }

    public String i() {
        return this.f13580a;
    }

    public int c() {
        return this.f13583d;
    }

    public void d(String str) {
        this.f13586g = str;
    }

    public String e() {
        return this.f13587h;
    }

    public String b() {
        return this.f13581b;
    }

    public void b(String str) {
        this.f13587h = str;
    }

    public void b(int i10) {
        this.f13585f = i10;
    }

    public void a(CusPlayerView cusPlayerView) {
        this.f13588i = cusPlayerView;
    }

    public void a(String str) {
        this.f13581b = str;
    }

    public int a() {
        return this.f13584e;
    }

    public void a(int i10) {
        this.f13584e = i10;
    }
}
