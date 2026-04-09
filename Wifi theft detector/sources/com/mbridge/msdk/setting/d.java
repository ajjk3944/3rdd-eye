package com.mbridge.msdk.setting;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: f, reason: collision with root package name */
    private String f17011f;

    /* renamed from: g, reason: collision with root package name */
    private String f17012g;

    /* renamed from: h, reason: collision with root package name */
    private int f17013h;

    /* renamed from: a, reason: collision with root package name */
    private int f17006a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f17007b = 1;

    /* renamed from: c, reason: collision with root package name */
    private int f17008c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f17009d = 30;

    /* renamed from: e, reason: collision with root package name */
    private int f17010e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f17014i = 0;

    public static d a(String str) {
        Exception e10;
        d dVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar = new d();
            try {
                dVar.b(jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f15169f));
                dVar.c(jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f15175k));
                dVar.c(jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.utils.d.h().f15179o));
                dVar.d(jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 1));
                dVar.b(jSONObject.optInt("d_t", 30));
                dVar.a(jSONObject.optInt("d_a", 0));
                return dVar;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return dVar;
            }
        } catch (Exception e12) {
            e10 = e12;
            dVar = null;
        }
    }

    public int b() {
        return this.f17009d;
    }

    public String c() {
        return this.f17011f;
    }

    public String d() {
        return this.f17012g;
    }

    public int e() {
        return this.f17013h;
    }

    public void b(int i10) {
        this.f17009d = i10;
    }

    public void c(String str) {
        this.f17012g = str;
    }

    public void d(int i10) {
        this.f17014i = i10;
    }

    public void b(String str) {
        this.f17011f = str;
    }

    public void c(int i10) {
        this.f17013h = i10;
    }

    public int a() {
        return this.f17008c;
    }

    public void a(int i10) {
        this.f17008c = i10;
    }
}
