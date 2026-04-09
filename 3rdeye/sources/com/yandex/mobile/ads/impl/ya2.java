package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.List;

/* loaded from: classes3.dex */
public final class ya2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<mb2<ab1>> f35687a;

    /* renamed from: b, reason: collision with root package name */
    private final nf2 f35688b;

    /* renamed from: c, reason: collision with root package name */
    private final jj0 f35689c;

    public ya2(List<mb2<ab1>> videoAdsInfo, nf2 nf2Var, jj0 jj0Var) {
        kotlin.jvm.internal.l.f(videoAdsInfo, "videoAdsInfo");
        this.f35687a = videoAdsInfo;
        this.f35688b = nf2Var;
        this.f35689c = jj0Var;
    }

    public static ya2 a(ya2 ya2Var, List videoAdsInfo) {
        nf2 nf2Var = ya2Var.f35688b;
        jj0 jj0Var = ya2Var.f35689c;
        kotlin.jvm.internal.l.f(videoAdsInfo, "videoAdsInfo");
        return new ya2(videoAdsInfo, nf2Var, jj0Var);
    }

    public final mb2<ab1> b() {
        return (mb2) C2097r.p0(this.f35687a);
    }

    public final List<mb2<ab1>> c() {
        return this.f35687a;
    }

    public final nf2 d() {
        return this.f35688b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya2)) {
            return false;
        }
        ya2 ya2Var = (ya2) obj;
        return kotlin.jvm.internal.l.b(this.f35687a, ya2Var.f35687a) && kotlin.jvm.internal.l.b(this.f35688b, ya2Var.f35688b) && kotlin.jvm.internal.l.b(this.f35689c, ya2Var.f35689c);
    }

    public final int hashCode() {
        int iHashCode = this.f35687a.hashCode() * 31;
        nf2 nf2Var = this.f35688b;
        int iHashCode2 = (iHashCode + (nf2Var == null ? 0 : nf2Var.hashCode())) * 31;
        jj0 jj0Var = this.f35689c;
        return iHashCode2 + (jj0Var != null ? jj0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Video(videoAdsInfo=" + this.f35687a + ", videoSettings=" + this.f35688b + ", preview=" + this.f35689c + ")";
    }

    public final jj0 a() {
        return this.f35689c;
    }
}
