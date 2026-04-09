package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.so, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4959so {

    /* renamed from: a, reason: collision with root package name */
    public final vo f41652a;

    /* renamed from: b, reason: collision with root package name */
    public final vo f41653b;

    /* renamed from: c, reason: collision with root package name */
    public final to f41654c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f41655d;

    public C4959so(vo voVar, vo voVar2, to toVar) {
        this.f41652a = voVar;
        this.f41653b = voVar2;
        this.f41654c = toVar;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f41655d == null) {
                JSONObject jSONObjectA = this.f41654c.a(a(this.f41652a), a(this.f41653b));
                this.f41655d = jSONObjectA;
                a(jSONObjectA);
            }
            jSONObject = this.f41655d;
            if (jSONObject == null) {
                kotlin.jvm.internal.l.l("fileContents");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public static JSONObject a(vo voVar) {
        try {
            String strA = voVar.a();
            return strA != null ? new JSONObject(strA) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String string = jSONObject.toString();
        try {
            this.f41652a.a(string);
        } catch (Throwable unused) {
        }
        try {
            this.f41653b.a(string);
        } catch (Throwable unused2) {
        }
    }
}
