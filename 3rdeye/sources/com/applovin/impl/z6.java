package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21907a;

    /* renamed from: b, reason: collision with root package name */
    private String f21908b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21909c = a(n4.f20576j);

    /* renamed from: d, reason: collision with root package name */
    private final String f21910d = a(n4.f20577k);

    /* renamed from: e, reason: collision with root package name */
    private String f21911e = (String) o4.a(n4.f20578l, (Object) null, com.applovin.impl.sdk.k.o());

    /* renamed from: f, reason: collision with root package name */
    private String f21912f = (String) o4.a(n4.f20579m, (Object) null, com.applovin.impl.sdk.k.o());

    public z6(com.applovin.impl.sdk.k kVar) {
        this.f21907a = kVar;
        a(f());
    }

    private String f() {
        if (!((Boolean) this.f21907a.a(l4.f19697A3)).booleanValue()) {
            this.f21907a.c(n4.i);
        }
        String str = (String) this.f21907a.a(n4.i);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f21907a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21907a.O().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f21910d;
    }

    public String b() {
        return this.f21911e;
    }

    public String c() {
        return this.f21909c;
    }

    public String d() {
        return this.f21912f;
    }

    public String e() {
        return this.f21908b;
    }

    private String a(n4 n4Var) {
        String str = (String) o4.a(n4Var, (Object) null, com.applovin.impl.sdk.k.o());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        o4.b(n4Var, lowerCase, com.applovin.impl.sdk.k.o());
        return lowerCase;
    }

    public void b(String str) {
        this.f21911e = str;
        o4.b(n4.f20578l, str, com.applovin.impl.sdk.k.o());
    }

    public void c(String str) {
        this.f21912f = str;
        o4.b(n4.f20579m, str, com.applovin.impl.sdk.k.o());
    }

    public void a(String str) {
        if (((Boolean) this.f21907a.a(l4.f19697A3)).booleanValue()) {
            this.f21907a.b(n4.i, str);
        }
        this.f21908b = str;
        this.f21907a.u().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        n4 n4Var = n4.f20580n;
        String str = (String) kVar.a(n4Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(n4Var, strValueOf);
        return strValueOf;
    }
}
