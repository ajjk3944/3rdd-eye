package com.mbridge.msdk.setting;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private String f16906e;

    /* renamed from: f, reason: collision with root package name */
    private String f16907f;

    /* renamed from: g, reason: collision with root package name */
    private int f16908g;

    /* renamed from: a, reason: collision with root package name */
    private int f16902a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f16903b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f16904c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f16905d = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f16909h = 0;

    public static a a(String str) {
        Exception e10;
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a();
            try {
                aVar.b(jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f15172h));
                aVar.c(jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f15176l));
                aVar.e(jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.utils.d.h().f15180p));
                aVar.f(jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 0));
                aVar.a(jSONObject.optInt("batch_size", 1));
                aVar.c(jSONObject.optInt("duration", 0));
                aVar.b(jSONObject.optInt("disable", 0));
                aVar.d(jSONObject.optInt("e_t_l", 0));
                return aVar;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return aVar;
            }
        } catch (Exception e12) {
            e10 = e12;
            aVar = null;
        }
    }

    public int b() {
        return this.f16903b;
    }

    public int c() {
        return this.f16904c;
    }

    public int d() {
        return this.f16905d;
    }

    public String e() {
        return this.f16906e;
    }

    public String f() {
        return this.f16907f;
    }

    public int g() {
        return this.f16908g;
    }

    public int h() {
        return this.f16909h;
    }

    public void b(int i10) {
        this.f16903b = i10;
    }

    public void c(int i10) {
        this.f16904c = i10;
    }

    public void d(int i10) {
        this.f16905d = i10;
    }

    public void e(int i10) {
        this.f16908g = i10;
    }

    public void f(int i10) {
        this.f16909h = i10;
    }

    public void b(String str) {
        this.f16906e = str;
    }

    public void c(String str) {
        this.f16907f = str;
    }

    public int a() {
        return this.f16902a;
    }

    public void a(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f16902a = i10;
    }
}
