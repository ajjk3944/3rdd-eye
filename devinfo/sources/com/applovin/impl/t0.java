package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f5761a = new StringBuilder();

    public void a(v0 v0Var, long j) {
        if (v0Var.d() == v0.b.DECISION) {
            return;
        }
        a(a(v0Var), j);
    }

    public void b() {
        a("Invalid Activity");
    }

    public String toString() {
        return this.f5761a.toString();
    }

    public void b(String str) {
        a(je.u.t("Invalid state: ", str));
    }

    public void a(v0 v0Var, boolean z3, long j) {
        a(a(v0Var) + ": " + z3, j);
    }

    public void a() {
        this.f5761a.setLength(0);
    }

    private void a(String str, long j) {
        a(str + " after " + j + "ms");
    }

    private void a(String str) {
        StringBuilder sb2 = this.f5761a;
        sb2.append(str);
        sb2.append("\n");
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
