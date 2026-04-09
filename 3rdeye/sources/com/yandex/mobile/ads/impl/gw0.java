package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jw0;

/* loaded from: classes3.dex */
final class gw0 {

    /* renamed from: a, reason: collision with root package name */
    public final jw0.b f28012a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28013b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28014c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28015d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28016e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28017f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28018g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28019h;
    public final boolean i;

    public gw0(jw0.b bVar, long j4, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        zf.a(!z13 || z11);
        zf.a(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        zf.a(z14);
        this.f28012a = bVar;
        this.f28013b = j4;
        this.f28014c = j10;
        this.f28015d = j11;
        this.f28016e = j12;
        this.f28017f = z10;
        this.f28018g = z11;
        this.f28019h = z12;
        this.i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gw0.class == obj.getClass()) {
            gw0 gw0Var = (gw0) obj;
            if (this.f28013b == gw0Var.f28013b && this.f28014c == gw0Var.f28014c && this.f28015d == gw0Var.f28015d && this.f28016e == gw0Var.f28016e && this.f28017f == gw0Var.f28017f && this.f28018g == gw0Var.f28018g && this.f28019h == gw0Var.f28019h && this.i == gw0Var.i && s82.a(this.f28012a, gw0Var.f28012a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f28012a.hashCode() + 527) * 31) + ((int) this.f28013b)) * 31) + ((int) this.f28014c)) * 31) + ((int) this.f28015d)) * 31) + ((int) this.f28016e)) * 31) + (this.f28017f ? 1 : 0)) * 31) + (this.f28018g ? 1 : 0)) * 31) + (this.f28019h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
