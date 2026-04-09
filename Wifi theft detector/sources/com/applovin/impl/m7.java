package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6485a;

    /* renamed from: b, reason: collision with root package name */
    private String f6486b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6487c = a(z4.f8785l);

    /* renamed from: d, reason: collision with root package name */
    private final String f6488d = a(z4.f8786m);

    /* renamed from: e, reason: collision with root package name */
    private String f6489e = (String) a5.a(z4.f8787n, (Object) null, com.applovin.impl.sdk.k.o());

    /* renamed from: f, reason: collision with root package name */
    private String f6490f = (String) a5.a(z4.f8788o, (Object) null, com.applovin.impl.sdk.k.o());

    public m7(com.applovin.impl.sdk.k kVar) {
        this.f6485a = kVar;
        a(f());
    }

    private String f() {
        if (!((Boolean) this.f6485a.a(x4.K3)).booleanValue()) {
            this.f6485a.c(z4.f8784k);
        }
        String str = (String) this.f6485a.a(z4.f8784k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f6485a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6485a.O().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f6488d;
    }

    public String b() {
        return this.f6489e;
    }

    public String c() {
        return this.f6487c;
    }

    public String d() {
        return this.f6490f;
    }

    public String e() {
        return this.f6486b;
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
        this.f6489e = str;
        a5.b(z4.f8787n, str, com.applovin.impl.sdk.k.o());
    }

    public void c(String str) {
        this.f6490f = str;
        a5.b(z4.f8788o, str, com.applovin.impl.sdk.k.o());
    }

    public void a(String str) {
        if (((Boolean) this.f6485a.a(x4.K3)).booleanValue()) {
            this.f6485a.b(z4.f8784k, str);
        }
        this.f6486b = str;
        this.f6485a.t().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        z4 z4Var = z4.f8789p;
        String str = (String) kVar.a(z4Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(z4Var, strValueOf);
        return strValueOf;
    }
}
