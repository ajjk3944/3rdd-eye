package com.mbridge.msdk.config.component.wx.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f13796a;

    /* renamed from: b, reason: collision with root package name */
    private String f13797b;

    /* renamed from: c, reason: collision with root package name */
    private String f13798c;

    /* renamed from: d, reason: collision with root package name */
    private String f13799d;

    /* renamed from: e, reason: collision with root package name */
    private String f13800e;

    /* renamed from: f, reason: collision with root package name */
    private String f13801f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.a("145"));
            if (obj != null) {
                e(String.valueOf(obj));
            }
            Object obj2 = map.get(c.a("147"));
            if (obj2 != null) {
                c(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.a("148"));
            if (obj3 != null) {
                d(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.a("193"));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.a("146"));
            if (obj5 != null) {
                b(String.valueOf(obj5));
            }
        }
    }

    public Context b() {
        return this.f13796a;
    }

    public String c() {
        return this.f13798c;
    }

    public String d() {
        return this.f13799d;
    }

    public String e() {
        return this.f13797b;
    }

    public void b(String str) {
        this.f13801f = str;
    }

    public void c(String str) {
        this.f13798c = str;
    }

    public void d(String str) {
        this.f13799d = str;
    }

    public void e(String str) {
        this.f13797b = str;
    }

    public void a(Context context) {
        this.f13796a = context;
    }

    public String a() {
        return this.f13800e;
    }

    public void a(String str) {
        this.f13800e = str;
    }
}
