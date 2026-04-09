package com.google.android.gms.internal.ads;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fh {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f11162m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final h5 f11163n;

    /* renamed from: a, reason: collision with root package name */
    public Object f11164a = f11162m;

    /* renamed from: b, reason: collision with root package name */
    public h5 f11165b = f11163n;

    /* renamed from: c, reason: collision with root package name */
    public long f11166c;

    /* renamed from: d, reason: collision with root package name */
    public long f11167d;

    /* renamed from: e, reason: collision with root package name */
    public long f11168e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11169f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public a2 f11170h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11171i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f11172k;

    /* renamed from: l, reason: collision with root package name */
    public int f11173l;

    static {
        v41 v41Var = x41.f18307b;
        u51 u51Var = u51.f17096e;
        List list = Collections.EMPTY_LIST;
        u51 u51Var2 = u51.f17096e;
        w3 w3Var = w3.f17852a;
        Uri uri = Uri.EMPTY;
        f11163n = new h5("androidx.media3.common.Timeline", new g0(), uri != null ? new o2(uri, u51Var2) : null, new a2(), j7.B);
        String str = bq0.f9768a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(h5 h5Var, boolean z3, boolean z10, a2 a2Var, long j) {
        this.f11164a = f11162m;
        if (h5Var == null) {
            h5Var = f11163n;
        }
        this.f11165b = h5Var;
        this.f11166c = -9223372036854775807L;
        this.f11167d = -9223372036854775807L;
        this.f11168e = -9223372036854775807L;
        this.f11169f = z3;
        this.g = z10;
        this.f11170h = a2Var;
        this.j = j;
        this.f11172k = 0;
        this.f11173l = 0;
        this.f11171i = false;
    }

    public final boolean b() {
        return this.f11170h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !fh.class.equals(obj.getClass())) {
            return false;
        }
        fh fhVar = (fh) obj;
        return Objects.equals(this.f11164a, fhVar.f11164a) && Objects.equals(this.f11165b, fhVar.f11165b) && Objects.equals(this.f11170h, fhVar.f11170h) && this.f11166c == fhVar.f11166c && this.f11167d == fhVar.f11167d && this.f11168e == fhVar.f11168e && this.f11169f == fhVar.f11169f && this.g == fhVar.g && this.f11171i == fhVar.f11171i && this.j == fhVar.j && this.f11172k == fhVar.f11172k && this.f11173l == fhVar.f11173l;
    }

    public final int hashCode() {
        int iHashCode = ((this.f11164a.hashCode() + 217) * 31) + this.f11165b.hashCode();
        a2 a2Var = this.f11170h;
        int iHashCode2 = ((iHashCode * 961) + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        long j = this.f11166c;
        int i4 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j8 = this.f11167d;
        int i10 = (i4 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f11168e;
        int i11 = ((((((i10 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f11169f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.f11171i ? 1 : 0);
        long j10 = this.j;
        return ((((((i11 * 961) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f11172k) * 31) + this.f11173l) * 31;
    }
}
