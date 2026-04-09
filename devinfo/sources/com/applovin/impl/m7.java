package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4500a;

    /* renamed from: b, reason: collision with root package name */
    private String f4501b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4502c = a(z4.f6318l);

    /* renamed from: d, reason: collision with root package name */
    private final String f4503d = a(z4.f6319m);

    /* renamed from: e, reason: collision with root package name */
    private String f4504e = (String) a5.a(z4.f6320n, (Object) null, com.applovin.impl.sdk.k.o());

    /* renamed from: f, reason: collision with root package name */
    private String f4505f = (String) a5.a(z4.f6321o, (Object) null, com.applovin.impl.sdk.k.o());

    public m7(com.applovin.impl.sdk.k kVar) {
        this.f4500a = kVar;
        a(f());
    }

    private String f() {
        if (!((Boolean) this.f4500a.a(x4.K3)).booleanValue()) {
            this.f4500a.c(z4.f6317k);
        }
        String str = (String) this.f4500a.a(z4.f6317k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f4500a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4500a.O().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f4503d;
    }

    public String b() {
        return this.f4504e;
    }

    public String c() {
        return this.f4502c;
    }

    public String d() {
        return this.f4505f;
    }

    public String e() {
        return this.f4501b;
    }

    private String a(z4 z4Var) {
        String str = (String) a5.a(z4Var, (Object) null, com.applovin.impl.sdk.k.o());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a5.b(z4Var, lowerCase, com.applovin.impl.sdk.k.o());
        return lowerCase;
    }

    public void b(String str) {
        this.f4504e = str;
        a5.b(z4.f6320n, str, com.applovin.impl.sdk.k.o());
    }

    public void c(String str) {
        this.f4505f = str;
        a5.b(z4.f6321o, str, com.applovin.impl.sdk.k.o());
    }

    public void a(String str) {
        if (((Boolean) this.f4500a.a(x4.K3)).booleanValue()) {
            this.f4500a.b(z4.f6317k, str);
        }
        this.f4501b = str;
        this.f4500a.t().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        z4 z4Var = z4.f6322p;
        String str = (String) kVar.a(z4Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(z4Var, strValueOf);
        return strValueOf;
    }
}
