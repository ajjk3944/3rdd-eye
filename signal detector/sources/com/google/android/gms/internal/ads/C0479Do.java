package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Do, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479Do {

    /* renamed from: a, reason: collision with root package name */
    public final String f7839a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7840b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7841c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7842d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7843e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7844f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7845g;

    public C0479Do(String str, String str2, boolean z6, int i, String str3, int i3, String str4) {
        this.f7839a = str;
        this.f7840b = str2;
        this.f7841c = str3;
        this.f7842d = i;
        this.f7843e = str4;
        this.f7844f = i3;
        this.f7845g = z6;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f7839a);
        jSONObject.put("version", this.f7841c);
        E9 e9 = H9.Ba;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f7840b);
        }
        jSONObject.put("status", this.f7842d);
        jSONObject.put("description", this.f7843e);
        jSONObject.put("initializationLatencyMillis", this.f7844f);
        if (((Boolean) c2841s.f23270c.a(H9.Ca)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f7845g);
        }
        return jSONObject;
    }
}
