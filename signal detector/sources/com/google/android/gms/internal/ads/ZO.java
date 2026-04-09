package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class ZO {

    /* renamed from: a, reason: collision with root package name */
    public final int f12882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12883b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12884c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12885d;

    /* renamed from: e, reason: collision with root package name */
    public final C0729Sj f12886e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12887f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12888g;

    public /* synthetic */ ZO(J0 j02) {
        this.f12882a = j02.f9208a;
        this.f12883b = j02.f9209b;
        this.f12884c = j02.f9210c;
        this.f12885d = j02.f9211d;
        this.f12886e = (C0729Sj) j02.f9214g;
        this.f12887f = j02.f9212e;
        this.f12888g = j02.f9213f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ZO.class == obj.getClass()) {
            ZO zo = (ZO) obj;
            if (this.f12882a == zo.f12882a && this.f12883b == zo.f12883b && this.f12884c == zo.f12884c && this.f12885d == zo.f12885d && this.f12887f == zo.f12887f && this.f12888g == zo.f12888g && this.f12886e.equals(zo.f12886e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f12882a);
        Integer numValueOf2 = Integer.valueOf(this.f12883b);
        Integer numValueOf3 = Integer.valueOf(this.f12884c);
        Integer numValueOf4 = Integer.valueOf(this.f12885d);
        Integer numValueOf5 = Integer.valueOf(this.f12887f);
        Integer numValueOf6 = Integer.valueOf(this.f12888g);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, numValueOf4, this.f12886e, numValueOf5, numValueOf6, bool, bool);
    }
}
