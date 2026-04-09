package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class xn1 {

    /* renamed from: a, reason: collision with root package name */
    private final tn1 f35364a;

    /* renamed from: b, reason: collision with root package name */
    private final List<zo0> f35365b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35366c;

    /* renamed from: d, reason: collision with root package name */
    private final w50 f35367d;

    /* renamed from: e, reason: collision with root package name */
    private final pp1 f35368e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35369f;

    /* renamed from: g, reason: collision with root package name */
    private final int f35370g;

    /* renamed from: h, reason: collision with root package name */
    private final int f35371h;
    private int i;

    /* JADX WARN: Multi-variable type inference failed */
    public xn1(tn1 call, List<? extends zo0> interceptors, int i, w50 w50Var, pp1 request, int i10, int i11, int i12) {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(interceptors, "interceptors");
        kotlin.jvm.internal.l.f(request, "request");
        this.f35364a = call;
        this.f35365b = interceptors;
        this.f35366c = i;
        this.f35367d = w50Var;
        this.f35368e = request;
        this.f35369f = i10;
        this.f35370g = i11;
        this.f35371h = i12;
    }

    public final tn1 a() {
        return this.f35364a;
    }

    public final tn1 b() {
        return this.f35364a;
    }

    public final int c() {
        return this.f35369f;
    }

    public final w50 d() {
        return this.f35367d;
    }

    public final int e() {
        return this.f35370g;
    }

    public final pp1 f() {
        return this.f35368e;
    }

    public final int g() {
        return this.f35371h;
    }

    public final int h() {
        return this.f35370g;
    }

    public final pp1 i() {
        return this.f35368e;
    }

    public static xn1 a(xn1 xn1Var, int i, w50 w50Var, pp1 pp1Var, int i10) {
        if ((i10 & 1) != 0) {
            i = xn1Var.f35366c;
        }
        int i11 = i;
        if ((i10 & 2) != 0) {
            w50Var = xn1Var.f35367d;
        }
        w50 w50Var2 = w50Var;
        if ((i10 & 4) != 0) {
            pp1Var = xn1Var.f35368e;
        }
        pp1 request = pp1Var;
        int i12 = xn1Var.f35369f;
        int i13 = xn1Var.f35370g;
        int i14 = xn1Var.f35371h;
        kotlin.jvm.internal.l.f(request, "request");
        return new xn1(xn1Var.f35364a, xn1Var.f35365b, i11, w50Var2, request, i12, i13, i14);
    }

    public final pq1 a(pp1 request) throws IOException {
        kotlin.jvm.internal.l.f(request, "request");
        if (this.f35366c < this.f35365b.size()) {
            this.i++;
            w50 w50Var = this.f35367d;
            if (w50Var != null) {
                if (w50Var.h().a(request.g())) {
                    if (this.i != 1) {
                        throw new IllegalStateException(("network interceptor " + this.f35365b.get(this.f35366c - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f35365b.get(this.f35366c - 1) + " must retain the same host and port").toString());
                }
            }
            xn1 xn1VarA = a(this, this.f35366c + 1, null, request, 58);
            zo0 zo0Var = this.f35365b.get(this.f35366c);
            pq1 pq1VarA = zo0Var.a(xn1VarA);
            if (pq1VarA != null) {
                if (this.f35367d != null && this.f35366c + 1 < this.f35365b.size() && xn1VarA.i != 1) {
                    throw new IllegalStateException(("network interceptor " + zo0Var + " must call proceed() exactly once").toString());
                }
                if (pq1VarA.a() != null) {
                    return pq1VarA;
                }
                throw new IllegalStateException(("interceptor " + zo0Var + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + zo0Var + " returned null");
        }
        throw new IllegalStateException("Check failed.");
    }
}
