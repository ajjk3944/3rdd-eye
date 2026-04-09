package com.mbridge.msdk.config.component.wei.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.List;
import java.util.Map;
import o5.b;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f13781a;

    /* renamed from: b, reason: collision with root package name */
    private String f13782b;

    /* renamed from: c, reason: collision with root package name */
    private String f13783c;

    /* renamed from: d, reason: collision with root package name */
    private String f13784d;

    /* renamed from: e, reason: collision with root package name */
    private String f13785e;

    /* renamed from: f, reason: collision with root package name */
    private b f13786f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13787g;

    /* renamed from: h, reason: collision with root package name */
    private String f13788h;

    /* renamed from: i, reason: collision with root package name */
    private List<Map<String, Object>> f13789i;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(String str) {
        this.f13784d = str;
    }

    public void b(String str) {
        this.f13783c = str;
    }

    public String c() {
        return this.f13788h;
    }

    public void d(String str) {
        this.f13781a = str;
    }

    public void e(String str) {
        this.f13785e = str;
    }

    public String f() {
        return this.f13782b;
    }

    public String g() {
        return this.f13781a;
    }

    public String h() {
        return this.f13785e;
    }

    public boolean i() {
        return this.f13787g;
    }

    public b a() {
        return this.f13786f;
    }

    public String b() {
        return this.f13784d;
    }

    public void c(String str) {
        this.f13782b = str;
    }

    public String d() {
        return this.f13783c;
    }

    public List<Map<String, Object>> e() {
        return this.f13789i;
    }

    public void a(List<Map<String, Object>> list) {
        this.f13789i = list;
    }

    public void a(Map<String, Object> map) {
        com.mbridge.msdk.config.component.common.file.b bVarA;
        if (map != null) {
            Object obj = map.get(c.a("116"));
            if (obj != null) {
                String strValueOf = String.valueOf(obj);
                if (strValueOf.contains(".zip") && (bVarA = com.mbridge.msdk.config.component.common.file.a.a(strValueOf, 1, null)) != null && bVarA.e()) {
                    c(com.mbridge.msdk.config.component.common.file.a.a(strValueOf, bVarA.d()));
                }
                d(strValueOf);
            }
            Object obj2 = map.get(c.a("125"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.a("123"));
            if (obj4 != null) {
                e(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.a("127"));
            if (obj5 instanceof List) {
                a((List<Map<String, Object>>) obj5);
            }
        }
    }
}
