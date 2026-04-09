package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class xk {

    /* renamed from: a, reason: collision with root package name */
    private final ns f35339a;

    /* renamed from: b, reason: collision with root package name */
    private final vy1 f35340b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f35341c;

    public xk(ns nsVar, vy1 vy1Var, Map<String, String> parameters) {
        kotlin.jvm.internal.l.f(parameters, "parameters");
        this.f35339a = nsVar;
        this.f35340b = vy1Var;
        this.f35341c = parameters;
    }

    public final ns a() {
        return this.f35339a;
    }

    public final Map<String, String> b() {
        return this.f35341c;
    }

    public final vy1 c() {
        return this.f35340b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk)) {
            return false;
        }
        xk xkVar = (xk) obj;
        return this.f35339a == xkVar.f35339a && kotlin.jvm.internal.l.b(this.f35340b, xkVar.f35340b) && kotlin.jvm.internal.l.b(this.f35341c, xkVar.f35341c);
    }

    public final int hashCode() {
        ns nsVar = this.f35339a;
        int iHashCode = (nsVar == null ? 0 : nsVar.hashCode()) * 31;
        vy1 vy1Var = this.f35340b;
        return this.f35341c.hashCode() + ((iHashCode + (vy1Var != null ? vy1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BidderTokenRequestData(adType=" + this.f35339a + ", sizeInfo=" + this.f35340b + ", parameters=" + this.f35341c + ")";
    }
}
