package com.applovin.impl;

import com.applovin.mediation.MaxError;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c5 {

    /* renamed from: a, reason: collision with root package name */
    private final d5 f3818a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3819b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3820c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3821d;

    /* renamed from: e, reason: collision with root package name */
    private final MaxError f3822e;

    /* renamed from: f, reason: collision with root package name */
    private final long f3823f;
    private final long g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f3824h;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void a(c5 c5Var);
    }

    private c5(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j, long j8) {
        this(d5Var, str, maxError, j, j8, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, long j, long j8) {
        if (d5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new c5(d5Var, hVar, str, null, j, j8);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.g;
    }

    public MaxError c() {
        return this.f3822e;
    }

    public String d() {
        return this.f3819b;
    }

    public String e() {
        return this.f3821d;
    }

    public d5 f() {
        return this.f3818a;
    }

    public boolean g() {
        return this.f3824h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.f3818a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f3819b);
        sb2.append("', mAdapterVersion='");
        sb2.append(this.f3820c);
        sb2.append("', mSignalDataLength='");
        String str = this.f3821d;
        sb2.append(str != null ? str.length() : 0);
        sb2.append("', mErrorMessage=");
        MaxError maxError = this.f3822e;
        return r5.c.l(sb2, maxError != null ? maxError.getMessage() : "", '}');
    }

    private c5(d5 d5Var, String str, MaxError maxError, long j, long j8, String str2, String str3, boolean z3) {
        this.f3818a = d5Var;
        this.f3821d = str;
        this.f3822e = maxError;
        this.f3823f = j;
        this.g = j8;
        this.f3819b = str2;
        this.f3820c = str3;
        this.f3824h = z3;
    }

    public static c5 a(d5 d5Var, MaxError maxError) {
        return a(d5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j, long j8) {
        if (d5Var != null) {
            return new c5(d5Var, hVar, null, maxError, j, j8);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static c5 a(c5 c5Var) {
        return new c5(c5Var.f(), c5Var.e(), c5Var.c(), c5Var.f3823f, c5Var.g, c5Var.d(), c5Var.a(), true);
    }

    public String a() {
        return this.f3820c;
    }
}
