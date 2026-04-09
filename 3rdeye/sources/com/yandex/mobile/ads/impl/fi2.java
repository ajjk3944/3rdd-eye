package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public class fi2 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final nc1 f27346b;

    public fi2() {
        this.f27346b = null;
    }

    public fi2(nc1 nc1Var) {
        this.f27346b = nc1Var;
    }

    public fi2(Exception exc) {
        super("Failed to parse response", exc);
        this.f27346b = null;
    }

    public fi2(String str) {
        super(str);
        this.f27346b = null;
    }

    public fi2(Throwable th) {
        super(th);
        this.f27346b = null;
    }
}
