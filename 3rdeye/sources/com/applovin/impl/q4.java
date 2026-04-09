package com.applovin.impl;

import N7.B8;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public class q4 {

    /* renamed from: a, reason: collision with root package name */
    private final r4 f20791a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20792b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20793c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20794d;

    /* renamed from: e, reason: collision with root package name */
    private final MaxError f20795e;

    /* renamed from: f, reason: collision with root package name */
    private final long f20796f;

    /* renamed from: g, reason: collision with root package name */
    private final long f20797g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f20798h;

    public interface a {
        void a(q4 q4Var);
    }

    private q4(r4 r4Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j4, long j10) {
        this(r4Var, str, maxError, j4, j10, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static q4 a(r4 r4Var, com.applovin.impl.mediation.h hVar, String str, long j4, long j10) {
        if (r4Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new q4(r4Var, hVar, str, null, j4, j10);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.f20797g;
    }

    public MaxError c() {
        return this.f20795e;
    }

    public String d() {
        return this.f20792b;
    }

    public String e() {
        return this.f20794d;
    }

    public r4 f() {
        return this.f20791a;
    }

    public boolean g() {
        return this.f20798h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f20791a);
        sb.append(", mSdkVersion='");
        sb.append(this.f20792b);
        sb.append("', mAdapterVersion='");
        sb.append(this.f20793c);
        sb.append("', mSignalDataLength='");
        String str = this.f20794d;
        sb.append(str != null ? str.length() : 0);
        sb.append("', mErrorMessage=");
        MaxError maxError = this.f20795e;
        return B8.j(sb, maxError != null ? maxError.getMessage() : "", '}');
    }

    private q4(r4 r4Var, String str, MaxError maxError, long j4, long j10, String str2, String str3, boolean z10) {
        this.f20791a = r4Var;
        this.f20794d = str;
        this.f20795e = maxError;
        this.f20796f = j4;
        this.f20797g = j10;
        this.f20792b = str2;
        this.f20793c = str3;
        this.f20798h = z10;
    }

    public static q4 a(r4 r4Var, MaxError maxError) {
        return a(r4Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static q4 a(r4 r4Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j4, long j10) {
        if (r4Var != null) {
            return new q4(r4Var, hVar, null, maxError, j4, j10);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static q4 a(q4 q4Var) {
        return new q4(q4Var.f(), q4Var.e(), q4Var.c(), q4Var.f20796f, q4Var.f20797g, q4Var.d(), q4Var.a(), true);
    }

    public String a() {
        return this.f20793c;
    }
}
