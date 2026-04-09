package b7;

import androidx.work.OverwritingInputMerger;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.measurement.z3;
import t6.d0;
import t6.g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {
    public static final a0.x A;

    /* renamed from: z, reason: collision with root package name */
    public static final String f2029z;

    /* renamed from: a, reason: collision with root package name */
    public final String f2030a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f2031b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2032c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2033d;

    /* renamed from: e, reason: collision with root package name */
    public t6.h f2034e;

    /* renamed from: f, reason: collision with root package name */
    public final t6.h f2035f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public long f2036h;

    /* renamed from: i, reason: collision with root package name */
    public long f2037i;
    public t6.e j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2038k;

    /* renamed from: l, reason: collision with root package name */
    public final t6.a f2039l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2040m;

    /* renamed from: n, reason: collision with root package name */
    public long f2041n;

    /* renamed from: o, reason: collision with root package name */
    public final long f2042o;

    /* renamed from: p, reason: collision with root package name */
    public final long f2043p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2044q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f2045r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2046s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2047t;

    /* renamed from: u, reason: collision with root package name */
    public final long f2048u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2049v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2050w;

    /* renamed from: x, reason: collision with root package name */
    public String f2051x;

    /* renamed from: y, reason: collision with root package name */
    public final Boolean f2052y;

    static {
        String strG = t6.v.g("WorkSpec");
        nk.k.d(strG, "tagWithPrefix(...)");
        f2029z = strG;
        A = new a0.x(2);
    }

    public r(String str, g0 g0Var, String str2, String str3, t6.h hVar, t6.h hVar2, long j, long j8, long j9, t6.e eVar, int i4, t6.a aVar, long j10, long j11, long j12, long j13, boolean z3, d0 d0Var, int i10, int i11, long j14, int i12, int i13, String str4, Boolean bool) {
        nk.k.e(str, FacebookMediationAdapter.KEY_ID);
        nk.k.e(g0Var, "state");
        nk.k.e(str2, "workerClassName");
        nk.k.e(str3, "inputMergerClassName");
        nk.k.e(hVar, "input");
        nk.k.e(hVar2, "output");
        nk.k.e(eVar, "constraints");
        nk.k.e(aVar, "backoffPolicy");
        nk.k.e(d0Var, "outOfQuotaPolicy");
        this.f2030a = str;
        this.f2031b = g0Var;
        this.f2032c = str2;
        this.f2033d = str3;
        this.f2034e = hVar;
        this.f2035f = hVar2;
        this.g = j;
        this.f2036h = j8;
        this.f2037i = j9;
        this.j = eVar;
        this.f2038k = i4;
        this.f2039l = aVar;
        this.f2040m = j10;
        this.f2041n = j11;
        this.f2042o = j12;
        this.f2043p = j13;
        this.f2044q = z3;
        this.f2045r = d0Var;
        this.f2046s = i10;
        this.f2047t = i11;
        this.f2048u = j14;
        this.f2049v = i12;
        this.f2050w = i13;
        this.f2051x = str4;
        this.f2052y = bool;
    }

    public static r b(r rVar, String str, t6.h hVar) {
        String str2 = rVar.f2030a;
        g0 g0Var = rVar.f2031b;
        String str3 = rVar.f2033d;
        t6.h hVar2 = rVar.f2035f;
        long j = rVar.g;
        long j8 = rVar.f2036h;
        long j9 = rVar.f2037i;
        t6.e eVar = rVar.j;
        int i4 = rVar.f2038k;
        t6.a aVar = rVar.f2039l;
        long j10 = rVar.f2040m;
        long j11 = rVar.f2041n;
        long j12 = rVar.f2042o;
        long j13 = rVar.f2043p;
        boolean z3 = rVar.f2044q;
        d0 d0Var = rVar.f2045r;
        int i10 = rVar.f2046s;
        int i11 = rVar.f2047t;
        long j14 = rVar.f2048u;
        int i12 = rVar.f2049v;
        int i13 = rVar.f2050w;
        String str4 = rVar.f2051x;
        Boolean bool = rVar.f2052y;
        rVar.getClass();
        nk.k.e(str2, FacebookMediationAdapter.KEY_ID);
        nk.k.e(g0Var, "state");
        nk.k.e(str3, "inputMergerClassName");
        nk.k.e(hVar2, "output");
        nk.k.e(eVar, "constraints");
        nk.k.e(aVar, "backoffPolicy");
        nk.k.e(d0Var, "outOfQuotaPolicy");
        return new r(str2, g0Var, str, str3, hVar, hVar2, j, j8, j9, eVar, i4, aVar, j10, j11, j12, j13, z3, d0Var, i10, i11, j14, i12, i13, str4, bool);
    }

    public final long a() {
        return z3.b(this.f2031b == g0.f34349a && this.f2038k > 0, this.f2038k, this.f2039l, this.f2040m, this.f2041n, this.f2046s, c(), this.g, this.f2037i, this.f2036h, this.f2048u);
    }

    public final boolean c() {
        return this.f2036h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return nk.k.a(this.f2030a, rVar.f2030a) && this.f2031b == rVar.f2031b && nk.k.a(this.f2032c, rVar.f2032c) && nk.k.a(this.f2033d, rVar.f2033d) && nk.k.a(this.f2034e, rVar.f2034e) && nk.k.a(this.f2035f, rVar.f2035f) && this.g == rVar.g && this.f2036h == rVar.f2036h && this.f2037i == rVar.f2037i && nk.k.a(this.j, rVar.j) && this.f2038k == rVar.f2038k && this.f2039l == rVar.f2039l && this.f2040m == rVar.f2040m && this.f2041n == rVar.f2041n && this.f2042o == rVar.f2042o && this.f2043p == rVar.f2043p && this.f2044q == rVar.f2044q && this.f2045r == rVar.f2045r && this.f2046s == rVar.f2046s && this.f2047t == rVar.f2047t && this.f2048u == rVar.f2048u && this.f2049v == rVar.f2049v && this.f2050w == rVar.f2050w && nk.k.a(this.f2051x, rVar.f2051x) && nk.k.a(this.f2052y, rVar.f2052y);
    }

    public final int hashCode() {
        int iHashCode = (this.f2035f.hashCode() + ((this.f2034e.hashCode() + je.u.m(je.u.m((this.f2031b.hashCode() + (this.f2030a.hashCode() * 31)) * 31, 31, this.f2032c), 31, this.f2033d)) * 31)) * 31;
        long j = this.g;
        int i4 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j8 = this.f2036h;
        int i10 = (i4 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f2037i;
        int iHashCode2 = (this.f2039l.hashCode() + ((((this.j.hashCode() + ((i10 + ((int) (j9 ^ (j9 >>> 32)))) * 31)) * 31) + this.f2038k) * 31)) * 31;
        long j10 = this.f2040m;
        int i11 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f2041n;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f2042o;
        int i13 = (i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f2043p;
        int iHashCode3 = (((((this.f2045r.hashCode() + ((((i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f2044q ? 1231 : 1237)) * 31)) * 31) + this.f2046s) * 31) + this.f2047t) * 31;
        long j14 = this.f2048u;
        int i14 = (((((iHashCode3 + ((int) ((j14 >>> 32) ^ j14))) * 31) + this.f2049v) * 31) + this.f2050w) * 31;
        String str = this.f2051x;
        int iHashCode4 = (i14 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f2052y;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("{WorkSpec: "), this.f2030a, '}');
    }

    public /* synthetic */ r(String str, g0 g0Var, String str2, String str3, t6.h hVar, t6.h hVar2, long j, long j8, long j9, t6.e eVar, int i4, t6.a aVar, long j10, long j11, long j12, long j13, boolean z3, d0 d0Var, int i10, long j14, int i11, int i12, String str4, Boolean bool, int i13) {
        this(str, (i13 & 2) != 0 ? g0.f34349a : g0Var, str2, (i13 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i13 & 16) != 0 ? t6.h.f34355b : hVar, (i13 & 32) != 0 ? t6.h.f34355b : hVar2, (i13 & 64) != 0 ? 0L : j, (i13 & 128) != 0 ? 0L : j8, (i13 & 256) != 0 ? 0L : j9, (i13 & 512) != 0 ? t6.e.j : eVar, (i13 & Segment.SHARE_MINIMUM) != 0 ? 0 : i4, (i13 & 2048) != 0 ? t6.a.f34308a : aVar, (i13 & Buffer.SEGMENTING_THRESHOLD) != 0 ? 30000L : j10, (i13 & Segment.SIZE) != 0 ? -1L : j11, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? j12 : 0L, (32768 & i13) != 0 ? -1L : j13, (65536 & i13) != 0 ? false : z3, (131072 & i13) != 0 ? d0.f34331a : d0Var, (262144 & i13) != 0 ? 0 : i10, 0, (1048576 & i13) != 0 ? Long.MAX_VALUE : j14, (2097152 & i13) != 0 ? 0 : i11, (4194304 & i13) != 0 ? -256 : i12, (8388608 & i13) != 0 ? null : str4, (i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? Boolean.FALSE : bool);
    }
}
