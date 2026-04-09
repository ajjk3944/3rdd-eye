package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.o;
import s3.AbstractC7900o;
import s3.AbstractC7901p;
import s3.C7903s;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f38911a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38912b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38913c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38914d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38915e;

    /* renamed from: f, reason: collision with root package name */
    private final String f38916f;

    /* renamed from: g, reason: collision with root package name */
    private final String f38917g;

    private m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC7901p.p(!o.a(str), "ApplicationId must be set.");
        this.f38912b = str;
        this.f38911a = str2;
        this.f38913c = str3;
        this.f38914d = str4;
        this.f38915e = str5;
        this.f38916f = str6;
        this.f38917g = str7;
    }

    public static m a(Context context) {
        C7903s c7903s = new C7903s(context);
        String strA = c7903s.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new m(strA, c7903s.a("google_api_key"), c7903s.a("firebase_database_url"), c7903s.a("ga_trackingId"), c7903s.a("gcm_defaultSenderId"), c7903s.a("google_storage_bucket"), c7903s.a("project_id"));
    }

    public String b() {
        return this.f38911a;
    }

    public String c() {
        return this.f38912b;
    }

    public String d() {
        return this.f38915e;
    }

    public String e() {
        return this.f38917g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC7900o.a(this.f38912b, mVar.f38912b) && AbstractC7900o.a(this.f38911a, mVar.f38911a) && AbstractC7900o.a(this.f38913c, mVar.f38913c) && AbstractC7900o.a(this.f38914d, mVar.f38914d) && AbstractC7900o.a(this.f38915e, mVar.f38915e) && AbstractC7900o.a(this.f38916f, mVar.f38916f) && AbstractC7900o.a(this.f38917g, mVar.f38917g);
    }

    public int hashCode() {
        return AbstractC7900o.b(this.f38912b, this.f38911a, this.f38913c, this.f38914d, this.f38915e, this.f38916f, this.f38917g);
    }

    public String toString() {
        return AbstractC7900o.c(this).a("applicationId", this.f38912b).a("apiKey", this.f38911a).a("databaseUrl", this.f38913c).a("gcmSenderId", this.f38915e).a("storageBucket", this.f38916f).a("projectId", this.f38917g).toString();
    }
}
