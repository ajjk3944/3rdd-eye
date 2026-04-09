package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4769lf extends Ld implements vo {

    /* renamed from: d, reason: collision with root package name */
    public static final C4743kf f41189d = new C4743kf("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e, reason: collision with root package name */
    public static final C4743kf f41190e = new C4743kf("PREF_KEY_OFFSET", null);

    /* renamed from: f, reason: collision with root package name */
    public static final C4743kf f41191f = new C4743kf("UNCHECKED_TIME", null);

    /* renamed from: g, reason: collision with root package name */
    public static final C4743kf f41192g = new C4743kf("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h, reason: collision with root package name */
    public static final C4743kf f41193h = new C4743kf("LAST_IDENTITY_LIGHT_SEND_TIME", null);
    public static final C4743kf i = new C4743kf("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C4743kf f41194j = new C4743kf("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C4743kf f41195k = new C4743kf("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C4743kf f41196l = new C4743kf("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C4743kf f41197m = new C4743kf("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C4743kf f41198n = new C4743kf("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C4743kf f41199o = new C4743kf("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C4743kf f41200p = new C4743kf("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C4743kf f41201q = new C4743kf("VITAL_DATA", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C4743kf f41202r = new C4743kf("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C4743kf f41203s = new C4743kf("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C4769lf(InterfaceC4481ab interfaceC4481ab) {
        super(interfaceC4481ab);
    }

    public final long a(int i10) {
        return this.f41115a.getLong(f41190e.f41141b, i10);
    }

    public final boolean b(boolean z10) {
        return this.f41115a.getBoolean(f41191f.f41141b, z10);
    }

    public final C4769lf c(boolean z10) {
        return (C4769lf) b(f41192g.f41141b, z10);
    }

    public final C4769lf d(long j4) {
        return (C4769lf) b(f41190e.f41141b, j4);
    }

    public final boolean e() {
        return this.f41115a.getBoolean(f41189d.f41141b, false);
    }

    public final void f(boolean z10) {
        b(f41189d.f41141b, z10).b();
    }

    public final C4769lf g() {
        return (C4769lf) b(f41200p.f41141b, true);
    }

    public final C4769lf h() {
        return (C4769lf) b(f41199o.f41141b, true);
    }

    public final boolean i() {
        return this.f41115a.getBoolean(f41199o.f41141b, false);
    }

    public final boolean j() {
        return this.f41115a.getBoolean(f41200p.f41141b, false);
    }

    public final long a(long j4) {
        return this.f41115a.getLong(f41193h.f41141b, j4);
    }

    public final C4769lf b(long j4) {
        return (C4769lf) b(f41193h.f41141b, j4);
    }

    public final C4769lf c(long j4) {
        return (C4769lf) b(f41202r.f41141b, j4);
    }

    public final C4769lf d(boolean z10) {
        return (C4769lf) b(f41191f.f41141b, z10);
    }

    public final void e(boolean z10) {
        b(f41203s.f41141b, z10).b();
    }

    public final long f() {
        return this.f41115a.getLong(f41202r.f41141b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.vo
    public final String a() {
        return this.f41115a.getString(f41201q.f41141b, null);
    }

    public final C4769lf b(EnumC4639ge enumC4639ge, int i10) {
        C4743kf c4743kf;
        int iOrdinal = enumC4639ge.ordinal();
        if (iOrdinal == 0) {
            c4743kf = i;
        } else if (iOrdinal != 1) {
            c4743kf = iOrdinal != 2 ? null : f41195k;
        } else {
            c4743kf = f41194j;
        }
        return c4743kf != null ? (C4769lf) b(c4743kf.f41141b, i10) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4717jf
    public final Set<String> c() {
        return this.f41115a.a();
    }

    public final Boolean d() {
        C4743kf c4743kf = f41192g;
        if (!this.f41115a.a(c4743kf.f41141b)) {
            return null;
        }
        return Boolean.valueOf(this.f41115a.getBoolean(c4743kf.f41141b, true));
    }

    @Override // io.appmetrica.analytics.impl.Ld
    public final String f(String str) {
        return new C4743kf(str, null).f41141b;
    }

    @Override // io.appmetrica.analytics.impl.vo
    public final void a(String str) {
        b(f41201q.f41141b, str).b();
    }

    public final boolean a(boolean z10) {
        return this.f41115a.getBoolean(f41203s.f41141b, z10);
    }

    public final C4769lf b(EnumC4639ge enumC4639ge, long j4) {
        C4743kf c4743kf;
        int iOrdinal = enumC4639ge.ordinal();
        if (iOrdinal == 0) {
            c4743kf = f41196l;
        } else if (iOrdinal != 1) {
            c4743kf = iOrdinal != 2 ? null : f41198n;
        } else {
            c4743kf = f41197m;
        }
        return c4743kf != null ? (C4769lf) b(c4743kf.f41141b, j4) : this;
    }

    public final int a(EnumC4639ge enumC4639ge, int i10) {
        C4743kf c4743kf;
        int iOrdinal = enumC4639ge.ordinal();
        if (iOrdinal == 0) {
            c4743kf = i;
        } else if (iOrdinal != 1) {
            c4743kf = iOrdinal != 2 ? null : f41195k;
        } else {
            c4743kf = f41194j;
        }
        if (c4743kf == null) {
            return i10;
        }
        return this.f41115a.getInt(c4743kf.f41141b, i10);
    }

    public final long a(EnumC4639ge enumC4639ge, long j4) {
        C4743kf c4743kf;
        int iOrdinal = enumC4639ge.ordinal();
        if (iOrdinal == 0) {
            c4743kf = f41196l;
        } else if (iOrdinal != 1) {
            c4743kf = iOrdinal != 2 ? null : f41198n;
        } else {
            c4743kf = f41197m;
        }
        if (c4743kf == null) {
            return j4;
        }
        return this.f41115a.getLong(c4743kf.f41141b, j4);
    }
}
