package com.google.android.gms.internal.ads;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class U7 {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f11601m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final C1241h2 f11602n;

    /* renamed from: a, reason: collision with root package name */
    public Object f11603a = f11601m;

    /* renamed from: b, reason: collision with root package name */
    public C1241h2 f11604b = f11602n;

    /* renamed from: c, reason: collision with root package name */
    public long f11605c;

    /* renamed from: d, reason: collision with root package name */
    public long f11606d;

    /* renamed from: e, reason: collision with root package name */
    public long f11607e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11608f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11609g;

    /* renamed from: h, reason: collision with root package name */
    public C2154y0 f11610h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f11611j;

    /* renamed from: k, reason: collision with root package name */
    public int f11612k;

    /* renamed from: l, reason: collision with root package name */
    public int f11613l;

    static {
        JB jb = LB.f9635b;
        C1197gC c1197gC = C1197gC.f14227e;
        List list = Collections.EMPTY_LIST;
        C1197gC c1197gC2 = C1197gC.f14227e;
        C1993v1 c1993v1 = C1993v1.f17203a;
        Uri uri = Uri.EMPTY;
        f11602n = new C1241h2("androidx.media3.common.Timeline", new G(), uri != null ? new N0(uri, c1197gC2) : null, new C2154y0(), C1348j3.f14865B);
        String str = Vt.f12096a;
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

    public final void a(C1241h2 c1241h2, boolean z6, boolean z7, C2154y0 c2154y0, long j6) {
        this.f11603a = f11601m;
        if (c1241h2 == null) {
            c1241h2 = f11602n;
        }
        this.f11604b = c1241h2;
        this.f11605c = -9223372036854775807L;
        this.f11606d = -9223372036854775807L;
        this.f11607e = -9223372036854775807L;
        this.f11608f = z6;
        this.f11609g = z7;
        this.f11610h = c2154y0;
        this.f11611j = j6;
        this.f11612k = 0;
        this.f11613l = 0;
        this.i = false;
    }

    public final boolean b() {
        return this.f11610h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !U7.class.equals(obj.getClass())) {
            return false;
        }
        U7 u7 = (U7) obj;
        return Objects.equals(this.f11603a, u7.f11603a) && Objects.equals(this.f11604b, u7.f11604b) && Objects.equals(this.f11610h, u7.f11610h) && this.f11605c == u7.f11605c && this.f11606d == u7.f11606d && this.f11607e == u7.f11607e && this.f11608f == u7.f11608f && this.f11609g == u7.f11609g && this.i == u7.i && this.f11611j == u7.f11611j && this.f11612k == u7.f11612k && this.f11613l == u7.f11613l;
    }

    public final int hashCode() {
        int iHashCode = ((this.f11603a.hashCode() + 217) * 31) + this.f11604b.hashCode();
        C2154y0 c2154y0 = this.f11610h;
        int iHashCode2 = ((iHashCode * 961) + (c2154y0 == null ? 0 : c2154y0.hashCode())) * 31;
        long j6 = this.f11605c;
        int i = (iHashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f11606d;
        int i3 = (i + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f11607e;
        int i6 = ((((((i3 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f11608f ? 1 : 0)) * 31) + (this.f11609g ? 1 : 0)) * 31) + (this.i ? 1 : 0);
        long j9 = this.f11611j;
        return ((((((i6 * 961) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f11612k) * 31) + this.f11613l) * 31;
    }
}
