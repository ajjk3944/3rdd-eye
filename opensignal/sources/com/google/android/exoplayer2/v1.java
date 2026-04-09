package com.google.android.exoplayer2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: r, reason: collision with root package name */
    public static final Object f4738r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final n0 f4739s;

    /* renamed from: b, reason: collision with root package name */
    public Object f4741b;

    /* renamed from: d, reason: collision with root package name */
    public Object f4743d;

    /* renamed from: e, reason: collision with root package name */
    public long f4744e;

    /* renamed from: f, reason: collision with root package name */
    public long f4745f;

    /* renamed from: g, reason: collision with root package name */
    public long f4746g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4747h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4748i;
    public boolean j;
    public l0 k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4749l;

    /* renamed from: m, reason: collision with root package name */
    public long f4750m;

    /* renamed from: n, reason: collision with root package name */
    public long f4751n;

    /* renamed from: o, reason: collision with root package name */
    public int f4752o;

    /* renamed from: p, reason: collision with root package name */
    public int f4753p;

    /* renamed from: q, reason: collision with root package name */
    public long f4754q;

    /* renamed from: a, reason: collision with root package name */
    public Object f4740a = f4738r;

    /* renamed from: c, reason: collision with root package name */
    public n0 f4742c = f4739s;

    static {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        f4739s = new n0("com.google.android.exoplayer2.Timeline", new k0(Long.MIN_VALUE), uri != null ? new m0(uri, null, null, null, list, list, null) : null, new l0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), p0.f4365s);
    }

    public final boolean a() {
        qb.b.j(this.j == (this.k != null));
        return this.k != null;
    }

    public final void b(n0 n0Var, Object obj, long j, long j7, long j10, boolean z10, boolean z11, l0 l0Var, long j11, long j12, int i10, long j13) {
        m0 m0Var;
        this.f4740a = f4738r;
        this.f4742c = n0Var != null ? n0Var : f4739s;
        this.f4741b = (n0Var == null || (m0Var = n0Var.f4336b) == null) ? null : m0Var.f4238e;
        this.f4743d = obj;
        this.f4744e = j;
        this.f4745f = j7;
        this.f4746g = j10;
        this.f4747h = z10;
        this.f4748i = z11;
        this.j = l0Var != null;
        this.k = l0Var;
        this.f4750m = j11;
        this.f4751n = j12;
        this.f4752o = 0;
        this.f4753p = i10;
        this.f4754q = j13;
        this.f4749l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !v1.class.equals(obj.getClass())) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return qb.v.a(this.f4740a, v1Var.f4740a) && qb.v.a(this.f4742c, v1Var.f4742c) && qb.v.a(this.f4743d, v1Var.f4743d) && qb.v.a(this.k, v1Var.k) && this.f4744e == v1Var.f4744e && this.f4745f == v1Var.f4745f && this.f4746g == v1Var.f4746g && this.f4747h == v1Var.f4747h && this.f4748i == v1Var.f4748i && this.f4749l == v1Var.f4749l && this.f4750m == v1Var.f4750m && this.f4751n == v1Var.f4751n && this.f4752o == v1Var.f4752o && this.f4753p == v1Var.f4753p && this.f4754q == v1Var.f4754q;
    }

    public final int hashCode() {
        int iHashCode = (this.f4742c.hashCode() + ((this.f4740a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f4743d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        l0 l0Var = this.k;
        int iHashCode3 = (iHashCode2 + (l0Var != null ? l0Var.hashCode() : 0)) * 31;
        long j = this.f4744e;
        int i10 = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j7 = this.f4745f;
        int i11 = (i10 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j10 = this.f4746g;
        int i12 = (((((((i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f4747h ? 1 : 0)) * 31) + (this.f4748i ? 1 : 0)) * 31) + (this.f4749l ? 1 : 0)) * 31;
        long j11 = this.f4750m;
        int i13 = (i12 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f4751n;
        int i14 = (((((i13 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f4752o) * 31) + this.f4753p) * 31;
        long j13 = this.f4754q;
        return i14 + ((int) (j13 ^ (j13 >>> 32)));
    }
}
