package com.google.android.exoplayer2;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f4234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4235b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4236c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4237d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4238e;

    public m0(Uri uri, String str, lf.t1 t1Var, kc.f fVar, List list, List list2, Object obj) {
        this.f4234a = uri;
        this.f4235b = str;
        this.f4236c = list;
        this.f4237d = list2;
        this.f4238e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f4234a.equals(m0Var.f4234a) && qb.v.a(this.f4235b, m0Var.f4235b) && qb.v.a(null, null) && qb.v.a(null, null) && this.f4236c.equals(m0Var.f4236c) && this.f4237d.equals(m0Var.f4237d) && qb.v.a(this.f4238e, m0Var.f4238e);
    }

    public final int hashCode() {
        int iHashCode = this.f4234a.hashCode() * 31;
        String str = this.f4235b;
        int iHashCode2 = (this.f4237d.hashCode() + ((this.f4236c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31;
        Object obj = this.f4238e;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }
}
