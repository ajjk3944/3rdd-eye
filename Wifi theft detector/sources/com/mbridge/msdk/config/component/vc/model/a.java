package com.mbridge.msdk.config.component.vc.model;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f13755a;

    /* renamed from: b, reason: collision with root package name */
    private int f13756b;

    /* renamed from: c, reason: collision with root package name */
    private int f13757c;

    /* renamed from: d, reason: collision with root package name */
    private int f13758d;

    /* renamed from: e, reason: collision with root package name */
    private int f13759e;

    /* renamed from: f, reason: collision with root package name */
    private int f13760f;

    /* renamed from: g, reason: collision with root package name */
    private int f13761g;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(c.a(StatisticData.ERROR_CODE_NOT_FOUND));
                if (obj != null) {
                    a(String.valueOf(obj));
                }
                Object obj2 = map.get(c.a("155"));
                if (obj2 != null) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        b(Integer.valueOf(strValueOf).intValue());
                    }
                }
                Object obj3 = map.get(c.a("154"));
                if (obj3 != null) {
                    String strValueOf2 = String.valueOf(obj3);
                    if (!TextUtils.isEmpty(strValueOf2)) {
                        c(Integer.valueOf(strValueOf2).intValue());
                    }
                }
                Object obj4 = map.get(c.a("157"));
                if (obj4 != null) {
                    String strValueOf3 = String.valueOf(obj4);
                    if (!TextUtils.isEmpty(strValueOf3)) {
                        f(Integer.valueOf(strValueOf3).intValue());
                    }
                }
                Object obj5 = map.get(c.a("158"));
                if (obj5 != null) {
                    String strValueOf4 = String.valueOf(obj5);
                    if (!TextUtils.isEmpty(strValueOf4)) {
                        a(Integer.valueOf(strValueOf4).intValue());
                    }
                }
                Object obj6 = map.get(c.a("156"));
                int iF = m0.F(com.mbridge.msdk.foundation.controller.c.n().d());
                if (obj6 != null) {
                    String strValueOf5 = String.valueOf(obj6);
                    if (TextUtils.isEmpty(strValueOf5) || strValueOf5.equalsIgnoreCase("null")) {
                        d(iF);
                    } else {
                        d(Integer.parseInt(strValueOf5));
                    }
                } else {
                    d(iF);
                }
                Object obj7 = map.get(c.a("198"));
                if (obj7 != null) {
                    String strValueOf6 = String.valueOf(obj7);
                    if (TextUtils.isEmpty(strValueOf6) || strValueOf6.equalsIgnoreCase("null")) {
                        return;
                    }
                    e(Integer.parseInt(strValueOf6));
                }
            } catch (Exception e10) {
                q0.b("RenderViewModel", e10.getMessage());
            }
        }
    }

    public void b(int i10) {
        this.f13756b = i10;
    }

    public int c() {
        return this.f13756b;
    }

    public int d() {
        return this.f13757c;
    }

    public int e() {
        return this.f13760f;
    }

    public void f(int i10) {
        this.f13758d = i10;
    }

    public int g() {
        return this.f13758d;
    }

    public int b() {
        return this.f13759e;
    }

    public void c(int i10) {
        this.f13757c = i10;
    }

    public void d(int i10) {
        this.f13760f = i10;
    }

    public void e(int i10) {
        this.f13761g = i10;
    }

    public int f() {
        return this.f13761g;
    }

    public String a() {
        return this.f13755a;
    }

    public void a(String str) {
        this.f13755a = str;
    }

    public void a(int i10) {
        this.f13759e = i10;
    }
}
