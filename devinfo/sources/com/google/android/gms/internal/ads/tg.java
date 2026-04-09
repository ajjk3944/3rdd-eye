package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tg {

    /* renamed from: a, reason: collision with root package name */
    public Object f16809a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16810b;

    /* renamed from: c, reason: collision with root package name */
    public int f16811c;

    /* renamed from: d, reason: collision with root package name */
    public long f16812d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16813e;

    /* renamed from: f, reason: collision with root package name */
    public mu f16814f = mu.f14017b;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final void a(Object obj, Object obj2, int i4, long j, boolean z3) {
        mu muVar = mu.f14017b;
        this.f16809a = obj;
        this.f16810b = obj2;
        this.f16811c = i4;
        this.f16812d = j;
        this.f16814f = muVar;
        this.f16813e = z3;
    }

    public final long b(int i4, int i10) {
        a aVarA = this.f16814f.a(i4);
        if (aVarA.f9148a != -1) {
            return aVarA.f9152e[i10];
        }
        return -9223372036854775807L;
    }

    public final void c(int i4) {
        this.f16814f.a(i4).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !tg.class.equals(obj.getClass())) {
            return false;
        }
        tg tgVar = (tg) obj;
        return Objects.equals(this.f16809a, tgVar.f16809a) && Objects.equals(this.f16810b, tgVar.f16810b) && this.f16811c == tgVar.f16811c && this.f16812d == tgVar.f16812d && this.f16813e == tgVar.f16813e && Objects.equals(this.f16814f, tgVar.f16814f);
    }

    public final int hashCode() {
        Object obj = this.f16809a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f16810b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f16811c;
        long j = this.f16812d;
        return this.f16814f.hashCode() + (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.f16813e ? 1 : 0)) * 31);
    }
}
