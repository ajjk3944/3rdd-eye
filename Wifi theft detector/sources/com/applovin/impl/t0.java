package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v0;

/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f8132a = new StringBuilder();

    public void a(v0 v0Var, long j10) {
        if (v0Var.d() == v0.b.DECISION) {
            return;
        }
        a(a(v0Var), j10);
    }

    public void b() {
        a("Invalid Activity");
    }

    public String toString() {
        return this.f8132a.toString();
    }

    public void b(String str) {
        a("Invalid state: " + str);
    }

    public void a(v0 v0Var, boolean z10, long j10) {
        a(a(v0Var) + ": " + z10, j10);
    }

    public void a() {
        this.f8132a.setLength(0);
    }

    private void a(String str, long j10) {
        a(str + " after " + j10 + "ms");
    }

    private void a(String str) {
        StringBuilder sb = this.f8132a;
        sb.append(str);
        sb.append("\n");
    }

    private String a(v0 v0Var) {
        v0.b bVarD = v0Var.d();
        if (bVarD == v0.b.EVENT) {
            return ((y0) v0Var).g();
        }
        if (bVarD == v0.b.DECISION) {
            return StringUtils.emptyIfNull(v0Var.b());
        }
        return StringUtils.emptyIfNull(v0Var.e());
    }
}
