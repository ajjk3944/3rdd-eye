package com.google.android.exoplayer2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4335a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f4336b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f4337c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f4338d;

    /* renamed from: e, reason: collision with root package name */
    public final k0 f4339e;

    static {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        p0 p0Var = p0.f4365s;
    }

    public n0(String str, k0 k0Var, m0 m0Var, l0 l0Var, p0 p0Var) {
        this.f4335a = str;
        this.f4336b = m0Var;
        this.f4337c = l0Var;
        this.f4338d = p0Var;
        this.f4339e = k0Var;
    }

    public static n0 b(Uri uri) {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        return new n0("", new k0(Long.MIN_VALUE), uri != null ? new m0(uri, null, null, null, list, list, null) : null, new l0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), p0.f4365s);
    }

    public final j0 a() {
        j0 j0Var = new j0();
        j0Var.f4187d = Long.MIN_VALUE;
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        j0Var.f4188e = list;
        j0Var.f4189f = list;
        j0Var.f4192i = -9223372036854775807L;
        j0Var.j = -9223372036854775807L;
        j0Var.k = -9223372036854775807L;
        j0Var.f4193l = -3.4028235E38f;
        j0Var.f4194m = -3.4028235E38f;
        j0Var.f4187d = this.f4339e.f4213a;
        j0Var.f4184a = this.f4335a;
        j0Var.f4191h = this.f4338d;
        l0 l0Var = this.f4337c;
        j0Var.f4192i = l0Var.f4228a;
        j0Var.j = l0Var.f4229b;
        j0Var.k = l0Var.f4230c;
        j0Var.f4193l = l0Var.f4231d;
        j0Var.f4194m = l0Var.f4232e;
        m0 m0Var = this.f4336b;
        if (m0Var != null) {
            j0Var.f4186c = m0Var.f4235b;
            j0Var.f4185b = m0Var.f4234a;
            j0Var.f4188e = m0Var.f4236c;
            j0Var.f4189f = m0Var.f4237d;
            j0Var.f4190g = m0Var.f4238e;
        }
        return j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return qb.v.a(this.f4335a, n0Var.f4335a) && this.f4339e.equals(n0Var.f4339e) && qb.v.a(this.f4336b, n0Var.f4336b) && qb.v.a(this.f4337c, n0Var.f4337c) && qb.v.a(this.f4338d, n0Var.f4338d);
    }

    public final int hashCode() {
        int iHashCode = this.f4335a.hashCode() * 31;
        m0 m0Var = this.f4336b;
        return this.f4338d.hashCode() + ((this.f4339e.hashCode() + ((this.f4337c.hashCode() + ((iHashCode + (m0Var != null ? m0Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
