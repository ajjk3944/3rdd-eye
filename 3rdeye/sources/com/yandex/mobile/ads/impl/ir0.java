package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.util.List;

/* loaded from: classes3.dex */
public final class ir0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<InterfaceC4200t> f28841a;

    /* renamed from: b, reason: collision with root package name */
    private final h80 f28842b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f28843c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28844d;

    /* renamed from: e, reason: collision with root package name */
    private final long f28845e;

    /* JADX WARN: Multi-variable type inference failed */
    public ir0(List<? extends InterfaceC4200t> list, h80 h80Var, List<String> trackingUrls, String str, long j4) {
        kotlin.jvm.internal.l.f(trackingUrls, "trackingUrls");
        this.f28841a = list;
        this.f28842b = h80Var;
        this.f28843c = trackingUrls;
        this.f28844d = str;
        this.f28845e = j4;
    }

    public final List<InterfaceC4200t> a() {
        return this.f28841a;
    }

    public final long b() {
        return this.f28845e;
    }

    public final h80 c() {
        return this.f28842b;
    }

    public final List<String> d() {
        return this.f28843c;
    }

    public final String e() {
        return this.f28844d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir0)) {
            return false;
        }
        ir0 ir0Var = (ir0) obj;
        return kotlin.jvm.internal.l.b(this.f28841a, ir0Var.f28841a) && kotlin.jvm.internal.l.b(this.f28842b, ir0Var.f28842b) && kotlin.jvm.internal.l.b(this.f28843c, ir0Var.f28843c) && kotlin.jvm.internal.l.b(this.f28844d, ir0Var.f28844d) && this.f28845e == ir0Var.f28845e;
    }

    public final int hashCode() {
        List<InterfaceC4200t> list = this.f28841a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        h80 h80Var = this.f28842b;
        int iA = m9.a(this.f28843c, (iHashCode + (h80Var == null ? 0 : h80Var.hashCode())) * 31, 31);
        String str = this.f28844d;
        int iHashCode2 = (iA + (str != null ? str.hashCode() : 0)) * 31;
        long j4 = this.f28845e;
        return ((int) (j4 ^ (j4 >>> 32))) + iHashCode2;
    }

    public final String toString() {
        List<InterfaceC4200t> list = this.f28841a;
        h80 h80Var = this.f28842b;
        List<String> list2 = this.f28843c;
        String str = this.f28844d;
        long j4 = this.f28845e;
        StringBuilder sb = new StringBuilder("Link(actions=");
        sb.append(list);
        sb.append(", falseClick=");
        sb.append(h80Var);
        sb.append(", trackingUrls=");
        sb.append(list2);
        sb.append(", url=");
        sb.append(str);
        sb.append(", clickableDelay=");
        return C1094a9.f(sb, j4, ")");
    }
}
