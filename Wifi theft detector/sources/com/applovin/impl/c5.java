package com.applovin.impl;

import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public class c5 {

    /* renamed from: a, reason: collision with root package name */
    private final d5 f5652a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5653b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5654c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5655d;

    /* renamed from: e, reason: collision with root package name */
    private final MaxError f5656e;

    /* renamed from: f, reason: collision with root package name */
    private final long f5657f;

    /* renamed from: g, reason: collision with root package name */
    private final long f5658g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5659h;

    public interface a {
        void a(c5 c5Var);
    }

    private c5(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j10, long j11) {
        this(d5Var, str, maxError, j10, j11, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, long j10, long j11) {
        if (d5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new c5(d5Var, hVar, str, null, j10, j11);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.f5658g;
    }

    public MaxError c() {
        return this.f5656e;
    }

    public String d() {
        return this.f5653b;
    }

    public String e() {
        return this.f5655d;
    }

    public d5 f() {
        return this.f5652a;
    }

    public boolean g() {
        return this.f5659h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f5652a);
        sb.append(", mSdkVersion='");
        sb.append(this.f5653b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.f5654c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.f5655d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        MaxError maxError = this.f5656e;
        sb.append(maxError != null ? maxError.getMessage() : "");
        sb.append('}');
        return sb.toString();
    }

    private c5(d5 d5Var, String str, MaxError maxError, long j10, long j11, String str2, String str3, boolean z10) {
        this.f5652a = d5Var;
        this.f5655d = str;
        this.f5656e = maxError;
        this.f5657f = j10;
        this.f5658g = j11;
        this.f5653b = str2;
        this.f5654c = str3;
        this.f5659h = z10;
    }

    public static c5 a(d5 d5Var, MaxError maxError) {
        return a(d5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j10, long j11) {
        if (d5Var != null) {
            return new c5(d5Var, hVar, null, maxError, j10, j11);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static c5 a(c5 c5Var) {
        return new c5(c5Var.f(), c5Var.e(), c5Var.c(), c5Var.f5657f, c5Var.f5658g, c5Var.d(), c5Var.a(), true);
    }

    public String a() {
        return this.f5654c;
    }
}
